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
        PageHome pagehome = new PageHome(getDriver());
        pagehome.contactCustomerService();
        ContactUsPage contactuspage = new ContactUsPage(getDriver());
        String nme = "juba";
        CharSequence email = "juba91@gmail.com ";
        String inquiry = "i didn't get my order , i need a refund!";
        contactuspage.enterYourName(nme);
       contactuspage.enterYourEmail(email);
        Thread.sleep(2000);
        contactuspage.enterYourInquiry(inquiry);
        Thread.sleep(2000);
        Assert.assertTrue(contactuspage.checkIfContactUsDisplayed());
        contactuspage.clickOnSubmit();
        Thread.sleep(2000);
    }
}


