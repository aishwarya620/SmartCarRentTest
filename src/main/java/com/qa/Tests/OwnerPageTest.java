package com.qa.Tests;

import com.qa.Pages.*;
import com.qa.TestBase;
import org.testng.annotations.Test;

public class OwnerPageTest extends TestBase {

    @Test
    public void shouldClickOnAddVehicleButton() throws Exception {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        OwnerPage ownerPage;
        ownerPage = loginPage.loginAsOwner(3);
        AddVehiclePage addVehiclePage;
        addVehiclePage = ownerPage.pressAddVehicleButton();
    }
    /*
    @Test
    public void shouldClickOnTrackCarButton() throws Exception {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        OwnerPage ownerPage;
        ownerPage = loginPage.loginAsOwner(3);
        TrackCarPage trackCarPage;
        trackCarPage = ownerPage.pressTrackCarButton();
    }
    @Test
    public void shouldClickOnControlButton() throws Exception {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        OwnerPage ownerPage;
        ownerPage = loginPage.loginAsOwner(3);
        ControlPage controlPage;
        controlPage = ownerPage.pressControlButton();
    }
    @Test
    public void shouldClickOnViewHistoryButton() throws Exception {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage;
        loginPage = homePage.pressSignInButton();
        OwnerPage ownerPage;
        ownerPage = loginPage.loginAsOwner(3);
        ViewHistoryPage viewHistoryPage;
        viewHistoryPage = ownerPage.pressViewHistoryButton();
    }*/
}
