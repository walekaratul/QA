package POM_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_PO_POM {
	
	@FindBy(xpath="//div[text()='Menu']")
	public WebElement Menu;
	public void ClickOnMenu()
	{
		Menu.click();
	}
	@FindBy(xpath="//span[text()='Purchase Order']")
	public WebElement PurchaseOrder;
	public void ClickOnPurchaseOrder()
	{
		PurchaseOrder.click();
	}
//---------------------------------------------------- Create PO Vpel
	@FindBy(xpath="//a[@id='po-create-link']")
	public WebElement CreatePO;
	public void ClickOnCreatePO()
	{
		CreatePO.click();
	}
	@FindBy(xpath="//div[@data-dropdown='#po-format_names-dropdown']")
	public WebElement SelectFormat;
	public void ClickOnSelectFormatbtn()
	{
		SelectFormat.click();
	}
	@FindBy(xpath="//a[text()='VPEL']")
	public WebElement Vpel;
	public void ClickOnVpel()
	{
		Vpel.click();
	}
	@FindBy(xpath="//input[@id='po-supplier_name']")
	public WebElement Supplier;
	public void ClickOnSuppliersearchbox()
	{
		Supplier.click();
	}
	@FindBy(xpath="//a[text()='3A EXPORTS']")
	public WebElement Supplier1;
	public void SelectSupplier()
	{
		Supplier1.click();
	}
	@FindBy(xpath="//option[text()='Nilofer Shaikh']")
	public WebElement Contacts;
	public void SelectContacts()
	{
		Contacts.click();
	}
	@FindBy(xpath="//table[@id='po-info-table']//input[@id='po-project_name']")
	public WebElement Project;
	public void ClickOnProjectsearchbox()
	{
		Project.click();
	}
	@FindBy(xpath="//a[text()='Xytel India Pvt Ltd']")
	public WebElement Project1;
	public void SelectProject()
	{
		Project1.click();
	}
	@FindBy(xpath="//textarea[@id='txt_po_payment_terms']")
	public WebElement PaymentTerms;
	public void EnterPaymentTerms(String PT)
	{
		PaymentTerms.clear();
		PaymentTerms.sendKeys(PT);
	}
	@FindBy(xpath="//textarea[@id='po-comments']")
	public WebElement POComments;
	public void EnterPOComments()
	{
		POComments.sendKeys("PO Created By Atul Walekar");
	}
	@FindBy(xpath="//input[@id='po-exp_del_date']")
	public WebElement POExpectedDate;
	public void ClickonPOExpectedDatebox()
	{
		POExpectedDate.click();
	}
	@FindBy(xpath="//a[text()='25']")
	public WebElement ExpDate;
	public void ClickonPOExpDate()
	{
		ExpDate.click();
	}
//--------------------------------------------------Extra Fields
	@FindBy(xpath="//div[@id='po-tabs']//a[text()='Extra Fields']")
	public WebElement ExtraFields;
	public void ClickonExtraFieldsTab()
	{
		ExtraFields.click();
	}
	@FindBy(xpath="//input[@data-extra_field_name='ref_job_no']")
	public WebElement RefJobNo;
	public void EnterRefJobNo(String Rjobno)
	{
		RefJobNo.clear();
		RefJobNo.sendKeys(Rjobno);
	}
	@FindBy(xpath="//select[@id='packing_transport']")
	public WebElement Freight;
	public void SelectFreight()
	{
		Select s = new Select(Freight);
		s.selectByVisibleText("Included");
	}
	@FindBy(xpath="//input[@data-extra_field_name='warrantyterms']")
	public WebElement WarrantyTerms;
	public void EnterWarrantyTerms(String WTerms)
	{
		WarrantyTerms.clear();
		WarrantyTerms.sendKeys(WTerms);
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person']")
	public WebElement ContactPerson;
	public void EnterContactPerson(String CPerson)
	{
		ContactPerson.clear();
		ContactPerson.sendKeys(CPerson);
	}
	@FindBy(xpath="//input[@data-extra_field_name='mobile']")
	public WebElement MobileNo;
	public void EnterMobileNo(String MobNo)
	{
		MobileNo.clear();
		MobileNo.sendKeys(MobNo);
	}
	@FindBy(xpath="//table[@id='po-extra_field_info-table']//input[@data-extra_field_name='email']")
	public WebElement Email;
	public void EnterEmail(String mail)
	{
		Email.clear();
		Email.sendKeys(mail);
	}
//--------------------------------------------------Items Fields
	@FindBy(xpath="//div[@id='po-tabs']//a[text()='Items']")
	public WebElement ItemsFields;
	public void ClickonItemsFieldsTab()
	{
		ItemsFields.click();
	}
	@FindBy(xpath="(//span[@class='file ui-draggable'])[1]")
	public WebElement drag;
	@FindBy(xpath="//tr[@id='po-node-base']")
	public WebElement drop;
	public void DraganddropPO(WebDriver driver)
	{
		drag.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag, drop).build().perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(drag));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drop));
	}
	@FindBy(xpath="(//span[@class='file ui-draggable'])[2]")
	public WebElement drag1;
	@FindBy(xpath="//tr[@id='po-node-base']")
	public WebElement drop1;
	public void DraganddropPO1(WebDriver driver)
	{
		drag1.click();
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(drag1, drop1).build().perform();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(drag1));
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(drop1));
	}
	@FindBy(xpath="//span[@class='qp-toggle']")
	public WebElement Togglebtn;
	public void ClickonTogglebtn()
	{
		Togglebtn.click();
	}
	@FindBy(xpath="(//input[@class='cell-input val-quantity'])[1]")
	public WebElement POQty1;
	public void EnterPOQty1(String PQty1)
	{
		POQty1.clear();
		POQty1.sendKeys(PQty1);
	}
	@FindBy(xpath="(//input[@class='cell-input val-quantity'])[2]")
	public WebElement POQty2;
	public void EnterPOQty2(String PQty2)
	{
		POQty2.clear();
		POQty2.sendKeys(PQty2);
	}
	@FindBy(xpath="(//input[@class='cell-input val-price'])[1]")
	public WebElement UnitPrice1;
	public void EnterUnitPrice1(String UP)
	{
		UnitPrice1.clear();
		UnitPrice1.sendKeys(UP);
	}
	@FindBy(xpath="(//input[@class='cell-input val-price'])[2]")
	public WebElement UnitPrice2;
	public void EnterUnitPrice2(String UP1)
	{
		UnitPrice2.clear();
		UnitPrice2.sendKeys(UP1);
	}
	@FindBy(xpath="(//input[@class='cell-input val-discount'])[1]")
	public WebElement Discount1;
	public void EnterDiscount1(String Disc1)
	{
		Discount1.clear();
		Discount1.sendKeys(Disc1);
	}
	@FindBy(xpath="(//input[@class='cell-input val-discount'])[2]")
	public WebElement Discount2;
	public void EnterDiscount2(String Disc2)
	{
		Discount2.clear();
		Discount2.sendKeys(Disc2);
	}
	@FindBy(xpath="(//input[@class='cell-input val-due_date hasDatepicker'])[1]")
	public WebElement DueDate1;
	public void ClickonPODueDate1box()
	{
		DueDate1.click();
	}
	@FindBy(xpath="//a[text()='25']")
	public WebElement DueDate11;
	public void ClickonPODueDate11()
	{
		DueDate11.click();
	}
	@FindBy(xpath="(//input[@class='cell-input val-due_date hasDatepicker'])[2]")
	public WebElement DueDate33;
	public void ClickonPODueDate33box()
	{
		DueDate33.click();
	}
	@FindBy(xpath="//a[text()='27']")
	public WebElement DueDate22;
	public void ClickonPODueDate22()
	{
		DueDate22.click();
	}
	
	@FindBy(xpath="(//input[@class='cell-input val-cgst'])[1]")
	public WebElement CGST1;
	public void EnterCGST1(String GST1)
	{
		CGST1.clear();
		CGST1.sendKeys(GST1);
	}
	@FindBy(xpath="(//input[@class='cell-input val-cgst'])[2]")
	public WebElement CGST2;
	public void EnterCGST2(String GST2)
	{
		CGST2.clear();
		CGST2.sendKeys(GST2);
	}
	@FindBy(xpath="//div[@id='po-tabs']//input[@id='po-save-btn']")
	public WebElement SavePO;
	public void ClickonSavePObtn()
	{
		SavePO.click();
	}
	
