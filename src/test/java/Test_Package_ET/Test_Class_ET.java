package Test_Package_ET;

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

import POM_Package_ET.Create_Expensesheet;
import POM_Package_ET.Login_Quoteplan;
import POM_Package_ET.Logout_Quoteplan;
import POM_Package_ET.Reimbursable_For_ALL;
import POM_Package_ET.Reimbursable_For_PAID;
import POM_Package_ET.Reimbursable_For_PENDING;
import POM_Package_ET.View_Modify_For_All;
import POM_Package_ET.View_Modify_For_PENDING;
import POM_Package_ET.View_Modify_For_PENDINGPM;
import POM_Package_ET.View_Modify_Sellf_UserAndSupervisor;
import Utility_Package_ET.Utility_Class_ET;

public class Test_Class_ET {
	WebDriver driver;
	Create_Expensesheet CE;
	View_Modify_Sellf_UserAndSupervisor VMESU;
	View_Modify_For_PENDING VMFP;
	View_Modify_For_PENDINGPM VMFPPM ;
	
	@BeforeClass
	public void BrowserOpenFunction() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origin=*");
		    driver = new ChromeDriver(options);
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("http://localhost/QuotePlan/quotep7_surecontrols/home/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	}
	@BeforeMethod
	public void LoginFunction() throws EncryptedDocumentException, IOException
	{
		
		Login_Quoteplan log = new Login_Quoteplan(driver);
		log.EnterUsername(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Data", 8, 1));
		log.EnterPassword(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Data", 9, 1));
		log.ClickOnLogin();
	    CE = new Create_Expensesheet(driver);
	    VMESU = new View_Modify_Sellf_UserAndSupervisor(driver);
	    VMFP = new View_Modify_For_PENDING(driver);
	    VMFPPM = new View_Modify_For_PENDINGPM(driver);
		
	}
	@Test(priority=1)
	public void Create_ExpensesheetET() throws IOException, InterruptedException
	{
		String TCName = "Create_ExpensesheetET";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		CE.ClickOnCreateExpensheeet();

		CE.ClickOnDateSymbollCE();
		CE.SelectmonthCE();
		CE.SelectyearCE();
		CE.ClickOnDayCE();
		CE.ClickOnProjectserarchboxCE();
		CE.SelectProjectCE();
	
		CE.SelectExpense1CE();
		CE.SelectExpense2CE();
		CE.SelectExpense3CE();
		CE.SelectExpense4CE();
		CE.SelectExpense5CE();
		CE.SelectExpense6CE();
		CE.SelectExpense7CE();
		
		CE.EnterAmount1CE();
		CE.EnterAmount2CE();
		CE.EnterAmount3CE();
		CE.EnterAmount4CE();
		CE.EnterAmount5CE();
		CE.EnterAmount6CE();
		CE.EnterAmount7CE();
		CE.ClickOnTotalCE();
		
		CE.ClickOnCheckBox1CE();
		CE.ClickOnCheckBox2CE();
		CE.ClickOnCheckBox3CE();
		CE.ClickOnCheckBox4CE();
		CE.ClickOnCheckBox5CE();
		CE.ClickOnCheckBox6CE();
		CE.ClickOnCheckBox7CE();
		
		CE.ClickOnComment1CE();
		CE.EnterComment1CE();
		CE.ClickOnComment2CE();
		CE.EnterComment2CE();
		CE.ClickOnComment3CE();
		CE.EnterComment3CE();
		CE.ClickOnComment4CE();
		CE.EnterComment4CE();
		CE.ClickOnComment5CE();
		CE.EnterComment5CE();
		CE.ClickOnComment6CE();
		CE.EnterComment6CE();
		CE.ClickOnComment7CE();
		CE.EnterComment7CE();
		CE.ClickOntotalCE();		
		CE.ClickOnSaveBtnCE();
		Thread.sleep(2000);
			
	    Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Create_ExpensesheetET Successfully Pass");
		

	}
	@Test(priority=2)
	public void Supervisor_Approval() throws InterruptedException, IOException
	{
		String TCName = "Create_ExpensesheetET";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMESU.ClickOnViewModifyExpensesheet();
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		CE.ClickOnProjectAllCheckBoxCE();
//	    CE.ClickOnProjectSingleCheckBoxCE();
	    Thread.sleep(3000);
	    CE.ClickOnActionsBtnCE();
	    CE.ClickOnIssueForApprovalBtnCE();
	    CE.ClickOnSupervisorInternalBtnCE();
	    CE.ClickOnSubmitBtnCE();
//	    CE.ClickOnCancelBtnCE();
	    Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Create_ExpensesheetET Successfully Pass");
		
  		    
	}
	@Test(priority=3)
	public void ProjectManager_Approval() throws InterruptedException, IOException
	{
		String TCName = "ProjectManager_Approval";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMESU.ClickOnViewModifyExpensesheet();
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		CE.ClickOnProjectAllCheckBoxCE();
//	    CE.ClickOnProjectSingleCheckBoxCE();
	    Thread.sleep(3000);
	    CE.ClickOnActionsBtnCE();
	    CE.ClickOnIssueForApprovalBtnCE();
	    CE.ClickOnProjectManagerBtnCE();
	    CE.ClickOnSubmitBtnCE();
//	    CE.ClickOnCancelBtnCE();
	    Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
	  	System.out.println("ProjectManager_Approval Successfully Pass");
  		    
	}
	@Test(priority=4)
	public void Client_Approval() throws InterruptedException, IOException
	{
		String TCName = "Create_ExpensesheetET";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMESU.ClickOnViewModifyExpensesheet();
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		CE.ClickOnProjectAllCheckBoxCE();
//	    CE.ClickOnProjectSingleCheckBoxCE();
	    Thread.sleep(3000);
	    CE.ClickOnActionsBtnCE();
	    CE.ClickOnIssueForApprovalBtnCE();
	    CE.ClickOnClientBtnCE();
//	    CE.ClickOnSubmitBtnCE();
//	    CE.ClickOnCancelBtnCE();
	    Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
	  	System.out.println("Create_ExpensesheetET Successfully Pass");    
	}
	@Test(priority=5)
	public void Export_Function() throws InterruptedException, IOException
	{
		String TCName = "Create_ExpensesheetET";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMESU.ClickOnViewModifyExpensesheet();
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		CE.ClickOnActionsBtnCE();
		CE.ClickOnExportExpenseSheetBtnCE();
		CE.ClickOnExportPDFBtnCE();
//		CE.ClickOnExportPDFWithRecieptBtnCE();	
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Create_ExpensesheetET Successfully Pass");    
	}
	@Test(priority=6)
	public void Delete_Function() throws InterruptedException, IOException
	{
		String TCName = "Create_ExpensesheetET";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMESU.ClickOnViewModifyExpensesheet();
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		Thread.sleep(3000);
		CE.ClickOnAddRowBtnCE();

//	    CE.ClickOndeleteSymbolCE();
//	    Thread.sleep(3000);
//	    CE.ClickOndeleteYESBtnCE();
//	    CE.ClickOndeleteNOBtnCE();
//	    CE.ClickOnleavethispageBtnCE();
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Create_ExpensesheetET Successfully Pass"); 
			    
	}
	@Test(priority=7)
	public void View_Modify_User_and_Supervisor_Simple_Search() throws IOException
	{
		//View_Modify_Sellf_UserAndSupervisor VMESU = new View_Modify_Sellf_UserAndSupervisor(driver);
		 String TCName = "View_Modify_User_and_Supervissor";
		 CE.ClickOnMenu();
		 CE.ClickOnExpenseTracking();
		 VMESU.ClickOnViewModifyExpensesheet();
//-------------------------------------------------------------Simple Search Function		 
		 VMESU.EnterOnSerachBoxVMFUET();
		 VMESU.ClickOnSearchBtnVMFUET();

		 
		 
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("View_Modify_User_and_Supervissor Page Successfully Pass");
	}
	@Test(priority=8)
	public void View_Modify_User_and_Supervisor_Advanced_Search() throws IOException, InterruptedException
	{
		 String TCName = "View_Modify_User_and_Supervisor_Advanced_Search";
		 CE.ClickOnMenu();
		 CE.ClickOnExpenseTracking();
		 VMESU.ClickOnViewModifyExpensesheet();
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterOnVMFUET();
		 VMESU.SelectFilterOperatorOnVMFUET();
		 VMESU.EnterOnAdvancedEnterBoxVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
		 
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterOnVMFUET();
		 VMESU.SelectFilterOperatorOnVMFUET();
		 VMESU.ClickOnCalenderBoxVMFUET();
		 VMESU.SelectMonthVMFUET();
		 VMESU.SelectYearVMFUET();
		 VMESU.ClickOnFirstDayVMFUET();
		 VMESU.ClickOnLastDayVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
		 
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterOnVMFUET();
		 Thread.sleep(2000);
		 VMESU.SelectFilterOperatorOnVMFUET();
		 Thread.sleep(2000);
		 VMESU.ClickOnStatusVMFUET();
		 Thread.sleep(2000);
		 VMESU.ClickOnApplyBtnVMFUET();
		 
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("View_Modify_User_and_Supervisor_Advanced_Search Page Successfully Pass");
	}
	@Test(priority=9)
	public void View_Modify_User_and_Supervisor_Advanced_Search_Extr_Field() throws InterruptedException, IOException
	{
		 String TCName = "View_Modify_User_and_Supervisor_Advanced_Search_Extr_Field";
		 CE.ClickOnMenu();
		 CE.ClickOnExpenseTracking();
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(2000);

		 VMESU.ClickOnPlusSymbollVMFUET();       //-------------------------------------------------------Plus Symbol Function
		 VMESU.ClickOnNewBtnVMFUET();            //-------------------------------------------------------New Button Function
		 VMESU.ClickOnWeekTimeSheetLinkVMFUET(); //------------------------------------------Week Time sheet Link Function	
		 VMESU.ClickOnHideShowAllRecordVMFUET(); //---------------------------------Hide Show All Records Function 
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("View_Modify_User_and_Supervisor_Advanced_Search_Extr_Field Page Successfully Pass");
	}
	
	@Test(priority=10)
	public void View_Modify_For_PENDING_Function_CommonSearch() throws IOException, InterruptedException
	{
		View_Modify_For_PENDING VMFP = new View_Modify_For_PENDING(driver);
		String TCName = "View_Modify_For_PENDING_Function_CommonSearch";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.EnterkOnSearchBoxVMFPET();
		VMFP.ClickOnSearchBtnVMFPET();

		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_CommonSearch Successfully Pass");

	}
	@Test(priority=11)
	public void View_Modify_For_PENDING_Function_Advanced_Date() throws IOException, InterruptedException
	{
		String TCName = "View_Modify_For_PENDING_Function_Advanced_Date";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		VMFP.SelectFilterOnVMFPET();
		VMFP.SelectFilterOperatorOnVMFPET();
		VMFP.EnterOnAdvancedEnterBoxVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		VMFP.SelectFilterOnVMFPET();
		VMFP.SelectFilterOperatorOnVMFPET();
		VMFP.ClickOnCalenderBoxVMFPET();
		VMFP.SelectMonthVMFPET();
		VMFP.SelectYearVMFPET();
		VMFP.ClickOnFirstDayVMFPET();
		VMFP.ClickOnLastDayVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		
		VMFP.ClickOnAdvnancedSearchBtnVMFPET();
		VMFP.SelectFilterOnVMFPET();
		VMFP.SelectFilterOperatorOnVMFPET();
		VMFP.ClickOnStatusVMFPET();
		VMFP.ClickOnApplyBtnVMFPET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_Advanced_Date Successfully Pass");
	}
	@Test(priority=12)
	public void View_Modify_For_PENDING_Function_New_Button() throws IOException, InterruptedException
	{
		String TCName = "View_Modify_For_PENDING_Function_New_Button";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnNewBtnVMFPET();
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_New_Button Successfully Pass");
	
	}
	@Test(priority=13)
	public void View_Modify_For_PENDING_Function_Plus_Symbol() throws IOException, InterruptedException
	{
		String TCName = "View_Modify_For_PENDING_Function_Plus_Symbol";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnPlusSymbollVMFPET();
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_Plus_Symbol Successfully Pass");
	}
	@Test(priority=14)
	public void View_Modify_For_PENDING_Function_User_Link() throws IOException, InterruptedException
	{
		String TCName = "View_Modify_For_PENDING_Function_User_Link";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnUserExpensesheetLinkVMFPET();
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_User_Link Successfully Pass");
	}
	@Test(priority=15)
	public void View_Modify_For_PENDING_Function_Show_hide_Record() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_Show_hide_Record";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_Show_hide_Record Successfully Pass");
	}
	
	@Test(priority=16)
	public void View_Modify_For_PENDING_Function_Approve() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_Approve";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnApproveVMFPET();
		VMFP.ClickOnSubmitSelectedVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnYesPopupVMFPET();
//		VMFP.ClickOnNoPopupVMFPET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_Approve Successfully Pass");
	}
	@Test(priority=17)
	public void View_Modify_For_PENDING_Function_ApproveAll() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_ApproveAll";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(5000);
		VMFP.ClickOnHideShowAllRecordVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnApproveAllVMFPET();
		VMFP.ClickOnSubmitSelectedVMFPET();
		Thread.sleep(3000);
		VMFP.ClickOnYesPopupVMFPET();
		VMFP.ClickOnNoPopupVMFPET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_ApproveAll Successfully Pass");
	}
	@Test(priority=18)
	public void View_Modify_For_PENDING_Function_Reject() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_Reject";
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
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_Reject Successfully Pass");
	}
	@Test(priority=19)
	public void View_Modify_For_PENDING_Function_RejectAll() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_RejectAll";
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
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_RejectAll Successfully Pass");
	}
	@Test(priority=20)
	public void View_Modify_For_PENDING_Function_Comment() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_Comment";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnPlusSymbolVMFPET();
		Thread.sleep(3000);
		VMFP.EnterCommentVMFPET();
		VMFP.ClickOnPending1BtnVMFPET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_Comment Successfully Pass");
	}
	@Test(priority=21)
	public void View_Modify_For_PENDING_Function_LoadMore() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_LoadMoret";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		Thread.sleep(2000);
		VMFP.ClickOnLoadMoreVMFPET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_LoadMoret Successfully Pass");
	}
	@Test(priority=22)
	public void View_Modify_For_PENDING_PM_Function_CommonSearch() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_CommonSearch";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		Thread.sleep(5000);
