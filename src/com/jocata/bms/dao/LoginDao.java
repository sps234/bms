package com.jocata.bms.dao;

import com.jocata.bms.entity.UserDetails;

public interface LoginDao {

    public String signUp(UserDetails ud ) ;

    public String signIn( String uname, String pwd ) ;

}
