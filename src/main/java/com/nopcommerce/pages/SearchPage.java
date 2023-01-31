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


}


