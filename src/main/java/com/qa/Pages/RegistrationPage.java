package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage extends HomePage{
    protected static AppiumDriver driver;

    @AndroidFindBy(id = "com.example.cc14.smartcarrent:id/etName") public MobileElement name;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etEmail_id") public MobileElement emailId;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etPhone_no") public MobileElement phone_No;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/et_Password") public MobileElement password;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etCpassword") public MobileElement confirmPassword;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etCity") public MobileElement city;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etPincode") public MobileElement pinCode;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etWallet") public MobileElement wallet;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etLicenceNo") public MobileElement licenceNo;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/btnSubmit") public MobileElement submit;

    public RegistrationPage(AppiumDriver driver) {
        super(driver);
    }
    public RegistrationPage enterName(String name){
        //sendKeys(name,name);
        return this;
    }

}
