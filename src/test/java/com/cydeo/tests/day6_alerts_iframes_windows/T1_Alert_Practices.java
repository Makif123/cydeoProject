package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_test1() throws InterruptedException {

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']")); // >>>>//button[.='Click for JS Alert'
        clickButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id = 'result']"));

        String actualResult = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");
        String expectedResult = "You successfully clicked an alert";

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void alert_test2() {

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")); // >>>>//button[.='Click for JS Alert'
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();


    }

    @Test
    public void alert_test3() {

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")); // >>>>//button[.='Click for JS Alert'
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");


    }


//    @AfterMethod
//    public void closeMethod() {
//        driver.close();
//    }
}
