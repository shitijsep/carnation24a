package com.CarnationTestingShastra24.stepdefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizationSteps {

	int a, b, result = 0;
	String pincodes = "";
	String area = "";

	@Given("I have two number which are {int} and {int}")
	public void acceptNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@When("I add this numbers")
	public void addition() {

		result = a + b;
	}

	@Then("To check result is prime or not")
	public void checkAddtionIsPrime() {

		int count = 0;
		for (int i = 1; i <= result / 2; i++) {
			if (result % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Number Is not Prime");
		} else {
			System.out.println("Number Is Prime");
		}

	}

	String name;

	@Given("I have first name {string}")
	public void acceptName(String name) {

		this.name = name;
	}

	@Then("Print the first Name")
	public void printFName() {
		System.err.println("First name is :" + name);
	}

	@Given("I have only following fruites:")
	public void acceptListOfFruits(List<String> fruites) {
		for (String fruit : fruites) {
			System.err.println(fruit);
		}

	}

	@Given("I have following fruites with Quntity:")
	public void acceptListOfFruits(Map<String, Integer> fruites) {
		for (Entry<String, Integer> iterable_fruit : fruites.entrySet()) {
			System.err.println("I have " + iterable_fruit.getValue() + " , " + iterable_fruit.getKey());
		}

	}

	@Given("I have following fruites with Quntities:")
	public void acceptListOfFruites(DataTable fruites) {
		Map<String, List> data = fruites.asMap(String.class, List.class);

		ArrayList<String> count = (ArrayList<String>) data.get("Apple");
		for (String valuesOfElemntsOfList : count) {
			System.err.print(valuesOfElemntsOfList + " , ");
		}

	}

	@Given("I have following fruites and i am printing that:")
	public void acceptListOfFruits(DataTable fruites) {
		Map<String, List> data = fruites.asMap(String.class, List.class);

		Set<Entry<String, List>> entries = data.entrySet();
		for (Entry<String, List> entry : entries) {

			ArrayList<String> count = (ArrayList<String>) data.get(entry.getKey());
			for (String valuesOfElemntsOfList : count) {
				System.err.print(valuesOfElemntsOfList + " , ");
			}
		}

	}

	@Given("I have {string}")
	public void acceptPincodes(String pincodes) {

		this.pincodes = pincodes;
		
	}

	@Then("Print the pincodes with {string}")
	public void printPincode(String area) {
		System.out.println(this.pincodes);
		this.area = area;
		System.out.println(this.area);
	}

}