//-----------------------------------------------------------------Simple Search Function		
		VMFPPM.EnterkOnSearchBoxVMFPPMET();
		VMFPPM.ClickOnSearchBtnVMFPPMET();


//------------------------------------------------------------LoadMore Function
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_CommonSearch Successfully Pass");
	}
	@Test(priority=23)
	public void View_Modify_For_PENDING_PM_Function_AdvancedSearch() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_AdvancedSearch";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnAdvnancedSearchBtnVMFPPMET();
		VMFPPM.SelectFilterOnVMFPPMET();
		VMFPPM.SelectFilterOperatorOnVMFPPMET();
		VMFPPM.EnterOnAdvancedEnterBoxVMFPPMET();
		VMFPPM.ClickOnApplyBtnVMFPPMET();
		
		VMFPPM.ClickOnAdvnancedSearchBtnVMFPPMET();
		VMFPPM.SelectFilterOnVMFPPMET();
		VMFPPM.SelectFilterOperatorOnVMFPPMET();
		VMFPPM.ClickOnCalenderBoxVMFPPMET();
		VMFPPM.SelectMonthVMFPPMET();
		VMFPPM.SelectYearVMFPPMET();
		VMFPPM.ClickOnFirstDayVMFPPMET();
		VMFPPM.ClickOnLastDayVMFPPMET();
		VMFPPM.ClickOnApplyBtnVMFPPMET();
		
		VMFPPM.ClickOnAdvnancedSearchBtnVMFPPMET();
		VMFPPM.SelectFilterOnVMFPPMET();
		VMFPPM.SelectFilterOperatorOnVMFPPMET();
		VMFPPM.ClickOnStatusVMFPPMET();
		VMFPPM.ClickOnApplyBtnVMFPPMET();	
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_AdvancedSearch Successfully Pass");
	}
	@Test(priority=24)
	public void View_Modify_For_PENDING_PM_Function_NewButton() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_NewButton";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnNewBtnVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_NewButton Successfully Pass");
	}
	@Test(priority=25)
	public void View_Modify_For_PENDING_PM_Function_UserExpensesheet() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_UserExpensesheet";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnUserExpensesheetLinkVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_UserExpensesheet Successfully Pass");
	}
	@Test(priority=26)
	public void View_Modify_For_PENDING_PM_Function_PlusSymbol() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_PlusSymbol";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnPlusSymbollVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_PlusSymbol Successfully Pass");
	}
	@Test(priority=27)
	public void View_Modify_For_PENDING_PM_Function_HideShowRecord() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_HideShowRecord";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnHideShowAllRecordVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_HideShowRecord Successfully Pass");
	}
	@Test(priority=28)
	public void View_Modify_For_PENDING_PM_Function_Approve() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_Approve";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnHideShowAllRecordVMFPPMET();
		VMFPPM.ClickOnApproveVMFPPMET();
		VMFPPM.ClickOnSubmitSelectedVMFPPMET();
		Thread.sleep(5000);
		VMFPPM.ClickOnYesPopupVMFPPMET();
		VMFPPM.ClickOnNoPopupVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_Approve Successfully Pass");
	}
	@Test(priority=29)
	public void View_Modify_For_PENDING_PM_Function_ApproveAll() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_ApproveAll";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnHideShowAllRecordVMFPPMET();
		VMFPPM.ClickOnApproveAllVMFPPMET();
		VMFPPM.ClickOnSubmitSelectedVMFPPMET();
		Thread.sleep(5000);
		VMFPPM.ClickOnYesPopupVMFPPMET();
		VMFPPM.ClickOnNoPopupVMFPPMET();;
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_ApproveAll Successfully Pass");
	}
	@Test(priority=30)
	public void View_Modify_For_PENDING_PM_Function_Reject() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_Reject";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnHideShowAllRecordVMFPPMET();
		VMFPPM.ClickOnRejectVMFPPMET();
		VMFPPM.ClickOnSubmitSelectedVMFPPMET();
		Thread.sleep(5000);
		VMFPPM.ClickOnYesPopupVMFPPMET();
		VMFPPM.ClickOnNoPopupVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_Reject Successfully Pass");
	}
	@Test(priority=31)
	public void View_Modify_For_PENDING_PM_Function_RejectAll() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_RejectAll";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnHideShowAllRecordVMFPPMET();
		VMFPPM.ClickOnRejectAllVMFPPMET();
		VMFPPM.ClickOnSubmitSelectedVMFPPMET();
		Thread.sleep(5000);
		VMFPPM.ClickOnYesPopupVMFPPMET();
		VMFPPM.ClickOnNoPopupVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_RejectAll Successfully Pass");
	}
	@Test(priority=32)
	public void View_Modify_For_PENDING_PM_Function_Comment() throws IOException, InterruptedException
	{
		String TCName ="View_Modify_For_PENDING_PM_Function_Comment";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFPPM.ClickOnViewModifyET();
		VMFPPM.ClickOnPendingPMBtnVMFPPMET();
		VMFPPM.ClickOnHideShowAllRecordVMFPPMET();
		VMFPPM.EnterCommentVMFPPMET();
		VMFPPM.ClickOnPendingPM1BtnVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_PM_Function_Comment Successfully Pass");
	}
	@Test(priority=33)
	public void View_Modify_For_PENDING_PM_Function_LoadMore() throws InterruptedException, IOException
	{
		String TCName = "View_Modify_For_PENDING_Function_LoadMore";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFP.ClickOnViewModifyET();
		VMFP.ClickOnPendingBtnVMFPET();
		VMFPPM.ClickOnLoadMoreVMFPPMET();
		Thread.sleep(2000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_PENDING_Function_LoadMore Successfully Pass");
	}
	
	@Test(priority=34)
	public void View_Modify_For_All_Function_Siple() throws IOException, InterruptedException
	{
		String TCName = "View_Modify_For_All_Function";
		View_Modify_For_All VMFA = new View_Modify_For_All(driver);
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		VMFA.ClickOnViewModifyET();
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(3000);
//-----------------------------------------------Simple Search Function	
		VMFA.EnterkOnSearchBoxVMFAET();
		VMFA.ClickOnSearchBtnVMFAET();
//-----------------------------------------------Advanced Search Function
//		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
//		VMFA.SelectFilterOnVMFAET();
//		VMFA.SelectFilterOperatorOnVMFAET();
//		VMFA.EnterOnAdvancedEnterBoxVMFAET();
//		VMFA.ClickOnApplyBtnVMFAET();
//---------------------------------------------------------------Status Function
//		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
//		VMFA.SelectFilterOnVMFAET();
//		VMFA.SelectFilterOperatorOnVMFAET();
//		VMFA.ClickOnStatusVMFAET();
//		VMFA.ClickOnApplyBtnVMFAET();
//------------------------------------------------------Advanced Date Function
//		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
//		VMFA.SelectFilterOnVMFAET();
//		VMFA.SelectFilterOperatorOnVMFAET();
//		VMFA.ClickOnCalenderBoxVMFAET();
//		VMFA.SelectMonthVMFAETT();
//		VMFA.SelectYearVMFAET();
//		VMFA.ClickOnFirstDayVMFAET();
//		VMFA.ClickOnLastDayVMFAET();
//		VMFA.ClickOnApplyBtnVMFAET();
//-----------------------------------------------------------New Button Function
//		VMFA.ClickOnNewBtnVMFAET();
//------------------------------------------------------------Plus Symbol Function	
//		VMFA.ClickOnPlusSymbollVMFAET();
//---------------------------------------------------------------UserExpensheetLink	Function
//		VMFA.ClickOnUserExpensesheetLinkVMFAET();
//-------------------------------------------------------------------Hide Show All Records Function	
//		VMFA.ClickOnHideShowAllRecordVMFAET();
//------------------------------------------------------------LoadMore Function	
//		VMFA.ClickOnLoadMoreVMFAET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("View_Modify_For_All_Function Successfully Pass");
	}
	@Test(priority=35)
	public void Reimbursable_For_Pending_Function() throws IOException, InterruptedException
	{
		Reimbursable_For_PENDING RFP = new Reimbursable_For_PENDING(driver);
		String TCName="Reimbursable_For_Pending_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
//-----------------------------------------------------------------------Simple Search Function
		RFP.EnterkOnSearchBoxRFPET();
		RFP.ClickOnSearchBtnRFPET();
//----------------------------------------------------------------------Advanced Search Function
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		RFP.SelectFilterOnRFPET();
		RFP.SelectFilterOperatorOnRFPET();
		RFP.EnterOnAdvancedEnterBoxRFPET();
		RFP.ClickOnApplyBtnRFPET();
//------------------------------------------------------Advanced Date Function	
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		RFP.SelectFilterOnRFPET();
		RFP.SelectFilterOperatorOnRFPET();
		RFP.ClickOnCalenderBoxRFPET();
		RFP.SelectMonthRFPET();
		RFP.SelectYearRFPET();
		RFP.ClickOnFirstDayRFPET();
		RFP.ClickOnLastDayRFPET();
		RFP.ClickOnApplyBtnRFPET();
//------------------------------------------------------Expense details Popup Function
		RFP.ClickOnDateForExpenseDetailsRFPET();
		RFP.ClickOnProjectNoForExpenseDetailsRFPET();
		RFP.ClickOnProjectNameExpenseDetailsRFPET();
		Thread.sleep(1000);
		RFP.ClickOnCloseForExpenseDetailsRFPET();
		
//---------------------------------------------------Check box for individual and All Function	
          RFP.ClickOncheckboxForPayRFPET();
          Thread.sleep(1000);
          RFP.ClickOnAllcheckboxForPayRFPET();     //--All checkbox
          Thread.sleep(1000);
 //---------------------------------------------------Pay Selected Function         
          RFP.ClickOnPaySelectedRFPET();
          Thread.sleep(1000);
          RFP.EnterAmountForPaySelectedRFPET();
          Thread.sleep(1000);
          RFP.ClickOnCalenderBoxForPaySelectedRFPET();
          Thread.sleep(5000);
          RFP.SelectmonthForPaySelectedRFPET();
          Thread.sleep(1000);
          RFP.SelectyearForPaySelectedRFPET();
          Thread.sleep(1000);
          RFP.ClickOndayForPaySelectedRFPET();
          Thread.sleep(1000);
          RFP.EnterOnPaySelectedNoteRFPET();
          Thread.sleep(1000);
          RFP.ClickOnCancelBtnForPaySelectedRFPET();    //---Cancel Button
          RFP.ClickOnPayBtnForPaySelectedRFPET();       //--Pay Button
          Thread.sleep(1000);
          RFP.ClickOnOKBtnForPaySelectedRFPET();
 //-----------------------------------------------------------Reject Selected Function
          RFP.ClickOnRejectSelectedRFPET();
          RFP.ClickOnYesBtnForRejectSelectedRFPET();
          RFP.ClickOnCancelBtnForRejectSelectedRFPET();
 //------------------------------------------------------------Export Function         
          RFP.ClickOnExportBtnRFPET();
		
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Reimbursable_For_Pending_Function Successfully Pass");
	}
	@Test(priority=36)
	public void Reimbursable_For_Paid_Function() throws IOException, InterruptedException
	{
		Reimbursable_For_PAID RFPD = new Reimbursable_For_PAID(driver);
		String TCName="Reimbursable_For_Paid_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		RFPD.ClickOnReimbursableET();
		RFPD.ClickOnPaidET();
		Thread.sleep(5000);
//-----------------------------------------------------------------------Simple Search Function
		RFPD.EnterkOnSearchBoxRFPDET();
		RFPD.ClickOnSearchBtnRFPDET();	
		
//----------------------------------------------------------------------Advanced Search Function
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterOnRFPDET();
		RFPD.SelectFilterOperatorOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxRFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
//-----------------------------------------------------------------------Advanced Date  Function
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterOnRFPDET();
		RFPD.SelectFilterOperatorOnRFPDET();
		RFPD.ClickOnCalenderBoxRFPDET();
		RFPD.SelectMonthRFPDET();
		RFPD.SelectYearRFPDET();
		RFPD.ClickOnFirstDayRFPDET();
		RFPD.ClickOnLastDayRFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		
//--------------------------------------------------------Expense details check with Date Function
		RFPD.ClickOnDateForExpenseDetailsRFPDET();
		Thread.sleep(5000);
		RFPD.ClickOnCloseForExpenseDetailsRFPDET();
//--------------------------------------------------------Expense details check with Project Number Function
		RFPD.ClickOnProjectNoForExpenseDetailsRFPDET();
		Thread.sleep(5000);
		RFPD.ClickOnCloseForExpenseDetailsRFPDET();
//--------------------------------------------------------Expense details check with Project Name Function
		RFPD.ClickOnProjectNameExpenseDetailsRFPDET();
		Thread.sleep(5000);
		RFPD.ClickOnCloseForExpenseDetailsRFPDET();
//------------------------------------------------------------Export Function 
		RFPD.ClickOnExportBtnRFPDET();
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Reimbursable_For_Paid_Function Successfully Pass");
	}
	@Test(priority=37)
	public void Reimbursable_For_All_Function() throws IOException, InterruptedException
	{
		Reimbursable_For_ALL RFA = new Reimbursable_For_ALL(driver);
		String TCName="Reimbursable_For_All_Function";
		CE.ClickOnMenu();
		CE.ClickOnExpenseTracking();
		RFA.ClickOnReimbursableET();
		RFA.ClickOnAllET();
		Thread.sleep(5000);
//--------------------------------------------------------Simple Search Function
		RFA.EnterkOnSearchBoxRFAET();
		RFA.ClickOnSearchBtnRFAET();	
		
//--------------------------------------------------------Advanced Search Function
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		RFA.SelectFilterOnRFAET();
		RFA.SelectFilterOperatorOnRFAET();
		RFA.EnterOnAdvancedEnterBoxRFAET();
		RFA.ClickOnApplyBtnRFAET();
//--------------------------------------------------------Advanced Date Function
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		RFA.SelectFilterOnRFAET();
		RFA.SelectFilterOperatorOnRFAET();
		RFA.ClickOnCalenderBoxRFAET();
		RFA.SelectMonthRFAET();
		RFA.SelectYearRFAET();
		RFA.ClickOnFirstDayRFAET();
		RFA.ClickOnLastDayRFAET();
		RFA.ClickOnApplyBtnRFAET();
//--------------------------------------------------------Expense details check with Date Function
		RFA.ClickOnDateForExpenseDetailsRFAET();
		Thread.sleep(5000);
		RFA.ClickOnCloseForExpenseDetailsRFAET();
//--------------------------------------------------------Expense details check with Project Number Function
		RFA.ClickOnProjectNoForExpenseDetailsRFAET();
		Thread.sleep(5000);
		RFA.ClickOnCloseForExpenseDetailsRFAET();
//--------------------------------------------------------Expense details check with Project Name Function
		RFA.ClickOnProjectNameForExpenseDetailsRFAET();
		Thread.sleep(5000);
		RFA.ClickOnCloseForExpenseDetailsRFAET();
//------------------------------------------------------------Export Function 
		RFA.ClickOnExportBtnRFAET();


		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Reimbursable_For_All_Function Successfully Pass");
	}
	
//	@AfterMethod
//	public void LogoutFunction() throws IOException
//	{
//		
//		Logout_Quoteplan logout = new Logout_Quoteplan(driver);
//		logout.clickadminprofile();
//		logout.clicklogoubtn();
//		
//	}
//	@AfterClass
//	public void BrowserCloseFunction()
//	{
//		driver.close();
//	}

}
