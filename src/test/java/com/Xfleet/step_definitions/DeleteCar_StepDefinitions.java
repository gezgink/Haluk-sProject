package com.Xfleet.step_definitions;
import com.Xfleet.pages.DeleteCarPages;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteCar_StepDefinitions {

    DeleteCarPages deleteCarPages = new DeleteCarPages();


    @Given("Ofk Driver user log in to the web application with a valid {string} and {string}")
    public void ofk_driver_user_log_in_to_the_web_application_with_a_valid_and(String username, String password) {

        Driver.getDriver().get("http://qa.xfleetsolutions.com/");

        deleteCarPages.usernameInput.sendKeys(username);
        deleteCarPages.passwordInput.sendKeys(password);
        deleteCarPages.loginButton.click();

        BrowserUtils.sleep(10);

    }

    @When("Ofk Driver user can see the fleet module and click vehicles")
    public void ofk_driver_user_can_see_the_fleet_module_and_click_vehicles() {

        deleteCarPages.fleetButtonDriver.click();
        BrowserUtils.sleep(2);
        deleteCarPages.vehiclesButton.click();

        BrowserUtils.sleep(10);

    }

    @When("Ofk Driver user can see the three dots at the end of each row")
    public void ofk_driver_user_can_see_the_three_dots_at_the_end_of_each_row() {



        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement elementToScroll = Driver.getDriver().findElement(By.cssSelector(".grid-scrollable-container"));

        js.executeScript("arguments[0].scrollBy(arguments[1], 0)",elementToScroll, 800);


        BrowserUtils.sleep(3);







    }

    @Then("Ofk Driver user can see the delete button by hovering over the three dots at the end of each row")
    public void ofk_driver_user_can_see_the_delete_button_by_hovering_over_the_three_dots_at_the_end_of_each_row() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteCarPages.threeDotsRow.get(1)).perform();
        System.out.println("Driver user see the delete button");
        BrowserUtils.sleep(2);




    }








    @Given("Ofk Manager {string} log in to the web application with a valid {string} and {string}")
    public void ofk_manager_log_in_to_the_web_application_with_a_valid_and(String string, String username, String password) {

        Driver.getDriver().get("http://qa.xfleetsolutions.com/");

        deleteCarPages.usernameInput.sendKeys(username);
        deleteCarPages.passwordInput.sendKeys(password);
        deleteCarPages.loginButton.click();

        BrowserUtils.sleep(15);

//        if (loginMainPage.addEventClose.isDisplayed()){
//            loginMainPage.addEventClose.click();
//        }


    }

    @When("Ofk Manager users can see the fleet module and click vehicles")
    public void ofkManagerUsersCanSeeTheFleetModuleAndClickVehicles() {


        deleteCarPages.fleetButton.click();
        BrowserUtils.sleep(2);
        deleteCarPages.vehiclesButton.click();




        BrowserUtils.sleep(15);
    }


    @When("Ofk Manager users can see the three dots at the end of each row")
    public void ofk_manager_users_can_see_the_three_dots_at_the_end_of_each_row() {


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement elementToScroll = Driver.getDriver().findElement(By.cssSelector(".grid-scrollable-container"));

        js.executeScript("arguments[0].scrollBy(arguments[1], 0)",elementToScroll, 800);


        BrowserUtils.sleep(3);






        //BrowserUtils.sleep(20);


    }



    @Then("Ofk Manager users can see the delete button by hovering over the three dots at the end of each row")
    public void ofk_manager_users_can_see_the_delete_button_by_hovering_over_the_three_dots_at_the_end_of_each_row() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteCarPages.threeDotsRow.get(1)).perform();
        System.out.println("Manager users see the delete button");
        BrowserUtils.sleep(2);

    }





    @When("Ofk Driver user can see to click the three dots at the end of each row")
    public void ofkDriverUserCanSeeToClickTheThreeDotsAtTheEndOfEachRow() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement elementToScroll = Driver.getDriver().findElement(By.cssSelector(".grid-scrollable-container"));

        js.executeScript("arguments[0].scrollBy(arguments[1], 0)",elementToScroll, 800);


        BrowserUtils.sleep(3);



        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteCarPages.threeDotsRow.get(1)).perform();
//        actions.moveToElement(loginMainPage.threeDotsRow1).build().perform();

        WebElement deleteButton = null;
        for (WebElement each : deleteCarPages.deleteThreeDotsRow){
            if (each.isDisplayed()){
                deleteButton = each;
                break;
            }
        }
        actions.moveToElement(deleteButton).click().perform();


//        actions.moveToElement(loginMainPage.deleteThreeDotsRow).click().perform();

