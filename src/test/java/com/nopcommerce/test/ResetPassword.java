package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import com.nopcommerce.pages.ResetPasswordPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.io.File;

public class ResetPassword extends CommonAPI {
    Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

    @Test
    public void forgotPassword() throws InterruptedException {
        String filepath= System.getProperty("user.dir")+ File.separator+"data"+File.separator+"NopCommerceData.xlsx";
        ReadFromExcel read = new ReadFromExcel(filepath, "sheet1");
        String email = read.getCellValueForGivenHeaderAndKey("key", "email");
        PageHome homepage = new PageHome(getDriver());
        PageLogin pagelogin = new PageLogin(getDriver());
        String title = getCurrentTitle();
        homepage.clickOnLoginButton();

        pagelogin.setForgotPassword();

        ResetPasswordPage resetpasswordpage = new ResetPasswordPage(getDriver());
        resetpasswordpage.recoveryOfThePassword(email);
        Assert.assertTrue(resetpasswordpage.checkIfPasswordRecoveryIsDisplayed());
        LOG.info("Email with instructions has been sent to you.");
        LOG.info("password recovery");
    }


}
