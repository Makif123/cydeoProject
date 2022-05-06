package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YahooTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        driver.get("https://www.yahoo.com");

        String actualTitle = "Yahoo is part of the Yahoo family of brands";
        System.out.println(driver.getTitle());
        if(driver.getTitle().equals(actualTitle)) {
            System.out.println("Title is as expected Verifaction PASS");
        } else {
            System.out.println("Titsle is not accepted Verification not PASS");
        }
    }


}
