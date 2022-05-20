package com.cydeo.tests.day4_findElement_CheckBoxses_raddio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        driver.navigate().to("https://practice.cydeo.com/abtest");
        WebElement HomeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement CydeoLink = driver.findElement(By.xpath("//a[@class='nav-link']"));


    }
}
