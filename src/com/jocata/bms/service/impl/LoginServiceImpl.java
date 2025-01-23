package com.jocata.bms.service.impl;

import com.jocata.bms.bean.UserDetailsBean;
import com.jocata.bms.dao.LoginDao;
import com.jocata.bms.dao.impl.LoginDaoImpl;
import com.jocata.bms.entity.UserDetails;
import com.jocata.bms.service.LoginService;

public class LoginServiceImpl implements LoginService  {

    LoginDao dao ;

    public String signUp( UserDetailsBean udb) {

        UserDetails ud = new UserDetails();

        ud.setFname( udb.getFname() );
        ud.setLname( udb.getLname() );
        ud.setUsername( udb.getUsername() );
        ud.setPwd( udb.getPwd() );
        ud.setEmail( udb.getEmail() );
        ud.setContact( udb.getContact().toString() ) ;

        dao =  new LoginDaoImpl( );
        dao.signUp( ud );

        return null;
    }

    public String signIn(String uname, String pwd) {

        dao = new LoginDaoImpl( );

        return dao.signIn( uname, pwd );
    }

}
