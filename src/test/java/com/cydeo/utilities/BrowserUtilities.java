package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtilities {
    public static void sleep(int time) {
        time *= 1000;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }

    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {

        Set<String> allWindowsHandle = driver.getWindowHandles();
        for (String each : allWindowsHandle) {
            driver.switchTo().window(each);

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }


}
