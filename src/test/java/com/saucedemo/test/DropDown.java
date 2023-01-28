package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;

public class DropDown extends CommonAPI {
    Logger LOG = LogManager.getLogger(DropDown.class.getName());
    //13
    @Test
    public void AtoZDropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();

        homePageF.selectFromDropDown("az");
        Thread.sleep(2000);

    }

    //14
    @Test
    public void ZtoADropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();

        homePageF.selectFromDropDown("za");
        Thread.sleep(2000);

    }

    //15
    @Test
    public void LowToHighDropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();

        homePageF.selectFromDropDown("lohi");
        Thread.sleep(2000);

    }


    //16
    @Test
    public void highToLowDropDown() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();

        homePageF.selectFromDropDown("hilo");
        //WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));


        /*WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(element);
        select.selectByValue("hilo");
        //select.selectByIndex(3);
        Thread.sleep(3000);*/
    }
}

