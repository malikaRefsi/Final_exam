package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import com.nopcommerce.pages.ResetPasswordPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class LoginTestNop extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginTestNop.class.getName());

    @Test


    public void loginTestNop() throws InterruptedException {
        PageHome hP = new PageHome(getDriver());
        PageLogin pL = new PageLogin(getDriver());
        ResetPasswordPage rP = new ResetPasswordPage(getDriver());

        String emailA ="juba91@gmail.com";
        String password ="123zxc";
        Assert.assertTrue(pL.checkIfNopCommerceIsDisplayed());
        hP.clickOnLoginButton();
        Assert.assertTrue(pL.checkIfAboutLoginDisplayed());
        pL.loginWithCorrectCred(emailA, password);
        Assert.assertTrue(rP.checkIfPasswordRecoveryIsDisplayed());
        LOG.info("login title page  success");
        Thread.sleep(2000);
        Assert.assertTrue(pL.checkIfOurStoreIsDisplayed());
        LOG.info("log in successfully ");
    }
}

