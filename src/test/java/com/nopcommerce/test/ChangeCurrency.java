package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.CurrencyPage;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrency extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginTestNop.class.getName());

    @Test
    public void changeToEuro() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        CurrencyPage  currencypage=new CurrencyPage(getDriver());
//        Assert.assertTrue(pagehome.checkIfNopCommerceDisplayed());
        currencypage.setCurrency();
        currencypage.setToEuro();
        LOG.info("currency change to euro successfully");
    }
    @Test
    public void changeToDollar() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        CurrencyPage  currencypage=new CurrencyPage(getDriver());
//        Assert.assertTrue(pagehome.checkIfNopCommerceDisplayed());
        currencypage.setCurrency();
        currencypage.setToDollar();
        LOG.info("currency change to dollar successfully");
    }

}
