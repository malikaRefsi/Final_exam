package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.ContactUsPage;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends CommonAPI {
    Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

    @Test
    public void ContactThem() throws InterruptedException {
        PageHome hP = new PageHome(getDriver());
        hP.contactCustomerService();
        ContactUsPage cP = new ContactUsPage(getDriver());
        String nme = "juba";
        CharSequence email = "juba91@gmail.com ";
        String inquiry = "i didn't get my order , i need a refund!";
        cP.enterYourName(nme);
        cP.enterYourEmail(email);
        Thread.sleep(2000);
        cP.enterYourInquiry(inquiry);
        Thread.sleep(2000);
        Assert.assertTrue(cP.checkIfContactUsDisplayed());
        cP.clickOnSubmit();
        Thread.sleep(2000);
    }
}


