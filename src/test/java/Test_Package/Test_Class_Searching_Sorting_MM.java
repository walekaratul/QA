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
import POM_Package.Search_Sorting_Function_MM;
import POM_Package.ViewModify;
import Utility_Package.Utility_Class_PB;

public class Test_Class_Searching_Sorting_MM {
	WebDriver driver;
	ViewModify VM;
	Create_GRN_MM MM;
	Search_Sorting_Function_MM SS;
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
	public void loginfunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_Quoteplan li = new Login_Quoteplan(driver);	
		li.EnterUsername(Utility_Class_PB.GetExcelsheetDataMaterialManagement("MM",1, 1));
		Thread.sleep(1000);
		li.EnterPassword(Utility_Class_PB.GetExcelsheetDataMaterialManagement("MM", 2, 1));
		li.ClickOnLogin();
		VM = new ViewModify(driver);
		MM = new Create_GRN_MM(driver);
		SS = new Search_Sorting_Function_MM(driver);
	}
	@Test(priority=1)
	public void Common_Search_Function() throws InterruptedException, IOException
	{
		String TCName = "Common_Search_Function";
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(8000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(5000);
		SS.EnterSearchBoxMM(Utility_Class_PB.GetExcelsheetDataMaterialManagement("MM",3, 1));
		Thread.sleep(2000);
		SS.ClickonSearchBtnMM();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		
			
	}
	@Test(priority=2)
	public void Advanced_SearchBy_Description() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_Description";
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
		SS.ClickonDescriptionSearchiconMM();
		Thread.sleep(2000);
		SS.SelectEqulasDropdownMM();
		Thread.sleep(2000);
		SS.EnterDescriptionBoxMM(Utility_Class_PB.GetExcelsheetDataMaterialManagement("MM",3, 1));
		Thread.sleep(2000);
		SS.ClickonFilterBtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonDescriptionSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearBtnMM();
				
	}
	@Test(priority=3)
	public void Advanced_SearchBy_CatlogNo() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_CatlogNo";
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		MM.ClickonMM();
		Thread.sleep(10000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(5000);
		SS.ClickonCatlogNoSearchiconMM();
		Thread.sleep(2000);
		SS.SelectEqulasCNODropdownMM();
		Thread.sleep(2000);
		SS.EnterCatlogNoBoxMM(Utility_Class_PB.GetExcelsheetDataMaterialManagement("MM",4, 1));
		Thread.sleep(2000);
		SS.ClickonFilterCNoBtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonCatlogNoSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearCNoBtnMM();
					
	}
	@Test(priority=4)
	public void Advanced_SearchBy_Make() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_Make";
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
		SS.ClickonMakeSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonMakeCheckBoxMM();
		Thread.sleep(2000);
		SS.ClickonFilterMakeBtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonMakeSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearMakeBtnMM();
	
				
	}
	@Test(priority=5)
	public void Advanced_SearchBy_StockQty() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_StockQty";
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
		SS.ClickonStockQtySearchiconMM();
		Thread.sleep(2000);
		SS.EnterStockQtyBoxMM(Utility_Class_PB.GetExcelsheetData("MM", 22, 1));
		Thread.sleep(2000);
		SS.ClickonFilterStockQtyBtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		SS.ClickonStockQtySearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearStockQtyBtnMM();
				
	}
	@Test(priority=6)
	public void Advanced_SearchBy_Vendor() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_Vendor";
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
		SS.ClickonVendorSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonVendorCheckBoxMM();
		Thread.sleep(2000);
		SS.ClickonFilterVendorBtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonVendorSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearVendorBtnMM();
				
	}
	@Test(priority=7)
	public void Advanced_SearchBy_Task() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_Task";
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
		SS.ClickonTaskSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonTaskCheckBoxMM();
		Thread.sleep(2000);
		SS.ClickonFilterTaskBtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonTaskSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearTaskBtnMM();
				
	}
	@Test(priority=8)
	public void Show_Hide_Functionality() throws InterruptedException, IOException
	{
		String TCName ="Show_Hide_Functionality";
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
		MM.ClickonSettingbtn();
		Thread.sleep(2000);
		SS.ClickonLastPRdatecheckboxMM();
		Thread.sleep(2000);
		SS.ClickonLastPRDiscpricecheckboxMM();
		Thread.sleep(2000);
		SS.ClickonLastPurchasepricecheckboxMM();
		Thread.sleep(2000);
		SS.ClickonLastPurchasedatecheckboxMM();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		
				
	}
	@Test(priority=9)
	public void Advanced_SearchBy_PO_Active() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_PO_Active";
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
		MM.ClickonSettingbtn();
		Thread.sleep(2000);
		MM.ClickoncheckboxPO();
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.SelectPOdropdown1MM();
		Thread.sleep(2000);
		SS.ClickonFilterPObtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearPObtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
	
					
	}
	@Test(priority=10)
	public void Advanced_SearchBy_PO_Partially_Recieved() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_PO_Partially_Recieved";
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
		MM.ClickonSettingbtn();
		Thread.sleep(2000);
		MM.ClickoncheckboxPO();
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.SelectPOdropdow2MM();
		Thread.sleep(2000);
		SS.ClickonFilterPObtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearPObtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		
	}
	@Test(priority=11)
	public void Advanced_SearchBy_PO_Complete() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_PO_Complete";
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
		MM.ClickonSettingbtn();
		Thread.sleep(2000);
		MM.ClickoncheckboxPO();
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.SelectPOdropdown3MM();
		Thread.sleep(2000);
		SS.ClickonFilterPObtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearPObtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();	
	}
	@Test(priority=12)
	public void Advanced_SearchBy_PO_Cancelled() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_PO_Cancelled";
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
		MM.ClickonSettingbtn();
		Thread.sleep(2000);
		MM.ClickoncheckboxPO();
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.SelectPOdropdown4MM();
		Thread.sleep(2000);
		SS.ClickonFilterPObtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonPOSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearPObtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();	
	}
	@Test(priority=13) // (Dascan Instance only) 
	public void Advanced_SearchBy_MReqDate_Green() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_MReqDate_Green";
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
//		MM.ClickonSettingbtn();
//		Thread.sleep(2000);
//		MM.ClickoncheckboxPO();
//		Thread.sleep(2000);
		SS.ClickonMReqSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonMReqGreencheckboxMM();
		Thread.sleep(2000);
		SS.ClickonFilterMReqbtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonMReqSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearMReqbtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();	
	}
	@Test(priority=14) // (Dascan Instance only) 
	public void Advanced_SearchBy_MReqDate_Yellow() throws InterruptedException, IOException 
	{
		String TCName ="Advanced_SearchBy_MReqDate_Yellow";
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
//		MM.ClickonSettingbtn();
//		Thread.sleep(2000);
//		MM.ClickoncheckboxPO();
//		Thread.sleep(2000);
		SS.ClickonMReqSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonMReqGreencheckboxMM();
		Thread.sleep(2000);
		SS.ClickonFilterMReqbtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonMReqSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearMReqbtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();	
	}
	@Test(priority=15) // (Dascan Instance only) 
	public void Advanced_SearchBy_ApprovalTimestamp() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_ApprovalTimestamp";
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
//		MM.ClickonSettingbtn();
//		Thread.sleep(2000);
//		MM.ClickoncheckboxPO();
//		Thread.sleep(2000);
		SS.ClickonApprovalTimestampSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonApprovecheckboxMM();
		Thread.sleep(2000);
		SS.ClickonFilterApprovalTimestampbtnMM();
		Thread.sleep(2000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		Thread.sleep(2000);
		SS.ClickonApprovalTimestampSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonClearApprovalTimestampbtnMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();	
	}
	@Test(priority=16) // (eganco Instance only) 
	public void Advanced_SearchBy_VendorSPAData() throws InterruptedException, IOException
	{
		String TCName ="Advanced_SearchBy_VendorSPAData";
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
		SS.ClickonVendorSPADataSearchiconMM();
		Thread.sleep(2000);
		SS.ClickonApprovecheckboxMM();
		Thread.sleep(2000);
		SS.ClickonVendorcheckboxMM();
		Thread.sleep(2000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
		
	}
//	@AfterMethod
//	public void logoutfunction() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		Logout_Quoteplan lo = new Logout_Quoteplan(driver);
//		lo.clickonadminprofile();
//		lo.clickonlogoutbtn();
//	}
//	@AfterClass
//	public void closebrowser()
//	{
//		driver.close();
//		
//	}

}
