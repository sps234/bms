package com.jocata.bms.service.impl;

import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.dao.LoginDao;
import com.jocata.bms.dao.impl.LoginDaoImpl;
import com.jocata.bms.entity.UserDetails;
import com.jocata.bms.service.LoginService;

public class LoginServiceImpl implements LoginService  {

    LoginDao dao = new LoginDaoImpl( );

    public String signUp( UserDetailsBean udb) {

        UserDetails ud = new UserDetails();

        ud.setFirstName( udb.getFname() );
        ud.setLastName( udb.getLname() );
        ud.setUserName( udb.getUsername() );
        ud.setPassword( udb.getPwd() );
        ud.setEmail( udb.getEmail() );
        ud.setContact( udb.getContact().toString() ) ;

        dao.signUp( ud );

        return null;
    }

    public String signIn(String uname, String pwd) {
        return dao.signIn( uname, pwd );
    }

    public String forgetPassword( UserDetailsBean udb ) {

        UserDetails ud = new UserDetails();
        ud.setUserName( udb.getUsername() );
        ud.setPassword( udb.getPwd() );
        return dao.forgetPassword( ud );
    }

    public String deleteUser( UserDetailsBean udb ) {

        UserDetails ud = new UserDetails();
        ud.setUserName( udb.getUsername() );
        ud.setPassword( udb.getPwd() );

        return dao.deleteUser( ud );
    }

}
