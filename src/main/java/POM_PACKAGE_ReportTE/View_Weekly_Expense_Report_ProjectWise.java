package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Weekly_Expense_Report_ProjectWise {
	
	@FindBy(xpath="//a[@id='weekly-expense-report-link']")
	public WebElement ExpenseReportPW;
	public void ClickOnExpenseReportPW()
	{
		ExpenseReportPW.click();
	}
	@FindBy(xpath="//input[@id='expensetracking_weekly_report_text']")
	private WebElement SearchBoxERPW;
	public void EnterSearchBoxERPW(String value) throws InterruptedException
	{
		SearchBoxERPW.sendKeys(value);	
	}
	@FindBy(xpath="//button[@id='search_exptracking_weeklyproj_report']")
	private WebElement SarchBtnERPW;
	
	public void ClickOnSarchBtnERPW() throws InterruptedException
	{
		SarchBtnERPW.click();
	}
//-------------------------------------Advanced Search By Date		
	@FindBy(xpath="//a[@onclick='showWeeklyexpenseReportAdvSearch();']")
	private WebElement AdvancedSearchERPW;
	public void ClickonAdvancedSearchBtnERPW()
	{
		AdvancedSearchERPW.click();
	}
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterERPW;
	public void SelectAddFilterERPW()
	{
		Select DateERPW = new Select(AddFilterERPW);
		DateERPW.selectByVisibleText("Date");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement AdvancedDateERPW;
	public void ClickonAdvancedDateERPW()
	{
		AdvancedDateERPW.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	private WebElement MonthERPW;
	public void SelectMonthERPW(String Month)
	{
		Select ERPWMonth = new Select(MonthERPW);
		ERPWMonth.selectByVisibleText(Month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	private WebElement YearERPW;
	public void SelectYearERPW()
	{
		Select ERPWYear = new Select(YearERPW);
		ERPWYear.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='18'])[4]")
	private WebElement StartDayERPW;
	public void ClickonStartDayERPW()
	{
		StartDayERPW.click();
	}
	@FindBy(xpath="(//a[text()='24'])[4]")
	private WebElement LastDayERPW;
	public void ClickonLastDayERPW()
	{
		LastDayERPW.click();
	}
	@FindBy(xpath="//form[@id='expensetracking_weekly_report_adv_search_from']//input[@type='submit']")
	private WebElement ApplyERPW;
	public void ClickOnApplyERPW()
	{
		ApplyERPW.click();
	}
//----------------------------------------------------Advanced Search By User	
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterUserERPW;
	public void SelectAddFilterUserERPW(String user)
	{
		Select UserERPW = new Select(AddFilterUserERPW);
		UserERPW.selectByVisibleText(user);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterUserERPW;
	public void SelectLikeFilteUserERPW()
	{
		Select UserERPW1 = new Select(LikeFilterUserERPW);
		UserERPW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement UserERPW2;
	public void EnterUserERPW(String UName)
	{
		UserERPW2.sendKeys(UName);
	}
//-----------------------------------------------------Advanced Search By Project No and Name	
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterProjectNERPW;
	public void SelectAddFilterProjectNERPW(String PNo)
	{
		Select ProjectNERPW = new Select(AddFilterProjectNERPW);
		ProjectNERPW.selectByVisibleText(PNo);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNERPW;
	public void SelectLikeFilteProjectNERPW()
	{
		Select ProjectNERPW1 = new Select(LikeFilterProjectNERPW);
		ProjectNERPW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNERPW2;
	public void EnterProjectNERPW(String PName)
	{
		ProjectNERPW2.sendKeys(PName);
	}
	
//-----------------------------------------------------Advanced Search By Customer		
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterCustomerERPW;
	public void SelectAddFilterCustomerERPW(String Customer)
	{
		Select CustomerERPW = new Select(AddFilterCustomerERPW);
		CustomerERPW.selectByVisibleText(Customer);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCustomerERPW;
	public void SelectLikeFilteCustomerERPW()
	{
		Select CustomerERPW1 = new Select(LikeFilterCustomerERPW);
		CustomerERPW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CustomerERPW2;
	public void EnterCustomerERPW(String CustomerName)
	{
		CustomerERPW2.sendKeys(CustomerName);
	}
//-----------------------------------------------------------------Advanced Search by Expense Type
	
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterExpenseTypeERPW;
	public void SelectAddFilterExpenseTypeERPW(String expensetype)
	{
		Select ExpenseTypeERPW = new Select(AddFilterExpenseTypeERPW);
		ExpenseTypeERPW.selectByVisibleText(expensetype);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterExpenseTypeERPW;
	public void SelectLikeFilteExpenseTypeERPW()
	{
		Select ExpenseTypeERPW1 = new Select(LikeFilterExpenseTypeERPW);
		ExpenseTypeERPW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ExpenseTypeERPW2;
	public void EnterExpenseTypeERPW(String expense)
	{
		ExpenseTypeERPW2.sendKeys(expense);
	}
//----------------------------------------------------------------Advanced Search By Comments
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterCommentsERPW;
	public void SelectAddFilterCommentsERPW(String comments)
	{
		Select CommentsERPW = new Select(AddFilterCommentsERPW);
		CommentsERPW.selectByVisibleText(comments);
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCommentsERPW;
	public void SelectLikeFilteCommentsERPW()
	{
		Select CommentsERPW1 = new Select(LikeFilterCommentsERPW);
		CommentsERPW1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CommnetsERPW2;
	public void EnterCommentsERPW(String comments1)
	{
		CommnetsERPW2.sendKeys(comments1);
	}
//----------------------------------------------------------------Advanced Search By Status
	@FindBy(xpath="//select[@id='expensetracking_weekly_report_adv_search']")
	private WebElement AddFilterStatusERPW;
	public void SelectAddFilterStatusERPW()
	{
		Select StatusERPW = new Select(AddFilterStatusERPW);
		StatusERPW.selectByVisibleText("Status");
	}
	@FindBy(xpath="//option[text()='APPROVED']")
	private WebElement STATUSERPW;
	public void SelectWERPWstatus()
	{
		STATUSERPW.click();
	}
//----------------------------------------------------------------Show/Hide All Record
	@FindBy(xpath="//form[@id='expensetracking_weekly_report_search']//a[text()='Show/Hide All Records']")
	private WebElement HideShowERPW;
	public void ClickOnHideShowBtnERPW()
	{
		HideShowERPW.click();
	}
//-----------------------------------------------------------------Load More Functions 	
	@FindBy(xpath="//table[@id='expensetracking_weekly_report_search_result']//a[text()='Load more']")
	private WebElement LoadMoreERPW;
	public void ClickonLoadMoreERPW()
	{
		LoadMoreERPW.click();
	}
//-----------------------------------------------------------------Export Function
	@FindBy(xpath="//a[@id='expense_weekly-download-link']")
	private WebElement ExportERPW;
	public void ClickonExportERPW()
	{
		ExportERPW.click();
	}
	public View_Weekly_Expense_Report_ProjectWise(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
