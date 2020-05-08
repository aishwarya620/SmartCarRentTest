package com.qa.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OwnerPage extends BasePage{

    @AndroidFindBy(id = appPackage + ":id/btnAddVehicle") public MobileElement addVehicleButton;
    @AndroidFindBy(id = appPackage + ":id/btnTrackCar") public MobileElement trackCarButton;
    @AndroidFindBy(id = appPackage + ":id/btnControl") public MobileElement controlButton;
    @AndroidFindBy(id = appPackage + ":id/btnViewHistory") public MobileElement viewHistoryButton;

    public OwnerPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);//trying to initialise the UiElements
    }
    public AddVehiclePage pressAddVehicleButton(){
        addVehicleButton.click();
        return new AddVehiclePage();
    }
    public TrackCarPage pressTrackCarButton(){
        trackCarButton.click();
        return new TrackCarPage();
    }
    public ControlPage pressControlButton(){
        controlButton.click();
        return new ControlPage();
    }
    public ViewHistoryPage pressViewHistoryButton(){
        viewHistoryButton.click();
        return new ViewHistoryPage();
    }
}
