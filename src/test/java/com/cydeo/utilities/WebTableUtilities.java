package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtilities {


    public static String returnOrderDate(WebDriver driver, String customerName) {

        String locator = "//table[@class='SampleTable']//td[.='" + customerName + "']";
        WebElement customerDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='" + customerName + "']/..//td[5]"));
        WebElement customerDataCell = driver.findElement(By.xpath(locator));

        return customerDate.getText();
    }


    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {
        String locator = "//table[@class='SampleTable']//td[.='" + customerName + "']";
        WebElement customerDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='" + customerName + "']/..//td[5]"));
        String actualOrderDate = customerDate.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);

    }


}
