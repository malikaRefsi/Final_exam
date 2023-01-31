package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.PageLogin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogOutNopTest extends CommonAPI{

        Logger LOG = LogManager.getLogger(com.nopcommerce.test.LogOutNopTest.class.getName());

        @Test
        public void logout() throws InterruptedException {
            PageHome pH= new PageHome(getDriver());
            PageLogin pL=new PageLogin(getDriver());
            pH.clickOnLoginButton();
            String emaila= "juba91@gmail.com";
            String password="123zxc";
            pL.loginWithCorrectCred(emaila, password);
            pL.logOut();
        }
}
