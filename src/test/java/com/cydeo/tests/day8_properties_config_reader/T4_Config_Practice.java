package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

    @Test
    public void google_search_test() {
// we are getting the browser the browser type  dynamically from our configuration properties file
//        String browserType = ConfigurationReader.getProperty("browser");
//        driver = WebDriverFactory.getDriver(browserType);
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        WebElement agree = driver.findElement(By.xpath("//div[.='I agree']"));
        agree.click();
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        BrowserUtilities.verifyTitle(driver, ConfigurationReader.getProperty("searchValue") + " - Google Search");


    }
}
