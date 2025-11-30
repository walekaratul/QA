package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ViewModify {
	
	@FindBy(xpath="//div[text()='Menu']")
	public WebElement Menu;
	public void ClickOnMenu()
	{
		Menu.click();
	}
	@FindBy(xpath="//a[@id='ui-id-6']")
	public WebElement ProjectBOM;
	public void ClickOnProjectBOM()
	{
		ProjectBOM.click();
	}
	@FindBy(xpath="//a[@id='edit-boms-link']")
	public WebElement ViewModify;
	public void ClickOnViewModify()
	{
		ViewModify.click();
		
	}
//-------------------------------------------------------Simple Search Function	
	@FindBy(xpath="//input[@id='project_search_text']")
	public WebElement SearchBoxVM;
	public void EnterOnSearchBoxVM()
	{
		SearchBoxVM.clear();
	}
	@FindBy(xpath="//input[@id='project_search_text']")
	public WebElement SearchBoxVM1;
	public void EnterOnSearchBoxVM1(String PNo)
	{
		SearchBoxVM.clear();
		SearchBoxVM.sendKeys(PNo);
		
	}
	@FindBy(xpath="//form[@id='project_search']//button[@id='search-project-btn']")
	public WebElement SearchBtnVM;
	public void ClickOnSearchBtnVM()
	{
		SearchBtnVM.click();
	}
//-------------------------------------------------------Advanced Search Function		
	@FindBy(xpath="//a[@onclick='showProjectAdvSearh();']")
	public WebElement AdvanceBtnVM;
	public void ClickOnAdvanceBtnVM()
	{
		AdvanceBtnVM.click();
	}
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterVM;
	public void SelectFilterVM()
	{
	  Select s1 = new Select(FilterVM);
	  s1.selectByVisibleText("project_no");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeVM;
	public void SelectFilterEqualORLikeVM()
	{
	  Select s2 = new Select(FilterEqualORLikeVM);
	  s2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement ProjectNOVM;
	public void EnterProjectNOVM(String PNo)
	{
		ProjectNOVM.sendKeys(PNo);
		
	}
//-------------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterPName;
	public void SelectFilterPname()
	{
	  Select PName = new Select(FilterPName);
	  PName.selectByVisibleText("project_name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikePName;
	public void SelectFilterEqualORLikePName()
	{
	  Select Pname1 = new Select(FilterEqualORLikePName);
	  Pname1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement ProjectName;
	public void EnterProjectName(String PName)
	{
		ProjectName.sendKeys(PName);
		
	}
//--------------------------------------------------------------Advanced Search By Customer
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterCustomer;
	public void SelectFilterCustomer()
	{
	  Select Customer = new Select(FilterCustomer);
	  Customer.selectByVisibleText("customer");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeCustomer;
	public void SelectFilterEqualORLikeCustomer()
	{
	  Select Customer1 = new Select(FilterEqualORLikeCustomer);
	  Customer1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement CustomerName;
	public void EnterCustomerName(String Customer)
	{
		CustomerName.sendKeys(Customer);
		
	}
//--------------------------------------------------------------Advanced Search by Date Created function
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterDateCreated;
	public void SelectFilterDateCreated()
	{
	  Select DateCreated = new Select(FilterDateCreated);
	  DateCreated.selectByVisibleText("date_created");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeDateCreated;
	public void SelectFilterEqualORLikeDateCreated()
	{
	  Select DateCreated1 = new Select(FilterEqualORLikeDateCreated);
	  DateCreated1.selectByVisibleText("BETWEEN");
	}
	
	@FindBy(xpath="//input[@class='search_string1 form-control hasDatepicker']")
	public WebElement CalenderBoxVM;
	public void ClickOnCalenderBoxVM()
	{
		CalenderBoxVM.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthDCVM;
	public void SelectMonthDCVM(String month)
	{
		Select s3 = new Select(SelectMonthDCVM);
		s3.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDCVM;
	public void SelectYearDCVM(String year)
	{
		Select s4 = new Select(SelectYearDCVM);
		s4.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='10'])[4]")
	public WebElement DayDCVM;
	public void ClickOnDayDCVM()
	{
		DayDCVM.click();
	}	
	@FindBy(xpath="(//a[text()='20'])[4]")
	public WebElement EndDayDCVM;
	public void ClickOnEndDayDCVM()
	{
		EndDayDCVM.click();
	}
//--------------------------------------------------------------Advanced Search by Modified Date function	
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterModifiedDate;
	public void SelectFilterModifiedDate()
	{
	  Select ModifiedDate = new Select(FilterModifiedDate);
	  ModifiedDate.selectByVisibleText("modified_date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeModifiedDate;
	public void SelectFilterEqualORLikeModifiedDate()
	{
	  Select ModifiedDate1 = new Select(FilterEqualORLikeModifiedDate);
	  ModifiedDate1.selectByVisibleText("BETWEEN");
	}
	
	@FindBy(xpath="//input[@class='search_string1 form-control hasDatepicker']")
	public WebElement CalenderBoxModifiedDateVM;
	public void ClickOnCalenderBoxModifiedDateVM()
	{
		CalenderBoxModifiedDateVM.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthModifiedDateVM;
	public void SelectMonthModifiedDateVM(String month)
	{
		Select ModifiedDate2 = new Select(SelectMonthModifiedDateVM);
		ModifiedDate2.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearModifiedDateVM;
	public void SelectYearModifiedDateVM(String year)
	{
		Select ModifiedDate3 = new Select(SelectYearModifiedDateVM);
		ModifiedDate3.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement DayModifiedDateVM;
	public void ClickOnDayModifiedDateVM()
	{
		DayModifiedDateVM.click();
	}	
	@FindBy(xpath="(//a[text()='20'])[4]")
	public WebElement EndDayModifiedDateVM;
	public void ClickOnEndDayModifiedDateVM()
	{
		EndDayModifiedDateVM.click();
	}
	
//--------------------------------------------------------------Advanced Search by Due Date function
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterDueDate;
	public void SelectFilterDueDate()
	{
	  Select DueDate = new Select(FilterDueDate);
	  DueDate.selectByVisibleText("due_date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeDueDate;
	public void SelectFilterEqualORLikeDueDate()
	{
	  Select DueDate1 = new Select(FilterEqualORLikeDueDate);
	  DueDate1.selectByVisibleText("BETWEEN");
	}
	
	@FindBy(xpath="//input[@class='search_string1 form-control hasDatepicker']")
	public WebElement CalenderBoxDueDateVM;
	public void ClickOnCalenderBoxDueDateVM()
	{
		CalenderBoxDueDateVM.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthDueDateVM;
	public void SelectDueDateVM(String month)
	{
		Select DueDate2 = new Select(SelectMonthDueDateVM);
		DueDate2.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDueDateVM1;
	public void SelectYearDueDateVM1(String year)
	{
		Select DueDate3 = new Select(SelectYearDueDateVM1);
		DueDate3.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement DayDueDateVM;
	public void ClickOnStartDayDueDateVM()
	{
		DayDueDateVM.click();
	}	
	@FindBy(xpath="(//a[text()='30'])[4]")
	public WebElement EndDayDueDateVM;
	public void ClickOnEndDueDateDateVM()
	{
		EndDayDueDateVM.click();
	}
//-------------------------------------------------------------Advanced Search By Quotation Send Date Function
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterQuotationSD;
	public void SelectFilterQuotationSD()
	{
	  Select QuotationSD = new Select(FilterQuotationSD);
	  QuotationSD.selectByVisibleText("quotation_send_date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeQuotationSD;
	public void SelectFilterEqualORLikeQuotationSD()
	{
	  Select QuotationSD1 = new Select(FilterEqualORLikeQuotationSD);
	  QuotationSD1.selectByVisibleText("BETWEEN");
	}
	
	@FindBy(xpath="//input[@class='search_string1 form-control hasDatepicker']")
	public WebElement CalenderBoxQuotationSDVM;
	public void ClickOnCalenderBoxQuotationSDVM()
	{
		CalenderBoxQuotationSDVM.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthQuotationSDVM;
	public void SelectQuotationSDVM(String month)
	{
		Select QuotationSD2 = new Select(SelectMonthQuotationSDVM);
		QuotationSD2.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearQuotationSDVM1;
	public void SelectYearQuotationSDVM1(String year)
	{
		Select QuotationSD3 = new Select(SelectYearQuotationSDVM1);
		QuotationSD3.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement DayQuotationSDVM;
	public void ClickOnStartDayQuotationSDVM()
	{
		DayQuotationSDVM.click();
	}	
	@FindBy(xpath="(//a[text()='30'])[4]")
	public WebElement EndDayQuotationSDVM;
	public void ClickOnEndQuotationSDVM()
	{
		EndDayQuotationSDVM.click();
	}
//-------------------------------------------------------------Advanced Search By Status Function
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterStatusSD;
	public void SelectFilterStatusSD()
	{
	  Select Status1 = new Select(FilterStatusSD);
	  Status1.selectByVisibleText("status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement FilterEqualORLikeStatusSD;
	public void SelectFilterEqualORLikeStatusSD()
	{
	  Select Status2 = new Select(FilterEqualORLikeStatusSD);
	  Status2.selectByVisibleText("=");
	}
	
	@FindBy(xpath="//select[@class='statusId advance-multiple-select search_string1 form-control']//option[text()='quotation']")
	public WebElement Status;
	public void ClickOnStatusVM()
	{
		Status.click();
	}
	@FindBy(xpath="//form[@id='project_adv_search']//input[@class='btn ru-create-new']")
	public WebElement ApplyBtnVM;
	public void ClickOnApplyBtnVM()
	{
		ApplyBtnVM.click();
	}
//------------------------------------------------------------Advanced search by Change order no
	
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterChangeONo;
	public void SelectFilterChangeONo()
	{
	  Select CON = new Select(FilterChangeONo);
	  CON.selectByVisibleText("change_req_no");
	}
	
	@FindBy(xpath="//table[@id='project_advance_search_filter']//input[@class='search_string1 form-control']")
	public WebElement SearchBoxChangeONo;
	public void EnterOnSearchBoxChangeONo(String CONo)
	{
		
		SearchBoxChangeONo.sendKeys(CONo);
		
	}
//------------------------------------------------------------Advanced search by PM
	@FindBy(xpath="//select[@onclick='ShowAdvanceDiv(this)']")
	public WebElement FilterPM;
	public void SelectFilterPM()
	{
	  Select PM = new Select(FilterPM);
	  PM.selectByVisibleText("pm");
	}
	
	@FindBy(xpath="//table[@id='project_advance_search_filter']//input[@class='search_string1 form-control']")
	public WebElement SearchBoxPM;
	public void EnterOnSearchBoxPM(String PM)
	{
		
		SearchBoxPM.sendKeys(PM);
		
	}
	
//-----------------------------------------------------------New Button Function	
		@FindBy(xpath="//a[@title='Create Project']")
		public WebElement NewBtn;
		public void ClickOnNewBtnVM()
		{
			NewBtn.click();
		} 
//-----------------------------------------------------------Export Button Function	
    @FindBy(xpath="//a[@id='project-download-link']")
    public WebElement ExportBtn;
	public void ClickOnExportBtnVM()
	{
		ExportBtn.click();
	} 
//-----------------------------------------------------------Sorting Function
	@FindBy(xpath="//th[@class='qp-advsearch-project']//div[@class='qp-sort']")
	public WebElement ProjectNoSort;
	public void ClickOnProjectNoSort()
	{
		ProjectNoSort.click();
	}
	@FindBy(xpath="//th[@data-sort='name']//div[@class='qp-sort']")
	public WebElement ProjectNameSort;
	public void ClickOnProjectNameSort()
	{
		ProjectNameSort.click();
	}
	@FindBy(xpath="//th[@data-sort='quotation_number']//div[@class='qp-sort']")
	public WebElement QuotationNumberSort;
	public void ClickOnQuotationNumberSort()
	{
		QuotationNumberSort.click();
	}
	@FindBy(xpath="//th[@data-sort='customer_name']//div[@class='qp-sort']")
	public WebElement CustomerNameSort;
	public void ClickOnCustomerNameSort()
	{
		CustomerNameSort.click();
	}
	@FindBy(xpath="//th[@data-sort='project.date_created']//div[@class='qp-sort']")
	public WebElement DateCreatedSort;
	public void ClickOnDateCreatedSort()
	{
		DateCreatedSort.click();
	}
	@FindBy(xpath="//th[@data-sort='project.date']//div[@class='qp-sort']")
	public WebElement DateModifiedSort;
	public void ClickOnDateModifiedSort()
	{
		DateModifiedSort.click();
	}
	@FindBy(xpath="//th[@data-sort='project.quotation_send_date']//div[@class='qp-sort']")
	public WebElement QuotationSendDateSort;
	public void ClickOnQuotationSendDateSort()
	{
		QuotationSendDateSort.click();
	}
	@FindBy(xpath="//th[@data-sort='project.due_date']//div[@class='qp-sort']")
	public WebElement DueDateSort;
	public void ClickOnDueDateSortSort()
	{
		DueDateSort.click();
	}
	@FindBy(xpath="//th[@data-sort='status']//div[@class='qp-sort']")
	public WebElement StatusSort;
	public void ClickOnStatusSort()
	{
		StatusSort.click();
	}
	@FindBy(xpath="//th[@data-sort='extra_fields']//div[@class='qp-sort']")
	public WebElement QuickbooksOnlineIdSort;
	public void ClickOnQuickbooksOnlineIdSort()
	{
		QuickbooksOnlineIdSort.click();
	}
//------------------------------------------------Filter Function	
	@FindBy(xpath="//div[@data-field='project_no']")
	public WebElement ProjectNoFilter;
	public void ClickOnProjectNoFilter()
	{
		ProjectNoFilter.click();
	}
	@FindBy(xpath="//div[@id='project-no-column-advsearch-dropdown']//div[@class='qp-search-input']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement SelectEqualLikeProjectNoFilter;
	public void SelectEqualLikeProjectNoFilterVM()
	{
		Select s5 = new Select(SelectEqualLikeProjectNoFilter);
		s5.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='project-no-adv-search-field']")
	public WebElement ProjectNoFilterBox;
	public void EnterProjectNoFilterBox(String PNo)
	{
		ProjectNoFilterBox.sendKeys(PNo);
		
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[1]")
	public WebElement ProjectNoFilterBtn;
	public void ClickOnProjectNoFilterBtn()
	{
		ProjectNoFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-no-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement ProjectNoClearBtn;
	public void ClickOnProjectNoClearBtn()
	{
		ProjectNoClearBtn.click();
	}
//...................................................................Project Name	
	@FindBy(xpath="//div[@data-field='name']")
	public WebElement ProjectNameFilter;
	public void ClickOnProjectNameFilter()
	{
		ProjectNameFilter.click();
	}
	@FindBy(xpath="//div[@id='project-name-column-advsearch-dropdown']//div[@class='qp-search-input']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement SelectEqualLikeProjectNameFilter;
	public void SelectEqualLikeProjectNameFilterVM()
	{
		Select s21 = new Select(SelectEqualLikeProjectNameFilter);
		s21.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='project-name-adv-search-field']")
	public WebElement ProjectNameFilterBox;
	public void EnterProjectNameFilterBox(String PName)
	{
		ProjectNameFilterBox.sendKeys(PName);
		
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[2]")
	public WebElement ProjectNameFilterBtn;
	public void ClickOnProjectNammeFilterBtn()
	{
		ProjectNameFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-name-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement ProjectNameClearBtn;
	public void ClickOnProjectNameClearBtn()
	{
		ProjectNameClearBtn.click();
	}
//.................................................................Quotation Number
	@FindBy(xpath="//div[@data-field='quotation_number']")
	public WebElement QuotationNumberFilter;
	public void ClickOnQuotationNumberFilter()
	{
		QuotationNumberFilter.click();
	}
	@FindBy(xpath="//div[@id='project-quotation-no-column-advsearch-dropdown']//div[@class='qp-search-input']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement SelectEqualLikeQuotationNumberFilter;
	public void SelectEqualLikeQuotationNumberFilterVM()
	{
		Select s22 = new Select(SelectEqualLikeQuotationNumberFilter);
		s22.selectByVisibleText("Like");
	}
	@FindBy(xpath="//input[@id='project-quotation-no-adv-search-field']")
	public WebElement QuotationNumbeFilterBox;
	public void EnterQuotationNumbeFilterBox(String QNo)
	{
		QuotationNumbeFilterBox.sendKeys(QNo);
		
	}
	@FindBy(xpath="//div[@id='project-quotation-no-column-advsearch-dropdown']//div[@class='qp-order-item']//select[@class='form-control qp-search-select clsOrderBy']")
	public WebElement SelectSortByQuotationNumber;
	public void SelectSortByQuotationNumberVM()
	{
		Select s23 = new Select(SelectSortByQuotationNumber);
		s23.selectByVisibleText("Date Created");
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[3]")
	public WebElement QuotationNumberFilterBtn;
	public void ClickOnQuotationNumberFilterBtn()
	{
		QuotationNumberFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-quotation-no-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement QuotationNumberClearBtn;
	public void ClickOnQuotationNumberClearBtn()
	{
		QuotationNumberClearBtn.click();
	}
//.................................................................Customer Number	
	@FindBy(xpath="(//div[@onclick='itmcolarrowbtnclick(this)'])[4]")
	public WebElement CustomerFilter;
	public void ClickOnCustomerFilter()
	{
		CustomerFilter.click();
	}
	@FindBy(xpath="//div[@id='project-customer-column-advsearch-dropdown']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement SelectEqualLikeCustomerFilter;
	public void SelectEqualLikeCustomerFilterVM()
	{
		Select s24 = new Select(SelectEqualLikeCustomerFilter);
		s24.selectByVisibleText("Like");
	}
	@FindBy(xpath="//input[@id='project-customer-adv-search-field']")
	public WebElement CustomerFilterBox;
	public void EnterCustomerFilterBox(String Customer)
	{
		CustomerFilterBox.sendKeys(Customer);
		
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[4]")
	public WebElement CustomerFilterBtn;
	public void ClickOnCustomerFilterBtn()
	{
		CustomerFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-customer-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement CustomerClearBtn;
	public void ClickOnCustomerClearBtn()
	{
		CustomerClearBtn.click();
	}
//.................................................................Date Created
	@FindBy(xpath="//div[@data-field='date_created']")
	public WebElement DateCreatedFilter;
	public void ClickOnDateCreatedFilter()
	{
		DateCreatedFilter.click();
	}
	@FindBy(xpath="//div[@id='project-created-date-column-advsearch-dropdown']//select[@class='form-control qp-search-select clsCriteria clsSearchByDateRange']")
	public WebElement SelectEqualLikeDateCreatedFilter;
	public void SelectEqualLikeSelectEqualLikeDateCreatedFilterVM()
	{
		Select s25 = new Select(SelectEqualLikeDateCreatedFilter);
		s25.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='project-created-date-adv-search-field']")
	public WebElement DateCreatedBox;
	public void ClickonDateCreatedBox()
	{
		DateCreatedBox.click();
		
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthDateCreated;
	public void SelectMonthDateCreatedVM(String month)
	{
		Select s26 = new Select(SelectMonthDateCreated);
		s26.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDateCreated;
	public void SelectYearDateCreatedVM(String year)
	{
		Select s27 = new Select(SelectYearDateCreated);
		s27.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='30'])[4]")
	public WebElement DateDC;
	public void ClickonDateDC()
	{
		DateDC.click();
		
	}
	@FindBy(xpath="//div[@id='project-created-date-column-advsearch-dropdown']//select[@class='form-control qp-search-select clsOrderBy']")
	public WebElement SelectSortByDateCreated;
	public void SelectSortByDateCreatedVM()
	{
		Select s28 = new Select(SelectSortByDateCreated);
		s28.selectByVisibleText("Date Created");
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[5]")
	public WebElement DateCreatedFilterBtn;
	public void ClickOnDateCreatedFilterBtn()
	{
		DateCreatedFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-created-date-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement DateCreatedClearBtn;
	public void ClickOnDateCreatedClearBtn()
	{
		DateCreatedClearBtn.click();
	}
	
//.................................................................Date Modified
	@FindBy(xpath="//div[@data-dropdown='#project-modified-date-column-advsearch-dropdown']")
	public WebElement DateModifiedFilter;
	public void ClickOnDateModifiedFilter()
	{
		DateModifiedFilter.click();
	}
	@FindBy(xpath="//div[@id='project-modified-date-column-advsearch-dropdown']//select[@class='form-control qp-search-select clsCriteria clsSearchByDateRange']")
	public WebElement SelectEqualLikeDateModifiedFilter;
	public void SelectEqualLikeDateModifiedFilterVM()
	{
		Select s29 = new Select(SelectEqualLikeDateModifiedFilter);
		s29.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='project-modified-date-adv-search-field']")
	public WebElement DateModifiedBox;
	public void ClickonDateModifiedBox()
	{
		DateModifiedBox.click();
		
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthDateModified;
	public void SelectMonthDateModifiedVM(String month)
	{
		Select s30 = new Select(SelectMonthDateModified);
		s30.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDateModified;
	public void SelectYearDateModifiedVM(String year)
	{
		Select s31 = new Select(SelectYearDateModified);
		s31.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='24'])[4]")
	public WebElement DateDM;
	public void ClickonDateDM()
	{
		DateDM.click();
		
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[6]")
	public WebElement DateModifiedFilterBtn;
	public void ClickOnDateModifiedFilterBtn()
	{
		DateModifiedFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-modified-date-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement DateModifiedClearBtn;
	public void ClickOnDateModifiedClearBtn()
	{
		DateModifiedClearBtn.click();
	}
//.................................................................Due Date	
	
	@FindBy(xpath="//div[@data-dropdown='#project-due-date-column-advsearch-dropdown']")
	public WebElement DueDateFilter;
	public void ClickOnDueDateFilter()
	{
		DueDateFilter.click();
	}
	@FindBy(xpath="//div[@id='project-due-date-column-advsearch-dropdown']//select[@class='form-control qp-search-select clsCriteria clsSearchByDateRange']")
	public WebElement SelectEqualLikeDueDateFilter;
	public void SelectEqualLikeDueDateFilterVM()
	{
		Select s32 = new Select(SelectEqualLikeDueDateFilter);
		s32.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='project-due-date-adv-search-field']")
	public WebElement DueDateBox;
	public void ClickonDueDateBox()
	{
		DueDateBox.click();
		
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectDueDate;
	public void SelectMonthDueDateVM(String month)
	{
		Select s33 = new Select(SelectDueDate);
		s33.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDueDate;
	public void SelectYearDueDateVM(String year)
	{
		Select s34 = new Select(SelectYearDueDate);
		s34.selectByValue(year);
	}
	@FindBy(xpath="(//a[text()='13'])[4]")
	public WebElement DateDD;
	public void ClickonDateDD()
	{
		DateDD.click();
		
	}
	@FindBy(xpath="//div[@id='project-due-date-column-advsearch-dropdown']//select[@class='form-control qp-search-select clsOrderBy']")
	public WebElement SelectSortByDueDate;
	public void SelectSortByDueDateVM()
	{
		Select s35 = new Select(SelectSortByDueDate);
		s35.selectByVisibleText("Due Date");
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[7]")
	public WebElement DueDateFilterBtn;
	public void ClickOnDueDateFilterBtn()
	{
		DueDateFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-due-date-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement DueDateClearBtn;
	public void ClickOnDueDateClearBtn()
	{
		DueDateClearBtn.click();
	}
//................................................................Status	
	@FindBy(xpath="//div[@data-dropdown='#project-status-column-advsearch-dropdown']")
	public WebElement StatusFilter;
	public void ClickOnStatusFilter()
	{
		StatusFilter.click();
	}
	@FindBy(xpath="//input[@id='active']")
	public WebElement StatusType;
	public void ClickOnStatusType()
	{
		StatusType.click();
	}
	@FindBy(xpath="(//a[@onclick='searchProjectColResult(this); return false;'])[8]")
	public WebElement StatusFilterBtn;
	public void ClickOnStatusFilterBtn()
	{
		StatusFilterBtn.click();
	}
	@FindBy(xpath="//div[@id='project-status-column-advsearch-dropdown']//a[@class='btn btn-xs qp-btn-clear']")
	public WebElement StatusClearBtn;
	public void ClickOnStatusClearBtn()
	{
		StatusClearBtn.click();
	}
//------------------------------------------------------------------Load More Function
	@FindBy(xpath="//a[text()='Load more']")
	public WebElement LoadMoreBtn;
	public void ClickOnLoadMoreBtnVM()
	{
		LoadMoreBtn.click();
		
	}
	
//------------------------------------------------------------------Project Name Link Function	
	@FindBy(xpath="//a[text()='Dryer Install Project']")
	public WebElement ProjectNameLink;
	public void ClickOnProjectNameLinkVM()
	{
		ProjectNameLink.click();
		
	}
//------------------------------------------------------------------Project Data Link BOM and MM Function		
	@FindBy(xpath="//a[@onclick='openBOMview(581); return false;']")
	public WebElement BOMLink;
	public void ClickOnProjectDataLinkBOMVM()
	{
		BOMLink.click();
		
	}
	@FindBy(xpath="//a[text()='Search Projects']")
	public WebElement Backlink;
	public void ClickOnProjectBacklinkVM()
	{
		Backlink.click();
		
	}
	@FindBy(xpath="//a[@onclick='loadMaterialManagement(581); return false;']")
	public WebElement MMLink;
	public void ClickOnProjectDataLinkMMVM()
	{
		MMLink.click();
		
	}
//------------------------------------------------------------------Edit Function		
	@FindBy(xpath="//a[text()='Dryer Install Project']")
	public WebElement ProjectNameLink1;
	public void ClickOnProjectNameLink1VM()
	{
		ProjectNameLink1.click();
			
	}

	@FindBy(xpath="//a[@id='project-edit-link']")
	public WebElement EditBtn;
	public void ClickOnEditBtnVM()
	{
		EditBtn.click();
			
	}
	@FindBy(xpath="//select[@id='project_status']")
	public WebElement Status1;
	public void SelectStatus1VM()
	{
		Select s6 = new Select(Status1);
		s6.selectByVisibleText("quotation");
	}
	@FindBy(xpath="//button[@id='project-save-btn']")
	public WebElement SaveBtn;
	public void ClickOnSaveBtnVM()
	{
		SaveBtn.click();
			
	}
//------------------------------------------------------------------Delete Project Function
	@FindBy(xpath="//a[@onclick='loadProject(583); return      false;']")
	public WebElement ProjectNameLink2;
	public void ClickOnProjectNameLink2VM()
	{
		ProjectNameLink2.click();
			
	}
	@FindBy(xpath="//a[@id='project_actions-dropdown-btn']")
	public WebElement ProjectActionBtn;
	public void ClickOnProjectActionBtnVM()
	{
		ProjectActionBtn.click();	
	}
	@FindBy(xpath="//a[@id='delete_project_icon']")
	public WebElement ProjectDeleteIcon;
	public void ClickOnProjectDeleteIconVM()
	{
		ProjectDeleteIcon.click();
			
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement ProjectDeletePopupYesBtn;
	public void ClickOnProjectDeletePopupYesBtnVM()
	{
		ProjectDeletePopupYesBtn.click();
			
	}
	@FindBy(xpath="//span[text()='No']")
	public WebElement ProjectDeletePopupNoBtn;
	public void ClickOnProjectDeletePopupNoBtnVM()
	{
		ProjectDeletePopupNoBtn.click();
			
	}
	@FindBy(xpath="//div[@aria-describedby='alert2_success']//span[text()='OK']")
	public WebElement ProjectDeleteSuccessPopupNoBtn;
	public void ClickOnProjectDeleteSuccessPopupNoBtn()
	{
		ProjectDeleteSuccessPopupNoBtn.click();
			
	}
//------------------------------------------------------------------BOM Button Function
	@FindBy(xpath="//a[text()='Dryer Install Project']")
	public WebElement ProjectNameLink3;
	public void ClickOnProjectNameLink3VM()
	{
		ProjectNameLink3.click();
			
	}
	@FindBy(xpath="//a[@id='project-bom-show']")
	public WebElement ShowBOMBtn;
	public void ClickOnShowBOMBtnVM()
	{
		ShowBOMBtn.click();
			
	}
//------------------------------------------------------------------P&L Material Function
	@FindBy(xpath="//a[text()='Wet Ice System']")
	public WebElement ProjectNameLink4;
	public void ClickOnProjectNameLink4VM()
	{
		ProjectNameLink4.click();
			
	}
	@FindBy(xpath="//a[text()='Project P&L']")
	public WebElement Project_P_And_L;
	public void ClickOnProject_P_And_LVM()
	{
		Project_P_And_L.click();
			
	}
	@FindBy(xpath="//a[text()='Material']")
	public WebElement MaterialLink;
	public void ClickOnMaterialLinkVM()
	{
		MaterialLink.click();
			
	}
	@FindBy(xpath="//a[@id='pnl-actions-dropdown-btn']")
	public WebElement ExportMaterialActions;
	public void ClickOnExportMaterialActionsBtnVM()
	{
		ExportMaterialActions.click();
			
	}
	@FindBy(xpath="//a[@onclick='exportToCSV();']")
	public WebElement ExportMaterialCSV;
	public void ClickOnExportMaterialCSVVM()
	{
		ExportMaterialCSV.click();
			
	}
	@FindBy(xpath="//a[@onclick='event.preventDefault();exportShopfloorAll();']")
	public WebElement ExportMaterialPDF;
	public void ClickOnExportMaterialPDFVM()
	{
		ExportMaterialPDF.click();
			
	}
	
//------------------------------------------------------------------P&L Material Function
		@FindBy(xpath="//a[text()='Wet Ice System']")
		public WebElement ProjectNameLink5;
		public void ClickOnProjectNameLink5VM()
		{
			ProjectNameLink5.click();
				
		}
		
		@FindBy(xpath="//a[text()='Labor']")
		public WebElement LaborLink;
		public void ClickOnLaborLinkVM()
		{
			LaborLink.click();
				
		}
		@FindBy(xpath="//a[@id='quoted_billable_labor_link']")
		public WebElement ExportLabor;
		public void ClickOnExportLaborBtnVM()
		{
			ExportLabor.click();
				
		}
//------------------------------------------------------------------P&L Labor Function
		@FindBy(xpath="//a[text()='Wet Ice System']")
		public WebElement ProjectNameLink6;
		public void ClickOnProjectNameLink6VM()
		{
			ProjectNameLink6.click();
						
		}
				
		@FindBy(xpath="//a[text()='Expense']")
		public WebElement ExpenseLink;
		public void ClickOnExpenseLinkVM()
		{
			ExpenseLink.click();
						
		}
		@FindBy(xpath="(//a[text()='New Item 3'])[2]")
		public WebElement LaborCode;
		public void ClickOnLaborCodeLinkVM()
		{
			LaborCode.click();
						
		}
		@FindBy(xpath="//a[@id='exp-download-link']")
		public WebElement ExportExpense;
		public void ClickOnExportExpenseBtnVM()
		{
			ExportExpense.click();
						
		}	
//-------------------------------------------------Load Project Task Activity Data Function
		@FindBy(xpath="//a[text()='NYK Bulk Paint HMJ Conveyor Safety Switch']")
		public WebElement ProjectNameLink7;
		public void ClickOnProjectNameLink7VM()
		{
			ProjectNameLink7.click();
						
		}
				
		@FindBy(xpath="//button[@id='loadTasktimesheetData']")
		public WebElement LoadProjectTaskActivityDataBtn;
		public void ClickOnLoadProjectTaskActivityDataBtnVM()
		{
			LoadProjectTaskActivityDataBtn.click();
						
		}
		
//-------------------------------------------------Load Project Task Activity Data Function	
		
		@FindBy(xpath="//table[@id='project-task-labor-activity-table']//a[text()='Load more']")
		public WebElement LoadProjectTaskActivityDataLoadMoreBtn;
		public void ClickOnLoadProjectTaskActivityDataLoadMoreBtnVM()
		{
			LoadProjectTaskActivityDataLoadMoreBtn.click();
						
		}
//-------------------------------------------------Project 360 Project Activity Function
		@FindBy(xpath="//a[text()='STOCK']")
		public WebElement ProjectNameLink8;
		public void ClickOnProjectNameLink8VM()
		{
			ProjectNameLink8.click();
						
		}
		@FindBy(xpath="//a[text()='Project 360°']")
		public WebElement Project360Tab;
		public void ClickOnProject360TabVM()
		{
			Project360Tab.click();
						
		}
		@FindBy(xpath="(//a[text()='GRN'])[1]")        //-------GRN       //table[@id='project-history-table']//tr[1]//td[2]
		public WebElement GRNLink;
		public void ClickOnGRNLinkVM()
		{
			GRNLink.click();
						
		}
		@FindBy(xpath="(//a[text()='PO'])[1]")           //------PO
		public WebElement POLink;
		public void ClickOnPOLinkVM()
		{
			POLink.click();
						
		}
		@FindBy(xpath="(//a[text()='PR'])[1]")            //------PR
		public WebElement PRLink;
		public void ClickOnPRLinkVM()
		{
			PRLink.click();
						
		}
		@FindBy(xpath="(//a[text()='SO'])[1]")             //------SO
		public WebElement SOLink;
		public void ClickOnSOLinkVM()
		{
			SOLink.click();
						
		}
//---------------------------------------------------------Project 360 Project Activity Module wise Function
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink9;
		public void ClickOnProjectNameLink9VM()
		{
			ProjectNameLink9.click();
						
		}
		@FindBy(xpath="//li[@id='project-activity-modulewise-tab']")
		public WebElement ProjectActivityModulewiseTab;
		public void ClickOnProjectActivityModulewiseTabVM()
		{
			ProjectActivityModulewiseTab.click();
						
		}
		@FindBy(xpath="(//a[text()='PR '])[2]")        //-----PR
		public WebElement PRLink1;
		public void ClickOnPRLink1VM()
		{
			PRLink1.click();
						
		}
		@FindBy(xpath="(//a[text()='PR'])[2]")        //-----PR
		public WebElement PRLink2;
		public void ClickOnPRLink2VM()
		{
			PRLink2.click();
						
		}
		@FindBy(xpath="(//a[text()='SO '])[2]")        //-----SO
		public WebElement SOLink1;
		public void ClickOnSOLink1VM()
		{
			SOLink1.click();
						
		}
		@FindBy(xpath="(//a[text()='SO'])[2]")        //-----SO
		public WebElement SOLink2;
		public void ClickOnSOLink2VM()
		{
			SOLink2.click();
						
		}
		@FindBy(xpath="(//a[text()='PO '])[2]")        //-----PO
		public WebElement POLink1;
		public void ClickOnPOLink1VM()
		{
			POLink1.click();
						
		}
		@FindBy(xpath="(//a[text()='PO'])[3]")        //-----PO
		public WebElement POLink2;
		public void ClickOnPOLink2VM()
		{
			POLink2.click();
						
		}
		@FindBy(xpath="(//a[text()='GRN '])[2]")        //-----GRN
		public WebElement GRNLink1;
		public void ClickOnGRNLink1VM()
		{
			GRNLink1.click();
						
		}
		@FindBy(xpath="(//a[text()='GRN'])[4]")        //-----GRN
		public WebElement GRNLink2;
		public void ClickOnGRNLink2VM()
		{
			GRNLink2.click();
						
		}
//----------------------------------------------------Project360_ItemsActivityDetailsFunction
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink10;
		public void ClickOnProjectNameLink10VM()
		{
			ProjectNameLink10.click();
						
		}
		@FindBy(xpath="//a[@id='items_newactivity']")
		public WebElement ItemsActivityDetailsTab;
		public void ClickOnItemsActivityDetailsTabVM()
		{
			ItemsActivityDetailsTab.click();
						
		}
		@FindBy(xpath="//a[@id='item_activity_details-export-link']")
		public WebElement ExportItemsActivityDetails;
		public void ClickOnExportItemsActivityDetailsBtnVM()
		{
			ExportItemsActivityDetails.click();
						
		}	
//----------------------------------------------------Project360_ItemsActivitySummaryFunction	
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink11;
		public void ClickOnProjectNameLink11VM()
		{
			ProjectNameLink11.click();
						
		}
		@FindBy(xpath="//a[@id='items_oldactivity']")
		public WebElement ItemsActivitySummaryTab;
		public void ClickOnItemsActivitySummaryTabVM()
		{
			ItemsActivitySummaryTab.click();
						
		}
		@FindBy(xpath="//a[@id='item_activity_summery-export-link']")
		public WebElement ExportItemsActivitySummary;
		public void ClickOnExportExportItemsActivitySummaryBtnVM()
		{
			ExportItemsActivitySummary.click();
						
		}	
//----------------------------------------------------Project Settings  User Task Select Global Function		
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink12;
		public void ClickOnProjectNameLink12VM()
		{
			ProjectNameLink12.click();
						
		}
		@FindBy(xpath="//a[text()='PROJECT SETTINGS ']")
		public WebElement ProjectSettingsTab;
		public void ClickOnProjectSettingsTabVM()
		{
			ProjectSettingsTab.click();
						
		}
		@FindBy(xpath="//a[text()='User - Task']")
		public WebElement UserTaskTab;
		public void ClickOnUserTaskTabVM()
		{
			UserTaskTab.click();
						
		}
		@FindBy(xpath="//a[@id='project_labor-edit-link']")
		public WebElement EditButtonUT;
		public void ClickOnEditButtonUTVM()
		{
			EditButtonUT.click();
						
		}
		@FindBy(xpath="//button[text()='Select Global Tasks']")
		public WebElement SelectGlobalButtonUT;
		public void ClickOnSelectGlobalButtonUTVM()
		{
			SelectGlobalButtonUT.click();
						
		}
		@FindBy(xpath="//input[@id='txtSearchProjctGlobleTaskMapped']")
		public WebElement GlobalSearchBoxUT;
		public void EnterOnGlobalSearchBoxUTVM()
		{
			GlobalSearchBoxUT.sendKeys("Engineering work");
						
		}
		@FindBy(xpath="(//span[@class='input-group-btn']//button[@id='search-project-btn']//i[@class='fa fa-search'])[14]")
		public WebElement GlobalSearchBtnUT;
		public void ClickOnGlobalSearchBtnUTVM()
		{
			GlobalSearchBtnUT.click();
						
		}
		@FindBy(xpath="//option[text()='Engineering work']")
		public WebElement TaskNameUT;
		public void ClickOnTaskNameUTVM()
		{
			TaskNameUT.click();
						
		}
		@FindBy(xpath="(//span[text()='OK'])[7]")
		public WebElement OKBtnUT;
		public void ClickOnOKBtnUTVM()
		{
			OKBtnUT.click();
						
		}
		@FindBy(xpath="(//span[text()='Cancel'])[29]")
		public WebElement CancelBtnUT;
		public void ClickOnCnacelBtnUTVM()
		{
			CancelBtnUT.click();
						
		}
		@FindBy(xpath="//span[text()='Yes']")
		public WebElement YesBtnUT;
		public void ClickOnYesBtnUTVM()
		{
			YesBtnUT.click();
						
		}
		@FindBy(xpath="(//span[text()='Cancel'])[30]")
		public WebElement CancelBtn1UT;
		public void ClickOnCancelBtn1UTVM()
		{
			CancelBtn1UT.click();
						
		}
//----------------------------------------------------Project Settings  User Task Select Multiple Task Function	
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink16;
		public void ClickOnProjectNameLink16VM()
		{
			ProjectNameLink16.click();
						
		}
		@FindBy(xpath="//button[text()='Select Multiple Tasks - Users']")
		public WebElement SelectMultipleTaskUserButtonUT;
		public void ClickOnSelectMultipleTaskUserButtonUTVM()
		{
			SelectMultipleTaskUserButtonUT.click();
						
		}
		@FindBy(xpath="//input[@id='projAlltask_search_text']")
		public WebElement MultipleSearchBoxUT;
		public void EnterOnMultipleSearchBoxUTVM()
		{
			MultipleSearchBoxUT.sendKeys("1122");
						
		}
		@FindBy(xpath="(//span[@class='input-group-btn']//button[@id='search-project-btn']//i[@class='fa fa-search'])[13]")
		public WebElement MultipleSearchBtnUT;
		public void ClickOnMultipleSearchBtnUTVM()
		{
			MultipleSearchBtnUT.click();
						
		}
		@FindBy(xpath="//option[text()='1122']")
		public WebElement MultipleTaskNameUT;
		public void ClickOnMultipleTaskNameUTVM()
		{
			MultipleTaskNameUT.click();
						
		}
		@FindBy(xpath="(//input[@id='dropdownListUser_search_text1'])[3]")
		public WebElement MultipleSearchBox1UT;
		public void EnterOnMultipleSearchBox1UTVM()
		{
			MultipleSearchBox1UT.sendKeys("anjali");
						
		}
		@FindBy(xpath="(//span[@class='input-group-btn']//button[@id='search-project-btn']//i[@class='fa fa-search'])[14]")
		public WebElement MultipleSearchBtn1UT;
		public void ClickOnMultipleSearchBtn1UTVM()
		{
			MultipleSearchBtn1UT.click();
						
		}
		@FindBy(xpath="//option[text()='anjali']")
		public WebElement MultipleUserNameUT;
		public void ClickOnMultipleUserNameUTVM()
		{
			MultipleUserNameUT.click();
						
		}
		@FindBy(xpath="(//span[text()='Cancel'])[29]")
		public WebElement CancelTaskBtn1UT;
		public void ClickOnCancelTaskBtn1UTVM()
		{
			CancelTaskBtn1UT.click();
								
		}
		@FindBy(xpath="(//span[text()='OK'])[7]")
		public WebElement OKTaskBtn1UT;
		public void ClickOnOKTaskBtn1UTVM()
		{
			OKTaskBtn1UT.click();
								
		}
//---------------------------------------------------- Project Settings Create  New Task Functionality for Local and Global	
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink17;
		public void ClickOnProjectNameLink17VM()
		{
			ProjectNameLink17.click();
						
		}
		@FindBy(xpath="//button[@onclick='showCreateNewTaskRow()']")
		public WebElement CreateNewTaskBtnUT;
		public void ClickOnCreateNewTaskBtnUTVM()
		{
			CreateNewTaskBtnUT.click();
								
		}
		@FindBy(xpath="//span[@class='globalLocalTask_toggle-check-text']")
		public WebElement GlobalLocalToggleBtnUT;
		public void ClickOnGlobalLocalToggleBtnUTVM()
		{
			GlobalLocalToggleBtnUT.click();
								
		}
		@FindBy(xpath="//input[@placeholder='Enter task name (Max 250 Chars12121)']")
		public WebElement EnterTaskNameGlobalLocalUT;
		public void ClickOnEnterTaskNameGlobalLocalUTVM()
		{
			EnterTaskNameGlobalLocalUT.sendKeys("Automation test 123");
								
		}
		@FindBy(xpath="(//div[@class='editTaskData']//i[@class='fa fa-floppy-o'])[1]")
		public WebElement SaveToggleBtnUT;
		public void ClickOnSaveToggleBtnUTVM()
		{
			SaveToggleBtnUT.click();
								
		}
		@FindBy(xpath="(//div[@class='editTaskData']//i[@class='fa fa-times'])[1]")
		public WebElement CancelToggleBtnUT;
		public void ClickOnCancelToggleBtnUTVM()
		{
			CancelToggleBtnUT.click();
								
		}
		@FindBy(xpath="(//select[@class='form-control qp-tms-select'])[1]")
		public WebElement StatusUT;
		public void SelectStatusUTVM()
		{
			Select s7 = new Select(StatusUT);
			s7.selectByVisibleText("hold");
		}
		
		
		@FindBy(xpath="(//button[@onclick='showTaskUserSelection(this)'])[1]")
		public WebElement SelectUserBtnUT;
		public void ClickOnSelectUserBtnUTVM()
		{
			SelectUserBtnUT.click();
								
		}
		@FindBy(xpath="(//div[@class='searchform dropdownUser_search']//input[@class='form-control searchtextbox'])[6]")
		public WebElement EnterUserNameGlobalLocalUT;
		public void ClickOnEnterUserNameGlobalLocalUTVM()
		{
			EnterUserNameGlobalLocalUT.sendKeys("anjali");
								
		}
		@FindBy(xpath="(//span[@class='input-group-btn']//button[@id='search-project-btn']//i[@class='fa fa-search'])[14]")
		public WebElement SearchGlobalLocalBtnUT;
		public void ClickOnSearchGlobalLocalBtnUTVM()
		{
			SearchGlobalLocalBtnUT.click();
								
		}
		@FindBy(xpath="(//span[text()='Cancel'])[29]")
		public WebElement CancelGlobalLocalBtnUT;
		public void ClickOnCancelGlobalLocalBtnUTVM()
		{
			CancelGlobalLocalBtnUT.click();
								
		}
		@FindBy(xpath="(//span[text()='OK'])[7]")
		public WebElement OKGlobalLocalBtnUT;
		public void ClickOnOKGlobalLocalBtnUTVM()
		{
			OKGlobalLocalBtnUT.click();
								
		}
		@FindBy(xpath="//a[@id='project_task-user-save-link']")
		public WebElement SaveTaskBtnUT;
		public void ClickOnSaveTaskBtnUTVM()
		{
			SaveTaskBtnUT.click();
								
		}
		@FindBy(xpath="//span[text()='Yes']")
		public WebElement SaveModifyTaskBtnUT;
		public void ClickOnSaveModifyTaskBtnUTVM()
		{
			SaveModifyTaskBtnUT.click();
								
		}
		@FindBy(xpath="(//span[@onclick='deleteTask(this);']//i[@class='fa fa-trash'])[2]")
		public WebElement DeleteTaskToggleBtnUT;
		public void ClickOnDeleteTaskToggleBtnUTVM()
		{
			DeleteTaskToggleBtnUT.click();
								
		}
//----------------------------------------------------Project Settings  User Labor Type For Select Multiple Users  Function	
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink13;
		public void ClickOnProjectNameLink13VM()
		{
			ProjectNameLink13.click();
						
		}
		@FindBy(xpath="//a[@id='project_labor-edit-link']")
		public WebElement EditButtonUserlaborType;
		public void ClickOnEditButtonUserlaborTypeVM()
		{
			EditButtonUserlaborType.click();
						
		}	
		@FindBy(xpath="//button[@onclick='showAllLaborUserSelection(this)']")
		public WebElement SelectMultipleTaskUserLT;
		public void ClickOnSelectMultipleTaskUserButtonlaborTypeVM()
		{
			SelectMultipleTaskUserLT.click();
						
		}
		@FindBy(xpath="//option[text()='Automation Engineer']")
		public WebElement SelectUserLT;
		public void ClickOnUserLTVM()
		{
			SelectUserLT.click();
						
		}
//----------------------------------------------------Project Settings  User Labor Type For Billable and Labor Type  Check  box Select  Function	
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink14;
		public void ClickOnProjectNameLink14VM()
		{
			ProjectNameLink14.click();
						
		}
		@FindBy(xpath="(//label[@class='qp-checkbox qp-radio']//span[@class='qp-checkmark'])[13]")
		public WebElement BillableAllYES;
		public void ClickOnBillableAllYESVM()
		{
			BillableAllYES.click();
						
		}
		@FindBy(xpath="(//label[@class='qp-checkbox qp-radio']//span[@class='qp-checkmark'])[14]")
		public WebElement BillableAllNO;
		public void ClickOnBillableAllNOVM()
		{
			BillableAllNO.click();
						
		}
		@FindBy(xpath="(//span[@class='toggle-check-text'])[1]")
		public WebElement BillableSingleYES;
		public void ClickOnBillableSingleYESVM()
		{
			BillableSingleYES.click();
						
		}
		@FindBy(xpath="(//span[@class='toggle-check-text'])[1]")
		public WebElement BillableSingleNO;
		public void ClickOnBillableSingleNOVM()
		{
			BillableSingleNO.click();
						
		}
		
		@FindBy(xpath="//a[@id='project_labor-cancel-link']")
		public WebElement CancelButtonLT;
		public void ClickOnCancelButtonLTVM()
		{
			CancelButtonLT.click();
						
		}
		@FindBy(xpath="//a[@id='project_labor-delete-link']")
		public WebElement DeleteButtonLT;
		public void ClickOnDeleteButtonLTVM()
		{
			DeleteButtonLT.click();
						
		}
		@FindBy(xpath="//a[@id='project_labor-save-link']")
		public WebElement SaveButtonLT;
		public void ClickOnSaveButtonLTVM()
		{
			SaveButtonLT.click();
						
		}
		@FindBy(xpath="(//label[@class='qp-checkbox']//span[@class='qp-checkmark'])[14]")
		public WebElement LaborTypeCheckBox;
		public void ClickOnLaborTypeCheckBoxVM()
		{
			LaborTypeCheckBox.click();
						
		}
		@FindBy(xpath="(//input[@class='row-select-delete'])[1]")
		public WebElement SingleCheckBox;
		public void ClickOnSingleCheckBoxVM()
		{
			SingleCheckBox.click();
						
		}
		@FindBy(xpath="//button[@data-labor='2793 test 10']")
		public WebElement SelectButtonLT;
		public void ClickOnSelectButtonLTVM()
		{
			SelectButtonLT.click();//select[@id='labor_users']//option[text()='admin']
						
		}
		@FindBy(xpath="(//table[@class='laboruser-table'])[3]//tr[2]//td[2]//select[@id='labor_users']//option[text()='admin']")
		public WebElement SelectUser1LT;
		public void ClickOnSelectUser1LTVM()
		{
			SelectUser1LT.click();
						
		}
		@FindBy(xpath="(//td[@id='txtparameter'])[3]")
		public WebElement Text1LT;
		public void ClickOnText1LTLTVM()
		{
			Text1LT.click();
						
		}
//----------------------------------------------------Project Settings  User Labor Type For Select Global Labors  Function	
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink15;
		public void ClickOnProjectNameLink15VM()
		{
			ProjectNameLink15.click();
						
		}
		@FindBy(xpath="//button[@onclick='showGlobleLaborsForProject(this)']")
		public WebElement SelectGlobalLaborsLT;
		public void ClickOnSelectGlobalLaborsLTButtonlaborTypeVM()
		{
			SelectGlobalLaborsLT.click();
						
		}
//------------------------------------------------------ProjectSettings_TaskLabor_Function
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink18;
		public void ClickOnProjectNameLink18VM()
		{
			ProjectNameLink18.click();
						
		}
		@FindBy(xpath="//a[text()='Task - Labor']")
		public WebElement TaskLabor;
		public void ClickOnTaskLaborBtnVM()
		{
			TaskLabor.click();
						
		}
		@FindBy(xpath="(//div[@class='laborsetting_actions '])[4]")
		public WebElement EditBtnTL;
		public void ClickOnEditBtnTLVM()
		{
			EditBtnTL.click();
						
		}
		@FindBy(xpath="//a[@onclick='openTaskUnderProject();']")
		public WebElement AddTaskBtnTL;
		public void ClickOnAddTaskBtnTLVM()
		{
			AddTaskBtnTL.click();
						
		}
		
		@FindBy(xpath="(//select[@id='projectwise_task'])[1]")
		public WebElement SelectTaskUT;
		public void SelectTaskUTVM()
		{
			Select s8 = new Select(SelectTaskUT);
			s8.selectByVisibleText("Electrical Controls");
		}
		@FindBy(xpath="//a[@onclick='openLaborUnderProject(1924,6);']")
		public WebElement AddBtnTL;
		public void ClickOnAddMaterialLaborBtnTLVM()
		{
			AddBtnTL.click();
						
		}
		@FindBy(xpath="//select[@id='projectwise_labor']")
		public WebElement SelectLaborUT;
		public void SelectLaborUTVM()
		{
			Select s9 = new Select(SelectLaborUT);
			s9.selectByVisibleText("2793 test 10");
		}
		@FindBy(xpath="(//input[@class='cell-input val-quantity'])[1]")
		public WebElement BOMValueTL;
		public void EnterOnBOMValueTLVM()
		{
			BOMValueTL.clear();
			BOMValueTL.sendKeys("25");
						
		}
		@FindBy(xpath="//a[@id='project_task-labor-save-link']")
		public WebElement SaveBtnTL;
		public void ClickOnSaveBtnTLVM()
		{
			SaveBtnTL.click();
			
						
		}
		@FindBy(xpath="//a[@id='project_labor-cancel-link']")
		public WebElement CancelBtnTL;
		public void ClickOnCancelBtnTLVM()
		{
			CancelBtnTL.click();
			
						
		}
//------------------------------------------------------ProjectSettings_Delete TaskLabor_Function		
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink19;
		public void ClickOnProjectNameLink19VM()
		{
			ProjectNameLink19.click();
						
		}
		@FindBy(xpath="(//span[@class='qp-displayIcon tskspan'])[232]")
		public WebElement DeleteTask;
		public void ClickOnDeleteTaskToggleBtnLTVM()
		{
			DeleteTask.click();
						
		}
		@FindBy(xpath="//span[text()='Yes']")
		public WebElement DeleteTaskYes;
		public void ClickOnDeleteTaskYesLTVM()
		{
			DeleteTaskYes.click();
						
		}
		@FindBy(xpath="//span[text()='No']")
		public WebElement DeleteTaskNo;
		public void ClickOnDeleteTaskNoLTVM()
		{
			DeleteTaskNo.click();
						
		}
//---------------------------------------------------ProjectSettings_SelectApprover_Client_Function
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink20;
		public void ClickOnProjectNameLink20VM()
		{
			ProjectNameLink20.click();
						
		}
		@FindBy(xpath="//a[@onclick='settLaborApprStateEdit()']")
		public WebElement SelectApprover;
		public void ClickOnSelectApproverVM()
		{
			SelectApprover.click();
						
		}
		@FindBy(xpath="//a[@id='project_labor-edit-link']")
		public WebElement EditBtnSA;
		public void ClickOnEditBtnSAVM()
		{
			EditBtnSA.click();
						
		}
		@FindBy(xpath="//select[@id='project_client_contact']")
		public WebElement SelectClient;
		public void SelectClientSAVM()
		{
			Select s10 = new Select(SelectClient);
			s10.selectByVisibleText("Neha");
		}
		@FindBy(xpath="//select[@id='project_manager']")
		public WebElement SelectProjectManager;
		public void SelectProjectManagerSAVM()
		{
			Select s11 = new Select(SelectProjectManager);
			s11.selectByVisibleText("Atul Walekar");
		}
		@FindBy(xpath="//a[@id='project_laborapp-save-link']")
		public WebElement SaveApproverBtnSA;
		public void ClickOnSaveApproverBtnSAVM()
		{
			SaveApproverBtnSA.click();
						
		}
		@FindBy(xpath="//span[text()='Yes']")
		public WebElement ApproveYesBtnSA;
		public void ClickOnApproveYesBtnSAVM()
		{
			ApproveYesBtnSA.click();
						
		}
		@FindBy(xpath="(//span[text()='Cancel'])[29]")
		public WebElement ApproveCancelBtnSA;
		public void ClickOnApproveCancelBtnSAVM()
		{
			ApproveCancelBtnSA.click();
						
		}
		@FindBy(xpath="//a[@id='project_labor-cancel-link']")
		public WebElement CancelApproverBtnSA;
		public void ClickOnCancelApproverBtnSAVM()
		{
			CancelApproverBtnSA.click();
						
		}
//-------------------------------------------------------------Activities_LogActivity__Call_Function
		@FindBy(xpath="//a[text()='test12345']")
		public WebElement ProjectNameLink21;
		public void ClickOnProjectNameLink21VM()
		{
			ProjectNameLink21.click();
						
		}
		@FindBy(xpath="//a[text()='Activities']")
		public WebElement ActivitiesTab;
		public void ClickOnActivitiesTabVM()
		{
			ActivitiesTab.click();
						
		}
		@FindBy(xpath="//a[text()='Log Activity']")
		public WebElement LogActivityTab;
		public void ClickOnLogActivityTabVM()
		{
			LogActivityTab.click();
						
		}
		@FindBy(xpath="//a[@id='actCall']")
		public WebElement CallBtnLA;
		public void ClickOnCallBtnLAVM()
		{
			CallBtnLA.click();
						
		}
		@FindBy(xpath="//textarea[@placeholder='Please enter your note (250 characters max)']")
		public WebElement CallNoteLA;
		public void EnterOnCallNoteLAVM()
		{
			CallNoteLA.sendKeys("Discussion on Automation and their Framework");
		}
		@FindBy(xpath="//select[@class='cell-input val-status']")
		public WebElement CallStatus;
		public void SelectCallStatusLAVM()
		{
			Select s12 = new Select(CallStatus);
			s12.selectByVisibleText("Complete");
		}
		@FindBy(xpath="//input[@class='cell-input val-followup_date hasDatepicker']")
		public WebElement CallFollowupDateBoxLA;
		public void ClickOnCallFollowupDateBoxLAVM()
		{
			CallFollowupDateBoxLA.click();
						
		}
		@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
		public WebElement MonthLA;
		public void SelectMonthLAVM()
		{
			Select s13 = new Select(MonthLA);
			s13.selectByVisibleText("Oct");
		}
		@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
		public WebElement YearLA;
		public void SelectYearLAVM()
		{
			Select s14 = new Select(YearLA);
			s14.selectByVisibleText("2025");
		}
		@FindBy(xpath="(//a[text()='21'])[4]")
		public WebElement DayLA;
		public void ClickOnDayLAVM()
		{
			DayLA.click();
						
		}
		@FindBy(xpath="(//option[text()='Atul Walekar'])[5]")
		public WebElement SelectChampionsLA;
		public void SelectChampionsLAVM()
		{
			SelectChampionsLA.click();
						
		}
		@FindBy(xpath="//td[@class='input-cell qp-border-new']//i[@class='fa fa-floppy-o']")
		public WebElement SaveCallLA;
		public void ClickOnSaveCallSymbolLAVM()
		{
			SaveCallLA.click();
						
		}
		@FindBy(xpath="//td[@class='input-cell qp-border-new']//i[@class='fa fa-times']")
		public WebElement DeleteCallLA;
		public void ClickOnDeleteCallLAVM()
		{
			DeleteCallLA.click();
						
		}
//-------------------------------------------------------------------Activities_LogActivity__Email_Function
		@FindBy(xpath="//a[text()='test12345']")
		public WebElement ProjectNameLink22;
		public void ClickOnProjectNameLink22VM()
		{
			ProjectNameLink22.click();
						
		}
		@FindBy(xpath="//a[@id='CallEmail']")
		public WebElement EmailBtn;
		public void ClickOnEmailBtnVM()
		{
			EmailBtn.click();
						
		}	
		@FindBy(xpath="//textarea[@placeholder='Please enter your note (250 characters max)']")
		public WebElement EmailNoteLA;
		public void EnterOnEmailNoteLAVM()
		{
			EmailNoteLA.sendKeys("Discussion on Automation and Framework");
		}
		@FindBy(xpath="//select[@class='cell-input val-status']")
		public WebElement EmailStatus;
		public void SelectEmailStatusVM()
		{
			Select s15= new Select(EmailStatus);
			s15.selectByVisibleText("In Progress");
		}	
		@FindBy(xpath="//input[@class='cell-input val-followup_date hasDatepicker']")
		public WebElement EmailFollowupDateBoxLA;
		public void ClickOnEmailFollowupDateBoxLAVM()
		{
			EmailFollowupDateBoxLA.click();
						
		}
		@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
		public WebElement EmailMonthLA;
		public void SelectEmailMonthLAVM()
		{
			Select s16 = new Select(EmailMonthLA);
			s16.selectByVisibleText("Oct");
		}
		@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
		public WebElement EmailYearLA;
		public void SelectEmailYearLAVM()
		{
			Select s17 = new Select(EmailYearLA);
			s17.selectByVisibleText("2025");
		}
		@FindBy(xpath="(//a[text()='20'])[4]")
		public WebElement EmailDayLA;
		public void ClickOnEmailDayLAVM()
		{
			EmailDayLA.click();
						
		}
		@FindBy(xpath="(//option[text()='Atul Walekar'])[5]")
		public WebElement SelectEmailChampionsLA;
		public void SelectSelectEmailChampionsLAVM()
		{
			SelectEmailChampionsLA.click();
						
		}
		
		@FindBy(xpath="//td[@class='input-cell qp-border-new']//i[@class='fa fa-floppy-o']")
		public WebElement SaveEmailLA;
		public void ClickOnSaveEmailSymbolLAVM()
		{
			SaveEmailLA.click();
						
		}
		@FindBy(xpath="//td[@class='input-cell qp-border-new']//i[@class='fa fa-times']")
		public WebElement DeleteEmailLA;
		public void ClickOnDeleteEmailLAVM()
		{
			DeleteEmailLA.click();
						
		}
//-------------------------------------------------------------------Activities_LogActivity__Follow_up_Function
		@FindBy(xpath="//a[text()='test12345']")
		public WebElement ProjectNameLink23;
		public void ClickOnProjectNameLink23VM()
		{
			ProjectNameLink23.click();
						
		}
		@FindBy(xpath="//a[@id='CallFollowup']")
		public WebElement FollowupBtn;
		public void ClickOnFollowupBtnnVM()
		{
			FollowupBtn.click();
						
		}
		@FindBy(xpath="//textarea[@placeholder='Please enter your note (250 characters max)']")
		public WebElement FolloewupNoteLA;
		public void EnterOnFolloewupNoteLAVM()
		{
			FolloewupNoteLA.sendKeys("Discussion on Automation and Framework");
		}
		@FindBy(xpath="//select[@class='cell-input val-status']")
		public WebElement FollowupStatus;
		public void SelectFollowupStatusVM()
		{
			Select s18= new Select(FollowupStatus);
			s18.selectByVisibleText("Complete");
		}	
		@FindBy(xpath="//input[@class='cell-input val-followup_date hasDatepicker']")
		public WebElement FollowupDateBoxLA;
		public void ClickOnFollowupDateBoxLAVM()
		{
			FollowupDateBoxLA.click();
						
		}
		@FindBy(xpath="//select[@class='ui-datepicker-month']")
		public WebElement FollowupMonthLA;
		public void SelectFollowupMonthLAVM()
		{
			Select s19 = new Select(FollowupMonthLA);
			s19.selectByVisibleText("Oct");
		}
		@FindBy(xpath="//select[@class='ui-datepicker-year']")
		public WebElement FollowupYearLA;
		public void SelectFollowupYearLAVM()
		{
			Select s20 = new Select(FollowupYearLA);
			s20.selectByVisibleText("2025");
		}
		@FindBy(xpath="(//a[text()='25'])[4]")
		public WebElement FollowupDayLA;
		public void ClickOnFollowupDayLAVM()
		{
			FollowupDayLA.click();
						
		}
		@FindBy(xpath="(//option[text()='Atul Walekar'])[5]")
		public WebElement SelectFollowupChampionsLA;
		public void SelectFollowupChampionsLAVM()
		{
			SelectFollowupChampionsLA.click();
						
		}
		
		@FindBy(xpath="//td[@class='input-cell qp-border-new']//i[@class='fa fa-floppy-o']")
		public WebElement SaveFollowupLA;
		public void ClickOnSaveFollowupLAVM()
		{
			SaveFollowupLA.click();
						
		}
		@FindBy(xpath="//td[@class='input-cell qp-border-new']//i[@class='fa fa-times']")
		public WebElement DeleteFollowupLA;
		public void ClickOnDeleteFollowupLAVM()
		{
			DeleteFollowupLA.click();
						
		}
//--------------------------------------------------------------Activities_Notes_Function		
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink24;
		public void ClickOnProjectNameLink24VM()
		{
			ProjectNameLink24.click();
						
		}
		@FindBy(xpath="//a[text()='Notes']")
		public WebElement NotesTab;
		public void ClickOnNotesTabVM()
		{
			NotesTab.click();
						
		}
		@FindBy(xpath="//button[@id='replynote']")
		public WebElement AddNewNoteBtn;
		public void ClickOnAddNewNoteBtnVM()
		{
			AddNewNoteBtn.click();
						
		}
		@FindBy(xpath="//textarea[@class='LeadComment']")
		public WebElement NoteBox;
		public void  ClickOnNoteBoxVM()
		{
			NoteBox.click();
						
		}
		@FindBy(xpath="//div[@class='richText-editor']")
		public WebElement NoteBox1;
		public void EnterOnNoteBoxVM()
		{
			NoteBox1.sendKeys("Preparation  Test Cases and Design the script for BOM module");
						
		}
		@FindBy(xpath="//a[@onclick='saveNote();']")
		public WebElement SaveNote;
		public void ClickOnSaveNoteSymboolVM()
		{
			SaveNote.click();
						
		}
		@FindBy(xpath="//a[@onclick='edit_cancel(0,1,0);']")
		public WebElement CnacelNote;
		public void ClickOnCnacelNoteSymboolVM()
		{
			CnacelNote.click();
						
		}
//--------------------------------------------------------------Activities_Comment_Delete_Edit_Mail_MailHistory_Function
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink25;
		public void ClickOnProjectNameLink25VM()
		{
			ProjectNameLink25.click();
						
		}
		@FindBy(xpath="//a[@onclick='saveComment(247,1,0);']")
		public WebElement Comment;
		public void ClickOnCommentSymboolVM()
		{
			Comment.click();
						
		}
		@FindBy(xpath="//textarea[@id='lead_comments_247_1_1']")
		public WebElement CommentBox;
		public void  ClickOnCommentBoxVM()
		{
			CommentBox.click();
						
		}
		@FindBy(xpath="//div[@class='richText-editor']")
		public WebElement CommentBox1;
		public void EnterOnCommentBox1VM()
		{
			CommentBox1.sendKeys("Task Completed");
						
		}
		@FindBy(xpath="//a[@id='commadd_247_1_1']")
		public WebElement SaveComment;
		public void ClickOnSaveCommentSymbool1VM()
		{
			SaveComment.click();
						
		}
		@FindBy(xpath="//a[@id='viewBtnNoteCancel_247_1_1']")
		public WebElement CnacelComment;
		public void ClickOnCnacelCommentSymboolVM()
		{
			CnacelComment.click();
						
		}
		@FindBy(xpath="//a[@id='commedit_247_1_1']")
		public WebElement EditComment;
		public void ClickOnEditCommentSymboolVM()
		{
			EditComment.click();
						
		}
		@FindBy(xpath="//div[@class='richText-editor']")
		public WebElement EditCommentBox;
		public void ClickOnEditCommentBoxVM()
		{
			EditCommentBox.click();
						
		}
		@FindBy(xpath="//div[@class='richText-editor']")
		public WebElement UpdateComment;
		public void EnterOnUpdateCommentVM()
		{
			UpdateComment.sendKeys(" Edited Version");
						
		}
		@FindBy(xpath="(//a[@class='fa fa-save BtnNoteSave'])[2]")
		public WebElement SaveUpdateComment;
		public void ClickOnSaveUpdateCommentVM()
		{
			SaveUpdateComment.click();
						
		}
		@FindBy(xpath="(//a[@class='fa fa-close BtnNoteCancel'])[2]")
		public WebElement CancelUpdateComment;
		public void ClickOnCancelUpdateCommentVM()
		{
			CancelUpdateComment.click();
						
		}
		@FindBy(xpath="//a[@id='commdel_247_2']")
		public WebElement DeleteComment;
		public void ClickOnDeleteCommenttSymboolVM()
		{
			DeleteComment.click();
						
		}
//-------------------------------------------------------Activities_Delete_Function
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink26;
		public void ClickOnProjectNameLink26VM()
		{
			ProjectNameLink26.click();
						
		}
		@FindBy(xpath="//a[@class='fa fa-trash-o fa-fw BtnNoteDelete']")
		public WebElement DeleteNotes;
		public void ClickOnDeleteNotesVM()
		{
			DeleteNotes.click();
						
		}
		@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span[text()='Yes']")
		public WebElement DeleteYesBtn;
		public void ClickOnDeleteYesBtnVM()
		{
			DeleteYesBtn.click();
						
		}
		@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span[text()='No']")
		public WebElement DeleteNoBtn;
		public void ClickOnDeleteNoBtnVM()
		{
			DeleteNoBtn.click();
						
		}
//-----------------------------------------------------------------Activities_Edit_Function		
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink27;
		public void ClickOnProjectNameLink27VM()
		{
			ProjectNameLink27.click();
						
		}
		@FindBy(xpath="//a[@class='fa fa-pencil itemediticon BtnNoteEdit']")
		public WebElement EditNotes;
		public void ClickOnEditNotesSymboolVM()
		{
			EditNotes.click();
						
		}

		@FindBy(xpath="//div[@class='richText-editor']")
		public WebElement EditNotesBox;
		public void EnterOnEditNotesBoxVM()
		{
			EditNotesBox.sendKeys(" Edited Version");
						
		}
		@FindBy(xpath="//a[@class='fa fa-close BtnNoteCancel']")
		public WebElement CancelEditNotes;
		public void ClickOnCancelEditNotesSymbolVM()
		{
			CancelEditNotes.click();
						
		}
		@FindBy(xpath="//a[@class='fa fa-save BtnNoteSave']")
		public WebElement SaveEditNotes;
		public void ClickOnSaveEditNotesSymbolVM()
		{
			SaveEditNotes.click();
						
		}
//-------------------------------------Activities_Mail_MailHistory_Function
		@FindBy(xpath="//a[text()='spreadsheet version New']")
		public WebElement ProjectNameLink28;
		public void ClickOnProjectNameLink28VM()
		{
			ProjectNameLink28.click();
						
		}
		@FindBy(xpath="//a[@class='fa fa-envelope BtnNoteEmail']")
		public WebElement NoteEmailBtn;
		public void ClickOnNoteEmailBtnVM()
		{
			NoteEmailBtn.click();
						
		}
		@FindBy(xpath="(//ul[@class='select2-selection__rendered'])[5]")
		public WebElement NoteEmailIDBox;
		public void ClickOnNoteEmailIDBoxVM()
		{
			NoteEmailIDBox.click();
						
		}
		@FindBy(xpath="//li[text()='quoteplan_admin']")
		public WebElement SelectNotesUserID;
		public void ClickOnSelectNotesUserIDVM()
		{
			SelectNotesUserID.click();
						
		}
		@FindBy(xpath="//a[@class='btn ru-create-new' and @id='UserSharePopup_247_1_0']")
		public WebElement ShareNoteEmailIDBtn;
		public void ClickOnShareNoteEmailIDBtnVM()
		{
			ShareNoteEmailIDBtn.click();
						
		}
		@FindBy(xpath="//a[@class='tooltip-link fa fa-h-square BtnNoteEmailLog']")
		public WebElement ShareNoteEmailLog;
		public void ClickOnShareNoteEmailLogSyambolVM()
		{
			ShareNoteEmailLog.click();
						
		}
		
		@FindBy(xpath="//a[@class='btn ru-create-new' and @id='closeUserPopup_247_1_0']")
		public WebElement CloseNoteEmailIDBtn;
		public void ClickOnCloseNoteEmailIDBtnVM()
		{
			CloseNoteEmailIDBtn.click();
						
		}
	public ViewModify(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
