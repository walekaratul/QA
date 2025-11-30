package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_QP {
	
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	
	public Login_QP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername(String User)
	{
		username.sendKeys(User);
	}
	
	public void EnterPassword(String Pass)
	{
		password.sendKeys(Pass);
	}
	public void ClickOnLogin()
	{
		login.click();
	}

}
