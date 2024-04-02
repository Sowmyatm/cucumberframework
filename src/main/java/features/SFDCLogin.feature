Feature: Login feature for the sfdc app

  Background: 
    Given User launches login.salesforce.com
    
	@login @smoke
  Scenario Outline: Login with correct credentials
    When User enters username "<username>" and password "<password>"
    Then User should be login and see homepage

    Examples: 
      | username                 | password     |
      | nov22.sowmyatm@gmail.com | Sowmyatm@123 |
      | anamnjd@abc.com          | xyz          |
	
	@regression @login
  Scenario: Login with incorrect credentials
    When User enters incorrect username and password
    Then User should not login and should see error message
    	| username | value |
    	| abcd     | 234rr |
    	| bcdg     | 536H  |