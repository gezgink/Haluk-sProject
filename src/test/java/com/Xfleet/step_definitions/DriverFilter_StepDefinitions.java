package com.Xfleet.step_definitions;

import com.Xfleet.pages.DriverFilterPage;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class DriverFilter_StepDefinitions {

    DriverFilterPage driverFilterPage=new DriverFilterPage();

    /*
     @And("the user  navigates to {string} {string}")
    public void theUserNavigatesTo(String fleet, String vechiles) {
        driverFilterPage.navigateToModule(fleet,vechiles);
    }
     */
    @And("SAthe user  navigates to {string} {string}")
    public void satheUserNavigatesTo(String fleet, String vechiles) {
        driverFilterPage.navigateToModule(fleet,vechiles);
    }


    /*
    @And("the user click on the Filters icon")
        public void FLTAP_1018theUserClickOnTheFiltersIcon() {
            String filterLocate="//a[@title='Filters']";

            try {
                BrowserUtils.waitForPresenceOfElement(By.xpath(filterLocate), 5);
                BrowserUtils.waitForVisibility(By.xpath(filterLocate), 5);
                BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(filterLocate)));
                Driver.getDriver().findElement(By.xpath(filterLocate)).click();
            } catch (Exception e) {
                BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(filterLocate)),  10);
             // BrowserUtils.waitForStaleElement(Driver.getDriver().findElement(By.xpath(filterLocate)));
              //  BrowserUtils.clickWithWait(By.xpath(filterLocate), 5);

            }

        }
     */
    @And("SAthe user click on the Filters icon")
    public void satheUserClickOnTheFiltersIcon() {
        String filterLocate="//a[@title='Filters']";

        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(filterLocate), 5);
            BrowserUtils.waitForVisibility(By.xpath(filterLocate), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(filterLocate)));
            Driver.getDriver().findElement(By.xpath(filterLocate)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(filterLocate)),  10);
            // BrowserUtils.waitForStaleElement(Driver.getDriver().findElement(By.xpath(filterLocate)));
            //  BrowserUtils.clickWithWait(By.xpath(filterLocate), 5);

        }
    }

    /*
        @And("the user go to Manage filter and clicks Driver")
        public void theUserGoToManageFilterAndClicksDriver() {

        }

     */
    @And("SAthe user go to Manage filter and clicks Driver")
    public void satheUserGoToManageFilterAndClicksDriver() {
        BrowserUtils.waitFor(2);
        driverFilterPage.manageFilter.click();
        BrowserUtils.waitForVisibility(driverFilterPage.driverOption,10);
        driverFilterPage.driverOption.click();
    }
/*
@When("the user can select Driver filter")
    public void theUserCanSelectDriverFilter() {
        Assert.assertTrue(driverFilterPage.driverCheckBox.isSelected());
        Assert.assertTrue(driverFilterPage.driverFilter.isDisplayed());
    }
 */

    @When("SAthe user can select Driver filter")
    public void satheUserCanSelectDriverFilter() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(driverFilterPage.driverCheckBox.isSelected());
        Assert.assertTrue(driverFilterPage.driverFilter.isDisplayed());
    }
    /*
     @When("the user clicks Driver filter")
    public void theUserClicksDriverFilter() {
        driverFilterPage.driverFilter.click();
        BrowserUtils.waitFor(2);
    }
     */
    /**
     * AC2- click
     */

    @When("SAthe user clicks Driver filter")
    public void satheUserClicksDriverFilter() {
        driverFilterPage.driverFilter.click();
        BrowserUtils.waitFor(2);
    }


/*
  @And("the user clicks opened dropdown menu")
    public void theUserClicksOpenedDropdownMenu() {
        driverFilterPage.methodDropdownMenu.click();
        BrowserUtils.waitFor(2);
    }
 */
    /**
     * AC2- click methodMenu under Driver Filter
     */


    @And("SAthe user clicks opened dropdown menu")
    public void satheUserClicksOpenedDropdownMenu() {
        driverFilterPage.methodDropdownMenu.click();
        BrowserUtils.waitFor(2);
    }

    /**
     *
     * AC- DataTable- expected method is compared the actual method-
     * @param expectedMethod
     */
    /*
    @Then("the user should see following methods")
    public void theUserShouldSeeFollowingMethods(List<String> expectedMethod) {

        List<String> actualmethod=BrowserUtils.getElementsText(driverFilterPage.driverFilterMethod);

        Assert.assertEquals(expectedMethod,actualmethod);
       // System.out.println(expectedMethod);
       // System.out.println(actualmethod);

    }
     */


    @Then("SAthe user should see following methods")
    public void satheUserShouldSeeFollowingMethods(List<String> expectedMethod) {

        List<String> actualmethod=BrowserUtils.getElementsText(driverFilterPage.driverFilterMethod);

        Assert.assertEquals(expectedMethod,actualmethod);
        // System.out.println(expectedMethod);
        // System.out.println(actualmethod);
    }

    /*
      @And("the user selects {string} method")
    public void theUserSelectsMethod(String methodName) {

        driverFilterPage.selectMenuOption(methodName).click();
       // BrowserUtils.waitFor(2);
       // System.out.println( driverFilterPage.selectMenuOption(methodName).getText());

    }
     */

    /**
     *
     * AC3- Select method(function)
     * @param methodName
     */
    @And("SAthe user selects {string} method")
    public void satheUserSelectsMethod(String methodName) {

        driverFilterPage.selectMenuOption(methodName).click();
        // BrowserUtils.waitFor(2);
        // System.out.println( driverFilterPage.selectMenuOption(methodName).getText());
    }

    /**
     * Enter specified keyword inside the text
     * @param keyword
     */
