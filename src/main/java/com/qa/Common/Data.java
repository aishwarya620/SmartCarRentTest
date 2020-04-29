package com.qa.Common;

import com.qa.Pages.RegistrationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang.RandomStringUtils;

public class Data {
    public void randomData(){
        AppiumDriver driver = null;
        RegistrationPage registrationPage = new RegistrationPage(driver);
        String firstName = RandomStringUtils.randomAlphabetic(5);
        registrationPage.enterName(firstName);

        String email1  = firstName.toLowerCase() + "@gmail.com";
        registrationPage.enterEmailId(email1);

        String phoneNo1 = RandomStringUtils.randomNumeric(10);
        registrationPage.enterPhoneNo(phoneNo1);

        String password1 = RandomStringUtils.randomAlphanumeric(10);
        registrationPage.enterPassword(password1);
        registrationPage.enterConfirmPassword(password1);

        String city1 = RandomStringUtils.randomAlphabetic(5);
        registrationPage.enterCity(city1);

        String pinCode1 = RandomStringUtils.randomNumeric(6);
        registrationPage.enterPinCode(pinCode1);

        String walletBalance1 = RandomStringUtils.randomNumeric(4);
        registrationPage.enterWalletBalance(walletBalance1);

        int min=0,max=1;
        int num = (int) (Math.random() * (max - min + 1) + min);
        if(num == 0)
            registrationPage.radioMale.click();
        else
            registrationPage.radioFemale.click();

        String licenceNo1 =RandomStringUtils.randomNumeric(15);
        registrationPage.enterLicenceNo(licenceNo1);

        int min1=0,max1=1;
        int num1 = (int) (Math.random() * (max1 - min1 + 1) + min1);
        if(num1 == 0)
            registrationPage.radioTypeUser.click();
        else
            registrationPage.radioTypeOwner.click();

        registrationPage.submit.click();
    }
}
