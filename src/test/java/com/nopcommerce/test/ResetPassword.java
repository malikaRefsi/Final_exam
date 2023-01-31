package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import com.nopcommerce.pages.ResetPasswordPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetPassword extends CommonAPI {
    Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

    @Test
    public void forgotPassword() throws InterruptedException {
        PageHome hP = new PageHome(getDriver());
        PageLogin pL = new PageLogin(getDriver());
        String title = getCurrentTitle();
        hP.clickOnLoginButton();
        Thread.sleep(2000);
        pL.setForgotPassword();
        Thread.sleep(2000);
        ResetPasswordPage rP = new ResetPasswordPage(getDriver());
        Thread.sleep(2000);
        String email ="juba91@gmail.com";

        rP.recoveryOfThePassword(email);
        Thread.sleep(2000);
        Assert.assertTrue(rP.checkIfPasswordRecoveryIsDisplayed());
        LOG.info("Email with instructions has been sent to you.");
        LOG.info("password recovery");
    }


}