/*
   @And("the user enter {string}")
    public void theUserEnter(String keyword) {

         driverFilterPage.text.sendKeys(keyword+ Keys.ENTER);
         BrowserUtils.waitFor(2);
    }
 */

    @And("SAthe user enter {string}")
    public void satheUserEnter(String keyword) {

        driverFilterPage.text.sendKeys(keyword+ Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

/*
 @And("user see that the results contain the specified {string}")
    public void userSeeThatTheResultsContainTheSpecified(String keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;
        for (String driver : actualDriverList) {
            if(!driver.toUpperCase().contains(keyword.toUpperCase())){
                check=false;
            }

        }
        Assert.assertTrue(check);

    }
 */

    @And("SAuser see that the results contain the specified {string}")
    public void sauserSeeThatTheResultsContainTheSpecified(String keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;
        for (String driver : actualDriverList) {
            if(!driver.toUpperCase().contains(keyword.toUpperCase())){
                check=false;
            }

        }
        Assert.assertTrue(check);

    }
    /*
        @And("user see that the results does not contain the specified {string}")
        public void userSeeThatTheResultsDoesNotContainTheSpecified(String keyword) {
            List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
            boolean check=true;

            for (String driver : actualDriverList) {
                if(driver.toUpperCase().contains(keyword.toUpperCase())){
                    check=false;
                }

            }

            Assert.assertTrue(check);
        }
    */
    @And("SAuser see that the results does not contain the specified {string}")
    public void sauserSeeThatTheResultsDoesNotContainTheSpecified(String keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;

        for (String driver : actualDriverList) {
            if(driver.toUpperCase().contains(keyword.toUpperCase())){
                check=false;
            }

        }

        Assert.assertTrue(check);
    }
    /*
     @And("user see that the results start with the specified {string}")
     public void userSeeThatTheResultsStartWithTheSpecified(String keyword) {
         List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
         boolean check=true;
         for (String driver : actualDriverList) {
             if(!driver.toUpperCase().startsWith(keyword.toUpperCase())){
                 check=false;
             }

         }
         Assert.assertTrue(check);

     }
 */
    @And("SAuser see that the results start with the specified {string}")
    public void sauserSeeThatTheResultsStartWithTheSpecified(String keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;
        for (String driver : actualDriverList) {
            if(!driver.toUpperCase().startsWith(keyword.toUpperCase())){
                check=false;
            }

        }
        Assert.assertTrue(check);

    }
    /*

        @And("user see that the results end with the specified {string}")
        public void userSeeThatTheResultsEndWithTheSpecified(String keyword) {
            List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
            boolean check=true;
            for (String driver : actualDriverList) {
                if(!driver.toUpperCase().endsWith(keyword.toUpperCase())){
                    check=false;
                }
                System.out.println(driver);
                System.out.println(keyword);

            }
            Assert.assertTrue(check);

        }
        */
    @And("SAuser see that the results end with the specified {string}")
    public void sauserSeeThatTheResultsEndWithTheSpecified(String  keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;
        for (String driver : actualDriverList) {
            if(!driver.toUpperCase().endsWith(keyword.toUpperCase())){
                check=false;
            }
            System.out.println(driver);
            System.out.println(keyword);

        }
        Assert.assertTrue(check);

    }
    /*
       @And("user see that the results match the specified {string}")
    public void userSeeThatTheResultsMatchTheSpecified(String keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;

            for (String driver : actualDriverList) {
                if(!driver.equalsIgnoreCase(keyword)){
                    check=false;
                }
                System.out.println(driver);
                System.out.println(keyword);

            }


        Assert.assertTrue(check);

    }
     */

    @And("SAuser see that the results match the specified {string}")
    public void sauserSeeThatTheResultsMatchTheSpecified(String keyword) {
        List<String>actualDriverList=driverFilterPage.getAllDriverInfo(driverFilterPage.driverPageNumber);
        boolean check=true;

        for (String driver : actualDriverList) {
            if(!driver.equalsIgnoreCase(keyword)){
                check=false;
            }
            System.out.println(driver);
            System.out.println(keyword);

        }


        Assert.assertTrue(check);
    }

  /*
      @And("the user clicks {string} method")
    public void theUserClicksMethod(String methodName) {
        driverFilterPage.selectMenuOption(methodName).click();

    }
   */


    @And("SAthe user clicks {string} method")
    public void satheUserClicksMethod(String methodName) {
        driverFilterPage.selectMenuOption(methodName).click();
    }

    /*
      @And("the user enter alphanumeric {string}")
    public void theUserEnterAlphanumeric(String keyword) {

        driverFilterPage.text.sendKeys(keyword);

    }
     */

    @And("SAthe user enter alphanumeric {string}")
    public void satheUserEnterAlphanumeric(String keyword) {
        driverFilterPage.text.sendKeys(keyword);
    }

    /*
     @And("user cannot enter alphanumeric numbers")
    public void userCannotEnterAlphanumericNumbers() {

       Assert.assertTrue( driverFilterPage.text.getAttribute("value").equals(""));

    }

     */

    @And("SAuser cannot enter alphanumeric numbers")
    public void sauserCannotEnterAlphanumericNumbers() {
        Assert.assertTrue( driverFilterPage.text.getAttribute("value").equals(""));
    }
}
