package com.Xfleet.step_definitions;

import com.Xfleet.pages.LoginPage;
import com.Xfleet.pages.VehicleGeneralInfornationPage;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.ConfigurafionReader;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.builder.DiffResult;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class VehicleGeneralInformation {
    VehicleGeneralInfornationPage vehicleGeneralInfornationPage = new VehicleGeneralInfornationPage();



    @Then("HU_The user clicks {string} tab and {string} module")
    public void hu_theUserClickingTabAndModule(String arg0, String arg1) {

        vehicleGeneralInfornationPage.navigateToModule(arg0, arg1);
    }

    @When("HU_The user clicks vehicle")
    public void hu_theUserClickVehicle() {
        BrowserUtils.sleep(10);
        vehicleGeneralInfornationPage.row.click();
    }
    @Then("HU_The user sees the General Information page")
    public void hu_theUserSeesTheGeneralInformationPage() {
        vehicleGeneralInfornationPage.waitUntilVisibleWait(vehicleGeneralInfornationPage.loaderMask);
        boolean result = vehicleGeneralInfornationPage.infoTitle.isDisplayed();
        Assert.assertTrue(result);
    }
    @When("HU_The user clicks Eye button")
    public void hu_theUserClicksEyeButton() {

        BrowserUtils.sleep(10);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleGeneralInfornationPage.threeDot).perform();
        vehicleGeneralInfornationPage.eye.click();

    }

    @Given("HU_The user logs in page")
    public void hu_theUserLogsInApplication() {
        Driver.getDriver().get(ConfigurafionReader.getProperty("env"));

    }

    @When("HU_The user logs in as a {string} application")
    public void hu_theUserLogsInAsAApplication(String user) {
        vehicleGeneralInfornationPage.loginUserType(user);
    }
}
