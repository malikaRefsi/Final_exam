package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends CommonAPI {

        Logger LOG = LogManager.getLogger(com.nopcommerce.pages.ShoppingCartPage.class.getName());

        public ShoppingCartPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath=  "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
        WebElement shoppingDisplay;
        public boolean checkIfShoppingCartDisplayed(){
            return shoppingDisplay.isDisplayed();
        }

@FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")
    WebElement agreeTerms;
        @FindBy(xpath= "//*[@id=\"checkout\"]")
    WebElement checkoutButton;
        public void Acceptterms(){
            clickOn(agreeTerms);
        }
public void clickCheckoutB(){
            clickOn(checkoutButton);

}
    }

