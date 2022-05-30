package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframes {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }


    @Test
    public void iframe_test() {

        // Locate the p tag
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame("mce_0_ifr");
        WebElement yourContentGoesHereTExt = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereTExt.isDisplayed());


        //Verify An iFrame containing the TinyMCE WYSIWYG Editor
        // To be able to verify the header we must switch back to main HTML


        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());



    }

}
