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

import POM_Package.Create_Project;
import POM_Package.Login_Quoteplan;
import POM_Package.Logout_Quoteplan;
import POM_Package.ViewModify;
import Utility_Package.Utility_Class_PB;

public class Test_Class_ViewModify_Search_Function {
	WebDriver driver;
	ViewModify VM;
	
	
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
		Thread.sleep(1000);
	}
	@BeforeMethod
	public void LoginFunction() throws EncryptedDocumentException, IOException
	{
		Login_Quoteplan li = new Login_Quoteplan(driver);	
		li.EnterUsername(Utility_Class_PB.GetExcelsheetDataProject("Project", 1, 1));
		li.EnterPassword(Utility_Class_PB.GetExcelsheetDataProject("Project", 2, 1));
		li.ClickOnLogin();
	    VM = new ViewModify(driver);
	}
    @Test(priority=1)
	public void SimpleSearch_Function() throws InterruptedException, EncryptedDocumentException, IOException
	{
    	String TCName = "SimpleSearch_Function_ValidData";
    	String TCName1 = "SimpleSearch_Function_InvalidData";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.EnterOnSearchBoxVM1(Utility_Class_PB.GetExcelsheetDataProject("Project", 3, 1));
		Thread.sleep(1000);
		VM.ClickOnSearchBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
		VM.EnterOnSearchBoxVM();
		Thread.sleep(1000);
		VM.ClickOnSearchBtnVM();
		Thread.sleep(2000);
		VM.EnterOnSearchBoxVM1(Utility_Class_PB.GetExcelsheetDataProject("Project", 4, 1));
		Thread.sleep(1000);
		VM.ClickOnSearchBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName1);
		
	}
    @Test(priority=2)
    public void AdvancedSearch_Function_ByProjectNo() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByProjectNo";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterVM();
		VM.SelectFilterEqualORLikeVM();
		VM.EnterProjectNOVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 3, 1));
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=3)
    public void AdvancedSearch_Function_ByProjectName() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByProjectName";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterPname();
		VM.SelectFilterEqualORLikePName();
		VM.EnterProjectName(Utility_Class_PB.GetExcelsheetDataProject("Project", 5, 1));
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=4)
    public void AdvancedSearch_Function_ByCustomer() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByCustomer";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterCustomer();
		VM.SelectFilterEqualORLikeCustomer();
		VM.EnterCustomerName(Utility_Class_PB.GetExcelsheetDataProject("Project", 6, 1));
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=5)
    public void AdvancedSearch_Function_ByDateCreated() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByDateCreated";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterDateCreated();
		VM.SelectFilterEqualORLikeDateCreated();
		VM.ClickOnCalenderBoxVM();
		VM.SelectMonthDCVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 7, 1));
		VM.SelectYearDCVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 8, 1));
		VM.ClickOnDayDCVM();
		VM.ClickOnEndDayDCVM();
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=6)
    public void AdvancedSearch_Function_ByModifiedDate() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByModifiedDate";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterModifiedDate();
		VM.SelectFilterEqualORLikeModifiedDate();
		VM.ClickOnCalenderBoxModifiedDateVM();
		VM.SelectMonthModifiedDateVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 9, 1));
		VM.SelectYearModifiedDateVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 10, 1));
		VM.ClickOnDayModifiedDateVM();
		VM.ClickOnEndDayModifiedDateVM();
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=7)
    public void AdvancedSearch_Function_ByDueDate() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByDueDate";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterDueDate();
		VM.SelectFilterEqualORLikeDueDate();
		VM.ClickOnCalenderBoxDueDateVM();
		VM.SelectDueDateVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 11, 1));
		VM.SelectYearDueDateVM1(Utility_Class_PB.GetExcelsheetDataProject("Project", 12, 1));
		VM.ClickOnStartDayDueDateVM();
		VM.ClickOnEndDueDateDateVM();
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=8)
    public void AdvancedSearch_Function_ByQuotationSendDate() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByQuotationSendDate";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterQuotationSD();
		VM.SelectFilterEqualORLikeQuotationSD();
		VM.ClickOnCalenderBoxQuotationSDVM();
		VM.SelectQuotationSDVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 13, 1));
		VM.SelectYearQuotationSDVM1(Utility_Class_PB.GetExcelsheetDataProject("Project", 14, 1));
		VM.ClickOnStartDayQuotationSDVM();
		VM.ClickOnEndQuotationSDVM();
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=9)
    public void AdvancedSearch_Function_ByStatus() throws InterruptedException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByStatus";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterStatusSD();
		VM.SelectFilterEqualORLikeStatusSD();
		VM.ClickOnStatusVM();
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=10)
    public void AdvancedSearch_Function_ByChangeONo() throws InterruptedException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByChangeONo";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterChangeONo();
		VM.EnterOnSearchBoxChangeONo(Utility_Class_PB.GetExcelsheetDataProject("Project", 15, 1));
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority=11)
    public void AdvancedSearch_Function_ByPM() throws InterruptedException, IOException
    {
    	String TCName = "AdvancedSearch_Function_ByPM";
    	VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnAdvanceBtnVM();
		VM.SelectFilterPM();
		VM.EnterOnSearchBoxPM(Utility_Class_PB.GetExcelsheetDataProject("Project", 17, 1));
		Thread.sleep(1000);
		VM.ClickOnApplyBtnVM();
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
    }
    @Test(priority = 11)
	public void SortingFuncton() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNoSort();
		Thread.sleep(1000);
		VM.ClickOnProjectNameSort();
		Thread.sleep(1000);
		VM.ClickOnQuotationNumberSort();
		Thread.sleep(1000);
		VM.ClickOnCustomerNameSort();
		Thread.sleep(1000);
		VM.ClickOnDateCreatedSort();
		Thread.sleep(1000);
		VM.ClickOnDateModifiedSort();
		Thread.sleep(1000);
		VM.ClickOnQuotationSendDateSort();
		Thread.sleep(1000);
		VM.ClickOnDueDateSortSort();
		Thread.sleep(1000);
		VM.ClickOnStatusSort();
		Thread.sleep(1000);
		VM.ClickOnQuickbooksOnlineIdSort();
		
	}
	@Test(priority = 12)
	public void FilterFunction() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Filter Function By Project NO";
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNoFilter();
		Thread.sleep(1000);
		VM.SelectEqualLikeProjectNoFilterVM();
		Thread.sleep(1000);
		VM.EnterProjectNoFilterBox(Utility_Class_PB.GetExcelsheetDataProject("Project", 3, 1));
		Thread.sleep(1000);
		VM.ClickOnProjectNoFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName);
		VM.ClickOnProjectNoFilter();
		Thread.sleep(1000);
		VM.ClickOnProjectNoClearBtn();
		Thread.sleep(3000);
	
		String TCName1 = "Filter Function By Project Name";
		VM.ClickOnProjectNameFilter();
		Thread.sleep(1000);
		VM.SelectEqualLikeProjectNameFilterVM();
		Thread.sleep(1000);
		VM.EnterProjectNameFilterBox(Utility_Class_PB.GetExcelsheetDataProject("Project", 5, 1));
		Thread.sleep(1000);
		VM.ClickOnProjectNammeFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName1);
		VM.ClickOnProjectNameFilter();
		Thread.sleep(1000);
		VM.ClickOnProjectNameClearBtn();
		Thread.sleep(3000);

		String TCName2 = "Filter Function By Quotation No";
		VM.ClickOnQuotationNumberFilter();
		Thread.sleep(1000);
		VM.SelectEqualLikeQuotationNumberFilterVM();
		Thread.sleep(2000);
		VM.EnterQuotationNumbeFilterBox(Utility_Class_PB.GetExcelsheetDataProject("Project", 17, 1));
		Thread.sleep(1000);
		VM.SelectSortByQuotationNumberVM();
		Thread.sleep(1000);
        VM.ClickOnQuotationNumberFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName2);
        Thread.sleep(1000);
        VM.ClickOnQuotationNumberFilter();
        Thread.sleep(1000);
        VM.ClickOnQuotationNumberClearBtn();
	    Thread.sleep(3000);
		
		String TCName3 = "Filter Function By Customer";
		VM.ClickOnCustomerFilter();
		Thread.sleep(1000);
		VM.SelectEqualLikeCustomerFilterVM();
		Thread.sleep(1000);
		VM.EnterCustomerFilterBox(Utility_Class_PB.GetExcelsheetDataProject("Project", 6, 1));
		Thread.sleep(1000);
		VM.ClickOnCustomerFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName3);
		VM.ClickOnCustomerFilter();
		Thread.sleep(1000);
		VM.ClickOnCustomerClearBtn();
		Thread.sleep(2000);
		
		String TCName4 = "Filter Function By Date Created";
		VM.ClickOnDateCreatedFilter();
		VM.SelectEqualLikeSelectEqualLikeDateCreatedFilterVM();
		Thread.sleep(1000);
		VM.ClickonDateCreatedBox();
		Thread.sleep(1000);
		VM.SelectMonthDateCreatedVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 7, 1));
		VM.SelectYearDateCreatedVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 8, 1));
		VM.ClickonDateDC();
		Thread.sleep(1000);
		VM.SelectSortByDateCreatedVM();
		VM.ClickOnDateCreatedFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName4);
		VM.ClickOnDateCreatedFilter();
		VM.ClickOnDateCreatedClearBtn();
		Thread.sleep(2000);

		String TCName5 = "Filter Function By Date Modified";
		VM.ClickOnDateModifiedFilter();
		VM.SelectEqualLikeDateModifiedFilterVM();
		Thread.sleep(1000);
		VM.ClickonDateModifiedBox();
		Thread.sleep(1000);
		VM.SelectMonthDateModifiedVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 9, 1));
		VM.SelectYearDateModifiedVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 10, 1));
		VM.ClickonDateDM();
		Thread.sleep(1000);
		VM.ClickOnDateModifiedFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName5);
		VM.ClickOnDateModifiedFilter();
		VM.ClickOnDateModifiedClearBtn();
		Thread.sleep(2000);

		String TCName6 = "Filter Function By Due Date";
		VM.ClickOnDueDateFilter();
		VM.SelectEqualLikeDueDateFilterVM();
		Thread.sleep(1000);
		VM.ClickonDueDateBox();
		Thread.sleep(1000);
		VM.SelectMonthDueDateVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 11, 1));
		VM.SelectYearDueDateVM(Utility_Class_PB.GetExcelsheetDataProject("Project", 12, 1));
		VM.ClickonDateDD();
		Thread.sleep(1000);
		VM.SelectSortByDueDateVM();
		VM.ClickOnDueDateFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName6);
		VM.ClickOnDueDateFilter();
		VM.ClickOnDueDateClearBtn();
		Thread.sleep(2000);
	
		String TCName7 = "Filter Function By Status";
		VM.ClickOnStatusFilter();
		Thread.sleep(1000);
		VM.ClickOnStatusType();
		Thread.sleep(1000);
		VM.ClickOnStatusFilterBtn();
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotProject(driver, TCName7);
		VM.ClickOnStatusFilter();
		VM.ClickOnStatusClearBtn();
		
		
	}
    @AfterMethod
	public void LogoutFunction()
	{
    	Logout_Quoteplan lo = new Logout_Quoteplan(driver);
		lo.clickonadminprofile();
		lo.clickonlogoutbtn();
	}
    @AfterClass
	public void closebrowserfunction()
	{
		driver.close();
		
	}
}
