package com.qa.Pages;

import com.qa.Common.DriverFactory;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class BaseClass {
    static AppiumDriver driver = null ;
    public BaseClass() throws MalformedURLException {
        driver = DriverFactory.getDriver();
    }
}
