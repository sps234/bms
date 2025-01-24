package com.jocata.bms.main;

import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.controller.LoginController;

public class Run1 {

    public static void main(String[] args) {

        UserDetailsBean udb1 = new UserDetailsBean();

        udb1.setFname( "abc" );
        udb1.setLname( "pqr");
        udb1.setUsername( "abc1");
        udb1.setPwd("abc1pqr");
        udb1.setEmail( "abc@gmail.com" );
        udb1.setContact( 1234567890L );

        LoginController lgc = new LoginController();

        // signUp
//        lgc.signUp( udb1 );

        // signIn
        String res = lgc.signIn( udb1.getUsername(), udb1.getPwd() );
        System.out.println( res );


//        reading details
//        lgc.signUp( udb1 );

        // Updating Details
//        UserDetailsBean udb2 = new UserDetailsBean();
//
//        udb2.setFname( "abcd" );
//        udb2.setLname( "pqrs");
//        udb2.setUsername( "abc1");
//        udb2.setPwd("abcd1pqrs");
//        udb2.setEmail( "abc@gmail.com" );
//        udb2.setContact( 1234567890L );

//        lgc.signUp( udb1 );


        // deleting details
//        lgc.signUp( udb1 );


    }

}
