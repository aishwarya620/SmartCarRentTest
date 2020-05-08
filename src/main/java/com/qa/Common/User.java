package com.qa.Common;

import org.apache.commons.lang.RandomStringUtils;

public class User {

    public static UserData randomData() {

         String firstName = RandomStringUtils.randomAlphabetic(5);
         String email1  = firstName.toLowerCase() + "@gmail.com";
         String phoneNo1 = RandomStringUtils.randomNumeric(10);
         String password1 = RandomStringUtils.randomAlphanumeric(10);
         String city1 = RandomStringUtils.randomAlphabetic(5);
         String pinCode1 = RandomStringUtils.randomNumeric(6);
         String walletBalance1 = RandomStringUtils.randomNumeric(4);
         int min=0,max=1,min1=0,max1=1;
         int num = (int) (Math.random() * (max - min + 1) + min);
         String licenceNo1 =RandomStringUtils.randomNumeric(15);
         int num1 = (int) (Math.random() * (max1 - min1 + 1) + min1);

        return new UserData()
                .setName(firstName)
                .setEmailId(email1)
                .setPhone_No(phoneNo1)
                .setPassword(password1)
                .setConfirmPassword(password1)
                .setCity(city1)
                .setPinCode(pinCode1)
                .setWallet(walletBalance1)
                .setGender(num)
                .setUserType(num1);
    }

}
