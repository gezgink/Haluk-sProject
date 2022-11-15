package com.Xfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GridSettingPage extends BasePage{


    @FindBy(xpath = "(//div[@class ='grid-toolbar clearfix'])//div[3]//div[1]//div[1]//div[1]//a[1]")
    public WebElement gridIcon;

    @FindBy(xpath = "//div[@class='column-manager-title']")
    public WebElement gridSettingTitle;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement quickSearchBox;

    @FindBy(xpath = "(//table/tbody/tr/td)[1]")
    public WebElement IdName;

    @FindBy(xpath = "(//table/tbody/tr/td/input)[1]")
    public WebElement checkBox;

    @FindBy(xpath = "(//td[@class='sort-cell'])[2]")
    public WebElement drag;

    @FindBy(xpath = "(//td[@class='sort-cell'])[1]")
    public WebElement drop;

    @FindBy(xpath = "(//table/tbody/tr/td)[10]")
    public WebElement driver;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement driverOnPage;

    @FindBy(xpath = "(//table/tbody/tr/td)[4]")
    public WebElement columnName;


}
