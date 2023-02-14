package com.orangeHRM.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.AdminPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestMenuAdminNationality extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestMenuAdminNationality.class.getName());
    String userName = ConnectDB.getTableColumnData("select * from credentials", "username").get(1);
    String password = ConnectDB.getTableColumnData("select * from credentials", "password").get(1);

    // we can use this before method since we need each time we run these test to login
//    @BeforeMethod
//    public void login() {
//        LoginPage loginPage=new LoginPage(getDriver());
//        HomePage homePage=new HomePage(getDriver());
//        Assert.assertTrue(loginPage.checkIfLoginLogoIsDisplayed());
//        LOG.info("we are in the login page ");
//        loginPage.login(userName,password);
//        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
//        LOG.info("we are successfully logged in ");
//    }
    @Test
    public void addNationalityTest() throws InterruptedException {

            LoginPage loginPage = new LoginPage(getDriver());
            HomePage homePage = new HomePage(getDriver());
            AdminPage adminPage = new AdminPage(getDriver());
            loginPage.login(userName, password);
            Faker faker = new Faker();
            adminPage.addNationality(faker.nation().nationality());

    }

    @Test(priority=1)
    public void TestVisibilityDeleteSelectedButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        adminPage.checkTheVisibilityOfDeleteSelectedButton();

    }
    @Test(priority=2)
    public void TestCancelAddingNationality() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        Faker faker=new Faker();
        adminPage.cancelAddingNationality(faker.nation().nationality());

    }
    @Test(priority=5) //the sixth in the list
    public void TestDeleteNationalityUsingTrashLogo() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        adminPage.deleteNationalityUsingTrashLogo();

    }
    @Test(priority=6)//the sixth in the list
    public void TestDeleteNationalityUsingUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        adminPage.deleteNationalityUsingDeleteSelectedButton();

    }
    @Test(priority=7)//the sixth and the seventh in the list
    public void TestDeleteMultipleNationalities3UsingUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        adminPage.deleteMultipleNationalitiesUsingDeleteSelectedButton();

    }

    @Test(priority=8)
    public void TestDeleteAllNationalitiesUsingDeleteSelectedButtonInTheCurrentSlide() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        adminPage.deleteAllNationalitiesUsingDeleteSelectedButton();

    }
    @Test(priority=4)
    public void TestEditeNationality() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName, password);
        Assert.assertTrue(homePage.checkIfDashBordIsDisplayedAsHeader());
        LOG.info("we are successfully landed in the homepage ");
        Faker faker=new Faker();
        adminPage.editeANationalityInTheRowFive(getDriver(),faker.nation().nationality());

    }


}
