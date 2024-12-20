package com.CarnationTestingShastra24KDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CarnationTestingShastra24KDD.Keyword;

public class DashboardPage {

	Keyword keyword = new Keyword();
	
	String viewPIMModule = "a[href*='/web/index.php/pim/viewPimModule']";
	
	@FindBy(css = "a[href*='PimModule']")
	WebElement pimMenu;
	
	@FindBy(css = "a[href*='AdminModule']")
	WebElement adminMenu;
	
	@FindBy(css = " a[href*='LeaveModule']" )
	WebElement leaveMenu;
	
	
	@FindBy(css = "div.orangehrm-header-container button[type=\"button\"]")
	WebElement addbtn;
	
	public void clickOnAdminMenu() {
		adminMenu.click();

	}
	
	public void clickOnAddbtnInPIMMenu() {
		keyword.waitForElementToBeVisible(addbtn);
		addbtn.click();

	}
	
	public DashboardPage(){
		PageFactory.initElements(Keyword.driver, this);
	}
	
	
	public void clickOnPIMMenu() {
		pimMenu.click();

	}
	
	
	public void waitForPIMMenuToBeVisible() {

		
		keyword.waitForElementToBeVisible(By.cssSelector(viewPIMModule)); 
	}
	
}
