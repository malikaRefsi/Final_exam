package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.io.File;

public class LogOutNopTest extends CommonAPI{

    Logger LOG = LogManager.getLogger(com.nopcommerce.test.LogOutNopTest.class.getName());
    String filepath= System.getProperty("user.dir")+ File.separator+"data"+File.separator+"NopCommerceData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filepath, "sheet1");
    String email = read.getCellValueForGivenHeaderAndKey("key", "email");
    String password= read.getCellValueForGivenHeaderAndKey("key", "password");
    @Test
    public void logout() throws InterruptedException {
        PageHome pH= new PageHome(getDriver());
        PageLogin pL=new PageLogin(getDriver());
        pH.clickOnLoginButton();
//            String email= "juba4@gmail.com";
//            String password="123zxc";
        pL.loginWithCorrectCred(email, password);
        pL.logOut();
    }
}
