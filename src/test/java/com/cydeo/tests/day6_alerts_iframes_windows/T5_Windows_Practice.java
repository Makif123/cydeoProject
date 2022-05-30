package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_window_test() {
        //Storing the main page's hanldle as string us food practice
        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        actualTitle = driver.getTitle();
        System.out.println("Title after click" + actualTitle);
        Set<String> allWindows = driver.getWindowHandles();

        for (String each : allWindows) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows " + driver.getTitle());

        }
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleAfterClick);

        System.out.println("expectedTitleAfterClick = " + expectedTitleAfterClick);
// if we want to go back to main page , we can use already stored main handle
        driver.switchTo().window(mainHandle);


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
