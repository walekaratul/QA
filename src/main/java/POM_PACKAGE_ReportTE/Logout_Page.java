package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	@FindBy(xpath="//i[@class='fa fa-user-circle-o']")
	private WebElement adminprofile;
	
	@FindBy(xpath="//a[@class='logoutBtn']")
	private WebElement logoutbtn;
	public void clickadminprofile()
	{
		adminprofile.click();
	}
	public void clicklogoubtn()
	{
		logoutbtn.click();
	}
	public Logout_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
