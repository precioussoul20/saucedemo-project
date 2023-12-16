package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement username;
    @CacheLookup
    @FindBy(id = "password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void enterUserName(String username){
        sendTextToElement(this.username, username);
    }
    public void enterPassword(String password){
        sendTextToElement(this.password, password);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }

}

