package com.Medcare.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Medcare_1.base.*;

import com.Medcare_1.pages.LoginPage;
import com.Medcare_1.pages.MRDDocumentManagement;
import com.Medcare_1.pages.ProcurmentConsignmentConversion;
import com.Medcare_1.utilities.RetryAnalyzer;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class Scenario_9_18_Consignment_Conversion extends BaseTest {

	//WebDriver driver;

	@Test(retryAnalyzer = RetryAnalyzer.class, priority =1)
	public void Search_Consignment_Conversion() throws AWTException, InterruptedException {
		ProcurmentConsignmentConversion  Procurment= new ProcurmentConsignmentConversion(driver);
		Procurment.ConsignmetConversion();

	}

	@Test(retryAnalyzer = RetryAnalyzer.class,  priority =2)
	public void Create_Consignment_Conversion_direct () throws AWTException, InterruptedException {
		ProcurmentConsignmentConversion  ProcurmentDircet= new ProcurmentConsignmentConversion(driver);
		ProcurmentDircet.CreateConsignmetConversionDirect();


	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class,  priority =3)
	public void Create_Consignment_Conversion_Indirect () throws AWTException, InterruptedException {
		ProcurmentConsignmentConversion  ProcurmentDircet= new ProcurmentConsignmentConversion(driver);
		ProcurmentDircet.CreateConsignmetConversionIndirect();


	}
}
