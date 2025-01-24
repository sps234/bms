package com.jocata.bms.bean;

public class AccountSearchRequest {

    public String name;
    public String accountNumber;
    public String address;
    public Long contact ;

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
    public void setContact( Long contact ) {
        this.contact = contact;
    }
    public Long getContact() {
        return contact;
    }

}
