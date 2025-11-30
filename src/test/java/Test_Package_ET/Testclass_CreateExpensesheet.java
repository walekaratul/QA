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
import POM_Package_ET.View_Modify_Sellf_UserAndSupervisor;
import Utility_Package_ET.Utility_Class_ET;

public class Testclass_CreateExpensesheet {
	WebDriver driver;
	Create_Expensesheet CE;
	View_Modify_Sellf_UserAndSupervisor VMESU;
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
	public void Loginfunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_Quoteplan log = new Login_Quoteplan(driver);
		log.EnterUsername(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 4, 1));
		Thread.sleep(1000);
		log.EnterPassword(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 5, 1));
		log.ClickOnLogin();
	    CE = new Create_Expensesheet(driver);
	    VMESU = new View_Modify_Sellf_UserAndSupervisor(driver);
	}
	@Test(priority=1)
	public void CreateExpensesheet() throws InterruptedException, IOException
	{
		String TCName = "CreateExpensesheet";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		CE.ClickOnCreateExpensheeet();
		Thread.sleep(1000);

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
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("CreateExpensesheet Function Run Successfully ");
	}
	@Test(priority=2)
	public void ApprovalForSupervisor() throws InterruptedException, IOException
	{
		String TCName = "ApprovalForSupervisor";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMESU.ClickOnViewModifyExpensesheet();
		Thread.sleep(15000);
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		CE.ClickOnProjectAllCheckBoxCE();
//	    CE.ClickOnProjectSingleCheckBoxCE();
	    Thread.sleep(3000);
	    CE.ClickOnActionsBtnCE();
	    Thread.sleep(1000);
	    CE.ClickOnIssueForApprovalBtnCE();
	    Thread.sleep(1000);
	    CE.ClickOnSupervisorInternalBtnCE();
	    Thread.sleep(15000);
	    CE.ClickOnSubmitBtnCE();
//	    CE.ClickOnCancelBtnCE();
	    Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ApprovalForSupervisor Function Run Successfully ");
	}
	@Test(priority=3)
	public void ApprovalForProjectManager() throws InterruptedException, IOException
	{
		String TCName = "ApprovalForProjectManager";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMESU.ClickOnViewModifyExpensesheet();
		Thread.sleep(1000);
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		CE.ClickOnProjectAllCheckBoxCE();
//	    CE.ClickOnProjectSingleCheckBoxCE();
	    Thread.sleep(3000);
	    CE.ClickOnActionsBtnCE();
	    Thread.sleep(1000);
	    CE.ClickOnIssueForApprovalBtnCE();
	    Thread.sleep(1000);
	    CE.ClickOnProjectManagerBtnCE();
//	    Thread.sleep(15000);
//	    CE.ClickOnSubmitBtnCE();
//	    CE.ClickOnCancelBtnCE();
	    Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ApprovalForProjectManager Function Run Successfully ");
	}
	@Test(priority=4)
	public void ExportFunction() throws InterruptedException, IOException
	{
		String TCName = "ExportFunction";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMESU.ClickOnViewModifyExpensesheet();
		Thread.sleep(1000);
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		Thread.sleep(1000);
		CE.ClickOnActionsBtnCE();
		CE.ClickOnExportExpenseSheetBtnCE();
		CE.ClickOnExportPDFBtnCE();
//		CE.ClickOnExportPDFWithRecieptBtnCE();	
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("ExportFunction Function Run Successfully ");
	}
	@Test(priority=5)
	public void AddRowFunction() throws InterruptedException, IOException
	{
		String TCName = "AddRowFunction";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMESU.ClickOnViewModifyExpensesheet();
		Thread.sleep(1000);
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		Thread.sleep(1000);
		CE.ClickOnAddRowBtnCE();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AddRowFunction Function Run Successfully ");
	}
	@Test(priority=6)
	public void DeleteFunction() throws InterruptedException, IOException
	{
		String TCName = "DeleteFunction";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMESU.ClickOnViewModifyExpensesheet();
		Thread.sleep(10000);
		VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		Thread.sleep(1000);
	    CE.ClickOndeleteSymbolCE();
	    Thread.sleep(3000);
//	    CE.ClickOndeleteYESBtnCE();
	    CE.ClickOndeleteNOBtnCE();
//	    CE.ClickOnleavethispageBtnCE();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("DeleteFunction Function Run Successfully ");
	}
//	@AfterMethod
//	public void Logoutfunction()
//	{
//		Logout_Quoteplan logout = new Logout_Quoteplan(driver);
//		logout.clickadminprofile();
//		logout.clicklogoubtn();
//		
//	}
//	@AfterClass
//	public void closebrowser()
//	{
//		driver.close();
//	}

}
