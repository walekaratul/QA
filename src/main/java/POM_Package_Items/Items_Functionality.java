package POM_Package_Items;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Items_Functionality {
	WebDriver driver;
	
	@FindBy(xpath="//table[@id='items-tree-table']//a[@class='qp-item-loadmore']")
	public WebElement ShowMoreBtn;
	public void ClickonShowMoreBtnItems()
	{
		ShowMoreBtn.click();
	}
//----------------------------------------------------------------------------------Add New Category Functionality	
	@FindBy(xpath="//span[@class='folder qp-item-folder collapsed ui-draggable']")
	public WebElement Base;
	public void ClickonBaseFolderItems()
	{
		Base.click();
	}
	@FindBy(xpath="//span[@title='Add New Category']")
	public WebElement AddNewCategory;
	public void ClickonAddNewCategoryIconItems()
	{
		AddNewCategory.click();
	}
	@FindBy(xpath="//tr[@id='new-new-category1']//span[@class='qp-checkmark']")
	public WebElement NewFolderCheckbox;
	public void ClickonNewFolderCheckboxItems()
	{
		NewFolderCheckbox.click();
	}
	@FindBy(xpath="(//i[@title='Edit'])[1]")
	public WebElement EditIcon;
	public void ClickonEditIconItems()
	{
		EditIcon.click();
	}
	@FindBy(xpath="//input[@value='New Folder 1']")
	public WebElement FolderName;
	public void ClickonFolderNameBoxItems(String FName) throws InterruptedException
	{
		FolderName.click();
		Thread.sleep(1000);
		FolderName.clear();
		Thread.sleep(1000);
		FolderName.sendKeys(FName);
		
	}
	@FindBy(xpath="//button[@id='category-save-btn']")
	public WebElement SaveCategory;
	public void ClickonSaveCategorybtnItems()
	{
		SaveCategory.click();
	}
	@FindBy(xpath="//button[@id='category-close-btn']")
	public WebElement CloseCategory;
	public void ClickonCloseCategorybtnItems()
	{
		CloseCategory.click();
	}
//-------------------------------------------------------Add New Folder Functionality	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[2]")
	public WebElement CategoryCheckbox;
	public void ClickonCategoryCheckboxItems()
	{
		CategoryCheckbox.click();
	}
	@FindBy(xpath="(//span[@title='Add New Folder'])[1]")
	public WebElement NewFolderIcon;
	public void ClickonNewFolderIconItems()
	{
		NewFolderIcon.click();
	}
	@FindBy(xpath="//tr[@id='new-new-category1']//span[@class='qp-checkmark']")
	public WebElement NewFolder2;
	public void ClickonNewFolder2checkboxItems()
	{
		NewFolder2.click();
	}
	@FindBy(xpath="(//i[@title='Edit'])[2]")
	public WebElement FolderEditicon;
	public void ClickonFolderEditiconItems()
	{
		FolderEditicon.click();
	}
	@FindBy(xpath="//input[@value='New Folder 1']")
	public WebElement FolderName1;
	public void ClickonFolderName1BoxItems(String FName1) throws InterruptedException
	{
		FolderName1.click();
		Thread.sleep(1000);
		FolderName1.clear();
		Thread.sleep(1000);
		FolderName1.sendKeys(FName1);
		
	}
//-------------------------------------------------------Create Item Functionality	
	@FindBy(xpath="(//a[@title='Expand/Collapse'])[2]")
	public WebElement ExpandArrow;
	public void ClickonExpandArrowItems()
	{
		ExpandArrow.click();
	}
	@FindBy(xpath="(//span[@class='qp-checkmark'])[3]")
	public WebElement FolderCheckbox1;
	public void ClickonFolderCheckbox1Items()
	{
		FolderCheckbox1.click();
	}
	@FindBy(xpath="(//span[@id='new-item-span'])[2]")
	public WebElement ItemEditIcon;
	public void ClickonItemEditIconItems()
	{
		ItemEditIcon.click();
	}
	@FindBy(xpath="(//span[@class='qp-checkmark'])[4]")
	public WebElement ItemCheckbox1;
	public void ClickonItemCheckbox1Items()
	{
		ItemCheckbox1.click();
	}
	@FindBy(xpath="(//i[@title='Edit'])[3]")
	public WebElement ItemEditPencilIcon1;
	public void ClickonItemEditPencilIcon1Items()
	{
		ItemEditPencilIcon1.click();
	}
	@FindBy(xpath="//textarea[@data-field-name='description']")
	public WebElement Description;
	public void ClickonDescriptionBoxItems(String FName2) throws InterruptedException
	{
		Description.click();
		Thread.sleep(1000);
		Description.clear();
		Thread.sleep(1000);
		Description.sendKeys(FName2);
		
	}
	@FindBy(xpath="//textarea[@data-field-name='long_description']")
	public WebElement LongDescription;
	public void ClickonLongDescriptionBoxItems(String FName3) throws InterruptedException
	{
		LongDescription.click();
		Thread.sleep(1000);
		LongDescription.clear();
		Thread.sleep(1000);
		LongDescription.sendKeys(FName3);
		
	}
	@FindBy(xpath="//input[@id='item_catalog_no']")
	public WebElement Catlog_No;
	public void ClickonCatlog_NoBoxItems(String FName4) throws InterruptedException
	{
		Catlog_No.click();
		Thread.sleep(1000);
		Catlog_No.clear();
		Thread.sleep(1000);
		Catlog_No.sendKeys(FName4);
		
	}
	@FindBy(xpath="//div[@id='item-info-tab-description']//input[@data-field-name='make']")
	public WebElement Make;
	public void ClickonMakeboxItems()
	{
		Make.click();
	}
	@FindBy(xpath="//a[text()='Automation Direct']")
	public WebElement SelectMake;
	public void ClickonSelectMakeItems()
	{
		SelectMake.click();
	}
	@FindBy(xpath="//input[@id='item_upc']")
	public WebElement UPC;
	public void ClickonUPCBoxItems(String FName5) throws InterruptedException
	{
		UPC.click();
		Thread.sleep(1000);
		UPC.clear();
		Thread.sleep(1000);
		UPC.sendKeys(FName5);
		
	}
	@FindBy(xpath="//input[@id='item_gtin']")
	public WebElement GTIN;
	public void ClickonGTINBoxItems(String FName6) throws InterruptedException
	{
		GTIN.click();
		Thread.sleep(1000);
		GTIN.sendKeys(FName6);
		
	}
	@FindBy(xpath="//input[@id='item_your_part_number']")
	public WebElement PartNumber;
	public void ClickonPartNumberBoxItems(String FName7) throws InterruptedException
	{
		PartNumber.click();
		Thread.sleep(1000);
		PartNumber.clear();
		Thread.sleep(1000);
		PartNumber.sendKeys(FName7);
		
	}
	@FindBy(xpath="//input[@id='item_order_number']")
	public WebElement OrderNumber;
	public void ClickonOrderNumberBoxItems(String FName8) throws InterruptedException
	{
		OrderNumber.click();
		Thread.sleep(1000);
		OrderNumber.clear();
		Thread.sleep(1000);
		OrderNumber.sendKeys(FName8);
		
	}
	@FindBy(xpath="//button[@id='btn-save-im']")
	public WebElement SaveItembtn;
	public void ClickonSavebtnItems()
	{
		SaveItembtn.click();
	}
	@FindBy(xpath="//button[@data-role='button-close']")
	public WebElement CloseItembtn;
	public void ClickonCloseItembtn()
	{
		CloseItembtn.click();
	}
//-------------------------------------------------------------------------------------Price_Tab_functionlity
	@FindBy(xpath="(//a[@title='Expand/Collapse'])[3]")
	public WebElement FolderExpandArrow;
	public void ClickonFolderExpandArrowItems()
	{
		FolderExpandArrow.click();
	}
	@FindBy(xpath="//td[@class='description-cell']//span[@class='qp-checkmark']")
	public WebElement ItemCheckbox2;
	public void ClickonItemCheckbox2Items()
	{
		ItemCheckbox2.click();
	}
	@FindBy(xpath="//span[@title='Item For Automation Testing APQ Engineering']")
	public WebElement Itemname;
	public void ClickonItemnameItems()
	{
		Itemname.click();
	}
	@FindBy(xpath="//td[@class='description-cell']//i[@title='Edit']")
	public WebElement ItemEditPencilIcon2;
	public void ClickonItemEditPencilIcon2Items()
	{
		ItemEditPencilIcon2.click();
	}
	@FindBy(xpath="//button[@id='btn-edit-im']")
	public WebElement EditItembtn;
	public void ClickonEditItembtn()
	{
		EditItembtn.click();
	}
	@FindBy(xpath="//li[@aria-controls='item-info-tab-prices']")
	public WebElement PricesTab;
	public void ClickonPricesTab()
	{
		PricesTab.click();
	}
	@FindBy(xpath="//input[@data-field-name='price']")
	public WebElement ListPrice;
	public void EnteronListPriceBoxItems() throws InterruptedException
	{
		ListPrice.click();
		Thread.sleep(1000);
		ListPrice.clear();
		Thread.sleep(1000);
		ListPrice.sendKeys("800");	
	}
	@FindBy(xpath="//input[@data-field-name='price_effective_from']")
	public WebElement LPEFrom;
	public void ClickonLPEFromboxItem()
	{
		LPEFrom.click();
	}
	@FindBy(xpath="(//a[text()='10'])[4]")
	public WebElement DateFrom;
	public void ClickonDateFromItem()
	{
		DateFrom.click();
	}
	@FindBy(xpath="//input[@data-field-name='price_effective_to']")
	public WebElement LPETo;
	public void ClickonLPEToItem()
	{
		LPETo.click();
	}
	@FindBy(xpath="(//a[text()='25'])[4]")
	public WebElement DateTo;
	public void ClickonDateToItem()
	{
		DateTo.click();
	}
	@FindBy(xpath="//input[@data-field-name='multiplier_factor']")
	public WebElement MulitplierFactor;
	public void EnteronMulitplierFactorBoxItems() throws InterruptedException
	{
		MulitplierFactor.click();
		Thread.sleep(1000);
		MulitplierFactor.clear();
		Thread.sleep(1000);
		MulitplierFactor.sendKeys("0.75");	
	}
	@FindBy(xpath="//input[@data-field-name='discount_code']")
	public WebElement DiscCode;
	public void ClickonDiscCodeBox()
	{
		DiscCode.click();
	}
	@FindBy(xpath="//a[text()='A6/711']")
	public WebElement DiscCode1;
	public void ClickonDiscCodeItem()
	{
		DiscCode1.click();
	}
	@FindBy(xpath="//input[@data-field-name='multiplier']")
	public WebElement Mulitplier;
	public void EnteronMulitplierBoxItems() throws InterruptedException
	{
		Mulitplier.click();
		Thread.sleep(1000);
		Mulitplier.sendKeys("1.5");	
	}
	@FindBy(xpath="//input[@data-field-name='discounted_price_effective_from']")
	public WebElement DPEFrom;
	public void ClickonDPEFromboxItem()
	{
		DPEFrom.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthDPEFrom;
	public void SelectMonthDPEFromItem(String month)
	{
		Select DP = new Select(SelectMonthDPEFrom);
		DP.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDPEFrom;
	public void SelectYearDPEFromItem()
	{
		Select DP1 = new Select(SelectYearDPEFrom);
		DP1.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement DPEFromDay;
	public void ClickonDPEFromDayItem()
	{
		DPEFromDay.click();
	}
	@FindBy(xpath="//input[@data-field-name='discounted_price_effective_to']")
	public WebElement DPETo;
	public void ClickonDPEToboxItem()
	{
		DPETo.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonthDPETo;
	public void SelectMonthDPEToItem(String month)
	{
		Select DP2 = new Select(SelectMonthDPETo);
		DP2.selectByVisibleText(month);
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYearDPETo;
	public void SelectYearDPEToItem()
	{
		Select DP3 = new Select(SelectYearDPETo);
		DP3.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='1'])[4]")
	public WebElement DPEToDay;
	public void ClickonDPEToDayItem()
	{
		DPEToDay.click();
	}
	@FindBy(xpath="//input[@data-field-name='preferred_vendor_name']")
	public WebElement PreferredVendor;
	public void ClickonPreferredVendorBox()
	{
		PreferredVendor.click();
	}
	@FindBy(xpath="//a[@data-vendor='8100 Interest Earned']")
	public WebElement PVendor;
	public void ClickonPVendorItem()
	{
		PVendor.click();
	}
	@FindBy(xpath="//input[@data-field-name='preferred_vendor_name_2']")
	public WebElement PreferredVendor1;
	public void ClickonPreferredVendor1Box()
	{
		PreferredVendor1.click();
	}
	@FindBy(xpath="//a[@data-vendor='11x17 Inc.']")
	public WebElement PVendor1;
	public void ClickonPVendor1Item()
	{
		PVendor1.click();
	}
	@FindBy(xpath="//li[@aria-controls='item-info-tab-labor']")
	public WebElement LaborDetailsTab;
	public void ClickonLaborDetailsTab()
	{
		LaborDetailsTab.click();
	}
	@FindBy(xpath="//input[@data-field-name='item_labor_mapping-category']")
	public WebElement ItemCategoryBox;
	public void ClickonItemCategoryBoxItem()
	{
		ItemCategoryBox.click();
	}
	@FindBy(xpath="//a[text()='Generic']")
	public WebElement SelectCategory;
	public void ClickonSelectCategoryItem()
	{
		SelectCategory.click();
	}
//-------------------------------------------------------------------------Comments_Tab_functionlity
	@FindBy(xpath="//li[@aria-controls='item-info-tab-comments']")
	public WebElement CommentsTab;
	public void ClickonCommentsTabItem()
	{
		CommentsTab.click();
	}
	@FindBy(xpath="//select[@data-extra_field_name='lead_time']")
	public WebElement LeadTime;
	public void SelectLeadTimeItem() throws InterruptedException
	{
		Select LT = new Select(LeadTime);
		LT.selectByVisibleText("14");
	}
	@FindBy(xpath="//textarea[@data-extra_field_name='comment1']")
	public WebElement Comments1;
	public void EnteronComments1boxItem()
	{
		Comments1.clear();
		Comments1.sendKeys("Comment from Atul Walekar for comments1 Box");
	}
	@FindBy(xpath="//input[@data-extra_field_name='comment2']")
	public WebElement Comments2;
	public void EnteronComments2boxItem()
	{
		Comments2.clear();
		Comments2.sendKeys("Comment from Atul Walekar for comments2 Box");
	}
//------------------------------------------------------------------------Inventory_Tab_functionlity	
	@FindBy(xpath="//li[@aria-controls='item-info-tab-stock']")
	public WebElement InventoryTab;
	public void ClickonInventoryTabItem()
	{
		InventoryTab.click();
	}
	@FindBy(xpath="//input[@data-field-name='generic_col3']")
	public WebElement MinOrderQty;
	public void EnteronMinOrderQtyboxItem()
	{
		MinOrderQty.sendKeys("500");
	}
	@FindBy(xpath="//input[@data-field-name='min_qty']")
	public WebElement MinQty;
	public void EnteronMinQtyBoxItems() throws InterruptedException
	{
		MinQty.click();
		Thread.sleep(1000);
		MinQty.clear();
		Thread.sleep(1000);
		MinQty.sendKeys("400");	
	}
	@FindBy(xpath="//input[@data-field-name='max_qty']")
	public WebElement MaxQty;
	public void EnteronMaxQtyBoxItems() throws InterruptedException
	{
		MaxQty.click();
		Thread.sleep(1000);
		MaxQty.clear();
		Thread.sleep(1000);
		MaxQty.sendKeys("500");	
	}
	@FindBy(xpath="//input[@data-field-name='package_qty']")
	public WebElement PackageQty;
	public void EnteronPackageQtyBoxItems() throws InterruptedException
	{
		PackageQty.click();
		Thread.sleep(1000);
		PackageQty.clear();
		Thread.sleep(1000);
		PackageQty.sendKeys("100");	
	}
	@FindBy(xpath="//input[@data-field-name='quantity_divisor']")
	public WebElement QuantityDevisor;
	public void EnteronQuantityDevisorBoxItems() throws InterruptedException
	{
		QuantityDevisor.click();
		Thread.sleep(1000);
		QuantityDevisor.clear();
		Thread.sleep(1000);
		QuantityDevisor.sendKeys("2");	
	}
	@FindBy(xpath="//input[@data-field-name='bin_no']")
	public WebElement BinNo;
	public void EnteronBinNoBoxItems() throws InterruptedException
	{
	
		BinNo.sendKeys("BINNO987");	
	}
//---------------------------------------------------------------------Assembly_List_functionality	
	@FindBy(xpath="//tr[@id='category_60068526']//a[@title='Expand/Collapse']")
	public WebElement ExpandFolderArrow;
	public void ClickonExpandFolderArrowItems()
	{
		ExpandFolderArrow.click();
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[1]")
	public WebElement itemdoubleclick;
	public void ClickonitemdoubleclickItems(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick(itemdoubleclick).build().perform();
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[1]")
	public WebElement drag;
	@FindBy(xpath="//tr[@title='Drop Items Here.']")
	public WebElement drop;
	public void DraganddropItem(WebDriver driver)
	{
		drag.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag, drop).build().perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(drag));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drop));
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[2]")
	public WebElement drag2;
	@FindBy(xpath="//tr[@title='Drop Items Here.']")
	public WebElement drop2;
	public void DraganddropItem2(WebDriver driver)
	{
		drag2.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag2, drop2).build().perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(drag2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drop2));
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[3]")
	public WebElement drag3;
	@FindBy(xpath="//tr[@title='Drop Items Here.']")
	public WebElement drop3;
	public void DraganddropItem3(WebDriver driver)
	{
		drag3.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag3, drop3).build().perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(drag3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drop3));
	}
//---------------------------------------------------------------------Accessories_functionality
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[2]")
	public WebElement drag4;
	@FindBy(xpath="//tr[@id='accessory-node-base']")
	public WebElement drop4;
	public void DraganddropItem4(WebDriver driver)
	{
		drag4.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag4, drop4).build().perform();
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOf(drag4));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(drop4));
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[3]")
	public WebElement drag5;
	@FindBy(xpath="//tr[@id='accessory-node-base']")
	public WebElement drop5;
	public void DraganddropItem5(WebDriver driver)
	{
		drag5.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag5, drop5).build().perform();
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOf(drag5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(drop5));
	}
