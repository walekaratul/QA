package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Consolidated_User_Report {
	
	@FindBy(xpath="//a[@id='pending-tms-report-link-user']")
	private WebElement ViewConsolidated_UserReport;
	public void ClickOnViewConsolidated_UserReport()
	{
		ViewConsolidated_UserReport.click();
	}
	@FindBy(xpath="//input[@id='timesheetConsolidatedUserReportText']")
	private WebElement SearchBoxCUR;
	public void EnterSearchBoxCUR_User()
	{
		SearchBoxCUR.sendKeys("Nick Skoog");
	}
	@FindBy(xpath="//button[@id='btnSearchTimesheetConsolidatedUserReport']")
	private WebElement SarchBtnCUR;
	
	public void ClickOnSearchBtnCUR()
	{
		SarchBtnCUR.click();
	}
//-----------------------------------------------------------------------Advanced Search By Date 
	@FindBy(xpath="//a[@onclick='showPendingTmsUserReportAdvSearch();']")
	private WebElement AdvancedSearchCUR;
	public void ClickonAdvancedSearchBtnCUR()
	{
		AdvancedSearchCUR.click();
	}
	@FindBy(xpath="//select[@id='timesheetConsolidatedUserReportAdvanceSearch']")
	private WebElement AddFilterCUR;
	public void SelectAddFilterCUR()
	{
		Select DateCUR = new Select(AddFilterCUR);
		DateCUR.selectByVisibleText("Date");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement AdvancedDateCUR;
	public void ClickonAdvancedDateCUR()
	{
		AdvancedDateCUR.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement MonthCUR;
	public void SelectMonthCUR()
	{
		Select CURMONTH = new Select(MonthCUR);
		CURMONTH.selectByVisibleText("Apr");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement YearCUR;
	public void SelectYearCUR()
	{
		Select CURYEAR = new Select(YearCUR);
		CURYEAR.selectByVisibleText("2025");
	}
	@FindBy(xpath="(//a[text()='27'])[4]")
	private WebElement StartDayCUR;
	public void ClickonStartDayCUR()
	{
		StartDayCUR.click();
	}
	@FindBy(xpath="(//a[text()='3'])[5]")
	private WebElement LastDayCUR;
	public void ClickonLastDayCUR()
	{
		LastDayCUR.click();
	}
	@FindBy(xpath="(//form[@class='form-horizontal qp-advance-searchbox']//input[@type='submit'])[14]")
	private WebElement ApplyCUR;
	public void ClickOnApplyCUR()
	{
		ApplyCUR.click();
	}
//------------------------------Advanced Search By User
	@FindBy(xpath="//select[@id='timesheetConsolidatedUserReportAdvanceSearch']")
	private WebElement AddFilterUserCUR;
	public void SelectAddFilterUserCUR()
	{
		Select UserCUR = new Select(AddFilterUserCUR);
		UserCUR.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterUserCUR;
	public void SelectLikeFilteUserCUR()
	{
		Select UserCUR1 = new Select(LikeFilterUserCUR);
		UserCUR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserCUR;
	public void EnterUserCUR()
	{
		UserCUR.sendKeys("Jeremy Hendrickson");
	}
//------------------------------------------------Advanced Search By Department
	
	@FindBy(xpath="//select[@id='timesheetConsolidatedUserReportAdvanceSearch']")
	private WebElement AddFilterDepartmentCUR;
	public void SelectAddFilterDepartmentCUR()
	{
		Select DepartmentCUR = new Select(AddFilterDepartmentCUR);
		DepartmentCUR.selectByVisibleText("Department");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterDepartmentCUR;
	public void SelectLikeFilteDepartmentCUR()
	{
		Select DepartmentCUR1 = new Select(LikeFilterDepartmentCUR);
		DepartmentCUR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement DepartmentCUR;
	public void EnterDepartmentCUR()
	{
		DepartmentCUR.sendKeys("Engineering");
	}
//--------------------------------------------------------------------Advanced Search By User Status
	@FindBy(xpath="//select[@id='timesheetConsolidatedUserReportAdvanceSearch']")
	private WebElement AddFilterStatusCUR;
	public void SelectAddFilterStatusCUR()
	{
		Select StatusCUR = new Select(AddFilterStatusCUR);
		StatusCUR.selectByVisibleText("User Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterStatusCUR;
	public void SelectLikeFilteStatusCUR()
	{
		Select StatusCUR1 = new Select(LikeFilterStatusCUR);
		StatusCUR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement StatusCUR;
	public void EnterStatusCUR()
	{
		StatusCUR.sendKeys("Active");
	}
//-------------------------------------Export Functions
	@FindBy(xpath="//a[@id='timesheetConsolidatedUserReportDownloadLink']")
	private WebElement ExportCUR;
	public void ClickonExportCUR()
	{
		ExportCUR.click();
	}
//--------------------------------------Load More Functions
	@FindBy(xpath="//table[@id='timesheetConsolidatedUserReportSearchResult']//a[text()='Load more' ]")
	private WebElement LoadMoreCUR;
	public void ClickonLoadMoreCUR()
	{
		LoadMoreCUR.click();
	}
	
//-----------------------------Hide Show All Records Functions	
	@FindBy(xpath="(//a[text()='Show/Hide All Records'])[5]")
	private WebElement ShowHideAllRecordsCUR;
	public void ClickonShowHideAllRecordsCUR()
	{
		ShowHideAllRecordsCUR.click();
	}
	public View_Consolidated_User_Report(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
