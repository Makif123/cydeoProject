package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumTest {

private String name;
    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox"); // izole ortamda calistirmamak icin
//      options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

//        System.out.println(driver.getTitle());
    }

}


