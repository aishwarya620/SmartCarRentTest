package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @AndroidFindBy(id = appPackage + ":id/edtMobile") public MobileElement mobileNumber;
    @AndroidFindBy(id = appPackage + ":id/etPassword") public MobileElement password;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }





}
