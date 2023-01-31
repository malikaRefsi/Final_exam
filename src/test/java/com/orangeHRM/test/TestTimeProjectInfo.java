package com.orangeHRM.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import com.orangeHRM.pages.AdminPage;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.TimePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.io.File;

public class TestTimeProjectInfo extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestMenuAdminNationality.class.getName());
//    @Test
    public void  addCostumerTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        Faker faker=new Faker();
        AdminPage adminPage=new AdminPage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        timePage.addCostumer("Grade"+faker.company().name());

    }
//    @Test
    public void  addProjectTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project1");
        String  costumer=readFromExcel.getCellValueForGivenHeaderAndKey("key","costumer");
        timePage.addProject(Project,costumer);

    }
//    @Test
    public void filterProjectsByGivenCustomerNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  costumer=readFromExcel.getCellValueForGivenHeaderAndKey("key","costumer1");
        timePage.filterProjectsByGivenCustomerName(costumer);

    }
//    @Test
    public void filterProjectsByGivenProjectNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project2");
        timePage.filterProjectsByGivenProjectName(Project);

    }
//    @Test
    public void filterProjectsByGivenProjectAdminNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key"," Project Admin Name");
        timePage.filterProjectsByGivenProjectAdminName(ProjectAdminName);

    }
//    @Test
    public void filterProjectsByGivenProjectAdminAndProjectNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project2");
        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key"," Project Admin Name");
        timePage.filterProjectsByGivenProjectAdminAndProjectName(Project,ProjectAdminName);

    }
    @Test
    public void filterProjectsByGivenProjectAdminAndProjectAndCostumerNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project2");
        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key"," Project Admin Name");
        String  costumer=readFromExcel.getCellValueForGivenHeaderAndKey("key","costumer2");
        timePage.filterProjectsByGivenProjectAdminAndProjectAndCostumerName(Project,ProjectAdminName,costumer);

    }

}
