package com.jocata.bms.controller;

import com.jocata.bms.bean.AccountBean;
import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.entity.AccountDetails;
import com.jocata.bms.service.AccountService;
import com.jocata.bms.service.impl.AccountServiceImpl;

import java.util.List;

public class AccountController {

    AccountService accountService ;

    public AccountController( ) {
        accountService = new AccountServiceImpl();
    }

    public String createAccount( AccountBean ab ) {
        accountService.createAccount( ab );
        return null;
    }

    public String updateAccount( AccountBean ab ) {
        accountService.updateAccount( ab );
        return null;
    }

    public String deleteAccount( String accountNumber ) {
        accountService.deleteAccount( accountNumber );
        return null;
    }

    public AccountDetails getAccount( String accountNumber ) {
        accountService.getAccount( accountNumber );
        return null;
    }

    public List<AccountDetails> getAccounts( ) {
        accountService.getAccounts( );
        return null;
    }

}

