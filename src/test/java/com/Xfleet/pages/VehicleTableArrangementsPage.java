package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleTableArrangementsPage {
    //this is created by @HT vehicle table arrangement user story page

    public VehicleTableArrangementsPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesBtn;

    @FindBy(css = "label.control-label")
    public WebElement viewPerPagaText;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//a[@data-size='10']")
    public WebElement dataSize10;

    @FindBy(xpath = "//a[@data-size='25']")
    public WebElement dataSize25;

    @FindBy(xpath = "//a[@data-size='50']")
    public WebElement dataSize50;


    @FindBy(xpath = "//a[@data-size='100']")
    public WebElement dataSize100;

    //for asserting the number of elements in the list, this locator must be used.
    @FindBy(xpath = "//tr[@class='grid-row']")
    public WebElement listSize;

    //--------------------------------------------------------------------
    @FindBy(xpath = "//span[.='License Plate']")
    public WebElement colmnLicensePlate;
    @FindBy(xpath = "//td[@data-column-label='License Plate']")
    public WebElement listOfLicensePlate;

    //--------------------------------------------------------------------

    @FindBy(xpath = "//span[.='Tags']")
    public WebElement colmnTags;
    @FindBy(xpath = "//td[@data-column-label='Tags']")
    public WebElement listOfTags;
    //--------------------------------------------------------------------

    @FindBy(xpath = "//span[.='Driver']")
    public WebElement colmnDriver;
    @FindBy(xpath = "//td[@data-column-label='Driver']")
    public WebElement listOfDriver;

    //--------------------------------------------------------------------

    @FindBy(xpath = "//span[.='Location']")
    public WebElement colmnLocation;
    @FindBy(xpath = "//td[@data-column-label='Location']")
    public WebElement listOfLocation;

    //--------------------------------------------------------------------

    @FindBy(xpath = "//span[.='Model Year']")
    public WebElement colmnModelYear;
    @FindBy(xpath = "//td[@data-column-label='Model Year']")
    public WebElement listOfModelYear;

    //--------------------------------------------------------------------

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "(//div[@class='loader-mask shown'])[4]")
    public WebElement loadermsk;

    @FindBy(css = "i[class='fa-chevron-right hide-text']")
    public WebElement nextBtn;

    @FindBy(css = "a[data-grid-pagination-direction='prev']")
    public WebElement backBtn;



}
