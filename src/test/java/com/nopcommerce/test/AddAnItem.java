package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.ItemPage;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAnItem extends CommonAPI {



    Logger LOG = LogManager.getLogger(AddAnItem.class.getName());

    @Test

    public void addItemToCompareList() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        ItemPage itempage=new ItemPage(getDriver());
        itempage.setElectronicsLnk();
        Assert.assertTrue(itempage.checkIfElectronicsIsDisplayed());
        itempage.setCellPhonesLnk();
        Assert.assertTrue(pagehome.checkIfCellIsDisplayed());
        itempage.clickOnNokiaPhone();
        itempage.setAddtolist();
        LOG.info("Item added to compare list successfully");
    }
    @Test
    public void addItemToCart() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        String Store="Notebook";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        SearchPage searchpage= new SearchPage(getDriver());
        searchpage.chooseAppleMac();
        searchpage.clickOnAdd();
        Assert.assertTrue(searchpage.checkIfNotiDisplayed());
        LOG.info("Item added to shopping cart succesufully");
    }
    @Test
    public void addItemToWishList() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        ItemPage itempage = new ItemPage(getDriver());
        itempage.setElectronicsLnk();
        Assert.assertTrue(itempage.checkIfElectronicsIsDisplayed());
        itempage.setCellPhonesLnk();
        itempage.clickOnNokiaPhone();
        itempage.setAddToWish();
        LOG.info("item to wish list successfully ");
    }
}