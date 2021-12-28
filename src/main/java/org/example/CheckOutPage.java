package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static sun.plugin.javascript.navig.JSType.Element;

public class CheckOutPage extends Utils {


    JavascriptExecutor js = (JavascriptExecutor) driver;
    LoadProp loadProp = new LoadProp(); // loadProp method declared


    By _btn_Login_Success = By.xpath("//a[@href='/logout']");
    By _computer_Category = By.xpath("//ul[1]/li[1]/a[@href='/computers'] ");
    By _category_Desktop = By.xpath("//ul[1]/li[1]/ul/li[1]/a[@href='/desktops'] ");
    By _btn_ClickOnCart = By.xpath("//div[1]/div/div[2]/div[3]/div[2]/button[@type ='button' and @class='button-2 product-box-add-to-cart-button']");
    By _dropDown_Processor = By.id("product_attribute_1");
    By _dropDown_RAM = By.name("product_attribute_2");
    By _btn_HDD = By.id("product_attribute_3_7");
    By _btn_OS = By.id("product_attribute_4_9");
    By _chkBox_Adobe = By.id("product_attribute_5_11");
    By _chkBox_Commander = By.id("product_attribute_5_12");
    By txt_AddToCart = By.id("add-to-cart-button-1");
    By _btn_ClosePopUp = By.xpath("//span[@title='Close']");
    By _btn_ShoppingCart = By.xpath("//span[@class ='cart-label']");
    By _click_TermsOfService = By.id("termsofservice");
    By _btn_Checkout = By.id("checkout");
    By _dropDown_County = By.id("BillingNewAddress_CountryId");
    By _txt_City = By.id("BillingNewAddress_City");
    By _txt_Address = By.id("BillingNewAddress_Address1");
    By _txt_Postcode = By.id("BillingNewAddress_ZipPostalCode");
    By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By _btn_Continue = By.name("save");
    By _btn_Continue2 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By _click_CreditCard = By.id("paymentmethod_1");
    By _click_Continue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By _txt_CardName = By.id("CardholderName");
    By _txt_CardNumber = By.id("CardNumber");
    By _dropdown_Month = By.id("ExpireMonth");
    By _dropdownYear = By.id("ExpireYear");
    By _txt_cardCode = By.id("CardCode");
    By _txt_Continue4 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By _btn_ConfirmPayment = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By _msg_ChechoutSuccess = By.xpath("//div[2]/div/div[1]/strong");


    Actions actions = new Actions(driver);


    public void verifyUserIsLoggedInSuccessfully() {
        Assert.assertTrue(driver.findElement((_btn_Login_Success)).isDisplayed());
    }

    public void hoverOnComputerAndClick() {
        actions.moveToElement(driver.findElement(_computer_Category)).moveToElement // mouse hovering action
                (driver.findElement(_category_Desktop)).click().perform(); // perform click
    }

    public void clickOnCartBuildYourOwnComputer() {
        clickOnElement(_btn_ClickOnCart);   // perform click

    }

    public void selectSpecs() {
        selectByVisibleText(_dropDown_Processor, loadProp.getProperty("processor"));// select from dropdown
        selectByVisibleText(_dropDown_RAM, loadProp.getProperty("RAM")); // select from dropdown
        clickOnElement(_btn_HDD); // select from drop down
        clickOnElement(_btn_OS); // select from drop down
        clickOnElement(_chkBox_Adobe);
        clickOnElement(_chkBox_Commander);
    }

    public void addToCart() {
        clickOnElement(txt_AddToCart); // perform click
      //  clickOnElement(_btn_ClosePopUp);

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// waiting time applied
    }
//        public void ScrollByVisibleElement() {
//        js.executeScript("arguments[0].scrollIntoView();", Element);}

    public void clickOnShoppingCart() {
        clickOnElement(_btn_ShoppingCart);
    }

    public void acceptTermsOfService() {
        clickOnElement(_click_TermsOfService);
    }

    public void clickOnCheckout() {
        clickOnElement(_btn_Checkout);
    }


    public void fillUpBillingInformation() {
        selectByVisibleText(_dropDown_County, loadProp.getProperty("Country"));// perform dropdown
        typeText(_txt_City, loadProp.getProperty("City")); // inputting value
        typeText(_txt_Address, loadProp.getProperty("Address"));
        typeText(_txt_Postcode, loadProp.getProperty("Postcode"));
        typeText(_phoneNumber, loadProp.getProperty("PhoneNumber"));

    }

    public void clickOnContinueAndContinueAgain() {
        clickOnElement(_btn_Continue); // perform click
        clickOnElement(_btn_Continue2);
    }

    public void clickOnCreditCardAndContinue() {
        clickOnElement(_click_CreditCard);
        clickOnElement(_click_Continue);
    }

    public void enterCreditCardContinueAndConfirm() {
        typeText(_txt_CardName, loadProp.getProperty("CardholderName"));// obtained value
        typeText(_txt_CardNumber, loadProp.getProperty("CardNumber")); // obtained value
        selectByVisibleText(_dropdown_Month, loadProp.getProperty("Month"));
        selectByVisibleText(_dropdownYear, loadProp.getProperty("year"));
        typeText(_txt_cardCode, loadProp.getProperty("CardCode"));
        clickOnElement(_txt_Continue4);
        clickOnElement(_btn_ConfirmPayment);
    }
    public void verifyUserHasCheckedOutSuccessfully() {
        Assert.assertTrue(driver.findElement((_msg_ChechoutSuccess)).isDisplayed());
        System.out.println("Checkout Success"); // print statement
    }


    }





