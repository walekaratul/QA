package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	public void enterusername()
	{
		username.sendKeys("quoteplan_admin");//"nitin_supervisor"
	}
	
	public void enterpassword()
	{
		password.sendKeys("sagar123");//"123456"
	}
	public void clicklogin()
	{
		login.click();
	}
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
