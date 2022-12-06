package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {


    By creditButton = By.id("paymentmethod_1");
    By visaButton = By.id("paymentmethod_1");
    By continueButton = By.xpath("//button[@type='button' and @onclick='PaymentMethod.save()']");


    public void selectCreditCardOption() {
        clickOnElement(creditButton);
    }
    public void selectVisaCardOption() {
        clickOnElement(visaButton);
    }

    public void selectContinueButton() throws InterruptedException {
        clickOnElement(continueButton);
        Thread.sleep(1000);
    }
}
