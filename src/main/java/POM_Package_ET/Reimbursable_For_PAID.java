package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reimbursable_For_PAID {
	
	@FindBy(xpath="//a[@onclick='showReimbursableSearch(this, event)']")
	public WebElement Reimbursable;
	public void ClickOnReimbursableET()
	{
		Reimbursable.click();
	}
	@FindBy(xpath="//li[@id='reimbursment_paid_expense_search']")
	public WebElement Paid;
	public void ClickOnPaidET()
	{
		Paid.click();
	}
//-------------------------------------------------------Simple search function	
	
	@FindBy(xpath="//input[@id='reimbursment_exptracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxRFPDET()
	{
		SearchBox.sendKeys("Line 1 Infeed Conveyor");
	}
	@FindBy(xpath="//form[@id='reimbursment_exptracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnRFPDET()
	{
		SearchBtn.click();
	}
//------------------------------------------------------Advanced Search Function
	@FindBy(xpath="//a[@onclick='showReimbursmentExpAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnRFPDET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnRFPDET()
	{
		Select s1 =new Select(SelectFilter);
		s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnRFPDET()
	{
		Select s2 =new Select(SelectFilterOperator);
		s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxRFPDET()
	{
		EnterBox.sendKeys("2217");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[5]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnRFPDET()
	{
		ApplyBtn.click();
	}
	
//------------------------------------------------------Advanced Date Function
    @FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
    public WebElement CalenderBox;
	public void ClickOnCalenderBoxRFPDET()
	{
		CalenderBox.click();
	}
    @FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
    public WebElement SelectMonth;
	public void SelectMonthRFPDET()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("Aug");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearRFPDET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2024");
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayRFPDET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='30'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayRFPDET()
	{
		LastDay.click();
	}
//--------------------------------------------------------Advanced Search By User Name
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnRFPDET()
	{
		Select User1 =new Select(SelectFilterUser);
		User1.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatorUserOnRFPDET()
	{
		Select User2 =new Select(SelectFilterOperatorUser);
		User2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserRFPDET()
	{
		EnterBoxUser.sendKeys("David Daavettila");
	}
//--------------------------------------------------------Advanced Search By Project Number
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPNO;
	public void SelectFilterPNOOnRFPDET()
	{
		Select PNO1 =new Select(SelectFilterPNO);
		PNO1.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatorPNOOnRFPDET()
	{
		Select PNO2 =new Select(SelectFilterOperatorPNO);
		PNO2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPNO;
	public void EnterOnAdvancedEnterBoxPNOPNORFPDET()
	{
		EnterBoxPNO.sendKeys("P10086");
	}
//--------------------------------------------------------Advanced Search By Project Namne
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnRFPDET()
	{
		Select PName1 =new Select(SelectFilterPName);
		PName1.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatorPNameOnRFPDET()
	{
		Select PName2 =new Select(SelectFilterOperatorPName);
		PName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxPNamePNORFPDET()
	{
		EnterBoxPName.sendKeys("APQ Internal");
	}
//--------------------------------------------------------Advanced Search By Reimbursement Status
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterReimbursementStatus;
	public void SelectFilterReimbursementStatusOnRFPDET()
	{
		Select ReimbursementStatus1 =new Select(SelectFilterReimbursementStatus);
		ReimbursementStatus1.selectByVisibleText("Reimbursement Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorReimbursementStatus;
	public void SelectFilterOperatorReimbursementStatusOnRFPDET()
	{
		Select ReimbursementStatus2 =new Select(SelectFilterOperatorReimbursementStatus);
		ReimbursementStatus2.selectByVisibleText("=");
	}
	@FindBy(xpath="//select[@class='statusId search_string1 form-control']")
	public WebElement ReimbursementStatusPAID;
	public void SelectReimbursementStatusPAID()
	{
		Select rspaid = new Select(ReimbursementStatusPAID);
		rspaid.selectByVisibleText("PAID");
	}
//--------------------------------------------------------Advannced Search By Customer Name
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterCName;
	public void SelectFilterCNameOnRFPDET()
	{
		Select CName1 =new Select(SelectFilterCName);
		CName1.selectByVisibleText("Customer Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorCName;
	public void SelectFilterOperatorCNameOnRFPDET()
	{
		Select CName2 =new Select(SelectFilterOperatorCName);
		CName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxCName;
	public void EnterOnAdvancedEnterBoxCNamePNORFPDET()
	{
		EnterBoxCName.sendKeys("Lexington Manufacturing, Brainerd");
	}
//---------------------------------------------------------Advanced Search By Expense Type
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterExpenseType;
	public void SelectFilterExpenseTypeOnRFPDET()
	{
		Select ExpenseType1 =new Select(SelectFilterExpenseType);
		ExpenseType1.selectByVisibleText("Expense Type");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorExpenseType;
	public void SelectFilterOperatorExpenseTypeOnRFPDET()
	{
		Select ExpenseType2 =new Select(SelectFilterOperatorExpenseType);
		ExpenseType2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxExpenseType;
	public void EnterOnAdvancedEnterBoxExpenseTypePNORFPDET()
	{
		EnterBoxExpenseType.sendKeys("Mileage");
	}
//--------------------------------------------------------Advanced Search By Expense Status Function
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterExpenseStatus;
	public void SelectFilterExpenseStatusOnRFPDET()
	{
		Select ExpenseStatus1 =new Select(SelectFilterExpenseStatus);
		ExpenseStatus1.selectByVisibleText("Expense Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorExpenseStatus;
	public void SelectFilterOperatorExpenseStatusOnRFPDET()
	{
		Select ExpenseStatus2 =new Select(SelectFilterOperatorExpenseStatus);
		ExpenseStatus2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxExpenseStatus;
	public void EnterOnAdvancedEnterBoxExpenseStatusPNORFPDET()
	{
		EnterBoxExpenseStatus.sendKeys("Approved");
	}
//--------------------------------------------------------Expense details check with Date Function
	@FindBy(xpath="(//td[@data-view-id='2732'])[1]")
	public WebElement Date;
	public void ClickOnDateForExpenseDetailsRFPDET()
	{
		Date.click();
	}
	
	@FindBy(xpath="(//span[text()='Close'])[2]")
	public WebElement Close;
	public void ClickOnCloseForExpenseDetailsRFPDET()
	{
		Close.click();
	}
//--------------------------------------------------------Expense details check with Project Number Function
	@FindBy(xpath="(//td[@data-view-id='2732'])[2]")
	public WebElement ProjectNo;
	public void ClickOnProjectNoForExpenseDetailsRFPDET()
	{
		ProjectNo.click();
	}
//--------------------------------------------------------Expense details check with Project Name Function
	@FindBy(xpath="(//td[@data-view-id='11417'])[2]")
	public WebElement ProjectName;
	public void ClickOnProjectNameExpenseDetailsRFPDET()
	{
		ProjectName.click();
	}
//------------------------------------------------------------Export Function 
	@FindBy(xpath="//a[@id='reimbursement_download_link']")
	public WebElement Export;
	public void ClickOnExportBtnRFPDET()
	{
		Export.click();
	}
//-----------------------------------------------------------Attachment Function
	@FindBy(xpath="(//a[text()='August QR.IO Receipt.pdf '])[1]")
	public WebElement Attachment;
	public void ClickOnAttachmentlinkRFPDET()
	{
		Attachment.click();
	}
	public Reimbursable_For_PAID(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
