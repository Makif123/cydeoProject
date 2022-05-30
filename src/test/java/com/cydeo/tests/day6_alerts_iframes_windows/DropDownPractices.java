package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DropDownPractices {
    WebDriver driver;
    //    Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id ='state']")));
    String expectedDropDown = "California";

    @BeforeMethod

    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void Test1() {
        Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id ='state']")));

//        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown']")));
        selectDropdown.selectByVisibleText("Illinois");
    }

    @Test
    public void Test2() throws InterruptedException {
        Thread.sleep(1000);
        Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id ='state']")));
        selectDropdown.selectByValue("VA");
    }

    // How do you get default selected value?


    @Test
    public void Test3() throws InterruptedException {
        Thread.sleep(1000);
        Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id ='state']")));
        selectDropdown.selectByIndex(5);
        String expectedOptionText = "California";
        String actualOptionText = selectDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOptionText, actualOptionText);


    }

    @Test
    public void Test6() throws InterruptedException {


        Select year = new Select(driver.findElement(By.xpath("//select[@id = 'year']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
        Select day = new Select(driver.findElement(By.xpath("//select[@id = 'day']")));

        year.selectByVisibleText("1923");
        Thread.sleep(1000);
        month.selectByValue("11");
        Thread.sleep(1000);
        day.selectByIndex(0);

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";
        String actualYear = year.getFirstSelectedOption().getText();
        String actualMonth = month.getFirstSelectedOption().getText();
        String actualday = day.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualday, expectedDay);


    }


    @AfterMethod
    public void closeMethod() {
        driver.close();
        //
    }
}
