package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reimbursable_For_PENDING {
	@FindBy(xpath="//a[@onclick='showReimbursableSearch(this, event)']")
	public WebElement Reimbursable;
	public void ClickOnReimbursableET()
	{
		Reimbursable.click();
	}
//-------------------------------------------------------Simple search function	
	
	@FindBy(xpath="//input[@id='reimbursment_exptracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxRFPET()
	{
		SearchBox.sendKeys("415");
	}
	@FindBy(xpath="//form[@id='reimbursment_exptracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnRFPET()
	{
		SearchBtn.click();
	}
//----------------------------------------------------------------------Advanced Search Function		
	
	@FindBy(xpath="//a[@onclick='showReimbursmentExpAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnRFPET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnRFPET()
	{
		Select s1 =new Select(SelectFilter);
		s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnRFPET()
	{
		Select s2 =new Select(SelectFilterOperator);
		s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxRFPET()
	{
		EnterBox.sendKeys("Approved");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[5]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnRFPET()
	{
		ApplyBtn.click();
	}
//------------------------------------------------------Advanced Date Function
    @FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
    public WebElement CalenderBox;
	public void ClickOnCalenderBoxRFPET()
	{
		CalenderBox.click();
	}
    @FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
    public WebElement SelectMonth;
	public void SelectMonthRFPET()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("Aug");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearRFPET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2024");
	}
	@FindBy(xpath="(//a[text()='20'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayRFPET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='30'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayRFPET()
	{
		LastDay.click();
	}
//-------------------------------------------------------Advanced Search By User 
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnRFPET()
	{
		Select User1 =new Select(SelectFilterUser);
		User1.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatoUserrOnRFPET()
	{
		Select User2 =new Select(SelectFilterOperator);
		User2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserRFPET()
	{
		EnterBoxUser.sendKeys("Keith Haataja");
	}
//--------------------------------------------------------Advanced Search By Project Number
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPNO;
	public void SelectFilterPNOOnRFPET()
	{
		Select ProjectNO1 =new Select(SelectFilterPNO);
		ProjectNO1.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatoPNOOnRFPET()
	{
		Select ProjectNO2 =new Select(SelectFilterOperatorPNO);
		ProjectNO2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPNO;
	public void EnterOnAdvancedEnterBoxPNORFPET()
	{
		EnterBoxPNO.sendKeys("P10086");
	}
//------------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnRFPET()
	{
		Select ProjectName1 =new Select(SelectFilterPName);
		ProjectName1.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatoPNameOnRFPET()
	{
		Select ProjectName2 =new Select(SelectFilterOperatorPName);
		ProjectName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxPNameRFPET()
	{
		EnterBoxPName.sendKeys("2024 Support");
	}
//--------------------------------------------------------Advanced Search By Reimbursement_status	
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterReimbursableStatus;
	public void SelectFilterSelectFilterReimbursableStatusOnRFPET()
	{
		Select SelectFilterReimbursableStatus1 =new Select(SelectFilterReimbursableStatus);
		SelectFilterReimbursableStatus1.selectByVisibleText("Reimbursement Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorSelectFilterReimbursableStatus;
	public void SelectFilterOperatoSelectFilterReimbursableStatusOnRFPET()
	{
		Select SelectFilterReimbursableStatus2 =new Select(SelectFilterOperatorSelectFilterReimbursableStatus);
		SelectFilterReimbursableStatus2.selectByVisibleText("=");
	}
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement ReimbursementStatus;
	public void SelectReimbursementStatus()
	{
		Select rs = new Select(ReimbursementStatus);
		rs.selectByVisibleText("PAID");
	}
//---------------------------------------------------------Advanced Search By Customer
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterCustomer;
	public void SelectFilterCustomerOnRFPET()
	{
		Select Customer1 =new Select(SelectFilterCustomer);
		Customer1.selectByVisibleText("Customer Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorCustomer;
	public void SelectFilterOperatoCustomerOnRFPET()
	{
		Select Customer2 =new Select(SelectFilterOperatorCustomer);
		Customer2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxCustomer;
	public void EnterOnAdvancedEnterBoxCustomerRFPET()
	{
		EnterBoxCustomer.sendKeys("Rolling Forks Design Group");
	}
//-------------------------------------------------------Advanced Search By Expense Type
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterExpenseType;
	public void SelectFilterExpenseTypeOnRFPET()
	{
		Select ExpenseType1 =new Select(SelectFilterExpenseType);
		ExpenseType1.selectByVisibleText("Expense Type");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorExpenseType;
	public void SelectFilterOperatorExpenseTypeOnRFPET()
	{
		Select ExpenseType2 =new Select(SelectFilterOperatorExpenseType);
		ExpenseType2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxExpenseType;
	public void EnterOnAdvancedEnterBoxExpenseTypeRFPET()
	{
		EnterBoxExpenseType.sendKeys("Mileage");
	}
//----------------------------------------------------------Advanced Search By Expense Status
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterExpenseStatus;
	public void SelectFilterExpenseStatusOnRFPET()
	{
		Select ExpenseStatus1 =new Select(SelectFilterExpenseStatus);
		ExpenseStatus1.selectByVisibleText("Expense Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorExpenseStatus;
	public void SelectFilterOperatorExpenseStatusOnRFPET()
	{
		Select ExpenseStatus2 =new Select(SelectFilterOperatorExpenseStatus);
		ExpenseStatus2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxExpenseStatus;
	public void EnterOnAdvancedEnterBoxExpenseStatusRFPET()
	{
		EnterBoxExpenseStatus.sendKeys("Approved");
	}
//--------------------------------------------------------Expense details By date Function
		@FindBy(xpath="(//td[@data-view-id='2727'])[1]")
		public WebElement Date;
		public void ClickOnDateForExpenseDetailsRFPET()
		{
			Date.click();
		}
//---------------------------------------------------------------	Expense details By Project Name And Number Function
		@FindBy(xpath="(//td[@data-view-id='2727'])[2]")
		public WebElement ProjectNo;
		public void ClickOnProjectNoForExpenseDetailsRFPET()
		{
			ProjectNo.click();
		}
		@FindBy(xpath="(//td[@data-view-id='2727'])[2]")
		public WebElement ProjectName;
		public void ClickOnProjectNameExpenseDetailsRFPET()
		{
			ProjectName.click();
		}
		
		@FindBy(xpath="(//span[text()='Close'])[2]")
		public WebElement Close;
		public void ClickOnCloseForExpenseDetailsRFPET()
		{
			Close.click();
		}
//---------------------------------------------------Check box for individual Function		
		@FindBy(xpath="(//span[@class='qp-checkmark'])[12]")
		private WebElement checkbox;
		public void ClickOncheckboxForPayRFPET()
		{
				checkbox.click();
		}
//----------------------------------------------------------Check box for All Function	
		@FindBy(xpath="(//span[@class='qp-checkmark'])[11]")
		public WebElement Allcheckbox;
		public void ClickOnAllcheckboxForPayRFPET()
		{
				Allcheckbox.click();
		}
//-----------------------------------------------------------Pay Selected Function         
		
		@FindBy(xpath="//input[@id='pay_selected_reimbursment_expense']")
		public WebElement PaySelected;
		public void ClickOnPaySelectedRFPET()
		{
			PaySelected.click();
		}
		@FindBy(xpath="//input[@id='expense_amount_to_paid']")
		public WebElement Amount;
		public void EnterAmountForPaySelectedRFPET()
		{
			Amount.clear();
			Amount.sendKeys("20");
		}
		
		@FindBy(xpath="//input[@class='form-control  qp-date-icon qp-date-lead hasDatepicker']")
		public WebElement CalenderBoxx;
		public void ClickOnCalenderBoxForPaySelectedRFPET()
		{
			CalenderBoxx.clear();
			CalenderBoxx.click();
		}
						
		@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
		public WebElement Selectmonth;
		public void SelectmonthForPaySelectedRFPET()
		{
			Select s5 = new Select(Selectmonth);
			s5.selectByVisibleText("Jun");
		}	
		@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
		public WebElement Selectyear;
	    public void SelectyearForPaySelectedRFPET()
        {
			Select s5 = new Select(Selectyear);
			s5.selectByValue("2025");
		}
		@FindBy(xpath="(//a[text()='14'])[4]")
		public WebElement day;
		public void ClickOndayForPaySelectedRFPET()
		{
			day.click();
		}
		@FindBy(xpath="//textarea[@id='paid_expense_note']")
		public WebElement PaySelectedNote;
		public void EnterOnPaySelectedNoteRFPET()
		{
			PaySelectedNote.sendKeys("Partialy Paid");
		}
		@FindBy(xpath="//span[text()='Pay']")
		public WebElement Pay;
		public void ClickOnPayBtnForPaySelectedRFPET()
		{
			Pay.click();
		}
		@FindBy(xpath="(//span[text()='OK'])[7]")
		public WebElement OK;
		public void ClickOnOKBtnForPaySelectedRFPET()
		{
			OK.click();
		}
		@FindBy(xpath="(//span[text()='Cancel'])[9]")
		public WebElement Cancel;
		public void ClickOnCancelBtnForPaySelectedRFPET()
		{
			Cancel.click();
		}
//-----------------------------------------------------------Reject Selected Function
		@FindBy(xpath="//input[@id='reject_selected_reimbursment_expense']")
		public WebElement RejectSelected;
		public void ClickOnRejectSelectedRFPET()
		{
			RejectSelected.click();
		}
		@FindBy(xpath="//span[text()='Yes']")
		public WebElement Yes1;
		public void ClickOnYesBtnForRejectSelectedRFPET()
		{
			Yes1.click();
		}
		@FindBy(xpath="(//span[text()='Cancel'])[29]")
		public WebElement Cancel1;
		public void ClickOnCancelBtnForRejectSelectedRFPET()
		{
			Cancel1.click();
		}
		
//------------------------------------------------------------Export Function     
		@FindBy(xpath="//a[@id='reimbursement_download_link']")
		public WebElement Export;
		public void ClickOnExportBtnRFPET()
		{
			Export.click();
		}
//----------------------------------------------------------Attachment Function 
		@FindBy(xpath="(//a[text()='Green Bay Hotel for IN4M. '])[1]")
		public WebElement Attachment;
		public void ClickOnAttachmentlinkRFPET()
		{
			Attachment.click();
		}
	public Reimbursable_For_PENDING(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
