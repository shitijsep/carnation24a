package com.Carnation24KDD.TestingShastra;

import static com.CarnationTestingShastra24KDD.Util.PropertiesUtil.getLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CarnationTestingShastra24.stepdefinations.Hooks;
import com.CarnationTestingShastra24KDD.Keyword;
import com.CarnationTestingShastra24KDD.Util.App;
import com.CarnationTestingShastra24KDD.locators.Locator;
import com.CarnationTestingShastra24KDD.pages.DashboardPage;
import com.CarnationTestingShastra24KDD.pages.LoginPage;

public class AddUserTest{

	@Test
	public void verifyIfNameOfAlreadyCreatedUserPOpulatesinList() throws InterruptedException {
		Keyword keyword = new Keyword();

		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Keyword.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Keyword.driver.findElement(By.xpath("//div[contains(@class,\"oxd-form-actions\")]/button[contains(@class,\"oxd-button\")]")).click();
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]"));
		Keyword.driver.findElement(By.xpath("//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]")).click();
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		Keyword.driver.findElement(By.xpath("//button[text() = \" Add \"]")).click();
		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"firstName\"]"));
		Keyword.driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("John");
		Keyword.driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("");
		Keyword.driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Patil");
		Keyword.driver.findElement(By.xpath("//button[text() =\" Save \"]")).click();
		Thread.sleep(5000);
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"AdminModule\")]"));
		Keyword.driver.findElement(By.xpath("//a[contains(@href,\"AdminModule\")]")).click();
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		Keyword.driver.findElement(By.xpath("//button[text() = \" Add \"]")).click();
		keyword.waitForElementToBeVisible(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		Keyword.driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]")).click();
		Thread.sleep(3000);
		Keyword.driver.findElement(By.xpath("//div[@role='listbox']/descendant::*[contains(text(),'ESS')]")).click();
		Keyword.driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("John");
		Thread.sleep(3000);
		List<WebElement> nameList = Keyword.driver.findElements(By.xpath("//div[@role='option']/span"));
		boolean isFound = false;
		for (WebElement name : nameList) {
			if (name.getText().contains("John")) {
				isFound = true;
				break;
			}
		}
		Assert.assertTrue(isFound);

	}

	
	/**
	 * This method will execute with loacator Interfae 
	 * @throws InterruptedException
	 */
	@Test
	public void verifyIfNameOfAlreadyCreatedUserPopulatesInListUsingKeywords() throws InterruptedException {

		Keyword keyword = new Keyword();

		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]"));
		keyword.enterText("css", Locator.userName, App.getUserName("qa"));
		keyword.enterText("css", Locator.password, App.getPassword("qa"));
				
		keyword.clickOn("xpath", Locator.submit);
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]"));
		keyword.clickOn("xpath", Locator.viewPIMModule);
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		keyword.clickOn("xpath", Locator.addBtn);
		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"firstName\"]"));
		keyword.enterText(Locator.firstName, "John");
		keyword.enterText(Locator.middleName, "");
		keyword.enterText(Locator.lastName, "Patil");
		keyword.clickOn("xpath", Locator.saveBtn);
		Thread.sleep(5000);
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"AdminModule\")]"));
		keyword.clickOn("xpath", Locator.adminModule);
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		keyword.clickOn("xpath", Locator.addBtnInadminModule);
		keyword.waitForElementToBeVisible(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		keyword.clickOn("xpath", Locator.UserRole);
		Thread.sleep(3000);
		keyword.clickOn("xpath", Locator.selectESS);
		keyword.enterText(Locator.hintsOfEmpName, "John");
		Thread.sleep(5000);
		
		List<WebElement> nameList = Keyword.driver.findElements(By.xpath(Locator.searchInHintsOfEmpName));
		
		boolean isFound = false;
		for (WebElement name : nameList) {
			if (name.getText().contains("John")) {
				isFound = true;
				break;
			}
		}
		Assert.assertTrue(isFound);

		
		
	}


	/**
	 * This method will execute with properties file(PropertiesUtil class).
	 * @throws InterruptedException
	 */
	@Test
	public void verifyIfNameOfAlreadyCreatedUserPopulatesInListUsingKeywordsUsingPropertiesFile() throws InterruptedException {

		Keyword keyword = new Keyword();

		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"username\"]"));
		keyword.waitForElementToBeVisible(By.cssSelector("input[name='username']"));
		
		
//		keyword.enterText(Locator.userName, "Admin");
		keyword.enterText("css", Locator.userName, App.getUserName("qa"));
