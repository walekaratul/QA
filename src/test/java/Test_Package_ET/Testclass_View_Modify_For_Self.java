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

public class Testclass_View_Modify_For_Self {
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
	public void LoginFunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_Quoteplan log = new Login_Quoteplan(driver);
		log.EnterUsername(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 6, 1));
		Thread.sleep(1000);
		log.EnterPassword(Utility_Package_ET.Utility_Class_ET.GetExcelsheetData("Edata", 5, 1));
		log.ClickOnLogin();
	    CE = new Create_Expensesheet(driver);
	    VMESU = new View_Modify_Sellf_UserAndSupervisor(driver);
	}
	@Test(priority=1)
	public void SimpleSearch_Function() throws IOException, InterruptedException
	{
		 String TCName = "SimpleSearch_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.EnterOnSerachBoxVMFUET();
		 VMESU.ClickOnSearchBtnVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("Simple Search Function run successfully");	
		 
	}
	@Test(priority=2)
	public void AdvancedSearchByDate_Function() throws InterruptedException, IOException
	{
		 String TCName = "AdvancedSearchByDate_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterOnVMFUET();
		 VMESU.SelectFilterOperatorOnVMFUET();
		 VMESU.ClickOnCalenderBoxVMFUET();
		 VMESU.SelectMonthVMFUET();
		 VMESU.SelectYearVMFUET();
		 VMESU.ClickOnFirstDayVMFUET();
		 VMESU.ClickOnLastDayVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("AdvancedSearchByDate_Function run successfully");	
	}
	@Test(priority=3)
	public void AdvancedSearchByUser_Function() throws InterruptedException, IOException
	{
		 String TCName = "AdvancedSearchByDate_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilteruserOnVMFUET();
		 VMESU.SelectFilterOperatoruserOnVMFUET();
		 VMESU.EnterOnAdvancedEnterBoxuserVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("AdvancedSearchByDate_Function run successfully");	
		 
	}
	@Test(priority=4)
	public void AdvancedSearchByProjectNumber_Function() throws InterruptedException, IOException
	{
		 String TCName = "AdvancedSearchByProjectNumber_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterPNOOnVMFUET();
		 VMESU.SelectFilterOperatorPNOOnVMFUET();
		 VMESU.EnterOnAdvancedEnterBoxPNOVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("AdvancedSearchByProjectNumber_Function run successfully");
		 
	}
	@Test(priority=5)
	public void AdvancedSearchByProjectName_Function() throws InterruptedException, IOException
	{
		 String TCName = "AdvancedSearchByProjectName_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterPNameOnVMFUET();
		 VMESU.SelectFilterOperatorPNOOnVMFUET();
		 VMESU.EnterOnAdvancedEnterBoxPNameVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
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
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnAdvnancedSearchBtnVMFUET();
		 VMESU.SelectFilterstatusOnVMFUET();
		 VMESU.SelectFilterOperatorstatusOnVMFUET();
		 VMESU.ClickOnStatusVMFUET();
		 VMESU.ClickOnApplyBtnVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("AdvancedSearchByStatus_Function run successfully");
	}
	@Test(priority=7)
	public void PlusSymbol_Function() throws InterruptedException, IOException
	{
		 String TCName = "PlusSymbol_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnPlusSymbollVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("PlusSymbol_Function run successfully");
	}
	@Test(priority=8)
	public void NewButton_Function() throws InterruptedException, IOException
	{
		 String TCName = "PlusSymbol_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnNewBtnVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("PlusSymbol_Function run successfully");
	}
	@Test(priority=9)
	public void WeekExpensesheetLink_Function() throws InterruptedException, IOException
	{
		 String TCName = "WeekExpensesheetLink_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnWeekTimeSheetLinkVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("WeekExpensesheetLink_Function run successfully");
	}
	@Test(priority=10)
	public void HideShowAllRecord_Function() throws InterruptedException, IOException
	{
		 String TCName = "HideShowAllRecord_Function";
		 CE.ClickOnMenu();
		 Thread.sleep(1000);
		 CE.ClickOnExpenseTracking();
		 Thread.sleep(1000);
		 VMESU.ClickOnViewModifyExpensesheet();
		 Thread.sleep(1000);
		 VMESU.ClickOnHideShowAllRecordVMFUET();
		 Thread.sleep(3000);
		 Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		 System.out.println("HideShowAllRecord_Function run successfully");
	}
	@AfterMethod
	public void LogoutFunction()
	{
		Logout_Quoteplan logout = new Logout_Quoteplan(driver);
		logout.clickadminprofile();
		logout.clicklogoubtn();
	}
	@AfterClass
	public void Closebrowser()
	{
		driver.close();
	}
	
	

}