//---------------------------------------------------Message Tab function	
	@FindBy(xpath="//div[@id='po-tabs']//a[text()='Messages']")
	public WebElement Messages;
	public void ClickonMessagesTab()
	{
		Messages.click();
	}
	@FindBy(xpath="//div[@id='po-tabs']//input[@type='search']")
	public WebElement To;
	public void ClickonMessagesTo()
	{
		To.click();
	}
	@FindBy(xpath="(//ul[@class='select2-results__options']//li[text()='Admin'])[1]")
	public WebElement User;
	public void ClickonUser()
	{
		User.click();
	}
	@FindBy(xpath="//textarea[@id='po_messagebody']")
	public WebElement SendMessage;
	public void EnterMessage()
	{
		
		SendMessage.sendKeys("PO Created successfully");
	}
	@FindBy(xpath="//button[@id='po_messages_sendbtn']")
	public WebElement Send;
	public void ClickonSendbtn()
	{
		Send.click();
	}
//---------------------------------------------------Edit button Tab function
	@FindBy(xpath="//a[@id='po-edit-link']")
	public WebElement Edit;
	public void ClickonEditbtn()
	{
		Edit.click();
	}
	@FindBy(xpath="(//input[@class='cell-input val-quantity'])[1]")
	public WebElement POEditQty;
	public void EnterPOEditQty(String EQty)
	{
		POEditQty.clear();
		POEditQty.sendKeys(EQty);
	}
