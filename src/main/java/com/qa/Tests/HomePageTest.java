package com.qa.Tests;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegistrationPage;
import com.qa.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    RegistrationPage registrationPage;
    LoginPage loginPage;

    @Test
    public void shouldClickOnSignUpButton() throws Exception {
        //homePage = new HomePage(getDriver(),get_Connection());
        HomePage homePage = new HomePage(getDriver());
        registrationPage = homePage.pressSignUpButton();
    }
    @Test
    public void shouldClickOnSignInButton() throws Exception {
       // homePage = new HomePage(getDriver(),get_Connection());
        HomePage homePage = new HomePage(getDriver());
        loginPage = homePage.pressSignInButton();
    }
}