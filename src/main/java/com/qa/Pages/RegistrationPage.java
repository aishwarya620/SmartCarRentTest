package com.qa.Pages;

import com.qa.Common.FetchTestData;
import com.qa.Common.UserData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

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
    @AndroidFindBy (id = appPackage + ":id/radioSex") public MobileElement radioSex;
    @AndroidFindBy (id = appPackage + ":id/etLicenceNo") public MobileElement licenceNo;
    @AndroidFindBy (id = appPackage + ":id/radioUser") public  MobileElement radioTypeUser;
    @AndroidFindBy (id = appPackage + ":id/radioOwner") public MobileElement radioTypeOwner;
    @AndroidFindBy (id = appPackage + ":id/radioUserType") public MobileElement radioUserType;
    @AndroidFindBy (id = appPackage + ":id/btnSubmit") public MobileElement submit;

    public RegistrationPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }
    public RegistrationPage fillRegistrationPage(UserData userData) throws SQLException {
        enterName(userData.getName());
        enterEmailId(userData.getEmailId());
        enterPhoneNo(userData.getPhone_No());
        enterPassword(userData.getPassword());
        enterConfirmPassword(userData.getConfirmPassword());
        enterCity(userData.getCity());
        enterPinCode(userData.getPinCode());
        enterWalletBalance(userData.getWallet());

        if(userData.getGender() == 0)
            radioMale.click();
        else
            radioFemale.click();
        enterLicenceNo(userData.getLicenceNo());

        if(userData.getUserType() == 0)
            radioTypeUser.click();
        else
            radioTypeOwner.click();

        submit.click();
        //FetchTestData fetchTestData = new FetchTestData();
        //fetchTestData.insertUser(name,emailId,phone_No,password,city,pinCode,licenceNo);
        return this;
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
}