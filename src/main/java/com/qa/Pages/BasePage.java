package com.qa.Pages;

import io.appium.java_client.AppiumDriver;

public class BasePage {
    protected static AppiumDriver driver;
    public final String appPackage = "com.example.cc14.smartcarrent";

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }
}
