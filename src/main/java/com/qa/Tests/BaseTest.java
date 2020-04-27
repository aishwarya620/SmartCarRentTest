package com.qa.Tests;

import com.qa.Pages.HomePage;
import com.qa.TestBase;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest extends TestBase {
    HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver=getDriver();
    }
    @Test
    public void verifyHomePage() {
        System.out.println("Home page test...");
        homePage = new HomePage(driver);
    }
}
