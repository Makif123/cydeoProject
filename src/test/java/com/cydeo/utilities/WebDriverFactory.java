package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Scanner;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType) {


        if (browserType.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            return new ChromeDriver(options);

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
//            FirefoxOptions options = new FirefoxOptions();
//            options.addArguments("--no-sandbox");
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type does not exister/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }


    }

}

