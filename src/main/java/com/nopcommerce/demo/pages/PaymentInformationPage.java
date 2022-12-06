package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility {


    By creditCardDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardholderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expireMonthField = By.id("ExpireMonth");
    By expireYearField = By.id("ExpireYear");
    By cardCodeField = By.xpath("//input[@id='CardCode']");
    By continueButton = By.xpath("//button[@type='button' and @onclick='PaymentInfo.save()']");


    public void selectCreditCardOption() throws InterruptedException {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(creditCardDropdown, "Master card");
    }

    public void enterCardholderName(String cardholderName) {
        sendTextToElement(cardholderNameField, cardholderName);
    }

    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    public void selectExpireMonthOption(String month) {
        selectByVisibleTextFromDropDown(expireMonthField, month);
    }

    public void selectExpireYearOption(String year) {
        selectByVisibleTextFromDropDown(expireYearField, year);
    }

    public void enterCardCode(String cardCode) {
        sendTextToElement(cardCodeField, cardCode);
    }

    public void selectContinueButton() {
        clickOnElement(continueButton);
    }
}