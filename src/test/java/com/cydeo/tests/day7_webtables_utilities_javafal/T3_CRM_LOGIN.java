package com.cydeo.tests.day7_webtables_utilities_javafal;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.CRM_Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN extends TestBase {



    @Test
    public void crm_login_test() {


        CRM_Utilities.crm_login(driver);
        BrowserUtilities.verifyTitle(driver, "Portal");

    }

    @Test
    public void crm_login_test_overriding() {
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");
        BrowserUtilities.verifyTitle(driver, "Portal");

    }
}
