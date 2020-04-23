package com.qa.Tests;

import com.github.javafaker.Faker;
import com.qa.Pages.HomePage;
import com.qa.Pages.RegistrationPage;
import com.qa.TestBase;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationPageTest extends TestBase {
    protected static AppiumDriver driver ;
    RegistrationPage registrationPage;
    HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver=getDriver();
    }

    @Test
    public void shouldRegisteredSucessfully() {
        homePage = new HomePage(driver);
        registrationPage = homePage.pressSignUpButton();
        registrationPage = new RegistrationPage(driver);
        registrationPage.randomData();

    }
}
