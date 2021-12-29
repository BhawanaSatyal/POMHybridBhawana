package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AlertPop extends Utils{

    By _btn_Vote = By.id("vote-poll-1");

    public void verifyVoteButtonIsVisible(){
        Assert.assertTrue(driver.findElement(_btn_Vote).isDisplayed());
        System.out.println("Vote button present");

    }
    public void clickOnVoteButton(){
        clickOnElement(_btn_Vote);
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "Please select an answer"); // condition
        driver.switchTo().alert().accept();  // accept alert

    }
}
