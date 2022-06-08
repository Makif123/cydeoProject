package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {
    @Test
    public void test1() {
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtilities.sleep(4);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));


        acceptCookiesButton.click();
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement dropTarget = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());


//        actions.dragAndDrop(draggable,dropTarget).perform();

        actions.clickAndHold(draggable).
                pause(2000).moveToElement(dropTarget).
                pause(2000).release().perform();
        BrowserUtilities.sleep(3);
        Driver.closeDriver();
    }
}
