package com.cydeo.tests.day4_findElement_CheckBoxses_raddio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StateElementReferenceException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/abtest");
        driver.manage().window().maximize();

        WebElement cydeoLink = driver.findElement(By.xpath("//a[text() = 'CYDEO']"));


        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        driver.navigate().refresh();
        cydeoLink = driver.findElement(By.xpath("//a[text() = 'CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());



    }
}
