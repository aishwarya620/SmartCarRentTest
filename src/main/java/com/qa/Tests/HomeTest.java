package com.qa.Tests;

import com.qa.Pages.HomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomeTest extends HomePage {
    HomePage homePage = new HomePage();

    @Test
    public void shouldLaunchApp() throws MalformedURLException {
        homePage.setDriver((AndroidDriver) driver);

    }
}
