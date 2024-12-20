package com.CarnationTestingShastra24.stepdefinations;

import java.util.List;

import org.testng.Assert;

import com.CarnationTestingShastra24KDD.Keyword;
import com.CarnationTestingShastra24KDD.pages.DashboardPage;
import com.CarnationTestingShastra24KDD.pages.LoginPage;
import com.CarnationTestingShastra24KDD.pages.PimPage;
import com.CarnationTestingShastra24KDD.pages.UserManagmentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserManagmentSteps{

//	@Given("Application url is launched")
//	public void application_url_is_launched() {
//		Keyword keyword = new Keyword();
//		keyword.launchBrowser("Chrome");
//		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		keyword.launchUrl(App.getAppUrl("qa"));
//		Keyword.driver.manage().window().maximize();
//	}

	@Given("User is logged into the system")
	public void user_is_logged_into_the_system() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		Thread.sleep(3000);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLoginButton();

	}

	@When("User click on PIM menu")
	public void user_click_on_pim_menu() {
		DashboardPage dashboard = new DashboardPage();
		dashboard.waitForPIMMenuToBeVisible();
		dashboard.clickOnPIMMenu();
	}

	@When("Click on add button")
	public void click_on_add_button() {
		DashboardPage dashboard = new DashboardPage();
		dashboard.waitForPIMMenuToBeVisible();
		dashboard.clickOnAddbtnInPIMMenu();
	}

	@When("Create and save an user with valid details")
	public void create_and_save_an_user_with_valid_details() {
		PimPage pimPage = new PimPage();
		pimPage.enterTxtinfirstName();
		pimPage.enterTxtinmiddleName();
		pimPage.enterTxtinlastName();
		pimPage.clickOnSaveBtn();
	}

	@When("User click on Admin menu")
	public void user_click_on_admin_menu() {
		DashboardPage dashboard = new DashboardPage();
		dashboard.waitForPIMMenuToBeVisible();
		dashboard.clickOnAdminMenu();
	}

	@When("Click on add button on user managment page")
	public void click_on_add_button_on_user_managment_page() {
		UserManagmentPage userManagmentPage = new UserManagmentPage();
		userManagmentPage.clickOnAddBtnOnUserManagmentPage();
	}

	@When("user select role as ESS")
	public void user_select_role_as_ess() {
		UserManagmentPage userManagmentPage = new UserManagmentPage();
		userManagmentPage.clickOnuserRole();
		userManagmentPage.selectESSoption();
	}

	@When("Enter emplooye name")
	public void enter_emplooye_name() {
		UserManagmentPage userManagmentPage = new UserManagmentPage();
		userManagmentPage.enterValueInempName();
	}

	@Then("Populated list must contain newly created user name")
	public void populated_list_must_contain_newly_created_user_name() {
		UserManagmentPage userManagmentPage = new UserManagmentPage();
		List<String> names= userManagmentPage.getEmpNames();
		
		for (String string : names) {
			System.out.println(string);
			Assert.assertTrue(names.contains("Raj"));
		}
		
		
	}
	
	
	@Then("Browser is getting close.")
	public void browser_is_getting_close() {
		Keyword keyword = new Keyword();
		keyword.tearDownBrower();
	}
}
