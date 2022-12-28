package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage {

	public WebDriver ldriver;
	WaitHelper waitHelper;
	public SearchCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		waitHelper= new WaitHelper(ldriver);		
	}
	
	@FindBy(xpath="//input[@id='SearchEmail']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='SearchFirstName']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='SearchLastName']")
	WebElement txtLastName;
	
	@FindBy(xpath="//button[@id='search-customers']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]//tbody//tr")
	List<WebElement> tRow;
	
	@FindBy(xpath="//*[@id=\"customers-grid\"]//tbody//tr//td")
	List<WebElement> tColumn;
	
	//Action Method
	
	public void setEmail(String email) {
		waitHelper.WaitForElement(txtEmail, 15);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setFirstName(String firstName) {
		waitHelper.WaitForElement(txtFirstName, 15);
		txtFirstName.clear();
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		waitHelper.WaitForElement(txtLastName, 15);
		txtLastName.clear();
		txtLastName.sendKeys(lastName);
	}

	public void clickSearchButton() {
		waitHelper.WaitForElement(btnSubmit, 15);
		btnSubmit.click();
		}
	
	public int getNoOfRows() {
		return tRow.size();
	}
	
	public int getNoOfColumns() {
		return tColumn.size();
	}
	
	public boolean searchCustomerByEmail(String email) {
		boolean flag=false;
		
		for(int i=0;i<=getNoOfRows();i++){
			String emailId=table.findElement(By.xpath("//td[normalize-space()='"+email+"']")).getText();
			System.out.println(emailId);
			
			if(emailId.equals(email))
				flag=true;
		}
		return flag;	
		}
	
	public boolean searchCustomerByName(String firstName,String lastName) {
	String Name=firstName+" "+lastName;
	boolean flag=false;

	for(int i=0;i<=getNoOfRows();i++){
			String emailId=table.findElement(By.xpath("//td[normalize-space()='"+Name+"']")).getText();
			System.out.println(Name);
			
			if(emailId.equals(Name))
				flag=true;
		}
	return flag;
	}

}
