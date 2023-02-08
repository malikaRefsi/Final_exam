package com.nopcommerce.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import com.nopcommerce.pages.RegistrationPage;
import com.nopcommerce.pages.ResetPasswordPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConnectDB;
import utility.ReadFromExcel;

import java.io.File;

public class LoginTestNop extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginTestNop.class.getName());

    String filepath = System.getProperty("user.dir") + File.separator + "data" + File.separator + "NopCommerceData.xlsx";
    ReadFromExcel read = new ReadFromExcel(filepath, "sheet1");

    @Test
    public void registrationTest2() throws InterruptedException {

        LOG.info("I click on register link");
        PageHome pagehome = new PageHome(getDriver());
        PageLogin pagelogin = new PageLogin(getDriver());

        pagehome.clickOnRegisterLink();

        String Fname = "juba";
        String Lname = "two";
        String Eadress = "juba4@gmail.com";
        String Pwd = "123zxc";
        String Cpwd = "123zxc";

        RegistrationPage registrationpage = new RegistrationPage(driver);
        String CDetails = "pnt";

       registrationpage.setTheRegistrationInformation(Fname, Lname, Eadress, Pwd, Cpwd, CDetails);


    }
}