package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferentMenu extends CommonAPI {
    Logger LOG = LogManager.getLogger(DifferentMenu.class.getName());

    @Test
    public void CameraPhoto() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.selectElectronics();
        pagehome.clickOncamera();
        Assert.assertTrue(pagehome.checkIfCameraDisplayed());
        LOG.info("Land on  camera and photo page ");
    }
    @Test
    public void CellPhones() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.selectElectronics();
        pagehome.clickOncell();
        Assert.assertTrue(pagehome.checkIfCellIsDisplayed());
        LOG.info("Land on  cell phones  page");
    }

    @Test
    public void Others() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.selectElectronics();
        pagehome.clickOnOthers();
        Assert.assertTrue(pagehome.checkIfOthersIsDisplayed());
        LOG.info("Land on  others page ");
    }
    @Test
    public void Desktops() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.clickOnComputer();
        pagehome.clickOnDesktops();
        Assert.assertTrue(pagehome.checkIfDesktop());
        LOG.info("Land on  Desktops page");
    }
    @Test
    public void Software() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.clickOnComputer();
        pagehome.clickOnSoftware();
        Assert.assertTrue(pagehome.checkIfSoftwareIsDisplayed());
        LOG.info("Land on  Software page");
    }
    @Test
    public void Notebook() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.clickOnComputer();
        pagehome.clickOnNoteBook();
        Assert.assertTrue(pagehome.checkIfNoteBookDisplay());
        LOG.info("Land on  notebook page");
    }
    @Test
    public void Shoes() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.clickOnApparel();
        pagehome.clickOnShoes();
        Assert.assertTrue(pagehome.checkIfShoesDisplayed());
        LOG.info("Land on  shoes page");
    }
    @Test
    public void Clothing() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.clickOnApparel();
        pagehome.clickOnclothing();
        Assert.assertTrue(pagehome.checkIfclothingdisplayed());
        LOG.info("Land on  clothing page");
    }
    @Test
    public void Accessories() {
        PageHome pagehome = new PageHome(getDriver());
        pagehome.clickOnApparel();
        pagehome.clickOnaccessories();
        Assert.assertTrue(pagehome.checkIfAccessoriesdisplayed());
        LOG.info("Land on accessories page");
    }
}

