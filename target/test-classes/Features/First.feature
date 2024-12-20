Feature: User Managment

  Scenario: verify If Name Of Already Created User Populates In the List On User Manafment Page
    #Given Application url is launched 
    And User is logged into the system
		When User click on PIM menu
		And Click on add button
		And Create and save an user with valid details 
		When User click on Admin menu 
		And Click on add button on user managment page
		When user select role as ESS
		And Enter emplooye name
		Then Populated list must contain newly created user name
#		Then Browser is getting close.