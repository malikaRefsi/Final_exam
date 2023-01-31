package com.orangeHRM.pages;

import base.CommonAPI;
import com.github.javafaker.IdNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

public class PIMpage extends CommonAPI {
        Logger LOG = LogManager.getLogger(PIMpage.class.getName());
    public  PIMpage (WebDriver driver){PageFactory.initElements(driver,this);}

        //objects or locators
        @FindBy(xpath = "//span[text()='PIM']")
        WebElement PIMFromMenu;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
    WebElement lastNameField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;
    @FindBy(xpath = "//h6[text()='PIM']")
    WebElement PIMAsHeader;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toastMessageAfterAddUser;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[6]")
    WebElement checkboxFifthUserInTheEmployeeList;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
    WebElement checkboxOnTheHeaderOfEmployeeList;
    @FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']")
    List<WebElement> arrowsListOfEmployeeList;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement cancelButton;


    @FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[5]")
    WebElement trashLogoInTheSameRowAsTheFifthUserInEmployeeList ;
    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[2]/div")
    List<WebElement> idColumnInEmployeeList;
    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div/div")
    List<WebElement> EmployeeListTableIncludingEachCell;
    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[2]/div")
    List<WebElement> checkBoxesEmployeeList;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toastMessageAfterDeletingUsers;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement yesDeleteConfirmation;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-body']")
    WebElement textInTheDeleteDialogBox;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
    WebElement deleteSelectedButton;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement nickNameField;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
    WebElement driverLicenseNumberField;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
    WebElement ssnNumberField;
    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement smockCheckbox;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement personalDetailsSavingButton;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement customFieldsSavingButton;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[5]")
    WebElement editeLogoOfFifthRow;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement IdField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "//button[@type='reset']")
    WebElement resetButton;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement employeeNameField;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    WebElement SupervisorNameField;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span'][1]")
    WebElement recordsFound;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    WebElement employmentStatusDropdown;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    WebElement includeDropdown;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
    WebElement jobTitleDropdown;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
    WebElement subUnitDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> dropdownsList;






    //reusable steps


    public void addUser(String firstName,String lastName){
        clickOn(addButton);
        typeText(firstNameField,firstName);
        typeText(lastNameField,lastName);
        clickOn(saveButton);
    }
    public String getHeaderWhenPIMSelected(){
        return getTextFromElement(PIMAsHeader);
    }
    public String getToastMessageAfterAddUser(){
        return getTextFromElement(toastMessageAfterAddUser);
    }
    public void deleteAUserInEmployeeListUsingTrashLogo(WebDriver driver){
        clickOn(checkboxFifthUserInTheEmployeeList);
        clickOn(trashLogoInTheSameRowAsTheFifthUserInEmployeeList);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
       LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
    }
    public void deleteAUserInEmployeeListUsingDeleteSelectedButton(WebDriver driver){
        clickOn(checkboxFifthUserInTheEmployeeList);
        clickOn(deleteSelectedButton);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
        LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
    }
    public void checkTheVisibilityOfDeleteSelectedButton(){
      try {checkIfElementIsDisplayed(deleteSelectedButton);
          LOG.info("the Delete Selected button was visible even before selecting any user from employee list");
      }catch(NoSuchElementException e) {
          LOG.info("the Delete Selected button is not visible before selecting any user from employee list");
      }
        clickOn(checkboxFifthUserInTheEmployeeList);
        if(checkIfElementIsDisplayed(deleteSelectedButton)){
            LOG.info("the Delete Selected button is visible after selecting user from employee list");
        }else {LOG.info("the Delete Selected button is not visible even after selecting any user from employee list");}

    }
    public void deleteAllUserInEmployeeList(WebDriver driver){
        clickOn(checkboxOnTheHeaderOfEmployeeList);
        clickOn(deleteSelectedButton);
        Assert.assertEquals(getTextFromElement(textInTheDeleteDialogBox),"The selected record will be permanently deleted. Are you sure you want to continue?");
        LOG.info("we are successfully switched to delete confirmation or cancel delete dialogue box");
        clickOn(yesDeleteConfirmation);
    }
    public String getToastMessageAfterDeletingUsers(){
        return getTextFromElement(toastMessageAfterDeletingUsers);
    }



    public int numberOfEmployeeInList(){
        return numberOfElementInList(arrowsListOfEmployeeList);
    }
    public void editePersonalDetailsOfAnEmployee(String str1, String str3) throws InterruptedException {
        clickOn(editeLogoOfFifthRow);
        Thread.sleep(2000);
        typeText(nickNameField,str1);
        Thread.sleep(2000);
//        typeText(driverLicenseNumberField,str2);
        typeText(ssnNumberField,str3);
        Thread.sleep(2000);
        clickOn(smockCheckbox);
        clickOn(personalDetailsSavingButton);


    }
    @FindBy(xpath = "(//img[@alt='profile picture'])[2]")
    WebElement profilePicture;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus']")
    WebElement plusLink;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement savePictureButton;
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    WebElement saveAttachmentButton;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-plus oxd-button-icon'])[1]")
    WebElement addAttachmentsButton;
    @FindBy(xpath = "(//div[@class='oxd-file-button'])[1]")
    WebElement browsButton;


    public void addAnAttachmentToAnEmployeesInformation(String fileName) throws InterruptedException, AWTException {
        clickOn(editeLogoOfFifthRow);
//        Thread.sleep(3000);
        clickOn(addAttachmentsButton);
        Thread.sleep(2000);
        clickOn(browsButton);
        uploadProfilePicture(fileName);
        Thread.sleep(10000);
        clickOn(saveAttachmentButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessageAfterAddUser),"Successfully Saved");
        LOG.info("the profile picture is successfully uploaded");
        Thread.sleep(4000);
    }
    public void editeProfilePictureOfAnEmployees(String fileName) throws InterruptedException, AWTException {
        clickOn(editeLogoOfFifthRow);
//        Thread.sleep(3000);
        clickOn(profilePicture);
        Thread.sleep(2000);
        clickOn(plusLink);
        uploadProfilePicture(fileName);
        Thread.sleep(10000);
        clickOn(savePictureButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessageAfterAddUser),"Successfully Updated");
        LOG.info("the profile picture is successfully uploaded");
        Thread.sleep(4000);
    }
    public void searchEmployeeByEnteringTheId (String str) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        typeText(IdField,str);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the Id "+str);
    }
    public void searchEmployeeByEnteringTheEmployeeName (String str) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        typeText(employeeNameField,str);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the name "+str);
    }
    public void searchEmployeeByEnteringTheSupervisorName (String str) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        typeText(SupervisorNameField,str);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " supervised by "+str);
    }
    public void searchEmployeeByEnteringTheEmploymentStatus (String option) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(employmentStatusDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option);
            clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an employment status:  "+option);
    }
    public void searchEmployeeByEnteringTheJobTitle (String option) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(jobTitleDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an employment status:  "+option);
    }
    public void searchEmployeeByEnteringTheSubUnit (String option) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(subUnitDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an employment status:  "+option);
    }

    public void searchEmployeeByEnteringTheInclude (String option) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(includeDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an employment status:  "+option);
    }
    public void searchEmployeeByEnteringTheIncludeAndSubUnit (String option1,String option2) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(includeDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option1);
        clickOn(subUnitDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option2);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an include:  "+option1+" and subunit: "+option2);
    }
    public void searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitle (String option1,String option2,String option3) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(includeDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option1);
        clickOn(subUnitDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option2);
        clickOn(jobTitleDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option3);

        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an include:  "+option1+" , subunit: "+option2+" , job title: "+option3+" , employment status: "+option3);

    }
    public void searchEmployeeByEnteringTheIncludeAndSubUnitAndJobTitleAndEmploymentStatus (String option1,String option2,String option3,String option4) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(includeDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option1);
        clickOn(subUnitDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option2);
        clickOn(jobTitleDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option3);
        clickOn(employmentStatusDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,option4);
        clickOn(searchButton);
        Thread.sleep(3000);
        LOG.info("There are "+getTextFromElement(recordsFound)+ " with the an include:  "+option1+" , subunit: "+option2+" , job title: "+option3+" , employment status: "+option3);

    }
    public void resetSearchEmployee (String includeOption, String subUnitOption, String jobTitleOption, String employmentStatusOption,
                                     String SupervisorName, String employeeName, String Id) throws InterruptedException {
        clickOn(PIMFromMenu);
        Assert.assertEquals(getTextFromElement(PIMAsHeader),"PIM");
        LOG.info("we are successfully landed to the PIM page");
        clickOn(includeDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,includeOption);
        clickOn(subUnitDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,subUnitOption);
        clickOn(jobTitleDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,jobTitleOption);
        clickOn(employmentStatusDropdown);
        clickONAnElementWhichContainSpecificTextAmongElementsList(dropdownsList,employmentStatusOption);
        typeText(SupervisorNameField,SupervisorName);
        typeText(employeeNameField,employeeName);
        typeText(IdField,Id);
        LOG.info("All the field successfully entered");
        clickOn(resetButton);
        Thread.sleep(3000);
        clickOn(includeDropdown);
        Assert.assertEquals(getTextFromElement(includeDropdown),"Current Employees Only");
        clickOn(subUnitDropdown);
        Assert.assertEquals(getTextFromElement(subUnitDropdown),"-- Select --");
        clickOn(jobTitleDropdown);
        Assert.assertEquals(getTextFromElement(jobTitleDropdown),"-- Select --");
        clickOn(employmentStatusDropdown);
        Assert.assertEquals(getTextFromElement(employmentStatusDropdown),"-- Select --");
        Assert.assertEquals(getTextFromElement(SupervisorNameField),"");
        Assert.assertEquals(getTextFromElement(employeeNameField),"");
        Assert.assertEquals(getTextFromElement(IdField),"");
        LOG.info("we are successfully reset the search and all the entered information erased");



    }

    }