//---------------------------------------------------PO History Tab function	
	@FindBy(xpath="//div[@id='po-tabs']//a[text()='PO History']")
	public WebElement PO_History;
	public void ClickonPO_HistoryTab()
	{
		PO_History.click();
	}

//---------------------------------------------------Search function
	@FindBy(xpath="//form[@id='search-po-form']//input[@id='search-po-text']")
	public WebElement GenericSearchbox;
	public void EnterGenericSearchbox(String GSearch)
	{
		
		GenericSearchbox.sendKeys(GSearch);
	}
	@FindBy(xpath="//form[@id='search-po-form']//button[@class='btn qp-adv-searchbtn']")
	public WebElement GenericSearchbtn;
	public void ClickonGenericSearchbtn()
	{
		
		GenericSearchbtn.click();
	}
//---------------------------------------------------Copy From PO  function	
	
	@FindBy(xpath="//div[@id='copy_from_po-container']")
	public WebElement CopyFromPO;
	public void ClickonCopyFromPObtn()
	{
		
		CopyFromPO.click();
	}
	@FindBy(xpath="//div[@class='qp-search-result']//a[text()='37']")    //-----Vpel
	public WebElement PO;
	public void ClickonExistinPO()
	{
		
		PO.click();
	}
	@FindBy(xpath="//div[@class='qp-search-result']//a[text()='PO/2463']")      //-----APQ
	public WebElement POApq;
	public void ClickonExistinPOApq()
	{
		
		POApq.click();
	}
	@FindBy(xpath="//div[@class='qp-search-result']//a[text()='4575_112025_2458']")      //-----Surecontrols
	public WebElement POSurecontrols;
	public void ClickonExistinPOSurecontrols()
	{
		
		POSurecontrols.click();
	}
	@FindBy(xpath="//div[@class='qp-search-result']//a[text()='2011251450']")      //-----Dascan
	public WebElement PODascan;
	public void ClickonExistinPODascan()
	{
		
		PODascan.click();
	}
	@FindBy(xpath="(//input[@class='cell-input val-quantity'])[2]")
	public WebElement POEditQty1;
	public void EnterPOEditQty1(String EQty1)
	{
		POEditQty1.clear();
		POEditQty1.sendKeys(EQty1);
	}
	@FindBy(xpath="//div[@class='qp-search-result']//a[text()='TAS/16973']")      //-----Txautosys
	public WebElement POTxautosys;
	public void ClickonExistinPOTxautosys()
	{
		
		POTxautosys.click();
	}
//-------------------------------------------Trash button Function
	@FindBy(xpath="(//span[@class='file drag-icon ui-draggable'])[2]")
	public WebElement drag2;
	@FindBy(xpath="//div[@id='trash-icon']")
	public WebElement drop2;
	public void DraganddropPO2(WebDriver driver)
	{
		drag2.click();
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(drag2, drop2).build().perform();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOf(drag2));
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.visibilityOf(drop2));
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement DeleteYes;
	public void ClickonDeleteYesbtn()
	{
		
		DeleteYes.click();
	}
