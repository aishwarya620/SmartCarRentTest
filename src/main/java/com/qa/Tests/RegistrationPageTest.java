package com.qa.Tests;

import com.qa.Pages.RegistrationPage;
import com.qa.TestBase;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationPageTest extends TestBase {
    protected static AppiumDriver driver ;
    RegistrationPage registrationPage;
    @BeforeClass
    public void setUp() {
        driver=getDriver();
    }
    @Test
    public void shouldRegisteredSucessfully() {



    }


}
