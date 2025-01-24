package com.jocata.bms.entity;

import java.io.Serializable;

public class UserDetails implements Serializable {

        private String firstName;
        private String lastName;
        private String email;
        private String userName;
        private String password;
        private String contact ;

        public String getFirstName() {
                return firstName;
        }
        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }
        public String getLastName() {
                return lastName;
        }
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
        public String getEmail() {
                return email;
        }
        public void setEmail(String email) {
                this.email = email;
        }
        public String getUserName() {
                return userName;
        }
        public void setUserName(String userName) {
                this.userName = userName;
        }
        public String getPassword() {
                return password;
        }
        public void setPassword(String password) {
                this.password = password;
        }
        public String getContact() {
                return contact;
        }
        public void setContact(String contact) {
                this.contact = contact;
        }


}
