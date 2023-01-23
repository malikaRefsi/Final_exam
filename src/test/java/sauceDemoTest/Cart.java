package sauceDemoTest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemoPages.CartPage;
import sauceDemoPages.HomePage;

public class Cart extends CommonAPI {
    Logger LOG = LogManager.getLogger(Cart.class.getName());

    /* @Test
     //4
     public void AddToCartTest() throws InterruptedException {
         HomePage homePage = new HomePage(getDriver());
         CartPage cartPage = new CartPage(getDriver());
         String expectedTitle = "Swag Labs";
         String actualTitle = getCurrentTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
         LOG.info("land to saucedemo success");

         homePage.typeusername("standard_user");
         homePage.typepassword("secret_sauce");
         homePage.clickOnLoginButon();

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
         HomePage homePage = new HomePage(getDriver());
         CartPage cartPage = new CartPage(getDriver());
         String expectedTitle = "Swag Labs";
         String actualTitle = getCurrentTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
         LOG.info("land to saucedemo success");

         homePage.typeusername("standard_user");
         homePage.typepassword("secret_sauce");
         homePage.clickOnLoginButon();

         cartPage.clickOnAddItem1();
         cartPage.clickOnRemove();

     }

     //6
     @Test
     public void removeFromShoppingCart() throws InterruptedException {
         HomePage homePage = new HomePage(getDriver());
         CartPage cartPage = new CartPage(getDriver());
         String expectedTitle = "Swag Labs";
         String actualTitle = getCurrentTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
         LOG.info("land to saucedemo success");

         homePage.typeusername("standard_user");
         homePage.typepassword("secret_sauce");
         homePage.clickOnLoginButon();

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         cartPage.clickOnRemove();
     }

     //7
     @Test
     public void continueShopping() throws InterruptedException {
         HomePage homePage = new HomePage(getDriver());
         CartPage cartPage = new CartPage(getDriver());
         String expectedTitle = "Swag Labs";
         String actualTitle = getCurrentTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
         LOG.info("land to saucedemo success");

         homePage.typeusername("standard_user");
         homePage.typepassword("secret_sauce");
         homePage.clickOnLoginButon();

         cartPage.clickOnAddItem1();
         cartPage.clickOnShoppingCart();
         cartPage.clickOnContinueShopping();
         //cartPage.clickOnAddToCartButton();


     }

     //8
     @Test

     public void checkOutOneItem() throws InterruptedException {
         HomePage homePage = new HomePage(getDriver());
         CartPage cartPage = new CartPage(getDriver());
         String expectedTitle = "Swag Labs";
         String actualTitle = getCurrentTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
         LOG.info("land to saucedemo success");

         homePage.typeusername("standard_user");
         homePage.typepassword("secret_sauce");
         homePage.clickOnLoginButon();

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
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
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

        String checkOutValidation = homePage.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");

    }

    //10
    @Test
    public void checkOutAfterRemovingItems() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
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

        String checkOutValidation = homePage.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");
    }*/
    //11
    @Test
    public void checkOutCancel() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();
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

        String checkOutValidation = homePage.checkOutValidation();
        Assert.assertEquals(checkOutValidation, "THANK YOU FOR YOUR ORDER");
        LOG.info("checkOut message Validation");
    }

    //12
    @Test
    public void NoInformationsCheckOut() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        cartPage.clickOnAddItem1();
        cartPage.clickOnAddTItem2();
        cartPage.clickOnAddItem3();
        cartPage.clickOnAdditem4();
        cartPage.clickOnShoppingCart();
        Thread.sleep(2000);
        cartPage.checkOut();
        cartPage.clickOnCtinueButon();

        String checkOutValidation = homePage.checkOutcancelation();
        Assert.assertEquals(checkOutValidation, "Error: First Name is required");
        LOG.info("error message success");

    }
}