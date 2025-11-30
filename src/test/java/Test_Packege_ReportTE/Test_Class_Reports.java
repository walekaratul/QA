package Test_Packege_ReportTE;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import POM_PACKAGE_ReportTE.Login_Page;
import POM_PACKAGE_ReportTE.Logout_Page;
import POM_PACKAGE_ReportTE.View_Consolidated_Project_Report;
import POM_PACKAGE_ReportTE.View_Consolidated_User_Report;
import POM_PACKAGE_ReportTE.View_Daily_Timesheet_Report;
import POM_PACKAGE_ReportTE.View_Weekly_Timesheet_Report_ProjectWise;
import POM_PACKAGE_ReportTE.View_Weekly_Timesheet_Report_UserWise;


public class Test_Class_Reports {
	WebDriver driver;
	View_Daily_Timesheet_Report VDTR;
	View_Weekly_Timesheet_Report_ProjectWise WTRPW;
	 View_Weekly_Timesheet_Report_UserWise WTRUW;
	 View_Consolidated_User_Report CUR;
	 View_Consolidated_Project_Report CPR;
	@BeforeClass
	public void Browseropen() throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origin=*");
//	    driver = new ChromeDriver(options);
        driver = new ChromeDriver();
		driver.get("http://localhost/QuotePlan/quotep7_apqengineering/home/login");
		driver.manage().window().maximize();
//		Thread.sleep(5000);
	}
	@BeforeMethod
	public void loginfunctionality() throws InterruptedException 
	{
		Login_Page log = new Login_Page(driver);
		log.enterusername();
	    Thread.sleep(1000);
		log.enterpassword();
		log.clicklogin();
		System.out.println("Log in succesfully");
//		re =new Reports(driver);
	    VDTR = new View_Daily_Timesheet_Report(driver);
	    WTRPW = new View_Weekly_Timesheet_Report_ProjectWise(driver);
	    WTRUW = new View_Weekly_Timesheet_Report_UserWise(driver);
	    CUR = new View_Consolidated_User_Report(driver);
	   CPR = new View_Consolidated_Project_Report(driver);
		
	}
	@Test(priority=1)
	public void ViewDailyTimesheetReport_Simple_Search() throws InterruptedException
	{
		
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.EnterSearchBoxDTR_User();
		VDTR.ClickOnSarchBtnDTR();
		System.out.println("ViewDailyTimesheetReport Pass Successfully");
	}
	@Test(priority=2)
	public void ViewDailyTimesheetReport_Advanced_Search_ByUser() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTR();
		VDTR.SelectLikeFilterDTR();
		VDTR.EnterFilterUserDTR();
		VDTR.ClickOnApplyDTRBtn();	
	}
	@Test(priority=3)
	public void ViewDailyTimesheetReport_Advanced_Search_ByProject_No_Name() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTRPN();
		VDTR.SelectLikeFilterDTRPN();
		VDTR.EnterFilterUserDTRPN();
		VDTR.ClickOnApplyDTRBtn();	
	}
	@Test(priority=4)
	public void ViewDailyTimesheetReport_Advanced_Search_ByProjectCustomer() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
	    VDTR.SelectAddFilterCustomerDTR();
		VDTR.SelectLikeFilterDTRPC();
		VDTR.EnterFilterUserDTRPC();
		VDTR.ClickOnApplyDTRBtn();	
	}
	@Test(priority=5)
	public void ViewDailyTimesheetReport_Advanced_Search_By_Task() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTRTask();
		VDTR.SelectLikeFilterDTRTask();
		VDTR.EnterFilterDTRTask();
		VDTR.ClickOnApplyDTRBtn();
	}
	@Test(priority=6)
	public void ViewDailyTimesheetReport_Advanced_Search_By_LaborCode() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTRLaborCode();
		VDTR.SelectLikeFilterDTRLaborCode();
		VDTR.EnterFilterDTRLaborCode();
		VDTR.ClickOnApplyDTRBtn();
	}
	@Test(priority=7)
	public void ViewDailyTimesheetReport_Advanced_Search_By_Status() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTRStatus();
		VDTR.SelectLikeFilterDTRStatus();
		VDTR.SelectDTRstatus();
		VDTR.ClickOnApplyDTRBtn();
	}
	@Test(priority=8)
	public void ViewDailyTimesheetReport_Advanced_Search_By_Billable() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTRBillable();
		VDTR.SelectDTRBillable();
		VDTR.ClickOnApplyDTRBtn();
	}
	@Test(priority=9)
	public void ViewDailyTimesheetReport_Advanced_Search_By_Comments() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		VDTR.SelectAddFilterDTRComments();
		VDTR.SelectLikeFilterDTRComments();
		VDTR.EnterFilterDTRComments();
		VDTR.ClickOnApplyDTRBtn();
	}
	@Test(priority=10)
	public void ViewDailyTimesheetReport_Advanced_Search_By_Combine() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		
		VDTR.SelectAddFilterDTRReg();
		VDTR.SelectLikeFilterDTRReg();
		VDTR.EnterFilterDTRReg();
		Thread.sleep(2000);
		VDTR.SelectAddFilterDTROT();
		VDTR.SelectLikeFilterDTROT();
		VDTR.EnterFilterDTROT();
		Thread.sleep(2000);
		VDTR.SelectAddFilterDTRDT();
		VDTR.SelectLikeFilterDTRDT();
		VDTR.EnterFilterDTRDT();
		Thread.sleep(2000);
		VDTR.SelectAddFilterDTRTT();
		VDTR.SelectLikeFilterDTRTT();
		VDTR.EnterFilterDTRTT();
		VDTR.ClickOnApplyDTRBtn();
	}
	@Test(priority=11)
	public void ViewDailyTimesheetReport_Advanced_Search_Date() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(1000);
		VDTR.ClickAdvancedSearchBtnDTR();
		Thread.sleep(1000);
		VDTR.SelectAddFilterDTRDate();
		VDTR.ClickonAdvancedDateDTR();
		VDTR.SelectMonthDTR();
		VDTR.SelectYearWTRPW();
		VDTR.ClickonStartDayDTR();
		VDTR.ClickonLastDayDTR();
		VDTR.ClickOnApplyDTRBtn();
	}
	
	@Test(priority=12)
	public void ViewDailyTimesheetReport_Export_Functions() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(3000);
		VDTR.ClickonExportDTR();
		Thread.sleep(1000);
		VDTR.ClickonDownloadRecordsDTR();
		Thread.sleep(7000);
	}
	@Test(priority=13)
	public void ViewDailyTimesheetReport_LoadMore_Functions() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		VDTR.ClickOnViewDailyTimesheetReport();
		Thread.sleep(3000);
		VDTR.ClickonLoadMoreDTR();
		
	}
	@Test(priority=14)
	public void ViewWeeklyTimesheetReport_Simple_Search() throws InterruptedException
	{
		
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(1000);
		WTRPW.EnterSearchBoxWTRPW_User();
		WTRPW.ClickOnSarchBtnWTRPW();
		System.out.println("ViewWeeklyTimesheetReport Pass Successfully");
	}
	@Test(priority=15)
	public void ViewWeeklyTimesheetReport_Advanced_Search_Date() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(1000);
		WTRPW.ClickonAdvancedSearchBtnWTRPW();
		WTRPW.SelectAddFilterWTRPW();
        WTRPW.ClickonAdvancedDateWTRPW();
        WTRPW.SelectMonthWTRPW();
        WTRPW.SelectYearWTRPW();
        WTRPW.ClickonStartDayWTRPW();
        WTRPW.ClickonLastDayWTRPW();
        WTRPW.ClickOnApplyWTRPW();
	
	}
	@Test(priority=16)
	public void ViewWeeklyTimesheetReport_Advanced_Search_ProjectNameNo() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(1000);
		WTRPW.ClickonAdvancedSearchBtnWTRPW();
		WTRPW.SelectAddFilterProjectNameWTRPW();
		WTRPW.SelectLikeFilteProjectNameWTRPW();
		WTRPW.EnterFilterProjectNameWTRPW();
        WTRPW.ClickOnApplyWTRPW();
	
	}
	@Test(priority=17)
	public void ViewWeeklyTimesheetReport_Advanced_Search_Customer() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(1000);
		WTRPW.ClickonAdvancedSearchBtnWTRPW();
		WTRPW.SelectAddFilterCustomerWTRPW();
		WTRPW.SelectLikeFilteCustomerWTRPW();
		WTRPW.EnterCustomerWTRPW();
        WTRPW.ClickOnApplyWTRPW();
	
	}
	@Test(priority=17)
	public void ViewWeeklyTimesheetReport_Advanced_Search_User() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(1000);
		WTRPW.ClickonAdvancedSearchBtnWTRPW();
		WTRPW.SelectAddFilterUserWTRPW();
		WTRPW.SelectLikeFilteUserWTRPW();
		WTRPW.EnterUserWTRPW();
       WTRPW.ClickOnApplyWTRPW();
	
	}
	@Test(priority=17)
	public void ViewWeeklyTimesheetReport_Advanced_Search_Status() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(1000);
		WTRPW.ClickonAdvancedSearchBtnWTRPW();
		WTRPW.SelectAddFilterStatusWTRPW();
		WTRPW.SelectWTRPWstatus();
        WTRPW.ClickOnApplyWTRPW();
	
	}
	@Test(priority=18)
	public void ViewWeeklyTimesheetReport_Export_Functions() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(5000);	
        WTRPW.ClickonExportWTRPW();
        WTRPW.ClickonDownloadRecordsWTRPW();
        Thread.sleep(5000);	
	
	}
	@Test(priority=19)
	public void ViewWeeklyTimesheetReport_ShowHideRecords() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(5000);	
        WTRPW.ClickonShowHideAllRecordsWTRPW();
        
	}
	@Test(priority=19)
	public void ViewWeeklyTimesheetReport_LoadMore() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRPW.ClickOnWeeklyTimesheetReportPW();
		Thread.sleep(5000);	
        WTRPW.ClickonLoadMoreWTRPW();
        
	}
	@Test(priority=20)
	public void ViewWeeklyTimesheetReportUW_Simple_Search() throws InterruptedException
	{
		
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.EnterSearchBoxWTRUW_User();
		WTRUW.ClickOnSarchBtnWTRUW();
		System.out.println("ViewWeeklyTimesheetReport Pass Successfully");
	}
	@Test(priority=21)
	public void ViewWeeklyTimesheetReportUW_Advanced_Search_Date() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonAdvancedSearchBtnWTRPW();
		WTRUW.SelectAddFilterWTRUW();
		WTRUW.ClickonAdvancedDateWTRUW();
		WTRUW.SelectMonthWTRUW();
		WTRUW.SelectYearWTRUW();
		WTRUW.ClickonStartDayWTRUW();
		WTRUW.ClickonLastDayWTRUW();
		WTRUW.ClickOnApplyWTRUW();
	}
	@Test(priority=22)
	public void ViewWeeklyTimesheetReportUW_Advanced_Search_User() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonAdvancedSearchBtnWTRPW();
		WTRUW.SelectAddFilterUserWTRUW();
		WTRUW.SelectLikeFilteUserWTRPW();
		WTRUW.EnterUserWTRUW();
		WTRUW.ClickOnApplyWTRUW();
	
	}
	@Test(priority=23)
	public void ViewWeeklyTimesheetReportUW_Advanced_Search_ProjectNameNo() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonAdvancedSearchBtnWTRPW();
		WTRUW.SelectAddFilterProjectNameWTRUW();
		WTRUW.SelectLikeFilteProjectNameWTRUW();
		WTRUW.EnterFilterProjectNameWTRUW();
		WTRUW.ClickOnApplyWTRUW();
	
	}
	@Test(priority=24)
	public void ViewWeeklyTimesheetReportUW_Advanced_Search_Customer() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonAdvancedSearchBtnWTRPW();
	    WTRUW.SelectAddFilterCustomerWTRUW();
	    WTRUW.SelectLikeFilteCustomerWTRUW();
	    WTRUW.EnterCustomerWTRUW();
		WTRUW.ClickOnApplyWTRUW();
	
	}
	@Test(priority=25)
	public void ViewWeeklyTimesheetReportUW_Advanced_Search_Status() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonAdvancedSearchBtnWTRPW();
	    WTRUW.SelectAddFilterStatusWTRUW();
	    WTRUW.SelectWTRUWstatus();
		WTRUW.ClickOnApplyWTRUW();
	
	}
	@Test(priority=26)
	public void ViewWeeklyTimesheetReportUW_Export_Function() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonExportWTRPW();
		Thread.sleep(2000);
