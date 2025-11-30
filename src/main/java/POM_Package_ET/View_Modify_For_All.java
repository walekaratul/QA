package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_All {
	
	@FindBy(xpath="//a[@onclick='showExpTrackingSearch.call(this, event)']")
	public WebElement viewmodify;
	public void ClickOnViewModifyET()
	{
		viewmodify.click();
	}
	@FindBy(xpath="//li[@id='exp_search_all']")
	public WebElement All;
	public void ClickOnAllBtnVMFAET()
	{
		All.click();
	}
//-----------------------------------------------Simple Search Function	
	@FindBy(xpath="//input[@id='exptracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxVMFAET()
	{
		SearchBox.sendKeys("GRN validation testing");
	}
	@FindBy(xpath="//form[@id='exptracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnVMFAET()
	{
		SearchBtn.click();
	}
//-----------------------------------------------------------------Advanced Search Function	
	@FindBy(xpath="//a[@onclick='showExpAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMFAET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnVMFAET()
	{
		Select s1 =new Select(SelectFilter);
		s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMFAET()
	{
		Select s2 =new Select(SelectFilterOperator);
		s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMFAET()
	{
		EnterBox.sendKeys("452");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[4]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnVMFAET()
	{
		ApplyBtn.click();
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxVMFAET()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth;
	public void SelectMonthVMFAETT()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("Feb");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearVMFAET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='3'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayVMFAET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='9'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayVMFAET()
	{
		LastDay.click();
	}
//-----------------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnVMFAET()
	{
		Select User1 =new Select(SelectFilterUser);
		User1.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorUser;
	public void SelectFilterOperatorUserOnVMFAET()
	{
		Select User2 =new Select(SelectFilterOperatorUser);
		User2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxUser;
	public void EnterOnAdvancedEnterBoxUserVMFAET()
	{
		EnterBoxUser.sendKeys("Nick Skoog");
	}
//--------------------------------------------------------------Advanced Search By Project Number
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPNO;
	public void SelectFilterPNOOnVMFAET()
	{
		Select ProjectNO1 =new Select(SelectFilterPNO);
		ProjectNO1.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatorPNOrOnVMFAET()
	{
		Select ProjectNO2 =new Select(SelectFilterOperatorPNO);
		ProjectNO2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPNO;
	public void EnterOnAdvancedEnterBoxPNOVMFAET()
	{
		EnterBoxPNO.sendKeys("P10224");
	}
//-------------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnVMFAET()
	{
		Select ProjectName1 =new Select(SelectFilterPName);
		ProjectName1.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatorPNameOnVMFAET()
	{
		Select ProjectName2 =new Select(SelectFilterOperatorPName);
		ProjectName2.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxPNameVMFAET()
	{
		EnterBoxPName.sendKeys("Mohawk Texas Project");
	}
	
//---------------------------------------------------------------Advanced Search By Status Function	
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterStatus;
	public void SelectFilterStatusOnVMFAET()
	{
		Select Status1 =new Select(SelectFilterStatus);
		Status1.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorStatus;
	public void SelectFilterOperatorStatusOnVMFAET()
	{
		Select Status2 =new Select(SelectFilterOperatorStatus);
		Status2.selectByVisibleText("=");
	}
	@FindBy(xpath="//option[text()='APPROVED']")
	public WebElement Status3;
	public void ClickOnStatusVMFAET()
	{
		Status3.click();
	}

	
//-----------------------------------------------------------New Button Function	
    @FindBy(xpath="//a[@title='Create Expensesheet']")
    public WebElement NewBtn;
	public void ClickOnNewBtnVMFAET()
	{
		NewBtn.click();
	} 
//------------------------------------------------------------Plus Symbol Function	
	@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[22]")
	public WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMFAET()
	{
		PlusSymboll.click();
	}
//---------------------------------------------------------------UserExpensheetLink	Function
	@FindBy(xpath="//a[@onclick='showExpTrackingSheetView(347);']")
	public WebElement UserExpensheetLink;
	public void ClickOnUserExpensesheetLinkVMFAET()
	{
		UserExpensheetLink.click();
	}
//-------------------------------------------------------------------Hide Show All Records Function	
	@FindBy(xpath="(//button[text()='Show/Hide All Records'])[2]")
	public WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMFAET()
	{
		HideShowAllRecord.click();
	}
//------------------------------------------------------------LoadMore Function	
	@FindBy(xpath="//table[@id='exptracking_search_resultall']//a[text()='Load more']")
	public WebElement LoadMore;
	public void ClickOnLoadMoreVMFAET()
	{
		LoadMore.click();
	}		
	public View_Modify_For_All(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
