package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://practice.cydeo.com/registration_form");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String headerText = driver.findElement(By.tagName("h2")).getText();

                String expextedResult = "Registration form";

                if(headerText.equals(expextedResult)){
                    System.out.println("Pass");
                } else {
                    System.out.println("No");
                }


    }
}
