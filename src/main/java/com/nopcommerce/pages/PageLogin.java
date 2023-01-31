package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PageLogin extends CommonAPI {
    Logger LOG = LogManager.getLogger(PageLogin.class.getName());

    public PageLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
WebElement logout;
    public void logOut(){
        clickOn(logout);
    }

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement EmailField;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordField;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement loginButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a")
    WebElement forgotPassword;
    @FindBy(xpath= "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
    WebElement displayNop;
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2")
    WebElement displayOurStore;
    public boolean checkIfOurStoreIsDisplayed(){
        return displayOurStore.isDisplayed();
    }
    public boolean checkIfNopCommerceIsDisplayed(){
        return displayNop.isDisplayed();}
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div[3]/div[1]/h2")
    WebElement displayAboutLogin;
    public boolean checkIfAboutLoginDisplayed(){
        return checkIfElementIsDisplayed(displayAboutLogin);}


    public void loginWithCorrectCred(String emaila,String Password) throws InterruptedException {
        EmailField.sendKeys(emaila);
        Thread.sleep(2000);
        passwordField.sendKeys(Password);
        Thread.sleep(2000);
        clickOn(loginButton);
        Thread.sleep(2000);
    }
    public void setForgotPassword(){
        clickOn(forgotPassword);
    }
}




