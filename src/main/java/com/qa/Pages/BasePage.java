package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import java.sql.Connection;

public class BasePage {
    protected  AppiumDriver driver;
    public final String appPackage = "com.example.cc14.smartcarrent";
    protected static Connection connection;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        //this.connection = connection;
    }

}
