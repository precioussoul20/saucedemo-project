package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
        productPage = new ProductPage();
    }

    @Test(groups = "sanity")
    public void printAllProductName(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        productPage.printProductNames();



}

}
