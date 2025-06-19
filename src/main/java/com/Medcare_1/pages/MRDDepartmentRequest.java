package com.Medcare_1.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.mortbay.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Medcare_1.utilities.ActionHelper;

public class MRDDepartmentRequest  {



	By mainmenu = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon[1]");
	By Lab = By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/div/div[1]/div/img");
	By SideBarr = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By DepartmentRequest = By.id("70005");
	By dropupp = By.xpath("//mat-icon[normalize-space(text())='arrow_drop_up']");
	By dropdown = By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']");
	By PatinetMRN = By.name("mrn");
	By Sercah = By.cssSelector("button[type='submit']");
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


	WebDriver driver;
	ActionHelper actions;


	public MRDDepartmentRequest(WebDriver driver) {

		this.driver = driver;
		this.actions = new ActionHelper(driver);		
	}

	// Functions	
	public void DepartmentRequest() throws AWTException, InterruptedException {
		driver.findElement(mainmenu).click();
		WebElement scrollableMenu = driver.findElement(By.cssSelector("div.mat-menu-modal.menu-modal-list"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scrollableMenu);
		driver.findElement(Lab).click();
		driver.findElement(SideBarr).click();
		Robot robot5 = new Robot();
        for (int i = 0; i < 3; i++) {
            robot5.keyPress(KeyEvent.VK_CONTROL);
            robot5.keyPress(KeyEvent.VK_SUBTRACT);
            robot5.keyRelease(KeyEvent.VK_SUBTRACT);
            robot5.keyRelease(KeyEvent.VK_CONTROL);
        }
        Thread.sleep(5000);      
        
        
      
        
        
        
		driver.findElement(DepartmentRequest).click();
		
		/*
		java.util.List<WebElement> Visit_Type = driver.findElements(AllDropdown);
		if (!Visit_Type.isEmpty()) {
			Visit_Type.get(0).click();
		}
		
		driver.findElement(Opt).click();
		
		java.util.List<WebElement> RequestedBy = driver.findElements(AllDropdown);
		if (!RequestedBy.isEmpty()) {
			Visit_Type.get(1).click();
		}
		driver.findElement(Test_Doctor).click();
		java.util.List<WebElement> RequestLocationType = driver.findElements(AllDropdown);
		if (!RequestLocationType.isEmpty()) {
			Visit_Type.get(2).click();
		}
		driver.findElement(Clinic).click();
		java.util.List<WebElement> RequestLocation = driver.findElements(AllDropdown);
		if (!RequestLocation.isEmpty()) {
			Visit_Type.get(3).click();
		}
		driver.findElement(CLINIC1206).click();  
		java.util.List<WebElement> ToLocationType = driver.findElements(AllDropdown);
		if (!ToLocationType.isEmpty()) {
			Visit_Type.get(4).click();
		}
		driver.findElement(Clinic).click();
		java.util.List<WebElement> ToLocation = driver.findElements(AllDropdown);
		if (!ToLocation.isEmpty()) {
			Visit_Type.get(5).click();
		}
		driver.findElement(CLINIC1206).click();
		java.util.List<WebElement> Reason = driver.findElements(AllDropdown);
		if (!Reason.isEmpty()) {
			Visit_Type.get(6).click();
		}
		
		*/
		
		// Step 1: Define all option locators in the order matching your dropdowns
		By[] optionLocators = new By[] {
		    Opt,            // For Visit Type
		    Test_Doctor,    // For Requested By
		    Clinic,         // For Request Location Type
		    CLINIC1206,     // For Request Location
		    Clinic,         // For To Location Type
		    CLINIC1206,     // For To Location
		    Physician_Review // For Reason
		};

		// Step 2: Find all dropdowns (assuming they are consistently located with AllDropdown)
		java.util.List<WebElement> allDropdowns = driver.findElements(AllDropdown);

		// Step 3: Loop through all dropdowns and select the respective option
		for (int i = 0; i < optionLocators.length; i++) {
		    if (i < allDropdowns.size()) {
		        allDropdowns.get(i).click();  // Click dropdown
		        driver.findElement(optionLocators[i]).click(); // Select option
		    } else {
		        System.out.println("Dropdown index " + i + " not found.");
		    }
		}

		driver.findElement(Physician_Review).click();
		driver.findElement(Add_new).click();
		driver.findElement(CheckBox).click();
		driver.findElement(Save).click();
		driver.findElement(Yes).click();

	}	

}
