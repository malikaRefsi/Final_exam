package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(RegistrationPage.class.getName());

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@for='gender-female']")
    WebElement gender;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;
    @FindBy(xpath = "//select[@name='DateOfBirth']")
    WebElement dob;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement mob;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yob;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Compagny']")
    WebElement compagnyDetails;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordReg;
    @FindBy(xpath = "//input[@data-value='true']")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerB;

    public void chooseGender() {
        gender.sendKeys();
    }

    public void setFirstName() {
        firstname.sendKeys();
    }

    public void setLastName() {
        lastname.sendKeys();
    }

    public void setDOB() {
        dob.sendKeys();
    }

    public void setMOB() {
        mob.sendKeys();
    }

    public void setYOB() {
        yob.sendKeys();
    }

    public void setEmail() {
        email.sendKeys();
    }

    public void setCompagnyDetails() {
        compagnyDetails.sendKeys();
    }

    public void setPasswordReg() {
        passwordReg.sendKeys();
    }

    public void setConfirmationForPassword() {
        confirmPassword.sendKeys();
//        public void tapeOkToRegister() {
//            registerB.click();

    }
}



