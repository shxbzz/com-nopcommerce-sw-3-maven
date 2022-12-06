package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {


    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By stateField = By.id("BillingNewAddress_StateProvinceId");
    By cityField = By.id("BillingNewAddress_City");
    By addressField = By.id("BillingNewAddress_Address1");
    By postcodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNoField = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@type='button' and @onclick='Billing.save()']");



    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname){
        sendTextToElement(lastNameField, lastname);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }

    public void enterCountry(String country){
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void enterState(String state){
        selectByVisibleTextFromDropDown(stateField, state);
    }

    public void enterCity(String city){
        sendTextToElement(cityField, city);
    }

    public void enterAddress(String address){
        sendTextToElement(addressField, address);
    }

    public void enterPostcode(String postcode){
        sendTextToElement(postcodeField, postcode);
    }

    public void enterPhoneNo(String phoneNo){
        sendTextToElement(phoneNoField, phoneNo);
    }

    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
}
