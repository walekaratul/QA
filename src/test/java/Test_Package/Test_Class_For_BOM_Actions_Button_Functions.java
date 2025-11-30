package Test_Package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Package.BOM_Actions_Button_Functions;
import POM_Package.BOM_Functions;
import POM_Package.Login_Quoteplan;
import POM_Package.Logout_Quoteplan;
import POM_Package.ViewModify;
import Utility_Package.Utility_Class_PB;

public class Test_Class_For_BOM_Actions_Button_Functions {
	
	WebDriver driver;
	ViewModify VM;
	BOM_Functions bom;
	BOM_Actions_Button_Functions LR; 
	
	
	
	
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
		LR = new BOM_Actions_Button_Functions(driver);
		
	}
	@Test(priority=1)
	public void LockRevision_Functionality() throws InterruptedException, IOException
	{
		String TCName = "LockRevision_Functionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonLockRevisionBOM();
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=2)
	public void Revision_Comparison_Functionality() throws InterruptedException, IOException
	{
		String TCName = "Revision_Comparison_Functionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonRevisionComparisonBOM();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=3)
	public void Open_Revision_Functionality() throws InterruptedException, IOException
	{
		String TCName = "Open_Revision_Functionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonOpenRevisionBOM();
		Thread.sleep(1000);
		LR.ClickonCloseORBOM();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=4)
	public void Item_Documents_Funcionality() throws InterruptedException, IOException
	{
		String TCName = "Item_Documents_Funcionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonItemDocumentsBOM();
		Thread.sleep(1000);
		LR.ClickonDescriptionLinkBOM();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=5)
	public void FindandReplaceBOM_Funcionality() throws InterruptedException, IOException
	{
		String TCName = "FindandReplaceBOM_Funcionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonFindandReplaceBOM();
		Thread.sleep(1000);
		LR.ClickonItemIDBoxBOM();
		Thread.sleep(1000);
		LR.EntersearchboxOIDBOM();
		Thread.sleep(1000);
		LR.ClickonsearchbtnOIDBOM();
		Thread.sleep(3000);
		LR.ClickOriginalItemBOM();
		Thread.sleep(1000);
		LR.ClickonREItemIDBoxBOM();
		Thread.sleep(1000);
		LR.EntersearchboxREIDBOM();
		Thread.sleep(1000);
		LR.ClickonsearchbtnREIDBOM();
		Thread.sleep(1000);
		LR.ClickReplacementItemBOM();
		Thread.sleep(1000);
		LR.ClickReplaceBOMItembtn();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=6)
	public void AddNewBtn_Funcionality() throws InterruptedException, IOException
	{
		String TCName = "AddNewBtn_Funcionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonFindandReplaceBOM();
		Thread.sleep(1000);
		LR.ClickonDeleteBtn();
		Thread.sleep(1000);
		LR.ClickonAddNewBtn();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=7)
	public void DeleteBtn_Funcionality() throws InterruptedException, IOException
	{
		String TCName = "DeleteBtn_Funcionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonFindandReplaceBOM();
		Thread.sleep(1000);
		LR.ClickonDeleteBtn();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=8)
	public void Item_DocumentsLink_Funcionality() throws InterruptedException, IOException
	{
		String TCName = "Item_DocumentsLink_Funcionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonItemDocumentsBOM();
		Thread.sleep(1000);
		LR.ClickonDocumentsLinkBOM();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=9)
	public void Synch_DiscPrice_Funcionality() throws InterruptedException, IOException
	{
		String TCName = "Synch_DiscPrice_Funcionality";
		VM.ClickOnMenu();                     
		Thread.sleep(1000);
		VM.ClickOnProjectBOM();
		Thread.sleep(1000);
		VM.ClickOnViewModify();
		Thread.sleep(6000);
		bom.ClickonBOM();
		Thread.sleep(6000);
		LR.ClickonActionsbtnBOM();
		Thread.sleep(1000);
		LR.ClickonSynch_BOM();
		Thread.sleep(1000);
		LR.ClickonDiscpriceBOM();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		Thread.sleep(1000);
		LR.ClickonSavebtnBOM();
		System.out.println("Pass");
		Thread.sleep(1000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
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
