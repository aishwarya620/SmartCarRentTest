package com.qa.Pages;

import com.qa.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static AppiumDriver driver;
    //protected final String APP_ACTIVITY = "com.example.cc14.smartcarrent";

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }
}
