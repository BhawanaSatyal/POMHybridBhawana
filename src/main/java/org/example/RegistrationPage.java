package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    By _btn_Register = By.xpath("//a[@class='ico-register']"); // find by xpath
    By _firstNameField = By.id("FirstName"); // find by id
    By _lastNameField = By.id("LastName");
    By _emailField = By.id("Email");
    By _passwordField = By.id("Password");
    By _confirmPasswordField = By.id("ConfirmPassword");
    By _clickOnRegisterButton = By.id("register-button");
    String email = currentTimeStamp() +loadProp.getProperty("Email");



    public void verifyUserIsHomePage() {


        Assert.assertTrue(driver.getCurrentUrl().contains("nopcommerce"));


   }
    public void clickOnRegister(){
        clickOnElement(_btn_Register);
    }

    public void userEntersRegistrationDetails(){

        typeText(_firstNameField, loadProp.getProperty("FirstName"));// add value
        typeText(_lastNameField, loadProp.getProperty("LastName")); // add value
        typeText(_emailField, email);
        typeText(_passwordField, loadProp.getProperty("Password"));
        typeText(_confirmPasswordField, loadProp.getProperty("ConfirmPassword"));




    }
    public void clickOnRegister1() {
        waitForClickable(By.name("register-button"), 10);// applied wait time
        clickOnElement(_clickOnRegisterButton); // perform click
    }

}




