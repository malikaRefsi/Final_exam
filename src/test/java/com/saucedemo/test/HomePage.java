package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(Register.class.getName());
    //17
    @Test
    public void twitterTest() throws InterruptedException {
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

        String expectedTwitterTitle = "Sauce Labs (@saucelabs) / Twitter";
        String actualTwitterTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs twitter success");

    }
    //17
    @Test
    public void facebookTest() throws InterruptedException {
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
        homePageF.clickOnFacebook();

        String expectedTwitterTitle = "Sauce Labs | Facebook";
        String actualTwitterTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs facebook success");

    }
    //18
    @Test
    public void linkedinTest() throws InterruptedException {
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
        homePageF.clickOnLinkedin();

        String expectedTwitterTitle = " Sign In | LinkedIn";
        String actualTwitterTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs linkedin success");

    }
}
