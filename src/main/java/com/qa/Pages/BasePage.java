package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }
}
