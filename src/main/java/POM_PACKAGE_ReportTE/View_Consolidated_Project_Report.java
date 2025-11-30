package POM_PACKAGE_ReportTE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class View_Consolidated_Project_Report {
	@FindBy(xpath="//a[@onclick='showtimesheetprojectwiseReport(); return false;']")
	private WebElement ViewConsolidated_ProjectReport;
	public void ClickOnViewConsolidated_ProjectReport()
	{
		ViewConsolidated_ProjectReport.click();
	}
	@FindBy(xpath="//input[@id='timesheet_projectwise_report_text']")
	private WebElement SearchBoxCPR;
	public void EnterSearchBoxCPR()
	{
		SearchBoxCPR.sendKeys("Seneca Central");
	}
	@FindBy(xpath="//button[@id='search_timesheet_projectwise_report']")
	private WebElement SarchBtnCPR;
	
	public void ClickOnSearchBtnCPR()
	{
		SarchBtnCPR.click();
	}
//----------------------------------------------------------Advanced Search By Project No
	
	@FindBy(xpath="//a[@onclick='showtimetrackingprojectwiseReportAdvSearch();']")
	private WebElement AdvancedSearchCPR;
	public void ClickonAdvancedSearchBtnCPR()
	{
		AdvancedSearchCPR.click();
	}
	@FindBy(xpath="//select[@id='timesheet_projectwise_report_adv_search']")
	private WebElement AddFilterUserCPR;
	public void SelectAddFilterUserCPR()
	{
		Select ProjectNoCPR = new Select(AddFilterUserCPR);
		ProjectNoCPR.selectByVisibleText("Project No");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNoCPR;
	public void SelectLikeFilteProjectNoCPR()
	{
		Select ProjectNoCPR1 = new Select(LikeFilterProjectNoCPR);
		ProjectNoCPR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNoCPR;
	public void EnterProjectNoCPR()
	{
		ProjectNoCPR.sendKeys("P10098");
	}
	@FindBy(xpath="//form[@id='timesheet_projectwise_report_adv_search_from']//input[@type='submit']")
	private WebElement ApplyCPR;
	public void ClickOnApplyCPR()
	{
		ApplyCPR.click();
	}
//-------------------------------------Advanced Search By Project Name
	@FindBy(xpath="//select[@id='timesheet_projectwise_report_adv_search']")
	private WebElement AddFilterProjectNameCPR;
	public void SelectAddFilterProjectNameCPR()
	{
		Select ProjectNameCPR = new Select(AddFilterUserCPR);
		ProjectNameCPR.selectByVisibleText("Project Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectNameCPR;
	public void SelectLikeFilteProjectNameCPR()
	{
		Select ProjectNameCPR1 = new Select(LikeFilterProjectNameCPR);
		ProjectNameCPR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectNameCPR;
	public void EnterProjectNameCPR()
	{
		ProjectNameCPR.sendKeys("Thermal Bonding Reflow AB Conversion");
	}
//-----------------------------------------Advanced Search Project Status
	@FindBy(xpath="//select[@id='timesheet_projectwise_report_adv_search']")
	private WebElement AddFilterProjectStatusCPR;
	public void SelectAddFilterProjectStatusCPR()
	{
		Select ProjectStatusCPR = new Select(AddFilterProjectStatusCPR);
		ProjectStatusCPR.selectByVisibleText("Project Status");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterProjectStatusCPR;
	public void SelectLikeFilteProjectStatusCPR()
	{
		Select ProjectStatusCPR1 = new Select(LikeFilterProjectStatusCPR);
		ProjectStatusCPR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement ProjectStatusCPR;
	public void EnterProjectStatusCPR()
	{
		ProjectStatusCPR.sendKeys("quotation");
	}
//-------------------------------------------Advanced Search By Customer Name
	@FindBy(xpath="//select[@id='timesheet_projectwise_report_adv_search']")
	private WebElement AddFilterCustomerNameCPR;
	public void SelectAddFilterCustomerNameCPR()
	{
		Select CustomerNameCPR = new Select(AddFilterCustomerNameCPR);
		CustomerNameCPR.selectByVisibleText("Customer Name");
	}
	@FindBy(xpath="//select[@class='criterias form-control']")
	private WebElement LikeFilterCustomerNameCPR;
	public void SelectLikeFilteCustomerNameCPR()
	{
		Select CustomerNameCPR1 = new Select(LikeFilterCustomerNameCPR);
		CustomerNameCPR1.selectByVisibleText("=");
	}
	@FindBy(xpath="(//input[@class='search_string1 form-control'])[1]")
	private WebElement CustomerNameCPR;
	public void EnterCustomerNameCPR()
	{
		CustomerNameCPR.sendKeys("Rolling Forks Design Group");
	}
//--------------------------------------------------Advanced Search By Project Manager
	@FindBy(xpath="//select[@id='timesheet_projectwise_report_adv_search']")
	private WebElement AddFilterProjectManagerCPR;
	public void SelectAddFilterProjectManagerCPR()
	{
		Select ProjectManagerCPR = new Select(AddFilterProjectManagerCPR);
		ProjectManagerCPR.selectByVisibleText("Project Manager");
	}
	
	@FindBy(xpath="//input[@placeholder='Select an Project Manager']")
	private WebElement ProjectManagerCPR;
	public void EnterProjectManagerCPR()
	{
		ProjectManagerCPR.click();
		
	}
	@FindBy(xpath="//li[text()='Nick Skoog']")
	private WebElement ProjectManagerNameCPR;
	public void ClickOnProjectManagerNameCPR()
	{
		ProjectManagerNameCPR.click();
		
	}
//-----------------------------------------------------------Export Functions
	@FindBy(xpath="//a[@id='consolidated-project-reportaction-dropdown-btns']")
	private WebElement ExportCPR;
	public void ClickonExportCPR()
	{
		ExportCPR.click();
	}
	@FindBy(xpath="//a[@id='downloadCsv3']")
	private WebElement DownloadRecordsCPR;
	public void ClickonDownloadRecordsCPR()
	{
		DownloadRecordsCPR.click();
	}
//--------------------------------------Load More Function
	@FindBy(xpath="//table[@id='timesheet_projectwise_report_search_result']//a[text()='Load more' ]")
	private WebElement LoadMoreCPR;
	public void ClickonLoadMoreCPR()
	{
		LoadMoreCPR.click();
	}
	public View_Consolidated_Project_Report(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
