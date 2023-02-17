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

    @FindBy(xpath= "//*[@id=\"product_attribute_9\"]/option[3]" )
    WebElement sizelnk;

    public void clickadidassize(){
        clickOn(sizelnk);}
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/h2" )
    WebElement adidaslnk;

    public void clickadidaslnk(){
        clickOn(adidaslnk);}
    @FindBy(xpath= "//*[@id=\"color-squares-10\"]/li[2]/label/span/span")
    WebElement colorlnk;

    public void clickadidascolor(){
        clickOn(colorlnk);}
@FindBy(xpath="//*[@id=\"add-to-cart-button-25\"]")
    WebElement addadidas;
    public void clickaddadidas(){
        clickOn(addadidas);
    }
}


