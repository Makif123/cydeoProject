package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test() {
        //2. Verify Bob's name is listed as expected.
        System.out.println(WebTableUtilities.returnOrderDate(driver, "Bob Martin"));

        WebElement BobsDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/..//td[5]"));

        String expectedDate = "12/31/2021";
        Assert.assertEquals(actualText, expectedText);
        Assert.assertEquals(actualDate, expectedDate);

        System.out.println(WebTableUtilities.returnOrderDate(driver, "Bob Martin"));

    }
}
