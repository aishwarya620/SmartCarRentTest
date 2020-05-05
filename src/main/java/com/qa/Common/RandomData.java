package com.qa.Common;

import org.apache.commons.lang.RandomStringUtils;

public class RandomData {
    public static String firstName = RandomStringUtils.randomAlphabetic(5);
    public static String email1  = firstName.toLowerCase() + "@gmail.com";
    public static String phoneNo1 = RandomStringUtils.randomNumeric(10);
    public static String password1 = RandomStringUtils.randomAlphanumeric(10);
    public static String city1 = RandomStringUtils.randomAlphabetic(5);
    public static String pinCode1 = RandomStringUtils.randomNumeric(6);
    public static String walletBalance1 = RandomStringUtils.randomNumeric(4);
    public static int min=0,max=1,min1=0,max1=1;
    public static int num = (int) (Math.random() * (max - min + 1) + min);
    public static String licenceNo1 =RandomStringUtils.randomNumeric(15);
    public static int num1 = (int) (Math.random() * (max1 - min1 + 1) + min1);
}
