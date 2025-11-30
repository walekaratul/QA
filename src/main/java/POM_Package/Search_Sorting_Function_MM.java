package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Sorting_Function_MM {
	
	
	@FindBy(xpath="//input[@id='material_management_search_text']")
	public WebElement SearchBox;
	public void EnterSearchBoxMM(String value)
	{
		SearchBox.sendKeys(value);
	}
	@FindBy(xpath="//form[@id='material_management_search']//button[@id='search-project-btn']")
	public WebElement SearchBtn;
	public void ClickonSearchBtnMM()
	{
		SearchBtn.click();
	}
//----------------------------------------------------------------------------------------------------Advanced Search By Description	
	@FindBy(xpath="//div[@data-dropdown='#item-description-adv-search-dropdown'='qp-advsearch-icon']")
	public WebElement Searchicon;
	public void ClickonDescriptionSearchiconMM()
	{
		Searchicon.click();
	}
	@FindBy(xpath="//div[@id='item-description-adv-search-dropdown']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement Equlas;
	public void SelectEqulasDropdownMM()
	{
		Select equal = new Select(Equlas);
		equal.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='item-description-adv-search-field']")
	public WebElement DescriptionBox;
	public void EnterDescriptionBoxMM(String description)
	{
		DescriptionBox.sendKeys(description);
	}
	@FindBy(xpath="//div[@id='item-description-adv-search-dropdown']//a[text()='Filter']")
	public WebElement Filter;
	public void ClickonFilterBtnMM()
	{
		Filter.click();
	}
	@FindBy(xpath="//div[@id='item-description-adv-search-dropdown']//a[text()='Clear']")
	public WebElement Clear;
	public void ClickonClearBtnMM()
	{
		Clear.click();
	}
//----------------------------------------------------------------------------------------------------Advanced Search By Catlog No		
	@FindBy(xpath="//div[@data-dropdown='#item-catalog-no-adv-search-dropdown']")
	public WebElement Searchicon1;
	public void ClickonCatlogNoSearchiconMM()
	{
		Searchicon1.click();
	}
	@FindBy(xpath="//div[@id='item-catalog-no-adv-search-dropdown']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement EqulasCNO;
	public void SelectEqulasCNODropdownMM()
	{
		Select equal1 = new Select(EqulasCNO);
		equal1.selectByVisibleText("Equal");
	}
	@FindBy(xpath="//input[@id='item-catalog-no-adv-search-field']")
	public WebElement CatlogNoBox;
	public void EnterCatlogNoBoxMM(String CNO)
	{
		CatlogNoBox.sendKeys(CNO);
	}
	@FindBy(xpath="//div[@id='item-catalog-no-adv-search-dropdown']//a[text()='Filter']")
	public WebElement FilterCNo;
	public void ClickonFilterCNoBtnMM()
	{
		FilterCNo.click();
	}
	@FindBy(xpath="//div[@id='item-catalog-no-adv-search-dropdown']//a[text()='Clear']")
	public WebElement ClearCNo;
	public void ClickonClearCNoBtnMM()
	{
		ClearCNo.click();//input[@data-id='Panduit']
	}
//----------------------------------------------------------------------------------------------------Advanced Search By Make
	@FindBy(xpath="//div[@data-dropdown='#item-make-search-dropdown']")
	public WebElement Searchicon2;
	public void ClickonMakeSearchiconMM()
	{
		Searchicon2.click();
	}

	@FindBy(xpath="//input[@data-id='JST Sales America Inc.']")
	public WebElement MakeCheckBox;
	public void ClickonMakeCheckBoxMM()
	{
		MakeCheckBox.click();
	}
	@FindBy(xpath="//div[@id='item-make-search-dropdown']//a[text()='Filter']")
	public WebElement FilterMake;
	public void ClickonFilterMakeBtnMM()
	{
		FilterMake.click();
	}
	@FindBy(xpath="//div[@id='item-make-search-dropdown']//a[text()='Clear']")
	public WebElement ClearMake;
	public void ClickonClearMakeBtnMM()
	{
		ClearMake.click();
	}
//--------------------------------------------------------------------Advanced Search By Stock Qty	
	@FindBy(xpath="//div[@data-dropdown='#project-no-mm-column-advsearch-dropdown']")
	public WebElement Searchicon3;
	public void ClickonStockQtySearchiconMM()
	{
		Searchicon3.click();
	}
	@FindBy(xpath="//input[@id='project-no-mm-adv-search-field']")
	public WebElement StockQtyNoBox;
	public void EnterStockQtyBoxMM(String StockQty)
	{
		StockQtyNoBox.sendKeys(StockQty);
	}
	@FindBy(xpath="//div[@id='project-no-mm-column-advsearch-dropdown']//a[text()='Filter']")
	public WebElement FilterStockQty;
	public void ClickonFilterStockQtyBtnMM()
	{
		FilterStockQty.click();
	}
	@FindBy(xpath="//div[@id='project-no-mm-column-advsearch-dropdown']//a[text()='Clear']")
	public WebElement ClearStockQty;
	public void ClickonClearStockQtyBtnMM()
	{
		ClearStockQty.click();
	}
//--------------------------------------------------------------------Advanced Search By Vendor
	@FindBy(xpath="//div[@data-dropdown='#item-vendor-search-dropdown']")
	public WebElement Searchicon4;
	public void ClickonVendorSearchiconMM()
	{
		Searchicon4.click();
	}
	@FindBy(xpath="//input[@data-id='2 Javalinas']")
	public WebElement VendorCheckBox;
	public void ClickonVendorCheckBoxMM()
	{
		VendorCheckBox.click();
	}
	@FindBy(xpath="//div[@id='item-vendor-search-dropdown']//a[text()='Filter']")
	public WebElement FilterVendor;
	public void ClickonFilterVendorBtnMM()
	{
		FilterVendor.click();
	}
	@FindBy(xpath="//div[@id='item-vendor-search-dropdown']//a[text()='Clear']")
	public WebElement ClearVendor;
	public void ClickonClearVendorBtnMM()
	{
		ClearVendor.click();
	}
//------------------------------------------------------------------- Advanced Search By Task
	@FindBy(xpath="//div[@data-dropdown='#item-task-dropdown']")
	public WebElement Searchicon5;
	public void ClickonTaskSearchiconMM()
	{
		Searchicon5.click();
	}
	@FindBy(xpath="(//div[@id='item-task-dropdown']//input[@class='cls_mm_task' ])[4]")
	public WebElement TaskCheckBox;
	public void ClickonTaskCheckBoxMM()
	{
		TaskCheckBox.click();
	}
	@FindBy(xpath="//div[@id='item-task-dropdown']//a[text()='Filter']")
	public WebElement FilterTask;
	public void ClickonFilterTaskBtnMM()
	{
		FilterTask.click();
	}
	@FindBy(xpath="//div[@id='item-task-dropdown']//a[text()='Clear']")
	public WebElement ClearTask;
	public void ClickonClearTaskBtnMM()
	{
		ClearTask.click();
	}
//------------------------------------------------------------------- Show Hide column functionality

	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[4]")
	public WebElement LastPRdate;
	public void ClickonLastPRdatecheckboxMM()
	{
		LastPRdate.click();
	}
	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[5]")
	public WebElement LastPRDiscprice;
	public void ClickonLastPRDiscpricecheckboxMM()
	{
		LastPRDiscprice.click();
	}
	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[6]")
	public WebElement LastPurchaseprice;
	public void ClickonLastPurchasepricecheckboxMM()
	{
		LastPurchaseprice.click();
	}
	@FindBy(xpath="(//div[@id='material-mgt-columns-dropdown']//span[@class='qp-checkmark'])[7]")
	public WebElement LastPurchasedate;
	public void ClickonLastPurchasedatecheckboxMM()
	{
		LastPurchasedate.click();
	}
	
//-------------------------------------------------------------------------- Advanced Search By PO Status
	@FindBy(xpath="//div[@data-dropdown='#po_status-dropdown']")
	public WebElement Searchicon6;
	public void ClickonPOSearchiconMM()
	{
		Searchicon6.click();
	}
	@FindBy(xpath="//select[@id='po_status-dropdown_field']")
	public WebElement SelectPO1;
	public void SelectPOdropdown1MM()
	{
		Select PO1 = new Select(SelectPO1);
		PO1.selectByVisibleText("Active");
	}
	@FindBy(xpath="//select[@id='po_status-dropdown_field']")
	public WebElement SelectPO2;
	public void SelectPOdropdow2MM()
	{
		Select PO2 = new Select(SelectPO2);
		PO2.selectByVisibleText("Partially Received");
	}
	@FindBy(xpath="//select[@id='po_status-dropdown_field']")
	public WebElement SelectPO3;
	public void SelectPOdropdown3MM()
	{
		Select PO3 = new Select(SelectPO3);
		PO3.selectByVisibleText("Complete");
	}
	@FindBy(xpath="//select[@id='po_status-dropdown_field']")
	public WebElement SelectPO4;
	public void SelectPOdropdown4MM()
	{
		Select PO4 = new Select(SelectPO4);
		PO4.selectByVisibleText("Cancelled");
	}
	@FindBy(xpath="//div[@id='po_status-dropdown']//a[text()='Filter']")
	public WebElement FilterPO;
	public void ClickonFilterPObtnMM()
	{
		FilterPO.click();
	}
	@FindBy(xpath="//div[@id='po_status-dropdown']//a[text()='Clear']")
	public WebElement ClearPO;
	public void ClickonClearPObtnMM()
	{
		ClearPO.click();
	}
//-------------------------------------------------------------------------- Advanced Search By Material Required Date
	@FindBy(xpath="//div[@data-dropdown='#material_req_date']")
	public WebElement Searchicon7;
	public void ClickonMReqSearchiconMM()
	{
		Searchicon7.click();
	}
	@FindBy(xpath="//div[@id='material_req_date']//input[@data-id='Green']")
	public WebElement Greencheckbox;
	public void ClickonMReqGreencheckboxMM()
	{
		Greencheckbox.click();
	}
	@FindBy(xpath="//div[@id='material_req_date']//a[text()='Filter']")
	public WebElement FilterMReq;
	public void ClickonFilterMReqbtnMM()
	{
		FilterMReq.click();
	}
	@FindBy(xpath="//div[@id='material_req_date']//a[text()='Clear']")
	public WebElement ClearMReq;
	public void ClickonClearMReqbtnMM()
	{
		ClearMReq.click();
	}
//-------------------------------------------------------------------------Advanced Search By Approval Timestamp
	@FindBy(xpath="//div[@data-dropdown='#approval_timestamp']")
	public WebElement Searchicon8;
	public void ClickonApprovalTimestampSearchiconMM()
	{
		Searchicon8.click();
	}
	@FindBy(xpath="//div[@id='approval_timestamp']//input[@data-id='Approved']")
	public WebElement Approvecheckbox;
	public void ClickonApprovecheckboxMM()
	{
		Approvecheckbox.click();
	}
	@FindBy(xpath="//div[@id='approval_timestamp']//a[text()='Filter']")
	public WebElement FilterApprovalTimestamp;
	public void ClickonFilterApprovalTimestampbtnMM()
	{
		FilterApprovalTimestamp.click();
	}
	@FindBy(xpath="//div[@id='approval_timestamp']//a[text()='Clear']")
	public WebElement ClearApprovalTimestamp;
	public void ClickonClearApprovalTimestampbtnMM()
	{
		ClearApprovalTimestamp.click();
	}
//---------------------------------------------------------------	Advanced Search By Vendor SPA Data
	@FindBy(xpath="//span[@data-dropdown='#spa-item-vendor-search-dropdown']")
	public WebElement Searchicon9;
	public void ClickonVendorSPADataSearchiconMM()
	{
		Searchicon9.click();
	}
	@FindBy(xpath="//div[@id='spa-item-vendor-search-dropdown']//input[@data-id='Graybar']")
	public WebElement Vendorcheckbox;
	public void ClickonVendorcheckboxMM()
	{
		Vendorcheckbox.click();
	}
	
	
	public Search_Sorting_Function_MM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
