package com.jocata.bms.db;


import com.jocata.bms.entity.AccountDetails;
import java.io.*;
import java.util.*;

public class InMemoryAccountCRUD {

    public static final String FILE_NAME = "AccountDetails.ser";
    private static Map<String, AccountDetails > temporaryData2 = new HashMap<>();

    public static void saveDataToFile( ) {

        try( ObjectOutputStream oos2 = new ObjectOutputStream( new FileOutputStream( FILE_NAME, true ) ) ) {
            oos2.writeObject( temporaryData2  );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void loadDataFromFile( ) {
        try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( FILE_NAME ) ) ) {
            temporaryData2 = ( Map<String, AccountDetails >  ) ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting with an empty map.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String saveAccount( AccountDetails accountDetails ) {
        String accountNumber = accountDetails.getAccountNumber();
        if ( temporaryData2.containsKey( accountNumber ) ) {
            return "Account already exists.";
        }
        loadDataFromFile();
        temporaryData2.put( accountNumber, accountDetails );
        saveDataToFile();
        return accountDetails.getName()+"'s account created successfully.";
    }

    public static AccountDetails read( String accountNumber ) {
        loadDataFromFile();
        return temporaryData2.getOrDefault( accountNumber, null );
    }

    public static List<AccountDetails> readAll( ) {
        loadDataFromFile();
        List<AccountDetails> accountDetailsList = new ArrayList<>();
        for ( AccountDetails curAccDetails : temporaryData2.values() ) {
            accountDetailsList.add( curAccDetails );
            System.out.println( curAccDetails.getName() );
        }
        return accountDetailsList;
    }



    public static String update( AccountDetails accountDetails ) {
        loadDataFromFile();
        String accountNumber = accountDetails.getAccountNumber();
        if ( temporaryData2.containsKey( accountNumber ) ) {
            temporaryData2.put( accountNumber, accountDetails );
            saveDataToFile();
            return accountDetails.getName()+"'s account updated successfully.";
        }
        return "Account does not exist.";
    }

    public static String delete( String accountNumber ) {
        loadDataFromFile();
        if ( temporaryData2.containsKey( accountNumber ) ) {
            temporaryData2.remove( accountNumber );
            saveDataToFile();
            return "Account with account number "+accountNumber+" deleted successfully.";
        }
        return "Account does not exist.";
    }

    public static AccountDetails fetchRecord( String contact ) {
        loadDataFromFile();
        for ( AccountDetails curAccDetails : temporaryData2.values() ) {
            if ( curAccDetails.getContact().equals( contact ) )  {
                return curAccDetails;
            }
        }
        return null;
    }

    public static AccountDetails fetchRecord( String contact, String address ) {
        loadDataFromFile();
        for ( AccountDetails curAccDetails : temporaryData2.values() ) {
            if ( curAccDetails.getContact().equals( contact ) && curAccDetails.getAddress().equals( address ) )  {
                return curAccDetails;
            }
        }
        return null;
    }


    public static AccountDetails fetchRecord( String name, String contact, String address ) {
        loadDataFromFile();
        for ( AccountDetails curAccDetails : temporaryData2.values() ) {
            if ( curAccDetails.getContact().equals( contact ) && curAccDetails.getAddress().equals( address )
                    && curAccDetails.getName().equals( name ) )  {
                return curAccDetails;
            }
        }
        return null;
    }


}
