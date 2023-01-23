package sauceDemoTest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    Logger LOG = LogManager.getLogger(Register.class.getName());
    //17
    @Test
    public void twitterTest() throws InterruptedException {
        sauceDemoPages.HomePage homePage = new sauceDemoPages.HomePage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
        homePage.clickOnTwitter();

        String expectedTwitterTitle = "Sauce Labs (@saucelabs) / Twitter";
        String actualTwitterTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs twitter success");

    }
    //17
    @Test
    public void facebookTest() throws InterruptedException {
        sauceDemoPages.HomePage homePage = new sauceDemoPages.HomePage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
        homePage.clickOnFacebook();

        String expectedTwitterTitle = "Sauce Labs | Facebook";
        String actualTwitterTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs facebook success");

    }
    //18
    @Test
    public void linkedinTest() throws InterruptedException {
        sauceDemoPages.HomePage homePage = new sauceDemoPages.HomePage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
        homePage.clickOnLinkedin();

        String expectedTwitterTitle = " Sign In | LinkedIn";
        String actualTwitterTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs linkedin success");

    }
}