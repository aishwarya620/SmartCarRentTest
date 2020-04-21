package com.qa.Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HomePage extends page {

    public AndroidDriver getDriver() {
        return this.androidDriver;
    }
    public void setDriver(AndroidDriver androidDriver) throws MalformedURLException {
        //this.androidDriver = androidDriver;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RZ8M7442VWR");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.example.cc14.smartcarrent");
        caps.setCapability("appActivity", "com.example.cc14.smartcarrent.SplashScreenActivity");
        caps.setCapability("app","/home/hp/Desktop/SmartApp/app/release/app-release.apk");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void quitDriver() {
        androidDriver.quit();
    }
}
