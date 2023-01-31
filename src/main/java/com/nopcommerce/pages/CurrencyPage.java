package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(CheckoutPage.class.getName());

    public CurrencyPage(WebDriver driver) {
        super();
    }

    public void currencyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//*[@id=\"customerCurrency\"]/option[1]")
    WebElement  dollar;
    public void setToDollar(){
        clickOn(dollar);
    }
    @FindBy(xpath="//*[@id=\"customerCurrency\"]/option[2]")
    WebElement euro;
    public void setToEuro(){
        clickOn(euro);
    }
    @FindBy(xpath="//*[@id=\"customerCurrency\"]")
    WebElement currency;
    public void setCurrency(){
        Actions actions = new Actions(driver);
        actions.moveToElement(currency).build().perform();
    }

}
