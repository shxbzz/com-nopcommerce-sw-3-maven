package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By computerMenu = By.linkText("Computers");
    By desktopMenu = By.xpath("//h2//a[@title='Show products in category Desktops']");
    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By electronicsMenu = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    By cellPhoneMenu = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");


    public void clickElectronicsMenu(){
        mouseHoverToElement(electronicsMenu);
    }

    public void clickCellPhoneMenu(){
        mouseHoverToElementAndClick(cellPhoneMenu);
    }

    public void clickLogOutButton(){
        clickOnElement(logOutButton);
    }

    public String getUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void clickComputerMenu(){
        clickOnElement(computerMenu);
    }

    public void clickDesktopMenu(){
        clickOnElement(desktopMenu);
    }

    public void selectMenu (String menu){
        if (menu == "Computers") {
            //Find computer tab and click
            clickOnElement(By.linkText("Computers"));
            //Get title
            String title = driver.getTitle();

        } else if (menu == "Electronics") {
            clickOnElement(By.linkText("Electronics"));
            //Get title
            String title = driver.getTitle();

        } else if (menu == "Apparel") {
            clickOnElement(By.linkText("Apparel"));
            //Get title
            String title = driver.getTitle();

        } else if (menu == "Digital downloads") {
            clickOnElement(By.linkText("Digital downloads"));
            //Get title
            String title = driver.getTitle();

        } else if (menu == "Books") {
            clickOnElement(By.linkText("Books"));
            //Get title
            String title = driver.getTitle();

        } else if (menu == "Jewelry") {
            clickOnElement(By.linkText("Jewelry"));
            //Get title
            String title = driver.getTitle();

        } else if (menu == "Gift Cards") {
            clickOnElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
            //Get title
            String title = driver.getTitle();

        } else {
            System.out.println("Please enter valid Top-menu name or check actual Top-menu name");
        }
    }
}
