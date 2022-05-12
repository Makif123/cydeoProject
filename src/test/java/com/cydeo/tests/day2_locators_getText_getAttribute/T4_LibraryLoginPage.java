package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.awt.*;
import java.sql.DataTruncation;
import java.sql.Driver;
import java.sql.DriverManager;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.navigate().to("https://library2.cybertekschool.com/login.html");
        WebElement inputEmail = driver.findElement(By.className("form-control"));
        inputEmail.sendKeys("wrong@gmail.com");
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("123kjasdn");

//        WebElement clickButton = driver.findElement(By.);
//        clickButton.click();

    }
}
