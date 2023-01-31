package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortByLowToHigh extends CommonAPI {
    Logger LOG = LogManager.getLogger(SortByLowToHigh.class.getName());

    @Test
    public void LowToHigh() throws InterruptedException {
        PageHome hP = new PageHome(getDriver());
        String Store= "Shoes";
        hP.searchStore(Store);
        hP.clickOnSearchButton();
        Thread.sleep(2000);
        Assert.assertTrue(hP.checkIfSearchIsDisplayed());
        SearchPage sc=new SearchPage(getDriver());
        sc.sortByLowToHigh();
    }
    }

