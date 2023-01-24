package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.RegistrationPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRegistration extends CommonAPI {

    Logger LOG = LogManager.getLogger(TestRegistration.class.getName());

    @Test

    public void testLoginNop(){
        PageHome pH= new PageHome(driver);
        RegistrationPage pR=new RegistrationPage(driver);




        LOG.info("the user in the home page");

        LOG.info("Welcome");


        LOG.info("I click on register link");


        pH.clickOnRegisterButton();


        LOG.info("I enterred the user data");


        pR.chooseGender();
        pR.setFirstName();
        pR.setLastName();
        pR.setDOB();
        pR.setMOB();
        pR.setYOB();
        pR.setCompagnyDetails();
        pR.setPasswordReg();
        pR.setConfirmationForPassword();



        LOG.info("The registration page displayed successfully");

        String title = getCurrentTitle();
        Assert.assertEquals(title, "your registration completed ");

    }
}


