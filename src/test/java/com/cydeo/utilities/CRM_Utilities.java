package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void crm_login(WebDriver driver){

        driver.get("https://login1.nextbasecrm.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@name = 'USER_LOGIN']"));
        WebElement userPassword = driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));

        userName.sendKeys("helpdesk1@cybertekschool.com");
        userPassword.sendKeys("UserUser");
        loginButton.click();
    }
    public static void crm_login(WebDriver driver, String userName , String userPassword){

        driver.get("https://login1.nextbasecrm.com/");
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name = 'USER_LOGIN']"));
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name = 'USER_PASSWORD']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));

        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(userPassword);
        loginButton.click();
    }



}
