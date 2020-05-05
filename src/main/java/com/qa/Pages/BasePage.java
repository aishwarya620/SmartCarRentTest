package com.qa.Pages;

import io.appium.java_client.AppiumDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasePage {
    protected  AppiumDriver driver;
    public final String appPackage = "com.example.cc14.smartcarrent";
    protected Connection connection;

    public BasePage(AppiumDriver driver,Connection connection) {
        this.driver = driver;
        this.connection = connection;
    }
}
