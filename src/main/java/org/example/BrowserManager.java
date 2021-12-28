package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage {

    LoadProp loadProp = new LoadProp(); // loadProp method declaration

    String browserName = "Chrome";

    public void openBrowser() {
        if (browserName.equalsIgnoreCase("Chrome")) { // check condition if browsername is chrome
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe"); //
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) { // check condition
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new EdgeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.geko.driver", "src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Incorrect Browser"); // print statement if condition is not met
        }

        driver.manage().window().maximize(); // maximize window
        driver.get(loadProp.getProperty("url"));// load url
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // applied wait time
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);


    }

    public void closeBrowser() {
        driver.close(); // close browser

    }
}