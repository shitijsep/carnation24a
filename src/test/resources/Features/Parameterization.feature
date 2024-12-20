Feature: This is feature where we are practicing parameterization.

Scenario: Parameterizing the single step
	Given I have two number which are 15 and 46
	When I add this numbers
	Then To check result is prime or not
	
@Regration
Scenario: Accept word as parameter
 Given I have first name 'Avinash'
 Then Print the first Name 	

Scenario: Accept list of fruits
	Given I have only following fruites:
	|Apple|
	|Mango|
	|Strawberry|
	|Banana|
	|Papaya|
	
	
	Scenario: Accept list of fruits
	Given I have following fruites with Quntity:
	|Applees|2|
	|Mango|0|
	|Strawberrys|4|
	|Bananaes|12|
	|Papayaes|1|
	
	
	Scenario: Accept list of fruits
	Given I have following fruites with Quntities:
	|Apple|2|3|
	|Mango|0|1|
	|Strawberry|4|5|
	|Banana|12|13|
	|Papaya|9|10|
	

	
	
	Scenario: Accept list of fruits
	Given I have following fruites and i am printing that:
	|Apple|2|3|
	|Mango|0|1|
	|Strawberry|4|5|
	|Banana|12|13|
	|Papaya|9|10|
	
	
	
	Scenario Outline: This is my first data driven test case
	Given I have <pincodes> 
	Then Print the pincodes with <area>
	Examples:
	|pincodes|area|
	|'400024'|'A'|
	|'400025'|'B'|
	|'400026'|'C'|
	|'400027'|'D'|
	|'400028'|'E'|
	
	
	
	
	
	
	
	
	
	