Feature: Login for LeafTaps 
Background: 
	Given Open the Chrome Browser 
	And maximize the Browser 
	And Set the timeouts 
	And Hit the URL 
	
@Positive 
Scenario Outline: Positive Login flow 
	And Enter the User Name as <username> 
	And Enter the Password as <password> 
	When click on the Login Button 
	Then veify the Login is Success 
	
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
		@Negative 
		Scenario Outline: Positive Login flow 
			And Enter the User Name as <username> 
			And Enter the Password as <password> 
			When click on the Login Button 
			But verify the Login is failed 
			
			Examples: 
			
				|username|password|
				|DemoSalesManager|crmsfa1|
				|DemoCSR|crmsfa2|