//---------------------------------------------------------------------CrossReference_functionality	
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[2]")
	public WebElement drag6;
	@FindBy(xpath="//tr[@id='replacement-node-base']")
	public WebElement drop6;
	public void DraganddropItem6(WebDriver driver)
	{
		drag6.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag6, drop6).build().perform();
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOf(drag4));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(drop4));
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[3]")
	public WebElement drag7;
	@FindBy(xpath="//tr[@id='replacement-node-base']")
	public WebElement drop7;
	public void DraganddropItem7(WebDriver driver)
	{
		drag7.click();
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag7, drop7).build().perform();
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOf(drag5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(drop5));
	}
	
//---------------------------------------------------------------------Maximize and Minimize functionality
	@FindBy(xpath="//button[text()='Maximize']")
	public WebElement MiximizeBtn;
	public void ClickonMiximizeBtnItems()
	{
		MiximizeBtn.click();
	}
	@FindBy(xpath="//button[text()='Minimize']")
	public WebElement MinimizeBtn;
	public void ClickonMinimizeBtnItems()
	{
		MinimizeBtn.click();
	}
	@FindBy(xpath="//a[text()='Accessories ']")
	public WebElement AccessoriesTab;
	public void ClickonAccessoriesTabItems()
	{
		AccessoriesTab.click();
	}
	@FindBy(xpath="//a[text()='Cross Reference ']")
	public WebElement CrossReferenceTab;
	public void ClickonCrossReferenceTabItems()
	{
		CrossReferenceTab.click();
	}
