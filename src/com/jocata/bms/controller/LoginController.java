package com.jocata.bms.controller;

import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.service.LoginService;
import com.jocata.bms.service.impl.LoginServiceImpl;

public class LoginController {

//    LoginServiceImpl service = new LoginServiceImpl();    // not needed
    LoginService service ;

    public LoginController( ) {
        service = new LoginServiceImpl();
    }

    public String signUp( UserDetailsBean udb ) {
        service.signUp( udb );
        /*
        if ( udb.getFname() == null || udb.getEmail() == null ||udb.getPwd() == null ||
                udb.getUsername() == null || udb.getContact() == null ) {
            System.out.println("Mandatory options are missing.");
        }
        */
        return null;
    }

    public String signIn( String uname, String pwd ) {
        return service.signIn( uname, pwd );
    }

    public String forgotPassword( UserDetailsBean udb ) {
        return service.forgetPassword( udb );
    }

    public String deleteUser( UserDetailsBean udb ) {

        return service.deleteUser( udb );
    }
}
