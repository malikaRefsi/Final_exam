package com.orangeHRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AdminPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(AdminPage.class.getName());
    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);}

    //objects or locators
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement menuAdmin;
    @FindBy(xpath = "//a[text()='Nationalities']")
    WebElement menuAdminNationalities;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addButton;
    @FindBy(xpath = "(//span[text()='Job '])[1]")
    WebElement jobMenuDropdown;
    @FindBy(xpath = "(//a[text()='Job Titles'])[1]")
    WebElement jobTitles;


    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[2]")
    WebElement nameField;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement slideTitle;

    @FindBy(xpath = "//h6[text()='Add Nationality']")
    WebElement headerAfterSelectingNationality;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    WebElement recordsFound;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toastMessage;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
    WebElement deleteSelectedButton;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[6]")
    WebElement sixthCheckboxInTheNationalityList;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[4]")
    WebElement forthCheckboxInTheNationalityList;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[7]")
    WebElement seventhCheckboxInTheNationalityList;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[5]")
    WebElement trashLogoInTheFifthRow ;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
    WebElement checkboxOnTheHeaderOfNationalitiesList;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement cancelButton;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-body']")
    WebElement textInTheDeleteDialogBox;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement yesDeleteConfirmation;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[5]")
    WebElement editeLogoOfFifthRow;
    @FindBy(xpath = "//h6[text()='Edit Nationality']")
    WebElement TitleOfEditeNationalityDialogueBox;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-input--error']")
    WebElement NameFieldError;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement IdField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "//button[@type='reset']")
    WebElement resetButton;
    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[2]/div")
    List<WebElement> idColumnInEmployeeList;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement employeeNameField;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    WebElement SupervisorNameField;







    //reusable steps

    public void addNationality(String str) throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        LOG.info("Before adding nationality it was there: "+getTextFromElement(recordsFound));
        clickOn(addButton);
        Assert.assertEquals(getTextFromElement(headerAfterSelectingNationality),"Add Nationality");
        LOG.info("we are successfully landed to the add nationality page ");
        typeText(nameField,str);
        clickOn(saveButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Saved");
        LOG.info("we are successfully added a nationality");
        Thread.sleep(2000);
        LOG.info("After adding an additional nationality: "+getTextFromElement(recordsFound));


    }
    public void deleteNationalityUsingTrashLogo() throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        LOG.info("Before deleting nationality it was there: "+getTextFromElement(recordsFound));
        clickOn(sixthCheckboxInTheNationalityList);
        clickOn(trashLogoInTheFifthRow);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
        LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Deleted");
        LOG.info("we are successfully deleted a nationality");
        Thread.sleep(2000);

        LOG.info("After deleting a nationality: "+getTextFromElement(recordsFound));

    }
    public void deleteNationalityUsingDeleteSelectedButton() throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        LOG.info("Before deleting nationality it was there: "+getTextFromElement(recordsFound));
        clickOn(sixthCheckboxInTheNationalityList);
        clickOn(deleteSelectedButton);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
        LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Deleted");
        LOG.info("we are successfully deleted a nationality");
        Thread.sleep(2000);

        LOG.info("After deleting a nationality: "+getTextFromElement(recordsFound));

    }
    public void deleteMultipleNationalitiesUsingDeleteSelectedButton() throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        LOG.info("Before deleting nationality it was there: "+getTextFromElement(recordsFound));
        clickOn(sixthCheckboxInTheNationalityList);
        clickOn(forthCheckboxInTheNationalityList);
        clickOn(seventhCheckboxInTheNationalityList);
        clickOn(deleteSelectedButton);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
        LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Deleted");
        LOG.info("we are successfully deleted a nationality");
        Thread.sleep(2000);

        LOG.info("After deleting a nationality: "+getTextFromElement(recordsFound));

    }
    public void deleteAllNationalitiesUsingDeleteSelectedButton() throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        LOG.info("Before deleting nationality it was there: "+getTextFromElement(recordsFound));
        clickOn(checkboxOnTheHeaderOfNationalitiesList);
        clickOn(deleteSelectedButton);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
        LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Deleted");
        LOG.info("we are successfully deleted a nationality");
        Thread.sleep(2000);

        LOG.info("After deleting a nationality: "+getTextFromElement(recordsFound));

    }
    public void editeANationalityInTheRowFive(WebDriver driver,String str) throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        LOG.info("Before editing any nationality it was there: "+getTextFromElement(recordsFound));
        clickOn(editeLogoOfFifthRow);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(TitleOfEditeNationalityDialogueBox),"Edit Nationality");
        LOG.info("we are successfully switched to edite nationality dialogue page");
        clearTextInTextBoxField(nameField);
        Thread.sleep(3000);
