package com.Medcare_1.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.mortbay.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Medcare_1.utilities.ActionHelper;

public class ProcurmentConsignmentConversion  {



	By mainmenu = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon[1]");
	By Procurment = By.cssSelector("img[src='./assets/images/master-icons/procurement.png']");
	By SideBarr = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By Consignment = By.id("10044");
	By ConsignmetCovertion = By.id("10048");
	By ConsignmetPO = By.id("10045");
	By ConsignmetInward = By.id("10046");
	By dropdown = By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']");
	By conversionNo = By.name("conversionNo");
	By Sercah = By.cssSelector("button[type='submit']");


	By PatinetMRN = By.name("mrn");
	By DepartmentRequest = By.id("70005");	
	By AllDropdown = By.cssSelector("mat-select.mat-mdc-select");
	By Opt = By.xpath("//span[contains(text(),'OP ')]");
	By Test_Doctor = By.xpath("//span[contains(text(),'Test2 Doctor')]");
	By Clinic = By.xpath("//span[contains(text(),' Clinic ')]");
	By CLINIC1206 = By.xpath("//span[contains(text(),' CLINIC1206 ')]");
	By Physician_Review = By.xpath("//span[contains(text(),' Physician Review ')]");	
	By Add_new = By.cssSelector("button[mattooltip='Add New']");
	By CheckBox = By.xpath("input[class='mdc-checkbox__native-control']");
	By Save = By.cssSelector("button[mattooltip='Save']");
	By Yes = By.cssSelector("button[mattooltip='Yes']");
	By Details = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-dashboard-consignmentinward/div[3]/table/tbody/tr[1]/td[13]/a/mat-icon");

	
	By Supplier = By.name("Supplier Name");
	By AddItems = By.xpath("//mat-icon[contains(text(),'add')]");
	By SelectCheckBox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-additem/div/div[2]/div/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox/div/div/input");
	By AddI_tems = By.cssSelector("mat-icon[mattooltip='Add Items']");
	By ReceivedQuantity = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-consignmentinward/div[2]/table/tbody/tr/td[7]/mat-form-field/div[1]/div/div[2]/input");
	By Save_Submit = By.cssSelector("button[mattooltip='Save & Submit']");
	By Againt = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-consignmentconversion/mat-grid-list/div/mat-grid-tile[1]/div/mat-form-field/div[1]/div/div[2]/mat-select");
	By AgainstIndentopt  = By.xpath("//span[contains(text(),' Against Indent ')]");
	By Checkbox = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/app-additem-consignmentpo/div/div[2]/div[1]/mat-table/mat-row[1]/mat-cell[1]/mat-checkbox/div/div/input");
	By Save_1 = By.cssSelector("mat-icon[mattooltip='Save']");
	By Quantity = By.cssSelector("input[placeholder='Quantity']");
	By Expand = By.cssSelector("mat-icon[mattooltip='Expand']");
	By CovertConvesrtion = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-add-consignmentconversion/div[1]/div/table/tbody/tr[2]/td/table/tbody/tr/td[6]/mat-form-field/div[1]/div/div[2]/input");
	
	WebDriver driver;
	ActionHelper actions;


	public ProcurmentConsignmentConversion(WebDriver driver) {

		this.driver = driver;
		this.actions = new ActionHelper(driver);		
	}

