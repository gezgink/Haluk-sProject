package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterMenuPage extends BasePage {

    public FilterMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterIcon;

    @FindBy (xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy (xpath = "(//input[@name='multiselect_0'])[2]")
    public WebElement tags;

    @FindBy(xpath = "//h3")
    public WebElement loading;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchManage;

    @FindBy (xpath = "(//label/span)[2]")
    public WebElement typeTags;


}
