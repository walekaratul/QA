package Test_Package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
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

public class Test_Class_PB {
	WebDriver driver;
	Create_Project CP;
	ViewModify VM;
	
	
	@BeforeClass
	public void BrowserOpenFunction() throws InterruptedException
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
	    CP = new Create_Project(driver);
	    VM = new ViewModify(driver);
	
	}
	@Test(priority = 1)
	public void Create_ProjectPB() throws IOException, InterruptedException
	{
		String TCName = "Create_Project";
		CP.ClickOnMenu();
		CP.ClickOnProjectBOM();
		CP.ClickOnCreateProject();
		Thread.sleep(1000);
		CP.EnterProjectNo();
		CP.EnterProjectName();
		CP.ClickOnCustomerBox();
		Thread.sleep(5000);
		CP.ClickOnSelectProject();
		CP.SelectStatus();
		CP.EnterProjectComments();
		CP.EnterQuotationNo();
		Thread.sleep(1000);
		CP.ClickOnDateCreatedBox();
		CP.SelectMonthForDateCreated();
		CP.SelectYearForDateCreated();
		CP.ClickOnDayForDateCreated();
		Thread.sleep(1000);
		CP.ClickOnDateModifiedBox();
		CP.SelectMonthForDateModified();
		CP.SelectYearForDateModified();
		CP.ClickOnDayForDateModified();
		Thread.sleep(1000);
		CP.ClickOnDueDate();
		CP.SelectMonthForDueDate();
		CP.SelectYearForDueDate();
		CP.ClickOnDayForDueDate();
		Thread.sleep(1000);
		CP.ClickOnDateShippedBox();
		CP.SelectMonthForDateShipped();
		CP.SelectYearForDateShipped();
		CP.ClickOnDayForDateShipped();
		Thread.sleep(1000);
		CP.ClickOnQuotationSendDateBox();
		CP.SelectMonthForQuotationSendDate();
		CP.SelectYearForQuotationSendDate();
		CP.ClickOnDayForQuotationSendDate();
		Thread.sleep(1000);
		CP.EnterOnSalesPerson();
		Thread.sleep(1000);
		CP.ClickOnSaveProject();
		System.out.println("Create Project Test Pass");
		Thread.sleep(3000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=2)
	public void CopyAndCreateFunction() throws InterruptedException, IOException
	{
		String TCName = "CopyAndCreateFunction";
		CP.ClickOnMenu();
		CP.ClickOnProjectBOM();
		CP.ClickOnCreateProject();
		CP.ClickOnCopyAndCreateButton();
		CP.ClickOnSelectProject1Button();
		Thread.sleep(2000);
		CP.AcceptAlert(driver);
		Thread.sleep(2000);
		CP.EnterOnProjectName1();
//		CP.DismisAlert(driver);
		Thread.sleep(5000);
		CP.ClickOnSaveProject1();
		System.out.println("CopyAndCreateFunction Test Pass");
		Thread.sleep(3000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=3)
	public void CreateNewContactFunction() throws InterruptedException, IOException
	{
		String TCName = "CreateNewContactFunction";
		CP.ClickOnMenu();
		CP.ClickOnProjectBOM();
		CP.ClickOnCreateProject();
		CP.ClickOnCustomerBox();
		Thread.sleep(5000);
		CP.ClickOnSelectProject();
		Thread.sleep(2000);
		CP.ClickOnCreateNewButtonBtnCNC();
		CP.EnterEmailCNC();
		CP.EnterDepartmentCNC();
		CP.EnterOfficePhoneCNC();
		CP.EnterMobileCNC();
		CP.SelectStatusCNC1();
		CP.EnterFirstNameCNC();
		CP.EnterLastNameCNC();
		CP.EnterDesignationCNC();
		CP.EnterPrimaryPhoneCNC();
		CP.EnterFax1CNC();
		CP.EnterCommentsCNC();
		Thread.sleep(2000);
		CP.EnterExtraField2CNCEF();
		CP.EnterStreetCNCEF();
		CP.EnterCityCNCEF();
		CP.EnterStateProvinceCNCEF();
		CP.EnterPostalCodeCNCEF();
		CP.EnterCuntryCNCEF();
		CP.EntermaillingstreetCNCEF();
		CP.EntermaillingcityCNCEF();
		CP.EnterMaillingStateProvinceCNCEF();
		CP.EnterMaillingPostalCodeCNCEF();
		CP.EnterMaillingCountryCNCEF();
		
		//CP.ClickOnCreateNewCNCEF();
		//CP.ClickOnCancelEFCNCEF();
		System.out.println("CreateNewContactFunction Test Pass");
		Thread.sleep(3000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}
	@Test(priority=4)
	public void CreateProjectforNewcustomer() throws InterruptedException, IOException
	{
		String TCName = "CreateNewContactFunction";
		CP.ClickOnMenu();
		CP.ClickOnProjectBOM();
		CP.ClickOnCreateProject();
		CP.ClickOnCustomerBox();
		Thread.sleep(5000);
		CP.ClickOnNewButton();
		Thread.sleep(1000);
		CP.EnterNameForCNC();
		CP.EnterPhoneNo();
		CP.EnterCommensForNewCustomer();
		CP.ClikOnDiscountBox();
		CP.SelectDiscountSegment();
		CP.SelectEntityTypeCNC();
		CP.EnterFaxCNC();
		CP.SelectStatusCNC();
		CP.EnterOfficeAddress1CNC();
		CP.EnterOfficeAddress3CNC();
		CP.EnterStateCNC();
		CP.EnterZipCNC();
		CP.EnterOfficeAddress2CNC();
		CP.EnterCityCNC();
		CP.EnterCountryCNC();
		CP.EnterURLCNC();
		CP.EnterShippingAddress4CNC();
		CP.EnterShippingAddress5CNC();
		CP.EnterShippingStateCNC();
		CP.EnterShippingZipCNC();
		CP.EnterShippingAddress6CNC();
		CP.EnterShippingCityCNC();
		CP.EnterShippingCountryCNC();
		Thread.sleep(1000);
		CP.ClickOnExtraField();
		CP.SelectPaymentTermsEF();
		CP.EnterMobileNoEF();
		CP.EnterWebsiteEF();
		CP.EnterContactPersonAddressEF();
		CP.EnterContactPersonMailingAddressEF();
		CP.EnterContactPersonPhoneEF();
		CP.EnterContactPersonMobileEF();
		CP.EnterContactPersonEmailEF();
		CP.EnterContactPersonTitleEF();
		CP.EnterContactPersonName2EF();
		CP.EnterContactPersonAddress2EF();
		CP.EnterContactPersonMailAddress2EF();
		CP.EnterContactPersonPhone2EF();
		CP.EnterContactPersonMobile2EF();
		CP.EnterContactPersonEmail2EF();
		CP.EnterContactPersonTitle2EF();
		CP.EnterContactPersonName3EF();
		CP.EnterContactPersonAddress3EF();
		CP.EnterContactPersonMailAddress3EF();
		CP.EnterContactPersonPhone3EF();
		CP.EnterContactPersonMobile3EF();
		CP.EnterContactPersonEmail3EF();
		CP.EnterContactPersonTitle3EF();
		CP.EnterContactPersonName4EF();
		CP.EnterContactPersonAddress4EF();
		CP.EnterContactPersonMailAddress4EF();
		CP.EnterContactPersonPhone4EF();
		CP.EnterContactPersonMobile4EF();
		CP.EnterContactPersonEmail4EF();
		CP.EnterContactPersonTitle4EF();
		CP.EnterContactPersonName5EF();
		CP.EnterContactPersonAddress5EF();
		CP.EnterContactPersonMailAddress5EF();
		CP.EnterContactPersonPhone5EF();
		CP.EnterContactPersonMobile5EF();
		CP.EnterContactPersonEmail5EF();
		CP.EnterContactPersonTitle5EF();
		CP.EnterContactPersonName6EF();
		CP.EnterContactPersonAddress6EF();
		CP.EnterContactPersonMailAddress6EF();
		CP.EnterContactPersonPhone6EF();
		CP.EnterContactPersonMobile6EF();
		CP.EnterContactPersonEmail6EF();
		CP.EnterContactPersonTitle6EF();
		CP.EnterContactPersonName7EF();
		CP.EnterContactPersonAddress7EF();
		CP.EnterContactPersonMailAddress7EF();
		CP.EnterContactPersonPhone7EF();
		CP.EnterContactPersonMobile7EF();
		CP.EnterContactPersonEmail7EF();
		CP.EnterContactPersonTitle7EF();
		CP.EnterContactPersonName8EF();
		CP.EnterContactPersonAddress8EF();
		CP.EnterContactPersonMailAddress8EF();
		CP.EnterContactPersonPhone8EF();
		CP.EnterContactPersonMobile8EF();
		CP.EnterContactPersonEmail8EF();
		CP.EnterContactPersonTitle8EF();
		CP.EnterContactPersonName9EF();
		CP.EnterContactPersonAddress9EF();
		CP.EnterContactPersonMailAddress9EF();
		CP.EnterContactPersonPhone9EF();
		CP.EnterContactPersonMobile9EF();
		CP.EnterContactPersonEmail9EF();
		CP.EnterContactPersonTitle9EF();
		
		//CP.ClickOnCreateNewBtnEF();
		CP.ClickOnSaveAndCreateContactBtnEF();
		Thread.sleep(3000);
		CP.EnterContactFirstNameCNCF();
		CP.EnterContactEmailCNFC();
		CP.ClickOnCreateNew1CNCF();
		Thread.sleep(3000);
		CP.EnterProjectName2CNFC();
		Thread.sleep(3000);
		CP.ClickOnSave1CNCF();
		//CP.ClickOnCancelBtnEF();
		System.out.println("CreateNewContactFunction Test Pass");
		Thread.sleep(3000);
		Utility_Class_PB.Takesscreeenshot(driver, TCName);
	}

	@Test(priority =7)
	public void NewFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnNewBtnVM();
		
	}
	@Test(priority =8)
	public void ExportFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnExportBtnVM();
		
	}
//	@Test(priority = 9)
//	public void SortingFuncton() throws InterruptedException
//	{
//		VM.ClickOnMenu();
//		VM.ClickOnProjectBOM();
//		VM.ClickOnViewModify();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNoSort();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNameSort();
//		Thread.sleep(1000);
//		VM.ClickOnQuotationNumberSort();
//		Thread.sleep(1000);
//		VM.ClickOnCustomerNameSort();
//		Thread.sleep(1000);
//		VM.ClickOnDateCreatedSort();
//		Thread.sleep(1000);
//		VM.ClickOnDateModifiedSort();
//		Thread.sleep(1000);
//		VM.ClickOnQuotationSendDateSort();
//		Thread.sleep(1000);
//		VM.ClickOnDueDateSortSort();
//		Thread.sleep(1000);
//		VM.ClickOnStatusSort();
//		Thread.sleep(1000);
//		VM.ClickOnQuickbooksOnlineIdSort();
//		
//	}
//	@Test(priority = 10)
//	public void FlterFunction() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		VM.ClickOnMenu();
//		VM.ClickOnProjectBOM();
//		VM.ClickOnViewModify();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNoFilter();
//		Thread.sleep(1000);
//		VM.SelectEqualLikeProjectNoFilterVM();
//		Thread.sleep(1000);
//		VM.EnterProjectNoFilterBox();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNoFilterBtn();
//		Thread.sleep(3000);
//		VM.ClickOnProjectNoFilter();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNoClearBtn();
//		Thread.sleep(2000);
//		
//		VM.ClickOnProjectNameFilter();
//		Thread.sleep(1000);
//		VM.SelectEqualLikeProjectNameFilterVM();
//		Thread.sleep(1000);
//		VM.EnterProjectNameFilterBox(Utility_Class_PB.GetExcelsheetDataProject("Project", 5, 1));
//		Thread.sleep(1000);
//		VM.ClickOnProjectNammeFilterBtn();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNameFilter();
//		Thread.sleep(1000);
//		VM.ClickOnProjectNameClearBtn();
//		Thread.sleep(2000);
//		
//		VM.ClickOnQuotationNumberFilter();
//		Thread.sleep(1000);
//		VM.SelectEqualLikeQuotationNumberFilterVM();
//		Thread.sleep(2000);
//		VM.EnterQuotationNumbeFilterBox();
//		Thread.sleep(1000);
//		VM.SelectSortByQuotationNumberVM();
//		Thread.sleep(1000);
//        VM.ClickOnQuotationNumberFilterBtn();
//        Thread.sleep(1000);
//        VM.ClickOnQuotationNumberFilter();
//        Thread.sleep(1000);
//        VM.ClickOnQuotationNumberClearBtn();
//		Thread.sleep(2000);
//		
//		VM.ClickOnCustomerFilter();
//		Thread.sleep(1000);
//		VM.SelectEqualLikeCustomerFilterVM();
//		Thread.sleep(1000);
//		VM.EnterCustomerFilterBox();
//		Thread.sleep(1000);
//		VM.ClickOnCustomerFilterBtn();
//		Thread.sleep(3000);
//		VM.ClickOnCustomerFilter();
//		Thread.sleep(1000);
//		VM.ClickOnCustomerClearBtn();
//		Thread.sleep(2000);
//		
//		VM.ClickOnDateCreatedFilter();
//		VM.SelectEqualLikeSelectEqualLikeDateCreatedFilterVM();
//		Thread.sleep(1000);
//		VM.ClickonDateCreatedBox();
//		Thread.sleep(1000);
//		VM.SelectMonthDateCreatedVM();
//		VM.SelectYearDateCreatedVM();
//		VM.ClickonDateDC();
//		Thread.sleep(1000);
//		VM.SelectSortByDateCreatedVM();
//		VM.ClickOnDateCreatedFilterBtn();
//		Thread.sleep(3000);
//		VM.ClickOnDateCreatedFilter();
//		VM.ClickOnDateCreatedClearBtn();
//		Thread.sleep(2000);
//		
//		VM.ClickOnDateModifiedFilter();
//		VM.SelectEqualLikeDateModifiedFilterVM();
//		Thread.sleep(1000);
//		VM.ClickonDateModifiedBox();
//		Thread.sleep(1000);
//		VM.SelectMonthDateModifiedVM();
//		VM.SelectYearDateModifiedVM();
//		VM.ClickonDateDM();
//		Thread.sleep(1000);
//		VM.ClickOnDateModifiedFilterBtn();
//		Thread.sleep(3000);
//		VM.ClickOnDateModifiedFilter();
//		VM.ClickOnDateModifiedClearBtn();
//		Thread.sleep(2000);
//		
//		VM.ClickOnDueDateFilter();
//		VM.SelectEqualLikeDueDateFilterVM();
//		Thread.sleep(1000);
//		VM.ClickonDueDateBox();
//		Thread.sleep(1000);
//		VM.SelectMonthDueDateVM();
//		VM.SelectYearDueDateVM();
//		VM.ClickonDateDD();
//		Thread.sleep(1000);
//		VM.SelectSortByDueDateVM();
//		VM.ClickOnDueDateFilterBtn();
//		Thread.sleep(3000);
//		VM.ClickOnDueDateFilter();
//		VM.ClickOnDueDateClearBtn();
//		
//		Thread.sleep(2000);
//		VM.ClickOnStatusFilter();
//		Thread.sleep(1000);
//		VM.ClickOnStatusType();
//		Thread.sleep(1000);
//		VM.ClickOnStatusFilterBtn();
//		Thread.sleep(3000);
//		VM.ClickOnStatusFilter();
//		VM.ClickOnStatusClearBtn();
//		
//		
//	}
	@Test(priority = 11)
	public void LoadMoreFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
	}
	@Test(priority=12)
	public void ProjectLinkFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLinkVM();
	}
	@Test(priority=13)
	public void BOB_And_MM_LinkFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectDataLinkBOMVM();
		Thread.sleep(5000);
		VM.ClickOnProjectBacklinkVM();
		Thread.sleep(2000);
		VM.ClickOnProjectDataLinkMMVM();
	}
	@Test(priority=13)
	public void EditBtnFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNameLink1VM();
		VM.ClickOnEditBtnVM();
		VM.SelectStatus1VM();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -100)");
		VM.ClickOnSaveBtnVM();
	}
	@Test(priority=14)
	public void DeleteProjectFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNameLink2VM();
		VM.ClickOnProjectActionBtnVM();
		VM.ClickOnProjectDeleteIconVM();
		VM.ClickOnProjectDeletePopupYesBtnVM();
		VM.ClickOnProjectDeletePopupNoBtnVM();	
	}
	@Test(priority=15)
	public void ShowBOMFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNameLink3VM();
		VM.ClickOnShowBOMBtnVM();
		
	}
	@Test(priority=16)
	public void Material_P_And_L_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink4VM();
		VM.ClickOnProject_P_And_LVM();
		Thread.sleep(1000);
		VM.ClickOnMaterialLinkVM();
		Thread.sleep(1000);
		VM.ClickOnExportMaterialActionsBtnVM();
		Thread.sleep(1000);
		VM.ClickOnExportMaterialCSVVM();
		
		
	}
	@Test(priority=16)
	public void Material_P_And_L_Function1() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink4VM();
		VM.ClickOnProject_P_And_LVM();
		Thread.sleep(1000);
		VM.ClickOnMaterialLinkVM();
		Thread.sleep(1000);
		VM.ClickOnExportMaterialActionsBtnVM();
		Thread.sleep(1000);
		VM.ClickOnExportMaterialPDFVM();	
	}
	
	@Test(priority=17)
	public void Labor_P_And_L_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink5VM();
		Thread.sleep(1000);
		VM.ClickOnProject_P_And_LVM();
		Thread.sleep(1000);
		VM.ClickOnLaborLinkVM();
		Thread.sleep(3000);
     	VM.ClickOnExportLaborBtnVM();
	}
	@Test(priority=18)
	public void Expense_P_And_L_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink6VM();
		Thread.sleep(1000);
		VM.ClickOnProject_P_And_LVM();
		Thread.sleep(1000);
		VM.ClickOnExpenseLinkVM();
		Thread.sleep(1000);
		VM.ClickOnLaborCodeLinkVM();
		Thread.sleep(1000);
		VM.ClickOnExportExpenseBtnVM();
		
	}
	@Test(priority=19)
	public void LoadProjectTaskActivityDataFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(2000);
		VM.ClickOnProjectNameLink7VM();
		VM.ClickOnProject_P_And_LVM();
		VM.ClickOnLoadProjectTaskActivityDataBtnVM();
		
	}
	@Test(priority=19)
	public void LoadProjectTaskActivityDataLoadMoreFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(2000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(2000);
		VM.ClickOnProjectNameLink7VM();
		Thread.sleep(1000);
		VM.ClickOnProject_P_And_LVM();
		Thread.sleep(1000);
		VM.ClickOnLoadProjectTaskActivityDataBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadProjectTaskActivityDataLoadMoreBtnVM();
		
	}
	@Test(priority=20)
	public void Project360_ProjectActivityFunction() throws InterruptedException, EncryptedDocumentException, IOException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.EnterOnSearchBoxVM1(Utility_Class_PB.GetExcelsheetDataProject("Project", 3, 1));
		Thread.sleep(1000);
		VM.ClickOnSearchBtnVM();
		Thread.sleep(2000);
		VM.ClickOnProjectNameLink8VM();
		Thread.sleep(1000);
		VM.ClickOnProject360TabVM();
		Thread.sleep(2000);
