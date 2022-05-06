package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;

public class T1_CydeoVerifications {

    public static void main(String[] args) {
//        TC #1: Cydeo practice tool verifications
//                Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL = "cydeo";
        String expectedTitle = "Practice";
        String actualURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
        System.out.println(actualURL);
        System.out.println(expectedURL);
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL verificatiob PASSED!");
        } else {
            System.out.println("URL verification not Passed!");
        }

        driver.close();
    }
}
