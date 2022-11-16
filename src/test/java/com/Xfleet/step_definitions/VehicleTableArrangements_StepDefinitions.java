package com.Xfleet.step_definitions;

import com.Xfleet.pages.VehicleTableArrangementsPage;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VehicleTableArrangements_StepDefinitions {

    VehicleTableArrangementsPage table = new VehicleTableArrangementsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @And("User is navigated to the Fleet>Vehicles Page")
    public void userIsNavigatedToTheFleetVehiclesPage() throws InterruptedException {
        table.fleetBtn.click();
        //Thread.sleep(1000);
        table.vehiclesBtn.click();
        //Thread.sleep(20000);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[4]")));


    }

    @When("HTUser select the different numbers to be displayed {string}")
    public void htuserSelectTheDifferentNumbersToBeDisplayed(String arg0) throws InterruptedException {
        //Thread.sleep(5000);


        table.dropDownMenu.click();
        //Thread.sleep(1000);

        switch (arg0){

            case "10":
                table.dataSize10.click();
                break;
            case "25":
                table.dataSize25.click();
                break;
            case "50":
                table.dataSize50.click();
                break;
            case "100":
                table.dataSize100.click();
                break;
        }



    }



    @Then("HTNumber of rows should be same witch the selected number {string}")
    public void HTfltapNumberOfRowsShouldBeSameWitchTheSelectedNumber(String arg0) throws InterruptedException {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
        //Thread.sleep(7000);
        List<WebElement> actualList = Driver.getDriver().findElements(By.cssSelector("tr.grid-row"));

        int sizeOfactualList = actualList.size();
        System.out.println("sizeOfactualList = " + sizeOfactualList);
        System.out.println("arg0 = " + arg0);
        String a = sizeOfactualList+"";

        Assert.assertEquals(arg0,a);
    }

    @When("HTView per page number is twenty five by default")
    public void HTfltapViewPerPageNumberIsTwentyFiveByDefault() {

        String text = table.dropDownMenu.getText();
        System.out.println("text = " + text);
        Assert.assertEquals("25",text);


    }

    @When("HTUser is clicked the view per page button and select each {string}")
    public void htuserIsClickedTheViewPerPageButtonAndSelectEach(String arg0) {

        table.dropDownMenu.click();
        //Thread.sleep(1000);

        switch (arg0){

            case "10":
                table.dataSize10.click();
                break;
            case "25":
                table.dataSize25.click();
                break;
            case "50":
                table.dataSize50.click();
                break;
            case "100":
                table.dataSize100.click();
                break;
        }
    }

    @Then("HTUser Should see the values as {string}")
    public void htuserShouldSeeTheValuesAs(String arg0) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));

        String actualText = table.dropDownMenu.getText();
        System.out.println("actualText = " + actualText);
        Assert.assertEquals(arg0,actualText);

    }


    @When("HTuser is clicked the top of the column {string}")
    public void htuserIsClickedTheTopOfTheColumn(String arg0) {
        table.dropDownMenu.click();
        table.dataSize100.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));

        ArrayList<WebElement> listBeforeSort1 = new ArrayList<>();


        switch (arg0){

            case "license plate":
                listBeforeSort1.addAll(Arrays.asList(table.listOfLicensePlate));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listBeforeSort1.addAll(Arrays.asList(table.listOfLicensePlate));
                table.colmnLicensePlate.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                table.backBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                break;

            case "driver":
                listBeforeSort1.addAll(Arrays.asList(table.listOfDriver));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listBeforeSort1.addAll(Arrays.asList(table.listOfDriver));
                table.colmnLicensePlate.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                table.backBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                break;
            case "location":
                listBeforeSort1.addAll(Arrays.asList(table.listOfLocation));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listBeforeSort1.addAll(Arrays.asList(table.listOfLocation));
                table.colmnLicensePlate.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                table.backBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                break;
            case "model year":
                listBeforeSort1.addAll(Arrays.asList(table.listOfModelYear));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listBeforeSort1.addAll(Arrays.asList(table.listOfModelYear));
                table.colmnLicensePlate.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                table.backBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                break;
        }

        ArrayList<String> listStringBeforeSort = new ArrayList<>();

        for(WebElement p : listBeforeSort1){
            listStringBeforeSort.add(p.getText());
        }

        Collections.sort(listStringBeforeSort);
        //****************************************************AFTER CLICKING COLUMN NAME***********************************
        ArrayList<WebElement> listAfterSort = new ArrayList<>();

        switch (arg0) {

            case "license plate":
                listAfterSort.addAll(Arrays.asList(table.listOfLicensePlate));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listAfterSort.addAll(Arrays.asList(table.listOfLicensePlate));
                break;

            case "driver":
                listAfterSort.addAll(Arrays.asList(table.listOfDriver));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listAfterSort.addAll(Arrays.asList(table.listOfDriver));
                break;
            case "location":
                listAfterSort.addAll(Arrays.asList(table.listOfLocation));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listAfterSort.addAll(Arrays.asList(table.listOfLocation));
                break;
            case "model year":
                listAfterSort.addAll(Arrays.asList(table.listOfModelYear));
                table.nextBtn.click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
                listAfterSort.addAll(Arrays.asList(table.listOfModelYear));
                break;

        }
        ArrayList<String> listStringAfterSort = new ArrayList<>();

        for(WebElement q : listAfterSort){
            listStringAfterSort.add(q.getText());
        }

        Assert.assertEquals(listStringBeforeSort,listStringAfterSort);


    }

    @Then("HTThe list is sorted ascending order")
    public void HTfltapTheListIsSortedAscendingOrder() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));


    }

    @Then("HTThe list is sorted descending order")
    public void HTfltapTheListIsSortedDescendingOrder() {
    }

    @When("HTuser clicked the reset button")
    public void HTfltapUserClickedTheResetButton() {
        table.dropDownMenu.click();
        table.dataSize10.click();
        String text = table.dropDownMenu.getText();
        System.out.println("before clicking..... ");
        System.out.println("text = " + text);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='loader-mask shown'])[1]")));
    }

    @Then("HTAll filters must be reseted")
    public void HTfltapAllFiltersMustBeReseted() {
        table.resetBtn.click();
        String text = table.dropDownMenu.getText();
        System.out.println("after clicking reset button..... ");
        System.out.println("text = " + text);
        Assert.assertEquals("25",text);


    }


}
