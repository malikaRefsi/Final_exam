package com.orangeHRM.test;

import base.CommonAPI;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.TimePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utility.ConnectDB;

public class TestAttendanceConfiguration extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestAttendanceConfiguration.class.getName());
  //  @Test
    public void  changeAttendanceConfigurationBySelectAllTheIconsTest() throws Exception {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        TimePage timePage=new TimePage(getDriver());
        String userName= ConnectDB.getTableColumnData("select * from credentials","username").get(1);
        String password= ConnectDB.getTableColumnData("select * from credentials","password").get(1);
        loginPage.login(userName,password);
        timePage. changeAttendanceConfigurationBySelectAllTheIcons();

    }

}
