package com.orangeHRM.pages;

import base.CommonAPI;
import com.beust.ah.A;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LeavePage extends CommonAPI {
    Logger LOG = LogManager.getLogger(LeavePage.class.getName());
    public LeavePage(WebDriver driver){
        PageFactory.initElements(driver,this);}

    //objects or locators
    @FindBy(xpath = "//span[text()='Leave']")
    WebElement menuLeave;
    @FindBy(xpath = "//a[text()='Leave List']")
    WebElement LeaveListHeader;
    @FindBy(xpath = "//h5[text()='Leave List']")
    WebElement LeaveListTitle;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-danger oxd-table-cell-action-space'])[2]")
    WebElement RejectButtonOnTheSecondRow ;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])[2]")
    WebElement ApproveButtonOnTheSecondRow ;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-success'])")
    WebElement ApproveButtonInTheHeaderLeaveList ;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-danger'])")
    WebElement RejectButtonInTheHeaderLeaveList ;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--label-warn'])")
    WebElement CancelButtonInTheHeaderLeaveList ;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    WebElement recordsFound;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toastMessage;
    @FindBy(xpath = "//p[text()='Success']")
    WebElement toastTitle;
    @FindBy(xpath = "//h6[text()='Leave']")
    WebElement headerOfLeavePage;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--card-title']")
    WebElement titleInTheRejectAndApproveLeaveDialogBox;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']")
    WebElement textInTheRejectAndApproveLeaveDialogBox;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement yesConfirmationButton;
    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin'])")
    WebElement noCancelButton;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]")
    WebElement secondCheckboxInTheLeaveList;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[5]")
    WebElement forthCheckboxInTheLeaveList;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
    WebElement CheckboxInTheLeaveListHeader;





    //reusable steps
    public void approveLeaveTheFifthInTheLeaveList() throws InterruptedException {
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before approving leave it was there: "+getTextFromElement(recordsFound));
        clickOn(ApproveButtonOnTheSecondRow);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Updated");
        LOG.info("we are successfully approved the leave request");
        Thread.sleep(2000);
        LOG.info("After approving leave request there: "+getTextFromElement(recordsFound));
    }
    public void rejectLeaveTheSecondInTheLeaveList() throws InterruptedException {
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before rejecting leave it was there: "+getTextFromElement(recordsFound));
        clickOn(RejectButtonOnTheSecondRow);
        Assert.assertEquals(getTextFromElement(toastMessage),"Successfully Updated");
        LOG.info("we are successfully approved the leave request");
        Thread.sleep(2000);
        LOG.info("After rejecting leave request there: "+getTextFromElement(recordsFound));
    }
    public void rejectMultipleLeaveRequestsUsingRejectButtonAboveLeaveList() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before rejecting leave it was there: "+getTextFromElement(recordsFound));
        clickOn(secondCheckboxInTheLeaveList);
        clickOn(forthCheckboxInTheLeaveList);
        Thread.sleep(1000);
        clickOn(RejectButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheRejectAndApproveLeaveDialogBox),"You are about to Reject 2 Leave Requests Are you sure you want to continue?");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(yesConfirmationButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"2 Leave Requests Rejected");
        LOG.info("we are successfully rejected the leave request");
        Thread.sleep(3000);
        LOG.info("After rejecting leave request there: "+getTextFromElement(recordsFound));
    }
    public void approveMultipleLeaveRequestsUsingRejectButtonAboveLeaveList() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before rejecting leave it was there: "+getTextFromElement(recordsFound));
        clickOn(secondCheckboxInTheLeaveList);
        clickOn(forthCheckboxInTheLeaveList);
        Thread.sleep(1000);
        clickOn(ApproveButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheRejectAndApproveLeaveDialogBox),"You are about to Approve 2 Leave Requests Are you sure you want to continue?");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(yesConfirmationButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"2 Leave Requests Approved");
        LOG.info("we are successfully approved the leave request");
        Thread.sleep(3000);
        LOG.info("After approving leave request there: "+getTextFromElement(recordsFound));
    }
    public void CancelApproveMultipleLeaveRequests() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before rejecting leave it was there: "+getTextFromElement(recordsFound));
        clickOn(secondCheckboxInTheLeaveList);
        clickOn(forthCheckboxInTheLeaveList);
        Thread.sleep(1000);
        clickOn(ApproveButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheRejectAndApproveLeaveDialogBox),"You are about to Approve 2 Leave Requests Are you sure you want to continue?");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(noCancelButton);
        Thread.sleep(3000);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed back to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Ans we still have: "+getTextFromElement(recordsFound));
    }
    public void CancelRejectMultipleLeaveRequests() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before rejecting leave it was there: "+getTextFromElement(recordsFound));
        clickOn(secondCheckboxInTheLeaveList);
        clickOn(forthCheckboxInTheLeaveList);
        Thread.sleep(1000);
        clickOn(RejectButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheRejectAndApproveLeaveDialogBox),"You are about to Reject 2 Leave Requests Are you sure you want to continue?");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(noCancelButton);
        Thread.sleep(3000);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed back to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Ans we still have: "+getTextFromElement(recordsFound));
    }
    public void ApproveAllLeaveRequests() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before approving any leave request it was there: "+getTextFromElement(recordsFound));
        clickOn(CheckboxInTheLeaveListHeader);
        Thread.sleep(1000);
        clickOn(ApproveButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(titleInTheRejectAndApproveLeaveDialogBox),"Approve Leave");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(yesConfirmationButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Success");
        LOG.info("we are successfully approved all the leave request");
        Thread.sleep(3000);
        LOG.info("After approving all the leave requests there: "+getTextFromElement(recordsFound));
    }
    public void RejectAllLeaveRequests() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before rejecting any leave request it was there: "+getTextFromElement(recordsFound));
        clickOn(CheckboxInTheLeaveListHeader);
        Thread.sleep(1000);
        clickOn(RejectButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(titleInTheRejectAndApproveLeaveDialogBox),"Approve Reject");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(yesConfirmationButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"Success");
        LOG.info("we are successfully approved all the leave request");
        Thread.sleep(3000);
        LOG.info("After rejecting all leave request there: "+getTextFromElement(recordsFound));
    }
    public void searchLeaveRequest() throws InterruptedException {//in the second and the forth rows
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        LOG.info("Before searching it was there: "+getTextFromElement(recordsFound));
        clickOn(secondCheckboxInTheLeaveList);
        clickOn(forthCheckboxInTheLeaveList);
        Thread.sleep(1000);
        clickOn(ApproveButtonInTheHeaderLeaveList);
        Thread.sleep(1000);
        Assert.assertEquals(getTextFromElement(textInTheRejectAndApproveLeaveDialogBox),"You are about to Approve 2 Leave Requests Are you sure you want to continue?");
        LOG.info("we are successfully switched to confirm or cancel leave request dialogue box");
        clickOn(yesConfirmationButton);
        Thread.sleep(2000);
        Assert.assertEquals(getTextFromElement(toastMessage),"2 Leave Requests Approved");
        LOG.info("we are successfully approved the leave request");
        Thread.sleep(3000);
        LOG.info("After approving leave request there: "+getTextFromElement(recordsFound));
    }
    public void checkTheVisibilityOfApproveButton() throws InterruptedException {
        clickOn(menuLeave);
        Assert.assertEquals(getTextFromElement(headerOfLeavePage),"Leave");
        LOG.info("we are successfully landed to the leave page");
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        try {checkIfElementIsDisplayed(ApproveButtonInTheHeaderLeaveList);
            LOG.info("the Approve button was visible even before selecting any of the leave requests form leave list");
        }catch(NoSuchElementException e) {
            LOG.info("the Approve button button is not visible before selecting any of the leave requests form leave list");
        }
        clickOn(secondCheckboxInTheLeaveList);
        if(checkIfElementIsDisplayed(ApproveButtonInTheHeaderLeaveList)){
            LOG.info("the approve button is visible after selecting leave request from the leave list");
        }else {LOG.info("the approve button is not visible even after selecting a leave request from the leave list");}

    }
    public void checkTheVisibilityOfRejectButton() throws InterruptedException {
        clickOn(menuLeave);
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        try {checkIfElementIsDisplayed(ApproveButtonInTheHeaderLeaveList);
            LOG.info("the Reject button was visible even before selecting any of the leave requests form leave list");
        }catch(NoSuchElementException e) {
            LOG.info("the Reject button button is not visible before selecting any of the leave requests form leave list");
        }
        clickOn(secondCheckboxInTheLeaveList);
        if(checkIfElementIsDisplayed(ApproveButtonInTheHeaderLeaveList)){
            LOG.info("the Reject button is visible after selecting leave request from the leave list");
        }else {LOG.info("the Reject button is not visible even after selecting a leave request from the leave list");}

    }
    public void checkTheVisibilityOfCancelButton() throws InterruptedException {
        clickOn(menuLeave);
        clickOn(LeaveListHeader);
        Assert.assertEquals(getTextFromElement(LeaveListTitle),"Leave List");
        LOG.info("we are successfully landed to the Leave List page");
        Thread.sleep(3000);
        try {checkIfElementIsDisplayed(ApproveButtonInTheHeaderLeaveList);
            LOG.info("the Cancel button was visible even before selecting any of the leave requests form leave list");
        }catch(NoSuchElementException e) {
            LOG.info("the Cancel button button is not visible before selecting any of the leave requests form leave list");
        }
        clickOn(secondCheckboxInTheLeaveList);
        if(checkIfElementIsDisplayed(ApproveButtonInTheHeaderLeaveList)){
            LOG.info("the Cancel button is visible after selecting leave request from the leave list");
        }else {LOG.info("the Cancel button is not visible even after selecting a leave request from the leave list");}

    }

}
