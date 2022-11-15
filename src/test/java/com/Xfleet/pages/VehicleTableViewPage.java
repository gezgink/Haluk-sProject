package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleTableViewPage extends LoginPage {


    public VehicleTableViewPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement next;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement previous;

    @FindBy(xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement export;

    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement csvBtn;

    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement xlsBtn;

    @FindBy(xpath = "//label[@class='dib'][2]")
    public WebElement totalPageNum;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRecordings;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement validNumber;

    @FindBy(xpath = "//div[@class='oro-datagrid']")
    public WebElement validPage;

    @FindBy(xpath = "//span[.='License Plate']")
    public WebElement seePage;





}
