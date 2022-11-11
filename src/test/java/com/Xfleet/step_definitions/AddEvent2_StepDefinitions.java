package com.Xfleet.step_definitions;


import com.Xfleet.pages.AddEvent2Page;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.ConfigurafionReader;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEvent2_StepDefinitions {

    AddEvent2Page generalInfoPage = new AddEvent2Page();

    @Given("The manager login to the web application a valid {string} and {string}")
    public void the_manager_login_to_the_web_application_a_valid_and(String username, String password) {

        Driver.getDriver().get(ConfigurafionReader.getProperty("XFleet-Url"));
        generalInfoPage.logInBox.sendKeys(username);
        generalInfoPage.passwordBox.sendKeys(password);
        generalInfoPage.logInButton.click();

        BrowserUtils.sleep(10);

        if(generalInfoPage.addEventTittle.isDisplayed()){
            generalInfoPage.closeButton.click();
        }


    }

    @When("users click on {string} {string} module")
    public void usersClickOnModule(String arg0, String arg1) {


        generalInfoPage.navigateToModule(arg0, arg1);


    }

    @Then("users click on any row")
    public void users_click_on_any_row() {

        BrowserUtils.waitFor(10);

        generalInfoPage.firstRow.click();
        BrowserUtils.sleep(10);

    }


    @And("users can see the Add-Event Button")
    public void usersCanSeeTheAddEventButton() {

        generalInfoPage.addEventButton.isDisplayed();

    }

    @Then("user click the add event button")
    public void userClickTheAddEventButton() {


        BrowserUtils.waitFor(5);
        generalInfoPage.addEventButton.click();


    }


    @Then("user on the pop up page")
    public void userOnThePopUpPage() {

        BrowserUtils.waitFor(5);
        generalInfoPage.addEventTittle.isDisplayed();



    }


    @Then("user mark any color")
    public void userMarkAnyColor() {

        generalInfoPage.greenColor.click();
        BrowserUtils.sleep(4);
    }

    @Then("user can click All-day event check box")
    public void userCanClickAllDayEventCheckBox() {
        BrowserUtils.sleep(4);
        generalInfoPage.allDayEventBox.isSelected();
    }

    @And("after click time boxes will disappear")
    public void afterClickTimeBoxesWillDisappear() {


        BrowserUtils.waitFor(5);
        if (!(generalInfoPage.timeBox.isDisplayed())) {

            System.out.println("when the users click all-event day checkbox, time boxes are disappeared");

        }


    }
}

