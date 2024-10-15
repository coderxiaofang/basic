package com.myblog.javaproject;

public class login {
    private String name;
    private String passward;
    private String idNumber;
    private String phoneNumber;

    public login() {

    }

    public login(String name, String passward, String idNumber, String phoneNumber) {
        this.name = name;
        this.passward = passward;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
