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
    @FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[6]/span")
    WebElement price;
    public boolean priceChange(){
        return price.isDisplayed();
    }

    @FindBy(xpath="//*[@id=\"updatecart\"]")
    WebElement updateB;
    public void clickOnUpdate(){
        updateB.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")
    WebElement updateQ;
    public void setUpdateQ( String q){
        updateQ.sendKeys(q);
    }
    @FindBy(xpath="//*[@id=\"add-to-cart-button-24\"]")
    WebElement added;
    public void clickOnAdd(){
        added.click();
    }
    @FindBy(xpath=  "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    WebElement shoppingDisplay;
    public boolean checkIfShoppingCartDisplayed(){
        return shoppingDisplay.isDisplayed();
    }

    @FindBy(xpath="//input[id='termsofservice']")
    WebElement agreeTerms;
    @FindBy(xpath= "//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]")
    WebElement checkoutButton;
    public void Acceptterms(){
        clickOn(agreeTerms);
    }
    public void clickCheckoutB(){
        clickOn(checkoutButton);

    }
    @FindBy(xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[7]/button")
    WebElement remove;
    public void removeFromCart(){
        remove.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[8]/button")
    WebElement remove2;
    public void removeFromWish(){
        remove2.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]")
    WebElement displayWish;
    public boolean checkIfDisplayWIsh(){
        return displayWish.isDisplayed();
    }
    @FindBy(xpath="//*[@id=\"bar-notification\"]/div/p/a")
    WebElement CompareList;
    public void clickOnCompare(){
        CompareList.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[1]")
    WebElement remove3;
    public void setRemove3(){
        remove3.click();
    }
    @FindBy(xpath="//*[@id=\"bar-notification\"]/div/p/a")
    WebElement NotificationShop;
    public void clickOnNotiShop(){
        NotificationShop.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div/div")
    WebElement displayEmpty;
    public boolean checkIfEmptyCartDisplayed(){
        return displayEmpty.isDisplayed();
    }
}

