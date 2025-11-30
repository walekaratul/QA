package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_PENDINGPM {
	
	@FindBy(xpath="//a[@onclick='showExpTrackingSearch.call(this, event)']")
	public WebElement viewmodify;
	public void ClickOnViewModifyET()
	{
		viewmodify.click();
	}
	@FindBy(xpath="//li[@id='exp_search_pending_manager']")
	public WebElement PendingPM;
	public void ClickOnPendingPMBtnVMFPPMET()
	{
		PendingPM.click();
	}
//-----------------------------------------------------------------Simple Search Function
	@FindBy(xpath="//input[@id='exptracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxVMFPPMET()
	{
		SearchBox.sendKeys("Atul");
	}
	@FindBy(xpath="//form[@id='exptracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnVMFPPMET()
	{
		SearchBtn.click();
	}
//-----------------------------------------------------------------Advanced Search Function	
	@FindBy(xpath="//a[@onclick='showExpAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMFPPMET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnVMFPPMET()
	{
		Select s1 =new Select(SelectFilter);
		s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMFPPMET()
	{
		Select s2 =new Select(SelectFilterOperator);
		s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMFPPMET()
	{
		EnterBox.sendKeys("Atul");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[4]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnVMFPPMET()
	{
		ApplyBtn.click();
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxVMFPPMET()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth;
	public void SelectMonthVMFPPMET()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("May");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearVMFPPMET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='4'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayVMFPPMET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='10'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayVMFPPMET()
	{
		LastDay.click();
	}
//--------------------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnVMFPPMET()
	{
		Select user1 =new Select(SelectFilterUser);
		user1.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatorUserOnVMFPPMET()
	{
		Select user2 =new Select(SelectFilterOperatorUser);
		user2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserVMFPPMET()
	{
		EnterBoxUser.sendKeys("Atul");
	}
//------------------------------------------------------------------Advanced Search By Project Number	
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPNO;
	public void SelectFilterPNOOnVMFPPMET()
	{
		Select ProjectNo1 =new Select(SelectFilterPNO);
		ProjectNo1.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatorPNOOnVMFPPMET()
	{
		Select ProjectNo2 =new Select(SelectFilterOperatorPNO);
		ProjectNo2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxProjectNo;
	public void EnterOnAdvancedEnterBoxPNOVMFPPMET()
	{
		EnterBoxProjectNo.sendKeys("12345");
	}
//-----------------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnVMFPPMET()
	{
		Select ProjectName1 =new Select(SelectFilterPName);
		ProjectName1.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatorPNameOnVMFPPMET()
	{
		Select ProjectName2 =new Select(SelectFilterOperatorPName);
		ProjectName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxProjectName;
	public void EnterOnAdvancedEnterBoxPNameVMFPPMET()
	{
		EnterBoxProjectName.sendKeys("Admin");
	}
	
//--------------------------------------------------------------Advanced Search By Status 
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterStatus;
	public void SelectFilterStatusOnVMFPPMET()
	{
		Select Status1 =new Select(SelectFilterStatus);
		Status1.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorStatus;
	public void SelectFilterOperatorStatusOnVMFPPMET()
	{
		Select Status2 =new Select(SelectFilterOperatorStatus);
		Status2.selectByVisibleText("=");
	}
	@FindBy(xpath="//option[text()='NO STATUS']")
	public WebElement Status3;
	public void ClickOnStatusVMFPPMET()
	{
		Status3.click();
	}

//-----------------------------------------------------------New Button Function	
	@FindBy(xpath="//a[@title='Create Expensesheet']")
	public WebElement NewBtn;
	public void ClickOnNewBtnVMFPPMET()
	{
		NewBtn.click();
	} 
//------------------------------------------------------------Plus Symbol Function	
	@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[9]")
	public WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMFPPMET()
	{
		PlusSymboll.click();
	}
//---------------------------------------------------------------UserExpensheetLink	Function
	@FindBy(xpath="(//a[@onclick='showExpTrackingSheetView(68);'])[3]")
	public WebElement UserExpensheetLink;
	public void ClickOnUserExpensesheetLinkVMFPPMET()
	{
			UserExpensheetLink.click();
	}
//-------------------------------------------------------------------Hide Show All Records Function	
	@FindBy(xpath="(//button[text()='Show/Hide All Records'])[2]")
	public WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMFPPMET()
	{
		HideShowAllRecord.click();
	}
//-------------------------------------------------------------------Approve Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[45]")
	public WebElement Approve;
	public void ClickOnApproveVMFPPMET()
	{
		Approve.click();
	} 
	@FindBy(xpath="//input[@id='Approved_Selected_manager_exp']")
	private WebElement SubmitSelected;
	public void ClickOnSubmitSelectedVMFPPMET()
	{
		SubmitSelected.click();
	}
	@FindBy(xpath="//span[text()='No']")
	public WebElement NoPopup;
	public void ClickOnNoPopupVMFPPMET()
	{
		NoPopup.click();
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement YesPopup;
	public void ClickOnYesPopupVMFPPMET()
	{
		YesPopup.click();
	}
//---------------------------------------------------------	ApproveAll Function
	@FindBy(xpath="(//span[@class='qp-checkmark'])[37]")
	public WebElement ApproveAll;
	public void ClickOnApproveAllVMFPPMET()
	{
		ApproveAll.click();
	} 
//-----------------------------------------------------------Reject Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[46]")
	public WebElement Reject;
	public void ClickOnRejectVMFPPMET()
	{
		Reject.click();
	} 
//----------------------------------------------------------RejectAll Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[38]")
	public WebElement RejectAll;
	public void ClickOnRejectAllVMFPPMET()
	{
		RejectAll.click();
	}
//----------------------------------------------------------Comment Function	
	@FindBy(xpath="(//textarea[@data-projid='4280'])[3]")
	public WebElement PlusSymbol;
	public void ClickOnPlusSymbolVMFPPMET()
	{
		PlusSymbol.click();
	}
	@FindBy(xpath="(//textarea[@data-projid='4280'])[4]")
	public WebElement Comment;
	public void EnterCommentVMFPPMET()
	{
		Comment.sendKeys("Please Approve Expenses");
	}
    @FindBy(xpath="//li[@id='exp_search_pending_manager']")
    public WebElement PendingPM1;
	public void ClickOnPendingPM1BtnVMFPPMET()
	{
		PendingPM1.click();
	}
//------------------------------------------------------------LoadMore Function	
	@FindBy(xpath="(//a[text()='Load more'])[2]")
	public WebElement LoadMore;
	public void ClickOnLoadMoreVMFPPMET()
	{
		LoadMore.click();
	}
	public View_Modify_For_PENDINGPM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
