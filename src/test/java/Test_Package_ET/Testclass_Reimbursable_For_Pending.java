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
import POM_Package_ET.Reimbursable_For_PENDING;
import Utility_Package_ET.Utility_Class_ET;

public class Testclass_Reimbursable_For_Pending {
	WebDriver driver;
	Create_Expensesheet CE;
	Reimbursable_For_PENDING RFP;
	
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
	    RFP = new Reimbursable_For_PENDING(driver);
	}
	@Test(priority=1)
	public void SimpleSearch_Function() throws InterruptedException, IOException
	{
		String TCName ="SimpleSearch_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.EnterkOnSearchBoxRFPET();
		RFP.ClickOnSearchBtnRFPET();
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
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		RFP.SelectFilterOnRFPET();
		RFP.SelectFilterOperatorOnRFPET();
		RFP.ClickOnCalenderBoxRFPET();
		RFP.SelectMonthRFPET();
		RFP.SelectYearRFPET();
		RFP.ClickOnFirstDayRFPET();
		RFP.ClickOnLastDayRFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByDate_Function run successfully");
	}
	@Test(priority=2)
	public void AdvancedSearchByUser_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByUser_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		Thread.sleep(1000);
		RFP.SelectFilterUserOnRFPET();
		RFP.SelectFilterOperatoUserrOnRFPET();
		RFP.EnterOnAdvancedEnterBoxUserRFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByUser_Function run successfully");
	}
	@Test(priority=3)
	public void AdvancedSearchByProjectNumber_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByProjectNumber_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		Thread.sleep(1000);
		RFP.SelectFilterPNOOnRFPET();
		RFP.SelectFilterOperatoPNOOnRFPET();
		RFP.EnterOnAdvancedEnterBoxPNORFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectNumber_Function run successfully");
	}
	@Test(priority=4)
	public void AdvancedSearchByProjectName_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByProjectName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		Thread.sleep(1000);
		RFP.SelectFilterPNameOnRFPET();
		RFP.SelectFilterOperatoPNameOnRFPET();
		RFP.EnterOnAdvancedEnterBoxPNameRFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectName_Function run successfully");
	}
	@Test(priority=5)
	public void AdvancedSearchByCustomerName_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByCustomerName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		Thread.sleep(1000);
		RFP.SelectFilterCustomerOnRFPET();
		RFP.SelectFilterOperatoCustomerOnRFPET();
		RFP.EnterOnAdvancedEnterBoxCustomerRFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByCustomerName_Function run successfully");
	}
	@Test(priority=6)
	public void AdvancedSearchByExpenseType_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByExpenseType_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		Thread.sleep(1000);
		RFP.SelectFilterExpenseTypeOnRFPET();
		RFP.SelectFilterOperatorExpenseTypeOnRFPET();
		RFP.EnterOnAdvancedEnterBoxExpenseTypeRFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpenseType_Function run successfully");
	}
	@Test(priority=7)
	public void AdvancedSearchByExpenseStatus_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByExpenseStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAdvnancedSearchBtnRFPET();
		Thread.sleep(1000);
		RFP.SelectFilterExpenseStatusOnRFPET();
		RFP.SelectFilterOperatorExpenseStatusOnRFPET();
		RFP.EnterOnAdvancedEnterBoxExpenseStatusRFPET();
		RFP.ClickOnApplyBtnRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByExpenseStatus_Function run successfully");
	}
	@Test(priority=9)
	public void ViewExpenseDetailsByClickonDate_Function() throws InterruptedException, IOException
	{
		String TCName ="ViewExpenseDetailsByClickonDate_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnDateForExpenseDetailsRFPET();
		Thread.sleep(2000);
		RFP.ClickOnCloseForExpenseDetailsRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ViewExpenseDetailsByClickonDate_Function run successfully");
	}
	@Test(priority=10)
	public void ViewExpenseDetailsByClickonProjectName_No_Function() throws InterruptedException, IOException
	{
		String TCName ="ViewExpenseDetailsByClickonProjectName_No_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnProjectNoForExpenseDetailsRFPET();
		Thread.sleep(2000);
		RFP.ClickOnCloseForExpenseDetailsRFPET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ViewExpenseDetailsByClickonProjectName_No_Function run successfully");
	}
	@Test(priority=11)
	public void PaySelected_Function() throws InterruptedException, IOException
	{
		String TCName ="PaySelected_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
	//  RFP.ClickOncheckboxForPayRFPET();        //---Single Check box
	    RFP.ClickOnAllcheckboxForPayRFPET();        //---Multiple Check box
        Thread.sleep(1000);
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
 //     RFP.ClickOnPayBtnForPaySelectedRFPET();    //----Pay
        RFP.ClickOnCancelBtnForPaySelectedRFPET(); //---Cancel
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("PaySelected_Function run successfully");		
	}
	@Test(priority=12)
	public void RejectSelected_Function() throws InterruptedException, IOException
	{
		String TCName ="RejectSelected_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
	    RFP.ClickOncheckboxForPayRFPET();        //---Single Check box
	//  RFP.ClickOnAllcheckboxForPayRFPET();        //---Multiple Check box
        Thread.sleep(1000);
        RFP.ClickOnRejectSelectedRFPET();
 //     RFP.ClickOnYesBtnForRejectSelectedRFPET();
        RFP.ClickOnCancelBtnForRejectSelectedRFPET();
        Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("RejectSelected_Function run successfully");
	}
	@Test(priority=13)
	public void Export_Function() throws InterruptedException, IOException
	{
		String TCName ="Export_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnExportBtnRFPET();
	    Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Export_Function run successfully");
	}
	@Test(priority=14)
	public void Attachment_Function() throws InterruptedException, IOException
	{
		String TCName ="Attachment_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		RFP.ClickOnReimbursableET();
		Thread.sleep(3000);
		RFP.ClickOnAttachmentlinkRFPET();
	    Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("Attachment_Function run successfully");
	}
	@AfterMethod
	public void Logout_Function()
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
