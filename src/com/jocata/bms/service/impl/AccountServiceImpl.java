package com.jocata.bms.service.impl;


import com.jocata.bms.bean.AccountDetailsBean;
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

    public String createAccount( AccountDetailsBean accountDetailsBean ) {

        AccountDetails accountDetails = new AccountDetails();

        accountDetails.setAccountNumber( accountDetailsBean.getAccountNumber() );
        accountDetails.setName( accountDetailsBean.getName() );
        accountDetails.setAddress( accountDetailsBean.getAddress() );
        accountDetails.setContact(accountDetailsBean.getContact().toString() );

        return accDao.createAccount( accountDetails );
    }

    public String updateAccount( AccountDetailsBean accountDetailsBean ) {

        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccountNumber( accountDetailsBean.getAccountNumber() );
        accountDetails.setName( accountDetailsBean.getName() );
        accountDetails.setAddress( accountDetailsBean.getAddress() );
        accountDetails.setContact(accountDetailsBean.getContact().toString() );

        return accDao.updateAccount( accountDetails );
    }

    public String deleteAccount( Long accountNumber ) {

        return accDao.deleteAccount( accountNumber.toString() );
    }

    public AccountDetails getAccount( Long accountNumber ) {

        return accDao.getAccount( accountNumber.toString() );
    }

    public List<AccountDetails> getAccounts( ) {
        return accDao.getAccounts();
    }


    public AccountDetails getAccountByContact( Long contact ){
        return accDao.getAccountByContact( String.valueOf( contact ) );
    }

    public AccountDetails getAccountByContactAndAddress( Long contact, String address ) {
        return accDao.getAccountByContactAndAddress( String.valueOf( contact ), address );
    }

    public AccountDetails getAccountByNameAndContactAndAddress( String name, Long contact, String address ) {
        return accDao.getAccountByNameAndContactAndAddress( name, String.valueOf( contact ), address );
    }

//    public List<String> showTransactions( Long accountNumber ) {
//
//        return null;
//    } ;

}
