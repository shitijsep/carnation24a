package com.CarnationTestingShastra24.stepdefinations;

import com.CarnationTestingShastra24KDD.Keyword;
import com.CarnationTestingShastra24KDD.Util.App;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	Keyword keyword = new Keyword();
	@Before
	public void setup() {
		
		keyword.launchBrowser("Chrome");
		keyword.launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		keyword.launchUrl(App.getAppUrl("qa"));
		Keyword.driver.manage().window().maximize();
	}

	@After
	public void tearDown() {

		keyword.closeBrowser();
		
	}
}
