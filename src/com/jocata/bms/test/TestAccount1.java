package com.jocata.bms.test;


import com.jocata.bms.bean.AccountDetailsBean;
import com.jocata.bms.bean.AccountSearchRequest;
import com.jocata.bms.controller.AccountController;
import com.jocata.bms.entity.AccountDetails;

import java.util.List;

public class TestAccount1 {

    public static void main(String[] args) {

        AccountController accountController = new AccountController();

        String accountNumber = "1234567891";

        // creating account
        AccountDetailsBean accountDetailsBean = new AccountDetailsBean();
        accountDetailsBean.setAccountNumber( "1234567893" );
        accountDetailsBean.setName( "abc" );
        accountDetailsBean.setAddress( "pqr" );
        accountDetailsBean.setContact( 1234567893L );

        String res1 = accountController.createAccount( accountDetailsBean );
        System.out.println( res1 );


        // reading account details - dashboard functionality
//        AccountDetails accountDetails = accountController.getAccount( 1234567892L );
//        printAccountDetails( accountDetails );


        // reading all accounts
        List<AccountDetails> accountDetails2 = accountController.getAccounts( );
        for( AccountDetails curAccDetails : accountDetails2 ) {
            printAccountDetails( curAccDetails );
        }



//        //updating account details
//        AccountDetailsBean accountDetailsBean2 = new AccountDetailsBean();
//        accountDetailsBean2.setAccountNumber( accountNumber );
//        accountDetailsBean2.setName( "abc" );
//        accountDetailsBean2.setAddress( "pqr" );
//        accountDetailsBean2.setContact( 1234567891L );
//
//        String res2 = accountController.updateAccount( accountDetailsBean2 );
//        System.out.println( res2 );
//
//
        // deleting account
//        String res3 = accountController.deleteAccount( Long.parseLong( accountNumber ) );
//        System.out.println( res3 );


        // search - findUserDetailsByContact
//        AccountSearchRequest accountSearchRequest1 = new AccountSearchRequest();
//        accountSearchRequest1.setContact( 1234567891L );





    }

    static void printAccountDetails( AccountDetails accountDetails ) {
        System.out.printf( "Name: %s, Account Number:%s, Address: %s, Contact: %s\n",
                accountDetails.getName(), accountDetails.getAccountNumber(),
                accountDetails.getAddress(), accountDetails.getContact() );
    }
}
