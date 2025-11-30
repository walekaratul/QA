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
import POM_Package.ViewModify;
import Utility_Package.Utility_Class_PB;

public class Test_Class_For_GRN_MM {
	WebDriver driver;
	ViewModify VM;
	Create_GRN_MM MM;
	
	
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
		MM = new Create_GRN_MM(driver);
		
	}
	@Test(priority=1)
	public void CreatePR() throws InterruptedException
	{
		VM.ClickOnMenu();
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		MM.ClickonMM();
		Thread.sleep(5000);
		MM.ClickonExpandAllbtn();
		Thread.sleep(2000);
		MM.ClickonItemcheckbox();
		Thread.sleep(2000);
		
//		MM.ClickonFolderArrow();               // eganco instance customization
		
		MM.ClickonSelectVendorbtn();
		Thread.sleep(2000);
		MM.ClickonSelectVendorlist();
		Thread.sleep(2000);
		MM.ClickonVendorlink();
		Thread.sleep(2000);
		MM.ClickonApprovebtn();
		Thread.sleep(2000);
		MM.ClickonApproveoption();
		Thread.sleep(2000);
		MM.ClickoncreatePRbtn();
		Thread.sleep(2000);
		MM.ClickoncreatePRYesbtn();
//		MM.ClickoncreatePRNobtn();
		
	}
	@Test(priority=2)
	public void CreatePO() throws InterruptedException
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
		Thread.sleep(5000);
		MM.ClickonItemcheckbox();
		Thread.sleep(2000);
		MM.EnterPOReqQty();
		Thread.sleep(2000);
		MM.ClickonSelectVendorbtn();
		Thread.sleep(2000);
		MM.ClickonSelectVendorlist();
		Thread.sleep(2000);
		MM.ClickonVendorPOlink();
		Thread.sleep(2000);
		MM.ClickonTaksbtn();
		Thread.sleep(2000);
		MM.ClickonTaks();
		Thread.sleep(2000);
		MM.ClickonApprovebtn();
		Thread.sleep(2000);
		MM.ClickonApproveoption();
		Thread.sleep(2000);
		MM.ClickoncreatePObtn();
		Thread.sleep(2000);
		MM.ClickonDuedateoption();
		Thread.sleep(2000);
		MM.EnterDays();
		Thread.sleep(2000);
		MM.ClickonApplyPObtn();
		Thread.sleep(2000);
//		MM.ClickoncreatePObtn();
//		MM.ClickonCancePObtn();
		MM.ClickonCreateAllPObtn();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void CreateGRN() throws InterruptedException
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
		Thread.sleep(10000);
		MM.ClickonItemcheckbox();
		Thread.sleep(2000);
		MM.ClickonViewGRNbtn();
		Thread.sleep(10000);
		MM.ClickonNewbtn();
		Thread.sleep(10000);
		MM.ClickonAddbtn();
		Thread.sleep(10000);
		MM.ClickonPOlink();
		Thread.sleep(10000);
		MM.ClickonItemsbtn();
		Thread.sleep(2000);
		MM.ClickonDrag();
		Thread.sleep(2000);
		MM.rightclickonDrop();
		Thread.sleep(2000);
		MM.ClickonCopyGRN();
		Thread.sleep(2000);
		MM.ClickonExpandToggle();
		Thread.sleep(2000);
		MM.ClickonSaveGRN();
	   
	}
	@Test(priority=4)
	public void Fill_Vendor_Confirmation_data() throws InterruptedException
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
		Thread.sleep(5000);
		MM.ClickonItemcheckbox();
		Thread.sleep(2000);
		MM.ClickonSettingbtn();
		Thread.sleep(1000);
		MM.ClickoncheckboxPR();
		Thread.sleep(1000);
		MM.ClickoncheckboxPO();
		Thread.sleep(1000);
		MM.ClickoncheckboxGRN();
		Thread.sleep(1000);
		MM.ClickonVendorlinkPO();
		Thread.sleep(10000);
		MM.ClickonVendorConfirmationDataYesbutton();
		Thread.sleep(10000);
		driver.navigate().to("http://localhost/QuotePlan/quotep7_apqengineering/po/view?id=MzYw&cxs0d=YXR1bEBydXRhbXNvZnQuY29t");
		Thread.sleep(5000);
//		MM.ClickonVendorConfirmationDataNobutton();
		MM.ClickonVendorConfirmationDate();
		Thread.sleep(1000);
		MM.SelectVendorConfirmationMonth();
		Thread.sleep(1000);
		MM.SelectVendorConfirmationYear();
		Thread.sleep(1000);
		MM.ClickonVendorConfirmationDay();
		Thread.sleep(1000);
		MM.EnterVendorConfirmationQty();
		Thread.sleep(1000);
		MM.ClickonSaveandSendDropdownbtn();
		Thread.sleep(1000);
		MM.ClickonSaveandSendOption();
//		MM.ClickonSaveVCOption();
		Thread.sleep(2000);
//		MM.ClickonSaveOKbtn();
		Thread.sleep(5000);
//		driver.navigate().to("http://localhost/QuotePlan/quotep7_apqengineering/");

	   
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
