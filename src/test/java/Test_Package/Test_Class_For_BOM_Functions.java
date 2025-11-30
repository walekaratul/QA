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

import POM_Package.BOM_Functions;
import POM_Package.Create_GRN_MM;
import POM_Package.Login_Quoteplan;
import POM_Package.Logout_Quoteplan;
import POM_Package.ViewModify;
import Utility_Package.Utility_Class_PB;

public class Test_Class_For_BOM_Functions {
	WebDriver driver;
	ViewModify VM;
	BOM_Functions bom;
	
	
	
	
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
		li.EnterUsername(Utility_Class_PB.GetExcelsheetData("Data",16, 1));
		li.EnterPassword(Utility_Class_PB.GetExcelsheetData("Data", 18, 1));
		li.ClickOnLogin();
		VM = new ViewModify(driver);
		bom = new BOM_Functions(driver);
		
		
	}
	@Test(priority=1)
	public void AdvancedSearchByCatlogNo() throws InterruptedException
	{
		VM.ClickOnMenu();                     // Catlog Number
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		bom.ClickonFilterbtn();
		Thread.sleep(2000);
		bom.ClickonCheckbox();
		bom.EnterCatlogNOBOM();
		Thread.sleep(2000);
		bom.ClickonDonebtn();
		Thread.sleep(3000);
		bom.ClickonFilterbtn();
		Thread.sleep(2000);
		bom.ClickonClearbtn();
		Thread.sleep(2000);
		bom.ClickonResetbtn();
		
		Thread.sleep(2000);                // Item ID
		bom.ClickonFilterbtn();
		Thread.sleep(2000);
		bom.ClickonCheckboxCheckboxID();
		bom.EnterIDBOM();
		Thread.sleep(2000);
		bom.ClickonDonebtn();
		Thread.sleep(3000);
		bom.ClickonFilterbtn();
		Thread.sleep(2000);
		bom.ClickonClearbtn();
		Thread.sleep(2000);
		bom.ClickonResetbtn();
		
//		Thread.sleep(2000);               // Description
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonCheckboxDe();
//		bom.EnterDescriptionBOM();
//		Thread.sleep(2000);
//		bom.ClickonDonebtn();
//		Thread.sleep(3000);
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonClearbtn();
//		Thread.sleep(2000);
//		bom.ClickonResetbtn();
		
//		Thread.sleep(2000);               // Long Description
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonCheckboxLDe();
//		bom.EnterLDescriptionBOM();
//		Thread.sleep(2000);
//		bom.ClickonDonebtn();
//		Thread.sleep(3000);
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonClearbtn();
//		Thread.sleep(2000);
//		bom.ClickonResetbtn();
		
//		Thread.sleep(2000);              // Discounted Price
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonCheckboxDiP();
//		bom.EnterDiscountedPriceBOM();
//		Thread.sleep(2000);
//		bom.ClickonDonebtn();
//		Thread.sleep(3000);
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonClearbtn();
//		Thread.sleep(2000);
//		bom.ClickonResetbtn();
		
//		Thread.sleep(2000);           // Preferred Item
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonCheckboxPI();
//		Thread.sleep(2000);
//		bom.EnterPreferredItemBOM();
//		Thread.sleep(2000);
//		bom.ClickonDonebtn();
//		Thread.sleep(3000);
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonClearbtn();
//		Thread.sleep(2000);
//		bom.ClickonResetbtn();		
		
//		Thread.sleep(2000);          // Selected Folder
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonCheckboxSF();
//		Thread.sleep(2000);
//		bom.ClickonSelectedFolderBOM();
//		Thread.sleep(2000);
//		bom.ClickonFolderBOM();
//		Thread.sleep(2000);
//		bom.ClickonDonebtn();
//		Thread.sleep(3000);
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonClearbtn();
//		Thread.sleep(2000);
//		bom.ClickonResetbtn();			
		
//		Thread.sleep(2000);          // Make
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonCheckbox();
//		bom.EnterCatlogNOBOM();
//		Thread.sleep(2000);
//		bom.ClickonCheckboxMake();
//		Thread.sleep(2000);
//		bom.ClickonSelectedMakeBOM();
//		Thread.sleep(2000);
//		bom.ClickonMakeBOM();
//		Thread.sleep(2000);
//		bom.ClickonDonebtn();
//		Thread.sleep(3000);
//		bom.ClickonFilterbtn();
//		Thread.sleep(2000);
//		bom.ClickonClearbtn();
//		Thread.sleep(2000);
//		bom.ClickonResetbtn();	
		
		Thread.sleep(2000);         // Sorted By
		bom.ClickonFilterbtn();
		bom.ClickonCheckbox();
		Thread.sleep(2000);
		bom.EnterCatlogNOBOM();
		Thread.sleep(2000);
		bom.ClickonCheckboxMake();
		Thread.sleep(2000);
		bom.ClickonSelectedMakeBOM();
		Thread.sleep(2000);
		bom.ClickonMakeBOM();
		Thread.sleep(2000);
		bom.ClickonCheckboxSortedBy();
		Thread.sleep(2000);
		bom.ClickonMake();
		Thread.sleep(2000);
		bom.ClickonCheckboxAsc();
		Thread.sleep(2000);
		bom.ClickonDonebtn();
		Thread.sleep(3000);
		bom.ClickonFilterbtn();
		Thread.sleep(2000);
		bom.ClickonClearbtn();
		Thread.sleep(2000);
		bom.ClickonResetbtn();		
		
		System.out.println("AdvancedSearchByCatlogNo = PASS ");	
	}
	@Test(priority=2)
	public void Export_For_WithoutFormula() throws InterruptedException
	{
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		bom.ClickonExportbtn();
		Thread.sleep(1000);
		bom.ClickonExportDropdown();
		Thread.sleep(1000);
		bom.ClickonBOMexportwithoutformula();
	}
	@Test(priority=3)
	public void Export_For_bomexportxls() throws InterruptedException
	{
		VM.ClickOnMenu();                     
		System.out.println("Clicked On Menu");
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		bom.ClickonExportbtn();
		Thread.sleep(1000);
		bom.ClickonExportDropdown();
		Thread.sleep(1000);
		bom.Clickonbomexportxls();
	}
	@Test(priority=4)
	public void Export_For_CSV() throws InterruptedException
	{
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		bom.ClickonExportbtn();
		Thread.sleep(1000);
		bom.ClickonExportDropdown();
		Thread.sleep(1000);
		bom.ClickonexportCSV();
	}
	@Test(priority=5)
	public void Export_For_HTML() throws InterruptedException
	{
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		bom.ClickonExportbtn();
		Thread.sleep(1000);
		bom.ClickonExportDropdown();
		Thread.sleep(1000);
		bom.ClickonexportHTML();
	}
	@Test(priority=6)
	public void Export_For_showgroupcolumn_forspreadsheet() throws InterruptedException
	{
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		bom.ClickonExportbtn();
		Thread.sleep(1000);
		bom.ClickonExportDropdown();
		Thread.sleep(1000);
		bom.Clickonshowgroupcolumn_forspreadsheet();
		Thread.sleep(1000);
		bom.ClickonDone();
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
