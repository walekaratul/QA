package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_Supervisor_And_Manager {
	
	
	@FindBy(xpath="//a[@onclick='showTimeTrackingSearch.call(this, event)']")
	public WebElement viewmodify;
	public void ClickOnViewModifyTT()
	{
		viewmodify.click();
	}
	@FindBy(xpath="//li[@id='tms_search_pending']")
	public WebElement Pending;
	public void ClickOnPendingBtnVMFS()
	{
		Pending.click();
	}
//-----------------------------------------------------------------Simple Search Function
	@FindBy(xpath="//input[@id='timetracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxVMFS()
	{
		SearchBox.sendKeys("Bath NY Yard Network Design");
	}
	@FindBy(xpath="//form[@id='timetracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnVMFS()
	{
		SearchBtn.click();
	}
//-----------------------------------------------------------------Advanced Search Function	By Date
	@FindBy(xpath="//a[@onclick='showlaborAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMFS()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnVMFS()
	{
		Select s1 =new Select(SelectFilter);
	    s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMFS()
	{
		Select s2 =new Select(SelectFilterOperator);
	    s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMFS()
	{
		EnterBox.sendKeys("APPROVED");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[3]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnVMFS()
	{
		ApplyBtn.click();
	} 

	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxVMFS()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//a[text()='10'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayVMFS()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='16'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayVMFS()
	{
		LastDay.click();
	}
//-----------------------------------------------------Advanced Search By User Name
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnVMFS()
	{
		Select User =new Select(SelectFilterUser);
	    User.selectByVisibleText("User Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatorUserOnVMFS()
	{
		Select User1 =new Select(SelectFilterOperator);
		User1.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserVMFS()
	{
		EnterBoxUser.sendKeys("Anita Pinoniemi");
	}
//----------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPN;
	public void SelectFilterUserPNOnVMFS()
	{
		Select PN =new Select(SelectFilterPN);
	    PN.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPN;
	public void SelectFilterOperatorPNOnVMFS()
	{
		Select PN1 =new Select(SelectFilterOperatorPN);
		PN1.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBoxPN;
	public void EnterOnAdvancedEnterBoxPNVMFS()
	{
		EnterBoxPN.sendKeys("RF Line Infeed Conveyors");
	}
//-------------------------------------------------Advanced Search By Status Function	
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterStatus;
	public void SelectFilterUserStatusOnVMFS()
	{
		Select S =new Select(SelectFilterStatus);
	    S.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorStatus;
	public void SelectFilterOperatorStatusOnVMFS()
	{
		Select S1 =new Select(SelectFilterOperatorStatus);
		S1.selectByVisibleText("=");
	}
	
	@FindBy(xpath="//option[text()='REJECTED']")
	public WebElement Status1;
	public void ClickOnStatusVMFS()
	{
		Status1.click();
	}
//-----------------------------------------------------------New Button Function	
	@FindBy(xpath="//a[@title='Create Timesheet']")
	public WebElement NewBtn;
	public void ClickOnNewBtnVMFS()
	{
		NewBtn.click();
	} 
//------------------------------------------------------------Plus Symbol Function	
	@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[21]")
	public WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMFS()
	{
		PlusSymboll.click();
	}
//---------------------------------------------------------------User time  sheet Link	Function
	@FindBy(xpath="//a[text()='Aaron Lehto']")
	public WebElement WeekTimeSheetLink;
	public void ClickOnWeekTimeSheetLinkVMFS()
	{
		WeekTimeSheetLink.click();
	} 
//------------------------------------------------------------------HideShowAllRecord Function	
	@FindBy(xpath="(//button[text()='Show/Hide All Records'])[1]")
	public WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMFS()
	{
		HideShowAllRecord.click();
	} 
//-------------------------------------------------------------------Approve Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[25]")
	public WebElement Approve;
	public void ClickOnApproveVMFS()
	{
		Approve.click();
	} 
	@FindBy(xpath="//input[@id='timeSheetApproveManagerBtn']")
	public WebElement SubmitSelected;
	public void ClickOnSubmitSelectedVMFS()
	{
		SubmitSelected.click();
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement YesPopup;
	public void ClickOnYesPopupVMFS()
	{
		YesPopup.click();
	}
	@FindBy(xpath="//span[text()='No']")
	public WebElement NoPopup;
	public void ClickOnNoPopupVMFS()
	{
		NoPopup.click();
	}
//---------------------------------------------------------	ApproveAll Function
	@FindBy(xpath="(//span[@class='qp-checkmark'])[11]")
	public WebElement ApproveAll;
	public void ClickOnApproveAllVMFS()
	{
		ApproveAll.click();
	} 
//-----------------------------------------------------------Reject Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[26]")
	public WebElement Reject;
	public void ClickOnRejectVMFS()
	{
		Reject.click();
	} 
//----------------------------------------------------------RejectAll Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[12]")
	public WebElement RejectAll;
	public void ClickOnRejectAllVMFS()
	{
		RejectAll.click();
	} 
//----------------------------------------------------------Comment Function	
	@FindBy(xpath="(//textarea[@data-projid='543'])[2]")
	public WebElement Comment;
	public void EnterCommentVMFS()
	{
		Comment.sendKeys("Comment Updated By Atul Walekar");
	}
	@FindBy(xpath="//li[@id='tms_search_pending']")
	public WebElement Pending1;
	public void ClickOnPending1BtnVMFS()
	{
		Pending1.click();
	}
//------------------------------------------------------------LoadMore Function	
	@FindBy(xpath="//a[text()='Load more']")
	public WebElement LoadMore;
	public void ClickOnLoadMoreVMFS()
	{
		LoadMore.click();
	} 
	
	
	
	
	public View_Modify_For_Supervisor_And_Manager(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}