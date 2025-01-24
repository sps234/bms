package com.jocata.bms.dao;

import com.jocata.bms.entity.AccountDetails;

import java.util.List;

public interface AccountDao {

    public String createAccount( AccountDetails accountDetails  ) ;
    public String updateAccount(AccountDetails accountDetails  ) ;
    public String deleteAccount( String accountNumber );
    public AccountDetails getAccount( String accountNumber ) ;
    public List<AccountDetails> getAccounts( ) ;


    public AccountDetails getAccountByContact( String contact );

    public AccountDetails getAccountByContactAndAddress( String contact, String address );

    public AccountDetails getAccountByNameAndContactAndAddress( String accountNumber, String contact, String address );

//    public String updateUser( UserDetails userDetails  );
//    public String deleteUser( String userName  );

}
