package com.cydeo.tests.day3_cssSelcetor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getATtribute_cssSelector {
    public static void main(String[] args) {
        WebDriver driver  = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");

        // tagname[attribute='value']

        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println(actualButtonText);

        if (actualButtonText.equals(expectedButtonText)) {
            System.out.println("Log in button text verification passed");
        } else {
            System.out.println("Log in button text verification failed");
        }

    }


}
