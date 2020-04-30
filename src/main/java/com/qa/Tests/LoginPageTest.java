package com.qa.Tests;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @Test
    public void shouldLoginSuccessfullyAsOwner() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();

    }
    @Test
    public void shouldLoginSuccessfullyAsUser() {

    }
}
