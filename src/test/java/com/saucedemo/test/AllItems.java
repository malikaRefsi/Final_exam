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
import utility.ReadFromExcel;

import java.io.File;

public class AllItems extends CommonAPI {
    Logger LOG = LogManager.getLogger(About.class.getName());
    String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"fariData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filePath, "sheetN1");

    @Test
    public void AboutTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String username = ConnectDB.getTableColumnData("select * from credf", "username").get(0);
        String password = ConnectDB.getTableColumnData("select * from credf", "password").get(0);

        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "homepage title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
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
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAllItems();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");
    }
}

