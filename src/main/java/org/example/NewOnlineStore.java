package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewOnlineStore extends Utils {

    LoadProp loadProp = new LoadProp();

    By _btn_Logout = By.xpath("//a[@href='/logout']");
    By _btn_continue = By.xpath("//a[@class='button-1 register-continue-button']");
    By _btn_Details = By.xpath("//a[@href='/new-online-store-is-open' and @class='read-more']");
    By _txt_Title = By.id("AddNewComment_CommentTitle");
    By _txt_Comment = By.id("AddNewComment_CommentText");
    By _btn_NewComment = By.xpath("//button[@name='add-comment']");
    By _msg_NewsCommentSuccess = By.xpath("//div[@class ='result']");


    public void verifyUserIsRegistered() {
        Assert.assertTrue(driver.findElement((_btn_Logout)).isDisplayed()); // checking for condition
        System.out.println("Registered User");
    }

    public void clickOnDetails() {
        clickOnElement(_btn_continue); // click on continue
        clickOnElement(_btn_Details);
    }

    public void fillUpLeaveYourComment() {

        typeText(_txt_Title, loadProp.getProperty("Title")); // type title
        typeText(_txt_Comment, loadProp.getProperty("Comment")); // type comment
        clickOnElement(_btn_NewComment); // click on comment
    }

    public void verifyNewCommentAddedSuccessfully() {

        Assert.assertTrue(driver.findElement((_msg_NewsCommentSuccess)).isDisplayed()); // checking for condition
        System.out.println("NewComment added successfully");

        List<WebElement> comments = driver.findElements(By.xpath("//div[@class=\"comment news-comment\"]"));

        WebElement myComment = comments.get(comments.size() - 1);


        System.out.println(myComment.getText().contains("Amazing")); // print out statement


    }
}
