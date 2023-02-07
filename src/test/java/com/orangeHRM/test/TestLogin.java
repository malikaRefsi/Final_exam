package com.orangeHRM.test;

import base.CommonAPI;
import com.orangeHRM.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.orangeHRM.pages.HomePage;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.io.File;


public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger( TestLogin.class.getName());
    String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
    String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);


     @Test // (groups={"grp1"})
    public void loginWithValidCredentials() {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        loginPage.login(userName,password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully logged in ");


    }
    @Test(dataProvider = "InvalidCredentialsData")

    public void loginWithInvalidCredentials(String userName,String password) {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        loginPage.login(userName,password);
        String actualTextErrorLogin=loginPage.getLoginError();
        Assert.assertEquals(actualTextErrorLogin,"Invalid credentials");
        LOG.info("the login with invalid credentials successfully denied ");


    }
    @DataProvider(name="InvalidCredentialsData")
    public Object[][] getData(){
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet2");
        int totalRows=3;
        int totalColumns=2;
        String invalidCredentialsData[][]=new String[totalRows][totalColumns];
        for (int i=1; i<=totalRows;i++){
            for (int j=0;j<totalColumns;j++){
                invalidCredentialsData[i-1][j]=readFromExcel.getDataFromCell(i,j);
            }
        }
        return invalidCredentialsData;
    }


    @Test//(groups={"grp1"})
    public void forgotAndResetPasswordTest() {
        LoginPage loginPage=new LoginPage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        loginPage.resetPassWord(getDriver(),userName);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String title=readFromExcel.getCellValueForGivenHeaderAndKey("key","RestPasswordConfirmationText");
        String actualRestPasswordConfirmationText=loginPage.getResetPasswordText();
        Assert.assertEquals(actualRestPasswordConfirmationText,title);
        LOG.info("Reset Password link sent successfully ");


    }
    @Test
    public void cancelResettingAPasswordTest() {
        LoginPage loginPage=new LoginPage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        loginPage.cancelResetPassWord(getDriver(),userName);
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are successfully back to the login page ");


    }
    @Test
    public void changeAPasswordTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
        LOG.info("we are in the login page ");
        loginPage.login(userName,password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully logged in ");
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String newPassword=readFromExcel.getCellValueForGivenHeaderAndKey("key","password");

        homePage.updatePassword(password,newPassword);
        Thread.sleep(2000);
        String confirmationToastMessage=readFromExcel.getCellValueForGivenHeaderAndKey("key","Update password confirmation");
        Assert.assertEquals(homePage.getToastMessage(),confirmationToastMessage);
        LOG.info("the password successfully changed");
    }


}
