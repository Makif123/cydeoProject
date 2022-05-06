package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class BasicNavigation {

    private String name;
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().to("https://www.tesla.com");

        System.out.println(driver.getTitle())   ;
                Thread.sleep(3000);

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.quit();

                Thread.sleep(3000);
        driver.close();




    }
}
