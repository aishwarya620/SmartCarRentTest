package com.qa.Common;

public class UserData {
    public String  name;
    public String emailId;
    public String phone_No;
    public String password;
    public String confirmPassword;
    public String city;
    public String pinCode;
    public String wallet;
    public String licenceNo;
    public int gender;
    public int userType;

    public  UserData(){

    }

    public String getName() {
        return name;
    }

    public UserData setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public UserData setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public String getPhone_No() {
        return phone_No;
    }

    public UserData setPhone_No(String phone_No) {
        this.phone_No = phone_No;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserData setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserData setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getCity() {
        return city;
    }

    public UserData setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPinCode() {
        return pinCode;
    }

    public UserData setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public String getWallet() {
        return wallet;
    }

    public UserData setWallet(String wallet) {
        this.wallet = wallet;
        return this;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public UserData setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
        return this;
    }

    public int getGender() {
        return gender;
    }

    public UserData setGender(int gender) {
        this.gender = gender;
        return this;
    }

    public int getUserType() {
        return userType;
    }

    public UserData setUserType(int userType) {
        this.userType = userType;
        return this;
    }
}
