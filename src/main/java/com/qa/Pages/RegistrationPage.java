package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import java.sql.*;

public class RegistrationPage extends BasePage{

    @AndroidFindBy (id = appPackage + ":id/etName") public String name;
    @AndroidFindBy (id = appPackage + ":id/etEmail_id") public MobileElement emailId;
    @AndroidFindBy (id = appPackage + ":id/etPhone_no") public MobileElement phone_No;
    @AndroidFindBy (id = appPackage + ":id/et_Password") public MobileElement password;
    @AndroidFindBy (id = appPackage + ":id/etCpassword") public MobileElement confirmPassword;
    @AndroidFindBy (id = appPackage + ":id/etCity") public MobileElement city;
    @AndroidFindBy (id = appPackage + ":id/etPincode") public MobileElement pinCode;
    @AndroidFindBy (id = appPackage + ":id/etWallet") public MobileElement wallet;
    @AndroidFindBy (id = appPackage + ":id/radioMale") public MobileElement radioMale;
    @AndroidFindBy (id = appPackage + ":id/radioFemale") public MobileElement radioFemale;
    @AndroidFindBy (id = appPackage + ":id/etLicenceNo") public MobileElement licenceNo;
    @AndroidFindBy (id = appPackage + ":id/radioUser") public  MobileElement radioTypeUser;
    @AndroidFindBy (id = appPackage + ":id/radioOwner") public MobileElement radioTypeOwner;
    @AndroidFindBy (id = appPackage + ":id/btnSubmit") public MobileElement submit;

    public RegistrationPage(AppiumDriver driver,Connection connection){
        super(driver,connection);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }
    public OwnerPage actionPerformed() throws SQLException {
        Statement st = connection.createStatement();
        String query = "insert into tbl_users values()";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            /*
            String mobile = rs.getString("mobile");
            String password = rs.getString("password");
            enterMobile(mobile);
            enterPassword(password);
            */
             name = rs.getString("name");
        }
        return new OwnerPage();
    }



}