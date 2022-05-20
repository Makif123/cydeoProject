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
        driver.navigate().to("https://practice.cydeo.com/abtest");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());


            for (WebElement each : allLinks) {
                System.out.println("each = " + each.getText());
                System.out.println("each.getAttribute(\"href\") = " + each.getAttribute("href"));


            }
        }



    }

