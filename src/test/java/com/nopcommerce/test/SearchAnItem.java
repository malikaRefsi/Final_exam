package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAnItem extends CommonAPI {

        Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

        @Test
        public void SearchShoes() throws InterruptedException {
            PageHome hP = new PageHome(getDriver());
            String Store= "Shoes";
            hP.searchStore(Store);
            hP.clickOnSearchButton();
            Thread.sleep(2000);
            Assert.assertTrue(hP.checkIfSearchIsDisplayed());
        }
    }


