package com.orangeHRM.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.PIMpage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.awt.*;
import java.io.File;

public class TestMenuPimEmployeeList extends CommonAPI {

    Logger LOG = LogManager.getLogger( TestMenuPimEmployeeList.class.getName());
    String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
    String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
    @Test(priority = 1)
    public void searchEmployeeByEnteringTheIdTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String Id=readFromExcel.getCellValueForGivenHeaderAndKey("key","Employee Id");

        piMpage.searchEmployeeByEnteringTheId(Id);
    }

    @Test(priority = 2)
    public void searchEmployeeByEnteringTheEmployeeNameTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  EmployeeName=readFromExcel.getCellValueForGivenHeaderAndKey("key","Employee Name");
        piMpage.searchEmployeeByEnteringTheEmployeeName(EmployeeName);
    }
    @Test(priority = 3)
    public void searchEmployeeByEnteringTheSupervisorNameTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  SupervisorName=readFromExcel.getCellValueForGivenHeaderAndKey("key","Supervisor Name");
        piMpage.searchEmployeeByEnteringTheSupervisorName(SupervisorName);
    }
    @Test(priority = 4)
    public void searchEmployeeByEnteringTheEmploymentStatusTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String EmploymentStatus=readFromExcel.getCellValueForGivenHeaderAndKey("key","Employment Status");
        piMpage.searchEmployeeByEnteringTheEmploymentStatus(EmploymentStatus);
    }
    @Test(priority = 5)
    public void searchEmployeeByEnteringTheJobTitleTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  JobTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Job Title");
        piMpage.searchEmployeeByEnteringTheJobTitle(JobTitle);
    }
    @Test(priority = 6)
    public void searchEmployeeByEnteringTheSubUnitTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  SubUnit=readFromExcel.getCellValueForGivenHeaderAndKey("key","Sub Unit");
        piMpage.searchEmployeeByEnteringTheSubUnit(SubUnit);
    }

    @Test(priority = 7)
    public void searchEmployeeByEnteringTheIncludeTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Include=readFromExcel.getCellValueForGivenHeaderAndKey("key","Include");
        piMpage.searchEmployeeByEnteringTheInclude(Include);
    }
    @Test(priority = 8)
    public void searchEmployeeByEnteringTheIncludeAndSubUnitTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Include=readFromExcel.getCellValueForGivenHeaderAndKey("key","Include");
        String  SubUnit=readFromExcel.getCellValueForGivenHeaderAndKey("key","Sub Unit");
        piMpage.searchEmployeeByEnteringTheIncludeAndSubUnit(Include,SubUnit);
    }
    @Test(priority = 9)
    public void searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Include=readFromExcel.getCellValueForGivenHeaderAndKey("key","Include");
        String  SubUnit=readFromExcel.getCellValueForGivenHeaderAndKey("key","Sub Unit");
        String  JobTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Job Title");
        piMpage.searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitle(Include,SubUnit,JobTitle);
    }
    @Test(priority = 10)
    public void searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleAndEmploymentStatusTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  Include=readFromExcel.getCellValueForGivenHeaderAndKey("key","Include");
        String  SubUnit=readFromExcel.getCellValueForGivenHeaderAndKey("key","Sub Unit");
        String  JobTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Job Title");
        String EmploymentStatus=readFromExcel.getCellValueForGivenHeaderAndKey("key","Employment Status");
        piMpage.searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleAndEmploymentStatus(Include,SubUnit,JobTitle,EmploymentStatus);
    }
   @Test(priority = 11)
   public void resetSearchEmployeeTest () throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        Faker faker=new Faker();
       String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
       ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
       String  Include=readFromExcel.getCellValueForGivenHeaderAndKey("key","Include");
       String  SubUnit=readFromExcel.getCellValueForGivenHeaderAndKey("key","Sub Unit");
       String  JobTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Job Title");
       String EmploymentStatus=readFromExcel.getCellValueForGivenHeaderAndKey("key","Employment Status");
       piMpage.resetSearchEmployee(Include,SubUnit,JobTitle,EmploymentStatus,faker.name().fullName(),
               faker.name().fullName(), String.valueOf(faker.idNumber()));
    }


      @Test (dataProvider="EmployeeInfo",priority = 0)
      public void addUsersTest(String firstName, String Id, String lastName, String fileName) throws InterruptedException, AWTException {
          LoginPage loginPage=new LoginPage(getDriver());
          HomePage homePage=new HomePage(getDriver());
          PIMpage piMpage=new PIMpage(getDriver());
          loginPage.login(userName,password);
          homePage.clickOnPIMFromMenu();
          Faker faker=new Faker();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
          Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
          LOG.info("we are successfully landed in the PIM page");
            piMpage.addUser(firstName,lastName,fileName,getDriver(),Id);

      }

    @DataProvider(name="EmployeeInfo")
    public Object[][] getData3(){
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet3");
        int totalRows=9;
        int totalColumns=4;
        String employeeInfo[][]=new String[totalRows][totalColumns];
        for (int i=1; i<=totalRows;i++){
            for (int j=0;j<totalColumns;j++){
                employeeInfo[i-1][j]=readFromExcel.getDataFromCell(i,j);
            }
        }
        return employeeInfo;
    }

    @Test(priority =16 ) //the fifth in the list of the users
    public void TestDeleteUserUsingTrashLogo() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        LOG.info("The number of the users in Employee list before deleting: "+ piMpage.numberOfEmployeeInList());
        piMpage.deleteAUserInEmployeeListUsingTrashLogo(getDriver());
       // piMpage.getToastMessageAfterDeletingUsers();
        Thread.sleep(1000);
        String  messageAfterDeleteUser=readFromExcel.getCellValueForGivenHeaderAndKey("key","Message After deleting a User");
        Assert.assertEquals(piMpage.getToastMessageAfterDeletingUsers(),messageAfterDeleteUser);
        LOG.info("the user successfully deleted using the trash Logo");
        Thread.sleep(3000);
        LOG.info("The number of the users in Employee list after deleting: "+ piMpage.numberOfEmployeeInList());
    }
    @Test(priority =17) //the fifth in the list of the users
    public void TestDeleteUserUsingDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        LOG.info("The number of the users in Employee list before deleting: "+ piMpage.numberOfEmployeeInList());
        piMpage.deleteAUserInEmployeeListUsingDeleteSelectedButton(getDriver());
       // piMpage.getToastMessageAfterDeletingUsers();
        Thread.sleep(2000);
        String  messageAfterDeleteUser=readFromExcel.getCellValueForGivenHeaderAndKey("key","Message After deleting a User");
        Assert.assertEquals(piMpage.getToastMessageAfterDeletingUsers(),messageAfterDeleteUser);
        LOG.info("the user successfully deleted using the Delete Selected Button");
        Thread.sleep(5000);
        LOG.info("The number of the users in Employee list after deleting: "+ piMpage.numberOfEmployeeInList());

    }
    @Test(priority = 12)
    public void TestVisibilityDeleteSelectedButton() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        piMpage.checkTheVisibilityOfDeleteSelectedButton();

    }
