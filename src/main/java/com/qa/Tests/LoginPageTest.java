package com.qa.Tests;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegistrationPage;
import com.qa.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @Test
    public void shouldLoginSuccessfullyAsOwner() throws Exception {
        HomePage homePage = new HomePage(getDriver(),get_Connection());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        loginPage.actionPerformed();
    }
    @Test
    public void shouldLoginSuccessfullyAsUser() throws Exception {
        HomePage homePage = new HomePage(getDriver(),get_Connection());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        loginPage.actionPerformed1();
    }
}
