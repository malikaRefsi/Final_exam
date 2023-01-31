package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends CommonAPI {



        Logger LOG = LogManager.getLogger(ContactUsPage.class.getName());

        public ContactUsPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath= "//*[@id=\"FullName\"]")
        WebElement enterName;
        @FindBy (xpath= "//*[@id=\"Email\"]")
        WebElement enterEmail;
        @FindBy(xpath= "//*[@id=\"Enquiry\"]")
        WebElement inquiry;
        @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
        WebElement submitButton;
        @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
        WebElement displayContact;
        public boolean checkIfContactUsDisplayed(){
            return displayContact.isDisplayed();
        }
        public void clickOnSubmit(){
            clickOn(submitButton);
        }

        public void enterYourInquiry(String Inquiry){
            inquiry.sendKeys(Inquiry);
        }
        public void enterYourName( String name){
            enterName.sendKeys (name) ;  }
        public  void  enterYourEmail(CharSequence email){
            enterEmail.sendKeys(email);}
    }