//    @Test(priority = 18) //(dependsOnMethods = "addUsersTest",alwaysRun = true)//the fifth in the list of the users
    public void TestDeleteAllTheUsers() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        Thread.sleep(2000);
        LOG.info("The number of the users in Employee list before deleting: "+ piMpage.numberOfEmployeeInList());
        piMpage.deleteAllUserInEmployeeList(getDriver());
        piMpage.getToastMessageAfterDeletingUsers();
        Thread.sleep(2000);
        String  messageAfterDeleteUser=readFromExcel.getCellValueForGivenHeaderAndKey("key","Message After deleting a User");
        Assert.assertEquals(piMpage.getToastMessageAfterDeletingUsers(),messageAfterDeleteUser);
        LOG.info("the user successfully deleted");
        Thread.sleep(5000);
        LOG.info("The number of the users in Employee list after deleting: "+ piMpage.numberOfEmployeeInList());


    }
    @Test(priority = 13) // including edite nick name,SSN and Smoke checkbox for the fifth employee in the list
    public void editePersonalDetailsOfAnEmployeeTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        String  nikeName=readFromExcel.getCellValueForGivenHeaderAndKey("key","nick name");
        String  ssn=readFromExcel.getCellValueForGivenHeaderAndKey("key","SSN");
        piMpage.editePersonalDetailsOfAnEmployee(nikeName,ssn);
        piMpage.getToastMessageAfterAddUser();
        Thread.sleep(2000);
        String  messageAfterUpdate=readFromExcel.getCellValueForGivenHeaderAndKey("key","Message After updating a User information");
        Assert.assertEquals(piMpage.getToastMessageAfterAddUser(),messageAfterUpdate);
        LOG.info("the personal details successfully edited ");
        Thread.sleep(4000);

    }

        @Test(priority = 14) //the fifth in the list of the users
    public void editeProfilePictureOfAnEmployeesTest() throws InterruptedException, AWTException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        String  pictureFileNane=readFromExcel.getCellValueForGivenHeaderAndKey("key","Profile picture file name");
        piMpage.editeProfilePictureOfAnEmployees(pictureFileNane);
    }
    @Test(priority = 15) //the fifth in the list of the users
    public void addAnAttachmentToAnEmployeesInformationTest() throws InterruptedException, AWTException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        PIMpage piMpage=new PIMpage(getDriver());
        loginPage.login(userName,password);
        homePage.clickOnPIMFromMenu();
        String filePath=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"orangehrmData.xlsx";
        ReadFromExcel readFromExcel=new ReadFromExcel(filePath,"sheet1");
        String  headerTitle=readFromExcel.getCellValueForGivenHeaderAndKey("key","Header When PIM Selected");
        Assert.assertEquals(piMpage.getHeaderWhenPIMSelected(),headerTitle);
        LOG.info("we are successfully landed in the PIM page");
        String  pictureFileNane=readFromExcel.getCellValueForGivenHeaderAndKey("key","Profile picture file name");
        piMpage.addAnAttachmentToAnEmployeesInformation(pictureFileNane);
    }



    }
