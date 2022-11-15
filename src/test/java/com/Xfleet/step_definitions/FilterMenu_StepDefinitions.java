package com.Xfleet.step_definitions;

import com.Xfleet.pages.BasePage;
import com.Xfleet.pages.FilterMenuPage;
import com.Xfleet.pages.LoginPage;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.ConfigurafionReader;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FilterMenu_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    FilterMenuPage filterMenuPage = new FilterMenuPage();

    @When("MFGthe user enters credentials as a {string} and click login button")
    public void MFGthe_user_enters_credentials_as_a_and_click_login_button(String usertype) {
        loginPage.loginUserType(usertype);
        filterMenuPage.waitUntilVisibleWait(filterMenuPage.loaderMask);
    }

    @When("MFGthe user clicks on the vehicles under the fleet")
    public void MFGclick_on_the_vehicles_under_the_fleet() {
        filterMenuPage.navigateToModule("Fleet", "Vehicles");
        BrowserUtils.sleep(3);
    }

    @When("MFGthe user clicks on the filter icon")
    public void MFGclick_on_the_filter_icon() {
        String filterIcon = "//a[@title='Filters']";
        //filterMenuPage.filterIcon.click();
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(filterIcon), 5);
            BrowserUtils.waitForVisibility(By.xpath(filterIcon), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(filterIcon)));
            Driver.getDriver().findElement(By.xpath(filterIcon)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(filterIcon)), 5);
        }
    }

    @Then("MFGthe Manage Filter button should be visible")
    public void MFGthe_manage_filter_button_should_be_visible() {
        Assert.assertTrue(filterMenuPage.manageFilters.isDisplayed());
    }

    @When("MFGthe user clicks on the Manage Filters menu")
    public void MFGclick_on_the_manage_filters_menu() {
        BrowserUtils.sleep(3);
        filterMenuPage.manageFilters.click();
    }

    @When("MFGthe user clicks on the Tags")
    public void MFGclick_on_the_tags() {
        BrowserUtils.waitFor(3);
        filterMenuPage.tags.click();
    }

    @When("MFGthe user enters credentials as a store manager and click login button")
    public void MFGthe_user_enters_credentials_as_a_store_manager_and_click_login_button() {
        loginPage.username.sendKeys(ConfigurafionReader.getProperty("store_manager_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurafionReader.getProperty("store_manager_password"));
        loginPage.loginBtn.click();
    }

    @Then("MFGtags should be selected")
    public void MFGtags_should_be_selected() {
        Assert.assertTrue(filterMenuPage.tags.isSelected());
    }

    @When("MFGthe user enters credentials as a sales manager and click login button")
    public void MFGthe_user_enters_credentials_as_a_sales_manager_and_click_login_button() {
        loginPage.username.sendKeys(ConfigurafionReader.getProperty("sales_manager_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurafionReader.getProperty("sales_manager_password"));
        loginPage.loginBtn.click();
    }

    @When("MFGthe user types the filter name")
    public void MFGthe_user_types_the_filter_name() {
        filterMenuPage.searchManage.sendKeys("Tags");
        BrowserUtils.waitFor(3);
    }

    @Then("MFGthe user should be apply filters")
    public void MFGthe_user_should_be_apply_filters() {
        String actual = filterMenuPage.typeTags.getText();
        Assert.assertEquals("Tags", actual);
    }

    @When("MFGthe user clicks on the Driver, Location and Chassis Number")
    public void mf_gthe_user_clicks_on_the_driver_location_and_chassis_number() {
        filterMenuPage.driver.click();
        filterMenuPage.location.click();
        filterMenuPage.chassisNumber.click();
        BrowserUtils.waitFor(2);
    }

    @Then("MFGDriver, Location and Chassis Number should be selected")
    public void mfg_driver_location_and_chassis_number_should_be_selected() {
        Assert.assertTrue(filterMenuPage.driver.isSelected());
        Assert.assertTrue(filterMenuPage.location.isSelected());
        Assert.assertTrue(filterMenuPage.chassisNumber.isSelected());

    }

    @When("MFGthe user clicks on the reset icon, under the Fleet-Vehicles module")
    public void mf_gthe_user_clicks_on_the_reset_icon_under_the_fleet_vehicles_module() {
        filterMenuPage.resetIcon.click();
        BrowserUtils.waitFor(3);
    }

    @Then("MFGthe user can remove all filters \\(Driver, Location and Chassis Number should be non selected)")
    public void mf_gthe_user_can_remove_all_filters_driver_location_and_chassis_number_should_be_non_selected() {
        Assert.assertFalse(filterMenuPage.driver.isSelected());
        Assert.assertFalse(filterMenuPage.location.isSelected());
        Assert.assertFalse(filterMenuPage.chassisNumber.isSelected());
    }

}
