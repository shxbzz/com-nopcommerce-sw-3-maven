package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class NokiaLumia1020Page extends Utility {

    By nokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By price = By.xpath("//span[@id='price-value-20']");
    By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By addedToCart = By.xpath("//div[@id='bar-notification']/div/p");
    By xButton = By.cssSelector("span.close");
    By shoppingCart = By.xpath("//li[@id='topcartlink']/a/span[1]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");



    public String getNokiaLumia1020Text(){
        return getTextFromElement(nokiaLumia1020);
    }

    public String getPriceText(){
        return getTextFromElement(price);
    }

    public void setQuantityChange(){
        Actions actions = new Actions(driver);
        driver.findElement(quantity).sendKeys(Keys.CONTROL + "a");
        driver.findElement(quantity).sendKeys("2");
    }

    public void clickAddToCart(){
        clickOnElement(addToCart);
    }

    public String getAddedToCartText(){
        return getTextFromElement(addedToCart);
    }

    public void clickXButton(){
        clickOnElement(xButton);
    }

    public void selectShoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void selectGoToCart() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(goToCart);
    }
}
