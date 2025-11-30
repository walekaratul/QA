package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_TimesheetTT {
	
	@FindBy(xpath="//i[@class='fa fa-bars']")
	private WebElement Menu;
	public void ClickOnMenuBtn()
	{
		Menu.click();
	}
	@FindBy(xpath="//span[text()='Time Tracking']")
	private WebElement TimeTracking;
	public void ClickOnTimeTracking()
	{
		TimeTracking.click();
	}
	@FindBy(xpath="//a[@onclick='showNewTimeTrackingSheetCreate(0)']")
	private WebElement CreateTimesheet;
	public void ClickOnCreateTimesheet()
	{
		CreateTimesheet.click();
	}
//---------------------------------------------------------------------------Add Row Function	
	@FindBy(xpath="//button[@class='btn ru-download-csv qp-addrow-tms']")
	private WebElement AddRowCT;
	public void ClickOnAddRowCTBtn()
	{
		AddRowCT.click();
	}
//---------------------------------------------------------------------------Date Function
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	private WebElement Datepicker;
	public void ClickOnDatepickerCT()
	{
		
		Datepicker.click();
	}
	@FindBy(xpath="(//select[@data-handler='selectMonth'])[2]")
	private WebElement SelectMonth;
	public void SelectMonthCT()
	{
		 Select s1 = new Select(SelectMonth);
	     s1.selectByVisibleText("Aug");
		
	}
	@FindBy(xpath="(//select[@data-handler='selectYear'])[2]")
	private WebElement SelectYeaar;
	public void SelectYeaarCT()
	{
		Select s2 = new Select(SelectYeaar);
        s2.selectByValue("2025");
		
	}
	@FindBy(xpath="(//a[text()='10'])[4]")
	private WebElement Day;
	public void ClickOnDayCT()
	{
		Day.click();
		
	}
//---------------------------------------------------------------Project Function
	@FindBy(xpath="//input[@id='newtimetracking-project_name']")
	private WebElement ProjectBox;
	public void ClickOnProjectBoxCT()
	{
		
		ProjectBox.click();
	}
	@FindBy(xpath="//input[@id='project-select-search-text']")
	private WebElement searchbox;
	public void EnteronsearchboxCT()
	{
		
		searchbox.sendKeys("APQ Internal");
	}
	@FindBy(xpath="//form[@id='project-select-form']//i[@class='fa fa-search']")
	private WebElement searchicon;
	public void ClickonsearchiconCT()
	{
		
		searchicon.click();
	}
	@FindBy(xpath="//a[text()='APQ Internal']")
	private WebElement SelectProject;
	public void SelectProjectCT()
	{
		
		SelectProject.click();
	}
//-----------------------------------------------------------------Task Function	
	@FindBy(xpath="//select[@id='task_1']")
	private WebElement SelectTask;
	public void SelectTaskCT()
	{
		
		Select s3 = new Select(SelectTask);
        s3.selectByVisibleText("G_Internal Project");
	}
//--------------------------------------------------------------Labor Function	
	@FindBy(xpath="//select[@id='laborva_1']")
	private WebElement SelectLabor;
	public void SelectLaborCT()
	{
		
		Select s4 = new Select(SelectLabor);
        s4.selectByVisibleText("APQ-Internal Project");
	}
//-----------------------------------------------------------Enter Day Function
	
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[1]")
	private WebElement Monday;
	public void EnterMondayHrsCT()
	{
		Monday.sendKeys("1");
	}
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[2]")
	private WebElement Tuesday;
	public void EnterTuesdayHrsCT()
	{
		Tuesday.sendKeys("2");
	}
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[3]")
	private WebElement Wednesday;
	public void EnterWednesdayHrsCT()
	{
		Wednesday.sendKeys("3");
	}
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[4]")
	private WebElement Thursday;
	public void EnterThursdayHrsCT()
	{
		Thursday.sendKeys("4");
	}
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[5]")
	private WebElement Friday;
	public void EnterFridayHrsCT()
	{
		Friday.sendKeys("5");
	}
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[6]")
	private WebElement Saturday;
	public void EnterSaturdayHrsCT()
	{
		Saturday.sendKeys("6");
	}
	@FindBy(xpath="(//input[@class='newhour_value_data form-control qp-week'])[7]")
	private WebElement Sunday;
	public void EnterSundayHrsCT()
	{
		Sunday.sendKeys("7");
	}
//----------------------------------------------------------------------------Enter Comment Function	
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[1]")
	private WebElement Commentbox1;
	public void ClickOnCommentbox1CT()
	{
		Commentbox1.click();
	}
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[2]")
	private WebElement Commentbox2;
	public void ClickOnCommentbox2CT()
	{
		Commentbox2.click();
	}
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[3]")
	private WebElement Commentbox3;
	public void ClickOnCommentbox3CT()
	{
		Commentbox3.click();
	}
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[4]")
	private WebElement Commentbox4;
	public void ClickOnCommentbox4CT()
	{
		Commentbox4.click();
	}
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[5]")
	private WebElement Commentbox5;
	public void ClickOnCommentbox5CT()
	{
		Commentbox5.click();
	}
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[6]")
	private WebElement Commentbox6;
	public void ClickOnCommentbox6CT()
	{
		Commentbox6.click();
	}
	@FindBy(xpath="(//textarea[@class='dayComments tbtxt fixedTextarea'])[7]")
	private WebElement Commentbox7;
	public void ClickOnCommentbox7CT()
	{
		Commentbox7.click();
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[1]")
	private WebElement EnterComment1;
	public void EnterMondayComment1CT()
	{
		EnterComment1.sendKeys("Complete Monday Task");
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[2]")
	private WebElement EnterComment2;
	public void EnterTuesdayComment2CT()
	{
		EnterComment2.sendKeys("Complete Tuesday Task");
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[3]")
	private WebElement EnterComment3;
	public void EnterWednesdayComment3CT()
	{
		EnterComment3.sendKeys("Complete Wednesday Task and $320");
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[4]")
	private WebElement EnterComment4;
	public void EnterThursdayComment4CT()
	{
		EnterComment4.sendKeys("Complete Thursday Task");
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[5]")
	private WebElement EnterComment5;
	public void EnterFridayComment5CT()
	{
		EnterComment5.sendKeys("Complete Friday Task and $520");
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[6]")
	private WebElement EnterComment6;
	public void EnterSaturdayComment6CT()
	{
		EnterComment6.sendKeys("Complete Saturday Task");
	}
	@FindBy(xpath="(//textarea[@class='new_comment_data'])[7]")
	private WebElement EnterComment7;
	public void EnterSundayComment7CT()
	{
		EnterComment7.sendKeys("Complete Sunday Task and $560");
	}
//-----------------------------------------------------Save Function
	
	@FindBy(xpath="//a[text()='Save Timesheet']")
	private WebElement SaveTimesheet;
	public void ClickOnSaveTimesheetCT()
	{
		SaveTimesheet.click();
	}
	
//------------------------------------------------------------Check Box Function  
	
	@FindBy(xpath="(//table[@id='new_timetracking_sheet_table']//tr//td[1])")
	private WebElement Checkbox;
	public void ClickOnCheckboxCT()
	{
		Checkbox.click();
	}
//------------------------------------------------------------Issue For Approval Supervisor/Internal Function 
	@FindBy(xpath="//a[@id='timesheet-actions-dropdown-btn']")
	private WebElement Actions;
	public void ClickOnActionsBtnCT()
	{
		Actions.click();
	}
	@FindBy(xpath="(//ul[@class='dropdown-menu']//li[@class='dropdown-submenu qp-dropdown-submenu']//p[@class='qp-drop-menu'])[16]")
	private WebElement IssueForApproval;
	public void ClickOnIssueForApprovalCT()
	{
		IssueForApproval.click();
	}
	@FindBy(xpath="(//a[@class='newbgTmsSubmit'])[1]")
	private WebElement SupervisorInternal;
	public void ClickOnSupervisorInternalCT()
	{
		SupervisorInternal.click();
	}
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span[text()='Yes, Submit!']")
	private WebElement SubmitPopup;
	public void ClickOnSubmitPopupCT()
	{
		SubmitPopup.click();
	}
	
	@FindBy(xpath="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[78]")
	private WebElement CancelPopup;
	public void ClickOnCancelPopupCT()
	{
		CancelPopup.click();
	}
	
//------------------------------------------------------------Issue For Approval Project Manager/Internal Function 
		
		
		@FindBy(xpath="//li[@class='dropdown-submenu qp-dropdown-submenu active']//a[text()='Project Manager']")
		private WebElement ProjectManager;
		public void ClickOnProjectManagerCT()
		{
			ProjectManager.click();
		}
		@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span[text()='Yes, Submit!']")
		private WebElement SubmitPopupPM;
		public void ClickOnSubmitPopupPMCT()
		{
			SubmitPopupPM.click();
		}
		
		@FindBy(xpath="(//div[@class='ui-dialog-buttonset']//span[text()='Cancel'])[29]")
		private WebElement CancelPMPopup;
		public void ClickOnCancelPMPopupCT()
		{
			CancelPMPopup.click();
		}
//-------------------------------------------------------Copy From Timesheet Function	
	@FindBy(xpath="//a[text()='Copy from Timesheet']")
	private WebElement CopyFromTimesheet;
	public void ClickOnCopyFromTimesheetCT()
	{
		CopyFromTimesheet.click();
	}
	@FindBy(xpath="//a[text()='26 Feb 2024 to 03 Mar 2024']")
	private WebElement SelectWeek;
	public void ClicklOnSelectWeekCT()
	{
		SelectWeek.click();
	}
//--------------------------------------------------------ExportTimesheet Function
	@FindBy(xpath="//ul[@class='dropdown-menu']//p[text()='Export Timesheet ']")
	private WebElement ExportTimsheet;
	public void ClickOnExportTimsheetCT()
	{
		ExportTimsheet.click();
	}
	@FindBy(xpath="//a[@onclick='newtmsExportPdf();']")
	private WebElement PDF;
	public void ClickOnPDFCT()
	{
		PDF.click();
	}
	
//-----------------------------------------------------ResetTimesheet Function
	@FindBy(xpath="//a[@id='reset_timesheet_value']")
	private WebElement ResetTimesheet;
	public void clickOnResetTimesheetCT()
	{
		ResetTimesheet.click();
	}
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span[text()='Yes']")
	private WebElement ResetYes;
	public void clickOnResetYesCT()
	{
		ResetYes.click();
	}
	
//------------------------------------------------------HideShowColumn Function
	@FindBy(xpath="//button[text()='Hide/Show Column']")
	private WebElement HideShowColumn;;
	public void ClickOnHideShowColumn()
	{
		HideShowColumn.click();
	}
	@FindBy(xpath="//span[text()='Type']")
	private WebElement TypeCheckbox;
	public void ClickOnTypeCheckbox()
	{
		TypeCheckbox.click();
	}
//---------------------------------------------------------------------------Self Function
	@FindBy(xpath="//select[@onchange='newcheckTsheetForUser(this.value);']")
	private WebElement Self;
	public void SelectSelfCT()
	{
		Select se = new Select(Self);
        se.selectByVisibleText("Karan");
	}
//----------------------------------------------------------Delete Function
	@FindBy(xpath="//i[@onclick='newdeleteOneRowLT(1)']")
	private WebElement Delete;
	public void ClickOnDeleteCT()
	{
		Delete.click();
	}
	@FindBy(xpath="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[77]")
	private WebElement DeletePopup;
	public void ClickOnDeletePopupCT()
	{
		DeletePopup.click();
	}
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span[text()='Yes, Delete it!']")
	private WebElement YEsDelete;
	public void ClickOnYEsDeletePopupCT()
	{
		YEsDelete.click();
	}
	public Create_TimesheetTT(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
