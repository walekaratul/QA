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
import POM_Package_TT.View_Modify_For_Supervisor_And_Manager;
import Utility_Package_TT.Utility_ClassTT;



public class Testclass_For_Pending {
	WebDriver driver;
	View_Modify_For_Supervisor_And_Manager PF;
	Create_TimesheetTT CT;
	@BeforeClass
	public void browseropen() throws InterruptedException
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
	public void LoginFunction() throws EncryptedDocumentException, IOException, InterruptedException
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
	}
	@Test(priority=1)
	public void Simple_Search_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Simple_SearchFunction";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.EnterkOnSearchBoxVMFS();
		Thread.sleep(1000);
		PF.ClickOnSearchBtnVMFS();
		PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Simple_SearchFunction run successfully");
	}
	@Test(priority=2)
	public void Advanced_Search_ByDate_Function() throws InterruptedException, IOException
	{
		String TCName = "Advanced_Search_ByDate_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnAdvnancedSearchBtnVMFS();
		PF.SelectFilterOnVMFS();
		PF.SelectFilterOperatorOnVMFS();
		PF.ClickOnCalenderBoxVMFS();
		PF.ClickOnFirstDayVMFS();
		PF.ClickOnLastDayVMFS();
		PF.ClickOnApplyBtnVMFS();
		PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Advanced_Search_ByDate_Function run successfully");
		
	}
	@Test(priority=3)
	public void Advanced_Serach_ByUser_Function() throws InterruptedException, IOException
	{
		String TCName = "Advanced_Serach_ByUser_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnAdvnancedSearchBtnVMFS();
		Thread.sleep(1000);
		PF.SelectFilterUserOnVMFS();
		PF.SelectFilterOperatorUserOnVMFS();
		PF.EnterOnAdvancedEnterBoxUserVMFS();
		PF.ClickOnApplyBtnVMFS();
		PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Advanced_Serach_ByUser_Function run successfully");
		
	}
	@Test(priority=4)
	public void Advanced_Serach_ByProjectName_Function() throws InterruptedException, IOException
	{
		String TCName = "Advanced_Serach_ByProjectName_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnAdvnancedSearchBtnVMFS();
		Thread.sleep(1000);
		PF.SelectFilterUserPNOnVMFS();
		PF.SelectFilterOperatorPNOnVMFS();
		PF.EnterOnAdvancedEnterBoxPNVMFS();
		PF.ClickOnApplyBtnVMFS();
		PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Advanced_Serach_ByProjectName_Function run successfully");
		
	}
	@Test(priority=5)
	public void Advanced_Serach_ByStatus_Function() throws InterruptedException, IOException
	{
		String TCName = "Advanced_Serach_ByStatus_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnAdvnancedSearchBtnVMFS();
		Thread.sleep(1000);
		PF.SelectFilterUserStatusOnVMFS();
		PF.SelectFilterOperatorStatusOnVMFS();
		PF.ClickOnStatusVMFS();
		PF.ClickOnApplyBtnVMFS();
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Advanced_Serach_ByStatus_Function run successfully");
		
	}
	@Test(priority=6)
	public void UserTimesheetLink_Function() throws InterruptedException, IOException
	{
		String TCName = "UserTimesheetLink_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnWeekTimeSheetLinkVMFS();
		Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("UserTimesheetLink_Function run successfully");
		
	}
	@Test(priority=7)
	public void PluaSymbolFunction() throws InterruptedException, IOException
	{
		String TCName = "PluaSymbolFunction";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnPlusSymbollVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("PluaSymbolFunction run successfully");
	}
	@Test(priority=8)
	public void NewButtonFunction() throws InterruptedException, IOException
	{
		String TCName = "NewButtonFunction";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnNewBtnVMFS();
		Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("NewButtonFunction run successfully");
	}
	@Test(priority=9)
	public void HideShowAllRecordsFunction() throws InterruptedException, IOException
	{
		String TCName = "NewButtonFunction";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("NewButtonFunction run successfully");
		
	}
	@Test(enabled = false)
	public void Approvr_Function() throws InterruptedException, IOException
	{
		String TCName = "Approvr_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		PF.ClickOnApproveVMFS();
		PF.ClickOnSubmitSelectedVMFS();
		PF.ClickOnNoPopupVMFS();            //---NO
//		PF.ClickOnYesPopupVMFS();           //--YES
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Approvr_Function run successfully");
			
	}
	@Test(enabled = false)
	public void ApproveAll_Function() throws InterruptedException, IOException
	{
		String TCName = "ApproveAll_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		PF.ClickOnApproveAllVMFS();
		PF.ClickOnSubmitSelectedVMFS();
		PF.ClickOnNoPopupVMFS();            //---NO
//		PF.ClickOnYesPopupVMFS();           //--YES
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ApproveAll_Function run successfully");
		
	}
	@Test(enabled = false)
	public void Reject_Function() throws InterruptedException, IOException
	{
		String TCName = "Reject_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		PF.ClickOnRejectVMFS();
		PF.ClickOnSubmitSelectedVMFS();
		PF.ClickOnNoPopupVMFS();            //---NO
//		PF.ClickOnYesPopupVMFS();           //--YES
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Reject_Function run successfully");
	}
	@Test(enabled = false)
	public void RejectAll_Function() throws InterruptedException, IOException
	{
		String TCName = "RejectAll_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		PF.ClickOnRejectAllVMFS();
		PF.ClickOnSubmitSelectedVMFS();
		PF.ClickOnNoPopupVMFS();            //---NO
//		PF.ClickOnYesPopupVMFS();           //--YES
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("RejectAll_Function run successfully");
	}
	@Test(priority=13)
	public void Comment_Function() throws InterruptedException, IOException
	{
		String TCName = "Comment_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PF.ClickOnPendingBtnVMFS();		
		Thread.sleep(5000);
		PF.ClickOnHideShowAllRecordVMFS();
		PF.EnterCommentVMFS();
		PF.ClickOnPending1BtnVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Comment_Function run successfully");
	}
//	@Test(priority=14)
//	public void LoadMore_Function() throws InterruptedException, IOException
//	{
//		String TCName = "LoadMore_Function";
//		CT.ClickOnMenuBtn();
//		Thread.sleep(1000);
//		CT.ClickOnTimeTracking();
//		Thread.sleep(1000);
//		PF.ClickOnViewModifyTT();
//		Thread.sleep(1000);
//		PF.ClickOnPendingBtnVMFS();		
//		Thread.sleep(1000);
//		PF.ClickOnLoadMoreVMFS();
//		Thread.sleep(3000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("LoadMore_Function run successfully");
//	}
	@AfterMethod
	public void logout_Function() throws InterruptedException
	{
		Thread.sleep(5000);
		Logout_QP logout = new Logout_QP(driver);
		logout.clickadminprofile();
		logout.clicklogoubtn();
	}
	@AfterClass
    public void closebrowser()
	{
	  driver.close();	
	}
}
