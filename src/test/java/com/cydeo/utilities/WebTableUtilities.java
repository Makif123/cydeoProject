package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtilities {


    public static String returnOrderDate(WebDriver driver, String costumerName) {

        String locator = "//table[@class='SampleTable']//td[.='" + costumerName + "']";
        WebElement customerDataCell = driver.findElement(By.xpath(locator));

        return customerDataCell.getText();
    }


}
