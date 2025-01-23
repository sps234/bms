package com.jocata.bms.test;//package com.jocata.bms.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// File Handling - Create, Write, Read : 22/01/25, 15:00 - 15:40

public class TestFileHandling1 {

    static File f1 ;

    public static void main(String[] args) {

        createFile();
        writeFile();
        readFile();

    }

    static void createFile( ) {

        try {

            f1 = new File( "f1.txt" );

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

    static void writeFile( ) {

        try {
            String content = "This is the content to write into file";

            if ( f1 == null ) {
                System.out.println( "File not created." );
            }
            else {

                FileWriter fw1 = new FileWriter( f1 );
                fw1.write( content);
                fw1.close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static String readFile(  ) {
        try {
            FileReader fr1 = new FileReader( f1 );

//            char [] ch1 = new char[ 100 ];
//            fr1.read( ch1 );
//            System.out.println( ch1);

            int itr ;
            while ( ( itr = fr1.read() ) != -1 ) {
                System.out.print( (char) itr );
            }

            fr1.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}


