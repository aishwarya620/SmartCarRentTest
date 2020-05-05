package com.qa.Common;

import com.qa.Pages.RegistrationPage;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang.RandomStringUtils;

public class DataFactory {
    public MobileElement name;
    public MobileElement emailId;
    public MobileElement phone_No;
    public MobileElement password;
    public MobileElement confirmPassword;
    public MobileElement city;
    public MobileElement pinCode;
    public MobileElement wallet;
    public MobileElement licenceNo;
    public MobileElement radioMale;
    public MobileElement radioFemale;
    public MobileElement radioTypeOwner;
    public MobileElement radioTypeUser;

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
    }
    public void sendKeys(MobileElement element, String txt){
        element.sendKeys(txt);
    }
    public void enterName(String name1){
        sendKeys(name,name1);
    }
    public void enterEmailId(String emailId1){
        sendKeys(emailId,emailId1);
    }
    public void enterPhoneNo(String phoneNo1){
        sendKeys(phone_No,phoneNo1);
    }
    public void enterPassword(String password1){
        sendKeys(password,password1);
    }
    public void enterConfirmPassword(String password1){
        sendKeys(confirmPassword,password1);
    }
    public void enterCity(String city1) {
        sendKeys(city,city1);
    }
    public void enterPinCode(String pincode1){
        sendKeys(pinCode,pincode1);
    }
    public void enterWalletBalance(String walletBalance1){
        sendKeys(wallet,walletBalance1);
    }
    public void enterLicenceNo(String licenceNo1){
        sendKeys(licenceNo,licenceNo1);
    }
}
