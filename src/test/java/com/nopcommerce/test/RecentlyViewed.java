package com.nopcommerce.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import com.nopcommerce.pages.RegistrationPage;
import com.nopcommerce.pages.ResetPasswordPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class RecentlyViewed extends CommonAPI {
    Logger LOG = LogManager.getLogger(RecentlyViewed.class.getName());

    @Test
    public void ViewedItem() throws InterruptedException {
        PageHome pagehome= new PageHome(getDriver());
        pagehome.clickOnrecently();

        LOG.info("List of items recently viewed");
    }

}
