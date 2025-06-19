package com.Medcare.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Medcare_1.base.*;

import com.Medcare_1.pages.LoginPage;
import com.Medcare_1.utilities.RetryAnalyzer;

public class LoginTest extends BaseTest {
	
	WebDriver driver;

	 @Test(retryAnalyzer = RetryAnalyzer.class)
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123");

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
