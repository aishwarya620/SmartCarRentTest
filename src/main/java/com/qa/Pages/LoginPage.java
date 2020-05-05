package com.qa.Pages;

import com.qa.Common.DataFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.sql.*;

public class LoginPage extends BasePage{
    @AndroidFindBy(id = appPackage + ":id/edtMobile") public MobileElement mobileNumber;
    @AndroidFindBy(id = appPackage + ":id/etPassword") public MobileElement password;

    public LoginPage(AppiumDriver driver,Connection connection) {
        super(driver,connection);
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
    DataFactory dataFactory;
    public OwnerPage loginAsOwner(int userid) throws Exception {
       /* Statement st = connection.createStatement();
        String query = "select * from tbl_users where userid = " + userid;
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String mobile = rs.getString("mobile");
            String password = rs.getString("password");
            enterMobile(mobile);
            enterPassword(password);
        }*/
        dataFactory.getDataFromDb(userid);
        return new OwnerPage();
    }
    public UserPage loginAsUser(int userid) throws Exception {
        /*Statement st = connection.createStatement();
        String query = "select * from tbl_users where userid = " + userid;
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String mobile = rs.getString("mobile");
            String password = rs.getString("password");
            enterMobile(mobile);
            enterPassword(password);
        }*/
        dataFactory.getDataFromDb(userid);
        return new UserPage();
    }
}
