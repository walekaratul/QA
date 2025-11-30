package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_Pending_PM {
	
	@FindBy(xpath="//a[@onclick='showTimeTrackingSearch.call(this, event)']")
	public WebElement viewmodify;
	public void ClickOnViewModifyTT()
	{
		viewmodify.click();
	}
	@FindBy(xpath="//li[@id='tms_search_pending_manager']")
	public WebElement Pending;
	public void ClickOnPendingPMBtnVMPPM()
	{
		Pending.click();
	}
//-----------------------------------------------------------Simple Search Function	
	@FindBy(xpath="//input[@id='timetracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxVMPPM()
	{
		SearchBox.sendKeys("Jamin Lehto");
	}
	@FindBy(xpath="//form[@id='timetracking_search']//button//i[@class='fa fa-search']")
	private WebElement SearchBtn;
	public void ClickOnSearchBtnVMPPM()
	{
		SearchBtn.click();
	}
//------------------------------------------------------------Advanced Search By Date Function	
	@FindBy(xpath="//a[@onclick='showlaborAdvSearh();']")
	private WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMPPM()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	private WebElement SelectFilter;
	public void SelectFilterOnVMPPM()
	{
		Select s1 =new Select(SelectFilter);
	    s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMPPM()
	{
		Select s2 =new Select(SelectFilterOperator);
	    s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	private WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMPPM()
	{
		EnterBox.sendKeys("GES-PRJ-SCC-QC-24/25-022");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[3]")
	private WebElement ApplyBtn;
	public void ClickOnApplyBtnVMPPM()
	{
		ApplyBtn.click();
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxVMPPM()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth;
	public void SelectMonthVMPPM()
	{
		Select s1 = new Select(SelectMonth);
		s1.selectByVisibleText("May");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearVMPPM()
	{
		Select s2 = new Select(SelectYear);
		s2.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='11'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayVMPPM()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='17'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayVMPPM()
	{
		LastDay.click();
	}
//------------------------------------------------------Advanced Search By User Name
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnVMPPM()
	{
		Select User =new Select(SelectFilter);
	    User.selectByVisibleText("User Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterUserOperator;
	public void SelectFilterUserOperatorOnVMPPM()
	{
		Select User =new Select(SelectFilterUserOperator);
	    User.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserVMPPM()
	{
		EnterBoxUser.sendKeys("Jeff Johnson");
	}
//----------------------------------------------------Advanced Search By Project Name and Number Function
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPN;
	public void SelectFilterPNOnVMPPM()
	{
		Select PN =new Select(SelectFilterPN);
	    PN.selectByVisibleText("Project No");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterPNOperator;
	public void SelectFilterPNOperatorOnVMPPM()
	{
		Select PN1 =new Select(SelectFilterPNOperator);
	    PN1.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBoxPN;
	public void EnterOnAdvancedEnterBoxPNVMPPM()
	{
		EnterBoxPN.sendKeys("P10265");
	}
//----------------------------------------------------- Advanced Search By Status Function	
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterStatus;
	public void SelectFilterStatusOnVMPPM()
	{
		Select Status1 =new Select(SelectFilterStatus);
		Status1.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterStatusOperator;
	public void SelectFilterStatusOperatorOnVMPPM()
	{
		Select Status2 =new Select(SelectFilterPNOperator);
		Status2.selectByVisibleText("=");
	}
	@FindBy(xpath="//option[text()='EMAILED']")
	public WebElement Status3;
	public void ClickOnStatusVMPPM()
	{
		Status3.click();
	}
//-------------------------------------------------------Plus Symbol Function	
	@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[24]")
	public WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMPPM()
	{
		PlusSymboll.click();
	} 
//-------------------------------------------------------New Button Function	
	@FindBy(xpath="//a[@title='Create Timesheet']")
	public WebElement NewBtn;
	public void ClickOnNewBtnVMPPM()
	{
		NewBtn.click();
	} 
//---------------------------------------------------------User Name Link Function	
	
	@FindBy(xpath="(//a[text()='Jeff Johnson'])[2]")
	public WebElement UserNameLink;
	public void ClickOnUserNameLinkVMPPM()
	{
		UserNameLink.click();
	}
//-----------------------------------------------------------------Hide Show All Records Function
	
	@FindBy(xpath="//ul[@class='nav nav-pills']//button[@id='qp-allExpanded']")
	public WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMPPM()
	{
		HideShowAllRecord.click();
	}
//------------------------------------------------------------------Approve function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[31]")
	public WebElement Approve;
	public void ClickOnApproveVMPPM()
	{
		Approve.click();
	} 
//------------------------------------------------------------------Submit Selected Function
	
	@FindBy(xpath="//input[@id='timeSheetApprovePMBtn']")
	public WebElement SubmitSelected;
	public void ClickOnSubmitSelectedVMPPM()
	{
		SubmitSelected.click();
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement YesPopup;
	public void ClickOnYesPopupVMPPM()
	{
		YesPopup.click();
	}
	@FindBy(xpath="//span[text()='No']")
	public WebElement NoPopup;
	public void ClickOnNoPopupVMPPM()
	{
		NoPopup.click();
	}
//------------------------------------------------------------------Approve All Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[11]")
	public WebElement ApproveAll;
	public void ClickOnApproveAllVMPPM()
	{
		ApproveAll.click();
	} 
//-----------------------------------------------------------------Reject Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[32]")
	public WebElement Reject;
	public void ClickOnRejectVMPPM()
	{
		Reject.click();
	}
//------------------------------------------------------------------Reject All Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[12]")
	public WebElement RejectAll;
	public void ClickOnRejectAllVMPPM()
	{
		RejectAll.click();
	} 
//-----------------------------------------------------------------Comment Function	
	@FindBy(xpath="(//textarea[@data-projid='229'])[1]")
	public WebElement Comment;
	public void EnterCommentVMPPM()
	{
		Comment.sendKeys("Comment By Atul Walekar");
	}
//-------------------------------------------------------------------Pending function for Comment purpose	
	@FindBy(xpath="//li[@id='tms_search_pending_manager']")
	public WebElement PendingPM1;
	public void ClickOnPending1BtnVMPPM()
	{
		PendingPM1.click();
	}
//-------------------------------------------------------------------Load More Function	
	@FindBy(xpath="//a[text()='Load more']")
	public WebElement LoadMore;
	public void ClickOnLoadMoreVMPPM()
	{
		LoadMore.click();
	} 
	public View_Modify_For_Pending_PM(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

}
