package com.jocata.bms.test;

import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.controller.LoginController;

public class TestLogin1 {

    public static void main(String[] args) {

        UserDetailsBean udb1 = new UserDetailsBean();

        udb1.setFname( "abc" );
        udb1.setLname( "pqr");
        udb1.setUsername( "abc1");
        udb1.setPwd("abc1pqr");
        udb1.setEmail( "abc@gmail.com" );
        udb1.setContact( 1234567890L );

        LoginController lgc = new LoginController();

//        lgc.signUp( udb1 );

        String res = lgc.signIn( udb1.getUsername(), udb1.getPwd() );
        System.out.println( res );

    }

}
