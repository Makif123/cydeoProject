package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test
    public void simpleDropdownTest() {

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown']"))); // Basically it means that we use Select object to take dropdown and then use the method to change webelement

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropDownText = currentlySelectedOption.getText();
        String expextedSimpleDropDownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropDownText, expextedSimpleDropDownText, "it's not matching");

        Select selectStateDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'state']")));
        WebElement firstSelectedOption = selectStateDropdown.getFirstSelectedOption();
        String actualOptionText = firstSelectedOption.getText();
        String expectedSelectStateDropdownText = "Select a State";
        Assert.assertEquals(actualOptionText,expectedSelectStateDropdownText,"It's something wrong");

//        Assert.assertEquals(selectStateDropdown.getFirstSelectedOption().getText(),expectedSelectStateDropdownText);

    }
}
