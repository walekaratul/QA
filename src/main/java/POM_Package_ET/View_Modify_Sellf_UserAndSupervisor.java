package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Modify_Sellf_UserAndSupervisor {
	
	
	@FindBy(xpath="//a[@onclick='showExpTrackingSearch.call(this, event)']")
	public WebElement ViewModify;
	public void ClickOnViewModifyExpensesheet()
	{
		ViewModify.click();
	}
	
//---------------------------------------------------------------Simple Search Function	
	
	@FindBy(xpath="//input[@id='exptracking_search_text']")
	public WebElement SerachBox;
	public void EnterOnSerachBoxVMFUET()
	{
		SerachBox.sendKeys("Testing MR mobile app");
	}
	@FindBy(xpath="//form[@id='exptracking_search']//button//i[@class='fa fa-search']")
	public WebElement SearchBtn;
	public void ClickOnSearchBtnVMFUET()
	{
		SearchBtn.click();
	}
//-------------------------------------------------------------Advanced Search By Date Function
	@FindBy(xpath="//a[@onclick='showExpAdvSearh();']")
	public WebElement AdvnancedSearch;
	public void ClickOnAdvnancedSearchBtnVMFUET()
	{
		AdvnancedSearch.click();
	}
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilter;
	public void SelectFilterOnVMFUET()
	{
		Select s1 =new Select(SelectFilter);
	    s1.selectByVisibleText("Date");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperator;
	public void SelectFilterOperatorOnVMFUET()
	{
		Select s2 =new Select(SelectFilterOperator);
	    s2.selectByVisibleText("BETWEEN");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBox;
	public void EnterOnAdvancedEnterBoxVMFUET()
	{
		EnterBox.sendKeys("AAA");
	}
	@FindBy(xpath="(//input[@class='btn ru-create-new'])[4]")
	public WebElement ApplyBtn;
	public void ClickOnApplyBtnVMFUET()
	{
		ApplyBtn.click();
	} 

	@FindBy(xpath="//input[@class='search_dateId search_string1 form-control hasDatepicker']")
	public WebElement CalenderBox;
	public void ClickOnCalenderBoxVMFUET()
	{
		CalenderBox.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth;
	public void SelectMonthVMFUET()
	{
		Select s3 = new Select(SelectMonth);
		s3.selectByVisibleText("Oct");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearVMFUET()
	{
		Select s4 = new Select(SelectYear);
		s4.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='19'])[4]")
	public WebElement FirstDay;
	public void ClickOnFirstDayVMFUET()
	{
		FirstDay.click();
	}
	@FindBy(xpath="(//a[text()='25'])[4]")
	public WebElement LastDay;
	public void ClickOnLastDayVMFUET()
	{
		LastDay.click();
	}
//------------------------------------------------------------------------Advanced Search By User
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilteruser;
	public void SelectFilteruserOnVMFUET()
	{
		Select user =new Select(SelectFilteruser);
	    user.selectByVisibleText("User");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatoruser;
	public void SelectFilterOperatoruserOnVMFUET()
	{
		Select user1 =new Select(SelectFilterOperatoruser);
	    user1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxuser;
	public void EnterOnAdvancedEnterBoxuserVMFUET()
	{
		EnterBoxuser.sendKeys("Atul");
	}
//-------------------------------------------------------------------Advanced Search By Project Number 
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPNO;
	public void SelectFilterPNOOnVMFUET()
	{
		Select PNO =new Select(SelectFilterPNO);
	    PNO.selectByVisibleText("Project Number");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorPNO;
	public void SelectFilterOperatorPNOOnVMFUET()
	{
		Select PNO1 =new Select(SelectFilterOperatorPNO);
	    PNO1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPNO;
	public void EnterOnAdvancedEnterBoxPNOVMFUET()
	{
		EnterBoxPNO.sendKeys("123");
	}
//-------------------------------------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterPName;
	public void SelectFilterPNameOnVMFUET()
	{
		Select PName =new Select(SelectFilterPName);
	    PName.selectByVisibleText("Project Name");
	}

	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	public WebElement EnterBoxPName;
	public void EnterOnAdvancedEnterBoxPNameVMFUET()
	{
		EnterBoxPName.sendKeys("Admin");
	}
	//---------------------------------------------------------------Advanced Search By Status Function
	@FindBy(xpath="//select[@onclick='ShowExptrackingAdvanceDiv(this)']")
	public WebElement SelectFilterstatus;
	public void SelectFilterstatusOnVMFUET()
	{
		Select status =new Select(SelectFilterstatus);
	    status.selectByVisibleText("Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	public WebElement SelectFilterOperatorstatus;
	public void SelectFilterOperatorstatusOnVMFUET()
	{
		Select status1 =new Select(SelectFilterOperatorstatus);
	    status1.selectByVisibleText("=");
	}
	@FindBy(xpath="//option[text()='APPROVED']")
	public WebElement Status2;
	public void ClickOnStatusVMFUET()
	{
		Status2.click();
	}
	
//---------------------------------------------------------------Plus Symbol Function
	@FindBy(xpath="(//a[@onclick='tmssearchToggle(this)'])[1]")
	public WebElement PlusSymboll;
	public void ClickOnPlusSymbollVMFUET()
	{
		PlusSymboll.click();
	} 
//------------------------------------------------------------------New Button Function	
	@FindBy(xpath="//a[@title='Create Expensesheet']")
	public WebElement NewBtn;
	public void ClickOnNewBtnVMFUET()
	{
		NewBtn.click();
	}
//------------------------------------------------------------------Week Time sheet Link Function	
	@FindBy(xpath="//a[text()='02 Jun 2025 to 08 Jun 2025']")
	public WebElement WeekTimeSheetLink;
	public void ClickOnWeekTimeSheetLinkVMFUET()
	{
		WeekTimeSheetLink.click();
	}
//-------------------------------------------------------------------Hide Show All Records Function	
	@FindBy(xpath="(//button[text()='Show/Hide All Records'])[2]")
	public WebElement HideShowAllRecord;
	public void ClickOnHideShowAllRecordVMFUET()
	{
		HideShowAllRecord.click();
	}	
	
	public View_Modify_Sellf_UserAndSupervisor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
