package com.Xfleet.pages;

import com.Xfleet.step_definitions.DriverFilter_StepDefinitions;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;

public class DriverFilterPage extends BasePage {



    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterIcon;

    @FindBy(xpath = "//div[@class='filter-container']/button")
    public WebElement manageFilter;

    @FindBy(xpath="//label[@title='Driver']/input")
    public WebElement driverCheckBox;

    @FindBy(xpath ="//label[@title='Driver']/span" )
    public WebElement driverOption;

    @FindBy(xpath = "//div[@class='filter-item oro-drop']/div[1]")
    public WebElement driverFilter;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement methodDropdownMenu;

    @FindBy(xpath = "//a[@class='dropdown-item choice-value']")
    public List<WebElement> driverFilterMethod;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement text;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr/td[3]")
    public List<WebElement> driverName;


    @FindBy(xpath = "//div[@class='pagination pagination-centered']/label[2]")
    public WebElement driverPageNumber;

    @FindBy(xpath = "//span[.='No entities were found to match your search. Try modifying your search criteria...']")
    public WebElement noDataResult;

    public WebElement selectMenuOption(String methodName){
        WebElement menuWebElement= Driver.getDriver().findElement(By.xpath("//a[.='"+methodName+"']"));
        return menuWebElement;
    }

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement nextButton;




    public List<String> getAllDriverInfo(WebElement element) {

        List<String> allDriver=new ArrayList<>();
        char page=element.getAttribute("textContent").charAt(3);
        int pageNumber=Character.getNumericValue(page);
        // System.out.println(pageNumber);


        for(int i=0; i<pageNumber; i++) {
            BrowserUtils.waitFor(4);
            List<String> driverList = BrowserUtils.getElementsText(driverName);
            BrowserUtils.waitFor(2);
            for (String each : driverList) {
                if(each!=null)
                    allDriver.add(each);
            }
            BrowserUtils.waitFor(2);
            nextButton.click();

        }

        return allDriver;

    }

    /*
    public List<String> getActualInfo() {

        List<String> actualDriver=new ArrayList<>();
        char page=driverPageNumber.getAttribute("textContent").charAt(3);
        int pageNumber=Character.getNumericValue(page);
        System.out.println(pageNumber);

        for(int i=0; i<pageNumber; i++) {
            BrowserUtils.waitFor(3);
            List<String> driverList = BrowserUtils.getElementsText(driverName);
            for (String each : driverList) {
                if(each!=null)
                    actualDriver.add(each);
            }
            BrowserUtils.waitFor(2);
            nextButton.click();

        }
        //  System.out.println(allDriver);
        // System.out.println(allDriver.size());
        return actualDriver;

    }



    */



}

