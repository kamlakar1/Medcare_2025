package com.Medcare.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Medcare_1.base.*;

import com.Medcare_1.pages.LoginPage;
import com.Medcare_1.pages.MRDDocumentManagement;
import com.Medcare_1.utilities.RetryAnalyzer;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class Verify_10_19_1_Document_Management extends BaseTest {

	//WebDriver driver;

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void validLoginTest() throws AWTException, InterruptedException {
		MRDDocumentManagement  MRDDocument= new MRDDocumentManagement(driver);
		MRDDocument.SearchMRN_And_Upload_Documents();

		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}
}
