package sauceDemoTest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemoPages.CartPage;
import sauceDemoPages.HomePage;

public class DropDown extends CommonAPI {
    Logger LOG = LogManager.getLogger(DropDown.class.getName());
//13
@Test
public void AtoZDropDown() throws InterruptedException {
    HomePage homePage = new HomePage(getDriver());
    CartPage cartPage = new CartPage(getDriver());
    String expectedTitle = "Swag Labs";
    String actualTitle = getCurrentTitle();
    Assert.assertEquals(expectedTitle, actualTitle);
    LOG.info("land to saucedemo success");

    homePage.typeusername("standard_user");
    homePage.typepassword("secret_sauce");
    homePage.clickOnLoginButon();

    homePage.selectFromDropDown("az");
    Thread.sleep(2000);

}

    //14
    @Test
    public void ZtoADropDown() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        homePage.selectFromDropDown("za");
        Thread.sleep(2000);

    }

//15
    @Test
    public void LowToHighDropDown() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        homePage.selectFromDropDown("lohi");
        Thread.sleep(2000);

    }


    //16
    @Test
    public void highToLowDropDown() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());
       CartPage cartPage = new CartPage(getDriver());
        String expectedTitle = "Swag Labs";
        String actualTitle = getCurrentTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        LOG.info("land to saucedemo success");

        homePage.typeusername("standard_user");
        homePage.typepassword("secret_sauce");
        homePage.clickOnLoginButon();

        homePage.selectFromDropDown("hilo");
        //WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));


        /*WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(element);
        select.selectByValue("hilo");
        //select.selectByIndex(3);
        Thread.sleep(3000);*/
    }
}
