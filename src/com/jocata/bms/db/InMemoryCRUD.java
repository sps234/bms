package com.jocata.bms.db;

import com.jocata.bms.entity.UserDetails;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class InMemoryCRUD {

    public static final String FILE_NAME = "UserDetails.ser";
    private static Map<String, UserDetails > temp = new HashMap<>();

    public static void saveDataToFile() {
        try ( FileOutputStream fos = new FileOutputStream( FILE_NAME ) ) {
            AppendableObjectOutputStream aoos = new AppendableObjectOutputStream( fos ) ;
            aoos.writeObject( temp );        }
        catch ( IOException i ) {
            i.printStackTrace();
        }
    }

    public static void loadDataFromFile() {
        try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( FILE_NAME ) ) ) {
            temp = ( Map<String, UserDetails>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting with an empty map.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void persist ( UserDetails ud ) {
        temp.put( ud.getUserName(), ud );
        saveDataToFile();
    }

    public static UserDetails read( String un ) {
        loadDataFromFile();
        return temp.getOrDefault( un, null );
    }

    public static void update ( UserDetails ud ) {
        loadDataFromFile();
        if ( temp.containsKey( ud.getUserName() ) ) {
            temp.put( ud.getUserName(), ud );
            saveDataToFile();
            System.out.println( ud.getPassword() );
        }
        else {
            System.out.println("Entry with ID " + ud.getUserName() + " not found.");
        }
    }

    public static void delete ( String un ) {

        if ( temp.containsKey( un ) ) {
            temp.remove( un );
            saveDataToFile();
        }
        else {
            System.out.println( "Entry with ID " + un + " not found." );
        }
    }

}


class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
