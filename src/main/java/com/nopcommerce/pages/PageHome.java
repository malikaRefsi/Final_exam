package com.nopcommerce.pages;

import base.CommonAPI;
import jdk.jfr.Frequency;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class PageHome extends CommonAPI {
    Logger LOG = LogManager.getLogger(PageHome.class.getName());

    public PageHome(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //object
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
    WebElement displayNop;

    public boolean checkIfNopCommerceDisplayed() {
        return displayNop.isDisplayed();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[1]/strong")
    WebElement featureDisplay;

    public boolean checkIfFeatureIsDisplayed() {
        return featureDisplay.isDisplayed();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2")
    WebElement welcome;

    public boolean checkIfWelcomeDisplayed() {
        return welcome.isDisplayed();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement macbook;

    public void addMacToCart() {
        clickOn(macbook);

    }

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    WebElement electronicslnk;


    public void selectElectronics() {

        electronicslnk.click();
        LOG.info("select from dropdown success");
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement cameraheader;

    public boolean checkIfCameraDisplayed() {
        return cameraheader.isDisplayed();
    }

//@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[1]")
//WebElement euroLnk;
//    public void clickOnEuro(){
//        Actions actions = new Actions(driver );
//
//        actions.moveToElement(euroLnk).build().perform();;}
//        @FindBy(xpath = "//*[@id=\"customerCurrency\"]/option[1]")
//                WebElement dollarLnk;
//        public void clickOnDollar(){ Actions actions = new Actions(driver );
//
//            actions.moveToElement(dollarLnk).build().perform();

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement registerLink;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement loginLink;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    WebElement wishlistLink;

    public void clickOnWish() {
        wishlistLink.click();
    }

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    WebElement shoppingCartLink;
    @FindBy(xpath = "//*[@id=\"small-searchterms\"]")
    WebElement searchstore;
    @FindBy(xpath = " //*[@id=\"small-search-box-form\"]/button")
    WebElement searchButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")
    WebElement displaySearch;
    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a")
    WebElement contact;

    public void contactCustomerService() {
        clickOn(contact);
    }

    public boolean checkIfSearchIsDisplayed() {
        return displaySearch.isDisplayed();
    }

    public void searchStore(String store) {
        searchstore.sendKeys(store);
    }

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[4]/a")
    WebElement reviewed;

    public void clickOnrecently() {
        reviewed.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/h2/a")
    WebElement macbookComputer;

    public boolean checkIfMacBook() {
        return macbookComputer.isDisplayed();
    }


    //    public void typeItemToSearch(String item){
//        type(searchStore, item);
//        LOG.info("item name type success");
//    }
    public void clickOnSearchButton() {
        clickOn(searchButton);
        LOG.info("click search success");
    }

    //    public void searchItem(String item){
//        typeAndEnter(searchStore, item);
//        LOG.info("item name type and enter success");
//    }
    //    public void selectOptionFromMenuDropdown(String option){
//        selectOptionFromDropdown(menuDropdown, option);
//        LOG.info(option+" option selected from the dropdown");
//    }
//    public void hoverOverFloatingMenu(WebDriver driver){
//        hoverOver(driver, floatingMenu);
//        LOG.info("hover over menu success");
//    }
    public void clickOnLoginButton() {
        clickOn(loginLink);
        LOG.info("click on login button success");
    }

    public void clickOnCartLink() {
        clickOn(shoppingCartLink);
        LOG.info("click on cart link success");
    }

    public void clickOnRegisterLink() {
        clickOn(registerLink);
        LOG.info("click on register button success");
    }

    @FindBy(xpath = "//*[@id=\"newsletter-email\"]")
    WebElement subLnk;

    public void enterEmail(String email) {
        subLnk.sendKeys(email);
    }

    @FindBy(xpath = "//*[@id=\"newsletter-subscribe-button\"]")
    WebElement subButton;

    public void clickOnSub() {
        clickOn(subButton);
    }

    @FindBy(xpath = "//*[@id=\"poll-block-1\"]/ul/li[1]")
    WebElement excellent;

    public void pressOnVote() {
        clickOn(excellent);
    }

    @FindBy(xpath = "//*[@id=\"vote-poll-1\"]")
    WebElement voteB;

    public void clickVote() {
        clickOn(voteB);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
    WebElement message404;


    public String readReturnedMsg() {
        return welcome.getText();
    }

    public String registredEmail() {
        return message404.getText();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2")
    WebElement camera;

    public void clickOncamera() {
        camera.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2")
    WebElement cellphonesoption;

    public void clickOncell() {
        cellphonesoption.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement cellheader;

    public boolean checkIfCellIsDisplayed() {
        return cellheader.isDisplayed();

    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/h2")
    WebElement othersoption;

    public void clickOnOthers() {
        othersoption.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement othersHeader;

    public boolean checkIfOthersIsDisplayed() {
        return othersHeader.isDisplayed();
    }

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]")
    WebElement Computerlnk;

    public void clickOnComputer() {
        Computerlnk.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2")
    WebElement desktopsoption;

    public void clickOnDesktops() {
        desktopsoption.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement desktopsheader;

    public boolean checkIfDesktop() {
        return desktopsheader.isDisplayed();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement software;

    public void clickOnSoftware() {
        software.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement softwareDisplay;

    public boolean checkIfSoftwareIsDisplayed() {
        return softwareDisplay.isDisplayed();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement notebookoption;

    public void clickOnNoteBook() {
        notebookoption.click();
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement notebookdisplayed;

    public boolean checkIfNoteBookDisplay() {
        return notebookdisplayed.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"poll-block-1\"]/ul/li[2]/label")
    WebElement good;

    public void voteGood() {
        good.click();
    }

    @FindBy(xpath = "//*[@id=\"poll-block-1\"]/ul/li[3]/label")
    WebElement poor;

    public void votePoor() {
        poor.click();
    }
    @FindBy(xpath = "//*[@id=\"poll-block-1\"]/ul/li[4]/label")
    WebElement verybad;

    public void voteVeryBad() {
        verybad.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    WebElement apparel;
    public void clickOnApparel(){
        apparel.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2")
    WebElement shoes;
    public void clickOnShoes(){
        shoes.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement ShoesDi;
    public boolean checkIfShoesDisplayed(){
        return ShoesDi.isDisplayed();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2")
    WebElement clothing;
    public void clickOnclothing(){
        clothing.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement clothingdisplay;
    public boolean checkIfclothingdisplayed(){
        return clothingdisplay.isDisplayed();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/h2")
    WebElement accessories;
    public void clickOnaccessories(){
        accessories.click();
    }
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
    WebElement accessoriesdisplay;
    public boolean checkIfAccessoriesdisplayed(){
        return accessoriesdisplay.isDisplayed();
    }
}
