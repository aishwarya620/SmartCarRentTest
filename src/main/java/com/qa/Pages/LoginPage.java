package com.qa.Pages;

import com.qa.Common.FetchTestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LoginPage extends BasePage{

    FetchTestData fetchTestData = new FetchTestData();
    @AndroidFindBy(id = appPackage + ":id/edtMobile") public MobileElement mobileNumber;
    @AndroidFindBy(id = appPackage + ":id/etPassword") public MobileElement password;

    public LoginPage(AppiumDriver driver) throws SQLException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }
    public void sendKeys(MobileElement element, String txt){
        element.sendKeys(txt);
    }
    public LoginPage enterMobile(String mobile1){
        sendKeys(mobileNumber,mobile1);
        return this;
    }
    public LoginPage enterPassword(String password1){
        sendKeys(password,password1);
        return this;
    }
    public OwnerPage loginAsOwner(int userid) throws SQLException {
        fetchTestData.findUser(userid);
        enterMobile(fetchTestData.getMobileNO());
        enterPassword(fetchTestData.getPassword());
        return new OwnerPage(driver);
    }
    public UserPage loginAsUser(int userid) throws SQLException {
        fetchTestData.findUser(userid);
        enterMobile(fetchTestData.getMobileNO());
        enterPassword(fetchTestData.getPassword());
        return new UserPage();
    }
}
