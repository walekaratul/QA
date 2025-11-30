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
import POM_Package_TT.View_Modify_For_Pending_PM;
import POM_Package_TT.View_Modify_For_Supervisor_And_Manager;
import Utility_Package_TT.Utility_ClassTT;

public class Testclass_For_PendingPM {
	WebDriver driver;
	Create_TimesheetTT CT;
	View_Modify_For_Pending_PM PMF;
	View_Modify_For_Supervisor_And_Manager PF;
	
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
	public void loginfunction() throws InterruptedException, EncryptedDocumentException, IOException
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
		PMF =new View_Modify_For_Pending_PM(driver);
		PF= new View_Modify_For_Supervisor_And_Manager(driver);
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
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.EnterkOnSearchBoxVMPPM();
		PMF.ClickOnSearchBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnHideShowAllRecordVMPPM();
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
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnAdvnancedSearchBtnVMPPM();
		PMF.SelectFilterOnVMPPM();
		PMF.SelectFilterOperatorOnVMPPM();
		PMF.ClickOnCalenderBoxVMPPM();
		PMF.SelectMonthVMPPM();
		PMF.SelectYearVMPPM();
		PMF.ClickOnFirstDayVMPPM();
		PMF.ClickOnLastDayVMPPM();
		PMF.ClickOnApplyBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByDate_Function run successfully");
		
	}
	@Test(priority=3)
	public void AdvancedSearch_ByUser_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByUser_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnAdvnancedSearchBtnVMPPM();
		PMF.SelectFilterUserOnVMPPM();
		PMF.SelectFilterUserOperatorOnVMPPM();
		PMF.EnterOnAdvancedEnterBoxUserVMPPM();
		PMF.ClickOnApplyBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByUser_Function run successfully");
	}
	@Test(priority=4)
	public void AdvancedSearch_ByProjectName_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearch_ByProjectName_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnAdvnancedSearchBtnVMPPM();
		PMF.SelectFilterPNOnVMPPM();
		PMF.SelectFilterPNOperatorOnVMPPM();
		PMF.EnterOnAdvancedEnterBoxPNVMPPM();
		PMF.ClickOnApplyBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByProjectName_Function run successfully");
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
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnAdvnancedSearchBtnVMPPM();
		PMF.SelectFilterStatusOnVMPPM();
		PMF.SelectFilterStatusOperatorOnVMPPM();
		PMF.ClickOnStatusVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnApplyBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AdvancedSearch_ByStatus_Function run successfully");
	}
	@Test(priority=6)
	public void UserNameSheetLink_Function() throws InterruptedException, IOException
	{
		String TCName = "UserNameSheetLink_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnUserNameLinkVMPPM();
		Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("UserNameSheetLink_Function run successfully");
	}
	@Test(priority=7)
	public void PlusSymbolButton_Function() throws InterruptedException, IOException
	{
		String TCName = "PlusSymbolButton_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnPlusSymbollVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("PlusSymbolButton_Function run successfully");
	}
	@Test(priority=8)
	public void NewButton_Function() throws InterruptedException, IOException
	{
		String TCName = "NewButton_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnNewBtnVMPPM();
		Thread.sleep(7000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("NewButton_Function run successfully");
	}
	@Test(priority=9)
	public void HideShowAllRecord_Function() throws InterruptedException, IOException
	{
		String TCName = "HideShowAllRecord_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(7000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("HideShowAllRecord_Function run successfully");
	}
//	@Test(priority=10)
//	public void LoadMore_Function() throws InterruptedException, IOException
//	{
//		String TCName = "LoadMore_Function";
//		CT.ClickOnMenuBtn();
//		Thread.sleep(1000);
//		CT.ClickOnTimeTracking();
//		Thread.sleep(1000);
//		PF.ClickOnViewModifyTT();
//		Thread.sleep(1000);
//		PMF.ClickOnPendingPMBtnVMPPM();
//		Thread.sleep(1000);
//		PMF.ClickOnLoadMoreVMPPM();
//		Thread.sleep(3000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("LoadMore_Function run successfully");
//	}
	@Test(enabled =false)
	public void ApprovePM_Function() throws InterruptedException, IOException
	{
		String TCName = "ApprovePM_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(7000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnApproveVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
//		PMF.ClickOnYesPopupVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnNoPopupVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ApprovePM_Function run successfully");
	}
	@Test(enabled =false)
	public void ApproveAllPM_Function() throws InterruptedException, IOException
	{
		String TCName = "ApproveAllPM_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(7000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnApproveAllVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
//		PMF.ClickOnYesPopupVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnNoPopupVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ApproveAllPM_Function run successfully");
	}
	@Test(enabled =false)
	public void RejectPM_Function() throws InterruptedException, IOException
	{
		String TCName = "ApprovePM_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnRejectVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
//		PMF.ClickOnYesPopupVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnNoPopupVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ApprovePM_Function run successfully");
	}
	@Test(enabled =false)
	public void RejectAllPM_Function() throws InterruptedException, IOException
	{
		String TCName = "RejectAllPM_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnRejectAllVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
//		PMF.ClickOnYesPopupVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnNoPopupVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("RejectAllPM_Function run successfully");
	}
	@Test(priority=15)
	public void Comment_Function() throws InterruptedException, IOException
	{
		String TCName = "Comment_Function";
		CT.ClickOnMenuBtn();
		Thread.sleep(1000);
		CT.ClickOnTimeTracking();
		Thread.sleep(1000);
		PF.ClickOnViewModifyTT();
		Thread.sleep(5000);
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(5000);
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(5000);
        PMF.EnterCommentVMPPM();
        PMF.ClickOnPending1BtnVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Comment_Function run successfully");
	}
	@AfterMethod
	public void Logoutfunction() throws InterruptedException
	{
		Thread.sleep(5000);
		Logout_QP logout = new Logout_QP(driver);
		logout.clickadminprofile();
		logout.clicklogoubtn();
	}
	@AfterClass
	public void browserclosefunction()
	{
		driver.close();
	}
	
	
	
	

}
