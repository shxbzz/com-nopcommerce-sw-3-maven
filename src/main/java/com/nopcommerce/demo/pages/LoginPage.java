package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By register = By.xpath("//button[@onclick='location.href=\"https://demo.nopcommerce.com/register?returnUrl=%2Fcart\"']");



    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void selectCheckoutAsGuest(){
        clickOnElement(checkoutAsGuest);
    }

    public void selectRegister(){
        clickOnElement(register);
    }
}