//---------------------------------------------------------------------------Edit_functionality_For_User_Created_Item	
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[3]")
	public WebElement itemdoubleclick1;
	public void Clickonitemdoubleclick1Items(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick(itemdoubleclick1).build().perform();
	}
//---------------------------------------------------------------------------Create Make Functionality	
	@FindBy(xpath="//div[@id='item-info-tab-description']//input[@data-field-name='make']")
	public WebElement Make1;
	public void ClickonMake1boxItems()
	{
		Make.click();
	}
	@FindBy(xpath="//form[@id='make-select-form']//a[text()=' New']")
	public WebElement MakeNew;
	public void ClickonMakeNewbtnItems()
	{
		MakeNew.click();
	}
	@FindBy(xpath="//input[@id='make_popup_dialog_make_name']")
	public WebElement NewMake1;
	public void EnterNewMake1Items()
	{
		NewMake1.sendKeys("Atul Automation Testing");
	}
	@FindBy(xpath="//textarea[@id='make_popup_dialog_make_address']")
	public WebElement NewMakeAddress;
	public void EnterNewMakeAddressItems()
	{
		NewMakeAddress.sendKeys("Make Created By Atul Walekar");
	}
	@FindBy(xpath="(//span[text()='Save Make'])[1]")
	public WebElement NewMakeSave;
	public void ClickonNewMakeSavebtnItems()
	{
		NewMakeSave.click();
	}
	@FindBy(xpath="//a[text()='Atul Automation']")
	public WebElement SelectMake1;
	public void ClickonSelectMake1Items()
	{
		SelectMake.click();
	}
