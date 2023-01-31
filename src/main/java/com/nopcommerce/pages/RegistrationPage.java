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

    @FindBy(xpath = "//*[@id=\"gender\"]/span[2]/label")
    WebElement gender;
    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    WebElement firstname;
    @FindBy(xpath = "//*[@id=\"LastName\"]")
    WebElement lastname;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[4]")
    WebElement dob;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[3]")
    WebElement mob;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[52]")
    WebElement yob;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"Company\"]")
    WebElement compagnyDetails;
    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordReg;
    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    WebElement confirmPassword;
    @FindBy(xpath = "//*[@id=\"register-button\"]")
    WebElement registerB;

    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    WebElement registrationDisplay;
    public boolean checkIfRegistrationCompletedDisplayed(){
        return registrationDisplay.isDisplayed();
    }



    public void setTheRegistrationInformation(String fname, String lname, String eadress, String pwd,
                                              String cpwd, String cDetails ) throws InterruptedException {
        clickOn(gender);

        firstname.sendKeys(lname);

        lastname.sendKeys(fname);

        clickOn(dob);

        clickOn((mob));

        clickOn(yob);

        email.sendKeys(eadress);

        compagnyDetails.sendKeys(cDetails);
        Thread.sleep(2000);
        passwordReg.sendKeys(pwd);
        Thread.sleep(2000);
        confirmPassword.sendKeys(cpwd);
        Thread.sleep(2000);
        clickOn(registerB);
        Thread.sleep(2000);
    }
}