//		VM.ClickOnGRNLinkVM();                 //------GRN
		VM.ClickOnPOLinkVM();                  //-------PO
//		VM.ClickOnPRLinkVM();                  //-------PR
//		VM.ClickOnSOLinkVM();                  //-------SO
		
		
	}
	@Test(priority=21)
	public void Project360_ProjectActivityModulewiseFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink9VM();
		VM.ClickOnProject360TabVM();
		VM.ClickOnProjectActivityModulewiseTabVM();
		
		VM.ClickOnPRLink1VM();             //------PR
		Thread.sleep(1000);
		VM.ClickOnPRLink2VM();             //------PR
        VM.ClickOnSOLink1VM();             //------SO
		Thread.sleep(1000);
		VM.ClickOnSOLink2VM();             //------SO
		VM.ClickOnPOLink1VM();             //------PO
		Thread.sleep(1000);
		VM.ClickOnPOLink2VM();             //------PO
		
		                                   	
	}
	@Test(priority=22)
	public void Project360_ItemsActivityDetailsFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink9VM();
		VM.ClickOnProject360TabVM();
		VM.ClickOnItemsActivityDetailsTabVM();
		Thread.sleep(1000);
		VM.ClickOnExportItemsActivityDetailsBtnVM();
		
	}
	@Test(priority=23)
	public void Project360_ItemsActivitySummaryFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink11VM();
		VM.ClickOnProject360TabVM();
		VM.ClickOnItemsActivitySummaryTabVM();
		VM.ClickOnExportExportItemsActivitySummaryBtnVM();
		
	}
	@Test(priority=24)
	public void ProjectSettings_UserLaborTypeSelect_Multiple_UserFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink13VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnEditButtonUserlaborTypeVM();
		Thread.sleep(1000);
		VM.ClickOnSelectMultipleTaskUserButtonlaborTypeVM();
		Thread.sleep(1000);
		VM.ClickOnUserLTVM();
		Thread.sleep(1000);
		VM.ClickOnUserLTVM();
		Thread.sleep(1000);
		VM.ClickOnUserLTVM();	
	}
	@Test(priority=25)
	public void ProjectSettings_UserLaborTypeSelect_Global_LaborsFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink15VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnEditButtonUserlaborTypeVM();
		Thread.sleep(1000);
		VM.ClickOnSelectGlobalLaborsLTButtonlaborTypeVM();
		
	}
	
	@Test(priority=26)
	public void UserLaborTypeForBillableandLaborTypeCheckboxFunction() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink14VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnEditButtonUserlaborTypeVM();
		Thread.sleep(1000);
		VM.ClickOnBillableAllNOVM();        //----Billable All NO
		Thread.sleep(2000);
		
