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

public class Scenario_9_19_Consignment_PO extends BaseTest {

	//WebDriver driver;

	@Test(retryAnalyzer = RetryAnalyzer.class, priority =1)
	public void ConsignmetPO() throws AWTException, InterruptedException {
		ProcurmentConsignmentConversion  Procurment= new ProcurmentConsignmentConversion(driver);
		Procurment.ConsignmetPO();

	}
/*
	@Test(retryAnalyzer = RetryAnalyzer.class,  priority =2)
	public void Create_Consignment_PO () throws AWTException, InterruptedException {
		ProcurmentConsignmentConversion  ProcurmentDircet= new ProcurmentConsignmentConversion(driver);
		ProcurmentDircet.CreateConsignmetConversionDirect();


	}
	
	*/
}
