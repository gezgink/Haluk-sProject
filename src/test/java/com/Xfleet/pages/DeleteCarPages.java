package com.Xfleet.pages;
import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeleteCarPages {

    public DeleteCarPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeLink;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotYourPasswordLink;

    @FindBy( id="_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]")
    public WebElement fleetButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleetButtonDriver;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesButton;

    @FindBy(xpath = "(//div[contains(@class,'more-bar-holder')]/parent::*)")
    public List<WebElement> threeDotsRow;

    @FindBy(xpath = "//tbody[@class='grid-body']//tr[2]//td[21]")
    public WebElement threeDotsRow1;

    @FindBy(xpath = "//a[@title='Delete']")
    public List<WebElement> deleteThreeDotsRow;

    @FindBy(xpath = "//h3[.='Delete Confirmation']")
    public WebElement deleteConfirmationPopUpText;

    @FindBy(xpath = "//a[.='Yes, Delete']")
    public WebElement deleteConfirmationYesDelete;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement driverNotPermissionMessage;

    @FindBy(xpath = "//div[.='Item deleted']")
    public WebElement ItemDeletedMessage;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> anyCarInList;

    @FindBy(xpath = "//a[@title='Delete Car']")
    public WebElement generalInfoDeleteBtn;

    @FindBy(xpath = "//div[.='Car deleted']")
    public WebElement carDeletedMessage;

    @FindBy(xpath = "(//div[@class='control-label'])[1]")
    public List<WebElement> licensePlateSelected;

    @FindBy(xpath = "//td[@data-column-label='License Plate']")
    public List<WebElement> allLicensePlate;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement addEventClose;







}