//---------------------------------------------------- Create PO APQ

	@FindBy(xpath="//a[text()='Aaron Lehto_v']")
	public WebElement SupplierAPQ;
	public void SelectSupplierAPQ()
	{
		SupplierAPQ.click();
	}
	@FindBy(xpath="//option[text()='Aaron Lehto_v']")
	public WebElement ContactsAPQ;
	public void SelectContactsAPQ()
	{
		ContactsAPQ.click();
	}
	@FindBy(xpath="//a[text()='Line 4 Conveyor Control Panel']")
	public WebElement ProjectAPQ;
	public void SelectProjectAPQ()
	{
		ProjectAPQ.click();
	}
	@FindBy(xpath="(//a[text()='25'])[4]")
	public WebElement ExpDateAPQ;
	public void ClickonPOExpDateAPQ()
	{
		ExpDateAPQ.click();
	}
//--------------------------------------------------Extra Fields APQ
	@FindBy(xpath="//a[@id='po-shipping-address-add']")
	public WebElement SelectAddressAPQ;
	public void ClickonPOSelectAddressAPQbtn()
	{
		SelectAddressAPQ.click();
	}
	@FindBy(xpath="//a[text()='Aaron Lehto_v']")
	public WebElement AddressNameAPQ;
	public void SelectAddressNameAPQ()
	{
		AddressNameAPQ.click();
	}
	@FindBy(xpath="//textarea[@data-extra_field_name='vendor_notes']")
	public WebElement VendorNotes;
	public void EnterVendorNotes()
	{
		
		VendorNotes.sendKeys("PO send successfully");
	}
//---------------------------------------------------------------------------Items Tab Fields	
	@FindBy(xpath="(//a[@data-dropdown='#task-dropdown-576'])[1]")
	public WebElement SelectTask1;
	public void ClickonPOSelectTask1btn()
	{
		SelectTask1.click();
	}
	@FindBy(xpath="//select[@id='projectwise_task']")
	public WebElement Task1;
	public void SelectTask1APQ()
	{
		Select T1 = new Select(Task1);
		T1.selectByVisibleText("G_Panel 1");
	}
	@FindBy(xpath="(//a[@data-dropdown='#task-dropdown-576'])[2]")
	public WebElement SelectTask2;
	public void ClickonPOSelectTask2btn()
	{
		SelectTask2.click();
	}
	@FindBy(xpath="//select[@id='projectwise_task']")
	public WebElement Task2;
	public void SelectTask2APQ()
	{
		Select T2 = new Select(Task2);
		T2.selectByVisibleText("G_Panel 2");
	}
	@FindBy(xpath="(//a[text()='26'])[4]")
	public WebElement DueDateAPQ1;
	public void ClickonPODueDateAPQ1()
	{
		DueDateAPQ1.click();
	}
	@FindBy(xpath="(//a[text()='27'])[4]")
	public WebElement DueDateAPQ2;
	public void ClickonPODueDateAPQ2()
	{
		DueDateAPQ2.click();
	}
	@FindBy(xpath="(//input[@class='cell-input val-extra_info'])[1]")
	public WebElement ExtraNotes1;
	public void EnterExtraNotes1()
	{
		ExtraNotes1.click();
		ExtraNotes1.sendKeys("Extra Notes 1 send");
	}
	@FindBy(xpath="(//input[@class='cell-input val-extra_info'])[2]")
	public WebElement ExtraNotes2;
	public void EnterExtraNotes2()
	{
		ExtraNotes2.click();
		ExtraNotes2.sendKeys("Extra Notes 2 send");
	}
//---------------------------------------------------- Create PO Surecontrols

	@FindBy(xpath="//a[text()='1 No Supplier Info Available']")
	public WebElement SupplierSurecontrol;
	public void SelectSupplierSurecontrol()
	{
		SupplierSurecontrol.click();
	}
	@FindBy(xpath="//option[text()='Aaron Lehto_v']")
	public WebElement ContactsSurecontrol;
	public void SelectSurecontrol()
	{
		ContactsSurecontrol.click();
	}
	@FindBy(xpath="//a[text()='BEMRD_041124TS_SWarren_618 HMI Retrofit']")
	public WebElement ProjectSurecontrol;
	public void SelectProjectSurecontrol()
	{
		ProjectSurecontrol.click();
	}
	@FindBy(xpath="(//a[text()='25'])[4]")
	public WebElement ExpDateSurecontrol;
	public void ClickonPOExpDateSurecontrol()
	{
		ExpDateSurecontrol.click();
	}	
