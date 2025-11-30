package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Quoteplan {
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	public void EnterUsername(String user)
	{
		username.sendKeys(user);
	}
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	public void EnterPassword(String pass )
	{
		password.sendKeys(pass);
	}
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	public void ClickOnLogin()
	{
		login.click();
	}
	
	public Login_Quoteplan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
