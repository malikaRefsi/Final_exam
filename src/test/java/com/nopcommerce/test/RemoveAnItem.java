package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.ItemPage;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import com.nopcommerce.pages.ShoppingCartPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAnItem extends CommonAPI {
    Logger LOG = LogManager.getLogger(RemoveAnItem.class.getName());

    @Test
    public void removeItemFromShoppingCart() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        String Store = "Notebook";
        pagehome.searchStore(Store);
        pagehome.clickOnSearchButton();
        SearchPage searchpage = new SearchPage(getDriver());
        searchpage.chooseAppleMac();
        searchpage.clickOnAdd();
        Assert.assertTrue(searchpage.checkIfNotiDisplayed());
        LOG.info("Item added to shopping cart succesufully");
        ShoppingCartPage shoppingCartpage = new ShoppingCartPage(getDriver());
        pagehome.clickOnCartLink();
        shoppingCartpage.removeFromCart();
        LOG.info("item removed successfully");
        Assert.assertTrue(shoppingCartpage.checkIfEmptyCartDisplayed());
        LOG.info("Your shopping cart is empty");

    }
    @Test
    public void removeItemFromWishList() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        ItemPage itempage = new ItemPage(getDriver());
        itempage.setElectronicsLnk();
        Assert.assertTrue(itempage.checkIfElectronicsIsDisplayed());
        itempage.setCellPhonesLnk();
        itempage.clickOnNokiaPhone();
        itempage.setAddToWish();
        LOG.info("item to wish list successfully ");
        pagehome.clickOnWish();
        ShoppingCartPage shoppingCartPage= new ShoppingCartPage(getDriver());
        shoppingCartPage.removeFromWish();
        LOG.info("item removed ");
        Assert.assertTrue(shoppingCartPage.checkIfDisplayWIsh());
        LOG.info("wishlist empty");
    }
    @Test
    public void removeItemToCompareList() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        ItemPage itempage=new ItemPage(getDriver());
        itempage.setElectronicsLnk();
        Assert.assertTrue(itempage.checkIfElectronicsIsDisplayed());
        itempage.setCellPhonesLnk();
        itempage.clickOnNokiaPhone();
        itempage.setAddtolist();
        LOG.info("Item added to compare list successfully");
        ShoppingCartPage shoppingCartPage=new ShoppingCartPage(getDriver());
        shoppingCartPage.clickOnCompare();
        shoppingCartPage.setRemove3();
        LOG.info("item removed");
    }
}

