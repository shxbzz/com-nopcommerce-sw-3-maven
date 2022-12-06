package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmPage confirmPage = new ConfirmPage();
    CompletedPage completedPage = new CompletedPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    RegisterPage registerPage = new RegisterPage();
    RegisterConfirmationPage registerConfirmationPage = new RegisterConfirmationPage();


    @Test
    public void textVerified() {
        homePage.clickElectronicsMenu();
        homePage.clickCellPhoneMenu();
        String expectedMessage = "Cell phones";
        String actualMessage = electronicsPage.getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage, "Title text does not match expected");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickElectronicsMenu();
        homePage.clickCellPhoneMenu();
        String expectedMessage = "Cell phones";
        String actualMessage = electronicsPage.getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage, "Title text does not match expected");
        electronicsPage.clickListViewTab();
        electronicsPage.clickOnProductOption();
        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = nokiaLumia1020Page.getNokiaLumia1020Text();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Text does not match expected");
        String expectedMessage2 = "$349.00";
        String actualMessage2 = nokiaLumia1020Page.getPriceText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Price does not match expected");
        nokiaLumia1020Page.setQuantityChange();
        nokiaLumia1020Page.clickAddToCart();
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = nokiaLumia1020Page.getAddedToCartText();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Text does not match expected");
        nokiaLumia1020Page.clickXButton();
        nokiaLumia1020Page.selectShoppingCart();
        nokiaLumia1020Page.selectGoToCart();
        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = cartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Text does not match expected");
        String expectedMessage5 = "2";
        String actualMessage5 = cartPage.setCheckQuantity();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Quantity does not match expected");
        String expectedMessage6 = "$698.00";
        String actualMessage6 = cartPage.getNokiaTotalPrice();
        Assert.assertEquals(expectedMessage6, actualMessage6, "Price does not match expected");
        cartPage.selectTermsOfService();
        cartPage.selectCheckoutButton();
        String expectedMessage7 = "Welcome, Please Sign In!";
        String actualMessage7 = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage7, actualMessage7, "Text does not match expected");
        loginPage.selectRegister();
        String expectedMessage8 = "Register";
        String actualMessage8 = registerPage.getRegisterText();
        Assert.assertEquals(expectedMessage8, actualMessage8, "Text does not match expected");
        registerPage.clickMaleRadioButton();
        registerPage.enterFirstName("Shubh");
        registerPage.enterLastName("Bum");
        registerPage.enterDayField("12");
        registerPage.enterMonthField("September");
        registerPage.enterYearField("1996");
        registerPage.enterEmail("shubhbum@gmail.com");
        registerPage.enterPassword("12345678");
        registerPage.enterConfirmPassword("12345678");
        registerPage.clickRegisterButton();
        String expectedMessage9 = "Your registration completed";
        String actualMessage9 = registerConfirmationPage.getRegisterConfirmationText();
        Assert.assertEquals(expectedMessage9, actualMessage9, "Text does not match expected");
        registerConfirmationPage.clickContinueButton();
        String expectedMessage10 = "Shopping cart";
        String actualMessage10 = cartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage10, actualMessage10, "Text does not match expected");
        cartPage.selectTermsOfService();
        cartPage.selectCheckoutButton();
        checkoutPage.enterFirstName("Shubh");
        checkoutPage.enterLastName("Bum");
        checkoutPage.enterCountry("United Kingdom");
        checkoutPage.enterState("Other");
        checkoutPage.enterCity("London");
        checkoutPage.enterAddress("10 Downing St");
        checkoutPage.enterPostcode("OV16 5TX");
        checkoutPage.enterPhoneNo("01753 448798");
        checkoutPage.clickContinueButton();
        shippingMethodPage.selectNextDayAirOption();
        shippingMethodPage.selectContinueButton();
        paymentMethodPage.selectVisaCardOption();
        paymentMethodPage.selectContinueButton();
        paymentInformationPage.selectCreditCardOption();
        paymentInformationPage.enterCardholderName("MR S B BUM");
        paymentInformationPage.enterCardNumber("5232 1478 4876 3353");
        paymentInformationPage.selectExpireMonthOption("02");
        paymentInformationPage.selectExpireYearOption("2024");
        paymentInformationPage.enterCardCode("000");
        paymentInformationPage.selectContinueButton();
        String expectedMessage11 = "Payment Method:";
        String actualMessage11 = confirmPage.getPaymentMethod();
        Assert.assertEquals(expectedMessage11, actualMessage11, "Text does not match expected");
        String expectedMessage12 = "Credit Card";
        String actualMessage12 = confirmPage.getCreditCard();
        Assert.assertEquals(expectedMessage12, actualMessage12, "Text does not match expected");
        String expectedMessage13 = "Shipping Method:";
        String actualMessage13 = confirmPage.getShippingMethod();
        Assert.assertEquals(expectedMessage13, actualMessage13, "Text does not match expected");
        String expectedMessage14 = "Next Day Air";
        String actualMessage14 = confirmPage.getNextDayAir();
        Assert.assertEquals(expectedMessage14, actualMessage14, "Text does not match expected");
        String expectedMessage15 = "$698.00";
        String actualMessage15 = confirmPage.getTotalPriceText2();
        Assert.assertEquals(expectedMessage15, actualMessage15, "Price does not match expected");
        confirmPage.selectContinueButton();
        String expectedMessage16 = "Thank you";
        String actualMessage16 = completedPage.getThankYouText();
        Assert.assertEquals(expectedMessage16, actualMessage16, "Text does not match expected");
        String expectedMessage17 = "Your order has been successfully processed!";
        String actualMessage17 = completedPage.getSuccessText();
        Assert.assertEquals(expectedMessage17, actualMessage17, "Text does not match expected");
        completedPage.selectContinueButton();
        String expectedMessage18 = "Welcome to our store";
        String actualMessage18 = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage18, actualMessage18, "Text does not match expected");
        homePage.clickLogOutButton();
        String expectedMessage19 = "https://demo.nopcommerce.com/";
        String actualMessage19 = homePage.getUrl();
        Assert.assertEquals(expectedMessage19, actualMessage19, "URL does not match expected");

    }
}
