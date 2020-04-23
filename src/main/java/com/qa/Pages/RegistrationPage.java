package com.qa.Pages;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import java.security.SecureRandom;
import java.util.Random;

public class RegistrationPage {
    protected static AppiumDriver driver;

    @AndroidFindBy(id = "com.example.cc14.smartcarrent:id/etName") public MobileElement name;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etEmail_id") public MobileElement emailId;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etPhone_no") public MobileElement phone_No;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/et_Password") public MobileElement password;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etCpassword") public MobileElement confirmPassword;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etCity") public MobileElement city;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etPincode") public MobileElement pinCode;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etWallet") public MobileElement wallet;
    @AndroidFindBy (id ="com.example.cc14.smartcarrent:id/radioSex") public MobileElement radioSex;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/etLicenceNo") public MobileElement licenceNo;
    @AndroidFindBy (id ="com.example.cc14.smartcarrent:id/radioTypeUser") public  MobileElement radioTypeUser;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/btnSubmit") public MobileElement submit;

    public RegistrationPage(){

    }
    public RegistrationPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }
    public void sendKeys(MobileElement element, String txt){
        element.sendKeys(txt);
    }
    public RegistrationPage enterName(String name1){
        sendKeys(name,name1);
        return this;
    }
    public RegistrationPage enterEmailId(String emailId1){
        sendKeys(emailId,emailId1);
        return this;
    }
    public RegistrationPage enterPhoneNo(String phoneNo1){
        sendKeys(phone_No,phoneNo1);
        return this;
    }
    public RegistrationPage enterPassword(String password1){
        sendKeys(password,password1);
        return this;
    }

    public RegistrationPage enterConfirmPassword(String password1){
        sendKeys(confirmPassword,password1);
        return this;
    }
    public void randomData(){
        String firstName = RandomStringUtils.randomAlphanumeric(10);
        enterName(firstName);

        String email1  = firstName.toLowerCase() + "@gmail.com";
        enterEmailId(email1);

        String phoneNo1 = RandomStringUtils.randomNumeric(10);
        enterPhoneNo(phoneNo1);

        String password1 = RandomStringUtils.randomAlphanumeric(10);
        enterPassword(password1);
        enterConfirmPassword(password1);
    }


}
