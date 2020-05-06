package com.qa.Pages;

import com.qa.Common.DataFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    DataFactory dataFactory = new DataFactory();
    @AndroidFindBy(id = appPackage + ":id/edtMobile") public MobileElement mobileNumber;
    @AndroidFindBy(id = appPackage + ":id/etPassword") public MobileElement password;

    public LoginPage(AppiumDriver driver) {
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
    public OwnerPage loginAsOwner(int userid){
        dataFactory.get_Connection(userid);
        enterMobile(dataFactory.getMobileNO());
        enterPassword(dataFactory.getPassword());
        return new OwnerPage();
    }
    public UserPage loginAsUser(int userid) {
        dataFactory.get_Connection(userid);
        enterMobile(dataFactory.getMobileNO());
        enterPassword(dataFactory.getPassword());
        return new UserPage();
    }
}
