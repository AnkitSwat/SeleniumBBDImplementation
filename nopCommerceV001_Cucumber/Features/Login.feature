#Author: your.email@your.domain.com

Feature: Login

Scenario: Successful login with valid credentials
	Given user launch chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login"
	And User enters email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page title should be "Your store. Login"
	And Close the browser

