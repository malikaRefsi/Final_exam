package com.orangeHRM.pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.awt.SystemColor.menu;

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
    public void editePersonalDetailsOfAnEmployee(String str1, String str2, String str3) throws InterruptedException {
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

    }
