package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reimbursable_For_ALL {
	@FindBy(xpath="//a[@onclick='showReimbursableSearch(this, event)']")
	public WebElement Reimbursable;
	public void ClickOnReimbursableET()
	{
		Reimbursable.click();
	}
	@FindBy(xpath="//li[@id='reimbursment_all_expense_search']")
	public WebElement All;
	public void ClickOnAllET()
	{
		All.click();
	}
//--------------------------------------------------------Simple Search Function
	@FindBy(xpath="//input[@id='reimbursment_exptracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxRFAET()
	{
		SearchBox.sendKeys("P10073");
	}
	@FindBy(xpath="//form[@id='reimbursment_exptracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnRFAET()
	{
		SearchBtn.click();
	}
//--------------------------------------------------------Advanced Search Function
	@FindBy(xpath="//a[@onclick='showReimbursmentExpAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnRFAET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnRFAET()
	{
		Select s1 =new Select(SelectFilter);
		s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnRFAET()
	{
		Select s2 =new Select(SelectFilterOperator);
		s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxRFAET()
	{
		EnterBox.sendKeys("2217");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[5]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnRFAET()
	{
		ApplyBtn.click();
	}
//--------------------------------------------------------Advanced Date Function
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxRFAET()
	{
		CalenderBox.click();
	}
    @FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
    public WebElement SelectMonth;
	public void SelectMonthRFAET()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("Aug");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearRFAET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2024");
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayRFAET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='30'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayRFAET()
	{
		LastDay.click();
	}
//-------------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnRFAET()
	{
		Select User1 =new Select(SelectFilterUser);
		User1.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatorUserOnRFAET()
	{
		Select User2 =new Select(SelectFilterOperatorUser);
		User2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserRFAET()
	{
		EnterBoxUser.sendKeys("Jon Kicker");
	}
//----------------------------------------------------------Advanced Search By Project Number
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPNO;
	public void SelectFilterPNOOnRFAET()
	{
		Select PNO1 =new Select(SelectFilterUser);
		PNO1.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatorPNOOnRFAET()
	{
		Select PNO2 =new Select(SelectFilterOperatorPNO);
		PNO2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPNO;
	public void EnterOnAdvancedEnterBoxPNOrRFAET()
	{
		EnterBoxPNO.sendKeys("P10073");
	}
//--------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnRFAET()
	{
		Select PName1 =new Select(SelectFilterPName);
		PName1.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatorPNameOnRFAET()
	{
		Select PName2 =new Select(SelectFilterOperatorPName);
		PName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxPNameRFAET()
	{
		EnterBoxPName.sendKeys("2024 Support");
	}
//--------------------------------------------------------Advanced Search By  Reimbursement Status
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterReimbursementStatus;
	public void SelectFilterReimbursementStatusOnRFAET()
	{
		Select ReimbursementStatus1 =new Select(SelectFilterReimbursementStatus);
		ReimbursementStatus1.selectByVisibleText("Reimbursement Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorReimbursementStatus;
	public void SelectFilterOperatorReimbursementStatusOnRFAET()
	{
		Select ReimbursementStatus2 =new Select(SelectFilterOperatorReimbursementStatus);
		ReimbursementStatus2.selectByVisibleText("=");
	}
	@FindBy(xpath="//select[@class='statusId search_string1 form-control']")
	public WebElement SelectReimbursementStatus;
	public void SelectReimbursementStatusRFAET()
	{
		Select rs = new Select(SelectReimbursementStatus);
		rs.selectByVisibleText("PAID");
	}
//--------------------------------------------------------Advanced Search By Customer Name
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterCName;
	public void SelectFiltercNameOnRFAET()
	{
		Select CName1 =new Select(SelectFilterCName);
		CName1.selectByVisibleText("Customer Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorCName;
	public void SelectFilterOperatorCNameOnRFAET()
	{
		Select CName2 =new Select(SelectFilterOperatorCName);
		CName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxCName;
	public void EnterOnAdvancedEnterBoxCNameRFAET()
	{
		EnterBoxCName.sendKeys("Lexington Manufacturing, Brainerd");
	}
//---------------------------------------------------------Advanced Search By Expense Type
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterExpenseType;
	public void SelectFilterExpenseTypeOnRFAET()
	{
		Select ExpenseType1 =new Select(SelectFilterExpenseType);
		ExpenseType1.selectByVisibleText("Expense Type");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorExpenseType;
	public void SelectFilterOperatorExpenseTypeOnRFAET()
	{
		Select ExpenseType2 =new Select(SelectFilterOperatorExpenseType);
		ExpenseType2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxExpenseType;
	public void EnterOnAdvancedEnterBoxExpenseTypeRFAET()
	{
		EnterBoxExpenseType.sendKeys("Meals & Entertainment	");
	}
//--------------------------------------------------------Advanced Search By Expense Status
	@FindBy(xpath="//select[@onclick='showReimbursmentExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterExpenseStatus;
	public void SelectFilterExpenseStatusOnRFAET()
	{
		Select ExpenseStatus1 =new Select(SelectFilterExpenseStatus);
		ExpenseStatus1.selectByVisibleText("Expense Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorExpenseStatus;
	public void SelectFilterOperatorExpenseStatusOnRFAET()
	{
		Select ExpenseStatus2 =new Select(SelectFilterOperatorExpenseStatus);
		ExpenseStatus2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxExpenseStatus;
	public void EnterOnAdvancedEnterBoxExpenseStatusRFAET()
	{
		EnterBoxExpenseStatus.sendKeys("No Status");
	}
//--------------------------------------------------------Expense details check with Date Function
	@FindBy(xpath="(//td[@data-view-id='2727'])[3]")
	public WebElement Date;
	public void ClickOnDateForExpenseDetailsRFAET()
	{
		Date.click();
	}
	
	@FindBy(xpath="(//span[text()='Close'])[2]")
	public WebElement Close;
	public void ClickOnCloseForExpenseDetailsRFAET()
	{
		Close.click();
	}
//--------------------------------------------------------Expense details check with Project Number Function
	@FindBy(xpath="(//td[@data-view-id='2727'])[4]")
	public WebElement ProjectNo;
	public void ClickOnProjectNoForExpenseDetailsRFAET()
	{
		ProjectNo.click();
	}
//--------------------------------------------------------Expense details check with Project Name Function
	@FindBy(xpath="(//td[@data-view-id='11417'])[4]")
	public WebElement ProjectName;
	public void ClickOnProjectNameForExpenseDetailsRFAET()
	{
		ProjectNo.click();
	}
//------------------------------------------------------------Export Function 
	@FindBy(xpath="//a[@id='reimbursement_download_link']")
	public WebElement Export;
	public void ClickOnExportBtnRFAET()
	{
		Export.click();
	}
//-----------------------------------------------------------Attachment Function
	@FindBy(xpath="//a[text()='August QR.IO Receipt.pdf ']")
	public WebElement Attachment;
	public void ClickOnAttachmentlinkRFAET()
	{
		Attachment.click();
	}
//------------------------------------------------------------LoadMore_Function
	@FindBy(xpath="//a[@id='reimbursement_download_link']")
	public WebElement LoadMore;
	public void ClickOnLoadMoreBtnRFAET()
	{
		LoadMore.click();
	}
	public Reimbursable_For_ALL(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
