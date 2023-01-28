package com.saucedemo.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePageF;
import utility.ConnectDB;

public class Cart extends CommonAPI {
    Logger LOG = LogManager.getLogger(Cart.class.getName());

     @Test
     //4
     public void AddToCartTest() throws InterruptedException {
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

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();


         String expectedTitle2 = "Swag Labs";
         String actualTitle2 = getCurrentTitle();
         Assert.assertEquals(expectedTitle2, actualTitle2);
         LOG.info("login title page validation success");
     }

     //5
     @Test
     public void removeFromHomePage() throws InterruptedException {
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

         cartPage.clickOnAddItem1();
         cartPage.clickOnRemove();

     }

     //6
     @Test
     public void removeFromShoppingCart() throws InterruptedException {
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

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         cartPage.clickOnRemove();
     }

     //7
     @Test
     public void continueShopping() throws InterruptedException {
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

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         cartPage.clickOnContinueShopping();
         //cartPage.clickOnAddToCartButton();


     }

     //8
     @Test

     public void checkOutOneItem() throws InterruptedException {
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

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         cartPage.checkOut();
         cartPage.typeFirstName("Fariza");
         cartPage.typeLastName("tadj");
         cartPage.typePostalCode("11214");
         cartPage.clickOnCtinueButon();
         cartPage.clickOnFinishButton();
        // cartPage.clickOnBack();
         // cartPage.clickOnBack();

     }
    //9
    @Test
    public void checkOutMultipleItems() throws InterruptedException {
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
        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        Thread.sleep(2000);
        cartPage.clickOnShoppingCart();
        cartPage.checkOut();
        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");
        Thread.sleep(2000);
        cartPage.clickOnCtinueButon();
        cartPage.clickOnFinishButton();

        String checkOutValidation = homePageF.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");

    }

    //10
    @Test
    public void checkOutAfterRemovingItems() throws InterruptedException {
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
        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();

        cartPage.clickOnShoppingCart();
        Thread.sleep(2000);

        cartPage.clickOnRemove();
        cartPage.clickOnRemoveItem2();
        Thread.sleep(2000);
        cartPage.checkOut();
        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");
        Thread.sleep(2000);
        cartPage.clickOnCtinueButon();
        cartPage.clickOnFinishButton();

        String checkOutValidation = homePageF.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");
    }
    //11
    @Test
    public void checkOutCancel() throws InterruptedException {
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
        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();

        cartPage.clickOnShoppingCart();
        Thread.sleep(2000);
        cartPage.checkOut();
        cartPage.clickOncancel();
        Thread.sleep(2000);
        cartPage.clickOnRemove();
        cartPage.clickOnRemoveItem2();
        Thread.sleep(2000);
        cartPage.checkOut();
        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");
        Thread.sleep(2000);
        cartPage.clickOnCtinueButon();
        cartPage.clickOnFinishButton();

        String checkOutValidation = homePageF.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");
    }

    //12
    @Test
    public void NoInformationsCheckOut() throws InterruptedException {
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

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        cartPage.clickOnShoppingCart();
        Thread.sleep(2000);
        cartPage.checkOut();
        cartPage.clickOnCtinueButon();

        String checkOutValidation = homePageF.checkOutcancelation();
        Assert.assertEquals(checkOutValidation, "Error: First Name is required");
        LOG.info("error message success");

    }
}
