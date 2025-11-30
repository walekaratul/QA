package Test_Package_TT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Package_TT.Create_TimesheetTT;
import POM_Package_TT.Login_QP;
import POM_Package_TT.Logout_QP;
import POM_Package_TT.View_Modify_For_All;
import POM_Package_TT.View_Modify_For_Supervisor_And_Manager;
import Utility_Package_TT.Utility_ClassTT;

public class Testclass_For_ALL {
	           WebDriver driver;
	           Create_TimesheetTT CT;
	           View_Modify_For_Supervisor_And_Manager PF;
	           View_Modify_For_All All;
	
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origin=*");
		    driver = new ChromeDriver(options);
//	        driver = new ChromeDriver();
			driver.get("http://localhost/QuotePlan/quotep7_apqengineering/home/login");
			driver.manage().window().maximize();
		    Thread.sleep(2000);
	}
	@BeforeMethod
	public void LoginFunction() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Login_QP log = new Login_QP(driver);
		log.EnterUsername(Utility_Package_TT.Utility_ClassTT.GetExcelSheetData("Sheet", 15, 2));
		Thread.sleep(1000);
		log.EnterPassword(Utility_Package_TT.Utility_ClassTT.GetExcelSheetData("Sheet", 19, 2));
		Thread.sleep(1000);
		log.ClickOnLogin();
		Thread.sleep(1000);
		System.out.println("Log in succesfully");
		CT = new Create_TimesheetTT(driver);
		PF= new View_Modify_For_Supervisor_And_Manager(driver);
		All = new View_Modify_For_All(driver);
	}
	@Test(priority=1)
	public void SimpleSearch_Function() throws InterruptedException, IOException
	{
		String TCName = "SimpleSearch_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.EnterkOnSearchBoxVMALL();
	    All.ClickOnSearchBtnVMALL();
	    Thread.sleep(7000);
	    All.ClickOnHideShowAllRecordVMALL();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("SimpleSearch_Function run successfully");
	}
	@Test(priority=2)
	public void AdvancedSearch_ByDate_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByDate_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnAdvnancedSearchBtnVMALL();
	    All.SelectFilterOnVMALL();
	    All.SelectFilterOperatorOnVMALL();
	    All.ClickOnCalenderBoxVMALL();
	    All.SelectMonthVMALL();
	    All.SelectYearVMALL();
	    All.ClickOnFirstDayVMALL();
	    Thread.sleep(1000);
	    All.ClickOnLastDayVMALL();
	    Thread.sleep(1000);
	    All.ClickOnApplyBtnVMALL();
	    Thread.sleep(7000);
	    All.ClickOnHideShowAllRecordVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByDate_Function run successfully");
	}
	@Test(priority=3)
	public void AdvancedSrearch_ByUserName() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSrearch_ByUserName";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnAdvnancedSearchBtnVMALL();
	    All.SelectFilterUserOnVMALL();
	    All.SelectFilterOperatoruserOnVMALL();
	    All.EnterOnAdvancedEnterBoxuserVMALL();
	    All.ClickOnApplyBtnVMALL();
	    Thread.sleep(7000);
	    All.ClickOnHideShowAllRecordVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSrearch_ByUserName run successfully");
	}
	@Test(priority=4)
	public void AdvancedSearch_ByProjectN_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByProjectN_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnAdvnancedSearchBtnVMALL();
	    All.SelectFilterPNameOnVMALL();
	    All.SelectFilterOperatorPNameOnVMALL();
	    All.EnterOnAdvancedEnterBoxPNameVMALL();
	    All.ClickOnApplyBtnVMALL();
	    Thread.sleep(7000);
	    All.ClickOnHideShowAllRecordVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByProjectN_Function run successfully");
	}
	@Test(priority=5)
	public void AdvancedSearch_ByStatus_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByStatus_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnAdvnancedSearchBtnVMALL();
	    All.SelectFilterstatusOnVMALL();
	    All.SelectFilterOperatorstatusOnVMALL();
	    All.ClickOnStatusVMALL();
	    All.ClickOnApplyBtnVMALL();
	    Thread.sleep(7000);
	    All.ClickOnHideShowAllRecordVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByStatus_Function run successfully");
	}
	@Test(priority=6)
	public void UserNameLink_Function() throws InterruptedException, IOException
	{
		String TCName = "UserNameLink_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnUserNameLinkVMALL();
	    Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("UserNameLink_Function run successfully");
	}
	@Test(priority=7)
	public void NewButton_Function() throws InterruptedException, IOException
	{
		String TCName = "NewButton_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnNewBtnVMALL();
	    Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("NewButton_Function run successfully");
	}
	@Test(priority=8)
	public void LoadMoreButton_Function() throws InterruptedException, IOException
	{
		String TCName = "LoadMoreButton_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnLoadMoreVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("LoadMoreButton_Function run successfully");
	}
	@Test(priority=9)
	public void HideShowAllRecords_Function() throws InterruptedException, IOException
	{
		String TCName = "HideShowAllRecords_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnHideShowAllRecordVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("HideShowAllRecords_Function run successfully");
	}
	@Test(priority=10)
	public void PlusSymbol_Function() throws InterruptedException, IOException
	{
		String TCName = "PlusSymbol_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(7000);
	    All.ClickOnVMALLBtn();
	    Thread.sleep(7000);
	    All.ClickOnPlusSymbollVMALL();
	    Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("PlusSymbol_Function run successfully");
	}
	@AfterMethod
	public void LogoutFunction() throws InterruptedException
	{
		Thread.sleep(5000);
		Logout_QP logout = new Logout_QP(driver);
		logout.clickadminprofile();
		logout.clicklogoubtn();
		System.out.println("Log Out succesfully");
	}
	@AfterClass
	public void closebrowseraa()
	{
		driver.close();
	}

}
