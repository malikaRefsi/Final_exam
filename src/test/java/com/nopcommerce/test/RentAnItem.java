package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.RentalPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RentAnItem extends CommonAPI {

    Logger LOG = LogManager.getLogger(LoginTestNop.class.getName());

    @Test
    public void rentItem() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        String Store = "rent";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Thread.sleep(2000);
//        Assert.assertTrue(hP.checkIfSearchIsDisplayed());
        RentalPage rentalpage = new RentalPage(getDriver());

        rentalpage.clickOnOfNecklace();

        rentalpage.setBeginDate();
        rentalpage.setEndDate();
        rentalpage.clickOnRent();
        Assert.assertTrue(rentalpage.checkIfNotificationIsDisplayed());
    }
}

