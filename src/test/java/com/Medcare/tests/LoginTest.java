package com.Medcare.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Medcare_1.base.*;

import com.Medcare_1.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	WebDriver driver;

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123");

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
