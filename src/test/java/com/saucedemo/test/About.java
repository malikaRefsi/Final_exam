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

public class About extends CommonAPI {

    Logger LOG = LogManager.getLogger(About.class.getName());
    //ReadFromExcel read = new ReadFromExcel("C:\\Users\\12016\\eclipse-workspace\\Final_exam\\data\\fariData.xlsx", "sheetN1");
    String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"fariData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filePath, "sheetN1");

    @Test
    public void menuTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnCrossMenuButton();
    }

    @Test
    public void AboutTest () throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();

        String expectedAboutTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
        String actualAboutTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs linkedin success");

    }

    @Test
    public void searchBarTest () throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.clickOnSearch();
        aboutPages.typeAndEnterOnSearchBar("sauce");
    }
    @Test
    public void AboutVideo () throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();

        aboutPages.cLickToSeeVideo();
        aboutPages.clickOnPlay();

    }

    @Test
    public void HoverOverCampany () throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.hoverOverComp(getDriver());

    }
    @Test
    public void hoverOverPlatform() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String username = ConnectDB.getTableColumnData("select * from credf", "username").get(0);
        String password = ConnectDB.getTableColumnData("select * from credf", "password").get(0);

        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "homepage title");;
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());;
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.hoverOverPlatform(getDriver());
    }


    @Test
    public void hoverOverSolutions() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.hoverOverSolutions(getDriver());

    }

    @Test
    public void clickOnPricing() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.clickOnPricing();

    }


}