//---------------------------------------------------------------------------Edit Make Functionality	
	
	@FindBy(xpath="//i[@title='Configuration']")
	public WebElement Configuration;
	public void ClickonConfiguration()
	{
		Configuration.click();
	}
	@FindBy(xpath="//a[text()=' Item']")
	public WebElement ItemsConfig;
	public void ClickonItemsConfig(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ItemsConfig).perform();
	}
	@FindBy(xpath="//ul[@role='menu']//a[@id='view-config-item_modify_make-link']")
	public WebElement ModifyMake;
	public void ClickonModifyMake()
	{
		ModifyMake.click();
	}
	@FindBy(xpath="//form[@id='item_modify_make']//input[@class='edit editbox-medium form-control textboxfordropdown']")
	public WebElement ExistingMakeBox;
	public void ClickonExistingMakeBox()
	{
		ExistingMakeBox.click();
	}
	@FindBy(xpath="//a[text()='Automation Testing 123']")
	public WebElement ExistingMake;
	public void ClickonExistingMake()
	{
		ExistingMake.click();
	}
	@FindBy(xpath="//form[@id='item_modify_make']//input[@id='new_make']")
	public WebElement NewMakeBox;
	public void EnterNewMakeBox()
	{
		NewMakeBox.sendKeys("ABB123");
	}
	@FindBy(xpath="//form[@id='item_modify_make']//button[@title='OK']")
	public WebElement Okbutton;
	public void ClickonOkbuttonMake()
	{
		Okbutton.click();
	}
	@FindBy(xpath="//div[@aria-describedby='alert2_success']//span[text()='OK']")
	public WebElement AlertOkbutton;
	public void ClickonAlertOkbuttonMake()
	{
		AlertOkbutton.click();//button[text()=' Move']
	}
