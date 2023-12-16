package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item_label']/a/div")
    List<WebElement> productNamesList;

    public void printProductNames(){
        for (WebElement e : productNamesList){
            System.out.println(getTextFromElement(e));
        }
    }
}
