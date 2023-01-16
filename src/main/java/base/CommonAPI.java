package base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CommonAPI {

    public WebDriver driver;//created outside to make it global

    //Logger LOG = LogManager.getLogger( CommonAPI.class.getName());
    public void getLocalDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            //how to iniciate a draver
            // WebDriverManager.chromedriver().setup(); //this it does which computer we are using and grab the dependency//after adding the dependency WebDriverManager we replace System.setProperty("webdriver.chromedriver","C:\\Users\\Malika Refsi\\IdeaProjects\\AutomationProject1\\driver");
            // this line set the location where the location where the chromedriver is located
            driver = new ChromeDriver();// create an instance of the web driver
        } else if (browserName.equalsIgnoreCase("firefox")) {
            //WebDriverManager.firefoxdriver().setup();//this statement can be deleted if we are using 4.6 or more selenium's version
            driver = new FirefoxDriver();
        }
    }

    @Parameters({"url", "browserName"})//String url   "url",
    @BeforeMethod
    public void setup(String url, String browserName) throws InterruptedException {
        getLocalDriver(browserName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //by this step we be able to open a browser
        // and if I want to go some where to google do the following
        driver.manage().window().maximize();
        driver.get(url);// after run the will lunch


        // since selenium is too fast I have to ask it to slow down by the following
        Thread.sleep(2000);// 2 sec
    }

    @AfterMethod
    public void shutBrowser() {
// driver.close();
        driver.quit();//since close() closes only the actual (parent) window and quit() close all the windows even the once that will be get open in the test
    }


    // generic methods

    public WebDriver getDriver() {
        return driver;
    }

    public void clickOn(WebElement element) {

        element.click();
    }

    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public void hoverOver(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);//instance of the actions class that handle the mousse actions
        actions.moveToElement(element).build().perform();
    }

    public String getCurrentTitle() {
        return driver.getTitle();
    }

    public void typeTextAndEnter(WebElement element, String text) {
        element.sendKeys(text, Keys.ENTER);
    }

    public void selectOptionFromDropdown(WebElement dropdown, String option) {
        Select select = new Select(dropdown);//to put in drop dwon
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.deselectByValue(option);
        }
    }

    /**************************************************************************************/
    /*********************************************************************************/
    public void FrameSwitchUsingIndex(WebDriver driver, int index) {
        driver.switchTo().frame(index);//since we have only one Iframe
        // LOG.info("Switch to Iframe success");
    }

    public void FrameSwitchUsingId(WebDriver driver, String id) {
        driver.switchTo().frame(id);//since we have only one Iframe
        // LOG.info("Switch to Iframe success");
    }

    public void DragAndDrop(WebDriver driver, WebElement draggable, WebElement droppable) {

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).build().perform();
        //the equivalence of dragAndDrop method:
//        actions.clickAndHold(draggable).pause(Duration.ofSeconds(4))
//                .moveToElement(droppable).pause(Duration.ofSeconds(5)).release().pause(Duration.ofSeconds(5)).build().perform();

    }

    public Boolean verifyCheckBoxIfSelected(WebElement element) {
        return element.isSelected();
    }


//    public void verifyCheckBoxIfSelectedAmongSetOfExistingOptions(WebElement optionToSelect,WebElement option1,WebElement  option2,WebElement option3) throws InterruptedException {
//        clickOn(optionToSelect);
//        //optionToSelect.click();
//        Thread.sleep(3000);
//        LOG.info(verifyCheckBoxIfSelected(  option1));
//        LOG.info(verifyCheckBoxIfSelected( option2));
//        LOG.info(verifyCheckBoxIfSelected( option3));
//
//
//    }

    public Boolean checkIfElementIsDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void switchToAlertAndAcceptIt(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    public void switchToAlertAndDismissIt(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }

    public String getTextFromAnAlert(WebDriver driver) {
        return driver.switchTo().alert().getText();
    }

    public void selectRadioButton(String option, WebDriver driver, List<WebElement> radioButtons) throws InterruptedException {
        for (WebElement radioButton : radioButtons) {
            if (radioButton.getAttribute("value").equals("option")) {
                clickOn(radioButton);
                //radioButton.click();
                Thread.sleep(3000);
            }
        }
        //Thread.sleep(3000);
    }

    public void scrollToElement(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        // this is an example of javascript click method js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//td[text()='Smith']")));

        Thread.sleep(3000);
    }

    public void selectAnOptionFromDropDown(WebDriver driver, WebElement element, String option) throws Exception {
        Select select = new Select(element);
        select.selectByVisibleText(option);
        Thread.sleep(3000);
    }

    public void arrowDownTwiceAndEnter(WebElement element) {
        element.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void arrowDownOnce(WebElement element) {
        element.sendKeys(Keys.ARROW_DOWN);
    }

    public Set<String> getWindowHandles(WebDriver driver) {
        Set<String> windows = driver.getWindowHandles();
        return windows;
    }

    public void switchToNewWindow(WebDriver driver, Set<String> windows) {
        Iterator<String> itr = windows.iterator();
        String parent = itr.next();
        String newWin = itr.next();
        driver.switchTo().window(newWin);
    }

    public void switchBackToParentWindow(WebDriver driver, Set<String> windows) {
        Iterator<String> itr = windows.iterator();
        String parent = itr.next();
        String newWin = itr.next();
        driver.switchTo().window(parent);//switch back
    }
}