//----------------------------------------------------------------------------Move_Item_functionality
	@FindBy(xpath="(//span[@class='qp-checkmark'])[8]")
	public WebElement ItemCheckboxMove;
	public void ClickonItemCheckboxMoveItems()
	{
		ItemCheckboxMove.click();
	}
	@FindBy(xpath="//button[text()=' Move']")
	public WebElement MoveBtn;
	public void ClickonMoveBtnItems()
	{
		MoveBtn.click();
	}
	@FindBy(xpath="(//table[@id='items_moveoperation-tree-table']//a[@title='Expand/Collapse'])[2]")
	public WebElement ExpandCategoryArrowMove;
	public void ClickonExpandCategoryArrowMoveItems()
	{
		ExpandCategoryArrowMove.click();
	}
	@FindBy(xpath="(//table[@id='items_moveoperation-tree-table']//span[@class='qp-checkmark'])[3]")
	public WebElement FolderCheckboxMove;
	public void ClickonFolderCheckboxMoveItems()
	{
		FolderCheckboxMove.click();
	}
	@FindBy(xpath="//span[text()='Move']")
	public WebElement MoveBtn1;
	public void ClickonMoveBtn1Items()
	{
		MoveBtn1.click();
	}
//----------------------------------------------------------------------------Copy_Item_functionality	
	@FindBy(xpath="(//span[@class='qp-checkmark'])[7]")
	public WebElement ItemCheckboxcopy;
	public void ClickonItemCheckboxcopyItems()
	{
		ItemCheckboxcopy.click();
	}
	@FindBy(xpath="//button[text()=' Copy']")
	public WebElement CopyBtn;
	public void ClickonCopyBtnItems()
	{
		CopyBtn.click();
	}
	@FindBy(xpath="(//table[@id='items_copyoperation-tree-table']//a[@title='Expand/Collapse'])[2]")
	public WebElement ExpandCategoryArrowCopy;
	public void ClickonExpandCategoryArrowCopyItems()
	{
		ExpandCategoryArrowCopy.click();
	}
	@FindBy(xpath="(//table[@id='items_copyoperation-tree-table']//span[@class='qp-checkmark'])[3]")
	public WebElement FolderCheckboxCopy;
	public void ClickonFolderCheckboxCopyItems()
	{
		FolderCheckboxCopy.click();
	}
	@FindBy(xpath="//span[text()='Copy']")
	public WebElement CopyBtn1;
	public void ClickonCopyBtn1Items()
	{
		CopyBtn1.click();
	}
