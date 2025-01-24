package com.jocata.bms.dao.impl;

import com.jocata.bms.dao.LoginDao;
import com.jocata.bms.entity.UserDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static com.jocata.bms.db.InMemoryCRUD.*;

public class LoginDaoImpl implements LoginDao {

    File f1 ;

    public LoginDaoImpl( ) {
        // creating file
        createFile();
    }

    public String signUp( UserDetails ud ) {

//        String [] data = { ud.getFname(), ud.getLname(), ud.getUsername(), ud.getPwd(), ud.getEmail(), ud.getContact() };
//        writeFile( data );
        persist( ud );

        return null;
    }


    public String signIn( String uname, String pwd ) {

//        if ( f1 == null ) {
//            return "File not exist.";
//        }

        if ( isValid(uname, pwd)) {
            return "Login successful.";
        };
        return "Invalid username or password.";
    }

    boolean isValid( String uname, String pwd ) {

//        List<List<String>> records = readFile();
//        for ( List<String> curRec : records ) {
//            if ( curRec.get( 2 ).equals( uname ) && curRec.get( 3 ).equals( pwd ) ) {
//                return true;
//            }
//        }
        return userExists(uname) && pwdMatches( uname, pwd);
    }

    boolean userExists( String uname ) {
        UserDetails ud = read( uname );
        System.out.printf( "UserName : %s\n", ud.getUserName() );
        return ud.getUserName().equals(uname);
    }

    boolean pwdMatches( String uname, String pwd  ) {
        if ( ! userExists( uname ) ) {
            System.out.println("User does not exist");
            return false;
        }
        UserDetails ud = read( uname );
        return ud.getPassword().equals( pwd );
    }


    public String forgetPassword( UserDetails ud ) {

        if ( userExists( ud.getUserName() )  ) {
            update( ud );
            return "User Details Updated Successfully.";
        }
        return "Credentials are not valid.";
    }

    public String deleteUser( UserDetails ud ) {

        if ( pwdMatches( ud.getUserName(), ud.getPassword() ) ) {
            String un = ud.getUserName();
            delete(  un );
            return "User : " + un +  " Details Deleted Successfully.";
        }
        return "Credentials are not valid.";
    }


    void createFile( ) {

        try {
            f1 = new File( "UserDetails.ser" );

            if ( f1.createNewFile() ) {
                System.out.println( "File created: " + f1.getName() );
            }
            else {
                System.out.println( "File already exists." );
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void writeFile( String [] data ) {

        StringBuilder sb1 = new StringBuilder( );
        for ( String s : data ) {
            sb1.append( s + ", " );
        }
        try {
            if ( f1 == null ) {
                System.out.println( "File not created." );
            }
            else {
                FileWriter fw1 = new FileWriter( f1, true );
                if ( f1.length() == 0 ) {
                    fw1.write( "FirstName, LastName, Username, Password, Email, Contact\n" );
                }
                fw1.write( sb1.toString() + "\n" );
                fw1.close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /*
    void readFile(  ) {
        try {
            FileReader fr1 = new FileReader( f1 );

            char [] ch1 = new char[ 100 ];
            fr1.read( ch1 );
            System.out.println( ch1);

            int itr ;
            while ( ( itr = fr1.read() ) != -1 ) {
                System.out.print( (char) itr );
            }

            fr1.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

     */


    List<List<String>> readFile() {

        List<List<String>> records = new ArrayList<>();

        try{
            FileReader fr1 = new FileReader( f1 );
            BufferedReader bfr1 = new BufferedReader( fr1 );

            String curLine ;

            while( ( curLine = bfr1.readLine() ) != null ) {

                String [] curData  = curLine.split( "," );
                List<String> curRecord = new ArrayList<>(  );
                for ( String curField : curData ) {
                    if ( curField.trim().length() != 0 ) {
                        curRecord.add( curField.trim() );
                    }
                }
                records.add( curRecord );
            }
        }
        catch ( Exception e ) {
            throw new RuntimeException(e);
        }

        return records;
    }

    void displayRecords ( ) {

        List<List<String>> records = readFile();
        for ( List<String> curRec : records ) {
            for ( int i = 0; i< curRec.size(); i++ ) {
                if ( i == curRec.size() - 1 ) {
                    System.out.print( curRec.get( i ) );
                }
                else {
                    System.out.print( curRec.get( i ) + ", ");
                }
            }
            System.out.println();
        }

    }

}
