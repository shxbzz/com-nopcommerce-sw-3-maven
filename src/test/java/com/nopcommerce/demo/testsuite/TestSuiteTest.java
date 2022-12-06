package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuiteTest extends TestBase {

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


    @Test
    public void sortInDescendingOrder() {
        homePage.clickComputerMenu();
        homePage.clickDesktopMenu();
        desktopPage.selectZtoA();
        String expectedMessage = "Name: Z to A";
        String actualMessage = desktopPage.getZtoAText();
        Assert.assertEquals(expectedMessage, actualMessage, "Dropdown Text does not match expected");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickComputerMenu();
        homePage.clickDesktopMenu();
        desktopPage.selectAtoZ();
        waitUntilVisibilityOfElementLocated(By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog" +
                "(\"/addproducttocart/catalog/1/1/1\"),!1']"),5);
        desktopPage.selectBuildYourComputer();
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourComputerPage.getBuildYourComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text does not match expected");
        buildYourComputerPage.selectProcessorSize();
        buildYourComputerPage.selectRAMSize();
        buildYourComputerPage.selectHDDSize();
        buildYourComputerPage.selectOSSystem();
        buildYourComputerPage.selectSoftware();
        String expectedMessage1 = "$1,475.00";
        String actualMessage1 = buildYourComputerPage.getPriceValueText();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Text does not match expected");
        buildYourComputerPage.selectAddToCartButton();
        String expectedMessage2 = "The product has been added to your shopping cart";
        String actualMessage2 = buildYourComputerPage.getAddedTOShoppingCartText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Text does not match expected");
        buildYourComputerPage.selectXButton();
        buildYourComputerPage.selectShoppingCart();
        waitUntilVisibilityOfElementLocated(By.xpath("//button[contains(text(),'Go to cart')]"),5);
        buildYourComputerPage.selectGoToCart();
        String expectedMessage3 = "Shopping cart";
        String actualMessage3 = cartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Text does not match expected");
        cartPage.setQuantityChange();
        cartPage.selectUpdateCart();
        String expectedMessage4 = "$2,950.00";
        String actualMessage4 = cartPage.getNewTotalPrice();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Price does not match expected");
        cartPage.selectTermsOfService();
        cartPage.selectCheckoutButton();
        String expectedMessage5 = "Welcome, Please Sign In!";
        String actualMessage5 = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage5, actualMessage5, "Text does not match expected");
        loginPage.selectCheckoutAsGuest();
        checkoutPage.enterFirstName("Shubh");
        checkoutPage.enterLastName("Bum");
        checkoutPage.enterEmail("shubhbum@gmail.com");
        checkoutPage.enterCountry("United Kingdom");
        checkoutPage.enterState("Other");
        checkoutPage.enterCity("London");
        checkoutPage.enterAddress("10 Downing St");
        checkoutPage.enterPostcode("OV16 5TX");
        checkoutPage.enterPhoneNo("01753 448792");
        checkoutPage.clickContinueButton();
        shippingMethodPage.selectNextDayAirOption();
        shippingMethodPage.selectContinueButton();
        paymentMethodPage.selectCreditCardOption();
        paymentMethodPage.selectContinueButton();
        paymentInformationPage.selectCreditCardOption();
        paymentInformationPage.enterCardholderName("MR S B BUM");
        paymentInformationPage.enterCardNumber("0759 2136 2156 5987");
        paymentInformationPage.selectExpireMonthOption("04");
        paymentInformationPage.selectExpireYearOption("2026");
        paymentInformationPage.enterCardCode("859");
        paymentInformationPage.selectContinueButton();
        String expectedMessage6 = "Payment Method:";
        String actualMessage6 = confirmPage.getPaymentMethod();
        Assert.assertEquals(expectedMessage6, actualMessage6, "Text does not match expected");
        String expectedMessage7 = "Credit Card";
        String actualMessage7 = confirmPage.getCreditCard();
        Assert.assertEquals(expectedMessage7, actualMessage7, "Text does not match expected");
        String expectedMessage8 = "Shipping Method:";
        String actualMessage8 = confirmPage.getShippingMethod();
        Assert.assertEquals(expectedMessage8, actualMessage8, "Text does not match expected");
        String expectedMessage9 = "Next Day Air";
        String actualMessage9 = confirmPage.getNextDayAir();
        Assert.assertEquals(expectedMessage9, actualMessage9, "Text does not match expected");
        String expectedMessage10 = "$2,950.00";
        String actualMessage10 = confirmPage.getTotalPriceText();
        Assert.assertEquals(expectedMessage10, actualMessage10, "Price does not match expected");
        confirmPage.selectContinueButton();
        String expectedMessage11 = "Thank you";
        String actualMessage11 = completedPage.getThankYouText();
        Assert.assertEquals(expectedMessage11, actualMessage11, "Text does not match expected");
        String expectedMessage12 = "Your order has been successfully processed!";
        String actualMessage12 = completedPage.getSuccessText();
        Assert.assertEquals(expectedMessage12, actualMessage12, "Text does not match expected");
        completedPage.selectContinueButton();
        String expectedMessage13 = "Welcome to our store";
        String actualMessage13 = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage13, actualMessage13, "Text does not match expected");
    }
}
