package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleGeneralInfornationPage extends LoginPage {
    public VehicleGeneralInfornationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//table/tbody/tr/td[20]")
    public WebElement threeDot;

    @FindBy(xpath = "//a[@title='View']")
    public WebElement eye;

    @FindBy(xpath = "//table/tbody/tr[1]")
    public WebElement row;

    @FindBy(xpath = "//span[text()='General Information']")
    public WebElement infoTitle;
    @FindBy(xpath="//a[contains(text(),'Delete')]")
    public WebElement deleteButton;
    @FindBy(xpath="//a[contains(text(),'Edit')]")
    public WebElement editButton;
    @FindBy(xpath="//a[contains(text(),'Add Event')]")
    public WebElement addEventButton;

    public boolean elementVisible(WebElement element){
     try {
         return element.isDisplayed();
     }catch (Exception e){
         return false;
     }

    }
}
