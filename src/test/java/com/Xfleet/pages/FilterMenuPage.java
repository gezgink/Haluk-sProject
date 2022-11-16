package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterMenuPage extends BasePage {

    public FilterMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy(xpath = "(//input[@name='multiselect_0'])[2]")
    public WebElement tags;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchManage;

    @FindBy(xpath = "(//label/span)[2]")
    public WebElement typeTags;

    @FindBy(xpath = "(//input[@name='multiselect_0'])[3]")
    public WebElement driver;

    @FindBy(xpath = "(//input[@name='multiselect_0'])[4]")
    public WebElement location;

    @FindBy(xpath = "(//input[@name='multiselect_0'])[5]")
    public WebElement chassisNumber;

    @FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
    public WebElement resetIcon;


}