	// Functions	
	public void ConsignmetConversion() throws AWTException, InterruptedException {

		driver.findElement(mainmenu).click();
		driver.findElement(Procurment).click();
		driver.findElement(SideBarr).click();
		driver.findElement(Consignment).click();
		driver.findElement(ConsignmetCovertion).click();
		driver.findElement(dropdown).click();
		driver.findElement(conversionNo).sendKeys("SSHRPHCONCON10037");
		driver.findElement(Sercah).click();

		// Assert Part

		Thread.sleep(5000);

		String getMrnDetails = driver.findElement(Details).getText();

		if (getMrnDetails == null || getMrnDetails.trim().isEmpty()) {
			System.out.println("Records not available");
			Assert.fail("Records not available");
		} else {
			String Actual = getMrnDetails;
			String Expected = "info"; 
			Assert.assertEquals(Actual, Expected);

		}


	}	
	// Functions	
		public void CreateConsignmetConversionDirect() throws AWTException, InterruptedException {

			driver.findElement(mainmenu).click();
			driver.findElement(Procurment).click();
			driver.findElement(SideBarr).click();
			driver.findElement(Consignment).click();
			driver.findElement(ConsignmetInward).click();	
			driver.findElement(Supplier).click();	
			driver.findElement(AddItems).click();
			driver.findElement(SelectCheckBox).click();
			driver.findElement(AddI_tems).click();
			driver.findElement(ReceivedQuantity).sendKeys("1");
			driver.findElement(Save_Submit).click();
			driver.findElement(Yes).click();
			
			// Assert Part

			Thread.sleep(5000);

			String getMrnDetails = driver.findElement(Details).getText();

			if (getMrnDetails == null || getMrnDetails.trim().isEmpty()) {
				System.out.println("Records not available");
				Assert.fail("Records not available");
			} else {
				String Actual = getMrnDetails;
				String Expected = "info"; 
				Assert.assertEquals(Actual, Expected);

			}


		}	
		public void CreateConsignmetConversionIndirect() throws AWTException, InterruptedException {

			driver.findElement(mainmenu).click();
			driver.findElement(Procurment).click();
			driver.findElement(SideBarr).click();
			driver.findElement(Consignment).click();
			driver.findElement(ConsignmetInward).click();	
			driver.findElement(Supplier).click();	
			driver.findElement(AddItems).click();
			driver.findElement(Checkbox).click();
			driver.findElement(AddI_tems).click();
			driver.findElement(Quantity).sendKeys("1");
			driver.findElement(Expand).click();
			driver.findElement(CovertConvesrtion).click();	
			driver.findElement(Save_1).click();
			
			// Assert Part

			Thread.sleep(5000);

			String getMrnDetails = driver.findElement(Details).getText();

			if (getMrnDetails == null || getMrnDetails.trim().isEmpty()) {
				System.out.println("Records not available");
				Assert.fail("Records not available");
			} else {
				String Actual = getMrnDetails;
				String Expected = "info"; 
				Assert.assertEquals(Actual, Expected);

			}


		}	
		// Functions	
		public void ConsignmetPO() throws AWTException, InterruptedException {

			driver.findElement(mainmenu).click();
			driver.findElement(Procurment).click();
			driver.findElement(SideBarr).click();
			driver.findElement(Consignment).click();
			driver.findElement(ConsignmetPO).click();
			driver.findElement(dropdown).click();
			driver.findElement(conversionNo).sendKeys("SSHRPHCONPO10007");
			driver.findElement(Sercah).click();

			// Assert Part

			Thread.sleep(5000);

			String getMrnDetails = driver.findElement(Details).getText();

			if (getMrnDetails == null || getMrnDetails.trim().isEmpty()) {
				System.out.println("Records not available");
				Assert.fail("Records not available");
			} else {
				String Actual = getMrnDetails;
				String Expected = "info"; 
				Assert.assertEquals(Actual, Expected);

			}


		}	
		public void Create_Consignment_PO() throws AWTException, InterruptedException {

			driver.findElement(mainmenu).click();
			driver.findElement(Procurment).click();
			driver.findElement(SideBarr).click();
			driver.findElement(Consignment).click();
			driver.findElement(ConsignmetInward).click();	
			driver.findElement(Supplier).click();	
			driver.findElement(AddItems).click();
			driver.findElement(Checkbox).click();
			driver.findElement(AddI_tems).click();
			driver.findElement(Quantity).sendKeys("1");
			driver.findElement(Expand).click();
			driver.findElement(CovertConvesrtion).click();	
			driver.findElement(Save_1).click();
			
			// Assert Part

			Thread.sleep(5000);

			String getMrnDetails = driver.findElement(Details).getText();

			if (getMrnDetails == null || getMrnDetails.trim().isEmpty()) {
				System.out.println("Records not available");
				Assert.fail("Records not available");
			} else {
				String Actual = getMrnDetails;
				String Expected = "info"; 
				Assert.assertEquals(Actual, Expected);

			}


		}	


}
