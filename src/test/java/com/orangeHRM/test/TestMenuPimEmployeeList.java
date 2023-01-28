package com.orangeHRM.test;

import base.CommonAPI;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.PIMpage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestMenuPimEmployeeList extends CommonAPI {

    Logger LOG = LogManager.getLogger( TestMenuPimEmployeeList.class.getName());
//    @Test
    public void searchEmployeeByEnteringTheIdTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheId("0099");
    }

//    @Test
    public void searchEmployeeByEnteringTheEmployeeNameTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheEmployeeName("Garry White");
    }
//    @Test
    public void searchEmployeeByEnteringTheSupervisorNameTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheSupervisorName("Linda Anderson");
    }
//    @Test
    public void searchEmployeeByEnteringTheEmploymentStatusTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheEmploymentStatus("Full-Time Contract");
    }
//    @Test
    public void searchEmployeeByEnteringTheJobTitleTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheJobTitle("Account Assistant");
    }
//    @Test
    public void searchEmployeeByEnteringTheSubUnitTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheSubUnit("Quality Assurance");
    }

    @Test
    public void searchEmployeeByEnteringTheIncludeTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheInclude("Current Employees Only");
    }
//    @Test
    public void searchEmployeeByEnteringTheIncludeAndSubUnitTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheIncludeAndSubUnit("Current Employees Only","Quality Assurance");
    }
//    @Test
    public void searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitle("Current Employees Only","Quality Assurance","Account Assistant");
    }
//    @Test
    public void searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleAndEmploymentStatusTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        piMpage.searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleAndEmploymentStatus("Current Employees Only","Quality Assurance","Account Assistant","Full-Time Contract");
    }


//      @Test
    public void addUsersTest() throws InterruptedException {
          LoginPage loginPage=new LoginPage(getDriver());
          HomePage homePage=new HomePage(getDriver());
          PIMpage piMpage=new PIMpage(getDriver());
          String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
          String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
          loginPage.login(userName,password);
          homePage.clickOnPIMFromMenu();
          Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),"PIM");
          LOG.info("we are successfully landed in the PIM page");
            piMpage.addUser("mika","ref");
            Thread.sleep(2000);
          Assert.assertEquals(piMpage.getToastMessageAfterAddUser(),"Successfully Saved");
          LOG.info("the user successfully added");

      }

//    @Test
    public void TestDeleteUserUsingTrashLogo() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),"PIM");
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        LOG.info("The number of the users in Employee list before deleting: "+ piMpage.numberOfEmployeeInList());
        piMpage.deleteAUserInEmployeeListUsingTrashLogo(getDriver());
        piMpage.getToastMessageAfterDeletingUsers();
        Thread.sleep(2000);
        Assert.assertEquals(piMpage.getToastMessageAfterAddUser(),"Successfully Deleted");
        LOG.info("the user successfully deleted using the trash Logo");
        Thread.sleep(5000);
        LOG.info("The number of the users in Employee list after deleting: "+ piMpage.numberOfEmployeeInList());
    }
//    @Test
    public void TestDeleteUserUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),"PIM");
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        LOG.info("The number of the users in Employee list before deleting: "+ piMpage.numberOfEmployeeInList());
        piMpage.deleteAUserInEmployeeListUsingDeleteSelectedButton(getDriver());
        piMpage.getToastMessageAfterDeletingUsers();
        Thread.sleep(2000);
        Assert.assertEquals(piMpage.getToastMessageAfterAddUser(),"Successfully Deleted");
        LOG.info("the user successfully deleted using the Delete Selected Button");
        Thread.sleep(5000);
        LOG.info("The number of the users in Employee list after deleting: "+ piMpage.numberOfEmployeeInList());

    }
//    @Test
    public void TestVisibilityDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),"PIM");
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        piMpage.checkTheVisibilityOfDeleteSelectedButton();

    }
//    @Test
    public void TestDeleteAllTheUsers() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),"PIM");
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        LOG.info("The number of the users in Employee list before deleting: "+ piMpage.numberOfEmployeeInList());
        piMpage.deleteAllUserInEmployeeList(getDriver());
        piMpage.getToastMessageAfterDeletingUsers();
        Thread.sleep(2000);
        Assert.assertEquals(piMpage.getToastMessageAfterAddUser(),"Successfully Deleted");
        LOG.info("the user successfully deleted");
        Thread.sleep(5000);
        LOG.info("The number of the users in Employee list after deleting: "+ piMpage.numberOfEmployeeInList());


    }
//    @Test // including edite nick name,SSN and SIN numbers
    public void editePersonalDetailsOfAnEmployeeTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),"PIM");
        LOG.info("we are successfully landed in the PIM page");
        piMpage.editePersonalDetailsOfAnEmployee("joni","1223345","234567");
        piMpage.getToastMessageAfterAddUser();
        Thread.sleep(2000);
        Assert.assertEquals(piMpage.getToastMessageAfterAddUser(),"Successfully Updated");
        LOG.info("the personal details successfully edited ");
        Thread.sleep(4000);

    }


    }
