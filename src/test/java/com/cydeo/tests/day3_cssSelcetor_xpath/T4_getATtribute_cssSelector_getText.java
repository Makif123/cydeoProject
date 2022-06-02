package com.cydeo.tests.day3_cssSelcetor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getATtribute_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");



        String expectedPassword = "Reset password";
        WebElement ResetPassword = driver.findElement(By.cssSelector("button[value ='Reset password']"));

        System.out.println(ResetPassword.getAttribute("value"));

        String expectedResetPasswardButtonText = "Reset Password";
        String actualResetPassWordButtonText = ResetPassword.getText();

        if (actualResetPassWordButtonText.equals(expectedResetPasswardButtonText)) {
            System.out.println("Button text verification PASSED");
        } else {
            System.out.println("UNPASSED");
        }

        if (ResetPassword.getAttribute("value").equals(expectedPassword)) {
            System.out.println("PASS");

        } else {
            System.out.println("WRONG");
        }





    }
}
