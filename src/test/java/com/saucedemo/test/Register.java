package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;

public class Register extends CommonAPI {
    Logger LOG = LogManager.getLogger(Register.class.getName());

    @Test
    //2
    public void loginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String username = ConnectDB.getTableColumnData("select * from cred", "username").get(2);
        String password = ConnectDB.getTableColumnData("select * from cred", "password").get(2);
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();


        String expectedTitle2 = "Swag Labs";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        LOG.info("login title page validation success");

      /*type("#user-name","standard_user");
        System.out.print("text sent success");

        type("#password","secret_sauce");
        LOG.info("text sent success");

       clickOn("#login-button");
        LOG.info("click login button success");

        String expectedTitle2 = "Swag Labs";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        LOG.info("login title page validation success");*/
        /*driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        System.out.print("text sent success");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        System.out.print("text sent success");
        driver.findElement(By.cssSelector("#login-button")).click();
        System.out.print("click login button success");
        String expectedTitle2 = "Swag Labs";
        String actualTitle2 = driver.getTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        System.out.print("login title page validation success");*/

    }

    @Test
    //1
    public void InvalidloginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.typeusername("fariza");
        homePageF.typepassword("fari");
        homePageF.clickOnLoginButon();


        String error = homePageF.error();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        LOG.info("error message validation");

        /*LOG.info("land to saucedemo success");

        type("#user-name", "fariza");
        LOG.info("text sent success");

        type("#password","fari");
        LOG.info("text sent success");

        clickOn("#login-button");
        LOG.info("click login button success");

        String error = getTextFromElement("//h3[@data-test='error']");
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        LOG.info("error message validation");*/



        /*driver.findElement(By.cssSelector("#user-name")).sendKeys("fariza");
        System.out.print("text sent success");
        driver.findElement(By.cssSelector("#password")).sendKeys("fari");
        System.out.print("text sent success");
        driver.findElement(By.cssSelector("#login-button")).click();
        System.out.print("click login button success");
        String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        System.out.print("error message validation");*/

    }
    //3
    @Test
    public void nocredentialsloginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePageF.clickOnLoginButon();

        String error = homePageF.error();
        Assert.assertEquals(error, "Epic sadface: Username is required");
        LOG.info("error message validation");


        /*clickOn("#login-button");
        LOG.info("click login button success");

        String error = getTextFromElement("//h3[@data-test='error']");
        Assert.assertEquals(error, "Epic sadface: Username is required");
        LOG.info("error message validation");*/
        /*driver.findElement(By.cssSelector("#login-button")).click();
        System.out.print("click login button success");
        String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(error, "Epic sadface: Username is required");
        System.out.print("error message validation");*/
    }
}

