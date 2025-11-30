package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_User {
	@FindBy(xpath="//i[@class='fa fa-bars']")
	private WebElement Menu;
	public void ClickOnMenuBtn()
	{
		Menu.click();
	}
	@FindBy(xpath="//span[text()='Time Tracking']")
	private WebElement TimeTracking;
	public void ClickOnTimeTracking()
	{
		TimeTracking.click();
	}
	@FindBy(xpath="//a[@onclick='showTimeTrackingSearch.call(this, event)']")
	private WebElement ViewModify;
	public void ClickOnViewModifyTT()
	{
		ViewModify.click();
	}
//---------------------------------------------------------------Simple Search Function	
	@FindBy(xpath="//input[@id='timetracking_search_text']")
	private WebElement SerachBox;
	public void EnterOnSerachBoxVMFU()
	{
		SerachBox.sendKeys("APQ Internal");
	}
	@FindBy(xpath="//form[@id='timetracking_search']//button//i[@class='fa fa-search']")
	private WebElement SearchBtn;
	public void ClickOnSearchBtnVMFU()
	{
		SearchBtn.click();
	}
//-------------------------------------------------------------Advanced Search Function	By Date
	@FindBy(xpath="//a[@onclick='showlaborAdvSearh();']")
	private WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMFU()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	private WebElement SelectFilter;
	public void SelectFilterOnVMFU()
	{
		Select s1 =new Select(SelectFilter);
	    s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMFU()
	{
		Select s2 =new Select(SelectFilterOperator);
	    s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	private WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMFU()
	{
		EnterBox.sendKeys("GES-PRJ-SCC-Cleanlogix");
	}
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	private WebElement CalenderBox;
	public void ClickOnCalenderBoxVMFU()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//a[text()='3'])[4]")
	private WebElement FirstDay;
	public void ClickOnFirstDayVMFU()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='9'])[4]")
	private WebElement LastDay;
	public void ClickOnLastDayVMFU()
	{
		LastDay.click();
	}
	@FindBy(xpath="//form[@id='timetracking_adv_search_from']//input[@class='btn ru-create-new']")
	private WebElement ApplyBtn;
	public void ClickOnApplyBtnVMFU()
	{
		ApplyBtn.click();
	} 
//-------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	private WebElement SelectFilterProjectN;
	public void SelectFilterProjectNOnVMFU()
	{
		Select ProjectN =new Select(SelectFilter);
		ProjectN.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperatorProjectN;
	public void SelectFilterOperatorProjectNOnVMFU()
	{
		Select ProjectN1 =new Select(SelectFilterOperator);
		ProjectN1.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	private WebElement EnterBoxProjectN;
	public void EnterOnAdvancedEnterBoxProjectNVMFU()
	{
		EnterBoxProjectN.sendKeys("Sagola Utility PLC Integration");
	}
//-----------------------------------------------------Advanced Search By Status
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	private WebElement SelectFilterStatus;
	public void SelectFilterStatusOnVMFU()
	{
		Select Status =new Select(SelectFilter);
		Status.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement SelectFilterOperatorStatus;
	public void SelectFilterOperatorStatusOnVMFU()
	{
		Select Status1 =new Select(SelectFilterOperator);
		Status1.selectByVisibleText("=");
	}
	@FindBy(xpath="//option[text()='NO STATUS']")
	private WebElement Status2;
	public void ClickOnSTATUSVMFU()
	{
		Status2.click();
	}
	
//------------------------------------------------------Status Function	
	@FindBy(xpath="//option[text()='NO STATUS']")
	private WebElement Status;
	public void ClickOnStatusVMFU()
	{
		Status.click();
	}

//---------------------------------------------------------------Plus Symbol Function	
    @FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[2]")
	private WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMFU()
	{
		PlusSymboll.click();
	} 
//------------------------------------------------------------------New Button Function	
	@FindBy(xpath="//a[@title='Create Timesheet']")
	private WebElement NewBtn;
	public void ClickOnNewBtnVMFU()
	{
		NewBtn.click();
	} 
//------------------------------------------------------------------Week Time sheet Link Function	
	@FindBy(xpath="//a[text()='03 Aug 2025 to 09 Aug 2025']")
	private WebElement WeekTimeSheetLink;
	public void ClickOnWeekTimeSheetLinkVMFU()
	{
		WeekTimeSheetLink.click();
	} 
//-------------------------------------------------------------------Hide Show All Records Function	
	@FindBy(xpath="(//button[text()='Show/Hide All Records'])[1]")
	private WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMFU()
	{
		HideShowAllRecord.click();
	} 
//-------------------------------------------------------------------Load More Function
	@FindBy(xpath="(//a[text()='Load more'])[1]")
	private WebElement LoadMoreSelf;
	public void ClickOnLoadMoreSelf()
	{
		LoadMoreSelf.click();
	} 
	
	public View_Modify_For_User(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
