package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DropDownPractices {
    WebDriver driver;
    Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id ='state']")));
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
//        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown']")));
        selectDropdown.selectByVisibleText("Illinois");
    }

    @Test
    public void Test2() {

        selectDropdown.selectByVisibleText("Virginia");
    }

    // How do you get default selected value?


    @Test
    public void Test3() {

        selectDropdown.selectByVisibleText("California");




    }

    @Test
    public void Test4(){

        WebElement wrappedElement = selectDropdown.getWrappedElement();


    }


    @AfterMethod
    public void closeMethod() {
        driver.close();
        //
    }
}