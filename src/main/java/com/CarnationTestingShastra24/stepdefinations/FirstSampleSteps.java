package com.CarnationTestingShastra24.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FirstSampleSteps {

	int appleCount;
	@Given("I have two apples")
	public void i_have_two_apples() {
		appleCount = 2;
	}

	@Then("print their quantity")
	public void print_their_quantity() {
		System.out.println("Hi welcome to cucumber Garden");
		System.out.println("You Got "+appleCount+" apples");
	
	}
	
	
	
}
