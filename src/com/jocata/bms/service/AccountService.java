package com.jocata.bms.service;

import com.jocata.bms.bean.AccountDetailsBean;
import com.jocata.bms.entity.AccountDetails;

import java.util.List;

public interface AccountService {

    public String createAccount( AccountDetailsBean accountDetailsBean );

    public String updateAccount( AccountDetailsBean accountDetailsBean  ) ;

    public String deleteAccount( Long accountNumber ) ;

    public AccountDetails getAccount( Long accountNumber ) ;

    public List<AccountDetails> getAccounts( ) ;

    public AccountDetails getAccountByContact( Long contact );

    public AccountDetails getAccountByContactAndAddress( Long contact, String address );

    public AccountDetails getAccountByNameAndContactAndAddress( String accountNumber,Long contact, String address );

//    public List<String> showTransactions( Long accountNumber ) ;

}
