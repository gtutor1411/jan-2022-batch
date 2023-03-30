Feature: Login features

	Background: This is a background
	Given I launch a chrome browser
	When I open the ecommerce website	
	
	@DontRun
	Scenario: Verify login page title	 
	Then the title should be as expected
	And Close browser 
	
	@DontRun
	Scenario: Verifying Invalid Login	
	And I enter invalid username and password
	Then I should be not be successfully logged in	
	And Close browser
	
	@DontRun
	Scenario: Verifying Invalid Login
	And I enter invalid username "user" and password "password"	
	Then I should be not be successfully logged in	
	And Close browser
	
	@Run
	Scenario Outline: Verifying Invalid Login	
	And I enter invalid username "<username>" and password "<username>"
	Then I should be not be successfully logged in	
	And Close browser
	
	Examples: 
	|username|password|
	|user1|password1|
	|user2|password2|
	|user3|password3|	
	
	Scenario: Verify login page title	 
	Then the title should be as expected
	And Close browser 
	