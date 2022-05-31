package com.cydeo.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {
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
    public void crm_login_test() {


    }
}
