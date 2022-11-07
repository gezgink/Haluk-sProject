package com.Xfleet.pages;

import com.Xfleet.utilities.ConfigurafionReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="prependedInput")
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement loginBtn;


    public void loginUserType(String user){

        String userName="";
        String passWord="";

        switch (user){
            case "Driver":
                userName= ConfigurafionReader.getProperty("driver_username");
                passWord=ConfigurafionReader.getProperty("driver_password");
                break;

            case "Sales Manager":
                userName=ConfigurafionReader.getProperty("sales_manager_username");;
                passWord=ConfigurafionReader.getProperty("sales_manager_password");
                break;

            case "Store Manager":
                userName=ConfigurafionReader.getProperty("store_manager_username");
                passWord=ConfigurafionReader.getProperty("store_manager_password");
                break;
        }

        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginBtn.click();
    }


}
