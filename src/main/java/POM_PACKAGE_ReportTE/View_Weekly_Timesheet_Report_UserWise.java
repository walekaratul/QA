package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Weekly_Timesheet_Report_UserWise {
	
	@FindBy(xpath="//a[@id='weekly-labor-report-link-user']")
	private WebElement WeeklyTimesheetReportUW;
	
	public void ClickOnWeeklyTimesheetReportUW()
	{
		WeeklyTimesheetReportUW.click();
	}
	@FindBy(xpath="//input[@id='timetracking_weekly_user_report_text']")
	private WebElement SearchBoxWTRUW;
	public void EnterSearchBoxWTRUW_User()
	{
		SearchBoxWTRUW.sendKeys("Atul");
	}
	@FindBy(xpath="//button[@id='search_timetracking_weeklyuser_report']")
	private WebElement SarchBtnWTRUW;
	
	public void ClickOnSarchBtnWTRUW()
	{
		SarchBtnWTRUW.click();
	}
	
//-------------------------------------Advanced Search By Date	
	@FindBy(xpath="//a[@onclick='showWeeklyUserlaborReportAdvSearch();']")
	private WebElement AdvancedSearchWTRUW;
	public void ClickonAdvancedSearchBtnWTRPW()
	{
		AdvancedSearchWTRUW.click();
	}
	@FindBy(xpath="//select[@id='timetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterWTRUW;
	public void SelectAddFilterWTRUW()
	{
		Select DateUW = new Select(AddFilterWTRUW);
		DateUW.selectByVisibleText("Date");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement AdvancedDateWTRUW;
	public void ClickonAdvancedDateWTRUW()
	{
		AdvancedDateWTRUW.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement MonthWTRUW;
	public void SelectMonthWTRUW()
	{
		Select MonthUW = new Select(MonthWTRUW);
		MonthUW.selectByVisibleText("May");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement YearWTRUW;
	public void SelectYearWTRUW()
	{
		Select YearUW = new Select(YearWTRUW);
		YearUW.selectByVisibleText("2025");
	}
	@FindBy(xpath="(//a[text()='18'])[4]")
	private WebElement StartDayWTRUW;
	public void ClickonStartDayWTRUW()
	{
		StartDayWTRUW.click();
	}
	@FindBy(xpath="(//a[text()='24'])[4]")
	private WebElement LastDayWTRUW;
	public void ClickonLastDayWTRUW()
	{
		LastDayWTRUW.click();
	}
	@FindBy(xpath="(//form[@class='form-horizontal qp-advance-searchbox']//input[@type='submit'])[13]")
	private WebElement ApplyWTRUW;
	public void ClickOnApplyWTRUW()
	{
		ApplyWTRUW.click();
	}
//----------------------------------------Advanced Search By User	
	
	@FindBy(xpath="//select[@id='timetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterUserWTRUW;
	public void SelectAddFilterUserWTRUW()
	{
		Select UserUW = new Select(AddFilterUserWTRUW);
		UserUW.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterUserWTRUW;
	public void SelectLikeFilteUserWTRPW()
	{
		Select UserUW1 = new Select(LikeFilterUserWTRUW);
		UserUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserWTRUW;
	public void EnterUserWTRUW()
	{
		UserWTRUW.sendKeys("David Daavettila");
	}
//----------------------------------------------Advanced Search By Project Name and Project Date
	@FindBy(xpath="//select[@id='timetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterProjectNoWTRUW;
	public void SelectAddFilterProjectNameWTRUW()
	{
		Select PNameUW = new Select(AddFilterProjectNoWTRUW);
		PNameUW.selectByVisibleText("Project No");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNameWTRUW;
	public void SelectLikeFilteProjectNameWTRUW()
	{
		Select PNameUW1 = new Select(LikeFilterProjectNameWTRUW);
		PNameUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNameFilterWTRUW;
	public void EnterFilterProjectNameWTRUW()
	{
		ProjectNameFilterWTRUW.sendKeys("P10097");
	}
//-------------------------------------Advanced Search By Customer
	@FindBy(xpath="//select[@id='timetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterCustomerWTRUW;
	public void SelectAddFilterCustomerWTRUW()
	{
		Select CustomerUW = new Select(AddFilterCustomerWTRUW);
		CustomerUW.selectByVisibleText("Customer");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCustomerWTRUW;
	public void SelectLikeFilteCustomerWTRUW()
	{
		Select CustomerUW1 = new Select(LikeFilterCustomerWTRUW);
		CustomerUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CustomerWTRUW;
	public void EnterCustomerWTRUW()
	{
		CustomerWTRUW.sendKeys("APQ Internal");
	}
//-----------------------------------Advanced Search By Status
	@FindBy(xpath="//select[@id='timetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterStatusWTRUW;
	public void SelectAddFilterStatusWTRUW()
	{
		Select StatusUW = new Select(AddFilterStatusWTRUW);
		StatusUW.selectByVisibleText("Status");
	}
	@FindBy(xpath="//option[text()='EMAILED']")
	private WebElement STATUSUW;
	public void SelectWTRUWstatus()
	{
		STATUSUW.click();
	}
//---------------------------------------Export Functions 
	@FindBy(xpath="//form[@id='timetracking_weekly_user_report_search']//i[@class='fa fa-plus-circle']")
	private WebElement ExportWTRUW;
	public void ClickonExportWTRPW()
	{
		ExportWTRUW.click();
	}
	@FindBy(xpath="//a[@id='labor_weekly_user-download-link']")
	private WebElement DownloadRecordsWTRUW;
	public void ClickonDownloadRecordsWTRUW()
	{
		DownloadRecordsWTRUW.click();
	}	
	@FindBy(xpath="//a[@id='consolidate_labor_user_weekly-download-link']")
	private WebElement DownloadRecords1WTRUW;
	public void ClickonDownloadRecords1WTRUW()
	{
		DownloadRecords1WTRUW.click();
	}
//-----------------------------------------Show Hide All Record	
	@FindBy(xpath="(//a[text()='Show/Hide All Records'])[4]")
	private WebElement ShowHideAllRecordsWTRUW;
	public void ClickonShowHideAllRecordsWTRUW()
	{
		ShowHideAllRecordsWTRUW.click();
	}
//------------------------------------------Load More Functions
	@FindBy(xpath="//table[@id='timetracking_weekly_report_user_search_result']//a[text()='Load more' ]")
	private WebElement LoadMoreWTRUW;
	public void ClickonLoadMoreWTRUW()
	{
		LoadMoreWTRUW.click();
	}
	public View_Weekly_Timesheet_Report_UserWise(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
