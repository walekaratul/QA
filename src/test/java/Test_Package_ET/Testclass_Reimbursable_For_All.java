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
import POM_Package_ET.Reimbursable_For_ALL;
import POM_Package_ET.Reimbursable_For_PAID;
import Utility_Package_ET.Utility_Class_ET;

public class Testclass_Reimbursable_For_All {
	
	WebDriver driver;
	Create_Expensesheet CE;
	Reimbursable_For_ALL RFA;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
//      driver = new ChromeDriver();
		driver.get("http://localhost/QuotePlan/quotep7_apqengineering/home/login");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@BeforeMethod
	public void LoginFunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_Quoteplan log = new Login_Quoteplan(driver);
		log.EnterUsername(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 8, 1));
		Thread.sleep(1000);
		log.EnterPassword(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 9, 1));
		Thread.sleep(1000);
		log.ClickOnLogin();
		CE = new Create_Expensesheet(driver);
		RFA = new Reimbursable_For_ALL(driver);
		
	}
	@Test(priority=1)
	public void SimpleSearch_Function() throws InterruptedException, IOException
	{
		
		String TCName ="SimpleSearch_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.EnterkOnSearchBoxRFAET();
		RFA.ClickOnSearchBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("SimpleSearch_Function run successfully");
		
	}
	@Test(priority=2)
	public void AdvancedSearchByDate_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByDate_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterOnRFAET();
		RFA.SelectFilterOperatorOnRFAET();
		RFA.ClickOnCalenderBoxRFAET();
		RFA.SelectMonthRFAET();
		RFA.SelectYearRFAET();
		RFA.ClickOnFirstDayRFAET();
		RFA.ClickOnLastDayRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByDate_Function run successfully");
	}
	@Test(priority=3)
	public void AdvancedSearchByUser_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByUser_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterUserOnRFAET();
		RFA.SelectFilterOperatorUserOnRFAET();
		RFA.EnterOnAdvancedEnterBoxUserRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByUser_Function run successfully");
	}
	@Test(priority=4)
	public void AdvancedSearchByProjectNumber_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByProjectNumber_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterPNOOnRFAET();
		RFA.SelectFilterOperatorPNOOnRFAET();
		RFA.EnterOnAdvancedEnterBoxPNOrRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectNumber_Function run successfully");	
	}
	@Test(priority=5)
	public void AdvancedSearchByProjectName_Functuion() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByProjectName_Functuion";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterPNameOnRFAET();
		RFA.SelectFilterOperatorPNameOnRFAET();
		RFA.EnterOnAdvancedEnterBoxPNameRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectName_Functuion run successfully");	
	}
	@Test(priority=6)
	public void AdvancedSearchByReimbursementstatus_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByReimbursementstatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterReimbursementStatusOnRFAET();
		RFA.SelectFilterOperatorReimbursementStatusOnRFAET();
		RFA.SelectReimbursementStatusRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByReimbursementstatus_Function run successfully");	
	}
	@Test(priority=7)
	public void AdvancedSearchByCustomerName_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByCustomerName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFiltercNameOnRFAET();
		RFA.SelectFilterOperatorCNameOnRFAET();
		RFA.EnterOnAdvancedEnterBoxCNameRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByCustomerName_Function run successfully");
	}
	@Test(priority=8)
	public void AdvancedSearchByExpenseType_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByExpenseType_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterExpenseTypeOnRFAET();
		RFA.SelectFilterOperatorExpenseTypeOnRFAET();
		RFA.EnterOnAdvancedEnterBoxExpenseTypeRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpenseType_Function run successfully");
	}
	@Test(priority=9)
	public void AdvancedSearchByExpeneseStatus_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByExpeneseStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAdvnancedSearchBtnRFAET();
		Thread.sleep(1000);
		RFA.SelectFilterExpenseStatusOnRFAET();
		RFA.SelectFilterOperatorExpenseStatusOnRFAET();
		RFA.EnterOnAdvancedEnterBoxExpenseStatusRFAET();
		RFA.ClickOnApplyBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpeneseStatus_Function run successfully");
	}
	@Test(priority=10)
	public void ExpenseDetailsCheckWithDate_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByExpeneseStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnDateForExpenseDetailsRFAET();
		RFA.ClickOnCloseForExpenseDetailsRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpeneseStatus_Function run successfully");
		
	}
	@Test(priority=11)
	public void ExpenseDetailsCheckWithProjectNo_Function() throws InterruptedException, IOException
	{
		String TCName ="ExpenseDetailsCheckWithProjectNo_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnProjectNoForExpenseDetailsRFAET();
		RFA.ClickOnCloseForExpenseDetailsRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ExpenseDetailsCheckWithProjectNo_Function run successfully");
		
	}
	@Test(priority=12)
	public void Export_Function() throws InterruptedException, IOException
	{
		String TCName ="Export_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnExportBtnRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Export_Function run successfully");
		
	}
	@Test(priority=13)
	public void Attachment_Function() throws InterruptedException, IOException
	{
		String TCName ="Attachment_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFA.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFA.ClickOnAllET();
		Thread.sleep(1000);
		RFA.ClickOnAttachmentlinkRFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Attachment_Function run successfully");
		
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
