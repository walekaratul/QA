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
import POM_Package_ET.Reimbursable_For_PAID;
import Utility_Package_ET.Utility_Class_ET;

public class Testclass_Reimbursable_For_Paid {
	WebDriver driver;
	Create_Expensesheet CE;
	Reimbursable_For_PAID RFPD;
	
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
		RFPD = new Reimbursable_For_PAID(driver);
	}
	@Test(priority=1)
	public void SimpleSearch_Function() throws InterruptedException, IOException
	{
		
		String TCName ="SimpleSearch_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.EnterkOnSearchBoxRFPDET();
		RFPD.ClickOnSearchBtnRFPDET();	
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
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterOnRFPDET();
		RFPD.SelectFilterOperatorOnRFPDET();
		RFPD.ClickOnCalenderBoxRFPDET();
		RFPD.SelectMonthRFPDET();
		RFPD.SelectYearRFPDET();
		RFPD.ClickOnFirstDayRFPDET();
		RFPD.ClickOnLastDayRFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByDate_Function run successfully");
			
	}
	@Test(priority=3)
	public void AdvancedSearchByUser_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByDate_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterUserOnRFPDET();
		RFPD.SelectFilterOperatorUserOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxUserRFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByDate_Function run successfully");
		
	}
	@Test(priority=4)
	public void AdvancedSearcchByProjectNumber_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearcchByProjectNumber_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterPNOOnRFPDET();
		RFPD.SelectFilterOperatorPNOOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxPNOPNORFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearcchByProjectNumber_Function run successfully");
	}
	@Test(priority=5)
	public void AdvancedSearchByProjectName_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByProjectName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterPNameOnRFPDET();
		RFPD.SelectFilterOperatorPNameOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxPNamePNORFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectName_Function run successfully");			
	}
	@Test(priority=6)
	public void AdvancedSearchByReimbursementStatus_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByReimbursementStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterReimbursementStatusOnRFPDET();
		RFPD.SelectFilterOperatorReimbursementStatusOnRFPDET();
		RFPD.SelectReimbursementStatusPAID();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByReimbursementStatus_Function run successfully");	
		
	}
	@Test(priority=7)
	public void AdvancedSearchByCustomerName_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByCustomerName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterCNameOnRFPDET();
		RFPD.SelectFilterOperatorCNameOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxCNamePNORFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
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
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterExpenseTypeOnRFPDET();
		RFPD.SelectFilterOperatorExpenseTypeOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxExpenseTypePNORFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpenseType_Function run successfully");
	}
	@Test(priority=9)
	public void AdvancedSearchByExpenseStatus_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByExpenseStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAdvnancedSearchBtnRFPDET();
		RFPD.SelectFilterExpenseStatusOnRFPDET();
		RFPD.SelectFilterOperatorExpenseStatusOnRFPDET();
		RFPD.EnterOnAdvancedEnterBoxExpenseStatusPNORFPDET();
		RFPD.ClickOnApplyBtnRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpenseStatus_Function run successfully");
	}
	@Test(priority=10)
	public void ExpenseDetailsCheck_With_Date_Function() throws InterruptedException, IOException
	{
		String TCName ="ExpenseDetailsCheck_With_Date_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnDateForExpenseDetailsRFPDET();
		RFPD.ClickOnCloseForExpenseDetailsRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ExpenseDetailsCheck_With_Date_Function run successfully");
		
	}
	@Test(priority=11)
	public void ExpenseDetailsCheck_With_Project_Name_Function() throws InterruptedException, IOException
	{
		String TCName ="ExpenseDetailsCheck_With_Project_Name_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnProjectNoForExpenseDetailsRFPDET();
		RFPD.ClickOnCloseForExpenseDetailsRFPDET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ExpenseDetailsCheck_With_Project_Name_Function run successfully");
	}
	@Test(priority=12)
	public void Export_Function() throws InterruptedException, IOException
	{
		String TCName ="Export_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnExportBtnRFPDET();
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
		RFPD.ClickOnReimbursableET();
		Thread.sleep(1000);
		RFPD.ClickOnPaidET();
		Thread.sleep(3000);
		RFPD.ClickOnAttachmentlinkRFPDET();
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
