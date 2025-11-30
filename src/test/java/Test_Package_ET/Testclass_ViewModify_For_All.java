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
import POM_Package_ET.View_Modify_For_All;
import Utility_Package_ET.Utility_Class_ET;

public class Testclass_ViewModify_For_All {
	WebDriver driver;
	Create_Expensesheet CE;
	View_Modify_For_All VMFA;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
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
		VMFA = new View_Modify_For_All(driver);
	}
	@Test(priority=1)
	public void SimpleSearch_Function() throws InterruptedException, IOException
	{
		String TCName ="SimpleSearch_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(3000);
		VMFA.EnterkOnSearchBoxVMFAET();
		VMFA.ClickOnSearchBtnVMFAET();
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
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(3000);
		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
		VMFA.SelectFilterOnVMFAET();
		VMFA.SelectFilterOperatorOnVMFAET();
		VMFA.ClickOnCalenderBoxVMFAET();
		VMFA.SelectMonthVMFAETT();
		VMFA.SelectYearVMFAET();
		VMFA.ClickOnFirstDayVMFAET();
		VMFA.ClickOnLastDayVMFAET();
		VMFA.ClickOnApplyBtnVMFAET();
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
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(3000);
		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
		VMFA.SelectFilterUserOnVMFAET();
		VMFA.SelectFilterOperatorUserOnVMFAET();
		VMFA.EnterOnAdvancedEnterBoxUserVMFAET();
		VMFA.ClickOnApplyBtnVMFAET();
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
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(3000);
		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
		VMFA.SelectFilterPNOOnVMFAET();
		VMFA.SelectFilterOperatorPNOrOnVMFAET();
		VMFA.EnterOnAdvancedEnterBoxPNOVMFAET();
		VMFA.ClickOnApplyBtnVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByProjectNumber_Function run successfully");
	}
	@Test(priority=5)
	public void AdvanncedSearchByProjectName_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvanncedSearchByProjectName_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
		VMFA.SelectFilterPNameOnVMFAET();
		VMFA.SelectFilterOperatorPNameOnVMFAET();
		VMFA.EnterOnAdvancedEnterBoxPNameVMFAET();
		VMFA.ClickOnApplyBtnVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvanncedSearchByProjectName_Function run successfully");
			
	}
	@Test(priority=6)
	public void AdvancedSearchByStatus_Function() throws InterruptedException, IOException
	{
		String TCName ="AdvancedSearchByStatus_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnAdvnancedSearchBtnVMFAET();
		VMFA.SelectFilterStatusOnVMFAET();
		VMFA.SelectFilterOperatorStatusOnVMFAET();
		VMFA.ClickOnStatusVMFAET();
		VMFA.ClickOnApplyBtnVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("AdvancedSearchByStatus_Function run successfully");
	}
	@Test(priority=7)
	public void NewButton_Function() throws InterruptedException, IOException
	{
		String TCName ="NewButton_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnNewBtnVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("NewButton_Function run successfully");	
	}
	@Test(priority=8)
	public void PlusSymbol_Function() throws InterruptedException, IOException
	{
		String TCName ="PlusSymbol_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnPlusSymbollVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("PlusSymbol_Function run successfully");	
	}
	@Test(priority=9)
	public void UserExpensesheetLink_Function() throws InterruptedException, IOException
	{
		String TCName ="UserExpensesheetLink_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnUserExpensesheetLinkVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("UserExpensesheetLink_Function run successfully");
	}
	@Test(priority=10)
	public void HideShowAllRecord_Function() throws InterruptedException, IOException
	{
		String TCName ="HideShowAllRecord_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnHideShowAllRecordVMFAET();
		Thread.sleep(3000);
		Utility_Package_ET.Utility_Class_ET.TakesscreenShot(driver, TCName);
		System.out.println("HideShowAllRecord_Function run successfully");
	}
	@Test(priority=11)
	public void LoadMore_Function() throws InterruptedException, IOException
	{
		String TCName ="LoadMore_Function";
		CE.ClickOnMenu();
		Thread.sleep(1000);
		CE.ClickOnExpenseTracking();
		Thread.sleep(1000);
		VMFA.ClickOnViewModifyET();
		Thread.sleep(1000);
		VMFA.ClickOnAllBtnVMFAET();
		Thread.sleep(5000);
		VMFA.ClickOnLoadMoreVMFAET();
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