//------------------------------------------------------------------------Export to QBo Tab functionality	
	@FindBy(xpath="//a[text()='Export to QBo']")
	public WebElement ExporttoQBoTab;
	public void ClickonExporttoQBoTabItems()
	{
		ExporttoQBoTab.click();
	}
	@FindBy(xpath="//select[@id='qb_online_item_type']")
	public WebElement ItemType;
	public void SelectItemTypeDropdownItems(String itemtype) throws InterruptedException
	{
		Select IT = new Select(ItemType);
		IT.selectByVisibleText(itemtype);
		Thread.sleep(1000);
	}
	@FindBy(xpath="//div[@aria-describedby='information_msg']//span[text()='OK']")
	public WebElement ItemTypeInformationOk;
	public void ClickonItemTypeInformationOkBtnItems() throws InterruptedException
	{
		
		try
		{
			ItemTypeInformationOk.click();
			System.out.println("message showing : Once item is set to inventory type then it can not be changed to other item types in QuickBooks");
		}
		catch(Exception e)
		{
			System.out.println("Alert Message not present");
		}
		Thread.sleep(1000);
	}
	@FindBy(xpath="//select[@class='edit qboTaxCode select2-hidden-accessible']")
	public WebElement TaxCode;
	public void SelectTaxCodeDropdownItems(String taxcode) throws InterruptedException
	{
		Select TC = new Select(TaxCode);
		TC.selectByVisibleText(taxcode);
		Thread.sleep(1000);
	}
	@FindBy(xpath="//select[@class='qb_online_cogs_account accounts_options form-control edit TestClass select2-hidden-accessible']")
	public WebElement COGSAc;
	public void SelectcogsacDropdownItems(String cogsac) throws InterruptedException
	{
		Select CAC = new Select(COGSAc);
		CAC.selectByVisibleText(cogsac);
		Thread.sleep(1000);
	}
	@FindBy(xpath="//select[@class='qb_online_income_account accounts_options form-control edit TestClass select2-hidden-accessible']")
	public WebElement IncomeAc;
	public void SelectIncomeAcDropdownItems(String incomeac) throws InterruptedException
	{
		Select IAC = new Select(IncomeAc);
		IAC.selectByVisibleText(incomeac);
		Thread.sleep(1000);
	}
	@FindBy(xpath="//select[@class='qb_online_assets_account accounts_options form-control edit TestClass select2-hidden-accessible']")
	public WebElement AstExpAc;
	public void SelectAstExpAcDropdownItems(String aeac) throws InterruptedException
	{
		Select AEAC = new Select(AstExpAc);
		AEAC.selectByVisibleText(aeac);
		Thread.sleep(1000);
	}
	@FindBy(xpath="//button[@id='export-to-quickbooks-online-button']")
	public WebElement ExporttoQBoBtn;
	public void ClickonExporttoQBoBtnItems()
	{
		ExporttoQBoBtn.click();
	}
