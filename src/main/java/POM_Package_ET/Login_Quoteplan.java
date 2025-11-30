package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Quoteplan {
	

	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	
	public Login_Quoteplan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void EnterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickOnLogin()
	{
		login.click();
	}

}
