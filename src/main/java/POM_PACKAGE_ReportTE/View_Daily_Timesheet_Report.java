package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Daily_Timesheet_Report {
	

	@FindBy(xpath="//i[@class='fa fa-bars']")
	private WebElement menu;
	public void clickmenubtn()
	{
		menu.click();
	}
	@FindBy(xpath="//span[text()='Reports']")
	private WebElement reports;
	public void clickreports()
	{
		reports.click();
	}
	@FindBy(xpath="//a[@role='menuitem' and @id='ui-id-29' ]") //(//li[@class='ui-menu-item'])[46]
	private WebElement TimeSheetReport;
	public void ClickOnTimeSheetReport()
	{
		TimeSheetReport.click();
	}
	@FindBy(xpath="(//a[@id='labor-report-link'])[1]")
	private WebElement ViewDailyTimesheetReport;
	public void ClickOnViewDailyTimesheetReport()
	{
		ViewDailyTimesheetReport.click();
	}
//------------------------------------------------------------------Simple search	
	@FindBy(xpath="//input[@id='timetracking_report_text']")
	private WebElement SearchBoxDTR;
	public void EnterSearchBoxDTR_User()
	{
		SearchBoxDTR.sendKeys("Admin");
	}
	@FindBy(xpath="//button[@id='search_timetracking_daily_report']")
	private WebElement SarchBtnDTR;
	
	public void ClickOnSarchBtnDTR()
	{
		SarchBtnDTR.click();
	}
//------------------------------------------------------------------Advanced Search By User
	@FindBy(xpath="//a[@onclick='showlaborReportAdvSearh();']")
	private WebElement AdvancedSearchDTR;
	public void ClickAdvancedSearchBtnDTR()
	{
		AdvancedSearchDTR.click();
	}
	@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
	private WebElement AddFilterDTR;
	public void SelectAddFilterDTR()
	{
		Select DTR = new Select(AddFilterDTR);
		DTR.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterDTR;
	public void SelectLikeFilterDTR()
	{
		Select DTR1 = new Select(LikeFilterDTR);
		DTR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserFilterDTR;
	public void EnterFilterUserDTR()
	{
		UserFilterDTR.sendKeys("Aaron Lehto");
	}
	@FindBy(xpath="(//form[@class='form-horizontal qp-advance-searchbox']//input[@type='submit'])[11]")
	private WebElement ApplyDTR;
	public void ClickOnApplyDTRBtn()
	{
		ApplyDTR.click();
	}
//---------------------------------------------------------Advanced Search By Projrct No / Name
	@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
	private WebElement AddFilterDTRPN;
	public void SelectAddFilterDTRPN()
	{
		Select DTRPN = new Select(AddFilterDTRPN);
		DTRPN.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterDTRPN;
	public void SelectLikeFilterDTRPN()
	{
		Select DTRPN1 = new Select(LikeFilterDTRPN);
		DTRPN1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserFilterDTRPN;
	public void EnterFilterUserDTRPN()
	{
		UserFilterDTRPN.sendKeys("APQ Internal");
	}
//-------------------------------------------------	Advanced Search By Customer
	@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
	private WebElement AddFilterCustomerDTR;
	public void SelectAddFilterCustomerDTR()
	{
		Select Customer = new Select(AddFilterCustomerDTR);
		Customer.selectByVisibleText("Customer");
	}
	
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterDTRPC;
	public void SelectLikeFilterDTRPC()
	{
		Select DTRPC1 = new Select(LikeFilterDTRPC);
		DTRPC1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserFilterDTRPC;
	public void EnterFilterUserDTRPC()
	{
		UserFilterDTRPC.sendKeys("Lexington Manufacturing, Brainerd");
	}
//--------------------------------------------------------------Advanced Search By Task
	@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
	private WebElement AddFilterDTRTask;
	public void SelectAddFilterDTRTask()
	{
		Select Task = new Select(AddFilterDTRTask);
		Task.selectByVisibleText("Task");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterDTRTask;
	public void SelectLikeFilterDTRTask()
	{
		Select Task1 = new Select(LikeFilterDTRTask);
		Task1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserFilterDTRTask;
	public void EnterFilterDTRTask()
	{
		UserFilterDTRTask.sendKeys("G_Meetings");
	}
//--------------------------------------------------------Advanced Search By LAbor Code
	@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
	private WebElement AddFilterDTRLaborCode;
	public void SelectAddFilterDTRLaborCode()
	{
		Select Labor = new Select(AddFilterDTRLaborCode);
		Labor.selectByVisibleText("Labor Code");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterDTRLaborCode;
	public void SelectLikeFilterDTRLaborCode()
	{
		Select Labor1 = new Select(LikeFilterDTRLaborCode);
		Labor1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserFilterDTRLaborCode;
	public void EnterFilterDTRLaborCode()
	{
		UserFilterDTRLaborCode.sendKeys("ENG-Project Management");
	}
//--------------------------------------------------------Advanced Search By Status
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRStatus;
		public void SelectAddFilterDTRStatus()
		{
			Select Status = new Select(AddFilterDTRStatus);
			Status.selectByVisibleText("Status");
		}
		@FindBy(xpath="//select[@class='criterias form-control']")
		private WebElement LikeFilterDTRStatus;
		public void SelectLikeFilterDTRStatus()
		{
			Select Status1 = new Select(LikeFilterDTRStatus);
			Status1.selectByVisibleText("=");
		}
		@FindBy(xpath="//option[text()='EMAILED']")
		private WebElement STATUS;
		public void SelectDTRstatus()
		{
			STATUS.click();
		}
//--------------------------------------------------------Advanced Search By Billable
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRBillable;
		public void SelectAddFilterDTRBillable()
		{
			Select Billable = new Select(AddFilterDTRBillable);
			Billable.selectByVisibleText("Billable");
		}
		
		@FindBy(xpath="//option[text()='NO']")
		private WebElement BILLABLE;
		public void SelectDTRBillable()
		{
			BILLABLE.click();
		}
//----------------------------------------------------Advanced Search By Comments
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRComments;
		public void SelectAddFilterDTRComments()
		{
			Select Comments1 = new Select(AddFilterDTRComments);
			Comments1.selectByVisibleText("Comments");
		}
		@FindBy(xpath="//select[@class='criterias form-control']")
		private WebElement LikeFilterDTRComments;
		public void SelectLikeFilterDTRComments()
		{
			Select Comments = new Select(LikeFilterDTRComments);
			Comments.selectByVisibleText("=");
		}
		@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
		private WebElement UserFilterDTRComments;
		public void EnterFilterDTRComments()
		{
			UserFilterDTRComments.sendKeys("Add users to Yakima Daily Prod Reports.");
		}
//------------------------------------------------------Advanced Search By Reg_OT_DT_TT	
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRReg;
		public void SelectAddFilterDTRReg()
		{
			Select Reg = new Select(AddFilterDTRReg);
			Reg.selectByVisibleText("Reg");
		}
		@FindBy(xpath="//select[@class='criterias form-control']")
		private WebElement LikeFilterDTRReg;
		public void SelectLikeFilterDTRReg()
		{
			Select Reg1 = new Select(LikeFilterDTRReg);
			Reg1.selectByVisibleText("=");
		}
		@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
		private WebElement UserFilterDTRReg;
		public void EnterFilterDTRReg()
		{
			UserFilterDTRReg.sendKeys("5");
		}
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTROT;
		public void SelectAddFilterDTROT()
		{
			Select OT = new Select(AddFilterDTROT);
			OT.selectByVisibleText("OT");
		}
		@FindBy(xpath="//select[@class='criterias form-control']")
		private WebElement LikeFilterDTROT;
		public void SelectLikeFilterDTROT()
		{
			Select OT1 = new Select(LikeFilterDTRReg);
			OT1.selectByVisibleText("=");
		}
		@FindBy(xpath="(//input[@class='search_string1 form-control'])[2]")
		private WebElement UserFilterDTROT;
		public void EnterFilterDTROT()
		{
			UserFilterDTROT.sendKeys("0");
		}
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRDT;
		public void SelectAddFilterDTRDT()
		{
			Select DT = new Select(AddFilterDTRDT);
			DT.selectByVisibleText("DT");
		}
		@FindBy(xpath="//select[@class='criterias form-control']")
		private WebElement LikeFilterDTRDT;
		public void SelectLikeFilterDTRDT()
		{
			Select DT1 = new Select(LikeFilterDTRDT);
			DT1.selectByVisibleText("=");
		}
		@FindBy(xpath="(//input[@class='search_string1 form-control'])[3]")
		private WebElement UserFilterDTRDT;
		public void EnterFilterDTRDT()
		{
			UserFilterDTRDT.sendKeys("0");
		}
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRTT;
		public void SelectAddFilterDTRTT()
		{
			Select TT = new Select(AddFilterDTRTT);
			TT.selectByVisibleText("TT");
		}
		@FindBy(xpath="//select[@class='criterias form-control']")
		private WebElement LikeFilterDTRTT;
		public void SelectLikeFilterDTRTT()
		{
			Select TT1 = new Select(LikeFilterDTRTT);
			TT1.selectByVisibleText("=");
		}
		@FindBy(xpath="(//input[@class='search_string1 form-control'])[4]")
		private WebElement UserFilterDTRTT;
		public void EnterFilterDTRTT()
		{
			UserFilterDTRTT.sendKeys("0");
		}
//------------------------------------------------------Advanced By Date
		@FindBy(xpath="//select[@id='timetracking_report_adv_search']")
		private WebElement AddFilterDTRDate;
		public void SelectAddFilterDTRDate()
		{
			Select DateDTR = new Select(AddFilterDTRDate);
			DateDTR.selectByVisibleText("Date");
		}
		@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
		private WebElement AdvancedDateDTR;
		public void ClickonAdvancedDateDTR()
		{
			AdvancedDateDTR.click();
		}
		@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
		private WebElement MonthDTR;
		public void SelectMonthDTR()
		{
			Select DTRMonth = new Select(MonthDTR);
			DTRMonth.selectByVisibleText("May");
		}
		@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
		private WebElement YearDTR;
		public void SelectYearWTRPW()
		{
			Select DTRYear = new Select(YearDTR);
			DTRYear.selectByVisibleText("2025");
		}
		@FindBy(xpath="(//a[text()='1'])[4]")
		private WebElement StartDayDTR;
		public void ClickonStartDayDTR()
		{
			StartDayDTR.click();
		}
		@FindBy(xpath="(//a[text()='31'])[3]")
		private WebElement LastDayDTR;
		public void ClickonLastDayDTR()
		{
			LastDayDTR.click();
		}
		
		
		
//------------------------------------------------------Export Function
		@FindBy(xpath="(//div[@class='ru-project-createnew'])[45]")
		private WebElement ExportDTR;
		public void ClickonExportDTR()
		{
			ExportDTR.click();
		}
		@FindBy(xpath="//a[@id='time-tracking-download-link2']")
		private WebElement DownloadRecordsDTR;
		public void ClickonDownloadRecordsDTR()
		{
			DownloadRecordsDTR.click();
		}
//------------------------------------------------------Load More Function		
		@FindBy(xpath="//table[@id='timetracking_report_search_result']//a[text()='Load more' ]")
		private WebElement LoadMoreDTR;
		public void ClickonLoadMoreDTR()
		{
			LoadMoreDTR.click();
		}
		
	public View_Daily_Timesheet_Report(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
