package sauceDemoTest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemoPages.AboutPages;
import sauceDemoPages.CartPage;
import sauceDemoPages.HomePage;

public class LogOut extends CommonAPI {
    Logger LOG = LogManager.getLogger(LogOut.class.getName());

    //20

    @Test
    public void LogOutTest () throws InterruptedException {
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
        homePage.clickOnLogOut();

    }
}
