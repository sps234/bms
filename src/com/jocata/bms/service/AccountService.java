package com.jocata.bms.service;

import com.jocata.bms.bean.AccountBean;
import com.jocata.bms.entity.AccountDetails;

import java.util.List;

public interface AccountService {

    public String createAccount( AccountBean ab );

    public String updateAccount( AccountBean ab  ) ;

    public String deleteAccount( String accountNumber ) ;

    public AccountDetails getAccount( String accountNumber ) ;

    public List<AccountDetails> getAccounts( ) ;


    public List<String> showTransactions( Long accountNumber ) ;

}
