package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SocialMedia extends Utils {
    By _lnk_Facebook = By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    // By _btn_Cookies = By.xpath("//button[@title='Allow All Cookies']");
  //  By _acpt_Cookies = By.xpath("//button[@data-cookiebanner='accept_button']");
    By _lnk_Twitter = By.xpath("//a[@href='https://twitter.com/nopCommerce']");
    By _lnk_Youtube = By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']");


    public void verifyUserIsLinkedToFacebookPage() {
        clickOnElement(_lnk_Facebook);
        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
    }

    public void verifynopCommerceIsOnFaceBookPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("nopCommerce"));
        System.out.println("nopCommerce linked successfully to facebook page");


    }

    public void verifyUserIsLinkedToTwitterPage() {
        clickOnElement(_lnk_Twitter);
    }

    public void verifynopCommerceIsTwitterPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("nopCommerce"));
        System.out.println("nopCommerce linked successfully to Twitter page");
    }

    public void verifyUserIsLinkedToYoutubePage() {
        clickOnElement(_lnk_Youtube);
    }

    public void verifynopCommerceIsYoutubePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("nopCommerce"));
        System.out.println("nopCommerce linked successfully to Youtube page");

    }
}





