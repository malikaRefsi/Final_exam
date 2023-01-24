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

    //objects
//    @FindBy(xpath = "//input[@id='email']")
//    WebElement userName;
//
//    @FindBy(xpath = "//input[@class='password']")
//    WebElement password;
//    @FindBy(xpath = "//a[@href='passwordrecovery']")
//    WebElement resetPassword;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    WebElement btnLogin;
//
//
    //reusable methods

    public void typeUserName(String userName){
        this.username.sendKeys();}
    public void typePassword(String pwd){

        this.password.sendKeys();}
    public void  clickONLoginButton(){
        loginbtn.click();
    }


    @FindBy(id = "Username")
    WebElement username;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "/html/body/div[6]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")
    WebElement loginbtn;
}



