package com.jocata.bms.bean;

public class UserDetailsBean {

        private String fname;
        private String lname;
        private String username ;
        private String pwd;
        private String email;
        private Long contact ;


        public String getFname() {
                return fname;
        }
        public void setFname(String fname) {
                this.fname = fname;
        }
        public String getLname() {
                return lname;
        }
        public void setLname(String lname) {
                this.lname = lname;
        }
        public String getEmail() {
                return email;
        }
        public void setEmail(String email) {
                this.email = email;
        }
        public String getUsername() {
                return username;
        }
        public void setUsername(String username) {
                this.username = username;
        }
        public String getPwd() {
                return pwd;
        }
        public void setPwd(String pwd) {
                this.pwd = pwd;
        }
        public Long getContact() {
                return contact;
        }
        public void setContact( Long contact) {
                this.contact = contact;
        }


}
