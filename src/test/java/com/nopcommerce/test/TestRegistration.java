
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

    public void testLoginNop() throws InterruptedException {
        PageHome pH= new PageHome(driver);
        RegistrationPage pR=new RegistrationPage(driver);




        LOG.info("the user in the home page");

        LOG.info("Welcome");


        LOG.info("I click on register link");
        pH.clickOnRegisterLink();
        Thread.sleep(2000);
        String Fname="juba";
        String Lname="two";
        String Eadress= "juba91@gmail.com";
        String Pwd ="123zxc";
        String Cpwd="123zxc";
        Thread.sleep(2000);

        String CDetails="pnt";

        pR.setTheRegistrationInformation(Fname, Lname, Eadress, Pwd, Cpwd, CDetails);



        LOG.info("The registration page displayed successfully");

        Assert.assertTrue(pR.checkIfRegistrationCompletedDisplayed());
    }
}


