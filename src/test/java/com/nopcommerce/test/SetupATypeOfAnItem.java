package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.ItemPage;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetupATypeOfAnItem extends CommonAPI {
    Logger LOG = LogManager.getLogger(SetupATypeOfAnItem.class.getName());

    @Test
    public void TypeofComputer() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        String Store= "Computer";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        SearchPage searchPage= new SearchPage(getDriver());
        searchPage.buildYourCom();
        searchPage.chooseprocessor();
        searchPage.chooseram();
        searchPage.sethdd();
        searchPage.chooseos();
        searchPage.choosesoftware();
        searchPage.clickOnaddcart2();
    }
    @Test
    public void TypeofShoes() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        String Store= "Shoes";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        SearchPage searchPage= new SearchPage(getDriver());
        Assert.assertTrue(searchPage.checkIfShoesDisplayed());
        ItemPage itempage= new ItemPage(getDriver());
      itempage.clickadidaslnk();
       itempage.clickadidassize();
        itempage.clickadidascolor();
        itempage.clickaddadidas();

    }
}
