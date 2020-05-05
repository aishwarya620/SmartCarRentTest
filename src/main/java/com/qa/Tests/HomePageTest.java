package com.qa.Tests;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegistrationPage;
import com.qa.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    RegistrationPage registrationPage;
    LoginPage loginPage;
    HomePage homePage;


    @Test
    public void shouldClickOnSignUpButton() throws Exception {
        homePage = new HomePage(getDriver(),get_Connection());
        registrationPage = homePage.pressSignUpButton();
    }
    @Test
    public void shouldClickOnSignInButton() throws Exception {
        homePage = new HomePage(getDriver(),get_Connection());
        loginPage = homePage.pressSignInButton();
    }
}