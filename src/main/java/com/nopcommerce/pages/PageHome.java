package com.nopcommerce.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHome extends CommonAPI {
    Logger LOG = LogManager.getLogger(PageHome.class.getName());

    public PageHome(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //object
    @FindBy(xpath= "input[@type='text']")
    WebElement searchField;

    @FindBy(xpath= "input[@name='q']")
    WebElement searchButton;

//    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
//    WebElement floatingMenu;

    @FindBy(xpath = "a[@class='ico-login']")
    WebElement loginButton;

    //    @FindBy(css = "#searchDropdownBox")
//    WebElement menuDropdown;
    @FindBy(xpath= "//a[class='ico-register']")
    WebElement registerButton;


    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement cartLink;
    @FindBy(xpath = "//span[@class='wishlist-label']")
    WebElement wishList;

    //reusable steps

    public void clickOnSearchButton(WebElement searchButton){
        clickOnSearchButton(this.searchButton);
        LOG.info("click search success");
    }
    //    public void searchItem(String item){
//        typeAndEnter(searchField, item);
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

        public void clickOnLoginButton(){
            clickOn(loginButton);
            LOG.info("click on login button success");

    }
    public void clickOnCartLink(WebElement cartLink){
        clickOnCartLink(this.cartLink);
        LOG.info("click on cart link success");
    }
    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }
}