//		VM.ClickOnBillableAllYESVM();       //----Billable All YES
//		Thread.sleep(1000);
//		VM.ClickOnBillableSingleYESVM();     //----Billable YES NO
//		VM.ClickOnCancelButtonLTVM();        //--- Cancel
//		VM.ClickOnDeleteButtonLTVM();        //----Delete
//		VM.ClickOnSaveButtonLTVM();          //----Save
//		VM.ClickOnLaborTypeCheckBoxVM();     //---All Labor Type CheckBox
//		VM.ClickOnSingleCheckBoxVM();
		
		VM.ClickOnSelectButtonLTVM();
		Thread.sleep(1000);
		VM.ClickOnSelectUser1LTVM();
		
//		VM.ClickOnText1LTLTVM();
//		VM.ClickOnSelectUser1LTVM();
		
		
		
	}
	@Test(priority=27)
	public void ProjectSettings_UserTask_Function_For_SelectGlobalTask() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink12VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnUserTaskTabVM();
		VM.ClickOnEditButtonUTVM();
		VM.ClickOnSelectGlobalButtonUTVM();
		VM.EnterOnGlobalSearchBoxUTVM();
		Thread.sleep(1000);
		VM.ClickOnGlobalSearchBtnUTVM();
		Thread.sleep(1000);
		VM.ClickOnTaskNameUTVM();
		Thread.sleep(1000);
		VM.ClickOnOKBtnUTVM();
		
