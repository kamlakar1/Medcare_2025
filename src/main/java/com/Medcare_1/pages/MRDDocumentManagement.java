package com.Medcare_1.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Medcare_1.utilities.ActionHelper;

public class MRDDocumentManagement  {



	By mainmenu = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon[1]");
	By Lab = By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/div/div[1]/div/img");
	By DocumentManagment = By.cssSelector("a[id='70012']");
	By dropupp = By.xpath("//mat-icon[normalize-space(text())='arrow_drop_up']");
	By dropdown = By.xpath("//mat-icon[normalize-space(text())='arrow_drop_down']");
	By PatinetMRN = By.name("mrn");
	By Sercah = By.cssSelector("button[type='submit']");
	By Add_new = By.cssSelector("button[mattooltip='Add New']");
	By SideBarr = By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

	By SelectPatinet = By.xpath("mat-row[class='mat-mdc-row mdc-data-table__row cdk-row highlight ng-star-inserted']");
	By UploadButton = By.id("file");
	By Save = By.cssSelector("button[mattooltip='Save']");
	By Yes = By.cssSelector("button[mattooltip='Yes']");


	WebDriver driver;
	ActionHelper actions;


	public MRDDocumentManagement(WebDriver driver) {

		this.driver = driver;
		this.actions = new ActionHelper(driver);		
	}

	// Functions	
	public void SearchMRN_And_Upload_Documents() throws AWTException, InterruptedException {
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
		driver.findElement(DocumentManagment).click();
		driver.findElement(dropdown).click();
		driver.findElement(PatinetMRN).sendKeys("11447-2025");
		driver.findElement(Sercah).click();
		driver.findElement(SelectPatinet).click();
		driver.findElement(UploadButton).click();	
		WebElement browse = driver.findElement(UploadButton);
		browse.sendKeys("C:\\Users\\Kamlakar\\eclipse-workspace\\Medcare_1\\Testdata.txt");
		driver.findElement(Save).click();

	}	

}
