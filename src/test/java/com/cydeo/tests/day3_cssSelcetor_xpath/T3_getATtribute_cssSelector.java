package com.cydeo.tests.day3_cssSelcetor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T3_getATtribute_cssSelector {
    public static void main(String[] args) {
        WebDriver driver  = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/");
    }


}
