package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CompletedPage extends Utility {


    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By successText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton = By.xpath("//button[@type='button' and @onclick='setLocation(\"/\")']");


    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getSuccessText() {
        return getTextFromElement(successText);
    }

    public void selectContinueButton() {
        clickOnElement(continueButton);
    }
}