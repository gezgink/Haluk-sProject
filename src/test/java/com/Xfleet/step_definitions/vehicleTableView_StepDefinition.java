package com.Xfleet.step_definitions;

import com.Xfleet.pages.VehicleTableViewPage;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class vehicleTableView_StepDefinition {

    VehicleTableViewPage vtv = new VehicleTableViewPage();

    @Given("MDUser should be on the Dashboard or Quick Launchpad")
    public void md_user_should_be_on_the_dashboard_or_quick_launchpad() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com");
      vtv.username.sendKeys("user1");
      vtv.password.sendKeys("UserUser123");
      vtv.loginBtn.click();
      //vtv.loaderMask.click();
        BrowserUtils.waitFor(5);
    }
    @Given("MDUser click {string} under the {string} module")
    public void md_user_click_under_the_module(String Fleet, String Vehicles) {
        vtv.navigateToModule("Fleet","Vehicles");
    }

    @Then("MDUser can see all vehicle information")
    public void md_user_can_see_all_vehicle_information() {
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
        Assert.assertEquals("License Plate",vtv.seePage.getText());

    }


    @Then("MDUser can see the total page number")
    public void md_user_can_see_the_total_page_number() {
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
       Assert.assertEquals("of 13 |",vtv.totalPageNum.getText());
    }


    @When("MDUser can go to next page after clicking {string} button")
    public void md_user_can_go_to_next_page_after_clicking_button(String string) {
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
      vtv.next.click();
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
      Assert.assertEquals("of 12 |",vtv.totalPageNum.getText());
    }
    @Then("MDUser can go to previous page clicking {string} button")
    public void md_user_can_go_to_previous_page_clicking_button(String string) {
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
        vtv.previous.click();
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
        Assert.assertEquals("of 13 |",vtv.totalPageNum.getText());
    }

    @When("MDUser can see total recordings of vehicles")
    public void md_user_can_see_total_recordings_of_vehicles() {
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
       Assert.assertEquals("Total of 120 records",vtv.totalRecordings.getText());
    }



    @When("MDUser click {string} module")
    public void md_user_click_module(String string) {
        BrowserUtils.waitForVisibility(vtv.totalPageNum,5);
        vtv.export.click();
    }
    @Then("MDUser can download table data in XLS")
    public void md_user_can_download_table_data_in_xls() {
        vtv.xlsBtn.click();
        Assert.assertEquals("Export started successfully. You will receive email notification upon completion.",vtv.xlsBtn.getAttribute("validateMsg"));

    }


    @Then("MDUser can download table data in CSV format")
    public void md_user_can_download_table_data_in_csv_format() {
        vtv.csvBtn.click();
        Assert.assertEquals("Export started successfully. You will receive email notification upon completion.",vtv.csvBtn.getAttribute("validateMsg"));
    }



}