package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage(WebDriver driver) {
        super();
    }

    public void  CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[2]")
    WebElement agreeLnk;
    public void clickOnAgree(){
        clickOn(agreeLnk);
    }
    @FindBy(xpath= "")
    WebElement checkoutB;
    public void clickOnCheckOutB(){
        clickOn(checkoutB);
    }
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    WebElement welcomeDisplay1;
    public boolean checkIfWelcome(){
        return welcomeDisplay1.isDisplayed();
    }
}