//--------------------------------------------------Extra Fields Surecontrols

	@FindBy(xpath="//a[text()='2 R AUTOMATION']")
	public WebElement AddressNameSurecontrols;
	public void SelectAddressNameSurecontrols()
	{
		AddressNameSurecontrols.click();
	}
	@FindBy(xpath="//input[@data-extra_field_name='vendor_notes']")
	public WebElement VendorNotes1;
	public void EnterVendorNotes1()
	{
			
		VendorNotes1.sendKeys("PO send successfully");
	}	
	@FindBy(xpath="//input[@data-extra_field_name='tax']")
	public WebElement Tax;
	public void EnterTax(String tax)
	{
		Tax.clear();	
		Tax.sendKeys(tax);
	}	
//---------------------------------------------------------------------------Items Tab Fields Surecontrols	
	@FindBy(xpath="(//input[@class='cell-input val-sc_item_number'])[1]")
	public WebElement SCItemNO1;
	public void EnterSCItemNO1()
	{
		SCItemNO1.click();
		SCItemNO1.sendKeys("10");
	}
	@FindBy(xpath="(//input[@class='cell-input val-sc_item_number'])[2]")
	public WebElement SCItemNO2;
	public void EnterSCItemNO2()
	{
		SCItemNO2.click();
		SCItemNO2.sendKeys("20");
	}
//---------------------------------------------------------------- Create PO Dascan	
	@FindBy(xpath="//table[@id='po-info-table']//input[@id='po-po_no']")
	public WebElement PONo;
	public void EnterPONo(String pono)
	{
		PONo.clear();	
		PONo.sendKeys(pono);
	}	
	@FindBy(xpath="//a[text()='123 INK CARTRIDGES INC.']")
	public WebElement SupplierDascan;
	public void SelectSupplierSupplierDascan()
	{
		SupplierDascan.click();
	}
	@FindBy(xpath="//option[text()='Aaron Lehto_v']")
	public WebElement ContactsDascan;
	public void SelectContactsDascan()
	{
		ContactsDascan.click();
	}
	@FindBy(xpath="//a[text()='Doran Road Sewage Pumping Station']")
	public WebElement ProjectDascan;
	public void SelectProjectDascan()
	{
		ProjectDascan.click();
	}
	@FindBy(xpath="(//a[text()='25'])[4]")
	public WebElement ExpDateDascan;
	public void ClickonPOExpDateDascan()
	{
		ExpDateDascan.click();
	}	
//--------------------------------------------------Extra Fields Dascan

	@FindBy(xpath="//a[text()='123 INK CARTRIDGES INC.']")
	public WebElement AddressNameDascan;
	public void SelectAddressNameDascan()
	{
		AddressNameDascan.click();
	}
	@FindBy(xpath="//input[@data-extra_field_name='vendor_quote_no']")
	public WebElement VendorQuote;
	public void EnterVendorQuote()
	{
		VendorQuote.clear();	
		VendorQuote.sendKeys("1525");
	}	
	@FindBy(xpath="//input[@data-extra_field_name='tax']")
	public WebElement Tax1;
	public void EnterTax1(String tax1)
	{
		Tax1.clear();	
		Tax1.sendKeys(tax1);
	}		
