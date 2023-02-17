package com.nopcommerce.test;

import base.CommonAPI;
import com.nopcommerce.pages.PageHome;
import com.nopcommerce.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ddf.EscherTertiaryOptRecord;
import org.testng.annotations.Test;

public class CustomizeShirt extends CommonAPI {
    Logger LOG = LogManager.getLogger(CustomizeShirt.class.getName());

    @Test
    public void customizeshirt() throws InterruptedException {
        PageHome pagehome=new PageHome(getDriver());
        String store = "shirt";
        pagehome.searchStore(store);
        pagehome.clickOnSearchButton();
        SearchPage searchpage= new SearchPage(getDriver());
        searchpage.chooseShirt();
        String txt="I LOVE PNT";
        searchpage.enterYourtxt(txt);

    }
}
