package Test_Package;

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

import POM_Package.Create_GRN_MM;
import POM_Package.Login_Quoteplan;
import POM_Package.Logout_Quoteplan;
import POM_Package.MM_Functionality;
import POM_Package.Search_Sorting_Function_MM;
import POM_Package.ViewModify;
import Utility_Package.Utility_Class_PB;

public class Test_Class_For_MM_Functionality {
	WebDriver driver;
	ViewModify VM;
	Create_GRN_MM MM;
	Search_Sorting_Function_MM SS;
	MM_Functionality mm;
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost/QuotePlan/quotep7_apqengineering/home/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	}
	@BeforeMethod
	public void loginfunction() throws EncryptedDocumentException, IOException
	{
		Login_Quoteplan li = new Login_Quoteplan(driver);	
		li.EnterUsername(Utility_Class_PB.GetExcelsheetData("MM",16, 1));
		li.EnterPassword(Utility_Class_PB.GetExcelsheetData("MM", 18, 1));
		li.ClickOnLogin();
		VM = new ViewModify(driver);
		MM = new Create_GRN_MM(driver);
		SS = new Search_Sorting_Function_MM(driver);
		mm = new MM_Functionality(driver);
	}
	@Test(priority = 1)
	public void Description_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(5000);
		mm.ClickonPenciliconMM();
		Thread.sleep(2000);
		mm.ClickonPricetabMM();
		Thread.sleep(3000);
		mm.ClickonLabordetailstabMM();
		Thread.sleep(2000);
		mm.ClickonDocumentstabMM();
		Thread.sleep(2000);
		mm.ClickonInventorytabMM();
		Thread.sleep(2000);
		mm.ClickonProjecttabMM();
		Thread.sleep(2000);
		mm.ClickonAccessoriestabMM();
		Thread.sleep(2000);
		mm.ClickonCrossReferencetabMM();
		Thread.sleep(2000);
		mm.ClickonCommentstabMM();
		Thread.sleep(2000);
		mm.ClickonEditbtnMM();
		Thread.sleep(5000);
		mm.selectLeadTimeMM();
        Thread.sleep(2000);
        mm.EnterDaysMM();
        Thread.sleep(2000);
		mm.ClickonSavebtnMM();
		Thread.sleep(2000);
		mm.ClickonPenciliconMM();
		Thread.sleep(2000);
		mm.ClickonCommentstabMM();
		mm.ClickonClosebtnMM();
			
	}
	@Test(priority = 2)
	public void InsertVendorinItemMaster_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonitemcheckboxMM();
		Thread.sleep(1000);
		mm.ClickonActionsbtnMM();
		Thread.sleep(1000);
		mm.ClickoninsertspepriceitemmasterMM();
		Thread.sleep(1000);
		mm.ClickonPreferedVendorMM();
		Thread.sleep(1000);
		mm.ClickonInsertVendorYesbtnMM();
//		mm.ClickonInsertVendorNobtnMM();
				
	}
	@Test(priority = 3)
	public void Refresh_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonRefreshbtnMM();
		System.out.println("Click on Refresh button ");
				
	}
	@Test(priority = 4)
	public void ViewModifyPR_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonViewModifyPRbtnMM();
	}
	@Test(priority = 5)
	public void ViewModifyPO_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(30000);
		MM.ClickonMM();
		Thread.sleep(10000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonViewModifyPObtnMM();
	}
	@Test(priority = 6)
	public void BOM_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonitemcheckboxMM();
		Thread.sleep(1000);
		mm.ClickonBOMbtnMM();
		Thread.sleep(1000);
		mm.ClickonBOMoptionMM();
		
	}
	@Test(priority = 7)
	public void PriceSendEntireBOM_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonitemcheckboxMM();
		Thread.sleep(1000);
		MM.ClickonSettingbtn();
		Thread.sleep(1000);
		MM.ClickoncheckboxPR();
		Thread.sleep(1000);
		mm.ClickonPRcheckboxMM();
		Thread.sleep(1000);
		mm.ClickonBOMbtnMM();
		mm.ClickonInsertPRPricesintoBOMdropdownMM();
		Thread.sleep(1000);
		mm.ClickonSendToEntireBOMMM();
		
		
	}
	@Test(priority = 8)
	public void PriceSendToSpecificPanel_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		mm.ClickonitemcheckboxMM();
		Thread.sleep(2000);
		MM.ClickonSettingbtn();
		Thread.sleep(2000);
		MM.ClickoncheckboxPR();
		Thread.sleep(2000);
		mm.ClickonPRcheckboxMM();
		Thread.sleep(2000);
		mm.ClickonBOMbtnMM();
		Thread.sleep(2000);
		mm.ClickonInsertPRPricesintoBOMdropdownMM();
		Thread.sleep(2000);
		mm.ClickonSendToSpecificPanelMM();
		
		
	}
//	@AfterMethod
//	public void logoutfunction() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		Logout_Quoteplan lo = new Logout_Quoteplan(driver);
//		lo.clickonadminprofile();
//		lo.clickonlogoutbtn();
//	}
//	@AfterClass
//	public void closebrowser()
//	{
//		driver.close();
//	}
}
