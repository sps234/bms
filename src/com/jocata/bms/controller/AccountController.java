package com.jocata.bms.controller;


import com.jocata.bms.bean.AccountDetailsBean;
import com.jocata.bms.entity.AccountDetails;
import com.jocata.bms.service.AccountService;
import com.jocata.bms.service.impl.AccountServiceImpl;

import java.util.List;

public class AccountController {

    AccountService accountService ;

    public AccountController( ) {
        accountService = new AccountServiceImpl();
    }

    public String createAccount( AccountDetailsBean accountDetailsBean ) {

        return accountService.createAccount( accountDetailsBean );
    }

    public String updateAccount( AccountDetailsBean accountDetailsBean ) {

        return accountService.updateAccount( accountDetailsBean );
    }

    public String deleteAccount( Long accountNumber ) {
        return accountService.deleteAccount( accountNumber );
    }

    public AccountDetails getAccount( Long accountNumber ) {
        return accountService.getAccount( accountNumber );
    }

    public List<AccountDetails> getAccounts( ) {
        return accountService.getAccounts( );
    }

    public AccountDetails getAccountByContact( Long contact ) {
        return accountService.getAccountByContact( contact );
    }

    public AccountDetails getAccountByContactAndAddress( Long contact, String address ) {
        return accountService.getAccountByContactAndAddress( contact, address  );
    }

    public AccountDetails getAccountByNameAndContactAndAddress( String name,Long contact, String address ) {
        return accountService.getAccountByNameAndContactAndAddress( name, contact, address );
    }
}

