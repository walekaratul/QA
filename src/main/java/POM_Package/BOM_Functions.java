package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BOM_Functions {
	
	@FindBy(xpath="//a[@onclick='openBOMview(490); return false;']")
	public WebElement BOM;
	public void ClickonBOM()
	{
		BOM.click();
	}
//--------------------------------------------Advanced Search By Catlog Number
	
	@FindBy(xpath="//form[@id='search-items-form']//i[@class='fa fa-filter']")
	public WebElement Filterbtn;
	public void ClickonFilterbtn()
	{
		Filterbtn.click();
	}
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='catalog_no']")
	public WebElement Checkbox;
	public void ClickonCheckbox()
	{
		Checkbox.click();
	}
	@FindBy(xpath="(//div[@id='advance-search-filter-dropdown']//input[@placeholder='Search..'])[1]")
	public WebElement CatlogNo;
	public void EnterCatlogNOBOM()
	{
		CatlogNo.sendKeys("140MT-C-PEC23");
	}
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//button[text()='Done']")
	public WebElement Donebtn;
	public void ClickonDonebtn()
	{
		Donebtn.click();
	}
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//button[text()='Clear']")
	public WebElement Clearbtn;
	public void ClickonClearbtn()
	{
		Clearbtn.click();
	}
	@FindBy(xpath="//button[@id='search-items-clear-btn']")
	public WebElement Resetbtn;
	public void ClickonResetbtn()
	{
		Resetbtn.click();
	}
//--------------------------------------------Advanced Search By Item ID
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='id']")
	public WebElement CheckboxID;
	public void ClickonCheckboxCheckboxID()
	{
		CheckboxID.click();
	}
	@FindBy(xpath="(//div[@class='qp-advsearch-item newsearch_id']//input[@placeholder='Search..'])[1]")
	public WebElement ID;
	public void EnterIDBOM()
	{
		ID.sendKeys("886529604");
	}
	
//--------------------------------------------Advanced Search By Description
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='description']")
	public WebElement CheckboxDe;
	public void ClickonCheckboxDe()
	{
		CheckboxDe.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_description']//input[@placeholder='Search..']")
	public WebElement Description;
	public void EnterDescriptionBOM()
	{
		Description.sendKeys("25A Connecting Module");
	}
	
//--------------------------------------------Advanced Search By Long Description	
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='long_description']")
	public WebElement CheckboxLDe;
	public void ClickonCheckboxLDe()
	{
		CheckboxDe.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_longdescription']//input[@placeholder='Search..']")
	public WebElement LDescription;
	public void EnterLDescriptionBOM()
	{
		LDescription.sendKeys("Allen Bradley:140MT-C-PEC23");
	}
//--------------------------------------------Advanced Search By Discounted Price	
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='discounted_price']")
	public WebElement CheckboxDiP;
	public void ClickonCheckboxDiP()
	{
		CheckboxDiP.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_discounted_price']//input[@placeholder='Search..']")
	public WebElement DiscountedPrice;
	public void EnterDiscountedPriceBOM()
	{
		DiscountedPrice.sendKeys("310");
	}
//--------------------------------------------Advanced Search By Preferred Item
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='preferred_item']")
	public WebElement CheckboxPI;
	public void ClickonCheckboxPI()
	{
		CheckboxPI.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_preferreditem']//input[@class='qp-check search_preferred search_string1']")
	public WebElement PreferredItem;
	public void EnterPreferredItemBOM()
	{
		PreferredItem.click();
	}
//--------------------------------------------Advanced Search By Selected Folder
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='selected_folder']")
	public WebElement CheckboxSF;
	public void ClickonCheckboxSF()
	{
		CheckboxSF.click();
	}
	@FindBy(xpath="(//div[@class='qp-advsearch-item-body']//li[@class='select2-search select2-search--inline'])[1]")
	public WebElement SelectedFolder;
	public void ClickonSelectedFolderBOM()
	{
		SelectedFolder.click();
	}
	@FindBy(xpath="//li[text()='ABB']")
	public WebElement Folder;
	public void ClickonFolderBOM()
	{
		Folder.click();
	}
//--------------------------------------------Advanced Search By Make 
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@data-varname='make']")
	public WebElement CheckboxMake;
	public void ClickonCheckboxMake()
	{
		CheckboxMake.click();
	}
	@FindBy(xpath="(//div[@class='qp-advsearch-item-body']//li[@class='select2-search select2-search--inline'])[2]")
	public WebElement SelectedMake;
	public void ClickonSelectedMakeBOM()
	{
		SelectedMake.click();
	}
	@FindBy(xpath="//li[text()='A-B']")
	public WebElement Make;
	public void ClickonMakeBOM()
	{
		Make.click();
	}
//--------------------------------------------Advanced Search By Sorted By
	@FindBy(xpath="//input[@class='qp-show-search advsearch_sortedby']")
	public WebElement CheckboxSortedBy;
	public void ClickonCheckboxSortedBy()
	{
		CheckboxSortedBy.click();
	}
	@FindBy(xpath="//select[@id='itemadvsearch_SortBy']")
	public WebElement SelectMake;
	public void ClickonMake()
	{
		Select m = new Select(SelectMake);
		m.selectByVisibleText("Make");
	}
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@value='desc']")
	public WebElement Desc;
	public void ClickonCheckboxDesc()
	{
		Desc.click();
	}
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//input[@value='asc']")
	public WebElement Asc;
	public void ClickonCheckboxAsc()
	{
		Asc.click();
	}
//----------------------------------------------------------- Export functionality for BOM without summary-BOM export without formula
	@FindBy(xpath="//a[@id='export-dropdown-btn']")
	public WebElement Export;
	public void ClickonExportbtn()
	{
		Export.click(); 
	}
	@FindBy(xpath="//div[@id='bom-export-dropdown']")
	public WebElement ExportDropdown;
	public void ClickonExportDropdown()
	{
		ExportDropdown.click();
	}
	@FindBy(xpath="//a[@onclick='saveBOMWithoutFormula();']")
	public WebElement exportwithoutformula;
	public void ClickonBOMexportwithoutformula()
	{
		exportwithoutformula.click();
	}
//----------------------------------------------------------- Export functionality for bom export xls
	@FindBy(xpath="//a[@id='bom-export-xls']")
	public WebElement exportbomexportxls;
	public void Clickonbomexportxls()
	{
		exportbomexportxls.click();
	}
//----------------------------------------------------------- Export functionality for CSV	
	@FindBy(xpath="//a[@id='bom-export-csv']")
	public WebElement exportCSV;
	public void ClickonexportCSV()
	{
		exportCSV.click();
	}
//----------------------------------------------------------- Export functionality for HTML		
	@FindBy(xpath="//a[@id='bom-export-html']")
	public WebElement exportHTML;
	public void ClickonexportHTML()
	{
		exportHTML.click();
	}
//----------------------------------------------------------- Export functionality for showgroupcolumn_forspreadsheet
	@FindBy(xpath="//a[@id='showgroupcolumn_forspreadsheet']")
	public WebElement showgroupcolumn_forspreadsheet;
	public void Clickonshowgroupcolumn_forspreadsheet()
	{
		showgroupcolumn_forspreadsheet.click();
	}
	@FindBy(xpath="(//span[text()='Done'])[2]")
	public WebElement Done;
	public void ClickonDone()
	{
		Done.click();
	}
	public BOM_Functions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
