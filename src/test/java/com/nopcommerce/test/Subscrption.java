package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Subscrption extends CommonAPI {
    Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

    @Test
    public void Subscrption() throws InterruptedException {

PageHome pH= new PageHome(getDriver());
String Email="juba91@gmail.com";
pH.enterEmail(Email);
pH.clickOnSub();
LOG.info("subscription successfully");
}


}
