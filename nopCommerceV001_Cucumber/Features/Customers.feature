Feature: Customer

Background: SUT setup 
	Given user launch chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login"
	And User enters email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then User can view Dashboard

@Adding	
Scenario: Add a new customer
	When User click on customer menu
	And User click on customer menu item
	And User click on Add new button
	Then User can view Add new Cutomer page
	When User enters customer info
	And Click on Save button
	Then User should view confirmation message "The new customer has been added successfully"
	And Close the browser
	
@Searching	
Scenario: Search customer Using email id
	When User click on customer menu
	And User click on customer menu item
	And Enter customer email
	When click on search button
	Then User should found email in the search table
	And Close the browser

@Searching	
	Scenario: Search customer Using  Name
	When User click on customer menu
	And User click on customer menu item
	And User clicks on First Name
	And User clicks on Last Name
	When click on search button
	Then User should found Name in the search table
	And Close the browser