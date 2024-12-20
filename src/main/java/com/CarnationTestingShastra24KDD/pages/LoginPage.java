package com.CarnationTestingShastra24KDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CarnationTestingShastra24KDD.Keyword;

public class LoginPage {

	@FindBy(css = "input[name='username']")
	WebElement usernameTxtBx;

	@FindBy(css = "input[name='password']")
	WebElement passwordTxtBx;

	@FindBy(css = "button[type='submit']")
	WebElement loginBtn;
	
	By loginbTTN = By.cssSelector("button[type='submit']");
	
	public void clickOnLoginBttn() {

	Keyword.driver.findElement(loginbTTN).click();	
	}
	
	public LoginPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void enterUsername(String username) {

		usernameTxtBx.sendKeys(username);
	}

	public void enterPassword(String password) {

		passwordTxtBx.sendKeys(password);
	}

	public void clickOnLoginButton() {

		loginBtn.click();
	}
	
	public void waitForUserNameToBeVisibale() {

		Keyword keyword = new Keyword();
		keyword.waitForElementToBeVisible(usernameTxtBx);
	}

	/*
	public static void main(String[] args) throws InterruptedException {
		Keyword keyword = new Keyword();
		keyword.launchBrowser("chrome");
		keyword.launchUrl(App.getAppUrl("qa"));
		Thread.sleep(3000);
		LoginPage login = PageFactory.initElements(Keyword.driver, LoginPage.class);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
	}
	*/
	
}
