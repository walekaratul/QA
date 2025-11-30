package POM_Package_ET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Expensesheet {

	@FindBy(xpath="//div[text()='Menu']")
	public WebElement Menu;
	public void ClickOnMenu()
	{
		Menu.click();
	}
	@FindBy(xpath="//span[text()='Expense Tracking']")
	public WebElement ExpenseTracking;
	public void ClickOnExpenseTracking()
	{
		ExpenseTracking.click();
		
	}
	@FindBy(xpath="//a[@onclick='showExpTrackingSheetCreate(0)']")
	public WebElement CreateExpensheeet;
	public void ClickOnCreateExpensheeet()
	{
		CreateExpensheeet.click();
	}
//----------------------------------------------------------------Select Calendar Function
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	public WebElement DateSymboll;
	public void ClickOnDateSymbollCE()
	{
		DateSymboll.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement month;
	public void SelectmonthCE()
	{
		Select s = new Select(month);
		s.selectByVisibleText("Jun");
		
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement year;
	public void SelectyearCE()
	{
		Select s1= new Select(year);
		s1.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='2'])[4]")
	public WebElement Day;
	public void ClickOnDayCE()
	{
		Day.click();
	}
//------------------------------------------------------------------Create Expense sheet Function

	@FindBy(xpath="//input[@id='exptracking-project_name']")
	public WebElement serarchbox;
	public void ClickOnProjectserarchboxCE()
	{
		serarchbox.click();
	}
	@FindBy(xpath="//a[text()='REXCO032425RLR LINKSTATION UPGRADE']")
	public WebElement project;
	public void SelectProjectCE()
	{
		project.click();
	}
//-----------------------------------------------------------	Amount Function
	@FindBy(xpath="(//input[@maxlength='8'])[2]")
	public WebElement Amount1;
	public void EnterAmount1CE()
	{
		Amount1.clear();
		Amount1.sendKeys("500");
	}
	@FindBy(xpath="(//input[@maxlength='8'])[3]")
	public WebElement Amount2;
	public void EnterAmount2CE()
	{
		Amount2.clear();
		Amount2.sendKeys("1000");
	}
	@FindBy(xpath="(//input[@maxlength='8'])[4]")
	public WebElement Amount3;
	public void EnterAmount3CE()
	{
		Amount3.clear();
		Amount3.sendKeys("1500");
	}
	@FindBy(xpath="(//input[@maxlength='8'])[5]")
	public WebElement Amount4;
	public void EnterAmount4CE()
	{
		Amount4.clear();
		Amount4.sendKeys("2000");
	}
	@FindBy(xpath="(//input[@maxlength='8'])[6]")
	public WebElement Amount5;
	public void EnterAmount5CE()
	{
		Amount5.clear();
		Amount5.sendKeys("2500");
	}
	@FindBy(xpath="(//input[@maxlength='8'])[7]")
	public WebElement Amount6;
	public void EnterAmount6CE()
	{
		Amount6.clear();
		Amount6.sendKeys("3000");
	}
	@FindBy(xpath="(//input[@maxlength='8'])[8]")
	public WebElement Amount7;
	public void EnterAmount7CE()
	{
		Amount7.clear();
		Amount7.sendKeys("3000");
	}
	
	@FindBy(xpath="//td[text()= 'Total']")
	public WebElement Total;
	public void ClickOnTotalCE()
	{
		Total.click();
	}
//-----------------------------------------------------------------------Expense Function	
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[1]")
	public WebElement select1;
	public void SelectExpense1CE()
	{
		Select se1 = new Select(select1);
		se1.selectByVisibleText("Meals");
	}
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[2]")
	public WebElement select2;
	public void SelectExpense2CE()
	{
		Select se2 = new Select(select2);
		se2.selectByVisibleText("Meals");
	}
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[3]")
	public WebElement select3;
	public void SelectExpense3CE()
	{
		Select se3 = new Select(select3);
		se3.selectByVisibleText("Gas");
	}
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[4]")
	public WebElement select4;
	public void SelectExpense4CE()
	{
		Select se4 = new Select(select4);
		se4.selectByVisibleText("Meals");
	}
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[5]")
	public WebElement select5;
	public void SelectExpense5CE()
	{
		Select se5 = new Select(select5);
		se5.selectByVisibleText("Parking");
	}
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[6]")
	public WebElement select6;
	public void SelectExpense6CE()
	{
		Select se6 = new Select(select6);
		se6.selectByVisibleText("Meals");
	}
	@FindBy(xpath="(//select[@class='explaborvalselect tbtxt'])[7]")
	public WebElement select7;
	public void SelectExpense7CE()
	{
		Select se7 = new Select(select7);
		se7.selectByVisibleText("Parking");
	}
//-------------------------------------------------------------------------Checkbox Function	
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[1]")
	public WebElement checkbox1;
	public void ClickOnCheckBox1CE()
	{
		checkbox1.click();
	}
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[2]")
	public WebElement checkbox2;
	public void ClickOnCheckBox2CE()
	{
		checkbox2.click();
	}
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[3]")
	public WebElement checkbox3;
	public void ClickOnCheckBox3CE()
	{
		checkbox3.click();
	}
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[4]")
	public WebElement checkbox4;
	public void ClickOnCheckBox4CE()
	{
		checkbox4.click();
	}
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[5]")
	public WebElement checkbox5;
	public void ClickOnCheckBox5CE()
	{
		checkbox5.click();
	}
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[6]")
	public WebElement checkbox6;
	public void ClickOnCheckBox6CE()
	{
		checkbox6.click();
	}
	@FindBy(xpath="(//input[@class='reimbursement_checkbox'])[7]")
	public WebElement checkbox7;
	public void ClickOnCheckBox7CE()
	{
		checkbox7.click();
	}
//---------------------------------------------------------------------------------Comment Function
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[1]")
	public WebElement clickcomment1;
	public void ClickOnComment1CE()
	{
		clickcomment1.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[1]")
	public WebElement entercomment1;
	public void EnterComment1CE()
	{
		entercomment1.sendKeys("Request For Approval");
	}
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[2]")
	public WebElement clickcomment2;
	public void ClickOnComment2CE()
	{
		clickcomment2.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[2]")
	public WebElement entercomment2;
	public void EnterComment2CE()
	{
		entercomment2.sendKeys("Request For Approval");
	}
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[3]")
	public WebElement clickcomment3;
	public void ClickOnComment3CE()
	{
		clickcomment3.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[3]")
	public WebElement entercomment3;
	public void EnterComment3CE()
	{
		entercomment3.sendKeys(" Request For Approval");
	}
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[4]")
	public WebElement clickcomment4;
	public void ClickOnComment4CE()
	{
		clickcomment4.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[4]")
	public WebElement entercomment4;
	public void EnterComment4CE()
	{
		entercomment4.sendKeys("Request For Approval");
	}
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[5]")
	public WebElement clickcomment5;
	public void ClickOnComment5CE()
	{
		clickcomment5.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[5]")
	public WebElement entercomment5;
	public void EnterComment5CE()
	{
		entercomment5.sendKeys("  Request For Approval");
	}
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[6]")
	public WebElement clickcomment6;
	public void ClickOnComment6CE()
	{
		clickcomment6.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[6]")
	public WebElement entercomment6;
	public void EnterComment6CE()
	{
		entercomment6.sendKeys("Request For Approval");
	}
	
	@FindBy(xpath="(//textarea[@class='tbtxt fixedTextarea expcommentsbox'])[7]")
	public WebElement clickcomment7;
	public void ClickOnComment7CE()
	{
		clickcomment7.click();
	}
	@FindBy(xpath="(//textarea[@placeholder='Note:500 Chars Max'])[7]")
	public WebElement entercomment7;
	public void EnterComment7CE()
	{
		entercomment7.sendKeys("Request For Approval");
	}
	@FindBy(xpath="//td[text()=' Total ']")
	public WebElement total;
	public void ClickOntotalCE()
	{
		total.click();
	}
//----------------------------------------------------------------Project Checkbox Function	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[12]")
	public WebElement singlecheckbox;
	public void ClickOnProjectSingleCheckBoxCE()
	{
		singlecheckbox.click();
	}
	@FindBy(xpath="//table[@id='exptracking_sheet_table']/tbody//tr[1]//td[2]")
	public WebElement Allcheckbox;
	public void ClickOnProjectAllCheckBoxCE()
	{
		Allcheckbox.click();
	}
	
	
//-------------------------------------------------------------------Save Function	
	
	@FindBy(xpath="(//a[@id='exptracking-save-btn'])[1]")
	public WebElement Save;
	public void ClickOnSaveBtnCE()
	{
		Save.click();
	}
//--------------------------------------------------------------------SupervisorInternal Function

	@FindBy(xpath="//a[@id='expsheet-actions-dropdown-btn']")
	public WebElement Actions;
	public void ClickOnActionsBtnCE()
	{
		Actions.click();
	}
	@FindBy(xpath="(//p[@class='qp-drop-menu'])[19]")
	public WebElement IssueForApproval;
	public void ClickOnIssueForApprovalBtnCE()
	{
		IssueForApproval.click();
	}
	@FindBy(xpath="(//a[@class='btnExpSubmit'])[1]")
	public WebElement SupervisorInternal;
	public void ClickOnSupervisorInternalBtnCE()
	{
		SupervisorInternal.click();
	}
	
//--------------------------------------------------------------------ProjectManager Function
	
	@FindBy(xpath="(//a[@class='btnExpSubmit'])[2]")
	public WebElement ProjectManager;
	public void ClickOnProjectManagerBtnCE()
	{
		ProjectManager.click();
	}
//--------------------------------------------------------------------Client Function

	@FindBy(xpath="(//a[@class='btnExpSubmit'])[3]")
	public WebElement Client;
	public void ClickOnClientBtnCE()
	{
		Client.click();
	}
//--------------------------------------------------------------------Submit Function

	@FindBy(xpath="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[77]")
	public WebElement Submit;
	public void ClickOnSubmitBtnCE()
	{
		Submit.click();
	}
//--------------------------------------------------------------------Cancel Function

	@FindBy(xpath="(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])[78]")
	public WebElement Cancel;
	public void ClickOnCancelBtnCE()
	{
		Cancel.click();
	}
//--------------------------------------------------------------------ExportExpenseSheet Function
				
	@FindBy(xpath="(//p[@class='qp-drop-menu'])[20]")
	public WebElement ExportExpenseSheet;
	public void ClickOnExportExpenseSheetBtnCE()
	{
		ExportExpenseSheet.click();
	}
	@FindBy(xpath="//a[@onclick='expExportPdf();']")
	public WebElement ExportPDF;
	public void ClickOnExportPDFBtnCE()
	{
		ExportPDF.click();
	}
	@FindBy(xpath="//a[@onclick='expExportPdfWithZip();']")
	public WebElement ExportPDFWithReciept;
	public void ClickOnExportPDFWithRecieptBtnCE()
	{
		ExportPDFWithReciept.click();
	}
				
//---------------------------------------------------------Delete Function
			
	@FindBy(xpath="//i[@onclick='deleteOneRowExpLT(1)']")
	public WebElement delete;
	public void ClickOndeleteSymbolCE()
	{
		delete.click();
	}
	@FindBy(xpath="//span[text()='Yes, Delete it!']")
	public WebElement deleteYES;
	public void ClickOndeleteYESBtnCE()
	{
		deleteYES.click();
	}	
	@FindBy(xpath="(//span[text()='Leave this Page'])[3]")
	public WebElement leavethispage;
	public void ClickOnleavethispageBtnCE()
	{
		leavethispage.click();
	}
	@FindBy(xpath="(//span[text()='Cancel'])[29]")
	public WebElement deleteNO;
	public void ClickOndeleteNOBtnCE()
	{
		deleteNO.click();
	}
//---------------------------------------------------------AddRow Function	
				
	@FindBy(xpath="//i[@class='fa fa-plus-circle smallcustomicon']")
	public WebElement AddRow;
	public void ClickOnAddRowBtnCE()
	{
		AddRow.click();
	}
				
				

	public Create_Expensesheet(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
