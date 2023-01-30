package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.AboutPages;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;

public class AllItems extends CommonAPI {
    Logger LOG = LogManager.getLogger(About.class.getName());
    //23
    @Test
    public void AboutTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");


        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");


        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        LOG.info("Your cart header successfully displayed ");

        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        LOG.info("Description of the products successfully displayed ");

        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("quantity of products successfully displayed ");


        Thread.sleep(3000);
        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAllItems();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");
    }
}

