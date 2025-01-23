package com.jocata.bms.service.impl;

import com.jocata.bms.bean.AccountBean;
import com.jocata.bms.dao.AccountDao;
import com.jocata.bms.dao.impl.AccountDaoImpl;
import com.jocata.bms.entity.AccountDetails;
import com.jocata.bms.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    AccountDao accDao ;

    public AccountServiceImpl() {
        accDao = new AccountDaoImpl();
    }

    public String createAccount( AccountBean ab ) {

        AccountDetails ad = new AccountDetails();
        ad.setAccountNumber( ab.getAccountNumber() );
        ad.setName( ab.getName() );
        ad.setAddress( ab.getAddress() );
        ad.setContact( ab.getContact().toString() );

        accDao.createAccount( ad );

        return null;
    }

    public String updateAccount( AccountBean ab ) {

        AccountDetails ad = new AccountDetails();
        ad.setName( ab.getName() );
        ad.setAddress( ab.getAddress() );
        ad.setContact( ab.getContact().toString() );

        accDao.editAccount( ad );

        return null;
    }

    public String deleteAccount( String accountNumber ) {

        return null;
    }

    public AccountDetails getAccount( String accountNumber ) {

        return null;
    }

    public List<AccountDetails> getAccounts( ) {
        accDao.getAccounts();
        return null;
    }

    public List<String> showTransactions( Long accountNumber ) {

        return null;
    } ;

}
