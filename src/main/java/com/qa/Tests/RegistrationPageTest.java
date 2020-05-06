package com.qa.Tests;

import com.qa.Pages.HomePage;
import com.qa.Pages.RegistrationPage;
import com.qa.TestBase;
import org.testng.annotations.Test;

public class RegistrationPageTest extends TestBase {

    @Test
    public void shouldRegisteredSuccessfully() throws Exception {
       // HomePage homePage = new HomePage(getDriver(),get_Connection());
        HomePage homePage = new HomePage(getDriver());
        RegistrationPage registrationPage;
        registrationPage = homePage.pressSignUpButton();
        registrationPage.randomData();
    }
}
