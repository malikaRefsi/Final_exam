package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sorting extends CommonAPI {
    Logger LOG = LogManager.getLogger(Sorting.class.getName());

    @Test
    public void LowToHigh() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        String Store = "Shoes";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Thread.sleep(2000);
        Assert.assertTrue(pagehome.checkIfSearchIsDisplayed());
        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.sortByLowToHigh();
    }

    @Test
    public void HighToLow() {
        PageHome pagehome = new PageHome(getDriver());
        String Store = "Shoes";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Assert.assertTrue(pagehome.checkIfSearchIsDisplayed());
        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.sortByHighToLow();

    }
    @Test
    public void AToZ() {
        PageHome pagehome = new PageHome(getDriver());
        String Store = "Shoes";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Assert.assertTrue(pagehome.checkIfSearchIsDisplayed());
        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.sortByAToZ();

    }
    @Test
    public void ZToA() {
        PageHome pagehome = new PageHome(getDriver());
        String Store = "Shoes";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        Assert.assertTrue(pagehome.checkIfSearchIsDisplayed());
        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.sortByZtoA();

    }
}


