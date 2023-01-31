package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.ItemPage;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAnItemToCompareList extends CommonAPI {



        Logger LOG = LogManager.getLogger(com.nopcommerce.test.AddAnItemToCompareList.class.getName());

        @Test

        public void addItem() throws InterruptedException {
            PageHome pagehome= new PageHome(getDriver());
            ItemPage itempage=new ItemPage(getDriver());
            itempage.setElectronicsLnk();
            Assert.assertTrue(itempage.checkIfElectronicsIsDisplayed());
            itempage.setCellPhonesLnk();
            Thread.sleep(1000);
//        Assert.assertTrue(iP.checkIfCellphonesiSDisplayed());
            itempage.clickOnNokiaPhone();
            Thread.sleep(1000);
            itempage.setAddtolist();
            LOG.info("Item added to compare list successfully");
        }
    }

