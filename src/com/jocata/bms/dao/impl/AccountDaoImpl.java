package com.jocata.bms.dao.impl;

import com.jocata.bms.dao.AccountDao;
import com.jocata.bms.entity.AccountDetails;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class AccountDaoImpl implements AccountDao  {

    File f2 ;
    String path ;

    public AccountDaoImpl() {
        path = "accountDetails.txt";
        f2 = new File(path );
        createFile();
    }

    public String createAccount(AccountDetails accountDetails)  {

        String [] data = { accountDetails.getName(), accountDetails.getAccountNumber(),
                accountDetails.getAddress(), accountDetails.getContact() };

        writeFile( data );

        return null;
    }

    public String editAccount( AccountDetails accountDetails ) {

        return null;
    }

    public String deleteAccount( String accountNumber ) {

        return null;
    }

    public String getAccount( String accountNumber ) {

        return null;
    }

    public String getAccounts( ) {
        displayRecords();
        return null;
    }


    void createFile( ) {

        try {

            f2 = new File( path );

            if ( f2.createNewFile() ) {
                System.out.println( "File created: " + f2.getName() );
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
            if ( f2 == null ) {
                System.out.println( "File not created." );
            }
            else {
                FileWriter fw1 = new FileWriter( f2, true );
                if ( f2.length() == 0 ) {
                    String header = "Name, AccountNumber, Address, Contact";
                    fw1.write( header + "\n" );
                }
                fw1.write( sb1.toString() + "\n" );
                fw1.close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    List<List<String>> readFile() {

        List<List<String>> records = new ArrayList<>();

        try{
            FileReader fr1 = new FileReader( f2 );
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
