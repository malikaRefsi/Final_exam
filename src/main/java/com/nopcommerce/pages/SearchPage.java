
package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(com.nopcommerce.pages.SearchPage.class.getName());

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div[2]/h2/a")
    WebElement shirt;
    public void chooseShirt(){
        shirt.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
    WebElement BuildComp;
    public void buildYourCom(){
        BuildComp.click();
    }
    @FindBy(xpath="//*[@id=\"product_attribute_1\"]/option[3]")
    WebElement processor;
    public void chooseprocessor(){
        processor.click();
    }
    @FindBy(xpath="//*[@id=\"product_attribute_2\"]/option[4]")
    WebElement RAM;
    public void chooseram(){
        RAM.click();
    }
    @FindBy(xpath="//*[@id=\"product_attribute_3_6\"]")
    WebElement hddGb ;
    public void sethdd(){
        hddGb.click();
    }
    @FindBy(xpath="//*[@id=\"product_attribute_input_4\"]/ul/li[2]/label")
    WebElement os;
    public void chooseos() {
        os.click();
    }
    @FindBy(xpath= "//*[@id=\"product_attribute_input_5\"]/ul/li[2]")
    WebElement software;
    public void choosesoftware(){
        software.click();

    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]")
    WebElement AddCard;
    public void clickGiftCard(){
        AddCard.click();
    }
    @FindBy(xpath="//*[@id=\"giftcard_43_RecipientName\"]")
    WebElement receiptname;
    @FindBy(xpath="//*[@id=\"giftcard_43_RecipientEmail\"]")
    WebElement Email;
    @FindBy(xpath="//*[@id=\"giftcard_43_SenderName\"]")
    WebElement Yourname;
    @FindBy(xpath="//*[@id=\"giftcard_43_SenderEmail\"]")
    WebElement Youremail;
    @FindBy(xpath="//*[@id=\"add-to-cart-button-43\"]")
    WebElement addgiftcard;
    public void setInforforGift(String Nme, String Emad, String Ynme, String Yemail){
        receiptname.sendKeys(Nme);
        Email.sendKeys(Emad);
        Yourname.sendKeys(Ynme);
        Youremail.sendKeys(Yemail);
        addgiftcard.click();

    }
    @FindBy(xpath="//*[@id=\"add-to-cart-button-1\"]")
    WebElement addcart2;
    public void clickOnaddcart2(){
        addcart2.click();
    }
    @FindBy(xpath="//*[@id=\"add-to-cart-button-29\"]")
    WebElement addcart;
    public void addToCart(){
        addcart.click();
    }
    @FindBy(xpath="//*[@id=\"product_attribute_12\"]")
    WebElement entertxt;
    public void enterYourtxt(String Txt){

        entertxt.sendKeys(Txt );
    }
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/a/img")
    WebElement appleMac;
    public void chooseAppleMac(){

        clickOn(appleMac);
    }
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")
    WebElement notebook;

    public void clickOnNoteBook() {
        clickOn(notebook);
    }
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement notebookDisplayed;
    public boolean checkIfNotebookDisplayed(){
        return notebookDisplayed.isDisplayed();
    }
    @FindBy(xpath= "//*[@id=\"bar-notification\"]/div")
    WebElement notifDisplay;
    public boolean checkIfNotiDisplayed(){
        return(notifDisplay.isDisplayed());
    }
    @FindBy(xpath ="//*[@id=\"add-to-cart-button-4\"]")
    WebElement addbutton;
    public void clickOnAdd(){
        clickOn(addbutton);
    }
    @FindBy(xpath="//*[@id=\"products-orderby\"]/option[4]")
    WebElement lowtohigh;
    public void sortByLowToHigh(){
        clickOn(lowtohigh);
    }
    @FindBy(xpath="//*[@id=\"products-orderby\"]/option[5]")
    WebElement highTolow;
    public  void sortByHighToLow(){
        highTolow.click();
    }

    @FindBy(xpath="//*[@id=\"products-orderby\"]/option[2]")
    WebElement az;
    public void sortByAToZ(){
        az.click();
    }
    @FindBy(xpath="//*[@id=\"products-orderby\"]/option[3]")
    WebElement za;
    public void sortByZtoA(){
        za.click();
    }

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/h2/a")
    WebElement searchAdidas;
    public boolean checkIfShoesDisplayed(){
        return searchAdidas.isDisplayed();
    }
}

