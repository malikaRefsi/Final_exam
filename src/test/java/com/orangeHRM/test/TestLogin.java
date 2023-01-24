package com.orangeHRM.test;

import base.CommonAPI;
import com.orangeHRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.orangeHRM.pages.HomePage;
import utility.ConnectDB;

public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger( TestLogin.class.getName());
  //  @Test
    public void loginWithValidCredentials() {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully logged in ");


    }
//    @Test
    public void loginWithInvalidCredentials() {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(2);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(2);
        loginPage.login(userName,password);
        String actualTextErrorLogin=loginPage.getLoginError();
        Assert.assertEquals(actualTextErrorLogin,"Invalid credentials");
        LOG.info("the login with invalid credentials successfully denied ");


    }

//    @Test
    public void forgotAndResetPasswordTest() {
        LoginPage loginPage=new LoginPage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        loginPage.resetPassWord(getDriver(),userName);
        String actualRestPasswordConfirmationText=loginPage.getResetPasswordText();
        Assert.assertEquals(actualRestPasswordConfirmationText,"Reset Password link sent successfully");
        LOG.info("Reset Password link sent successfully ");


    }
//    @Test
    public void cancelResettingAPasswordTest() {
        LoginPage loginPage=new LoginPage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        loginPage.cancelResetPassWord(getDriver(),userName);
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are successfully back to the login page ");


    }
//    @Test
    public void changeAPasswordTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully logged in ");
        homePage.updatePassword(password,"malikA1989$");
        Thread.sleep(3000);
        Assert.assertEquals(homePage.getToastMessage(),"Successfully Saved");
        LOG.info("the password successfully changed");
    }


}
