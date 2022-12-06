package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourComputerPage extends Utility {

    By buildYourComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorSize = By.id("product_attribute_1");
    By ramSize = By.id("product_attribute_2");
    By hddSize = By.id("product_attribute_3_7");
    By osSystem = By.id("product_attribute_4_9");
    By checkSoftware = By.xpath("//input[@id='product_attribute_5_12']");
    By priceValueText = By.id("price-value-1");
    By addToCartButton = By.xpath("//button[@type='button' and @onclick='return AjaxCart.addproducttocart_details" +
            "(\"/addproducttocart/details/1/1\",\"#product-details-form\"),!1']");
    By addedTOShoppingCartText = By.xpath("//div//p[contains(text(),'The product has been added to your ')]");
    By xButton = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");



    public String getBuildYourComputerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(buildYourComputerText);
    }

    public void selectProcessorSize() throws InterruptedException {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(processorSize, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRAMSize() throws InterruptedException {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(ramSize, "8GB [+$60.00]");
    }

    public void selectHDDSize() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(hddSize);
    }

    public void selectOSSystem() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(osSystem);
    }

    public void selectSoftware() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(checkSoftware);
    }

    public String getPriceValueText() throws InterruptedException {
        Thread.sleep(5000);
        return getTextFromElement(priceValueText);
    }

    public void selectAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getAddedTOShoppingCartText(){
        return getTextFromElement(addedTOShoppingCartText);
    }

    public void selectXButton() {
        clickOnElement(xButton);
    }

    public void selectShoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void selectGoToCart() {
        mouseHoverToElementAndClick(goToCart);
    }
}
