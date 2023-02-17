package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.io.File;

public class DropDown extends CommonAPI {
    Logger LOG = LogManager.getLogger(DropDown.class.getName());
    String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"fariData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filePath, "sheetN1");

    @Test
    public void AtoZDropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String username = ConnectDB.getTableColumnData("select * from credf", "username").get(0);
        String password = ConnectDB.getTableColumnData("select * from credf", "password").get(0);

        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "homepage title");
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        homePageF.selectFromDropDown("az");
        Assert.assertTrue(homePageF.checkIfoptionAToZIsSelected());
        LOG.info("A high to Z successfully displayed ");


    }


    @Test
    public void ZtoADropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        homePageF.selectFromDropDown("za");
        Assert.assertTrue(homePageF.checkIfoptionZToAIsSelected());
        LOG.info("option Z to A successfully displayed ");


    }


    @Test
    public void LowToHighDropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        homePageF.selectFromDropDown("lohi");
        Assert.assertTrue(homePageF.checkIfoptionlowToHighIsSelected());
        LOG.info("option low to high  successfully displayed ");

    }



    @Test
    public void highToLowDropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
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

        homePageF.selectFromDropDown("hilo");
        //Assert.assertTrue(homePageF.checkIfoptionHighToLowIsSelected());
        LOG.info("option high to low successfully displayed ");

        //WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        /*WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(element);
        select.selectByValue("hilo");
        //select.selectByIndex(3);
        Thread.sleep(3000);*/
    }
}

