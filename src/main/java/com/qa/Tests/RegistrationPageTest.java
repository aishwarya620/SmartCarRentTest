package com.qa.Tests;

import com.qa.Common.User;
import com.qa.Common.UserData;
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
        UserData userData = User.randomData();
        registrationPage.fillRegistrationPage(userData);
    }
}
