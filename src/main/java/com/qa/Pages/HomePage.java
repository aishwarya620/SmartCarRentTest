package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    protected static AppiumDriver driver;
    @AndroidFindBy(id = "com.example.cc14.smartcarrent:id/btnSignUp") public MobileElement signUp;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/btnSignIn") public MobileElement signIn;

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }
    public RegistrationPage pressSignUpButton(){
        signUp.click();
        return new RegistrationPage(driver);
    }
    public LoginPage pressSignInButton(){
        signIn.click();
        return new LoginPage();
    }
    public void sendKeys(MobileElement element, String txt){
        element.sendKeys(txt);
    }
}
