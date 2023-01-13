package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import com.nttdata.page.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartSteps {

    private WebDriver driver;

    //constructor
    public CartSteps(WebDriver driver){
        this.driver = driver;
    }


    public String getNameItem(){
        return this.driver.findElement(CartPage.itemName).getText();
    }


}
