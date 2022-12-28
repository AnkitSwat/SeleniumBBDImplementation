package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	@CacheLookup
	WebElement logoutButton;
	
	public void setUserName(String Uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(Uname);
	}
	
	public void setPassword(String Upass)
	{
		txtPassword.clear();
		txtPassword.sendKeys(Upass);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}

	public void clickLogout()
	{
		logoutButton.click();
	}
}
