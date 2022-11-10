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

    @When("The user enters credentials as a {string} and click login button")
    public void FLTAP_1016the_user_enters_credentials_as_a_and_click_login_button(String usertype) {
        loginPage.loginUserType(usertype);
        filterMenuPage.waitUntilVisibleWait(filterMenuPage.loaderMask);
    }
    @When("The user clicks on the vehicles under the fleet")
    public void FLTAP_1016click_on_the_vehicles_under_the_fleet() {
        filterMenuPage.navigateToModule("Fleet","Vehicles");
        BrowserUtils.sleep(3);
    }
    @When("The user clicks on the filter icon")
    public void FLTAP_1016click_on_the_filter_icon() {
        String filterIcon="//a[@title='Filters']";
        //filterMenuPage.filterIcon.click();
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(filterIcon), 5);
            BrowserUtils.waitForVisibility(By.xpath(filterIcon), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(filterIcon)));
            Driver.getDriver().findElement(By.xpath(filterIcon)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(filterIcon)),  5);
        }
    }
    @Then("The Manage Filter button should be visible")
    public void FLTAP_1016the_manage_filter_button_should_be_visible() {
        Assert.assertTrue(filterMenuPage.manageFilters.isDisplayed());
    }
    @When("The user clicks on the Manage Filters menu")
    public void FLTAP_1016click_on_the_manage_filters_menu() {
        BrowserUtils.sleep(3);
        filterMenuPage.manageFilters.click();
    }
    @When("The user clicks on the Tags")
    public void FLTAP_1016click_on_the_tags() {
        BrowserUtils.waitFor(3);
        filterMenuPage.tags.click();
            }
    @When("The user enters credentials as a store manager and click login button")
    public void FLTAP_1016the_user_enters_credentials_as_a_store_manager_and_click_login_button() {
        loginPage.username.sendKeys(ConfigurafionReader.getProperty("store_manager_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurafionReader.getProperty("store_manager_password"));
        loginPage.loginBtn.click();
    }
    @Then("Tags should be selected")
    public void FLTAP_1016tags_should_be_selected() {
        Assert.assertTrue(filterMenuPage.tags.isSelected());
    }
    @When("The user enters credentials as a sales manager and click login button")
    public void FLTAP_1016the_user_enters_credentials_as_a_sales_manager_and_click_login_button() {
        loginPage.username.sendKeys(ConfigurafionReader.getProperty("sales_manager_username") + Keys.ENTER);
        loginPage.password.sendKeys(ConfigurafionReader.getProperty("sales_manager_password"));
        loginPage.loginBtn.click();
    }
    @When("The user types the filter name")
    public void FLTAP_1016the_user_types_the_filter_name() {
        filterMenuPage.searchManage.sendKeys("Tags");
        BrowserUtils.waitFor(3);
    }
    @Then("The user should be apply filters")
    public void FLTAP_1016the_user_should_be_apply_filters() {
        String actual = filterMenuPage.typeTags.getText();
        Assert.assertEquals("Tags",actual);
    }
}
