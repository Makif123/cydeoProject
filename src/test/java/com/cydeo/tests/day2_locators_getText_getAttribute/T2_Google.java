package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class T2_Google {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://yahoo.com");
        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        WebElement googleSeachBox = driver.findElement(By.name("p"));
        googleSeachBox.sendKeys("The best company ever as a tester" + Keys.ENTER);
        String expectedInTitle = "The";
        String actualTitle = driver.getTitle();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        if (actualTitle.startsWith(expectedInTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Wrong");
        }


    }

}
