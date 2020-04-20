package com.qa.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage{
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/btnSignUp") private MobileElement signUp;
    @AndroidFindBy (id = "com.example.cc14.smartcarrent:id/btnSignIn") private MobileElement signIn;

    public HomePage(MobileElement signUp) {
        this.signUp = signUp;
    }

    public HomePage() {

    }
    public RegistrationPage pressSignUpButton(){
        signUp.click();
        return new RegistrationPage();

    }
    public LoginPage pressSignInButton(){
        signIn.click();
        return new LoginPage();
    }










    /*public void pressSignUpButton(){
      // signUp.click();
        signUp.click();

    }*/













     /*public void waitForVisibility(MobileElement e){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(e));
    }*/
    /*public LoginPage pressSignInButton(){
        click(signInButton);
        return new LoginPage();
    }
    public MobileElement getSignInButton() {
        return signInButton;
    }*/
}
