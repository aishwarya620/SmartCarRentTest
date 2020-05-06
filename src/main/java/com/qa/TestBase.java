package com.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestBase  {
    protected AndroidDriver driver;

   /* @BeforeTest
    public Connection get_Connection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/smartcarrent";
        String userName = "root";
        String password = "aishu65203";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, userName, password);
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }*/
    @BeforeTest
    public AndroidDriver getDriver() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RZ8M7442VWR");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.example.cc14.smartcarrent");
        caps.setCapability("appActivity", "com.example.cc14.smartcarrent.SplashScreenActivity");
        caps.setCapability("app","/home/hp/Desktop/main contents/SmartCarRentNew/app/release/app-release.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        return driver;
    }
    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
