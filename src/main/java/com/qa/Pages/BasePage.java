package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;;
import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static AppiumDriver driver ;

    public BasePage(){
        PageFactory .initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }

    @BeforeTest
    public void setup() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RZ8M7442VWR");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.example.cc14.smartcarrent");
        caps.setCapability("appActivity", "com.example.cc14.smartcarrent.SplashScreenActivity");
        caps.setCapability("app","/home/hp/Desktop/SmartApp/app/release/app-release.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }

}



