package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass {

@Before
public void setup() throws IOException {
	
	//Logger Info
	logger=Logger.getLogger("nopCommerce"); //Added logger
	PropertyConfigurator.configure("log4j.properties"); //Added logger
	
	//Reading config.properties file
	configProp=new Properties();
	FileInputStream configPropfile=new FileInputStream("config.properties");
	configProp.load(configPropfile);
	     
	String br=configProp.getProperty("browser");
	
	if (br.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		logger.info("********************Launching chrome broser**********************");		
	}
	else if(br.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();
		logger.info("*******************Launching Firefox broser**********************");
	}
	else if(br.equals("Internet Explorer")) {
		WebDriverManager.edgedriver().setup();
		driver=new ChromeDriver();
		logger.info("********************Launching IE  broser**********************");
	}

}

@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	lp=new LoginPage(driver);
}

@When("User opens URL {string}")
public void user_opens_URL(String url) {
	
    driver.get(url);
    logger.info("********************Launching URL**********************");
    driver.manage().window().maximize(); 
}

@When("User enters email as {string} and Password as {string}")
public void user_enters_email_as_and_Password_as(String email, String pass) {
	lp.setUserName(email);
	lp.setPassword(pass);
	logger.info("********************Logging in**********************");
}

@When("Click on Login")
public void click_on_Login() {
lp.clickLogin();
logger.info("********************Clicked on login button**********************");
}

@Then("Page title should be {string}")
public void page_title_should_be(String title) {
	
	if(driver.getPageSource().contains("Login was unsuccessful"))
	{
		driver.close();
		Assert.assertTrue(false);
		logger.info("********************Logging was unsuccessfull**********************");
	}
	else
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(title,actualTitle);
		logger.info("********************TItle Matched**********************");
	}
		
}

@When("User click on Log out link")
public void user_click_on_Log_out_link() {
	lp.clickLogout();
	logger.info("********************Clicked on  logout button*********************");
}

@Then("Close the browser")
public void close_the_browser() {
	driver.close();
	logger.info("********************Browser closed**********************");
}


//--------------------------------------------------------Customer Feature Step Definition-------------------------------------------------------------------

@Then("User can view Dashboard")
public void user_can_view_Dashboard() throws InterruptedException {
    addCust=new AddCustomerPage(driver);
    Thread.sleep(3000);
    Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getTitle());
    logger.info("********************Dashboard is visible**********************");
}

@When("User click on customer menu")
public void user_click_on_customer_menu() throws InterruptedException {
	Thread.sleep(3000);
	addCust.clickOnCustomerMenu();
	logger.info("********************Clicked on Customer menu dropdown**********************");
}

@When("User click on customer menu item")
public void user_click_on_customer_menu_item() throws InterruptedException {
	Thread.sleep(3000);
	addCust.clickOnCustomerItem();
	logger.info("********************Clicked on customer Item in the dropdown**********************");
}

@When("User click on Add new button")
public void user_click_on_Add_new_button() throws InterruptedException {
	Thread.sleep(3000);
	addCust.clickOnAddNew();
	logger.info("********************Clicked on Add new button**********************");
}

@Then("User can view Add new Cutomer page")
public void user_can_view_Add_new_Cutomer_page() throws InterruptedException {
	Thread.sleep(3000);
	Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getTitle());
	logger.info("********************Verifying the new customer page title**********************");
}

@When("User enters customer info")
public void user_enters_customer_info() {
	String email=randomString()+"@gmail.com";
	addCust.setEmail(email);
	addCust.setPassword("test@123");
	addCust.setFirstName("Test");
	addCust.setLastName("Test");
	addCust.setGender("Male");
	addCust.setDOB("01/01/1998");
	addCust.setCompanyName("QA Solutions");
	//addCust.setNewsletter("Your store name");
	//addCust.setCustomerRole("Guest");
	addCust.setManagerVendor("Vendor 1");
	addCust.setAdminComment("For Testing purpose Only--");
	logger.info("********************Entering customer information**********************");
}

@When("Click on Save button")
public void click_on_Save_button() throws InterruptedException {
	Thread.sleep(3000);
	addCust.clickSaveBtn();
	logger.info("********************Clicked on save button**********************");
}

@Then("User should view confirmation message {string}")
public void user_should_view_confirmation_message(String msg) {
	Assert.assertTrue(driver.findElement(By.tagName("Body")).getText().contains(msg));
	logger.info("********************Verifying confirmation message**********************");
}


//Steps for searching a customer

@When("Enter customer email")
public void enter_customer_email() {
 searchCust=new SearchCustomerPage(driver);
 searchCust.setEmail("victoria_victoria@nopCommerce.com");
 logger.info("********************Entering email id**********************");
}

@When("click on search button")
public void click_on_search_button() throws InterruptedException {
    searchCust.clickSearchButton();
    Thread.sleep(3000);
    logger.info("********************Clicked on search button**********************");
}

@Then("User should found email in the search table")
public void user_should_found_email_in_the_search_table() {
	boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
	Assert.assertTrue(status);
	logger.info("********************Checking Email in the search table**********************");
}

@When("User clicks on First Name")
public void user_clicks_on_First_Name() {
	searchCust=new SearchCustomerPage(driver);
	searchCust.setFirstName("Victoria");
	logger.info("********************Setting first name**********************");
}

@When("User clicks on Last Name")
public void user_clicks_on_Last_Name() {
  searchCust.setLastName("Terces");
  logger.info("********************Setting last name**********************");
}
	
@Then("User should found Name in the search table")
public void user_should_found_Name_in_the_search_table() {
  boolean check=searchCust.searchCustomerByName("Victoria","Terces");
  Assert.assertTrue(check);
  logger.info("********************Checking name in the serach table*********************");
}
	
}
