package com.saucedemo.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(HomePageF.class.getName());

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //LabsBackup
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement addBackUp;
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    WebElement addBikeLight;

    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addBoltTShirt;
    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    WebElement addFleeceJacket;

    @FindBy(css = "#shopping_cart_container")
    WebElement shoppingCart;

    @FindBy(css = "#remove-sauce-labs-backpack")
    WebElement removeFromShoppingCart;
    @FindBy(css = "#remove-sauce-labs-bike-light")
    WebElement removeItem2FromShoppingCart;
    @FindBy(css = "#continue-shopping")
    WebElement continueShopping;

    @FindBy(css = "#checkout")
    WebElement checkOut;

    @FindBy(css = "#first-name")
    WebElement firstNameField;

    @FindBy(css = "#last-name")
    WebElement lastNameField;

    @FindBy(css = "#postal-code")
    WebElement postalCodeField;

    @FindBy(css = "#continue")
    WebElement continueButton;

    @FindBy(css = "#finish")
    WebElement finishButton;


    @FindBy(css = "#back-to-products")
    WebElement backToProduct;

    @FindBy(css = "#cancel")
    WebElement cancel;

    @FindBy(xpath = "//span[text()='Your Cart']")
    WebElement YourCart;
    @FindBy(xpath = "//div[text()='QTY']")
    WebElement QTY;
    @FindBy(xpath = "//div[text()='DESCRIPTION']")
    WebElement Description;

    @FindBy(xpath = "//span[text()='4']")
    WebElement num4;
    @FindBy(xpath = "//span[text()='1']")
    WebElement num1;
    @FindBy(xpath = "//span[text()='Checkout: Your Information']")
    WebElement checkOutYourInformations;

    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    WebElement checkOutOverview;

    public void clickOnAddItem1() {
        clickOn(addBackUp);
        LOG.info("click add to cart button button success");
    }

    public void clickOnAddTItem2() {
        clickOn(addBikeLight);
        LOG.info("click add to cart button button success");
    }

    public void clickOnAddItem3() {
        clickOn(addFleeceJacket);
        LOG.info("click add to cart button button success");
    }
    public void clickOnAdditem4() {
        clickOn(addBoltTShirt);
        LOG.info("click add to cart button button success");
    }


    public void clickOnShoppingCart() {
        clickOn(shoppingCart);
        LOG.info("click on shopping cart badge button success");
    }

    public void clickOnRemove() {
        clickOn(removeFromShoppingCart);
        LOG.info("click on remove from shopping cart success");
    }
    public void clickOnRemoveItem2() {
        clickOn(removeItem2FromShoppingCart);
        LOG.info("click on remove from shopping cart success");
    }

    public void clickOnContinueShopping() {
        clickOn(continueShopping);
        LOG.info("click on continue shopping success");
    }

    public void checkOut() {
        clickOn(checkOut);
        LOG.info("click on check out button success");
    }
    public void typeFirstName (String text) {
        typeText(firstNameField, text);
        LOG.info("first name sent success");
    }

    public void typeLastName (String text) {
        typeText(lastNameField, text);
        LOG.info("last name sent success");
    }

    public void typePostalCode (String text) {
        typeText(postalCodeField, text);
        LOG.info("postal code sent success");
    }
    public void clickOnCtinueButon() {
        clickOn(continueButton);
        LOG.info("click on continue button success");}

    public void clickOnFinishButton() {
        clickOn(finishButton);
        LOG.info("click on finish button success");}

    public void clickOnBack() {
        clickOn(backToProduct);
        LOG.info("click on back to product button success");}

    public void clickOncancel() {
        clickOn(cancel);
        LOG.info("click on cancel button success");}


    public boolean checkIfYourCartHeaderIsDisplayed() {
        return checkIfElementIsDisplayed(YourCart);
    }
    public boolean checkIfDescriptionIsDisplayed() {
        return checkIfElementIsDisplayed(Description);
    }
    public boolean checkIfQuantityIsDisplayed() {
        return checkIfElementIsDisplayed(QTY);

    }
    public boolean checkIfNum4IsDisplayed() {
        return checkIfElementIsDisplayed(num4);

    }
    public boolean checkIfNum1yIsDisplayed() {
        return checkIfElementIsDisplayed(num1);

    }


    public boolean checkIfCheckOutHeaderIsDisplayed() {
        return checkIfElementIsDisplayed(checkOutYourInformations);

    }

    public boolean checkIfCheckOutOverviewHeaderIsDisplayed() {
        return checkIfElementIsDisplayed(checkOutOverview);

    }


}

