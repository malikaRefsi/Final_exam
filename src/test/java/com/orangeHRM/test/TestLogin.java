package com.orangeHRM.test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.orangeHRM.pages.HomePage;

public class TestLogin extends CommonAPI {

    Logger LOG = LogManager.getLogger( TestLogin.class.getName());
    @Test
    public void test() {
       //here you should and corresponding object page
        HomePage homePage= new HomePage(getDriver());
    }
}
