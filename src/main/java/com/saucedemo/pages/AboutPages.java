package com.saucedemo.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPages extends CommonAPI {
    Logger LOG = LogManager.getLogger(AboutPages.class.getName());

    public AboutPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //LabsBackup
    @FindBy(css = "#react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(css = "#about_sidebar_link")
    WebElement aboutButton;

    @FindBy(xpath = "//li[@class='nav-action-list-items-search is-hidden-touch']")
    WebElement searchButton;
    @FindBy(xpath = "//input[@class = 'nav-search-input-desktop nav-action-list-items-search-form-input']")
    WebElement searchBar;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[5]/div[1]/div[1]/a[1]")
    WebElement company;

    @FindBy(xpath = "//span[text() = 'See how you can test your best']")
    WebElement seeVideo;

    @FindBy(xpath = "//button[@class = 'lty-playbtn']")
    WebElement playVideo;
    //span[text() = 'Play']
    @FindBy(css = "#mktoCheckbox_32812_0")
    WebElement checkBox;

    @FindBy(xpath = "//span[text() = 'Contact sales']")
    WebElement contactSale;

    @FindBy(css = "#reset_sidebar_link")
    WebElement resetApp;

    @FindBy(css = "#react-burger-cross-btn")
    WebElement crossMenuButton;

    @FindBy(css = "#inventory_sidebar_link")
    WebElement allItems;
    @FindBy(xpath = "//body[1]/header[1]/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[3]/div[1]/div[1]/a[1]/span[1]")
    WebElement pricing;
    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[1]/div[1]/div[1]/a[1]")
    WebElement solutions;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[2]/div[1]/div[1]/a[1]")
    WebElement platform;


    public void clickOnmenuButton() {
        clickOn(menuButton);
        LOG.info("click on menu button success");
    }

    public void clickOnAboutButton() {
        clickOn(aboutButton);
        LOG.info("click on about button success");
    }

    public void clickOnSearch() {
        clickOn(searchButton);
        LOG.info("click on search button success");
    }

    public void typeAndEnterOnSearchBar(String text) {
        typeTextAndEnter(searchBar, text);
        LOG.info("text sent and entered success");
    }

    public void hoverOverComp(WebDriver driver) {
        hoverOver(driver, company);
        LOG.info("hover over company success");
    }

    public void cLickToSeeVideo() {
        clickOn(seeVideo);
        LOG.info("click see video button success");
    }

    public void clickOnPlay() {
        clickOn(playVideo);
        LOG.info("click on play video button button success");
    }

    public void checkBox() {
        clickOn(checkBox);
        LOG.info("checkBox  success");
    }


    public void contactSale() {
        clickOn(contactSale);
        LOG.info("click on contact sale button success");
    }

    public void clickOnRestApp() {
        clickOn(resetApp);
        LOG.info("click on contact sale button success");
    }

    public void clickOnCrossMenuButton() {
        clickOn(crossMenuButton);
        LOG.info("click on cross menu success");
    }

    public void clickOnAllItems() {
        clickOn(allItems);
        LOG.info("click on all items success");
    }


    public void hoverOverSolutions(WebDriver driver) {
        hoverOver(driver, solutions);
        LOG.info("hover over solutions success");
    }

    public void hoverOverPlatform(WebDriver driver) {
        hoverOver(driver, platform);
        LOG.info("hover over platform success");
    }

    public void clickOnPricing() {
        clickOn(pricing);
        LOG.info("click on pricing success");

    }
}