//		WTRUW.ClickonDownloadRecordsWTRUW();
		WTRUW.ClickonDownloadRecords1WTRUW();	
	}
	@Test(priority=26)
	public void ViewWeeklyTimesheetReportUW_HideShowRecords_Function() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonShowHideAllRecordsWTRUW();
	
	}
	@Test(priority=27)
	public void ViewWeeklyTimesheetReportUW_LoadMore_Function() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		WTRUW.ClickOnWeeklyTimesheetReportUW();
		Thread.sleep(5000);
		WTRUW.ClickonLoadMoreWTRUW();
	
	}
	@Test(priority=28)
	public void ViewConsolidatedUserReport_Simple_Search() throws InterruptedException
	{
		
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.EnterSearchBoxCUR_User();
		CUR.ClickOnSearchBtnCUR();
		Thread.sleep(1000);
		CUR.ClickonShowHideAllRecordsCUR();
		System.out.println("ViewConsilidatedUserReport Pass Successfully");
	}
	@Test(priority=29)
	public void ConsolidatedUserReport_Advanced_Search_Date() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.ClickonAdvancedSearchBtnCUR();
		CUR.SelectAddFilterCUR();
		CUR.ClickonAdvancedDateCUR();
		CUR.SelectMonthCUR();
		CUR.SelectYearCUR();
		CUR.ClickonStartDayCUR();
		CUR.ClickonLastDayCUR();
		CUR.ClickOnApplyCUR();	
		Thread.sleep(3000);
		CUR.ClickonShowHideAllRecordsCUR();
		CUR.ClickonExportCUR();
	}
	@Test(priority=30)
	public void ConsolidatedUserReport_Advanced_Search_User() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.ClickonAdvancedSearchBtnCUR();
		CUR.SelectAddFilterUserCUR();
		CUR.SelectLikeFilteUserCUR();
		CUR.EnterUserCUR();
		CUR.ClickOnApplyCUR();	
		Thread.sleep(3000);
		CUR.ClickonShowHideAllRecordsCUR();
	
	}
	@Test(priority=30)
	public void ConsolidatedUserReport_Advanced_Search_Department() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.ClickonAdvancedSearchBtnCUR();
		CUR.SelectAddFilterDepartmentCUR();
		CUR.SelectLikeFilteDepartmentCUR();
		CUR.EnterDepartmentCUR();
		CUR.ClickOnApplyCUR();	
		Thread.sleep(3000);
		CUR.ClickonShowHideAllRecordsCUR();
	
	}
	@Test(priority=31)
	public void ConsolidatedUserReport_Advanced_Search_UserStatus() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.ClickonAdvancedSearchBtnCUR();
		CUR.SelectAddFilterStatusCUR();
		CUR.SelectLikeFilteStatusCUR();
		CUR.EnterStatusCUR();
		CUR.ClickOnApplyCUR();	
		Thread.sleep(3000);
		CUR.ClickonShowHideAllRecordsCUR();
	
	}
	@Test(priority=32)
	public void ConsolidatedUserReport_Export_Functions() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
	    CUR.ClickonExportCUR();
		Thread.sleep(10000);
	}
	@Test(priority=33)
	public void ConsolidatedUserReport_HideShowAllRecords_Functions() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.ClickonShowHideAllRecordsCUR();
		Thread.sleep(5000);
	}
	@Test(priority=33)
	public void ConsolidatedUserReport_LoadMore_Functions() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CUR.ClickOnViewConsolidated_UserReport();
		Thread.sleep(5000);
		CUR.ClickonLoadMoreCUR();
		Thread.sleep(5000);
	}
	@Test(priority=34)
	public void ViewConsolidatedProjectReport_Simple_Search() throws InterruptedException
	{
		
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(8000);
		CPR.EnterSearchBoxCPR();
		CPR.ClickOnSearchBtnCPR();
		Thread.sleep(5000);
		System.out.println("ViewConsilidatedProjectReport Pass Successfully");
	}
	@Test(priority=35)
	public void ConsolidatedUserReport_Advanced_Search_ProjectNo() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(8000);
		CPR.ClickonAdvancedSearchBtnCPR();
		CPR.SelectAddFilterUserCPR();
		CPR.SelectLikeFilteProjectNoCPR();
		CPR.EnterProjectNoCPR();
		CPR.ClickOnApplyCPR();
		Thread.sleep(5000);
	}
	@Test(priority=36)
	public void ConsolidatedUserReport_Advanced_Search_ProjectName() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(8000);
		CPR.ClickonAdvancedSearchBtnCPR();
	    CPR.SelectAddFilterProjectNameCPR();
	    CPR.SelectLikeFilteProjectNameCPR();
	    CPR.EnterProjectNameCPR();
		CPR.ClickOnApplyCPR();
		Thread.sleep(5000);
	}
	@Test(priority=37)
	public void ConsolidatedUserReport_Advanced_Search_ProjectStatus() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(8000);
		CPR.ClickonAdvancedSearchBtnCPR();
	    CPR.SelectAddFilterProjectStatusCPR();
	    CPR.SelectLikeFilteProjectStatusCPR();
	    CPR.EnterProjectStatusCPR();
		CPR.ClickOnApplyCPR();
		Thread.sleep(5000);
	}
	@Test(priority=38)
	public void ConsolidatedUserReport_Advanced_Search_CustomerName() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(8000);
		CPR.ClickonAdvancedSearchBtnCPR();
	    CPR.SelectAddFilterCustomerNameCPR();
	    CPR.SelectLikeFilteCustomerNameCPR();
	    CPR.EnterCustomerNameCPR();
		CPR.ClickOnApplyCPR();
		Thread.sleep(5000);
	}
	@Test(priority=39)
	public void ConsolidatedUserReport_Advanced_Search_ProjectManager() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(5000);
		CPR.ClickonAdvancedSearchBtnCPR();
	    CPR.SelectAddFilterProjectManagerCPR();
	    CPR.EnterProjectManagerCPR();
	    Thread.sleep(2000);
	    CPR.ClickOnProjectManagerNameCPR();
		CPR.ClickOnApplyCPR();
		Thread.sleep(5000);
	}
	@Test(priority=40)
	public void ConsolidatedUserReport_ExportFunction() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(15000);
		CPR.ClickonExportCPR();
		Thread.sleep(2000);
		CPR.ClickonDownloadRecordsCPR();
		Thread.sleep(5000);
	}
	@Test(priority=41)
	public void ConsolidatedProjectReport_LoadMoreFunction() throws InterruptedException
	{
		VDTR.clickmenubtn();
		Thread.sleep(1000);
		VDTR.clickreports();
		Thread.sleep(1000);
		VDTR.ClickOnTimeSheetReport();
		Thread.sleep(1000);
		CPR.ClickOnViewConsolidated_ProjectReport();
		Thread.sleep(15000);
		CPR.ClickonLoadMoreCPR();
		Thread.sleep(2000);

	}
	@AfterMethod
	public void logoutfunctionality() throws InterruptedException
	{
		
		Thread.sleep(5000);
		Logout_Page lp = new Logout_Page(driver);
		lp.clickadminprofile();
		Thread.sleep(2000);
		lp.clicklogoubtn();
		System.out.println("log out succesfully");
	}
	
	@AfterClass
	public void logoutfunction()
	{
		driver.close();
	}

}