//		VM.ClickOnCnacelBtnUTVM();
		
		VM.ClickOnCancelBtn1UTVM();
		
//		VM.ClickOnYesBtnUTVM();
	
	}
	@Test(priority=28)
	public void ProjectSettings_UserTask_Function_For_SelectMultipleTasks() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink16VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnUserTaskTabVM();
		VM.ClickOnEditButtonUTVM();
		VM.ClickOnSelectMultipleTaskUserButtonUTVM();
		VM.EnterOnMultipleSearchBoxUTVM();
		VM.ClickOnMultipleSearchBtnUTVM();
		Thread.sleep(1000);
		
	    //VM.ClickOnMultipleTaskNameUTVM();
		
		VM.EnterOnMultipleSearchBox1UTVM();
		Thread.sleep(1000);
		VM.ClickOnMultipleSearchBtn1UTVM();
		Thread.sleep(2000);
		
		//VM.ClickOnMultipleUserNameUTVM();
		
		Thread.sleep(1000);
		
		//VM.ClickOnCancelTaskBtn1UTVM();
		
		VM.ClickOnOKTaskBtn1UTVM();	
	}
	@Test(priority=29)
	public void ProjectSettings_UserTask_Function_For_CreateNewTask_Local_Global() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		VM.ClickOnProjectNameLink17VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnUserTaskTabVM();
		VM.ClickOnEditButtonUTVM();
		VM.ClickOnCreateNewTaskBtnUTVM();
		VM.ClickOnGlobalLocalToggleBtnUTVM();
		VM.ClickOnEnterTaskNameGlobalLocalUTVM();
		Thread.sleep(1000);
		VM.ClickOnSaveToggleBtnUTVM();
		Thread.sleep(3000);
	//	VM.SelectStatusUTVM();
		Thread.sleep(3000);
		//VM.ClickOnCancelToggleBtnUTVM();
		
		VM.ClickOnSelectUserBtnUTVM();
		Thread.sleep(3000);
		VM.ClickOnEnterUserNameGlobalLocalUTVM();
		Thread.sleep(1000);
		VM.ClickOnSearchGlobalLocalBtnUTVM();
		Thread.sleep(1000);
		
		//VM.ClickOnCancelGlobalLocalBtnUTVM();
		
		VM.ClickOnOKGlobalLocalBtnUTVM();
		Thread.sleep(1000);
		VM.ClickOnSaveTaskBtnUTVM();
		Thread.sleep(3000);
		VM.ClickOnSaveModifyTaskBtnUTVM();
		Thread.sleep(3000);
		VM.ClickOnEditButtonUTVM();
		Thread.sleep(3000);
		VM.SelectStatusUTVM();
		Thread.sleep(1000);
		VM.ClickOnSaveTaskBtnUTVM();
		Thread.sleep(1000);
		VM.ClickOnSaveModifyTaskBtnUTVM();
		Thread.sleep(1000);
		
	//	VM.ClickOnDeleteTaskToggleBtnUTVM();
	
	}
	@Test(priority=30)
	public void ProjectSettings_AddTaskLabor_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink18VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnTaskLaborBtnVM();
		VM.ClickOnEditBtnTLVM();
		VM.ClickOnAddTaskBtnTLVM();
		Thread.sleep(1000);
		VM.SelectTaskUTVM();
		Thread.sleep(1000);
		VM.ClickOnAddMaterialLaborBtnTLVM();
		Thread.sleep(1000);
		VM.SelectLaborUTVM();
		Thread.sleep(1000);
		VM.EnterOnBOMValueTLVM();
		Thread.sleep(1000);
