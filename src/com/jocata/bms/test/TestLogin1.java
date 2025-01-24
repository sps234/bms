package com.jocata.bms.test;

import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.controller.LoginController;

public class TestLogin1 {

    public static void main(String[] args) {

        LoginController lgc = new LoginController();

//        UserDetailsBean udb1 = new UserDetailsBean();
//
//        udb1.setFname( "abc" );
//        udb1.setLname( "pqr");
//        udb1.setUsername( "abc1");
//        udb1.setPwd("abc1pqr");
//        udb1.setEmail( "abc@gmail.com" );
//        udb1.setContact( 1234567890L );
//
//
////         creating user
//        lgc.signUp( udb1 );
//
//        // reading userDetails
//        String res1 = lgc.signIn( udb1.getUsername(), udb1.getPwd() );
//        System.out.println( res1 );

        // updating userDetails

//        UserDetailsBean udb2 = new UserDetailsBean();
//        udb2.setUsername( "abc1" );
//        udb2.setPwd("abcd1pqrs");
//        String res2 = lgc.forgotPassword( udb2 );
//        System.out.println( res2 );


        // deleting userDetails
        UserDetailsBean udb3 = new UserDetailsBean();
        udb3.setUsername( "abc1" );
        udb3.setPwd("abcd1pqrs");
        String res3 = lgc.deleteUser( udb3 );
        System.out.println( res3 );
    }
}
