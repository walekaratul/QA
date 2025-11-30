package Test_Package_TT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import POM_Package_TT.View_Modify_For_User;
//import Utility_Package.Utility_ClassTT;

public class Testclass_For_Self {
	WebDriver driver;
	Create_TimesheetTT CT;
	View_Modify_For_User VMFU;
	
	@BeforeClass
	public void BrowserOpenFunction() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost/QuotePlan/quotep7_apqengineering/home/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void LoginFunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_QP log = new Login_QP(driver);
		log.EnterUsername(Utility_Package_TT.Utility_ClassTT.GetExcelSheetData("Sheet", 15, 2));
		Thread.sleep(1000);
		log.EnterPassword(Utility_Package_TT.Utility_ClassTT.GetExcelSheetData("Sheet", 19, 2));
		Thread.sleep(1000);
		log.ClickOnLogin();
		Thread.sleep(1000);
		
		 CT = new Create_TimesheetTT(driver);
		 VMFU = new View_Modify_For_User(driver);
	  //  PF = new View_Modify_For_Supervisor_And_Manager(driver);
	  //  PMF =new View_Modify_For_Pending_PM(driver);
	  //  All = new View_Modify_For_All(driver);
	}
	@Test(priority = 1)
	public void SimpleSearch() throws InterruptedException, IOException
	{
		
		String TCName = "Simple Search Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		VMFU.EnterOnSerachBoxVMFU();
		Thread.sleep(3000);
		VMFU.ClickOnSearchBtnVMFU();
		VMFU.ClickOnHideShowAllRecordVMFU();
		Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Simple Search Function for Self run successfully");	
	}
	@Test(enabled = false)
	public void AdvancedSearch_ByDate() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByDate Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnAdvnancedSearchBtnVMFU();
		Thread.sleep(1000);
		VMFU.SelectFilterOnVMFU();
		Thread.sleep(1000);
		VMFU.SelectFilterOperatorOnVMFU();
		Thread.sleep(1000);
	    VMFU.ClickOnCalenderBoxVMFU();              
	    Thread.sleep(1000);
	    VMFU.ClickOnFirstDayVMFU();
        Thread.sleep(1000);
	    VMFU.ClickOnLastDayVMFU();
	    VMFU.ClickOnApplyBtnVMFU();
	    VMFU.ClickOnHideShowAllRecordVMFU();
	    Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByDate Function for self run successfully");
	}
	@Test(priority=3)
    public void AdvancedSearch_ByProjectName() throws InterruptedException, IOException
    {
    	String TCName = "AdvancedSearch_ByProjectName Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnAdvnancedSearchBtnVMFU();
		Thread.sleep(1000);
		VMFU.SelectFilterProjectNOnVMFU();
		VMFU.SelectFilterOperatorProjectNOnVMFU();
		VMFU.EnterOnAdvancedEnterBoxProjectNVMFU();
		Thread.sleep(1000);
		VMFU.ClickOnApplyBtnVMFU();
		VMFU.ClickOnHideShowAllRecordVMFU();
		Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByProjectName Function for self run successfully");
    }
	@Test(priority=4)
	public void AdvancedSearch_ByStatus() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByStatus Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnAdvnancedSearchBtnVMFU();
		Thread.sleep(1000);
		VMFU.SelectFilterStatusOnVMFU();
		VMFU.SelectFilterOperatorStatusOnVMFU();
		VMFU.ClickOnSTATUSVMFU();
		Thread.sleep(1000);
		VMFU.ClickOnApplyBtnVMFU();
		VMFU.ClickOnHideShowAllRecordVMFU();
		Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByStatus Function for self run successfully");
	}
	@Test(priority=5)
	public void PlusSymbol_Function() throws InterruptedException, IOException
	{
		String TCName = "PlusSymbol_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnPlusSymbollVMFU();
		Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("PlusSymbol_Function for self run successfully");
		
	}
	@Test(priority=6)
	public void NewButton_Function() throws InterruptedException, IOException
	{
		String TCName = "NewButton_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnNewBtnVMFU();
		Thread.sleep(5000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("NewButton_Function for self run successfully");	
	}
	@Test(priority=7)
	public void WeekTimesheetLink_Function() throws InterruptedException, IOException
	{
		String TCName = "WeekTimesheetLink_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(5000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("WeekTimesheetLink_Function for self run successfully");	
	}
	@Test(priority=8)
	public void ShowHideAllRecords_Function() throws InterruptedException, IOException
	{
		String TCName = "ShowHideAllRecords_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnHideShowAllRecordVMFU();
		Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ShowHideAllRecords_Function for self run successfully");	
	}
	@Test(priority=9)
	public void LoadMore_Function() throws InterruptedException, IOException
	{
		String TCName = "LoadMore_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnLoadMoreSelf();
		Thread.sleep(2000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("LoadMore_Function for self run successfully");
	}
	@AfterMethod
	public void LogoutFunction() throws InterruptedException
	{
		Thread.sleep(5000);
		Logout_QP logout = new Logout_QP(driver);
		logout.clickadminprofile();
		logout.clicklogoubtn();
	}
	@AfterClass
	public void BrowserCloseFunction()
	{
		driver.close();
	}
}
