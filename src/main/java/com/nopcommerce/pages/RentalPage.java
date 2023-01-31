package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(RegistrationPage.class.getName());

    public RentalPage(WebDriver driver) {
        super();
    }

    public void RentalPage(WebDriver driver) {PageFactory.initElements(driver, this);}
 @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
    WebElement necklace;
    public void clickOnOfNecklace(){
        necklace.click();
    }

    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")
    WebElement datebegin;
    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")
    WebElement enddate;
    @FindBy(xpath="//*[@id=\"add-to-cart-button-40\"]")
    WebElement rentB;
    public void setBeginDate() {
        clickOn(datebegin);
    }
    public void setEndDate() {
        clickOn(enddate);
    }
    public void clickOnRent() {
        clickOn(rentB);
    }
    @FindBy(xpath="//*[@id=\"bar-notification\"]/div/p")
    WebElement notification;
    public boolean checkIfNotificationIsDisplayed(){
        return notification.isDisplayed();
    }

    }


