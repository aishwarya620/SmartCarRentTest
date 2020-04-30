package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage{

    @AndroidFindBy (id = appPackage + ":id/etName") public MobileElement name;
    @AndroidFindBy (id = appPackage + ":id/etEmail_id") public MobileElement emailId;
    @AndroidFindBy (id = appPackage + ":id/etPhone_no") public MobileElement phone_No;
    @AndroidFindBy (id = appPackage + ":id/et_Password") public MobileElement password;
    @AndroidFindBy (id = appPackage + ":id/etCpassword") public MobileElement confirmPassword;
    @AndroidFindBy (id = appPackage + ":id/etCity") public MobileElement city;
    @AndroidFindBy (id = appPackage + ":id/etPincode") public MobileElement pinCode;
    @AndroidFindBy (id = appPackage + ":id/etWallet") public MobileElement wallet;
    @AndroidFindBy (id = appPackage + ":id/radioMale") public MobileElement radioMale;
    @AndroidFindBy (id = appPackage + ":id/radioFemale") public MobileElement radioFemale;
    @AndroidFindBy (id = appPackage + ":id/etLicenceNo") public MobileElement licenceNo;
    @AndroidFindBy (id = appPackage + ":id/radioUser") public  MobileElement radioTypeUser;
    @AndroidFindBy (id = appPackage + ":id/radioOwner") public MobileElement radioTypeOwner;
    @AndroidFindBy (id = appPackage + ":id/btnSubmit") public MobileElement submit;

    public RegistrationPage(AppiumDriver driver){
        super(driver);
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
    public RegistrationPage enterCity(String city1) {
        sendKeys(city,city1);
        return this;
    }
    public RegistrationPage enterPinCode(String pincode1){
        sendKeys(pinCode,pincode1);
        return this;
    }
    public RegistrationPage enterWalletBalance(String walletBalance1){
        sendKeys(wallet,walletBalance1);
        return this;
    }
    public RegistrationPage enterLicenceNo(String licenceNo1){
        sendKeys(licenceNo,licenceNo1);
        return this;
    }
    public void randomData(){
        String firstName = RandomStringUtils.randomAlphabetic(5);
        enterName(firstName);

        String email1  = firstName.toLowerCase() + "@gmail.com";
        enterEmailId(email1);

        String phoneNo1 = RandomStringUtils.randomNumeric(10);
        enterPhoneNo(phoneNo1);

        String password1 = RandomStringUtils.randomAlphanumeric(10);
        enterPassword(password1);
        enterConfirmPassword(password1);

        String city1 = RandomStringUtils.randomAlphabetic(5);
        enterCity(city1);

        String pinCode1 = RandomStringUtils.randomNumeric(6);
        enterPinCode(pinCode1);

        String walletBalance1 = RandomStringUtils.randomNumeric(4);
        enterWalletBalance(walletBalance1);

        int min=0,max=1;
        int num = (int) (Math.random() * (max - min + 1) + min);
        if(num == 0)
            radioMale.click();
        else
            radioFemale.click();

        String licenceNo1 =RandomStringUtils.randomNumeric(15);
        enterLicenceNo(licenceNo1);

        int min1=0,max1=1;
        int num1 = (int) (Math.random() * (max1 - min1 + 1) + min1);
        if(num1 == 0)
            radioTypeUser.click();
        else
            radioTypeOwner.click();

        //submit.click();
    }
}