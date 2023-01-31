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

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[3]/div/div[1]/div/div/a/img")
    WebElement electronicsLnk;

    public void clickOnElectronicsLnk() {
        clickOn(electronicsLnk);
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
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")
    WebElement wishlistLink;
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
    public void enterEmail(String email){
        subLnk.sendKeys(email);
    }
    @FindBy(xpath="//*[@id=\"newsletter-subscribe-button\"]")
    WebElement subButton;
    public void clickOnSub(){
        clickOn(subButton);
    }

@FindBy(xpath= "//*[@id=\"poll-block-1\"]/ul/li[1]")
WebElement excellent;
    public void pressOnVote(){
        clickOn(excellent);
    }
    @FindBy(xpath="//*[@id=\"vote-poll-1\"]")
    WebElement voteB;
    public void clickVote(){
        clickOn(voteB);
    }
}
