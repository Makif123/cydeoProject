package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionPractices {

    @Test
    public void t4_t5_test(){
        Driver.getDriver().get("https://practice.cydeo.com");

        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLink).perform();
        BrowserUtilities.sleep(4);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        BrowserUtilities.sleep(4);

        Driver.closeDriver();

    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }


    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }


    @Test
    public void test5(){
        Driver.getDriver().get("https://practice.cydeo.com");
        Driver.closeDriver();
    }

}
