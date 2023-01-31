package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAnItemToShoppingCart extends CommonAPI {
    Logger LOG = LogManager.getLogger(com.nopcommerce.test.AddAnItemToCompareList.class.getName());

    @Test

    public void addItemToCart() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        String Store="Notebook";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Thread.sleep(2000);
        SearchPage searchpage= new SearchPage(getDriver());
        searchpage.chooseAppleMac();
        Thread.sleep(2000);

searchpage.clickOnAdd();

Assert.assertTrue(searchpage.checkIfNotiDisplayed());
        LOG.info("Item added to shopping cart succesufully");
    }
}


