
package com.nopcommerce.test;

import base.CommonAPI;
import com.github.javafaker.Faker;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.RegistrationPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ReadFromExcel;

import java.io.File;


public class TestRegistration extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestRegistration.class.getName());

    @Test

    public void testLoginNop() throws InterruptedException {
        PageHome pagehome= new PageHome(driver);
        RegistrationPage registrationpage=new RegistrationPage(driver);
        String filepath= System.getProperty("user.dir")+ File.separator+"data"+File.separator+"NopCommerceData.xlsx";
        ReadFromExcel read = new ReadFromExcel(filepath, "sheet1");
//        String firstname = read.getCellValueForGivenHeaderAndKey("key", "firstname");
//        String lastname= read.getCellValueForGivenHeaderAndKey("key", "lastname");
//        String confirmpassword = read.getCellValueForGivenHeaderAndKey("key", "confirmpassword");
//        String password = read.getCellValueForGivenHeaderAndKey("key", "password");
//        String CDetails= read.getCellValueForGivenHeaderAndKey("key", "CDetails");
        Faker faker= new Faker();

        LOG.info("the user in the home page");
        LOG.info("Welcome");
        LOG.info("I click on register link");
        pagehome.clickOnRegisterLink();
        String firstname="juba";
        String lastname="two";
        String Eadress= faker.internet().emailAddress();
        String password ="123zxc";
        String confirmpassword="123zxc";
        String CDetails="pnt";
        registrationpage.setTheRegistrationInformation(firstname, lastname, Eadress, password, confirmpassword, CDetails);
        LOG.info("The registration page displayed successfully");
        Assert.assertTrue(registrationpage.checkIfRegistrationCompletedDisplayed());
    }
}


