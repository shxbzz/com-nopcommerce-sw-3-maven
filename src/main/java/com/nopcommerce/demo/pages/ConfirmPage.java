package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import javax.smartcardio.Card;

public class ConfirmPage extends Utility {


    By paymentMethod = By.xpath("//span[contains(text(),'Payment Method:')]");
    By creditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethod = By.xpath("//span[contains(text(),'Shipping Method:')]");
    By nextDayAir = By.xpath("//ul//li//span[contains(text(),'Next Day Air')]");
    By totalPriceText = By.xpath("//span//strong[contains(text(),'$2,950.00')]");
    By totalPriceText2 = By.xpath("//td[@class='subtotal']/span");
    By continueButton = By.xpath("//button[@type='button' and @onclick='ConfirmOrder.save()']");


    public String getPaymentMethod() {
        return getTextFromElement(paymentMethod);
    }

    public String getCreditCard() {
        return getTextFromElement(creditCard);
    }

    public String getShippingMethod() {
        return getTextFromElement(shippingMethod);
    }

    public String getNextDayAir() {
        return getTextFromElement(nextDayAir);
    }

    public String getTotalPriceText() {
        return getTextFromElement(totalPriceText);
    }

    public String getTotalPriceText2() {
        return getTextFromElement(totalPriceText2);
    }

    public void selectContinueButton() {
        clickOnElement(continueButton);
    }
}