package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.io.File;

public class Register extends CommonAPI {
    Logger LOG = LogManager.getLogger(Register.class.getName());
    String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"fariData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filePath, "sheetN1");

    @Test
    //2
    public void standardUserloginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String username = ConnectDB.getTableColumnData("select * from credf", "username").get(0);
        String password = ConnectDB.getTableColumnData("select * from credf", "password").get(0);
        String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "homepage title");
        //String expectedTitle = "Swag Labs";
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
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

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

    @Test
    public void invalidLoginStandardUserTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername("standard_user");
        homePageF.typepassword("fari");
        homePageF.clickOnLoginButon();
        LOG.info("Login unsuccessful: Username and password do not match any user in this service");


        String error = homePageF.error();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        LOG.info("error message validation");
    }

    //3
    @Test
    public void noCredentialsloginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.clickOnLoginButon();
        LOG.info("Login button click successful");

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
    @Test
    public void lockedOutUserLoginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername("locked_out_user");
        homePageF.typepassword("secret_sauce");
        homePageF.clickOnLoginButon();
        Thread.sleep(3000);
        LOG.info("Login unsuccessful: Sorry, this user has been locked out");
        String error = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(error, homePageF.error());
        }

    @Test
    public void problemUserLoginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername("problem_user");
        homePageF.typepassword("secret_sauce");
        homePageF.clickOnLoginButon();
        LOG.info("Login successful");
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        String expectedTitle2 = "Swag Labs";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        LOG.info("login title page validation success");

    }
    @Test
    public void invalidProblemUserTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername("problem_user");
        homePageF.typepassword("fari");
        homePageF.clickOnLoginButon();
        LOG.info("Login unsuccessful: Username and password do not match any user in this service");


        String error = homePageF.error();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        LOG.info("error message validation");
    }
@Test
    public void performanceGlitchUserLoginTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername("performance_glitch_user");
        homePageF.typepassword("secret_sauce");
        homePageF.clickOnLoginButon();
        LOG.info("Login successful");
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        String expectedTitle2 = "Swag Labs";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        LOG.info("login title page validation success");
        Thread.sleep(3000);
    }


    @Test
    public void invalidLoginPerformanceGlitchUserTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");
        Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername("performance_glitch_user");
        homePageF.typepassword("fari");
        homePageF.clickOnLoginButon();
        LOG.info("Login unsuccessful: Username and password do not match any user in this service");


        String error = homePageF.error();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        LOG.info("error message validation");
    }


}

