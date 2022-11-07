package com.Xfleet.pages;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='loader-mask']")
    public WebElement loaderMask;

    @FindBy(className = "oro-subtitle")
    public WebElement pageSubtitle;


    public void waitUntilVisibleWait(WebElement webElement) {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            wait.until(ExpectedConditions.invisibilityOf(webElement));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
