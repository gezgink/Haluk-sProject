package com.Xfleet.step_definitions;


import com.Xfleet.pages.AddEvent2Page;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.ConfigurafionReader;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddEvent2_StepDefinitions {

    AddEvent2Page addEvent2Page = new AddEvent2Page();

    @Given("ULuser login to the web application a valid {string} and {string}")
    public void ULuser_login_to_the_web_application_a_valid_and(String username, String password) {

        Driver.getDriver().get(ConfigurafionReader.getProperty("env"));
        addEvent2Page.logInBox.sendKeys(username);
        addEvent2Page.passwordBox.sendKeys(password);
        addEvent2Page.logInButton.click();

        BrowserUtils.sleep(10);



       if (addEvent2Page.addEventTittle.isDisplayed()) {
           addEvent2Page.closeButton.click();

       }




    }

    @When("ULuser click on {string} {string} module")
    public void ULuserClickOnModule(String arg0, String arg1) {

        BrowserUtils.sleep(8);

        addEvent2Page.navigateToModule(arg0, arg1);


    }

    @Then("ULuser click on any row")
    public void ULuser_click_on_any_row() {

        BrowserUtils.waitFor(10);

        addEvent2Page.firstRow.click();
        BrowserUtils.sleep(10);

    }


    @And("ULuser can see the Add-Event Button")
    public void ULuserCanSeeTheAddEventButton() {

        addEvent2Page.addEventButton.isDisplayed();

    }

    @Then("ULuser click the add event button")
    public void ULuserClickTheAddEventButton() {


        BrowserUtils.waitFor(5);
        addEvent2Page.addEventButton.click();


    }


    @Then("ULuser on the pop up page")
    public void ULuserOnThePopUpPage() {

        BrowserUtils.waitFor(8);
        addEvent2Page.addEventTittle.isDisplayed();


    }


    @Then("ULuser mark any color")
    public void ULuserMarkAnyColor() {

        addEvent2Page.greenColor.click();
        BrowserUtils.sleep(4);
    }

    @Then("ULuser can click All-day event check box")
    public void ULuserCanClickAllDayEventCheckBox() {
        BrowserUtils.sleep(4);
        addEvent2Page.allDayEventBox.isSelected();
    }

    @And("ULafter click time boxes will disappear")
    public void ULafterClickTimeBoxesWillDisappear() {


        BrowserUtils.waitFor(5);
        if (!(addEvent2Page.timeBox.isDisplayed())) {

            System.out.println("when the users click all-event day checkbox, time boxes are disappeared");

        }


    }

    @Then("ULrepeat options should include the options below")
    public void UlrepeatOptionsShouldIncludeTheOptionsBelow() {

        addEvent2Page.repeatCheckBox.click();
       // addEvent2Page.repeatDropdown.click();
       // Select se = new Select(Driver.getDriver().findElement(By.xpath("//select[@class=\"recurrence-repeats__select\"]")));
         Select se = new Select(addEvent2Page.repeatDropdown);

//        se.selectByIndex(1);
//        se.selectByIndex(2);
//        se.selectByIndex(3);
//        se.selectByIndex(4);

        if (se.isMultiple()) {
            se.selectByVisibleText("Daily");
            se.selectByVisibleText("Weekly");
            se.selectByVisibleText("Monthly");
            se.selectByVisibleText("Yearly");

        }


    }

    @Then("ULending options should be as below and clickable")
    public void UlendingOptionsShouldBeAsBelowAndClickable() {

        addEvent2Page.neverRadioButton.click();
        addEvent2Page.afterRadioButton.click();
        addEvent2Page.byRadioButton.click();


    }

    @And("ULuser click the save button")
    public void UluserClickTheSaveButton() {

        addEvent2Page.saveButton.click();


    }

    @Then("ULuser can see all events on the General information page")
    public void UluserCanSeeAllEventsOnTheGeneralInformationPage() {
        addEvent2Page.generalInfPageRow.isDisplayed();


    }
}

