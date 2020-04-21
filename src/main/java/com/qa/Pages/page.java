package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public abstract class page {
    protected static AppiumDriver driver;
    AndroidDriver androidDriver = (AndroidDriver) driver;

    public abstract void setDriver(AndroidDriver androidDriver)throws MalformedURLException;
    public abstract AndroidDriver getDriver();

}
