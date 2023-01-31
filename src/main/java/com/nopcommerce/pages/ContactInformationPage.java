package com.nopcommerce.pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage extends CommonAPI {


    @FindBy(xpath="//*[@id=\"BillingNewAddress_CountryId\"]/option[2]")
    WebElement country;
    @FindBy(xpath= "//*[@id=\"BillingNewAddress_StateProvinceId\"]/option[11]")
    WebElement state;

    @FindBy(xpath= "//*[@id=\"BillingNewAddress_City\"]")
    WebElement city;
    @FindBy(xpath= "//*[@id=\"BillingNewAddress_Address1\"]")
            WebElement Adress;
    @FindBy(xpath= "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    WebElement zip;
    @FindBy(xpath= "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
            WebElement Phone;
            @FindBy(xpath= "//*[@id=\"billing-buttons-container\"]/button[4]")
            WebElement subBu;

    public ContactInformationPage(WebDriver driver) {
        super();
    }

    public void setInfoForShipping( String City, String Address , String Zip, String Pho){

      clickOn(country);
        clickOn(state);
    city.sendKeys(City);
        Adress.sendKeys(Address);
        zip.sendKeys(Zip);
        Phone.sendKeys(Pho);
        clickOn(subBu);



    }
}
