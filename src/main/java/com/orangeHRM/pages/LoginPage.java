package com.orangeHRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginPage.class.getName());
    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //objects or locators
    @FindBy(xpath = "//input[@name='username']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginLogo;
    @FindBy(xpath = "//P[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement loginErrorMessage;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement resetButton;
    @FindBy(xpath = "//button[@type='button']")
    WebElement cancelButton;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordMessage;



    //reusable steps
    public void login(String UserName,String Password){
        typeText(userNameField,UserName);
        typeText(passwordField,Password);
        clickOn(loginButton);
    }

    public boolean checkIfLoginLogoIsDisplayed() {
       return checkIfElementIsDisplayed(loginLogo);
    }
    public String getLoginError() {
        return getTextFromElement(loginErrorMessage);
    }
    public void resetPassWord(WebDriver driver,String UserName){
        clickOn(forgotPasswordLink);
        Assert.assertEquals(getTextFromElement(resetPasswordMessage),"Reset Password");
        LOG.info("we are successfully switch to reset password dialogue box");
        typeText(userNameField,UserName);
        clickOn(resetButton);

    }
    public void cancelResetPassWord(WebDriver driver,String UserName){
        clickOn(forgotPasswordLink);
        Assert.assertEquals(getTextFromElement(resetPasswordMessage),"Reset Password");
        LOG.info("we are successfully switch to reset password dialogue box");
        typeText(userNameField,UserName);
        clickOn(cancelButton);

    }
    public String getResetPasswordText() {

        return getTextFromElement(resetPasswordMessage);
    }

    //    public void typeUserName(String UserName){
//        typeText(userNameField,UserName);
//        LOG.info("successfully typed in the username");
//    }
//    public void typePassword(String Password){
//        typeText(passwordField,Password);
//        LOG.info("successfully typed in the password");
//
//    }
//    public void clickLoginButton(){
//        clickOn(loginButton);
//        LOG.info("click login button success");
//
//    }
//    public void clickOnForgotPasswordLink(){
//        clickOn(forgotPasswordLink);
//        LOG.info("click forgot password link success");
//
//    }


}
