package com.CarnationTestingShastra24KDD.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CarnationTestingShastra24KDD.Keyword;

public class UserManagmentPage {

	Keyword keyword = new Keyword();

	@FindBy(css = "div.orangehrm-header-container button")
	WebElement addBtnOnUserManagmentPage;

	@FindBy(css = "div.oxd-select-text.oxd-select-text--active div.oxd-select-text-input")
	WebElement userRole;

	@FindBy(css = "div.oxd-select-option:nth-child(3)")
	WebElement essoption;

	@FindBy(css = "div.oxd-autocomplete-wrapper div input")
	WebElement empName;

	@FindBy(css = "div.oxd-autocomplete-dropdown.--positon-bottom span")
	List<WebElement> nameForHint;

	public List<String> getEmpNames()
	{

		List<String> names = new ArrayList<String>();
		
		for (WebElement empName : nameForHint) {
			names.add(empName.getText());
		}
		
		return names;

	}

	public void enterValueInempName() {
		keyword.waitforFiveSec();
		empName.click();
		empName.sendKeys("Pankaj");
	}

	public void selectESSoption() {

		essoption.click();
	}

	public void clickOnuserRole() {
		keyword.waitforFiveSec();
		userRole.click();
	}

	public void clickOnAddBtnOnUserManagmentPage() {

		keyword.waitforFiveSec();
		addBtnOnUserManagmentPage.click();
	}

	public UserManagmentPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

}
