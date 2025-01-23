package com.jocata.bms.dao;

import com.jocata.bms.entity.AccountDetails;

public interface AccountDao {

    public String createAccount( AccountDetails accountDetails  ) ;
    public String editAccount(  AccountDetails accountDetails  ) ;
    public String deleteAccount( String accountNumber );
    public String getAccount( String accountNumber ) ;
    public String getAccounts( ) ;

}