//		keyword.enterText(Locator.password, "admin123");
		keyword.enterText("css", Locator.password, App.getPassword("qa"));
		
		keyword.clickOn("xpath", Locator.submit);
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"/web/index.php/pim/viewPimModule\")]"));
		keyword.clickOn("xpath", Locator.viewPIMModule);
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		keyword.clickOn("xpath", Locator.addBtn);
		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"firstName\"]"));
		
//		keyword.enterText(Locator.firstName, "John");
//		keyword.enterText(PropertiesUtil.getLocator("firstName"), "John");
//		Following happend because i made static import of PropertiesUtil class
		keyword.enterText(getLocator("firstName"), "John");
		
//		keyword.enterText(Locator.middleName, "");
//		keyword.enterText(PropertiesUtil.getLocator("middleName"), "");
//		Following happend because i made static import of PropertiesUtil class
		keyword.enterText(getLocator("middleName"), "");
		
//		keyword.enterText(Locator.lastName, "Patil");
//		keyword.enterText(PropertiesUtil.getLocator("lastName"), "Ratndeep");
//		Following happend because i made static import of PropertiesUtil class
		keyword.enterText(getLocator("lastName"), "Ratndeep");
		
		keyword.clickOn("xpath", Locator.saveBtn);
		Thread.sleep(5000);
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"AdminModule\")]"));
		keyword.clickOn("xpath", Locator.adminModule);
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		keyword.clickOn("xpath", Locator.addBtnInadminModule);
		keyword.waitForElementToBeVisible(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		keyword.clickOn("xpath", Locator.UserRole);
		Thread.sleep(3000);
		keyword.clickOn("xpath", Locator.selectESS);
		keyword.enterText(Locator.hintsOfEmpName, "John");
		Thread.sleep(5000);
		
		List<WebElement> nameList = Keyword.driver.findElements(By.xpath(Locator.searchInHintsOfEmpName));
		
		boolean isFound = false;
		for (WebElement name : nameList) {
			if (name.getText().contains("John")) {
				isFound = true;
				break;
			}
		}
		Assert.assertTrue(isFound);

		
		
	}


	/**
	 * This method will execute with Page object model.
	 * @throws InterruptedException
	 */
	@Test
	public void verifyIfNameOfAlreadyCreatedUserPopulatesInListUsingKeywordsUsingPOM() throws InterruptedException {

		Keyword keyword = new Keyword();
		
//		LoginPage loginPage = PageFactory.initElements(Keyword.driver, LoginPage.class);
		LoginPage loginPage = new LoginPage();
		
		keyword.waitForElementToBeVisible(By.cssSelector("input[name='username']"));
//		loginPage.waitForUserNameToBeVisibale();
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLoginButton();
		
		
		DashboardPage dashboard = new DashboardPage();
		dashboard.waitForPIMMenuToBeVisible();
		dashboard.clickOnPIMMenu();
		
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		keyword.clickOn("xpath", Locator.addBtn);
		keyword.waitForElementToBeVisible(By.xpath("//input[@name=\"firstName\"]"));
		
//		keyword.enterText(Locator.firstName, "John");
//		keyword.enterText(PropertiesUtil.getLocator("firstName"), "John");
//		Following happend because i made static import of PropertiesUtil class
		keyword.enterText(getLocator("firstName"), "John");
		
//		keyword.enterText(Locator.middleName, "");
//		keyword.enterText(PropertiesUtil.getLocator("middleName"), "");
//		Following happend because i made static import of PropertiesUtil class
		keyword.enterText(getLocator("middleName"), "");
		
//		keyword.enterText(Locator.lastName, "Patil");
//		keyword.enterText(PropertiesUtil.getLocator("lastName"), "Ratndeep");
//		Following happend because i made static import of PropertiesUtil class
		keyword.enterText(getLocator("lastName"), "Ratndeep");
		
		keyword.clickOn("xpath", Locator.saveBtn);
		Thread.sleep(5000);
		keyword.waitForElementToBeVisible(By.xpath("//a[contains(@href,\"AdminModule\")]"));
		keyword.clickOn("xpath", Locator.adminModule);
		keyword.waitForElementToBeVisible(By.xpath("//button[text() = \" Add \"]"));
		keyword.clickOn("xpath", Locator.addBtnInadminModule);
		keyword.waitForElementToBeVisible(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		keyword.clickOn("xpath", Locator.UserRole);
		Thread.sleep(3000);
		keyword.clickOn("xpath", Locator.selectESS);
		keyword.enterText(Locator.hintsOfEmpName, "John");
		Thread.sleep(5000);
		
		List<WebElement> nameList = Keyword.driver.findElements(By.xpath(Locator.searchInHintsOfEmpName));
		
		boolean isFound = false;
		for (WebElement name : nameList) {
			if (name.getText().contains("John")) {
				isFound = true;
				break;
			}
		}
		Assert.assertTrue(isFound);

		
		
	}


}
