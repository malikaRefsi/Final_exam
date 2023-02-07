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

public class Cart extends CommonAPI {
    Logger LOG = LogManager.getLogger(Cart.class.getName());
    String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"fariData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filePath, "sheetN1");

     @Test
     public void addBackPackToCartTest() throws InterruptedException {
         HomePageF homePageF = new HomePageF(getDriver());
         CartPage cartPage = new CartPage(getDriver());
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

         cartPage.clickOnAddItem1();
         Assert.assertTrue(cartPage.checkIfNum1yIsDisplayed());

         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
         Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
         Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
         LOG.info("Your cart header,quantity and Description of products successfully displayed ");

         String expectedTitle2 = "Swag Labs";
         String actualTitle2 = getCurrentTitle();
         Assert.assertEquals(expectedTitle2, actualTitle2);
         LOG.info("login title page validation success");
     }
     @Test
    public void addBikeLightToCartTest() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
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

        cartPage.clickOnAddTItem2();
         Assert.assertTrue(cartPage.checkIfNum1yIsDisplayed());

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");

        String expectedTitle2 = "Swag Labs";
        String actualTitle2 = getCurrentTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        LOG.info("login title page validation success");
    }



     @Test
     public void removeBackPackFromHomePage() throws InterruptedException {
         HomePageF homePageF = new HomePageF(getDriver());
         CartPage cartPage = new CartPage(getDriver());
         String username = ConnectDB.getTableColumnData("select * from credf", "username").get(0);
         String password = ConnectDB.getTableColumnData("select * from credf", "password").get(0);

         String expectedTitle = read.getCellValueForGivenHeaderAndKey("key", "homepage title");
         String actualTitle = getCurrentTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
         LOG.info("land to saucedemo success");
         Assert.assertTrue(homePageF.checkIfLogoSwagIsDisplayed());;
         LOG.info("SwagLabs logo successfully displayed ");

         homePageF.typeusername(username);
         homePageF.typepassword(password);
         homePageF.clickOnLoginButon();
         Assert.assertTrue(homePageF.checkIfProductsIsDisplayed());
         LOG.info("Products header successfully displayed ");

         cartPage.clickOnAddItem1();
         Assert.assertTrue(cartPage.checkIfNum1yIsDisplayed());

         cartPage.clickOnRemove();

     }


     @Test
     public void removeBackPackFromShoppingCart() throws InterruptedException {
         HomePageF homePageF = new HomePageF(getDriver());
         CartPage cartPage = new CartPage(getDriver());
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

         cartPage.clickOnAddItem1();
         Assert.assertTrue(cartPage.checkIfNum1yIsDisplayed());

         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
         Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
         Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
         LOG.info("Your cart header,quantity and Description of products successfully displayed ");

         cartPage.clickOnRemove();
     }

    @Test

     public void continueShopping() throws InterruptedException {
         HomePageF homePageF = new HomePageF(getDriver());
         CartPage cartPage = new CartPage(getDriver());
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

         cartPage.clickOnAddItem1();
        Assert.assertTrue(cartPage.checkIfNum1yIsDisplayed());

         cartPage.clickOnShoppingCart();
         Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");


         cartPage.clickOnContinueShopping();

     }


     @Test

     public void checkOutSingleItem() throws InterruptedException {
         HomePageF homePageF = new HomePageF(getDriver());
         CartPage cartPage = new CartPage(getDriver());
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

         cartPage.clickOnAddItem1();
         Assert.assertTrue(cartPage.checkIfNum1yIsDisplayed());

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

     }

    @Test
    public void checkOutMultipleItems() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
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


        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        Assert.assertTrue(cartPage.checkIfNum4IsDisplayed());

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");

        cartPage.checkOut();
        Assert.assertTrue(cartPage.checkIfCheckOutHeaderIsDisplayed());
        LOG.info("CheckOut: Your infrormation header successfully displayed ");
        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");

        cartPage.clickOnCtinueButon();
        Assert.assertTrue(cartPage.checkIfCheckOutOverviewHeaderIsDisplayed());
        LOG.info("CheckOut:overview header successfully displayed ");

        cartPage.clickOnFinishButton();
        String checkOutValidation = homePageF.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");

    }


    @Test
    public void checkOutAfterRemovingItems() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
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

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        Assert.assertTrue(cartPage.checkIfNum4IsDisplayed());

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");

        cartPage.clickOnRemove();
        cartPage.clickOnRemoveItem2();
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

    @Test
    public void checkOutCancel() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
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

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        Assert.assertTrue(cartPage.checkIfNum4IsDisplayed());

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");

        cartPage.checkOut();

        cartPage.clickOncancel();
        cartPage.clickOnRemove();
        cartPage.clickOnRemoveItem2();
        cartPage.checkOut();

        cartPage.typeFirstName("Fariza");
        cartPage.typeLastName("tadj");
        cartPage.typePostalCode("11214");

        cartPage.clickOnCtinueButon();
        Assert.assertTrue(cartPage.checkIfCheckOutOverviewHeaderIsDisplayed());
        LOG.info("CheckOut:overview header successfully displayed ");

        cartPage.clickOnFinishButton();
        String checkOutValidation = homePageF.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");
    }

    @Test
    public void NoInformationsCheckOut() throws InterruptedException {
        HomePageF homePageF = new HomePageF(getDriver());
        CartPage cartPage = new CartPage(getDriver());
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

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        Assert.assertTrue(cartPage.checkIfNum4IsDisplayed());

        cartPage.clickOnShoppingCart();
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfYourCartHeaderIsDisplayed());
        Assert.assertTrue(cartPage.checkIfDescriptionIsDisplayed());
        Assert.assertTrue(cartPage.checkIfQuantityIsDisplayed());
        LOG.info("Your cart header,quantity and Description of products successfully displayed ");

        cartPage.checkOut();
        cartPage.clickOnCtinueButon();

        String checkOutValidation = homePageF.checkOutcancelation();
        Assert.assertEquals(checkOutValidation, "Error: First Name is required");
        LOG.info("error message success");

    }
}
