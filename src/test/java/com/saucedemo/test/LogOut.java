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

public class LogOut extends CommonAPI {
    Logger LOG = LogManager.getLogger(LogOut.class.getName());
    String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"fariData.xlsx";
   ReadFromExcel read = new ReadFromExcel(filePath, "sheetN1");

   //20

    @Test
    public void LogOutTest () throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());

        String username = ConnectDB.getTableColumnData("select * from credf", "username").get(0);
        String password = ConnectDB.getTableColumnData("select * from credf", "password").get(0);
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "homepage title");

//        String expectedTitle = "Swag Labs";
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


        aboutPages.clickOnmenuButton();
        homePageF.clickOnLogOut();
        Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
        LOG.info("successfully back to the login page ");
    }
}