//        typeTextUsingJavaScript(driver,nameField,str);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].value="+str,nameField);

        Thread.sleep(2000);
        clickOn(saveButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Updated");
        LOG.info("we are successfully edited a nationality");
        Thread.sleep(2000);

        LOG.info("After editing a nationality: "+getTextFromElement(recordsFound));

    }
    public void cancelAddingNationality(String str) throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        clickOn(addButton);
        Assert.assertEquals(getTextFromElement(headerAfterSelectingNationality),"Add Nationality");
        LOG.info("we are successfully landed to the add nationality page ");
        typeText(nameField,str);
        clickOn(cancelButton);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully back to the nationalities page");



    }

    public void checkTheVisibilityOfDeleteSelectedButton(){
        clickOn(menuAdmin);
        clickOn(menuAdminNationalities);
        Assert.assertEquals(getTextFromElement(slideTitle),"Nationalities");
        LOG.info("we are successfully landed to the nationalities page");
        try {checkIfElementIsDisplayed(deleteSelectedButton);
            LOG.info("the Delete Selected button was visible even before selecting any nationality from Nationality list");
        }catch(NoSuchElementException e) {
            LOG.info("the Delete Selected button is not visible before selecting any of the nationalities from the nationalities list");
        }
        clickOn(sixthCheckboxInTheNationalityList);
        if(checkIfElementIsDisplayed(deleteSelectedButton)){
            LOG.info("the Delete Selected button is visible after selecting nationality from the nationalities list");
        }else {LOG.info("the Delete Selected button is not visible even after selecting a nationality from the nationalities list");}

    }


 public void addJobTitle(String str) throws InterruptedException {
    clickOn(menuAdmin);
    clickOn(jobMenuDropdown);
    clickOn(jobTitles);
    Assert.assertEquals(getTextFromElement(slideTitle),"Job Titles");
    LOG.info("we are successfully landed to the Job Titles page");
    LOG.info("Before adding Job Title it was there: "+getTextFromElement(recordsFound));
    clickOn(addButton);
    Assert.assertEquals(getTextFromElement(slideTitle),"Add Job Title");
    LOG.info("we are successfully landed to the add Job Titles page ");
    typeText(nameField,str);
    clickOn(saveButton);
    Thread.sleep(2000);
    Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Saved");
    LOG.info("we are successfully added a Job Title");
    Thread.sleep(2000);
    LOG.info("After adding an Job Title nationality: "+getTextFromElement(recordsFound));

}
    @FindBy(xpath = "(//a[text()='Pay Grades'])[1]")
    WebElement PayGrades;

    public void addPayGrade(String str) throws InterruptedException {
        clickOn(menuAdmin);
        clickOn(jobMenuDropdown);
        clickOn(PayGrades);
        Assert.assertEquals(getTextFromElement(slideTitle),"Pay Grades");
        LOG.info("we are successfully landed to the Pay Grades page");
        LOG.info("Before adding Pay Grade it was there: "+getTextFromElement(recordsFound));
        clickOn(addButton);
        Assert.assertEquals(getTextFromElement(slideTitle),"Add Pay Grade");
        LOG.info("we are successfully landed to the add Pay Grade page ");
        typeText(nameField,str);
        clickOn(saveButton);
        // Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"No Records Found");
        LOG.info("we are successfully added a new Pay Grade ");
        Thread.sleep(2000);
        LOG.info("After adding an Pay Grade nationality: "+getTextFromElement(recordsFound));

    }

}
