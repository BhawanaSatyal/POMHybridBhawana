package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class SocialMedia extends Utils {


    public void clickONSocialLinks(String socialLink) {
        clickOnElement(By.linkText(socialLink));

       // driver.switchTo().alert().accept();
    }
    public void handleWindow()
    {
        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);

                Assert.assertTrue(driver.getCurrentUrl().contains("nopCommerce"));
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}






