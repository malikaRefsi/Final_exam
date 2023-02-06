package com.orangeHRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TimePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(TimePage.class.getName());

    public TimePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //objects or locators
    @FindBy(xpath = "//span[text()='Time']")
    WebElement TimeFromMenu;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement viewButton;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement employeeNameField;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement slideTitle;

    @FindBy(xpath = "//div [@class='oxd-topbar-header-title']")
    WebElement pageHeader;
    @FindBy(xpath = "(//div[@role='option']/span)[1]")
    WebElement firstOptionOfNameField;
    @FindBy(xpath = "(//button[@type='button'] )[4]")
    WebElement createTimeSheetButton;
    @FindBy(xpath = "(//a[text()='Configuration'])[1]")
    WebElement ConfigurationOption;
    @FindBy(xpath = "(//button[text()=' Save '])[1]")
    WebElement saveButton;
    @FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
    WebElement icon1Configuration;
    @FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
    WebElement icon2Configuration;
    @FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[3]")
    WebElement icon3Configuration;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-down'])[2]")
    WebElement attendanceDropdown;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toastMessage;
    @FindBy(xpath = "//a[text()='Nationalities']")
    WebElement menuAdminNationalities;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addButton;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']/..")
    WebElement addProjectButton;

    @FindBy(xpath = "(//span[text()='Job '])[1]")
    WebElement jobMenuDropdown;
    @FindBy(xpath = "(//a[text()='Job Titles'])[1]")
    WebElement jobTitles;


    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[2]")
    WebElement nameField;

    @FindBy(xpath = "//h6[text()='Add Nationality']")
    WebElement headerAfterSelectingNationality;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    WebElement recordsFound;


    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
    WebElement deleteSelectedButton;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement projectNameField;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement costumerNameField;
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement projectSearchButton;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement searchCostumerNameField;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    WebElement searchProjectNameField;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[3]")
    WebElement searchProjectAdminNameField;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement projectSlideTitle;
    @FindBy(xpath = "(//div[@role='option']/span)[1]")
    WebElement firstOptionFromCostumerNameField;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    WebElement projectAdminNameField;
    @FindBy(xpath = "//span[text()='Project Info ']")
    WebElement projectInfoDropdown;
    @FindBy(xpath = "(//li/a[@role='menuitem'])[1]")
    WebElement costumers;
    @FindBy(xpath = "(//li/a[@role='menuitem'])[2]")
    WebElement projects;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement massageUnderCostumerNameField;

    public void viewTimeSheetsOfAnEmployee(String employeeName) throws Exception {
        clickOn(TimeFromMenu);
        Thread.sleep(3000);
        Assert.assertEquals(getTextFromElement(slideTitle), "Select Employee");
        LOG.info("We are successfully landed in Time/Timesheetes page");
        typeText(employeeNameField, employeeName);
        Thread.sleep(3000);
        arrowDownOnce(employeeNameField);
        clickOn(firstOptionOfNameField);
        clickOn(viewButton);
        Thread.sleep(3000);
        Assert.assertEquals(getTextFromElement(slideTitle), "Timesheet for " + employeeName);
        LOG.info("We are successfully landed into Timesheet for " + employeeName);

    }

    public void editeTimeSheetsOfAnEmployee(String employeeName) throws Exception {


    }

    public void changeAttendanceConfigurationBySelectAllTheIcons() throws Exception {
        clickOn(TimeFromMenu);
        Thread.sleep(3000);
        Assert.assertEquals(getTextFromElement(slideTitle), "Select Employee");
        LOG.info("We are successfully landed in Time/Timesheetes page");
        clickOn(attendanceDropdown);
        clickOn(ConfigurationOption);
        Thread.sleep(2000);
        LOG.info(icon1Configuration.isSelected());
        if ((icon1Configuration.isSelected()) == false)
        {
            clickOn(icon1Configuration);
        } else {
            LOG.info("the icon1 already selected");
        }
        Thread.sleep(3000);
        LOG.info(icon2Configuration.isSelected());
        if ((icon2Configuration.isSelected()) == false) {
            clickOn(icon2Configuration);
        } else {
            LOG.info("the icon2 already selected");
        }
        Thread.sleep(3000);
        LOG.info(icon3Configuration.isSelected());
        if ((icon3Configuration.isSelected()) == false) {
            clickOn(icon3Configuration);
        } else {
            LOG.info("the icon3 already selected");
        }
        Thread.sleep(3000);
////        ClickOnElementIfIsNotSelected(icon2Configuration);
//
//        ClickOnElementIfIsNotSelected(icon3Configuration);

        clickOn(saveButton);
        Thread.sleep(3000);
        Assert.assertEquals(getTextFromElement(toastMessage), "Successfully Saved");
        LOG.info("successfully activated all the icons in attendance configuration ");

    }




    public void addCostumer(String str) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(costumers);
        Assert.assertEquals(getTextFromElement(slideTitle), "Customers");
        LOG.info("we are successfully landed to the Customers page");
        LOG.info("Before adding Customer it was there: " + getTextFromElement(recordsFound));
        clickOn(addButton);
        Assert.assertEquals(getTextFromElement(slideTitle), "Add Customer");
        LOG.info("we are successfully landed to the add Customer page ");
        typeText(nameField, str);
        Thread.sleep(2000);
        try {
            Assert.assertEquals(getTextFromElement(massageUnderCostumerNameField), "Already exists");
            LOG.info("This Customer: "+str+" already exists");
        }catch (Exception e) {
            clickOn(saveButton);
            Thread.sleep(3000);
            Assert.assertEquals(getTextFromElement(toastMessage), "Successfully Saved");
            LOG.info("we are successfully added a new Customer ");
            Thread.sleep(2000);
            LOG.info("After adding an Customer: " + getTextFromElement(recordsFound));
        }

    }


    public void addProject(String str1,String str2,String str3) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(projects);
        Assert.assertEquals(getTextFromElement(projectSlideTitle), "Projects");
        LOG.info("we are successfully landed to the Projects page");
        LOG.info("Before adding Project it was there: " + getTextFromElement(recordsFound));
        clickOn(addProjectButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(slideTitle), "Add Project");
        LOG.info("we are successfully landed to the Add Project page ");
        typeText(projectNameField, str1);
        Thread.sleep(2000);
        typeText(costumerNameField, str2);
        Thread.sleep(3000);
        arrowDownOnce(costumerNameField);
        clickOn(firstOptionFromCostumerNameField);
        typeText(projectAdminNameField, str3);
        Thread.sleep(3000);
        arrowDownOnce(projectAdminNameField);
        clickOn(firstOptionFromCostumerNameField);
        Thread.sleep(2000);
        clickOn(saveButton);
        Thread.sleep(3000);
        try {
            Assert.assertEquals(getTextFromElement(toastMessage), "Successfully Saved");
            LOG.info("we are successfully added a new project ");
            Thread.sleep(2000);
            LOG.info("After adding an new project: " + getTextFromElement(recordsFound));
        }catch (Exception e){
            LOG.info(str1 +" project, already created");
        }

    }
    public void filterProjectsByGivenCustomerName(String costumerName) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(projects);
        Assert.assertEquals(getTextFromElement(projectSlideTitle), "Projects");
        LOG.info("we are successfully landed to the Projects page");
        LOG.info("Before searching it was there: " + getTextFromElement(recordsFound));

        typeText(searchCostumerNameField, costumerName);
        Thread.sleep(3000);
        arrowDownOnce(searchCostumerNameField);
        clickOn(firstOptionFromCostumerNameField);
        clickOn(projectSearchButton);

        Thread.sleep(2000);
        LOG.info("After searching by entering costumer Name: " + getTextFromElement(recordsFound));


    }
    public void filterProjectsByGivenProjectName(String projectName) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(projects);
        Assert.assertEquals(getTextFromElement(projectSlideTitle), "Projects");
        LOG.info("we are successfully landed to the Projects page");
        LOG.info("Before searching it was there: " + getTextFromElement(recordsFound));

        typeText(searchProjectNameField, projectName);
        Thread.sleep(3000);
        arrowDownOnce(searchProjectNameField);
        clickOn(firstOptionFromCostumerNameField);
        clickOn(projectSearchButton);

        Thread.sleep(2000);
        LOG.info("After searching by entering project Name: " + getTextFromElement(recordsFound));


    }
    public void filterProjectsByGivenProjectAdminName(String projectAdminName) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(projects);
        Assert.assertEquals(getTextFromElement(projectSlideTitle), "Projects");
        LOG.info("we are successfully landed to the Projects page");
        LOG.info("Before searching it was there: " + getTextFromElement(recordsFound));

        typeText(searchProjectAdminNameField, projectAdminName);
        Thread.sleep(3000);
        arrowDownOnce(searchProjectAdminNameField);
        clickOn(firstOptionFromCostumerNameField);
        clickOn(projectSearchButton);

        Thread.sleep(2000);
        LOG.info("After searching by entering project Admin Name: " + getTextFromElement(recordsFound));


    }
    public void filterProjectsByGivenProjectAdminAndProjectName(String projectName,String projectAdminName) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(projects);
        Assert.assertEquals(getTextFromElement(projectSlideTitle), "Projects");
        LOG.info("we are successfully landed to the Projects page");
        LOG.info("Before searching it was there: " + getTextFromElement(recordsFound));

        typeText(searchProjectNameField, projectName);
        Thread.sleep(3000);
        arrowDownOnce(searchProjectNameField);
        clickOn(firstOptionFromCostumerNameField);

        typeText(searchProjectAdminNameField, projectAdminName);
        Thread.sleep(3000);
        arrowDownOnce(searchProjectAdminNameField);
        clickOn(firstOptionFromCostumerNameField);
        clickOn(projectSearchButton);

        Thread.sleep(2000);
        LOG.info("After searching by entering both project Admin and project Name: " + getTextFromElement(recordsFound));


    }
    public void filterProjectsByGivenProjectAdminAndProjectAndCostumerName(String projectName,String projectAdminName, String costumerName) throws InterruptedException {
        clickOn(TimeFromMenu);
        clickOn(projectInfoDropdown);
        clickOn(projects);
        Assert.assertEquals(getTextFromElement(projectSlideTitle), "Projects");
        LOG.info("we are successfully landed to the Projects page");
        LOG.info("Before searching it was there: " + getTextFromElement(recordsFound));

        typeText(searchProjectNameField, projectName);
        Thread.sleep(3000);
        arrowDownOnce(searchProjectNameField);
        clickOn(firstOptionFromCostumerNameField);

        typeText(searchProjectAdminNameField, projectAdminName);
        Thread.sleep(3000);
        arrowDownOnce(searchProjectAdminNameField);
        clickOn(firstOptionFromCostumerNameField);
        clickOn(projectSearchButton);

        typeText(searchCostumerNameField, costumerName);
        Thread.sleep(3000);
        arrowDownOnce(searchCostumerNameField);
        clickOn(firstOptionFromCostumerNameField);

        Thread.sleep(2000);
        LOG.info("After searching by entering all three project Admin, project, and costumer name: " + getTextFromElement(recordsFound));


    }



}