//-----------------------------------------------------Items Tab Dascan
	@FindBy(xpath="(//span[@class='file ui-draggable'])[3]")
	public WebElement dragDascan;
	@FindBy(xpath="//tr[@id='po-node-base']")
	public WebElement dropDascan;
	public void DraganddropPODasan(WebDriver driver)
	{
		dragDascan.click();
		Actions act1D = new Actions(driver);
		act1D.dragAndDrop(dragDascan, dropDascan).build().perform();
		WebDriverWait wait1D = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1D.until(ExpectedConditions.visibilityOf(dragDascan));
		WebDriverWait waitD = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitD.until(ExpectedConditions.visibilityOf(dropDascan));
	}
	@FindBy(xpath="(//span[@class='file ui-draggable'])[4]")
	public WebElement dragDascan1;
	@FindBy(xpath="//tr[@id='po-node-base']")
	public WebElement dropDascan1;
	public void DraganddropPODascan1(WebDriver driver)
	{
		dragDascan1.click();
		Actions act2D = new Actions(driver);
		act2D.dragAndDrop(dragDascan1, dropDascan1).build().perform();
		WebDriverWait wait2D = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2D.until(ExpectedConditions.visibilityOf(dragDascan1));
		WebDriverWait wait3D = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3D.until(ExpectedConditions.visibilityOf(dropDascan1));
	}
	@FindBy(xpath="(//a[@data-role='add-btn'])[2]")
	public WebElement SelectTaskDascan;
	public void ClickonPOSelectTaskDascanbtn()
	{
		SelectTaskDascan.click();
	}
	@FindBy(xpath="//select[@id='projectwise_task']")
	public WebElement TaskDasacn1;
	public void SelectTaskDasacn1()
	{
		Select T1Dascan = new Select(TaskDasacn1);
		T1Dascan.selectByVisibleText("Engineering");
	}
	@FindBy(xpath="(//a[@data-role='add-btn'])[4]")
	public WebElement SelectTaskDascan1;
	public void ClickonPOSelectTaskDascan1btn()
	{
		SelectTaskDascan1.click();
	}
	@FindBy(xpath="//select[@id='projectwise_task']")
	public WebElement TaskDasacn2;
	public void SelectTaskDasacn2()
	{
		Select T2Dascan = new Select(TaskDasacn2);
		T2Dascan.selectByVisibleText("SHOP");
	}
//---------------------------------------------------------------- Create PO Txautosys	
	
	@FindBy(xpath="//a[text()='(OLD) Aaron Schaetz']")
	public WebElement SupplierTxautosys;
	public void SelectSupplierTxautosys()
	{
		SupplierTxautosys.click();
	}
	@FindBy(xpath="//option[text()='Aaron Schaetz']")
	public WebElement ContactsTxautosys;
	public void SelectContactsTxautosys()
	{
		ContactsTxautosys.click();
	}
	@FindBy(xpath="//a[text()='W257661/Service Only_Western Midstream Ramsey Field Service (PO 6100011043)']")
	public WebElement ProjectTxautosys;
	public void SelectProjectTxautosys()
	{
		ProjectTxautosys.click();
	}
	@FindBy(xpath="//a[text()='25']")
	public WebElement ExpDateTxautosys;
	public void ClickonPOExpDateTxautosys()
	{
		ExpDateTxautosys.click();
	}		
//--------------------------------------------------Extra Fields Txautosys

	@FindBy(xpath="//a[text()='(OLD) Aaron Schaetz']")
	public WebElement AddressNameTxautosys;
	public void SelectAddressNameTxautosys()
	{
		AddressNameTxautosys.click();
	}
	@FindBy(xpath="//textarea[@data-extra_field_name='po_vendor_notes']")
	public WebElement VendorNoteTxautosys;
	public void EnterVendorNoteTxautosys()
	{
		VendorNoteTxautosys.clear();	
		VendorNoteTxautosys.sendKeys("PO Send For Next Proccedure");
	}	
//-----------------------------------------------------Items Tab Dascan
	
		@FindBy(xpath="//select[@id='projectwise_task']")
		public WebElement TaskTxautosys1;
		public void SelectTaskTxautosys1()
		{
			Select T1Txautosys = new Select(TaskTxautosys1);
			T1Txautosys.selectByVisibleText("Panel #3");
		}
		
		@FindBy(xpath="//select[@id='projectwise_task']")
		public WebElement TaskTxautosys2;
		public void SelectTaskTxautosys2()
		{
			Select T2Txautosys = new Select(TaskTxautosys2);
			T2Txautosys.selectByVisibleText("Panel #4");
		}
		@FindBy(xpath="//a[text()='27']")
		public WebElement DueDateTxautosys1;
		public void ClickonPODueDateTxautosys1()
		{
			DueDateTxautosys1.click();
		}
		@FindBy(xpath="//a[text()='28']")
		public WebElement DueDateTxautosys2;
		public void ClickonPODueDateTxautosys2()
		{
			DueDateTxautosys2.click();
		}
	public Create_PO_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
