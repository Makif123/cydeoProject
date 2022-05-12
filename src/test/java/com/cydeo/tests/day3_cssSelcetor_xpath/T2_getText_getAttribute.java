package com.cydeo.tests.day3_cssSelcetor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com/");
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String rememberMeText = "Remember me on this computer";
        String forgotPasswordText = "forgot your password?";
        if (rememberMe.getText().equalsIgnoreCase(rememberMeText)) {
            System.out.println("It's okay");
        } else {
            System.out.println("It's not");
        }
        System.out.println(forgotPasswordLink.getText());
        if (forgotPasswordLink.getText().equalsIgnoreCase(forgotPasswordText)) {
            System.out.println("second test is okay");
        } else {
            System.out.println("second test is not okay");
        }

        String expectedInHref = "forgot_password=yes";
        String actualHrefAttribute = forgotPasswordLink.getAttribute("href");
        System.out.println(actualHrefAttribute);

        if (actualHrefAttribute.contains("forgot_password=yes")) {
            System.out.println("yes");
        }else {
            System.out.println("not");
        }


    }
}
