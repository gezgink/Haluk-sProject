package com.Xfleet.step_definitions;

import com.Xfleet.pages.LoginPage;
import com.Xfleet.utilities.ConfigurafionReader;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurafionReader.getProperty("env"));
    }
    @When("The user logs in as a {string}")
    public void the_user_logs_in_as_a(String userType) {

        loginPage.loginUserType(userType);
    }
    @Then("The user is on the {string} page")
    public void the_user_is_on_the_page(String pageSubTitle ) {

        loginPage.waitUntilVisibleWait(loginPage.loaderMask);
        Assert.assertEquals(pageSubTitle,loginPage.pageSubtitle.getText());

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {

        loginPage.loginUserType("Driver");
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        loginPage.waitUntilVisibleWait(loginPage.loaderMask);
        Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());

    }



}
