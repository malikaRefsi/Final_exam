package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(ItemPage.class.getName());

    public ItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")
    WebElement cellPhonesLnk;
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement electroncisDisplay;
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[3]/div/div[1]")
    WebElement cellphonesDisplay;

    public boolean checkIfCellphonesIsDisplayed(){
        return cellphonesDisplay.isDisplayed();}
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")
    WebElement nokia;
    public void clickOnNokiaPhone(){
        clickOn(nokia);
    }
    @FindBy(xpath= "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")
    WebElement addtolist;
    public void setAddtolist(){
        clickOn(addtolist);
    }
    @FindBy(xpath= "//*[@id=\"add-to-wishlist-button-20\"] ")
    WebElement addtowish;
    public void  setAddToWish(){
        clickOn(addtowish);
    }

    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div/div[3]/div/div[1]/div/div/a/img" )
    WebElement electronicsLnk;

    public void setElectronicsLnk(){
        clickOn(electronicsLnk);}
    public boolean checkIfElectronicsIsDisplayed(){
        return electroncisDisplay.isDisplayed();
    }
    public void setCellPhonesLnk(){
        clickOn(cellPhonesLnk);}

}


