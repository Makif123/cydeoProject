package com.cydeo.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test() {
        driver.get("https://amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

//        for (String each : driver.getWindowHandles()) {
//
//        }
        Set<String> allWindowsHandle = driver.getWindowHandles();
        for (String each : allWindowsHandle) {
           driver.switchTo().window(each);
        }

//        LinkedList<String> listOfWindow = new LinkedList<>();
//        for (String windowHandle : driver.getWindowHandles()) {
//            listOfWindow.add(windowHandle);
//            System.out.println("windowHandle = " + windowHandle);
//        }

    }

//    @AfterMethod
//    public void close() {
//        driver.close();
//        driver.switchTo().window();
//    }
}
