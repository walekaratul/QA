package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_PENDING {
	
	@FindBy(xpath="//a[@onclick='showExpTrackingSearch.call(this, event)']")
	private WebElement viewmodify;
	public void ClickOnViewModifyET()
	{
		viewmodify.click();
	}
	@FindBy(xpath="//li[@id='exp_search_pending']")
	private WebElement Pending;
	public void ClickOnPendingBtnVMFPET()
	{
		Pending.click();
	}
//-----------------------------------------------------------------Simple Search Function
	@FindBy(xpath="//input[@id='exptracking_search_text']")
	private WebElement SearchBox;
	public void EnterkOnSearchBoxVMFPET()
	{
		SearchBox.sendKeys("ABC");
	}
	@FindBy(xpath="//form[@id='exptracking_search']//button//i[@class='fa fa-search']")
	private WebElement SearchBtn;
	public void ClickOnSearchBtnVMFPET()
	{
		SearchBtn.click();
	}
//-----------------------------------------------------------------Advanced Search By Date  Function	
	@FindBy(xpath="//a[@onclick='showExpAdvSearh();']")
	private WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMFPET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	private WebElement SelectFilter;
	public void SelectFilterOnVMFPET()
	{
		Select s1 =new Select(SelectFilter);
	    s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMFPET()
	{
		Select s2 =new Select(SelectFilterOperator);
	    s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMFPET()
	{
		EnterBox.sendKeys("XYZ");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[4]")
	private WebElement ApplyBtn;
	public void ClickOnApplyBtnVMFPET()
	{
		ApplyBtn.click();
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement CalenderBox;
	public void ClickOnCalenderBoxVMFPET()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement SelectMonth;
	public void SelectMonthVMFPET()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("Mar");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement SelectYear;
	public void SelectYearVMFPET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2024");
	}
	@FindBy(xpath="(//a[text()='31'])[4]")
	private WebElement FirstDay;
	public void ClickOnFirstDayVMFPET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='6'])[5]")
	private WebElement LastDay;
	public void ClickOnLastDayVMFPET()
	{
		LastDay.click();
	}
//---------------------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	private WebElement SelectFilterUser;
	public void SelectFilterUserOnVMFPET()
	{
		Select user =new Select(SelectFilterUser);
	    user.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatorUserOnVMFPET()
	{
		Select user1 =new Select(SelectFilterOperatorUser);
	    user1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserVMFPET()
	{
		EnterBoxUser.sendKeys("XYZ");
	}
//--------------------------------------------------------------Advanced Search By Project No
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	private WebElement SelectFilterPNO;
	public void SelectFilterPNOOnVMFPET()
	{
		Select ProjectNO =new Select(SelectFilterPNO);
		ProjectNO.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatorPNOOnVMFPET()
	{
		Select ProjectNO1 =new Select(SelectFilterOperatorPNO);
		ProjectNO1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement EnterBoxPNO;
	public void EnterOnAdvancedEnterBoxProjectNoVMFPET()
	{
		EnterBoxPNO.sendKeys("123");
	}
//--------------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	private WebElement SelectFilterPName;
	public void SelectFilterPNameOnVMFPET()
	{
		Select ProjectName =new Select(SelectFilterPName);
		ProjectName.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatorPNameOnVMFPET()
	{
		Select ProjectName1 =new Select(SelectFilterOperatorPName);
		ProjectName1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxProjectNameVMFPET()
	{
		EnterBoxPName.sendKeys("Atul");
	}
//---------------------------------------------------------------Advanced Search By Status Function
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	private WebElement SelectFilterStatus;
	public void SelectFilterStatusOnVMFPET()
	{
		Select status1 =new Select(SelectFilterStatus);
		status1.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperatorStatus;
	public void SelectFilterOperatorStatusOnVMFPET()
	{
		Select status2 =new Select(SelectFilterOperatorStatus);
		status2.selectByVisibleText("=");
	}
	
	@FindBy(xpath="//option[text()='EMAILED']")
	private WebElement Status;
	public void ClickOnStatusVMFPET()
	{
		Status.click();
	}

		
//-----------------------------------------------------------New Button Function	
		@FindBy(xpath="//a[@title='Create Expensesheet']")
		private WebElement NewBtn;
		public void ClickOnNewBtnVMFPET()
		{
			NewBtn.click();
		} 
//------------------------------------------------------------Plus Symbol Function	
		@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[2]")
		private WebElement PlusSymboll;
		public void ClickOnPlusSymbollVMFPET()
		{
			PlusSymboll.click();
		}
//---------------------------------------------------------------UserExpensheetLink	Function
		@FindBy(xpath="(//a[@onclick='showExpTrackingSheetView(68);'])[2]")
		private WebElement UserExpensheetLink;
		public void ClickOnUserExpensesheetLinkVMFPET()
		{
			UserExpensheetLink.click();
		}
//-------------------------------------------------------------------Hide Show All Records Function	
		@FindBy(xpath="(//button[text()='Show/Hide All Records'])[2]")
		private WebElement HideShowAllRecord;
		public void ClickOnHideShowAllRecordVMFPET()
		{
			HideShowAllRecord.click();
		}
//-------------------------------------------------------------------Approve Function	
		@FindBy(xpath="(//span[@class='qp-checkmark'])[29]")
		private WebElement Approve;
		public void ClickOnApproveVMFPET()
		{
			Approve.click();
		} 
		@FindBy(xpath="//input[@id='Approved_Selected_exp']")
		private WebElement SubmitSelected;
		public void ClickOnSubmitSelectedVMFPET()
		{
			SubmitSelected.click();
		}
		@FindBy(xpath="//span[text()='No']")
		private WebElement NoPopup;
		public void ClickOnNoPopupVMFPET()
		{
			NoPopup.click();
		}
		@FindBy(xpath="//span[text()='Yes']")
		private WebElement YesPopup;
		public void ClickOnYesPopupVMFPET()
		{
			YesPopup.click();
		}
//---------------------------------------------------------	ApproveAll Function
		@FindBy(xpath="(//span[@class='qp-checkmark'])[11]")
		private WebElement ApproveAll;
		public void ClickOnApproveAllVMFPET()
		{
			ApproveAll.click();
		} 
//-----------------------------------------------------------Reject Function	
		@FindBy(xpath="(//span[@class='qp-checkmark'])[20]")
		private WebElement Reject;
		public void ClickOnRejectVMFPET()
		{
			Reject.click();
		} 
//----------------------------------------------------------RejectAll Function	
		@FindBy(xpath="(//span[@class='qp-checkmark'])[12]")
		private WebElement RejectAll;
		public void ClickOnRejectAllVMFPET()
		{
			RejectAll.click();
		}
//----------------------------------------------------------Comment Function	
		@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[5]")
		private WebElement PlusSymbol;
		public void ClickOnPlusSymbolVMFPET()
		{
			PlusSymbol.click();
		}
		@FindBy(xpath="(//textarea[@data-projid='4280'])[1]")
		private WebElement Comment;
		public void EnterCommentVMFPET()
		{
			Comment.sendKeys("Please Approve The Expesesheet");
		}
		@FindBy(xpath="//li[@id='exp_search_pending']")
		private WebElement Pending1;
		public void ClickOnPending1BtnVMFPET()
		{
			Pending1.click();
		}
//------------------------------------------------------------LoadMore Function	
		@FindBy(xpath="(//a[text()='Load more'])[2]")
		private WebElement LoadMore;
		public void ClickOnLoadMoreVMFPET()
		{
			LoadMore.click();
		} 
	public View_Modify_For_PENDING(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
