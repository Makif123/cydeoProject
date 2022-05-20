package com.cydeo.tests.day4_findElement_CheckBoxses_raddio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxex {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/checkboxes");

        WebElement checkboxes1 = driver.findElement(By.xpath("//input[@name = 'checkbox1']"));
        WebElement checkboxes2 = driver.findElement(By.xpath("//input[@name = 'checkbox2']"));
        System.out.println("checkboxes1.isSelected() = " + checkboxes1.isSelected());
        System.out.println("checkboxes2.isSelected() = " + checkboxes2.isSelected());


        checkboxes1.click();

        checkboxes2.click();


        System.out.println("checkboxes1.isSelected(), expecting true = " + checkboxes1.isSelected());
        System.out.println("checkboxes1.isSelected(), expecting false  = " + checkboxes2.isSelected());


    }
}
