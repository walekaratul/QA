package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_GRN_MM {
	WebDriver driver;
//---------------------------------------------------------------------------------------Create PR
	@FindBy(xpath="//a[@onclick='loadMaterialManagement(586); return false;']")
	public WebElement mm;
	public void ClickonMM()
	{
		mm.click();
	}
	@FindBy(xpath="(//a[@id='MM_actions-dropdown-btn'])[1]")
	public WebElement ExpandAll;
	public void ClickonExpandAllbtn()
	{
		ExpandAll.click();
	}
	@FindBy(xpath="(//span[@class='qp-checkmark'])[4]")
	public WebElement Itemcheckbox;
	public void ClickonItemcheckbox()
	{
		Itemcheckbox.click();
	}
//------------------------------------------------------------------------For eganco Customization	
	@FindBy(xpath="//tr[@id='mm_item_2']//a[@title='Expand/Collapse']")
	public WebElement FolderArrow;
	public void ClickonFolderArrow()
	{
		FolderArrow.click();
	}
	@FindBy(xpath="(//tr[@id='mm_item_3']//span[@class='qp-checkmark'])[1]")
	public WebElement Itemcheckboxeganco;
	public void ClickonItemcheckboxeganco()
	{
		Itemcheckboxeganco.click();
	}
	//---------------------------------------------------------------------------Insert Vendor SPA into BOM 
	
	@FindBy(xpath="(//tr[@id='mm_item_3']//span[@class='qp-checkmark'])[2]")
	public WebElement ItemcheckboxegancoSPA;
	public void ClickonItemcheckboxegancoSPA()
	{
		ItemcheckboxegancoSPA.click();
	}
	@FindBy(xpath="(//tr[@id='mm_item_3']//span[@class='qp-checkmark'])[2]")
	public WebElement InsertSPAintoBOM;
	public void ClickonInsertSPAintoBOM()
	{
		InsertSPAintoBOM.click();
	}
//----------------------------------------------------------------------------------------------------	
	@FindBy(xpath="//a[text()='Select Vendor']")
	public WebElement SelectVendor;
	public void ClickonSelectVendorbtn()
	{
		SelectVendor.click();
	}
	@FindBy(xpath="//span[text()='select From List']")
	public WebElement SelectVendor1;
	public void ClickonSelectVendorlist()
	{
		SelectVendor1.click();
	}
	@FindBy(xpath="//a[text()='2 Javalinas']")
	public WebElement Vendor;
	public void ClickonVendorlink()
	{
		Vendor.click();
	}
	@FindBy(xpath="(//a[text()='Approved'])[1]")
	public WebElement Approved;
	public void ClickonApprovebtn()
	{
		Approved.click();
	}
	@FindBy(xpath="(//a[text()='Approved'])[2]")
	public WebElement Approved1;
	public void ClickonApproveoption()
	{
		Approved1.click();
	}
	@FindBy(xpath="(//a[text()=' Create PR'])[2]")
	public WebElement createPR;
	public void ClickoncreatePRbtn()
	{
		createPR.click();
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement createPRYes;
	public void ClickoncreatePRYesbtn()
	{
		createPRYes.click();
	}
	@FindBy(xpath="//span[text()='No']")
	public WebElement createPRNo;
	public void ClickoncreatePRNobtn()
	{
		createPRNo.click();
	}
//-----------------------------------------------------------------------Create PO
	@FindBy(xpath="(//input[@value='20'])[2]")
	public WebElement POReqQty;
	public void EnterPOReqQty() throws InterruptedException
	{
		POReqQty.click();
		Thread.sleep(1000);
		POReqQty.clear();
		Thread.sleep(1000);
		POReqQty.sendKeys("10");
	}
	@FindBy(xpath="//a[text()='2 Javalinas']")
	public WebElement VendorPO;
	public void ClickonVendorPOlink()
	{
		VendorPO.click();
	}
	@FindBy(xpath="//a[@id='mm-task-btn']")
	public WebElement Task;
	public void ClickonTaksbtn()
	{
		Task.click();
	}
	@FindBy(xpath="//a[text()='Panel #3']")
	public WebElement Task1;
	public void ClickonTaks()
	{
		Task1.click();
	}
	@FindBy(xpath="(//a[text()=' Create PO'])[2]")
	public WebElement createPO;
	public void ClickoncreatePObtn()
	{
		createPO.click();
	}
	@FindBy(xpath="//p[text()='Due Date/Item = lead Time + X Day + Today']")
	public WebElement Duedate;
	public void ClickonDuedateoption()
	{
		Duedate.click();
	}
	@FindBy(xpath="//input[@id='mm_xdays']")
	public WebElement Days;
	public void EnterDays() throws InterruptedException
	{
		Days.click();
		Thread.sleep(1000);
		Days.sendKeys("10");
	}
	@FindBy(xpath="(//button[text()='Apply'])[3]")
	public WebElement Apply;
	public void ClickonApplyPObtn()
	{
		Apply.click();
	}
	@FindBy(xpath="//a[@onclick='createSinglePO(this);return false;']")
	public WebElement CreatePO;
	public void ClickonCreatePObtn()
	{
		CreatePO.click();
	}
	@FindBy(xpath="(//span[text()='Cancel'])[29]")
	public WebElement CancePO;
	public void ClickonCancePObtn()
	{
		CancePO.click();
	}
	@FindBy(xpath="//span[text()='Create All PO']")
	public WebElement CreateAllPO;
	public void ClickonCreateAllPObtn()
	{
		CreateAllPO.click();
	}
//----------------------------------------------------------------- Create GRN	
	@FindBy(xpath="//a[text()='View GRN']")
	public WebElement ViewGRN;
	public void ClickonViewGRNbtn()
	{
		ViewGRN.click();
	}
	@FindBy(xpath="//a[@title='Create GRN']")
	public WebElement New;
	public void ClickonNewbtn()
	{
		New.click();
	}
	@FindBy(xpath="//a[@id='grn-po-add' and text()= ' Add']")
	public WebElement Add;
	public void ClickonAddbtn()
	{
		Add.click();
	}
	@FindBy(xpath="(//a[text()='TAS/16656'])[2]")
	public WebElement PO;
	public void ClickonPOlink()
	{
		PO.click();
	}
	@FindBy(xpath="//a[@onclick=' grnItemsTableReflow();']")
	public WebElement Items;
	public void ClickonItemsbtn()
	{
		Items.click();
	}
	
	@FindBy(xpath="//span[@class='file ui-draggable']")
	public WebElement Drag;
	public void ClickonDrag()
	{
		Drag.click();
	}
	
	@FindBy(xpath="//span[text()='GRN Items']")
	public WebElement Drop;
	public void rightclickonDrop() throws InterruptedException
	{
		
		
		Actions Act = new Actions(driver);
		Act.contextClick(Drop).perform();
	}
	@FindBy(xpath="(//a[text()='Copy here'])[6]")
	public WebElement CopyGRN;
	public void ClickonCopyGRN()
	{
		CopyGRN.click();
	}
	@FindBy(xpath="//span[@class='qp-toggle']")
	public WebElement Toggle;
	public void ClickonExpandToggle()
	{
		Toggle.click();
	}
	@FindBy(xpath="//input[@id='grn-save-btn']")
	public WebElement SaveGRN;
	public void ClickonSaveGRN()
	{
		SaveGRN.click();
	}
//	@FindBy(xpath="//tr[@class='ui-droppable initialized']")
//	public WebElement Drop;
//	public void DragandDropFunction(WebDriver driver) throws InterruptedException
//	{
//		Drag.click();
//		Thread.sleep(1000);
//		Actions Act = new Actions(driver);
//		Act.dragAndDrop(Drag, Drop);
//	}
//---------------------------------------------Fill Vendor Confirmation Data
	@FindBy(xpath="//a[@data-dropdown='#material-mgt-columns-dropdown']")
	public WebElement Setting;
	public void ClickonSettingbtn()
	{
		Setting.click();
	}
	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[1]")
	public WebElement checkboxPR;
	public void ClickoncheckboxPR()
	{
		checkboxPR.click();
	}
	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[2]")
	public WebElement checkboxPO;
	public void ClickoncheckboxPO()
	{
		checkboxPO.click();
	}
	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[3]")
	public WebElement checkboxGRN;
	public void ClickoncheckboxGRN()
	{
		checkboxGRN.click();

	}
	@FindBy(xpath="//a[@data-id='14689']")
	public WebElement Vendorlink;
	public void ClickonVendorlinkPO()
	{
		Vendorlink.click();
	}
	@FindBy(xpath="//button[text()='Yes']")
	public WebElement VendorConfirmation;
	public void ClickonVendorConfirmationDataYesbutton()
	{
		VendorConfirmation.click();//input[@class='vendor_confirmation_date hasDatepicker']
	}
	@FindBy(xpath="//button[text()='No']")
	public WebElement VendorConfirmation1;
	public void ClickonVendorConfirmationDataNobutton()
	{
		VendorConfirmation1.click();
	}
	@FindBy(xpath="//input[@class='vendor_confirmation_date hasDatepicker']")
	public WebElement VendorConfirmationDate;
	public void ClickonVendorConfirmationDate()
	{
		VendorConfirmationDate.click();
	}
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement VendorConfirmationMonth;
	public void SelectVendorConfirmationMonth()
	{
		Select vcm = new Select(VendorConfirmationMonth);
		vcm.selectByVisibleText("Aug");
	}
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement VendorConfirmationYear;
	public void SelectVendorConfirmationYear()
	{
		Select vcy = new Select(VendorConfirmationYear);
		vcy.selectByValue("2025");
	}
	@FindBy(xpath="//a[text()='10']")
	public WebElement VendorConfirmationDay;
	public void ClickonVendorConfirmationDay()
	{
		VendorConfirmationDay.click();
	}
	@FindBy(xpath="//input[@class='vendor_confirmation_qty']")
	public WebElement VendorConfirmationQty;
	public void EnterVendorConfirmationQty()
	{
		VendorConfirmationQty.sendKeys("30");
	}
	@FindBy(xpath="//button[@id='btnSaveNSend']//i[@class='fa fa-angle-down']")
	public WebElement SaveandSendDropdown;
	public void ClickonSaveandSendDropdownbtn()
	{
		SaveandSendDropdown.click();
	}
	@FindBy(xpath="//a[text()='Save & Send']")
	public WebElement SaveandSend;
	public void ClickonSaveandSendOption()
	{
		SaveandSend.click();
	}
	@FindBy(xpath="//a[text()='Save']")
	public WebElement SaveVC;
	public void ClickonSaveVCOption()
	{
		SaveVC.click();
	}
	@FindBy(xpath="//button[text()='OK']")
	public WebElement SaveOK;
	public void ClickonSaveOKbtn()
	{
		SaveOK.click();
	}
	public Create_GRN_MM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
