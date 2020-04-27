package com.qa.Common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static AppiumDriver driver;
    private  DriverFactory(){

    }
    public static AppiumDriver getDriver() throws MalformedURLException {
        if(driver == null){
            driver = createDriver();
        }
        return driver;
    }
    private static AppiumDriver createDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RZ8M7442VWR");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.example.cc14.smartcarrent");
        caps.setCapability("appActivity", "com.example.cc14.smartcarrent.SplashScreenActivity");
        caps.setCapability("app","/home/hp/Desktop/SmartApp/app/release/app-release.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  driver;
    }
}
