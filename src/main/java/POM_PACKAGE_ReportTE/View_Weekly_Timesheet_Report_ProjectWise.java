package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Weekly_Timesheet_Report_ProjectWise {
	
	@FindBy(xpath="//a[@id='weekly-labor-report-link']")
	private WebElement WeeklyTimesheetReportPW;
	
	public void ClickOnWeeklyTimesheetReportPW()
	{
		WeeklyTimesheetReportPW.click();
	}
	
	@FindBy(xpath="//input[@id='timetracking_weekly_report_text']")
	private WebElement SearchBoxWTRPW;
	public void EnterSearchBoxWTRPW_User()
	{
		SearchBoxWTRPW.sendKeys("Atul");
	}
	@FindBy(xpath="//button[@id='search_timetracking_weeklyproj_report']")
	private WebElement SarchBtnWTRPW;
	
	public void ClickOnSarchBtnWTRPW()
	{
		SarchBtnWTRPW.click();
	}
//-------------------------------------Advanced Search By Date
	@FindBy(xpath="//a[@onclick='showWeeklylaborReportAdvSearch();']")
	private WebElement AdvancedSearchWTRPW;
	public void ClickonAdvancedSearchBtnWTRPW()
	{
		AdvancedSearchWTRPW.click();
	}
	@FindBy(xpath="//select[@id='timetracking_weekly_report_adv_search']")
	private WebElement AddFilterWTRPW;
	public void SelectAddFilterWTRPW()
	{
		Select Date = new Select(AddFilterWTRPW);
		Date.selectByVisibleText("Date");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement AdvancedDateWTRPW;
	public void ClickonAdvancedDateWTRPW()
	{
		AdvancedDateWTRPW.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement MonthWTRPW;
	public void SelectMonthWTRPW()
	{
		Select MonthPW = new Select(MonthWTRPW);
		MonthPW.selectByVisibleText("Apr");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement YearWTRPW;
	public void SelectYearWTRPW()
	{
		Select YearPW = new Select(YearWTRPW);
		YearPW.selectByVisibleText("2025");
	}
	@FindBy(xpath="(//a[text()='27'])[4]")
	private WebElement StartDayWTRPW;
	public void ClickonStartDayWTRPW()
	{
		StartDayWTRPW.click();
	}
	@FindBy(xpath="(//a[text()='3'])[5]")
	private WebElement LastDayWTRPW;
	public void ClickonLastDayWTRPW()
	{
		LastDayWTRPW.click();
	}
	@FindBy(xpath="(//form[@class='form-horizontal qp-advance-searchbox']//input[@type='submit'])[12]")
	private WebElement ApplyWTRPW;
	public void ClickOnApplyWTRPW()
	{
		ApplyWTRPW.click();
	}
//-------------------------------------Advanced Search By Project No  and Project Name	
	
	@FindBy(xpath="//select[@id='timetracking_weekly_report_adv_search']")
	private WebElement AddFilterProjectNoWTRPW;
	public void SelectAddFilterProjectNameWTRPW()
	{
		Select PName = new Select(AddFilterProjectNoWTRPW);
		PName.selectByVisibleText("Project No");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNameWTRPW;
	public void SelectLikeFilteProjectNameWTRPW()
	{
		Select PName1 = new Select(LikeFilterProjectNameWTRPW);
		PName1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNameFilterWTRPW;
	public void EnterFilterProjectNameWTRPW()
	{
		ProjectNameFilterWTRPW.sendKeys("P10237");
	}
//-----------------------------------Advanced Search By Customer
	@FindBy(xpath="//select[@id='timetracking_weekly_report_adv_search']")
	private WebElement AddFilterCustomerWTRPW;
	public void SelectAddFilterCustomerWTRPW()
	{
		Select Customer = new Select(AddFilterCustomerWTRPW);
		Customer.selectByVisibleText("Customer");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCustomerWTRPW;
	public void SelectLikeFilteCustomerWTRPW()
	{
		Select Customer1 = new Select(LikeFilterCustomerWTRPW);
		Customer1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CustomerWTRPW;
	public void EnterCustomerWTRPW()
	{
		CustomerWTRPW.sendKeys("Seneca Foods Corporation");
	}
//------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@id='timetracking_weekly_report_adv_search']")
	private WebElement AddFilterUserWTRPW;
	public void SelectAddFilterUserWTRPW()
	{
		Select User = new Select(AddFilterUserWTRPW);
		User.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterUserWTRPW;
	public void SelectLikeFilteUserWTRPW()
	{
		Select User1 = new Select(LikeFilterUserWTRPW);
		User1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserWTRPW;
	public void EnterUserWTRPW()
	{
		UserWTRPW.sendKeys("Nick Skoog");
	}
//------------------------------------Advanced Search By Status	
	@FindBy(xpath="//select[@id='timetracking_weekly_report_adv_search']")
	private WebElement AddFilterStatusWTRPW;
	public void SelectAddFilterStatusWTRPW()
	{
		Select Status = new Select(AddFilterStatusWTRPW);
		Status.selectByVisibleText("Status");
	}
	@FindBy(xpath="//option[text()='NO STATUS']")
	private WebElement STATUS;
	public void SelectWTRPWstatus()
	{
		STATUS.click();
	}
//---------------------------------------Export Functions	
	@FindBy(xpath="//form[@id='timetracking_weekly_report_search']//i[@class='fa fa-plus-circle']")
	private WebElement ExportWTRPW;
	public void ClickonExportWTRPW()
	{
		ExportWTRPW.click();
	}
	@FindBy(xpath="//a[@id='time-tracking-download-link3']")
	private WebElement DownloadRecordsWTRPW;
	public void ClickonDownloadRecordsWTRPW()
	{
		DownloadRecordsWTRPW.click();
	}	
//-----------------------------------------Show Hide All Record
	@FindBy(xpath="(//a[text()='Show/Hide All Records'])[3]")
	private WebElement ShowHideAllRecordsWTRPW;
	public void ClickonShowHideAllRecordsWTRPW()
	{
		ShowHideAllRecordsWTRPW.click();
	}
//--------------------------------------------------------Load More Function	
	@FindBy(xpath="//table[@id='timetracking_weekly_report_search_result']//a[text()='Load more' ]")
	private WebElement LoadMoreWTRPW;
	public void ClickonLoadMoreWTRPW()
	{
		LoadMoreWTRPW.click();
	}
	public View_Weekly_Timesheet_Report_ProjectWise(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
