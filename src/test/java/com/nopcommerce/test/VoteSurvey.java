package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class VoteSurvey  extends CommonAPI {
    Logger LOG = LogManager.getLogger(ResetPassword.class.getName());

    @Test
    public void voteExcellent() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.pressOnVote();


    }

    @Test
    public void voteGood() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.voteGood();
    }

    @Test
    public void votePoor() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.votePoor();
    }

    @Test
    public void voteVeryBad() throws InterruptedException {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.voteVeryBad();
    }
}




