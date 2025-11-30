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
import POM_Package_TT.View_Modify_For_All;
import POM_Package_TT.View_Modify_For_Pending_PM;
import POM_Package_TT.View_Modify_For_Supervisor_And_Manager;
import POM_Package_TT.View_Modify_For_User;
import Utility_Package_TT.Utility_ClassTT;

public class Testclass_TT {
	
	WebDriver driver;
	Create_TimesheetTT CT;
	View_Modify_For_User VMFU;
	View_Modify_For_Supervisor_And_Manager PF;
	 View_Modify_For_Pending_PM PMF;
	 View_Modify_For_All All;
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
		Thread.sleep(5000);
	}
	@BeforeMethod
	public void LoginFunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_QP log = new Login_QP(driver);
		log.EnterUsername(Utility_Package_TT.Utility_ClassTT.GetExcelSheetData("Sheet", 18, 2));
		Thread.sleep(3000);
		log.EnterPassword(Utility_Package_TT.Utility_ClassTT.GetExcelSheetData("Sheet", 19, 2));
		Thread.sleep(3000);
		log.ClickOnLogin();
		Thread.sleep(3000);
		
	    CT = new Create_TimesheetTT(driver);
	    VMFU = new View_Modify_For_User(driver);
	    PF = new View_Modify_For_Supervisor_And_Manager(driver);
	    PMF =new View_Modify_For_Pending_PM(driver);
	    All = new View_Modify_For_All(driver);
	}
	@Test(priority = 1)
	public void CreateTimesheetFunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String TCName = "CreateTimesheetFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		CT.ClickOnCreateTimesheet();
		Thread.sleep(5000);
//----------------------------------------------Create Time sheet Function
		CT.ClickOnDatepickerCT();
		CT.SelectMonthCT();
		CT.SelectYeaarCT();
		CT.ClickOnDayCT();
		Thread.sleep(5000);
		CT.ClickOnProjectBoxCT();
		Thread.sleep(5000);
		CT.EnteronsearchboxCT();
		Thread.sleep(5000);
		CT.ClickonsearchiconCT();
		Thread.sleep(5000);
		CT.SelectProjectCT();
		Thread.sleep(5000);
		CT.SelectTaskCT();
		Thread.sleep(5000);
		CT.SelectLaborCT();