//		VM.ClickOnSaveBtnTLVM();
		
		VM.ClickOnCancelBtnTLVM();
		
	}
	@Test(priority=31)
	public void ProjectSettings_DeleteTaskLabor_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink19VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnTaskLaborBtnVM();
		VM.ClickOnEditBtnTLVM();
		Thread.sleep(2000);
		VM.ClickOnDeleteTaskToggleBtnLTVM();
		
		VM.ClickOnDeleteTaskYesLTVM();
		VM.ClickOnDeleteTaskNoLTVM();
			
	}
	@Test(priority=32)
	public void ProjectSettings_SelectApprover_Client_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink20VM();
		VM.ClickOnProjectSettingsTabVM();
		VM.ClickOnSelectApproverVM();
		Thread.sleep(1000);
		VM.ClickOnEditBtnSAVM();
		Thread.sleep(1000);
		VM.SelectClientSAVM();
		Thread.sleep(3000);
		VM.SelectProjectManagerSAVM();
//		VM.ClickOnSaveApproverBtnSAVM();
//		VM.ClickOnApproveYesBtnSAVM();
//		
//		VM.ClickOnApproveCancelBtnSAVM();
//		
//		VM.ClickOnCancelApproverBtnSAVM();
		
	}
	@Test(priority=33)
	public void Activities_LogActivity__Call_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNameLink21VM();
		VM.ClickOnActivitiesTabVM();
		Thread.sleep(1000);
		VM.ClickOnLogActivityTabVM();
		Thread.sleep(2000);
		VM.ClickOnCallBtnLAVM();
		Thread.sleep(2000);
		VM.EnterOnCallNoteLAVM();
		Thread.sleep(1000);
		VM.SelectCallStatusLAVM();
		Thread.sleep(1000);
		VM.ClickOnCallFollowupDateBoxLAVM();
		Thread.sleep(1000);
		VM.SelectMonthLAVM();
		VM.SelectYearLAVM();
		VM.ClickOnDayLAVM();
		Thread.sleep(2000);
		VM.SelectChampionsLAVM();
		Thread.sleep(1000);
		VM.ClickOnSaveCallSymbolLAVM();
		//VM.ClickOnDeleteCallLAVM();
			
	}
	@Test(priority=34)
	public void Activities_LogActivity__Email_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNameLink22VM();
		Thread.sleep(1000);
		VM.ClickOnActivitiesTabVM();
		Thread.sleep(1000);
		VM.ClickOnLogActivityTabVM();
		Thread.sleep(2000);
		VM.ClickOnEmailBtnVM();
		Thread.sleep(2000);
		VM.EnterOnEmailNoteLAVM();
		Thread.sleep(1000);
		VM.SelectEmailStatusVM();
		Thread.sleep(1000);
		VM.ClickOnEmailFollowupDateBoxLAVM();
		Thread.sleep(2000);
		VM.SelectEmailMonthLAVM();
		Thread.sleep(1000);
		VM.SelectEmailYearLAVM();
		Thread.sleep(1000);
		VM.ClickOnEmailDayLAVM();
		Thread.sleep(1000);
		VM.SelectSelectEmailChampionsLAVM();
		Thread.sleep(1000);	
		VM.ClickOnSaveEmailSymbolLAVM();
	//	VM.ClickOnDeleteEmailLAVM();
		}
	@Test(priority=35)
	public void Activities_LogActivity__Follow_up_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(5000);
		VM.ClickOnProjectNameLink23VM();
		Thread.sleep(1000);
		VM.ClickOnActivitiesTabVM();
		Thread.sleep(1000);
		VM.ClickOnLogActivityTabVM();
		Thread.sleep(2000);
		VM.ClickOnFollowupBtnnVM();
		Thread.sleep(1000);
		VM.EnterOnFolloewupNoteLAVM();
		Thread.sleep(1000);
		VM.SelectFollowupStatusVM();
		Thread.sleep(1000);
		VM.ClickOnFollowupDateBoxLAVM();
		Thread.sleep(1000);
		VM.SelectFollowupMonthLAVM();
		Thread.sleep(1000);
		VM.SelectFollowupYearLAVM();
		Thread.sleep(1000);
		VM.ClickOnFollowupDayLAVM();
		Thread.sleep(1000);
		VM.SelectFollowupChampionsLAVM();
		Thread.sleep(1000);
		VM.ClickOnSaveFollowupLAVM();
