package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage extends CommonAPI {


        Logger LOG = LogManager.getLogger(com.nopcommerce.pages.ResetPasswordPage.class.getName());

        public ResetPasswordPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//*[@id=\"Email\"]")
        WebElement emailAddress;
        @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
        WebElement registerButton;
        @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
        WebElement displayPwd;

        public  boolean checkIfPasswordRecoveryIsDisplayed() {
            return displayPwd.isDisplayed();}

        public void recoveryOfThePassword(String Email) {
            emailAddress.sendKeys(Email);
            clickOn(registerButton);
        }
    }





