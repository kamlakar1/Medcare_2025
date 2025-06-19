package com.Medcare.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Medcare_1.base.*;

import com.Medcare_1.pages.LoginPage;
import com.Medcare_1.pages.MRDDepartmentRequest;
import com.Medcare_1.pages.MRDDocumentManagement;
import com.Medcare_1.utilities.RetryAnalyzer;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class Verify_10_20_Department_Request extends BaseTest {

	//WebDriver driver;

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validLoginTest() throws AWTException, InterruptedException {
		MRDDepartmentRequest  MRDReq= new MRDDepartmentRequest(driver);
		MRDReq.DepartmentRequest();

		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}
}
