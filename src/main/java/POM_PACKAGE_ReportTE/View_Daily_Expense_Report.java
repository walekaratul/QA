package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Daily_Expense_Report {
	
	@FindBy(xpath="//a[@id='ui-id-30']")
	public WebElement ExpenseReport;
	public void ClickOnExpenseReport()
	{
		ExpenseReport.click();
	}
	
	@FindBy(xpath="//a[@onclick='showExpenseReport();return false;']")
	public WebElement VDExpenseReport;
	public void ClickOnVDExpenseReport()
	{
		VDExpenseReport.click();
	}
	
	@FindBy(xpath="//input[@id='exptracking_report_text']")
	private WebElement SearchBoxER;
	public void EnterSearchBoxER(String value) throws InterruptedException
	{
		SearchBoxER.sendKeys(value);	
	}
	@FindBy(xpath="//button[@id='search_exptracking_daily_report']")
	private WebElement SarchBtnER;
	
	public void ClickOnSarchBtnER() throws InterruptedException
	{
		SarchBtnER.click();
	}
//-------------------------------------Advanced Search By Date	
	
	@FindBy(xpath="//a[@onclick='showExpReportAdvSearh();']")
	private WebElement AdvancedSearchER;
	public void ClickonAdvancedSearchBtnER()
	{
		AdvancedSearchER.click();
	}
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterER;
	public void SelectAddFilterER()
	{
		Select DateER = new Select(AddFilterER);
		DateER.selectByVisibleText("Date");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement AdvancedDateER;
	public void ClickonAdvancedDateER()
	{
		AdvancedDateER.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement MonthER;
	public void SelectMonthWTRPW(String Month)
	{
		Select ERMonth = new Select(MonthER);
		ERMonth.selectByVisibleText(Month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement YearER;
	public void SelectYearER()
	{
		Select ERYear = new Select(YearER);
		ERYear.selectByValue("2020");
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	private WebElement StartDayER;
	public void ClickonStartDayER()
	{
		StartDayER.click();
	}
	@FindBy(xpath="(//a[text()='9'])[4]")
	private WebElement LastDayER;
	public void ClickonLastDayER()
	{
		LastDayER.click();
	}
	@FindBy(xpath="//form[@id='exptracking_report_adv_search_from']//input[@type='submit']")
	private WebElement ApplyER;
	public void ClickOnApplyER()
	{
		ApplyER.click();
	}
//----------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterUserER;
	public void SelectAddFilterUserER(String user)
	{
		Select UserER = new Select(AddFilterUserER);
		UserER.selectByVisibleText(user);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterUserER;
	public void SelectLikeFilteUserER()
	{
		Select UserER1 = new Select(LikeFilterUserER);
		UserER1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserER2;
	public void EnterUserER(String UName)
	{
		UserER2.sendKeys(UName);
	}
//-----------------------------------------------------Advanced Search By Project No and Name
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterProjectNER;
	public void SelectAddFilterProjectNER(String PNo)
	{
		Select ProjectNER = new Select(AddFilterProjectNER);
		ProjectNER.selectByVisibleText(PNo);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNER;
	public void SelectLikeFilteProjectNER()
	{
		Select ProjectNER1 = new Select(LikeFilterProjectNER);
		ProjectNER1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNER2;
	public void EnterProjectNER(String PName)
	{
		UserER2.sendKeys(PName);
	}
//-----------------------------------------------------Advanced Search By Customer	
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterCustomerER;
	public void SelectAddFilterCustomerER(String Customer)
	{
		Select CustomerER = new Select(AddFilterCustomerER);
		CustomerER.selectByVisibleText(Customer);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCustomerER;
	public void SelectLikeFilteCustomerER()
	{
		Select CustomerER1 = new Select(LikeFilterCustomerER);
		CustomerER1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CustomerER2;
	public void EnterCustomerER(String CustomerName)
	{
		CustomerER2.sendKeys(CustomerName);
	}
//------------------------------------------------------Advanced Search By Expense Type
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterExpenseTypeER;
	public void SelectAddFilterExpenseTypeER(String expensetype)
	{
		Select ExpenseTypeER = new Select(AddFilterExpenseTypeER);
		ExpenseTypeER.selectByVisibleText(expensetype);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterExpenseTypeER;
	public void SelectLikeFilteExpenseTypeER()
	{
		Select ExpenseTypeER1 = new Select(LikeFilterExpenseTypeER);
		ExpenseTypeER1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ExpenseTypeER2;
	public void EnterExpenseTypeER(String expense)
	{
		ExpenseTypeER2.sendKeys(expense);
	}
//----------------------------------------------------------Advanced Search By Amount
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterAmountER;
	public void SelectAddFilterAmountTypeER()
	{
		Select ExpenseTypeER = new Select(AddFilterExpenseTypeER);
		ExpenseTypeER.selectByVisibleText("Amount");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterAmountER;
	public void SelectLikeFilteAmountER()
	{
		Select AmountER1 = new Select(LikeFilterAmountER);
		AmountER1.selectByVisibleText(">");
	}
	@FindBy(xpath="//input[@class='amount_input1 search_string1 form-control']")
	private WebElement AmountER2;
	public void EnterAmountER()
	{
		AmountER2.sendKeys("544.9300");
	}
//-----------------------------------------------------------Advanced Search By Comments
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterCommentsER;
	public void SelectAddFilterCommentsER(String comments)
	{
		Select CommentsER = new Select(AddFilterCommentsER);
		CommentsER.selectByVisibleText(comments);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCommentsER;
	public void SelectLikeFilteCommentsER()
	{
		Select CommentsER1 = new Select(LikeFilterCommentsER);
		CommentsER1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CommnetsER2;
	public void EnterCommentsER(String comments1)
	{
		CommnetsER2.sendKeys(comments1);
	}
//-------------------------------------------------------------Advanced Search By Status	
	@FindBy(xpath="//select[@id='exptracking_report_adv_search']")
	private WebElement AddFilterStatusER;
	public void SelectAddFilterStatusER()
	{
		Select StatusER = new Select(AddFilterStatusER);
		StatusER.selectByVisibleText("Status");
	}
	@FindBy(xpath="//option[text()='APPROVED']")
	private WebElement STATUSER;
	public void SelectWTRPWstatus()
	{
		STATUSER.click();
	}
//----------------------------------------------------------Export Functionality
	@FindBy(xpath="//a[@id='exp-download-link']")
	private WebElement ExportER;
	public void ClickonExportER()
	{
		ExportER.click();
	}
//---------------------------------------------------------Load More Functionality
	@FindBy(xpath="//table[@id='exptracking_report_search_result']//a[text()='Load more']")
	private WebElement LoadMoreER;
	public void ClickonLoadMoreER()
	{
		LoadMoreER.click();
	}
//----------------------------------------------------------Attachment Function
	@FindBy(xpath="//table[@id='exptracking_report_search_result']//a[text()='Screenshot (2).png ']")
	private WebElement AttachmentER;
	public void ClickonAttachmentER()
	{
		AttachmentER.click();
	}
	public  View_Daily_Expense_Report(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
