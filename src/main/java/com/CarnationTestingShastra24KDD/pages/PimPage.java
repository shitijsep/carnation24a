package com.CarnationTestingShastra24KDD.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CarnationTestingShastra24KDD.Keyword;

public class PimPage {
	Keyword keyword = new Keyword();
	
	@FindBy(css = "input[name=\"firstName\"]")
	WebElement firstName;
	
	@FindBy(css = "input[name=\"middleName\"]")
	WebElement middleName;
	
	@FindBy(css = "input[name=\"lastName\"]")
	WebElement lastName;
	
	@FindBy(css = "div.oxd-form-actions button[type=\"submit\"]")
	WebElement saveBtn;
	
	public PimPage(){
		PageFactory.initElements(Keyword.driver, this);
	}
	
	
	public void clickOnSaveBtn() {
		
		saveBtn.click();
		keyword.waitforFiveSec();
		keyword.waitforFiveSec();
		
	}
	
	public void enterTxtinfirstName() {
		keyword.waitforFiveSec();
		keyword.waitForElementToBeVisible(firstName);
		firstName.click();
		firstName.sendKeys("Pankaj");
	}
	
	public void enterTxtinmiddleName() {
		middleName.click();
		middleName.sendKeys("");
	}
	
	public void enterTxtinlastName() {
		lastName.click();
		lastName.sendKeys("Patil");
	}
}
