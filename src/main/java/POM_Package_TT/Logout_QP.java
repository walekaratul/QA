package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_QP {
	
	@FindBy(xpath="//i[@class='fa fa-user-circle-o']")
	public WebElement adminprofile;
	
	@FindBy(xpath="//a[@class='logoutBtn']")
	public WebElement logoutbtn;
	
	public Logout_QP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickadminprofile()
	{
		adminprofile.click();
	}
	public void clicklogoubtn()
	{
		logoutbtn.click();
	}

}
