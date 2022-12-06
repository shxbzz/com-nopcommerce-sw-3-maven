package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterConfirmationPage extends Utility {


    By register = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");



    public String getRegisterConfirmationText(){
        return getTextFromElement(register);
    }

    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
}