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
         Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
         LOG.info("SwagLabs logo successfully displayed ");

         homePageF.typeusername(username);
         homePageF.typepassword(password);
         homePageF.clickOnLoginButon();
         Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
         LOG.info("Products header successfully displayed ");

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
         LOG.info("Your cart header successfully displayed ");

         Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
         LOG.info("Description of the products successfully displayed ");

         Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
         LOG.info("quantity of products successfully displayed ");


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
         Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
         LOG.info("SwagLabs logo successfully displayed ");

         homePageF.typeusername(username);
         homePageF.typepassword(password);
         homePageF.clickOnLoginButon();
         Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
         LOG.info("Products header successfully displayed ");

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
         Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
         LOG.info("SwagLabs logo successfully displayed ");

         homePageF.typeusername(username);
         homePageF.typepassword(password);
         homePageF.clickOnLoginButon();
         Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
         LOG.info("Products header successfully displayed ");

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
         LOG.info("Your cart header successfully displayed ");

         Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
         LOG.info("Description of the products successfully displayed ");

         Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
         LOG.info("quantity of products successfully displayed ");

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
         Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
         LOG.info("SwagLabs logo successfully displayed ");

         homePageF.typeusername(username);
         homePageF.typepassword(password);
         homePageF.clickOnLoginButon();
         Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
         LOG.info("Products header successfully displayed ");

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
         LOG.info("Your cart header successfully displayed ");

         Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
         LOG.info("Description of the products successfully displayed ");

         Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
         LOG.info("quantity of products successfully displayed ");


         cartPage.clickOnContinueShopping();

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
         Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
         LOG.info("SwagLabs logo successfully displayed ");

         homePageF.typeusername(username);
         homePageF.typepassword(password);
         homePageF.clickOnLoginButon();
         Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
         LOG.info("Products header successfully displayed ");

         cartPage.clickOnAddItem1();

         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
         LOG.info("Your cart header successfully displayed ");
         Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
         LOG.info("Description of the products successfully displayed ");
         Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
         LOG.info("quantity of products successfully displayed ");

         cartPage.checkOut();
         Assert.assertTrue(cartPage.checkIfCheckOutHeaderIsDisplayed());
         LOG.info("CheckOut: Your infrormation header successfully displayed ");

         cartPage.typeFirstName("Fariza");
         cartPage.typeLastName("tadj");
         cartPage.typePostalCode("11214");
         cartPage.clickOnCtinueButon();
         Assert.assertTrue(cartPage.checkIfCheckOutOverviewHeaderIsDisplayed());
         LOG.info("CheckOut: Your infrormation header successfully displayed ");
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
        Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");


        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        Thread.sleep(2000);

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        LOG.info("Your cart header successfully displayed ");
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        LOG.info("Description of the products successfully displayed ");
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("quantity of products successfully displayed ");

        cartPage.checkOut();
        Assert.assertTrue(cartPage.checkIfCheckOutHeaderIsDisplayed());
        LOG.info("CheckOut: Your infrormation header successfully displayed ");
        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");
        Thread.sleep(2000);

        cartPage.clickOnCtinueButon();
        Assert.assertTrue(cartPage.checkIfCheckOutOverviewHeaderIsDisplayed());
        LOG.info("CheckOut:overview header successfully displayed ");
       // cartPage.checkOut();


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
        Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        LOG.info("Your cart header successfully displayed ");
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        LOG.info("Description of the products successfully displayed ");
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("quantity of products successfully displayed ");


        Thread.sleep(2000);

        cartPage.clickOnRemove();
        cartPage.clickOnRemoveItem2();
        Thread.sleep(2000);
        cartPage.checkOut();
        Assert.assertTrue(cartPage.checkIfCheckOutHeaderIsDisplayed());
        LOG.info("CheckOut: Your infrormation header successfully displayed ");

        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");
        Thread.sleep(2000);
        cartPage.clickOnCtinueButon();
        Assert.assertTrue(cartPage.checkIfCheckOutOverviewHeaderIsDisplayed());
        LOG.info("CheckOut:overview header successfully displayed ");

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
        Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        LOG.info("Your cart header successfully displayed ");
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        LOG.info("Description of the products successfully displayed ");
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("quantity of products successfully displayed ");

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
        Assert.assertTrue(cartPage.checkIfCheckOutOverviewHeaderIsDisplayed());
        LOG.info("CheckOut:overview header successfully displayed ");

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
        Assert.assertTrue(homePageF.checkIfLogoIsDisplayed());
        LOG.info("SwagLabs logo successfully displayed ");

        homePageF.typeusername(username);
        homePageF.typepassword(password);
        homePageF.clickOnLoginButon();
        Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
        LOG.info("Products header successfully displayed ");

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        LOG.info("Your cart header successfully displayed ");
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        LOG.info("Description of the products successfully displayed ");
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("quantity of products successfully displayed ");

        Thread.sleep(2000);
        cartPage.checkOut();

        cartPage.clickOnCtinueButon();

        String checkOutValidation = homePageF.checkOutcancelation();
        Assert.assertEquals(checkOutValidation, "Error: First Name is required");
        LOG.info("error message success");

    }
}
