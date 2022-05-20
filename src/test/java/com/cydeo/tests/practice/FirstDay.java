package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDay {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> loginName = new ArrayList<>();


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");


        for (int i = 7; i <= 101; i++) {
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();

            driver.navigate().to("https://qa.nextbasecrm.com/");
            String firstUrl = driver.getCurrentUrl();
            WebElement login = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
            WebElement password = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
            WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

            login.sendKeys("hr" + i + "@cybertekschool.com");
            password.sendKeys("UserUser");
            loginButton.click();
            Thread.sleep(3000);


            if (driver.getCurrentUrl().equals("https://qa.nextbasecrm.com/stream/?login=yes")) {
                WebElement insideTheLoginPage = driver.findElement(By.id("user-name"));
                insideTheLoginPage.click();
                WebElement logOut = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"));
                logOut.click();


            }

            if (driver.getCurrentUrl().equals("https://qa.nextbasecrm.com/?login=yes")) {
                loginName.add("helpdesk" + i + "@cybertekschool.com");
            }

            driver.quit();
        }


        System.out.println(loginName);


    }
}
