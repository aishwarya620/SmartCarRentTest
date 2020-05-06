package com.qa.Tests;

import com.qa.Pages.*;
import com.qa.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @Test
    public void shouldLoginSuccessfullyAsOwner() throws Exception {
       // HomePage homePage = new HomePage(getDriver(),get_Connection());
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        OwnerPage ownerPage;
        ownerPage = loginPage.loginAsOwner(3);
    }
    @Test
    public void shouldLoginSuccessfullyAsUser() throws Exception {
       // HomePage homePage = new HomePage(getDriver(),get_Connection());
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        UserPage userPage;
        userPage = loginPage.loginAsUser(2);
    }
}
