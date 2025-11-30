package Test_Package_ET;

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

import POM_Package_ET.Create_Expensesheet;
import POM_Package_ET.Login_Quoteplan;
import POM_Package_ET.Logout_Quoteplan;
import POM_Package_ET.View_Modify_For_PENDING;
import POM_Package_ET.View_Modify_Sellf_UserAndSupervisor;
import Utility_Package_ET.Utility_Class_ET;

public class Testclass_ViewModify_For_Pending {
	WebDriver driver;
	Create_Expensesheet CE;
	View_Modify_Sellf_UserAndSupervisor VMESU;
	View_Modify_For_PENDING VMFP;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origin=*");
		    driver = new ChromeDriver(options);
//	        driver = new ChromeDriver();
			driver.get("http://localhost/QuotePlan/quotep7_surecontrols/home/login");
			driver.manage().window().maximize();
		    Thread.sleep(2000);
	}
	@BeforeMethod
	public void LogimFunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_Quoteplan log = new Login_Quoteplan(driver);
		log.EnterUsername(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 6, 1));
		Thread.sleep(1000);
		log.EnterPassword(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 5, 1));
		log.ClickOnLogin();
		CE = new Create_Expensesheet(driver);
		VMESU = new View_Modify_Sellf_UserAndSupervisor(driver);
		VMFP = new View_Modify_For_PENDING(driver);
	}
	@Test(priority =1)
	public void SimpleSearch_Function() throws InterruptedException, IOException
	{
		String TCName = "SimpleSearch_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFP.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.EnterkOnSearchBoxVMFPET();
		VMFP.ClickOnSearchBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("SimpleSearch_Function run successfully");
	}
	@Test(priority =2)
	public void AdbvancesSearchByDate_Function() throws InterruptedException, IOException
	{
		String TCName = "AdbvancesSearchByDate_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFP.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		VMFP.SelectFilterOnVMFPET();
		VMFP.SelectFilterOperatorOnVMFPET();
		VMFP.ClickOnCalenderBoxVMFPET();
		VMFP.SelectMonthVMFPET();
		VMFP.SelectYearVMFPET();
		VMFP.ClickOnFirstDayVMFPET();
		VMFP.ClickOnLastDayVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("SimpleSearch_Function run successfully");
	}
	@Test(priority =3)
	public void AdvancedSearchByUser_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearchByUser_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFP.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		Thread.sleep(1000);
		VMFP.SelectFilterUserOnVMFPET();
		VMFP.SelectFilterOperatorUserOnVMFPET();
		VMFP.EnterOnAdvancedEnterBoxUserVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByUser_Function run successfully");
	}
	@Test(priority =4)
	public void AdvancedSearchByProjectNO_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearchByProjectNO_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFP.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		Thread.sleep(1000);
		VMFP.SelectFilterPNOOnVMFPET();
		VMFP.SelectFilterOperatorPNOOnVMFPET();
		VMFP.EnterOnAdvancedEnterBoxProjectNoVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectNO_Function run successfully");
	}
	@Test(priority =5)
	public void AdvancedSearchByProjectName_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearchByProjectName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFP.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		Thread.sleep(1000);
		VMFP.SelectFilterPNameOnVMFPET();
		VMFP.SelectFilterOperatorPNameOnVMFPET();
		VMFP.EnterOnAdvancedEnterBoxProjectNameVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectName_Function run successfully");
	}
	@Test(priority=6)
	public void AdvancedSearchByStatus_Function() throws InterruptedException, IOException
	{
		String TCName = "AdvancedSearchByStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFP.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		Thread.sleep(1000);
		VMFP.SelectFilterStatusOnVMFPET();
		VMFP.SelectFilterOperatorStatusOnVMFPET();
		VMFP.ClickOnStatusVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByStatus_Function run successfully");
	}
	@Test(priority=7)
	public void NewButton_Function() throws InterruptedException, IOException
	{
		String TCName = "NewButton_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnNewBtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("NewButton_Function run successfully");
	}
	@Test(priority=8)
	public void PlusSymbol_Function() throws InterruptedException, IOException
	{
		String TCName = "PlusSymbol_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnPlusSymbollVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("PlusSymbol_Function run successfully");
	}
	@Test(priority=9)
	public void UserNameLink_Function() throws InterruptedException, IOException
	{
		String TCName = "UserNameLink_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnUserExpensesheetLinkVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("UserNameLink_Function run successfully");
	}
	@Test(priority=10)
	public void HideShowAllRecords_Function() throws InterruptedException, IOException
	{
		String TCName = "HideShowAllRecords_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("HideShowAllRecords_Function run successfully");
	}
	@Test(priority=11)
	public void Approve_Function() throws InterruptedException, IOException
	{
		String TCName = "Approve_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnApproveVMFPET();
		VMFP.ClickOnSubmitSelectedVMFPET();
		Thread.sleep(3000);
		VMFP.ClickOnYesPopupVMFPET();
//		VMFP.ClickOnNoPopupVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Approve_Function run successfully");
	}
	@Test(priority=12)
	public void ApproveAll_Function() throws InterruptedException, IOException
	{
		String TCName = "ApproveAll_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(1000);
		VMFP.ClickOnApproveAllVMFPET();
		VMFP.ClickOnSubmitSelectedVMFPET();
		Thread.sleep(3000);
		VMFP.ClickOnYesPopupVMFPET();
//		VMFP.ClickOnNoPopupVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ApproveAll_Function run successfully");
	}
	@Test(priority=13)
	public void Reject_Function() throws InterruptedException, IOException
	{
		String TCName = "Reject_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnRejectVMFPET();
		VMFP.ClickOnSubmitSelectedVMFPET();
		Thread.sleep(3000);
		VMFP.ClickOnYesPopupVMFPET();
//		VMFP.ClickOnNoPopupVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Reject_Function run successfully");
	}
	@Test(priority=14)
	public void RejectAll_Function() throws InterruptedException, IOException
	{
		String TCName = "RejectAll_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnRejectAllVMFPET();
		VMFP.ClickOnSubmitSelectedVMFPET();
		Thread.sleep(3000);
     	VMFP.ClickOnYesPopupVMFPET();
		VMFP.ClickOnNoPopupVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("RejectAll_Function run successfully");
	}
	@Test(priority=15)
	public void Comment_Function() throws InterruptedException, IOException
	{
		String TCName = "Comment_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnPlusSymbolVMFPET();
		Thread.sleep(3000);
		VMFP.EnterCommentVMFPET();
		VMFP.ClickOnPending1BtnVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Comment_Function run successfully");
		
	}
	@Test(priority=16)
	public void LoadMore_Function() throws InterruptedException, IOException
	{
		String TCName = "LoadMore_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnLoadMoreVMFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("LoadMore_Function run successfully");
		
	}
	@AfterMethod
	public void LogoutFunction()
	{
		Logout_Quoteplan logout = new Logout_Quoteplan(driver);
		logout.clickadminprofile();
		logout.clicklogoubtn();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	

}
