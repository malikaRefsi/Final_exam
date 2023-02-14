package com.orangeHRM.test;

import base.CommonAPI;
import com.orangeHRM.pages.AdminPage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.TimePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.io.File;

public class TestTimeProjectInfo extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestMenuAdminNationality.class.getName());
    String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
    String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
   @Test(dataProvider = "CostumersData")
    public void  addCostumerTest(String costumerName) throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
//        Faker faker=new Faker();
        AdminPage adminPage=new AdminPage(getDriver());
        loginPage.login(userName,password);
//        timePage.addCostumer(faker.company().name());
        timePage.addCostumer(costumerName);

    }
    @DataProvider(name="CostumersData")
    public Object[][] getData1(){
        String costumersData[][]={
                { "Apache Software Foundation"},
                {"Internal"},
                {"Apache Software Foundation"},
                {"ACME Ltd"},
                {"FreeWave Technologies, Inc"},
        };
        return costumersData;
    }
//    @Test(dataProvider = "ProjectsData")
//    public void  addProjectTest() throws Exception {
//        LoginPage loginPage=new LoginPage(getDriver());
//        TimePage timePage=new TimePage(getDriver());
//        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
//        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
//        loginPage.login(userName,password);
//        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
//        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
//        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project1");
//        String  costumer=readFromExcel.getCellValueForGivenHeaderAndKey("key","costumer1");
//        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project Admin Name");
//        timePage.addProject(Project,costumer,ProjectAdminName);
//
//    }
@Test(dataProvider = "ProjectsData")
public void  addProjectTest(String ProjectName,String costumerName,String ProjectAdminName) throws Exception {
    LoginPage loginPage=new LoginPage(getDriver());
    TimePage timePage=new TimePage(getDriver());
    loginPage.login(userName,password);
   timePage.addProject(ProjectName,costumerName,ProjectAdminName);

}
@DataProvider(name="ProjectsData")
public Object[][] getData2(){
            String projectsData[][]={
                    { "ASF - Phase 1","Apache Software Foundation",  "Charlie Carter"},
                    {"Training round 3","Internal","Lisa  Andrews"},
                    {"maintenance","Apache Software Foundation","Cecil  Bonaparte"},
                    {"website maintenance","ACME Ltd","Peter Mac Anderson"},
                    {"Training","FreeWave Technologies, Inc","Rebecca  Harmony"},
            };
                    return projectsData;
}

    @Test//I tested search functionality
    public void filterProjectsByGivenCustomerNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  costumer=readFromExcel.getCellValueForGivenHeaderAndKey("key","costumer1");
        timePage.filterProjectsByGivenCustomerName(costumer);

    }
    @Test
    public void filterProjectsByGivenProjectNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project2");
        timePage.filterProjectsByGivenProjectName(Project);

    }
    @Test
    public void filterProjectsByGivenProjectAdminNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project Admin Name");
        timePage.filterProjectsByGivenProjectAdminName(ProjectAdminName);

    }
    @Test
    public void filterProjectsByGivenProjectAdminAndProjectNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project2");
        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project Admin Name");
        timePage.filterProjectsByGivenProjectAdminAndProjectName(Project,ProjectAdminName);

    }
   @Test
    public void filterProjectsByGivenProjectAdminAndProjectAndCostumerNameTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Project=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project2");
        String  ProjectAdminName=readFromExcel.getCellValueForGivenHeaderAndKey("key","Project Admin Name");
        String  costumer=readFromExcel.getCellValueForGivenHeaderAndKey("key","costumer2");
        timePage.filterProjectsByGivenProjectAdminAndProjectAndCostumerName(Project,ProjectAdminName,costumer);

    }

}
