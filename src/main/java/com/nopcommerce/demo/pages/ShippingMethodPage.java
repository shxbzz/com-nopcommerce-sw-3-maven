package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {


    By radioButton = By.id("shippingoption_1");
    By continueButton = By.xpath("//button[@type='button' and @onclick='ShippingMethod.save()']");



    public void selectNextDayAirOption(){
        clickOnElement(radioButton);
    }

    public void selectContinueButton(){
        clickOnElement(continueButton);
    }
}
