package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAnItem extends CommonAPI {

    Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

    @Test
    public void SearchAdidas() throws InterruptedException {
        PageHome  pagehome = new PageHome(getDriver());
        String Store= "Adidas Shoes";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Assert.assertTrue(pagehome.checkIfSearchIsDisplayed());
        SearchPage searchPage= new SearchPage(getDriver());
        LOG.info("Adidas shoes found successfully");

    }
    @Test
    public void SearchMacBook() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        String Store= "Macbook";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Assert.assertTrue(pagehome.checkIfSearchIsDisplayed());
        SearchPage searchpage= new SearchPage(getDriver());
        LOG.info("Macbook found successfully");
    }
}