//		VM.ClickOnDeleteFollowupLAVM();
		
	}
	@Test(priority=36)
	public void Activities_Notes_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink24VM();
		VM.ClickOnActivitiesTabVM();
		VM.ClickOnNotesTabVM();
		Thread.sleep(2000);
		VM.ClickOnAddNewNoteBtnVM();
		Thread.sleep(2000);
		VM.ClickOnNoteBoxVM();
		Thread.sleep(2000);
		VM.EnterOnNoteBoxVM();
		Thread.sleep(1000);
		VM.ClickOnSaveNoteSymboolVM();
		VM.ClickOnCnacelNoteSymboolVM();
		
	}
	@Test(priority=37)
	public void Activities_Comment_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink25VM();
		VM.ClickOnActivitiesTabVM();
		VM.ClickOnNotesTabVM();
		
		//VM.ClickOnCommentSymboolVM();                    //-----Add comment
		//VM.ClickOnCommentBoxVM();
		//Thread.sleep(1000);
		//VM.EnterOnCommentBox1VM();
		//Thread.sleep(1000);
		
		//VM.ClickOnSaveCommentSymbool1VM();
		//VM.ClickOnCnacelCommentSymboolVM();
		
		Thread.sleep(1000);
		VM.ClickOnEditCommentSymboolVM();                //----Update comment
		Thread.sleep(2000);
		VM.ClickOnEditCommentBoxVM();
		Thread.sleep(2000);
		VM.EnterOnUpdateCommentVM();
		Thread.sleep(1000);
		VM.ClickOnSaveUpdateCommentVM();
		
