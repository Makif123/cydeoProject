package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com");
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));

        abTestLink.click();
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getCurrentUrl());

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Pass");
        }else {
            System.out.println("UNVALID");
        }

        driver.navigate().back();

        expectedTitle = "Practice";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Pass");
    }else {
        System.out.println("UNVALID");
    }



    }
}
