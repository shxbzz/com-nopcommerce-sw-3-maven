package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage extends Utility {


    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityChange = (By.xpath("//input[@type='text' and @value='1']"));
    By updateCart = By.id("updatecart");
    By newTotalPrice = By.xpath("//span//strong[contains(text(),'$2,950.00')]");
    By termsOfService = By.id("termsofservice");
    By checkoutButton = By.id("checkout");
    By checkQuantity = By.xpath("//input[@class=\"qty-input\"]");
    By nokiaTotalPrice = By.xpath("//span//strong[contains(text(),'$698.00')]");


    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

    public void setQuantityChange(){
        Actions actions = new Actions(driver);
        driver.findElement(quantityChange).sendKeys(Keys.CONTROL + "a");
        driver.findElement(quantityChange).sendKeys("2");
    }

    public void selectUpdateCart(){
        clickOnElement(updateCart);
    }

    public String getNewTotalPrice() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(newTotalPrice);
    }

    public void selectTermsOfService(){
        clickOnElement(termsOfService);
    }

    public void selectCheckoutButton(){
        clickOnElement(checkoutButton);
    }

    public String setCheckQuantity(){
        WebElement xyz = driver.findElement(checkQuantity);
        String qty = xyz.getAttribute("value");
        return qty;
    }

    public String getNokiaTotalPrice() {
        return getTextFromElement(nokiaTotalPrice);
    }
}
