Feature: EcomHome features
		
		Background: This is the background
		Given I launch a edge browser
    When I open the ecommerce login website
		
		
		@Tag1
  	Scenario: Verifying invalid login    
    When I enter invalid username and password
    Then I sould not be successfully logged in
    And Close browser
    
    @Tag1
    Scenario: Verifying title of login page    
    When I check the title
    Then Title shoudl be as expected
    And Close browser
    
    @Tag3
    Scenario: Verifying invalid login    
    When I enter invalid username "invaliduser" and password "password"
    Then I sould not be successfully logged in
    And Close browser
    
    @Tag4
    Scenario Outline: Verifying invalid login    
    When I enter invalid username "<username>" and password "<password>"
    Then I sould not be successfully logged in
    And Close browser
    
    Examples:
    |username|password|
    |user1|pass1|
    |user2|pass2|
    |user3|pass3|
    