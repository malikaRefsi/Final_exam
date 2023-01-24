package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class LoginTestNop extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginTestNop.class.getName());

    @Test


    public void loginTestNop() {
        PageHome hP = new PageHome(getDriver());
        PageLogin pL = new PageLogin(getDriver());



        String userName = ConnectDB.getTableColumnData("select * from credentials", "email").get(2);
        String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(2);
        hP.clickOnLoginButton();
        String title = getCurrentTitle();
        Assert.assertEquals(title, "Welcome, Please Sign In! ");
        LOG.info("login title page validation success");
        pL.typeUserName(userName);

        pL.typePassword(password);
        pL.clickONLoginButton();
    }
}

