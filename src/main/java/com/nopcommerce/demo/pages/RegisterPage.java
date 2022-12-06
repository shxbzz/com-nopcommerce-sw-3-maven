package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {


    By register = By.xpath("//h1[contains(text(),'Register')]");
    By radioButton = By.xpath("//input[@id='gender-male']");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dayField = By.xpath("//select[@name='DateOfBirthDay']");
    By monthField = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearField = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");



    public String getRegisterText(){
        return getTextFromElement(register);
    }

    public void clickMaleRadioButton(){
        clickOnElement(radioButton);
    }

    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname){
        sendTextToElement(lastNameField, lastname);
    }

    public void enterDayField(String day){
        selectByVisibleTextFromDropDown(dayField, day);
    }

    public void enterMonthField(String month){
        selectByVisibleTextFromDropDown(monthField, month);
    }

    public void enterYearField(String year){
        selectByVisibleTextFromDropDown(yearField, year);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickRegisterButton(){
        clickOnElement(registerButton);
    }
}