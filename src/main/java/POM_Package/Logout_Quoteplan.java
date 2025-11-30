package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Quoteplan {
	
	@FindBy(xpath="//i[@class='fa fa-user-circle-o']")
	public WebElement adminprofile;
	public void clickonadminprofile()
	{
		adminprofile.click();
	}
	@FindBy(xpath="//a[@class='logoutBtn']")
	public WebElement logoutbtn;
	public void clickonlogoutbtn()
	{
		logoutbtn.click();
	}
	
	public Logout_Quoteplan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
