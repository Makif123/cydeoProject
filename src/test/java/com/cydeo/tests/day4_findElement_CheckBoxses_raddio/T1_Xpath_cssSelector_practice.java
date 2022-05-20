package com.cydeo.tests.day4_findElement_CheckBoxses_raddio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_cssSelector_practice {


    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement HomeCssSelector = driver.findElement(By.cssSelector("a[class='nav-link']")); // css selector standart.




        WebElement HomeCssSelector2 = driver.findElement(By.cssSelector("a.nav-link")); // css selector second with .


        WebElement HomeCssSelecto3 = driver.findElement(By.cssSelector("a[href='/']"));




        // Locate header using cssSelectorL locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        //locate header using xpath
        driver.findElement(By.xpath("//h2[text()='Forgot Password']"));



        driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@name='email']"));

        System.out.println(driver.findElement(By.xpath("//div[text()='Powered by ']")).getText());


        System.out.println(driver.findElement(By.xpath("//a[text()='Home']")).getText());
        System.out.println(driver.findElement(By.xpath("//h2[text()='Forgot Password']")).getText());
        System.out.println(driver.findElement(By.xpath("//label[text() = 'E-mail']")).getText());
        System.out.println(driver.findElement(By.xpath("//i[text() = 'Retrieve password']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text() = 'Powered by ' ]")).getText());

















    }}