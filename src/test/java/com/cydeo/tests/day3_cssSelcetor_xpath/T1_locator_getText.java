package com.cydeo.tests.day3_cssSelcetor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_locator_getText {











    public static void main(String[] args) throws InterruptedException {
//        TC #1: Cydeo practice tool verifications
//                Open Chrome Browser
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox");
//        WebDriver driver = new ChromeDriver(options);

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com/");
        WebElement loginIcon = driver.findElement(By.className("login-inp"));
        loginIcon.sendKeys("wrongdsf@gmail.com");
        WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));
        Thread.sleep(3000);
        user_password.sendKeys("12345");
        WebElement login = driver.findElement(By.className("login-btn"));
        login.click();

        WebElement errorText = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        System.out.println(errorText.getText());
        if (errorText.getText().equals(expectedErrorMessage)) {
            System.out.println("Login is working ");
        } else {
            System.out.println("Is not working");
        }


    }
}
