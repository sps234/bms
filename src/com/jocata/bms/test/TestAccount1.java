package com.jocata.bms.test;

import com.jocata.bms.bean.AccountBean;
import com.jocata.bms.controller.AccountController;

public class TestAccount1 {

    public static void main(String[] args) {

        AccountBean ab = new AccountBean();
        ab.setAccountNumber( "1234567891" );
        ab.setName( "abcd" );
        ab.setAddress( "pqrs" );
        ab.setContact( 1234567891L );

        AccountController acc = new AccountController();
//        acc.createAccount( ab );

        // dashboard details
        acc.getAccounts();

    }
}
