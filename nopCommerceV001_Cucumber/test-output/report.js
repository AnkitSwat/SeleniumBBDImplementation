$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "SUT setup",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer Using email id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Searching"
    }
  ]
});
formatter.step({
  "name": "User click on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customer menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer email",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found email in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_email_in_the_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "SUT setup",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer Using  Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Searching"
    }
  ]
});
formatter.step({
  "name": "User click on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customer menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on First Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_First_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Last_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Name in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Name_in_the_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});