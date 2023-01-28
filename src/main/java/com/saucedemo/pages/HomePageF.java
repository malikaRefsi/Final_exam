package com.saucedemo.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageF extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePageF.class.getName());
    // Logger LOG = LogManager.getLogger(HomePage.class.getName());
    public HomePageF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //01
    @FindBy(css = "#user-name")
    WebElement userNameField;

    @FindBy(css = "#password")
    WebElement passwordField;

    @FindBy(css = "#login-button")
    WebElement loginButton;
    //02
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errormessage;
    //03
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errormessagenNocredentials;

    @FindBy(xpath = "//h2[text() = 'THANK YOU FOR YOUR ORDER']")
    WebElement checkOutValidation;


    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement dropDown;

    @FindBy(css = "#logout_sidebar_link")
    WebElement logOut;

    @FindBy(xpath = "//div[@class= 'error-message-container error']")
    WebElement checkOutCancelation;

    @FindBy(xpath= "//a[text() ='Twitter']")
    WebElement twitter;

    @FindBy(xpath = "//a[text() ='Facebook']")
    WebElement facebook;

    @FindBy(xpath = "//a[text() ='LinkedIn']")
    WebElement linkedin;

    //Reusable methods
    public void selectFromDropDown (String option) {
        selectOptionFromDropdownF(dropDown, option);
        LOG.info("select from dropdown success");
    }



    public void typeusername(String text) {
        typeText(userNameField, text);
        LOG.info("username sent success");
    }
    public void typepassword(String text) {
        typeText(passwordField, text);
        LOG.info("password  sent success");
    }
    public void clickOnLoginButon() {
        clickOn(loginButton);
        LOG.info("click login button success");
    }


    public String error() {
        return getTextFromElement(errormessage);


    }

    public String errorNC() {
        return getTextFromElement(errormessagenNocredentials);



    }

    public void clickOnLogOut() {
        clickOn(logOut);
        LOG.info("click on log out button success");
    }

    public String checkOutValidation() {
        return getTextFromElement(checkOutValidation);

    }
    public String checkOutcancelation() {
        return getTextFromElement(checkOutCancelation);

    }
    public void clickOnTwitter() {
        clickOn(twitter);
        LOG.info("click on twitter link success");
    }
    public void clickOnFacebook() {
        clickOn(facebook);
        LOG.info("click on facebook link success");
    }
    public void clickOnLinkedin() {
        clickOn(linkedin);
        LOG.info("click on linkedin link success");
    }

}