//        Select dropDownThreeDots = new Select(loginMainPage.threeDotsRow);
//        dropDownThreeDots.selectByIndex(3);
//
//        dropDownThreeDots.selectByIndex(3);
//        BrowserUtils.sleep(2);
//        loginMainPage.threeDotsRow.click();
//        loginMainPage.deleteThreeDotsRow.click();

    }

    @Then("Ofk Driver user can see Delete Confirmation pop up should be displayed")
    public void ofkDriverUserCanSeeDeleteConfirmationPopUpShouldBeDisplayed() {

        String expectedDeleteConfirmation = "Delete Confirmation";
        String actualDeleteConfirmation = deleteCarPages.deleteConfirmationPopUpText.getText();

        Assert.assertEquals(expectedDeleteConfirmation,actualDeleteConfirmation);


    }





    @When("Ofk Manager users can see to click the three dots at the end of each row")
    public void ofkManagerUsersCanSeeToClickTheThreeDotsAtTheEndOfEachRow() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement elementToScroll = Driver.getDriver().findElement(By.cssSelector(".grid-scrollable-container"));

        js.executeScript("arguments[0].scrollBy(arguments[1], 0)",elementToScroll, 800);


        BrowserUtils.sleep(3);



        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteCarPages.threeDotsRow.get(1)).perform();
//        actions.moveToElement(loginMainPage.threeDotsRow1).build().perform();

        WebElement deleteButton = null;
        for (WebElement each : deleteCarPages.deleteThreeDotsRow){
            if (each.isDisplayed()){
                deleteButton = each;
                break;
            }
        }
        actions.moveToElement(deleteButton).click().perform();



    }

    @Then("Ofk Manager users can see Delete Confirmation pop up should be displayed")
    public void ofkManagerUsersCanSeeDeleteConfirmationPopUpShouldBeDisplayed() {

        String expectedDeleteConfirmation = "Delete Confirmation";
        String actualDeleteConfirmation = deleteCarPages.deleteConfirmationPopUpText.getText();

        Assert.assertEquals(expectedDeleteConfirmation,actualDeleteConfirmation);


    }







    @Then("Ofk Driver user can see Delete Confirmation pop up should be displayed and click the Yes,Delete button")
    public void ofkDriverUserCanSeeDeleteConfirmationPopUpShouldBeDisplayedAndClickTheYesDeleteButton() {

        BrowserUtils.sleep(2);
        deleteCarPages.deleteConfirmationYesDelete.click();


    }

    @And("Ofk You do not have permission to perform this action message should be displayed")
    public void ofkYouDoNotHavePermissionToPerformThisActionMessageShouldBeDisplayed() {

        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = deleteCarPages.driverNotPermissionMessage.getText();
        System.out.println("When driver user tried to delete any car, \"You do not have permission to perform this action.\" message appeared");

        Assert.assertEquals(expectedMessage,actualMessage);



    }








    @Then("Ofk Manager users can see Delete Confirmation pop up should be displayed and click Yes,Delete button")
    public void ofkManagerUsersCanSeeDeleteConfirmationPopUpShouldBeDisplayedAndClickYesDeleteButton() {

        BrowserUtils.sleep(2);
        deleteCarPages.deleteConfirmationYesDelete.click();

    }

    @And("Ofk Item deleted message should be displayed.")
    public void ofkItemDeletedMessageShouldBeDisplayed() {

        String expectedMessageDeleted = "Item deleted";
        String actualMessageDeleted = deleteCarPages.ItemDeletedMessage.getText();
        System.out.println("When manager users tried to delete any car, \"Item deleted\" message appeared");

        Assert.assertEquals(expectedMessageDeleted,actualMessageDeleted);

    }








    @Then("Ofk Manager users can click on any car")
    public void ofkManagerUsersCanClickOnAnyCar() {

        String selectedCar = deleteCarPages.anyCarInList.get(5).getText();
        deleteCarPages.anyCarInList.get(5).click();

    }


    @Then("Ofk General Information page opens and managers can click the delete button from here.")
    public void ofkGeneralInformationPageOpensAndManagersCanClickTheDeleteButtonFromHere() {


        BrowserUtils.sleep(9);
        deleteCarPages.generalInfoDeleteBtn.click();
        System.out.println("Manager user is on the General Information Page and can click Delete Button");
        BrowserUtils.sleep(2);


    }

    @And("Ofk Car deleted message should be displayed.")
    public void ofkCarDeletedMessageShouldBeDisplayed() {

        deleteCarPages.deleteConfirmationYesDelete.click();
        BrowserUtils.sleep(5);
        String expectedMessageCarDeleted = "Car deleted";
        String actualMessageCarDeleted = deleteCarPages.carDeletedMessage.getText();
        System.out.println("When manager users tried to delete any car on the General Information Page," +
                                    " \"Car deleted\" message appeared");

        Assert.assertEquals(expectedMessageCarDeleted,actualMessageCarDeleted);


    }




    @And("Ofk The deleted car should not appear in the car list.")
    public void ofkTheDeletedCarShouldNotAppearInTheCarList() {

        BrowserUtils.sleep(2);

        for (WebElement each : deleteCarPages.allLicensePlate) {

            if ( deleteCarPages.anyCarInList.equals(each.getText())){
                System.out.println("The selected and deleted vehicle is currently in the all car list.");
            }else {
                System.out.println("The selected and deleted vehicle is not currently in the all car list.");
            }

        }
        BrowserUtils.sleep(2);

//
//        String selectedNewCar = loginMainPage.licensePlateSelected.get(5).getText();
//
//        if ( ! (selectedCar.equals(selectedNewCar))){
//            System.out.println("The selected and deleted vehicle is not currently in the car list.");
//        }

    }



}