//		VM.ClickOnCancelUpdateCommentVM();		
	}
	@Test(priority=38)
	public void Activities_Delete_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink26VM();
		VM.ClickOnActivitiesTabVM();
		VM.ClickOnNotesTabVM();
		Thread.sleep(1000);
		VM.ClickOnDeleteNotesVM();
		Thread.sleep(1000);
		VM.ClickOnDeleteYesBtnVM();
		
		VM.ClickOnDeleteNoBtnVM();
		
	}
	@Test(priority=38)
	public void Activities_Edit_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink27VM();
		VM.ClickOnActivitiesTabVM();
		VM.ClickOnNotesTabVM();
		Thread.sleep(1000);
		VM.ClickOnEditNotesSymboolVM();
		Thread.sleep(1000);
		VM.EnterOnEditNotesBoxVM();
		Thread.sleep(1000);
		
		VM.ClickOnCancelEditNotesSymbolVM();
		VM.ClickOnSaveEditNotesSymbolVM();
			
	}
	@Test(priority=38)
	public void Activities_Mail_MailHistory_Function() throws InterruptedException
	{
		VM.ClickOnMenu();
		VM.ClickOnProjectBOM();
		VM.ClickOnViewModify();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnLoadMoreBtnVM();
		Thread.sleep(1000);
		VM.ClickOnProjectNameLink28VM();
		VM.ClickOnActivitiesTabVM();
		VM.ClickOnNotesTabVM();
		Thread.sleep(1000);
		
		VM.ClickOnNoteEmailBtnVM();          //------Share Email
		Thread.sleep(5000);
		VM.ClickOnNoteEmailIDBoxVM();
		Thread.sleep(1000);
		VM.ClickOnSelectNotesUserIDVM();
		Thread.sleep(1000);
		
		VM.ClickOnShareNoteEmailIDBtnVM();
	    VM.ClickOnCloseNoteEmailIDBtnVM();
		
		VM.ClickOnShareNoteEmailLogSyambolVM();  //------Email Log
		Thread.sleep(1000);
		VM.ClickOnShareNoteEmailLogSyambolVM();
	}

//	@AfterMethod
//	public void LogoutFunction() throws IOException
//	{
//		
//		Logout_Quoteplan lo = new Logout_Quoteplan(driver);
//		lo.clickonadminprofile();
//		lo.clickonlogoutbtn();
//		
//	}
//	@AfterClass
//	public void BrowserCloseFunction()
//	{
//		driver.close();
//	}

}
