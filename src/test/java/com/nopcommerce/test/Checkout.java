package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkout extends CommonAPI {
    Logger LOG = LogManager.getLogger(Checkout.class.getName());

    @Test
    public void checkoutItem() throws InterruptedException {
        PageHome pH= new PageHome(getDriver());

        String Store ="NoteBook";
        pH.searchStore(Store);
        pH.clickOnSearchButton();
        Thread.sleep(2000);
        SearchPage sP= new SearchPage(getDriver());
        sP.chooseAppleMac();
        Thread.sleep(2000);

        sP.clickOnAdd();
ShoppingCartPage sc= new ShoppingCartPage(getDriver());
        Assert.assertTrue(sP.checkIfNotiDisplayed());
        LOG.info("Item added to shopping cart succesufully");

        pH.clickOnCartLink();
        CheckoutPage cP=new CheckoutPage(getDriver());
        sc.Acceptterms();
        sc.clickCheckoutB();
        Assert.assertTrue(cP.checkIfWelcome());
        LOG.info("please sign in or checkout as a guest ");
        PageLogin pL=new PageLogin(getDriver());
        String emailA = "juba91@gmail.com";
        String password= "123zxc";
        pL.loginWithCorrectCred(emailA, password);
        cP.clickOnAgree();
        cP.clickOnCheckOutB();
        ContactInformationPage cI= new ContactInformationPage(getDriver());
        String city="denver";
        String address= "1234 e havana st ";
        String zip="80231";
        String pho="3031472583";
        cI.setInfoForShipping(city, address, zip, pho);
    }
            }