//		Thread.sleep(3000);
//		CT.ClickOnAddRowCTBtn();		
//		Thread.sleep(3000);
		CT.EnterMondayHrsCT();
		CT.EnterTuesdayHrsCT();
		CT.EnterWednesdayHrsCT();
		CT.EnterThursdayHrsCT();
		CT.EnterFridayHrsCT();
		CT.EnterSaturdayHrsCT();
		CT.EnterSundayHrsCT();
		Thread.sleep(3000);
		CT.ClickOnCommentbox1CT();
		CT.EnterMondayComment1CT();
		CT.ClickOnCommentbox2CT();
		CT.EnterTuesdayComment2CT();
		CT.ClickOnCommentbox3CT();
		CT.EnterWednesdayComment3CT();
		CT.ClickOnCommentbox4CT();
		CT.EnterThursdayComment4CT();
		CT.ClickOnCommentbox5CT();
		CT.EnterFridayComment5CT();
		CT.ClickOnCommentbox6CT();
		CT.EnterSaturdayComment6CT();
		CT.ClickOnCommentbox7CT();
		CT.EnterSundayComment7CT();
		Thread.sleep(3000);
		CT.ClickOnSaveTimesheetCT();
		Thread.sleep(10000);
		CT.ClickOnCheckboxCT();
		Thread.sleep(3000);
		Thread.sleep(10000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("CreateTimesheetFunction running successfully");

	}
	@Test(priority = 2)
	public void SupervisorinternalFunction() throws InterruptedException, IOException
	{
		String TCName = "SupervisorinternalFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(3000);
		CT.ClickOnCheckboxCT();
		Thread.sleep(3000);
		CT.ClickOnActionsBtnCT();
		Thread.sleep(3000);
		CT.ClickOnIssueForApprovalCT();
		Thread.sleep(3000);
		CT.ClickOnSupervisorInternalCT();
		Thread.sleep(25000);
		CT.ClickOnSubmitPopupCT();
//		Thread.sleep(15000);
//		CT.ClickOnCancelPopupCT();
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("SupervisorinternalFunction runn successfully");
	}
	
	@Test(priority = 3)
	public void ExportTimesheetFunction() throws InterruptedException, IOException
	{
		String TCName = "ExportTimesheetFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(3000);
		CT.ClickOnActionsBtnCT();
		Thread.sleep(5000);
		CT.ClickOnExportTimsheetCT();
		Thread.sleep(5000);
		CT.ClickOnPDFCT();
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ExportTimesheetFunction runn successfully");
	}
	@Test(priority = 4)
	public void ResetTimesheetFunction() throws InterruptedException, IOException
	{
		String TCName = "ResetTimesheetFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(3000);
		CT.ClickOnActionsBtnCT();
		Thread.sleep(5000);
		CT.clickOnResetTimesheetCT(); 
		Thread.sleep(3000);
		CT.clickOnResetYesCT();
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ResetTimesheetFunction runn successfully");
	}
	@Test(priority = 5)
	public void HideShowColumnFunction() throws InterruptedException, IOException
	{
		String TCName = "HideShowColumnFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(3000);
		CT.ClickOnHideShowColumn();
		Thread.sleep(2000);
      	CT.ClickOnTypeCheckbox();
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("HideShowColumnFunction runn successfully");
	}
	@Test(priority = 6)
	public void AddRowFunction() throws IOException, InterruptedException
	{
		String TCName = "AddRowFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		CT.ClickOnCreateTimesheet();
		Thread.sleep(5000);
		CT.ClickOnAddRowCTBtn();		
		Thread.sleep(1000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("AddRowFunction runn successfully");
	}
	@Test(priority = 7)
	public void DeleteFunction() throws InterruptedException, IOException
	{
		String TCName = "DeleteFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(5000);
		CT.ClickOnDeleteCT();
		Thread.sleep(3000);
	//	CT.ClickOnYEsDeletePopupCT();
    	CT.ClickOnDeletePopupCT();
		Thread.sleep(1000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("DeleteFunction runn successfully");
	}
	@Test(priority = 8)
	public void ProjectManagerinternalFunction() throws InterruptedException, IOException
	{
		String TCName = "ProjectManagerinternalFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		VMFU.ClickOnViewModifyTT();
		Thread.sleep(5000);
		VMFU.ClickOnWeekTimeSheetLinkVMFU();
		Thread.sleep(5000);
		CT.ClickOnCheckboxCT();
		Thread.sleep(5000);
		CT.ClickOnActionsBtnCT();
		Thread.sleep(3000);
		CT.ClickOnIssueForApprovalCT();
		Thread.sleep(5000);
		CT.ClickOnProjectManagerCT();
		Thread.sleep(30000);
		CT.ClickOnSubmitPopupPMCT();
		Thread.sleep(15000);
		CT.ClickOnCancelPMPopupCT();
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("ProjectManagerinternalFunction run successfully");
	}
	
//	@Test(priority = 9)
//	public void View_Modify_Function_For_User_And_Supervisor_SimpleSearch() throws InterruptedException, IOException
//	{
//		
//		String TCName = "Simple Search Function";
//		CT.ClickOnMenuBtn();
//		CT.ClickOnTimeTracking();
//		VMFU.ClickOnViewModifyTT();
//		
//		VMFU.EnterOnSerachBoxVMFU();
//		Thread.sleep(3000);
//		VMFU.ClickOnSearchBtnVMFU();
//		Thread.sleep(2000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("Simple Search Function run successfully");
//
//		
//
//	}
//	@Test(priority = 10)
//	public void  View_Modify_Function_For_User_And_Supervisor_AdvancedSearch() throws InterruptedException, IOException
//	{
//		String TCName = "Advanced Search Function";
//		CT.ClickOnMenuBtn();
//		CT.ClickOnTimeTracking();
//		VMFU.ClickOnViewModifyTT();
//		VMFU.ClickOnAdvnancedSearchBtnVMFU();
//		Thread.sleep(3000);
//		VMFU.SelectFilterOnVMFU();
//		Thread.sleep(3000);
//		VMFU.SelectFilterOperatorOnVMFU();
//		Thread.sleep(3000);
////		VMFU.EnterOnAdvancedEnterBoxVMFU();
//		VMFU.ClickOnStatusVMFU();                    //Status Function
//		
////		VMFU.ClickOnCalenderBoxVMFU();              //Date Function 
////		Thread.sleep(3000);
////		VMFU.ClickOnFirstDayVMFU();
////	    Thread.sleep(3000);
////		VMFU.ClickOnLastDayVMFU();
//     	VMFU.ClickOnApplyBtnVMFU();
//		Thread.sleep(2000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("Advanced Search run successfully");
//	}
//	@Test(priority=11)
//	public void HideShowAllRecordFunction() throws InterruptedException, IOException
//	{
//		String TCName = "HideShowAllRecord Function";
//		CT.ClickOnMenuBtn();
//		CT.ClickOnTimeTracking();
//		VMFU.ClickOnViewModifyTT();
//		Thread.sleep(2000);
//		VMFU.ClickOnHideShowAllRecordVMFU();
//		Thread.sleep(2000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("HideShowAllRecord run successfully");
//		
//	}
//	@Test(priority=12)
//	public void WeekTimeSheetLinkFunction() throws InterruptedException, IOException
//	{
//		String TCName = "WeekTimeSheetLink Function";
//		CT.ClickOnMenuBtn();
//		CT.ClickOnTimeTracking();
//		VMFU.ClickOnViewModifyTT();
//		Thread.sleep(2000);
//		VMFU.ClickOnWeekTimeSheetLinkVMFU();
//		Thread.sleep(2000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("WeekTimeSheetLink run successfully");
//		
//	}
//	@Test(priority=13)
//	public void PlusSymbolFunction() throws InterruptedException, IOException
//	{
//		String TCName = "PlusSymbol Function";
//		CT.ClickOnMenuBtn();
//		CT.ClickOnTimeTracking();
//		VMFU.ClickOnViewModifyTT();
//		Thread.sleep(2000);
//		VMFU.ClickOnPlusSymbollVMFU();
//		Thread.sleep(2000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("PlusSymbol run successfully");
//		
//	}
//	@Test(priority=14)
//	public void NewButtonFunction() throws InterruptedException, IOException
//	{
//		String TCName = "NewButton Function";
//		CT.ClickOnMenuBtn();
//		CT.ClickOnTimeTracking();
//		VMFU.ClickOnViewModifyTT();
//		Thread.sleep(2000);
//		VMFU.ClickOnNewBtnVMFU();
//		Thread.sleep(2000);
//		Utility_ClassTT.TakesScreenShot(driver, TCName);
//		System.out.println("NewButton run successfully");
//	}
	@Test(priority=15)
	public void Pending_Simple_SearchFunction() throws InterruptedException, IOException
	{
		String TCName = "Pending_Simple_SearchFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();		
		PF.EnterkOnSearchBoxVMFS();
		PF.ClickOnSearchBtnVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Simple_SearchFunction run successfully");
//--------------------------------------------Comment Function        
	
	    //--------------------------------------------LoadMore Function 	
//				   PF.ClickOnLoadMoreVMFS();
    }
	@Test(priority=16)
	public void Pending_AdvancedSearchFunction() throws InterruptedException, IOException
	{
		String TCName = "Pending_AdvancedSearchFunction";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();	
		PF.ClickOnAdvnancedSearchBtnVMFS();
		Thread.sleep(3000);
		PF.SelectFilterOnVMFS();
		Thread.sleep(3000);
        PF.SelectFilterOperatorOnVMFS();
		Thread.sleep(3000);
//		PF.EnterOnAdvancedEnterBoxVMFS();
		
//		PF.ClickOnStatusVMFS();               //Status Function
		                   
		PF.ClickOnCalenderBoxVMFS();          //   Date Function
	    Thread.sleep(3000);
		PF.ClickOnFirstDayVMFS();
	    Thread.sleep(3000);
		PF.ClickOnLastDayVMFS();
		Thread.sleep(3000);
		PF.ClickOnApplyBtnVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_AdvancedSearchFunction run successfully");
		
	}
	@Test(priority=17)
	public void Pending_User_Timesheet_Link_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_User_Timesheet_Link_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		PF.ClickOnWeekTimeSheetLinkVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_User_Timesheet_Link_Function run successfully");
	}
	@Test(priority=18)
	public void Pending_Plus_Symbol_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Plus_Symbol_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		Thread.sleep(2000);
	    PF.ClickOnPlusSymbollVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Plus_Symbol_Function run successfully");
	}
	@Test(priority=19)
	public void Pending_New_Button_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_New_Button_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		Thread.sleep(2000);
	    PF.ClickOnNewBtnVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_New_Button_Function run successfully");
	}
	@Test(priority=20)
	public void Pending_ShowHideAllRecords_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_ShowHideAllRecords_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		Thread.sleep(2000);
	    PF.ClickOnHideShowAllRecordVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_ShowHideAllRecords_Function run successfully");
	}
	@Test(priority=21)
	public void Pending_Approve_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Approve_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		Thread.sleep(2000);
		PF.ClickOnHideShowAllRecordVMFS();
		
		Thread.sleep(2000);
		PF.ClickOnApproveVMFS();                                         // Approve
		Thread.sleep(2000);
		PF.ClickOnSubmitSelectedVMFS();
		Thread.sleep(2000);
		PF.ClickOnYesPopupVMFS();                                          // Yes
		PF.ClickOnNoPopupVMFS();                                           // No
		
		PF.ClickOnApproveAllVMFS();                                     // Approved All
	    Thread.sleep(5000);
	    PF.ClickOnSubmitSelectedVMFS();
		Thread.sleep(5000);
		PF.ClickOnYesPopupVMFS();  
		PF.ClickOnNoPopupVMFS();
		
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Approve_Function run successfully");
		
	}
	@Test(priority=22)
	public void Pending_Reject_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Reject_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		Thread.sleep(2000);
		PF.ClickOnHideShowAllRecordVMFS();
		
		Thread.sleep(2000);
		PF.ClickOnRejectVMFS();                                        // Reject
		Thread.sleep(2000);
		PF.ClickOnSubmitSelectedVMFS();
		Thread.sleep(2000);
		PF.ClickOnYesPopupVMFS();                                          // Yes
		PF.ClickOnNoPopupVMFS();                                           // No
		
		PF.ClickOnRejectAllVMFS();                                     // Reject All
	    Thread.sleep(5000);
	    PF.ClickOnSubmitSelectedVMFS();
		Thread.sleep(5000);
		PF.ClickOnYesPopupVMFS();  
		PF.ClickOnNoPopupVMFS();
		
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Reject_Function run successfully");
		
	}
	@Test(priority=32)
	public void Pending_Comment_Function() throws InterruptedException, IOException
	{
	    String TCName = "Pending_Comment_Function";
	    CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PF.ClickOnViewModifyTT();
		PF.ClickOnPendingBtnVMFS();
		Thread.sleep(2000);
		PF.ClickOnHideShowAllRecordVMFS();
	    Thread.sleep(3000);
		PF.EnterCommentVMFS();
		PF.ClickOnPending1BtnVMFS();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
	    System.out.println("Pending_Comment_Function run successfully");
	}
	@Test(priority=23)
	public void Pending_Manager_Simple_Search_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Manager_Simle_Search_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PMF.ClickOnViewModifyTT();
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(2000);		
		PMF.EnterkOnSearchBoxVMPPM();
		PMF.ClickOnSearchBtnVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Manager_Simle_Search_Function run successfully");
		        
	}
	@Test(priority=24)
	public void Pending_Manager_Simle_Advanced_Search_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Manager_Simle_Advanced_Search_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PMF.ClickOnViewModifyTT();
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnAdvnancedSearchBtnVMPPM();
		Thread.sleep(3000);
		PMF.SelectFilterOnVMPPM();
		Thread.sleep(3000);
        PMF.SelectFilterOperatorOnVMPPM();
		Thread.sleep(3000);
		PMF.EnterOnAdvancedEnterBoxVMPPM();
		
        PMF.ClickOnAdvnancedSearchBtnVMPPM();                  // Advanced Date
        Thread.sleep(1000);
        PMF.SelectFilterOnVMPPM();
        Thread.sleep(1000);
		PMF.ClickOnCalenderBoxVMPPM();
	    Thread.sleep(3000);
		PMF.SelectMonthVMPPM();
		Thread.sleep(1000);
		PMF.SelectYearVMPPM();
		Thread.sleep(1000);
	    PMF.ClickOnFirstDayVMPPM();
	    Thread.sleep(1000);
		PMF.ClickOnLastDayVMPPM();
		
        PMF.ClickOnAdvnancedSearchBtnVMPPM();                  // Status
        Thread.sleep(1000);
        PMF.SelectFilterOnVMPPM();
        Thread.sleep(1000);
        PMF.SelectFilterOperatorOnVMPPM();
        Thread.sleep(1000);
        PMF.ClickOnStatusVMPPM();
        PMF.ClickOnApplyBtnVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Manager_Simle_Advanced_Search_Function run successfully");
		
	}
	@Test(priority=25)
	public void Pending_Manager_UserNameTimesheeLink_Function() throws IOException, InterruptedException
	{
		String TCName = "Pending_Manager_HideShowAllRecord Function_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PMF.ClickOnViewModifyTT();
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(2000);
		PMF.ClickOnUserNameLinkVMPPM();                     //User Name Link
		PMF.ClickOnPlusSymbollVMPPM();                      // Plus Symbol
		PMF.ClickOnNewBtnVMPPM();                           // New Button
		PMF.ClickOnHideShowAllRecordVMPPM();                //HideShowAllRecord
		PMF.ClickOnLoadMoreVMPPM();                         //Load More
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Manager_HideShowAllRecord_Function run successfully");
	}
	@Test(priority=26)
	public void Pending_Manager_Approve_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Manager_Approve_Function Function_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PMF.ClickOnViewModifyTT();
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(2000);
        
		
		PMF.ClickOnHideShowAllRecordVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnApproveVMPPM();                //Approve
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnYesPopupVMPPM();
		PMF.ClickOnNoPopupVMPPM();
		
		                                         // Approve All
		PMF.ClickOnApproveAllVMPPM();
	    Thread.sleep(1000);
	    PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnYesPopupVMPPM();
		PMF.ClickOnNoPopupVMPPM();
		
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Manager_Approve_Function run successfully");
	}
	@Test(priority=27)
	public void Pending_Manager_Reject_Function() throws InterruptedException, IOException
	{
		String TCName = "Pending_Manager_Reject_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		PMF.ClickOnViewModifyTT();
		PMF.ClickOnPendingPMBtnVMPPM();
		Thread.sleep(2000);
		
        PMF.ClickOnHideShowAllRecordVMPPM();               // Reject
		Thread.sleep(1000);
		PMF.ClickOnRejectVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnYesPopupVMPPM();
		PMF.ClickOnNoPopupVMPPM();
		
		PMF.ClickOnRejectAllVMPPM();                        // Reject All
		Thread.sleep(1000);
		PMF.ClickOnSubmitSelectedVMPPM();
		Thread.sleep(1000);
		PMF.ClickOnYesPopupVMPPM();
		PMF.ClickOnNoPopupVMPPM();
		Thread.sleep(3000);
		Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
		System.out.println("Pending_Manager_Reject_Function run successfully");
	}
	@Test(priority=28)
	public void Pending_Manager_Comment_Function() throws InterruptedException, IOException
	{
		 String TCName = "Pending_Manager_Comment_Function";
		 CT.ClickOnMenuBtn();
		 CT.ClickOnTimeTracking();
		 PMF.ClickOnViewModifyTT();
		 PMF.ClickOnPendingPMBtnVMPPM();
		 Thread.sleep(2000);
		 PMF.ClickOnHideShowAllRecordVMPPM();
		 Thread.sleep(1000);
		 PMF.EnterCommentVMPPM();
		 PMF.ClickOnPending1BtnVMPPM();
		 Thread.sleep(3000);
	     Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
	     System.out.println("Pending_Manager_Comment_Function run successfully");
	}
	@Test(priority=29)
	public void All_Function_Simple_Search_Function() throws InterruptedException, IOException
	{
		String TCName = "All_Function_Simple_Search_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		All.ClickOnViewModifyTT();
		All.ClickOnVMALLBtn();	
		All.EnterkOnSearchBoxVMALL();
		All.ClickOnSearchBtnVMALL();
		Thread.sleep(3000);
	    Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
	    System.out.println("All_Function_Simple_Search_Function run successfully");
		
	}
	@Test(priority=30)
	public void All_Function_Advanced_Search_Function() throws InterruptedException, IOException
	{
		
		String TCName = "All_Function_Advanced_Search_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		All.ClickOnViewModifyTT();
		All.ClickOnVMALLBtn();
		
		All.ClickOnAdvnancedSearchBtnVMALL();
	    Thread.sleep(1000);
		All.SelectFilterOnVMALL();
		Thread.sleep(1000);
		All.SelectFilterOperatorOnVMALL();
		Thread.sleep(1000);
	    All.EnterOnAdvancedEnterBoxVMALL();
		All.ClickOnApplyBtnVMALL();	
		
       All.ClickOnAdvnancedSearchBtnVMALL();        // Date
       Thread.sleep(1000);
       All.SelectFilterOnVMALL();
       Thread.sleep(1000);
	    All.ClickOnCalenderBoxVMALL();
	    Thread.sleep(3000);
		All.SelectMonthVMALL();
		Thread.sleep(1000);
		All.SelectYearVMALL();
		Thread.sleep(1000);
		All.ClickOnFirstDayVMALL();
	    Thread.sleep(1000);
		All.ClickOnLastDayVMALL();
        All.ClickOnApplyBtnVMALL();
		
        All.ClickOnAdvnancedSearchBtnVMALL();         // Status
        Thread.sleep(1000);
        All.SelectFilterOnVMALL();
        Thread.sleep(1000);
        All.SelectFilterOperatorOnVMALL();
        Thread.sleep(1000);
        All.ClickOnStatusVMALL();
        All.ClickOnApplyBtnVMALL();		
        Thread.sleep(3000);
	    Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
	    System.out.println("All_Function_Advanced_Search_Function run successfully");
	}
	@Test(priority=31)
	public void All_Function_UserNameLink_Function() throws IOException, InterruptedException
	{
		String TCName = "All_Function_NewBtn_Function";
		CT.ClickOnMenuBtn();
		CT.ClickOnTimeTracking();
		All.ClickOnViewModifyTT();
		All.ClickOnVMALLBtn();
		Thread.sleep(3000);
//		All.ClickOnUserNameLinkVMALL();                     // user Name Link
//		All.ClickOnPlusSymbollVMALL();                      //Plus Symbol
//		All.ClickOnNewBtnVMALL();                           // New Button
//		All.ClickOnLoadMoreVMALL();	
		Thread.sleep(3000);
	    Utility_Package_TT.Utility_ClassTT.TakesScreenShot(driver, TCName);
	    System.out.println("All_Function_NewBtn_Function run successfully");
	}
//	@AfterMethod
//	public void LogoutFunction()
//	{
//		Logout_QP logout = new Logout_QP(driver);
//		logout.clickadminprofile();
//		logout.clicklogoubtn();
//	}
//	@AfterClass
//	public void BrowserCloseFunction()
//	{
//		driver.close();
//	}

}
