package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By clickOnProduct = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]" +
            "/div[3]/div[1]/div[2]/h2[1]/a[1]");



    public String getCellPhoneText(){
        return getTextFromElement(cellPhoneText);
    }

    public void clickListViewTab(){
        clickOnElement(listViewTab);
    }

    public void clickOnProductOption() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(clickOnProduct);
    }

}
