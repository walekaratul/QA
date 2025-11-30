package POM_Package_TT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_For_All {
	
	@FindBy(xpath="//a[@onclick='showTimeTrackingSearch.call(this, event)']")
	public WebElement viewmodify;
	public void ClickOnViewModifyTT()
	{
		viewmodify.click();
	}
	@FindBy(xpath="//li[@id='tms_search_all']")
	public WebElement ALL;
	public void ClickOnVMALLBtn()
	{
		ALL.click();
	}
//--------------------------------------------------------------Simple Search Function	
	@FindBy(xpath="//input[@id='timetracking_search_text']")
	public WebElement SearchBox;
	public void EnterkOnSearchBoxVMALL()
	{
		SearchBox.sendKeys("Loose Panel Parts");
	}
	@FindBy(xpath="//form[@id='timetracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnVMALL()
	{
		SearchBtn.click();
	}
//----------------------------------------------------------Advanced Search date Function Function	
	@FindBy(xpath="//a[@onclick='showlaborAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMALL()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnVMALL()
	{
		Select s1 =new Select(SelectFilter);
	    s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMALL()
	{
		Select s2 =new Select(SelectFilterOperator);
	    s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMALL()
	{
		EnterBox.sendKeys("Admin");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[3]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnVMALL()
	{
		ApplyBtn.click();
	}
	
	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxVMALL()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth;
	public void SelectMonthVMALL()
	{
		Select s1 = new Select(SelectMonth);
		s1.selectByVisibleText("Aug");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearVMALL()
	{
		Select s2 = new Select(SelectYear);
		s2.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='03'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayVMALL()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='09'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayVMALL()
	{
		LastDay.click();
	}
//--------------------------------------------------Advanced Search By User Name
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterUser;
	public void SelectFilterUserOnVMALL()
	{
		Select user =new Select(SelectFilterUser);
	    user.selectByVisibleText("User Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatoruser;
	public void SelectFilterOperatoruserOnVMALL()
	{
		Select user1 =new Select(SelectFilterOperator);
	    user1.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBoxuser;
	public void EnterOnAdvancedEnterBoxuserVMALL()
	{
		EnterBoxuser.sendKeys("Kyle Skoog");
	}
//---------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnVMALL()
	{
		Select pname =new Select(SelectFilterPName);
	    pname.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPName;
	public void SelectFilterOperatorPNameOnVMALL()
	{
		Select pname1 =new Select(SelectFilterOperatorPName);
	    pname1.selectByVisibleText("=");
	}
	@FindBy(xpath="//input[@class='search_string1 form-control']")
	public WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxPNameVMALL()
	{
		EnterBoxPName.sendKeys("Thermal Bonding Reflow Panel 5");
	}
	
//--------------------------------------------------Advanced Search By Status Function
	@FindBy(xpath="//select[@onclick='ShowTimetrackingAdvanceDiv(this)']")
	public WebElement SelectFilterstatus;
	public void SelectFilterstatusOnVMALL()
	{
		Select status =new Select(SelectFilterstatus);
	    status.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorstatus;
	public void SelectFilterOperatorstatusOnVMALL()
	{
		Select status1 =new Select(SelectFilterOperatorstatus);
	    status1.selectByVisibleText("=");
	}
	@FindBy(xpath="//option[text()='NO STATUS']")
	public WebElement Status2;
	public void ClickOnStatusVMALL()
	{
		Status2.click();
	}
//---------------------------------------------------Plus Symbol Function	
	@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[33]")
	public WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMALL()
	{
		PlusSymboll.click();
	} 
//-----------------------------------------------------New Button Function	
	@FindBy(xpath="//a[@title='Create Timesheet']")
	public WebElement NewBtn;
	public void ClickOnNewBtnVMALL()
	{
		NewBtn.click();
	} 
//------------------------------------------------------User Name Link Function	
	@FindBy(xpath="(//a[@onclick='newshowTimeTrackingSheetView(1004);'])[2]")
	public WebElement UserNameLink;
	public void ClickOnUserNameLinkVMALL()
	{
		UserNameLink.click();
	}
//---------------------------------------------------------------Hide Shoe All Records Function	
	@FindBy(xpath="//ul[@class='nav nav-pills']//button[@id='qp-allExpanded']")
	public WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMALL()
	{
		HideShowAllRecord.click();
	}
//--------------------------------------------------------------Load More Function	
	@FindBy(xpath="//(//a[text()='Load more'])[2]")
	public WebElement LoadMore;
	public void ClickOnLoadMoreVMALL()
	{
		LoadMore.click();
	} 
	
	public View_Modify_For_All(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
