package com.qa.Tests;

import com.qa.Pages.BasePage;
import com.qa.Pages.HomePage;
import org.testng.annotations.*;

public class HomeTest extends BasePage {
    HomePage homePage;

    @BeforeClass
    public void beforeClass(){
    }
    @AfterClass
    public void afterClass(){
    }
    @BeforeMethod
    public void beforeMethod(){
        homePage = new HomePage();
    }
    @AfterMethod
    public void afterMethod(){
    }
    @Test
    public void shouldPressSignUp(){
        homePage.pressSignUpButton();
    }
    @Test
    public void shouldPressSignIn(){
        homePage.pressSignInButton();
    }
}