//------------------------------------------------------------------------Download Items functionality	
	@FindBy(xpath="//a[text()=' Download Items']")
	public WebElement DownloadItems;
	public void ClickonDownloadItems()
	{
		DownloadItems.click();
	}
	@FindBy(xpath="//form[@id='report-search']//button[@class='btn qp-adv-searchbtn']")
	public WebElement DownloadItemsSearchBtn;
	public void ClickonDownloadItemsSearchBtn()
	{
		DownloadItemsSearchBtn.click();
	}
	@FindBy(xpath="//form[@id='report-search']//a[text()='Export']")
	public WebElement ExportBtnDownloadItems;
	public void ClickonExportBtnDownloadItems()
	{
		ExportBtnDownloadItems.click();
	}
	@FindBy(xpath="//ul[@id='SPAreportdownloadurls']")
	public WebElement DownloadItemsLink;
	public void ClickonDownloadItemsLink()
	{
		DownloadItemsLink.click();
	}
//---------------------------------------------------------------------INFO_Tab_functionality	
	@FindBy(xpath="//tr[@id='category_60068527']//a[@title='Expand/Collapse']")
	public WebElement ExpandFolderArrowItemHistory;
	public void ClickonExpandFolderArrowItemHistoryItems()
	{
		ExpandFolderArrowItemHistory.click();
	}
	@FindBy(xpath="(//span[@class='drag-icon file ui-draggable'])[1]")
	public WebElement itemdoubleclickItemHistory;
	public void ClickonitemdoubleclickItemHistoryItems(WebDriver driver)
	{
		Actions IH = new Actions(driver);
		IH.doubleClick(itemdoubleclickItemHistory).build().perform();
	}
	@FindBy(xpath="//a[@id='item-details-link']")
	public WebElement ItemHistoryBtn;
	public void ClickonItemHistoryBtnItems()
	{
		ItemHistoryBtn.click();
	}
