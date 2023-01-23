package sauceDemoTest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemoPages.AboutPages;
import sauceDemoPages.CartPage;
import sauceDemoPages.HomePage;

public class About extends CommonAPI {

    Logger LOG = LogManager.getLogger(About.class.getName());

    //21
    @Test
    public void menuTest() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
        aboutPages.clickOnmenuButton();
        aboutPages.clickOnCrossMenuButton();
    }
//24
    @Test
    public void AboutTest () throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();

        String expectedAboutTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
        String actualAboutTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to sauce labs linkedin success");

    }

//25
  @Test
    public void searchBarTest () throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
      AboutPages aboutPages = new AboutPages(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.clickOnSearch();
        aboutPages.typeAndEnterOnSearchBar("sauce");
    }
    //26
    @Test
    public void AboutVideo () throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();

        aboutPages.cLickToSeeVideo();
        aboutPages.clickOnPlay();

    }
    //27
 /*   @Test
    public void AboutCampany () throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        Thread.sleep(2000);
        aboutPages.hoverOverComp(getDriver());
       // aboutPages.hoverOverComp(getDriver());

    }
    @Test
    public void AboutCheckBox () throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        AboutPages aboutPages = new AboutPages(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        aboutPages.clickOnmenuButton();
        aboutPages.clickOnAboutButton();
        aboutPages.contactSale();
        aboutPages.checkBox();
        //aboutPages.clickOnCheckBox();
        //aboutPages.checkBox();
    }*/
}
