package com.jocata.bms.entity;

import java.io.Serializable;

public class AccountDetails implements Serializable {

    public String name;
    public String accountNumber;
    public String address;
    public String contact;

    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAccountNumber( String accountNumber ) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAddress( String address ) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setContact( String contact ) {
        this.contact = contact;
    }
    public String getContact() {
        return contact;
    }

}

