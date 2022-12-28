package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By drpMenuCustomer= By.xpath("//a[@href='#']//p[contains(text(),'Customers')]"); //
	By drpItemCustomer= By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	By btnAddNew=By.xpath("//a[@class='btn btn-primary']");
	By txtEmail= By.xpath("//*[@id='Email']");
	By txtPassword=By.xpath("//*[@id='Password']");
	By txtFirstName=By.xpath("//input[@id='FirstName']"); //
	By txtLastName=By.xpath("//input[@id='LastName']");
	By txtRadioMale=By.xpath("//*[@id='Gender_Male']");
	By txtRadioFemale=By.xpath("//*[@id='Gender_Female']");
	By txtDOB= By.xpath("//input[@id='DateOfBirth']");
	By txtCompanyName=By.xpath("//input[@id='Company']");
	By txtTaxExempt= By.xpath("//input[@id='IsTaxExempt']");
	
	// Newsletter DropDown
	By drpNewsletter =By.xpath("//div[@class='input-group-append']//div[@role='listbox']");
	By	drpNewsletterYSN=By.xpath("//li[@id='1366bd20-889e-42a8-9cd2-263de1ee382b']");
	
	// Customer Role DropDown
	By drpCustomerRole=By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover k-state-focused k-state-border-down']//div[@role='listbox']");
	By drpCustomerRoleAdmin = By.xpath("//li[normalize-space()='Administrators']");
	
	By txtAdminComment=By.xpath("//textarea[@id='AdminComment']");
	By btnSave=By.xpath("//button[@name='save']");
	By btnSaveContinue=By.xpath("//button[@name='save-continue']");
	
	//Action Methods
	
	public String getTitle() {
		return ldriver.getTitle();
	}
	
	public void clickOnCustomerMenu() {
		ldriver.findElement(drpMenuCustomer).click();
	}
	
	public void clickOnCustomerItem() {
		ldriver.findElement(drpItemCustomer).click();
	}
	
	public void clickOnAddNew() {
		ldriver.findElement(btnAddNew).click();
	}

	public void setEmail(String Email) {
		ldriver.findElement(txtEmail).sendKeys(Email);
	}

	public void setPassword(String Password) {
		ldriver.findElement(txtPassword).sendKeys(Password);
	}

	public void setFirstName(String firstName) {
		ldriver.findElement(txtFirstName).sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		ldriver.findElement(txtLastName).sendKeys(lastName);
	}

	public void setGender(String gender) {
		if(gender=="Male") {
			ldriver.findElement(txtRadioMale).click();
		}
		else
			ldriver.findElement(txtRadioFemale).click();
	}
	
	public void setDOB(String dob) {
		ldriver.findElement(txtDOB).sendKeys(dob);
	}
	
	public void setCompanyName(String companyName) {
		ldriver.findElement(txtCompanyName).sendKeys(companyName);
	}
	
	public void setNewsletter(String value) {
		ldriver.findElement(drpNewsletter).click();
		Select drp= new Select(ldriver.findElement(drpNewsletter));
		//	drp.selectByVisibleText(value);
		ldriver.findElement(drpNewsletterYSN).click();
	}
	
	public void setCustomerRole(String value) {
		
		Select drpC= new Select(ldriver.findElement(drpCustomerRole));
		drpC.selectByVisibleText(value);
	}
	
	
	public void setAdminComment(String comment) {
		ldriver.findElement(txtAdminComment).sendKeys(comment);
	}
	
	public void setManagerVendor(String vendor) {
		Select drpV= new Select(ldriver.findElement(By.xpath("//select[@id='VendorId']")));
		drpV.selectByVisibleText(vendor);
	}
	
	public void clickSaveBtn() {
		ldriver.findElement(btnSave).click();
	}
	
}
