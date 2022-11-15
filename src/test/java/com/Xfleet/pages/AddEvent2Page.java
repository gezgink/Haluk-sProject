package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEvent2Page extends BasePage {


    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement neverRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement afterRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[5]")
    public WebElement byRadioButton;

    @FindBy(xpath = "//div[@class='message-item message']")
    public WebElement eventRow;

    @FindBy(id = "prependedInput")
    public WebElement logInBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement logInButton;

    @FindBy(xpath = "(//a[@class='unclickable'])[2]")
    public WebElement fleetButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehicleOption;

    @FindBy(xpath = "//span[@class='grid-header-cell__label']")
    public WebElement licencePlateOption;

    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement firstRow;

    @FindBy(xpath = "//a[@class='btn icons-holder-text no-hash']")
    public WebElement addEventButton;

    @FindBy(xpath = "//span[@class='ui-dialog-title']")
    public WebElement addEventTittle;

    @FindBy(xpath = "//span[@title='#51B749']")
    public WebElement greenColor;

    @FindBy(xpath = "//input[@data-name='field__all-day']")
    public WebElement allDayEventBox;

    @FindBy(xpath = "//input[@id='time_selector_oro_calendar_event_form_start-uid-636d56153bdcb']")
    public WebElement timeBox;

    @FindBy(xpath = "//select[@class=\"recurrence-repeats__select\"]")
    public WebElement repeatDropdown;

    @FindBy(xpath = "//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")
    public WebElement closeButton;

    @FindBy(xpath = "//input[@id='oro_calendar_event_form_title-uid-6371fb88b2031']")
    public WebElement titleBox;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;


    @FindBy(xpath = "//div[@class='accordion-heading clearfix']")
    public WebElement generalInfPageRow;
}


