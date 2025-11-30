package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Weekly_Expense_Report_UserWise {
	@FindBy(xpath="//a[@id='weekly-expense-report-link-user']")
	public WebElement ExpenseReportUW;
	public void ClickOnExpenseReportUW()
	{
		ExpenseReportUW.click();
	}
	@FindBy(xpath="//input[@id='expensetracking_weekly_user_report_text']")
	private WebElement SearchBoxERUW;
	public void EnterSearchBoxERUW(String value) throws InterruptedException
	{
		SearchBoxERUW.sendKeys(value);	
	}
	@FindBy(xpath="//button[@id='search_exptracking_weeklyuser_report']")
	private WebElement SarchBtnERUW;
	
	public void ClickOnSarchBtnERUW() throws InterruptedException
	{
		SarchBtnERUW.click();
	}
//-------------------------------------Advanced Search By Date 
	@FindBy(xpath="//a[@onclick='showWeeklyUserexpenseReportAdvSearch();']")
	private WebElement AdvancedSearchERUW;
	public void ClickonAdvancedSearchBtnERUW()
	{
		AdvancedSearchERUW.click();
	}
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterERUW;
	public void SelectAddFilterERUW()
	{
		Select DateERUW = new Select(AddFilterERUW);
		DateERUW.selectByVisibleText("Date");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement AdvancedDateERUW;
	public void ClickonAdvancedDateERUW()
	{
		AdvancedDateERUW.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement MonthERUW;
	public void SelectMonthERUW(String Month)
	{
		Select ERUWMonth = new Select(MonthERUW);
		ERUWMonth.selectByVisibleText(Month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement YearERUW;
	public void SelectYearERUW()
	{
		Select ERUWYear = new Select(YearERUW);
		ERUWYear.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='4'])[4]")
	private WebElement StartDayERUW;
	public void ClickonStartDayERUW()
	{
		StartDayERUW.click();
	}
	@FindBy(xpath="(//a[text()='10'])[4]")
	private WebElement LastDayERUW;
	public void ClickonLastDayERUW()
	{
		LastDayERUW.click();
	}
	@FindBy(xpath="//form[@id='expensetracking_weekly_user_report_adv_search_from']//input[@type='submit']")
	private WebElement ApplyERUW;
	public void ClickOnApplyERUW()
	{
		ApplyERUW.click();
	}
//-------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterUserERUW;
	public void SelectAddFilterUserERUW(String user)
	{
		Select UserERUW = new Select(AddFilterUserERUW);
		UserERUW.selectByVisibleText(user);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterUserERUW;
	public void SelectLikeFilteUserERUW()
	{
		Select UserERUW1 = new Select(LikeFilterUserERUW);
		UserERUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserERUW2;
	public void EnterUserERUW(String UName)
	{
		UserERUW2.sendKeys(UName);
	}
//-------------------------------------------------Advanced Search By Project Name and Number
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterProjectNERUW;
	public void SelectAddFilterProjectNERUW(String PNo)
	{
		Select ProjectNERUW = new Select(AddFilterProjectNERUW);
		ProjectNERUW.selectByVisibleText(PNo);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNERUW;
	public void SelectLikeFilteProjectNERUW()
	{
		Select ProjectNERUW1 = new Select(LikeFilterProjectNERUW);
		ProjectNERUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNERUW2;
	public void EnterProjectNERUW(String PName)
	{
		ProjectNERUW2.sendKeys(PName);
	}
//------------------------------------------------Advanced Search By Customer
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterCustomerERUW;
	public void SelectAddFilterCustomerERUW(String Customer)
	{
		Select CustomerERUW = new Select(AddFilterCustomerERUW);
		CustomerERUW.selectByVisibleText(Customer);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCustomerERUW;
	public void SelectLikeFilteCustomerERUW()
	{
		Select CustomerERUW1 = new Select(LikeFilterCustomerERUW);
		CustomerERUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CustomerERUW2;
	public void EnterCustomerERUW(String CustomerName)
	{
		CustomerERUW2.sendKeys(CustomerName);
	}
//---------------------------------------------------Advanced Search By Expense Type
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterExpenseTypeERUW;
	public void SelectAddFilterExpenseTypeERUW(String expensetype)
	{
		Select ExpenseTypeERUW = new Select(AddFilterExpenseTypeERUW);
		ExpenseTypeERUW.selectByVisibleText(expensetype);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterExpenseTypeERUW;
	public void SelectLikeFilteExpenseTypeERUW()
	{
		Select ExpenseTypeERUW1 = new Select(LikeFilterExpenseTypeERUW);
		ExpenseTypeERUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ExpenseTypeERUW2;
	public void EnterExpenseTypeERUW(String expense)
	{
		ExpenseTypeERUW2.sendKeys(expense);
	}
//------------------------------------------------Advanced Search By Commments
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterCommentsERUW;
	public void SelectAddFilterCommentsERUW(String comments)
	{
		Select CommentsERUW = new Select(AddFilterCommentsERUW);
		CommentsERUW.selectByVisibleText(comments);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCommentsERUW;
	public void SelectLikeFilteCommentsERUW()
	{
		Select CommentsERUW1 = new Select(LikeFilterCommentsERUW);
		CommentsERUW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CommnetsERUW2;
	public void EnterCommentsERUW(String comments1)
	{
		CommnetsERUW2.sendKeys(comments1);
	}
//------------------------------------------------Advanced Search By Status
	@FindBy(xpath="//select[@id='expensetracking_weekly_user_report_adv_search']")
	private WebElement AddFilterStatusERUW;
	public void SelectAddFilterStatusERUW()
	{
		Select StatusERUW = new Select(AddFilterStatusERUW);
		StatusERUW.selectByVisibleText("Status");
	}
	@FindBy(xpath="//option[text()='NO STATUS']")
	private WebElement STATUSERUW;
	public void SelectWERUWstatus()
	{
		STATUSERUW.click();
	}
//-------------------------------------------------Hide/Show All Record Function
	@FindBy(xpath="//form[@id='expensetracking_weekly_user_report_search']//a[text()='Show/Hide All Records']")
	private WebElement HideShowERUW;
	public void ClickOnHideShowBtnERUW()
	{
		HideShowERUW.click();
	}
//-----------------------------------------------Load More Function
	@FindBy(xpath="//table[@id='expensetracking_weekly_report_user_search_result']//a[text()='Load more']")
	private WebElement LoadMoreERUW;
	public void ClickonLoadMoreERUW()
	{
		LoadMoreERUW.click();
	}
//---------------------------------------------Export Function
	@FindBy(xpath="//a[@id='expense_weekly_user-download-link']")
	private WebElement ExportERUW;
	public void ClickonExportERUW()
	{
		ExportERUW.click();
	}
	
	//---------------
	
//	@FindBy(xpath="//a[@id='ui-id-23']")
//	private WebElement POR;
//	public void ClickonPOR()
//	{
//		POR.click();
//	}
//	@FindBy(xpath="//a[@id='view-srno_report-link']")
//	private WebElement POR1;
//	public void ClickonPOR1()
//	{
//		POR1.click();
//	}
//	@FindBy(xpath="//input[@id='report-search-text']")
//	private WebElement POSB;
//	public void ClickonPOSB()
//	{
//		POSB.sendKeys("886765280");
//	}
//	@FindBy(xpath="//button[@title='Search PO']")
//	private WebElement POSBtn;
//	public void ClickonPOSBtn()
//	{
//		POSBtn.click();
//	}
	public View_Weekly_Expense_Report_UserWise(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

}
