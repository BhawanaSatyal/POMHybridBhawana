
package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class CategoryPage extends Utils {
    Actions actions = new Actions(driver);
  By _txt_Search = By.id("small-searchterms");

    By _pageTitle = By.xpath("//h1");




    public void verifyUserIsOnHomepage(){
        Assert.assertTrue(driver.findElement((_txt_Search)).isDisplayed());
    }
    public void clickOnCategoryButton(String category_button_name) {
        clickOnElement(By.linkText(category_button_name));
    }

  public void verifyURL(String url) {
    Assert.assertTrue(getMyUrl().equals(url));
  }

  public void verifyPageTitle(String pageTitle) {
    Assert.assertEquals(getTextFromElement(_pageTitle), pageTitle);
  }



    public void hoverOnCategory(String category){
        actions.moveToElement(driver.findElement(By.linkText(category))).perform();
    }

}