//---------------------------------------------------------------------ITEM_STOCK_Tab_functionality		
	@FindBy(xpath="//a[text()='Item Stock']")
	public WebElement ItemStockTab;
	public void ClickonItemStockTabItems()
	{
		ItemStockTab.click();
	}
//---------------------------------------------------------------------ITEM_HISTORY_Tab_functionality	
	@FindBy(xpath="//a[text()='Item History']")
	public WebElement ItemHistoryTab;
	public void ClickonItemHistoryTabItems()
	{
		ItemHistoryTab.click();
	}
//---------------------------------------------------------------------ITEM_HISTORY_MODULEWISE_Tab_functionality	
	@FindBy(xpath="//a[text()='Item History Modulewise ']")
	public WebElement ItemHistoryModulewiseTab;
	public void ClickonItemHistoryModulewiseTabItems()
	{
		ItemHistoryModulewiseTab.click();
	}
	@FindBy(xpath="//div[@id='item-history-Modulewise']//a[text()='PR ']")
	public WebElement ItemHistoryModulewisePRTab;
	public void ClickonItemHistoryModulewisePRTabItems() throws InterruptedException
	{
		ItemHistoryModulewisePRTab.click();
		Thread.sleep(1000);
		ItemHistoryModulewisePRTab.click();
	}
	@FindBy(xpath="//div[@id='item-history-Modulewise']//a[text()='PO ']")
	public WebElement ItemHistoryModulewisePOTab;
	public void ClickonItemHistoryModulewisePOTabItems() throws InterruptedException
	{
		ItemHistoryModulewisePOTab.click();
		Thread.sleep(1000);
		ItemHistoryModulewisePOTab.click();
	}
	@FindBy(xpath="//div[@id='item-history-Modulewise']//a[text()='GRN ']")
	public WebElement ItemHistoryModulewiseGRNTab;
	public void ClickonItemHistoryModulewiseGRNTabItems() throws InterruptedException
	{
		ItemHistoryModulewiseGRNTab.click();
		Thread.sleep(1000);
		ItemHistoryModulewiseGRNTab.click();
	}
	@FindBy(xpath="//div[@id='item-history-Modulewise']//a[text()='MR ']")
	public WebElement ItemHistoryModulewiseMRTab;
	public void ClickonItemHistoryModulewiseMRTabItems() throws InterruptedException
	{
		ItemHistoryModulewiseMRTab.click();
		Thread.sleep(1000);
		ItemHistoryModulewiseMRTab.click();
	}
//---------------------------------------------------------------------PROJECT_ACTIVITY_Tab_functionality	
	@FindBy(xpath="//a[@id='project_activity_id']")
	public WebElement ProjectActivityTab;
	public void ClickonProjectActivityTabItems()
	{
		ProjectActivityTab.click();
	}	
//---------------------------------------------------------------------INWARD_OUTWARD_Tab_functionality	
	@FindBy(xpath="//a[@id='inward_outward_id']")
	public WebElement InwardOutwardTab;
	public void ClickonInwardOutwardTabItems()
	{
		InwardOutwardTab.click();
	}	
	public Items_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
