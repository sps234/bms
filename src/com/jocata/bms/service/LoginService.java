package com.jocata.bms.service;

import com.jocata.bms.bean.UserDetailsBean;

public interface LoginService {

    public String signUp(UserDetailsBean udb) ;

    public String signIn(String uname, String pwd) ;

    public String forgetPassword( UserDetailsBean udb ) ;

    public String deleteUser( UserDetailsBean udb ) ;

}
