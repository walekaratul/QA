package Test_Packege_ReportTE;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_PACKAGE_ReportTE.Login_Page;
import POM_PACKAGE_ReportTE.Logout_Page;
import POM_PACKAGE_ReportTE.View_Daily_Expense_Report;
import POM_PACKAGE_ReportTE.View_Daily_Timesheet_Report;
import POM_PACKAGE_ReportTE.View_Weekly_Expense_Report_ProjectWise;
import POM_PACKAGE_ReportTE.View_Weekly_Expense_Report_UserWise;
import Utility_Package_ReportTE.Utility_Class;

public class Test_Class_Reports_Expensesheet {
	
	
	WebDriver driver;
	View_Daily_Timesheet_Report Re;
	View_Daily_Expense_Report ER;
	View_Weekly_Expense_Report_ProjectWise ERPW;
	View_Weekly_Expense_Report_UserWise ERUW ;
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
	    Re = new View_Daily_Timesheet_Report(driver);
	    ER = new View_Daily_Expense_Report(driver);
	    ERPW = new View_Weekly_Expense_Report_ProjectWise(driver);
	    ERUW = new View_Weekly_Expense_Report_UserWise(driver);
	    
	
	}
	@Test(priority=1)
	public void ViewDailyExpensesReport_SimpleSearch() throws InterruptedException, IOException
	{
		String TCName ="ViewDailyExpensesReport_SimpleSearch";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.EnterSearchBoxER(Utility_Class.GetExcelsheetData("DATA", 2, 2));
	    Thread.sleep(1000);
	    ER.ClickOnSarchBtnER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
		
		System.out.println("ViewDailyExpensesheetReport Functions Successfully Passed");
	}
	@Test(priority=2)
	public void ViewDailyExpenseReport_Advanced_Search_ByDate() throws InterruptedException, IOException
	{
		String TCName ="ViewDailyExpenseReport_Advanced_Search_ByDate";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterER();
	    ER.ClickonAdvancedDateER();
	    ER.SelectMonthWTRPW(Utility_Class.GetExcelsheetData("DATA", 3, 2));
	    ER.SelectYearER();
	    ER.ClickonStartDayER();
	    ER.ClickonLastDayER();
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=3)
	public void ViewDailyExpenseReport_Advanced_Search_ByUser() throws InterruptedException, IOException
	{
		String TCName ="ViewDailyExpenseReport_Advanced_Search_ByUser";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterUserER(Utility_Class.GetExcelsheetData("DATA", 8, 2));
	    ER.SelectLikeFilteUserER();
	    ER.EnterUserER(Utility_Class.GetExcelsheetData("DATA", 9, 2));
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=4)
	public void ViewDailyExpenseReport_Advanced_Search_ByProjectName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDailyExpenseReport_Advanced_Search_ByProjectName";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterProjectNER(Utility_Class.GetExcelsheetData("DATA", 11, 2));
	    ER.SelectLikeFilteProjectNER();
	    ER.EnterProjectNER(Utility_Class.GetExcelsheetData("DATA", 12, 2));
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=5)
	public void ViewDailyExpenseReport_Advanced_Search_ByCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDailyExpenseReport_Advanced_Search_ByCustomer";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterCustomerER(Utility_Class.GetExcelsheetData("DATA", 15, 2));
	    ER.SelectLikeFilteCustomerER();
	    ER.EnterCustomerER(Utility_Class.GetExcelsheetData("DATA", 16, 2));
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=6)
	public void ViewDailyExpenseReport_Advanced_Search_ByExpenseType() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDailyExpenseReport_Advanced_Search_ByExpenseType";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterExpenseTypeER(Utility_Class.GetExcelsheetData("DATA", 19, 2));
	    ER.SelectLikeFilteExpenseTypeER();
	    ER.EnterExpenseTypeER(Utility_Class.GetExcelsheetData("DATA", 20, 2));
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=7)
	public void ViewDailyExpenseReport_Advanced_Search_ByAmount() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDailyExpenseReport_Advanced_Search_ByAmount";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterAmountTypeER();
	    ER.SelectLikeFilteAmountER();
	    Thread.sleep(1000);
	    ER.EnterAmountER();
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=8)
	public void ViewDaiyExpenseReport_Advanced_Search_ByComments() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDaiyExpenseReport_Advanced_Search_ByComments";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterCommentsER(Utility_Class.GetExcelsheetData("DATA", 23, 2));
	    ER.SelectLikeFilteCommentsER();
	    ER.EnterCommentsER(Utility_Class.GetExcelsheetData("DATA", 24, 2));
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=9)
	public void ViewDaiyExpenseReport_Advanced_Search_ByStatus() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDaiyExpenseReport_Advanced_Search_ByStatus";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAdvancedSearchBtnER();
	    ER.SelectAddFilterStatusER();
	    ER.SelectWTRPWstatus();
	    ER.ClickOnApplyER();
	    Thread.sleep(1000);
	    ER.ClickonLoadMoreER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=10)
	public void ViewDaiyExpenseReport_Export_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDaiyExpenseReport_Export_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonExportER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=11)
	public void ViewDaiyExpenseReport_LoadMore_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDaiyExpenseReport_LoadMore_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonLoadMoreER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=12)
	public void ViewDaiyExpenseReport_Attachment_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewDaiyExpenseReport_Attachment_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ER.ClickOnVDExpenseReport();
	    Thread.sleep(1000);
	    ER.ClickonAttachmentER();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=13)
	public void ViewWeeklyExpensesReportPW_SimpleSearch() throws InterruptedException, IOException
	{
		String TCName ="ViewWeeklyExpensesReportPW_SimpleSearch";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(1000);
	    ERPW.EnterSearchBoxERPW(Utility_Class.GetExcelsheetData("DATA", 28, 2));
	    Thread.sleep(1000);
	    ERPW.ClickOnSarchBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
		
		System.out.println("ViewWeeklyExpensesReportPW_SimpleSearch Functions Successfully Passed");
	}
	@Test(priority=14)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByDate() throws InterruptedException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Advanced_Search_ByDate";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(1000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
	    ERPW.SelectAddFilterERPW();
	    ERPW.ClickonAdvancedDateERPW();
	    ERPW.SelectMonthERPW(Utility_Class.GetExcelsheetData("DATA", 33, 2));
	    ERPW.SelectYearERPW();
	    ERPW.ClickonStartDayERPW();
	    ERPW.ClickonLastDayERPW();
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=15)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByUser() throws InterruptedException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Advanced_Search_ByUser";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(1000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
	    ERPW.SelectAddFilterUserERPW(Utility_Class.GetExcelsheetData("DATA", 35, 2));
	    ERPW.SelectLikeFilteUserERPW();
	    ERPW.EnterUserERPW(Utility_Class.GetExcelsheetData("DATA", 36, 2));
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=16)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByProjectName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Advanced_Search_ByProjectName";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(1000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
	    ERPW.SelectAddFilterProjectNERPW(Utility_Class.GetExcelsheetData("DATA", 38, 2));
	    ERPW.SelectLikeFilteProjectNERPW();
	    ERPW.EnterProjectNERPW(Utility_Class.GetExcelsheetData("DATA", 39, 2));
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=17)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReport_Advanced_Search_ByCustomer";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(1000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
	    ERPW.SelectAddFilterCustomerERPW(Utility_Class.GetExcelsheetData("DATA", 41, 2));
	    ERPW.SelectLikeFilteCustomerERPW();
	    ERPW.EnterCustomerERPW(Utility_Class.GetExcelsheetData("DATA", 42, 2));
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=18)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByExpenseType() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Advanced_Search_ByExpenseType";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(3000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
        ERPW.SelectAddFilterExpenseTypeERPW(Utility_Class.GetExcelsheetData("DATA", 44, 2));
        ERPW.SelectLikeFilteExpenseTypeERPW();
        ERPW.EnterExpenseTypeERPW(Utility_Class.GetExcelsheetData("DATA", 45, 2));
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=19)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByComments() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Advanced_Search_ByComments";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(3000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
	    ERPW.SelectAddFilterCommentsERPW(Utility_Class.GetExcelsheetData("DATA", 47, 2));
	    ERPW.SelectLikeFilteCommentsERPW();
	    ERPW.EnterCommentsERPW(Utility_Class.GetExcelsheetData("DATA", 48, 2));
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=20)
	public void ViewWeeklyExpenseReportPW_Advanced_Search_ByStatus() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Advanced_Search_ByStatus";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(1000);
	    ERPW.ClickonAdvancedSearchBtnERPW();
	    ERPW.SelectAddFilterStatusERPW();
	    ERPW.SelectWERPWstatus();
	    ERPW.ClickOnApplyERPW();
	    Thread.sleep(1000);
	    ERPW.ClickOnHideShowBtnERPW();
	    Thread.sleep(1000);
	    ERPW.ClickonLoadMoreERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=21)
	public void ViewWeeklyExpenseReportPW_LoadMore_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_LoadMore_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(5000);
	    ERPW.ClickonLoadMoreERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=22)
	public void ViewWeeklyExpenseReportPW_Export_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportPW_Export_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERPW.ClickOnExpenseReportPW();
	    Thread.sleep(2000);
	    ERPW.ClickonExportERPW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=23)
	public void ViewWeeklyExpensesReportUW_SimpleSearch() throws InterruptedException, IOException
	{
		String TCName ="ViewWeeklyExpensesReportUW_SimpleSearch";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.EnterSearchBoxERUW(Utility_Class.GetExcelsheetData("DATA", 51, 2));
	    Thread.sleep(1000);
	    ERUW.ClickOnSarchBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
		
		System.out.println("ViewWeeklyExpensesReportPW_SimpleSearch Functions Successfully Passed");
	}
	@Test(priority=24)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByDate() throws InterruptedException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByDate";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    ERUW.SelectAddFilterERUW();
	    ERUW.ClickonAdvancedDateERUW();
	    ERUW.SelectMonthERUW(Utility_Class.GetExcelsheetData("DATA", 54, 2));
	    ERUW.SelectYearERUW();
	    ERUW.ClickonStartDayERUW();
	    ERUW.ClickonLastDayERUW();
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=25)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByUser() throws InterruptedException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByUser";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    Thread.sleep(1000);
	    ERUW.SelectAddFilterUserERUW(Utility_Class.GetExcelsheetData("DATA", 56, 2));
	    ERUW.SelectLikeFilteUserERUW();
	    ERUW.EnterUserERUW(Utility_Class.GetExcelsheetData("DATA", 57, 2));
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=26)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByProjectName() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByProjectName";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    Thread.sleep(1000);
	    ERUW.SelectAddFilterProjectNERUW(Utility_Class.GetExcelsheetData("DATA", 59, 2));
	    ERUW.SelectLikeFilteProjectNERUW();
	    ERUW.EnterProjectNERUW(Utility_Class.GetExcelsheetData("DATA", 60, 2));
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=27)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByCustomer";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    Thread.sleep(1000);
	    ERUW.SelectAddFilterCustomerERUW(Utility_Class.GetExcelsheetData("DATA", 62, 2));
	    ERUW.SelectLikeFilteCustomerERUW();
	    ERUW.EnterCustomerERUW(Utility_Class.GetExcelsheetData("DATA", 63, 2));
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=28)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByExpenseType() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByExpenseType";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    Thread.sleep(1000);
	    ERUW.SelectAddFilterExpenseTypeERUW(Utility_Class.GetExcelsheetData("DATA", 65, 2));
	    ERUW.SelectLikeFilteExpenseTypeERUW();
	    ERUW.EnterExpenseTypeERUW(Utility_Class.GetExcelsheetData("DATA", 66, 2));
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=29)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByComments() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByComments";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    Thread.sleep(1000);
	    ERUW.SelectAddFilterCommentsERUW(Utility_Class.GetExcelsheetData("DATA", 68, 2));
	    ERUW.SelectLikeFilteCommentsERUW();
	    ERUW.EnterCommentsERUW(Utility_Class.GetExcelsheetData("DATA", 69, 2));
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=30)
	public void ViewWeeklyExpenseReportUW_Advanced_Search_ByStatus() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Advanced_Search_ByStatus";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(1000);
	    ERUW.ClickonAdvancedSearchBtnERUW();
	    Thread.sleep(1000);
	    ERUW.SelectAddFilterStatusERUW();
	    ERUW.SelectWERUWstatus();
	    ERUW.ClickOnApplyERUW();
	    Thread.sleep(1000);
	    ERUW.ClickOnHideShowBtnERUW();
	    Thread.sleep(1000);
	    ERUW.ClickonLoadMoreERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=31)
	public void ViewWeeklyExpenseReportUW_LoadMore_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_LoadMore_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(5000);
	    ERUW.ClickonLoadMoreERUW();
	    Thread.sleep(1000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
	@Test(priority=32)
	public void ViewWeeklyExpenseReportUW_Export_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName ="ViewWeeklyExpenseReportUW_Export_Function";
		Re.clickmenubtn();
		Thread.sleep(1000);
		Re.clickreports();
		Thread.sleep(1000);
		ER.ClickOnExpenseReport();
	    ERUW.ClickOnExpenseReportUW();
	    Thread.sleep(3000);
	    ERUW.ClickonExportERUW();
	    Thread.sleep(5000);
	    Utility_Class.TakeScreenShotMethod(driver, TCName);
	}
//	@Test(priority=33)
//	public void PO_Reports_Function() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		String TCName ="PO_Reports_Function";
//		Re.clickmenubtn();
//		Thread.sleep(1000);
//		Re.clickreports();
//		Thread.sleep(1000);
//		ERUW.ClickonPOR();
//	    ERUW.ClickonPOR1();
//	    Thread.sleep(5000);
//	  //  ERUW.ClickonPOSB();
//	    Thread.sleep(1000);
//	    ERUW.ClickonPOSBtn();
//	    Thread.sleep(5000);
//	    Utility_Class.TakeScreenShotMethod(driver, TCName);
//	}
	
	
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
