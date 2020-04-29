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

    @BeforeTest
    public void setUp() {
        driver=getDriver();
    }
    @Test
    public void shouldClickOnSignUpButton() {
        homePage = new HomePage(driver);
        registrationPage = homePage.pressSignUpButton();
    }
    @Test
    public void shouldClickOnSignInButton() {
        homePage = new HomePage(driver);
        loginPage = homePage.pressSignInButton();
    }
}