package POM_Package_Items;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Functionality_Items {
	
	@FindBy(xpath="//a[@id='ui-id-5']")
	public WebElement Items;
	public void ClickOnItems()
	{
		Items.click();
	}
	@FindBy(xpath="//a[@id='edit-items-link']")
	public WebElement ViewModifyItems;
	public void ClickOnViewModifyItems()
	{
		ViewModifyItems.click();
	}
	@FindBy(xpath="//input[@id='search-items-text']")
	public WebElement Genericsearchbox;
	public void EnteronGenericsearchboxItems(String CN)
	{
		Genericsearchbox.sendKeys(CN);
	}
	@FindBy(xpath="//form[@id='search-items-form']//button[@id='search-bom-btn']")
	public WebElement Genericsearchbtn;
	public void ClickonGenericsearchbtnItems()
	{
		Genericsearchbtn.click();
	}
	@FindBy(xpath="//form[@id='search-items-form']//a[@id='advance-filter-btn']")
	public WebElement Filterbtn;
	public void ClickonFilterbtnItems()
	{
		Filterbtn.click();
	}
	@FindBy(xpath="//button[@title='Reset']")
	public WebElement Resetrbtn;
	public void ClickonResetrbtnItems()
	{
		Resetrbtn.click();
	}
	@FindBy(xpath="//button[@id='new_advancesearch_filter_go']")
	public WebElement FilterDonebtn;
	public void ClickonFilterDonebtnItems()
	{
		FilterDonebtn.click();
	}
//----------------------------------------------------------------Catlog No By using Filter 
	@FindBy(xpath="//div[@id='advance-search-filter-dropdown']//div[@class='qp-advsearch-item newsearch_catalog_no']//input[@class='qp-show-search pra_name']")
	public WebElement CatlogNoFilter;
	public void ClickonCatlogNoFilterItems()
	{
		CatlogNoFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_catalog_no']//input[@class='search_string1 form-control']")
	public WebElement CatolgNoboxFilter;
	public void EnteronCatolgNoboxFilterItems(String CN1)
	{
		CatolgNoboxFilter.sendKeys(CN1);
	}
//	----------------------------------------------------------------ID By using Filter 	
	@FindBy(xpath="//input[@data-varname='id']")
	public WebElement IDFilter;
	public void ClickonIDFilterItems()
	{
		IDFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_id']//input[@class='search_string1 form-control']")
	public WebElement IDboxFilter;
	public void EnteronIDboxFilterItems(String ID)
	{
		IDboxFilter.sendKeys(ID);
	}
//	----------------------------------------------------------------Description By using Filter 
	@FindBy(xpath="//input[@data-varname='description']")
	public WebElement DescriptionFilter;
	public void ClickonDescriptionFilterItems()
	{
		DescriptionFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_description']//input[@class='search_string1 form-control']")
	public WebElement DescriptionboxFilter;
	public void EnteronDescriptionboxFilterItems(String Description)
	{
		DescriptionboxFilter.sendKeys(Description);
	}
//	----------------------------------------------------------------Long Description By using Filter 
	@FindBy(xpath="//input[@data-varname='long_description']")
	public WebElement LDescriptionFilter;
	public void ClickonLDescriptionFilterItems()
	{
		LDescriptionFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_longdescription']//input[@class='search_string1 form-control']")
	public WebElement LDescriptionboxFilter;
	public void EnteronLDescriptionboxFilterItems(String LDescription)
	{
		LDescriptionboxFilter.sendKeys(LDescription);
	}
//	----------------------------------------------------------------Discounted Price By using Filter 	
	@FindBy(xpath="//input[@data-varname='discounted_price']")
	public WebElement DiscountedPriceFilter;
	public void ClickonDiscountedPriceFilterItems()
	{
		DiscountedPriceFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_discounted_price']//input[@class='search_string1 form-control']")
	public WebElement discountedpriceboxFilter;
	public void Enterondiscounted_priceboxFilterItems(String discountedprice)
	{
		discountedpriceboxFilter.sendKeys(discountedprice);
	}
	
//	----------------------------------------------------------------Preferred Item By using Filter 	
	@FindBy(xpath="//input[@data-varname='preferred_item']")
	public WebElement PreferredItemFilter;
	public void ClickonPreferredItemFilterItems()
	{
		PreferredItemFilter.click();
	}
	@FindBy(xpath="//input[@class='qp-check search_preferred search_string1']")
	public WebElement PreferredItemCheckboxFilter;
	public void ClickonPreferredItemCheckboxFilterItems()
	{
		PreferredItemCheckboxFilter.click();
	}
//	----------------------------------------------------------------  Selected Folder By using Filter 		
	@FindBy(xpath="//input[@data-varname='selected_folder']")
	public WebElement SelectedFolderFilter;
	public void ClickonSelectedFolderFilterItems()
	{
		SelectedFolderFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_selectedfolder']//ul[@class='select2-selection__rendered']")
	public WebElement SelectedFolderBox;
	public void ClickonSelectedFolderBoxFilterItems()
	{
		SelectedFolderBox.click();
	}
	@FindBy(xpath="//li[text()='Advantech']")
	public WebElement SelectedFolderItemsFilter;
	public void ClickonSelectedFolderItems()
	{
		SelectedFolderItemsFilter.click();
	}
//	----------------------------------------------------------------  Make By using Filter	
	@FindBy(xpath="//input[@data-varname='make']")
	public WebElement MakeFilter;
	public void ClickonMakeFilterItems()
	{
		MakeFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item newsearch_make']//ul[@class='select2-selection__rendered']")
	public WebElement MakeBox;
	public void ClickonMakeBoxFilterItems()
	{
		MakeBox.click();
	}
	@FindBy(xpath="//li[text()='A-B']")
	public WebElement MakeItems;
	public void ClickonMakeItems()
	{
		MakeItems.click();
	}
//	----------------------------------------------------------------  Sorted By using Filter
	@FindBy(xpath="//input[@class='qp-show-search advsearch_sortedby']")
	public WebElement SortedByFilter;
	public void ClickonSortedByFilterItems()
	{
		SortedByFilter.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item']//input[@value='asc']")
	public WebElement ASCcheckBox;
	public void ClickonASCcheckBoxFilterItems()
	{
		ASCcheckBox.click();
	}
	@FindBy(xpath="//div[@class='qp-advsearch-item']//input[@value='desc']")
	public WebElement DESCcheckBox;
	public void ClickonDESCcheckBoxFilterItems()
	{
		DESCcheckBox.click();
	}
//	----------------------------------------------------------------  Description search By using column 	
	@FindBy(xpath="//input[@id='itemdesc-adv-search-field']")
	public WebElement descriptionsearchbox;
	public void EnterondescriptionsearchboxItems(String description)
	{
		descriptionsearchbox.sendKeys(description);
	}
	
	@FindBy(xpath="//button[@data-dropdown='#item-desc-advsearch-dropdown']")
	public WebElement descriptioncolumnfilter;
	public void ClickondescriptioncolumnfilterItems()
	{
		descriptioncolumnfilter.click();
	}
	@FindBy(xpath="//div[@id='item-desc-advsearch-dropdown']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement descriptiondropdown;
	public void SelectdescriptiondropdownItems(String equal)
	{
		Select d = new Select(descriptiondropdown);
		d.selectByVisibleText(equal);
	}
	@FindBy(xpath="//span[@id='descriptionSearchBox']//button[@id='search-col-btn-items']")
	public WebElement descriptionsearchbtn;
	public void ClickondescriptionsearchbtnItems()
	{
		descriptionsearchbtn.click();
	}
	@FindBy(xpath="//div[@id='item-desc-advsearch-dropdown']//a[text()='Go']")
	public WebElement descriptionsearcGohbtn;
	public void ClickondescriptionsearcGohbtnItems()
	{
		descriptionsearcGohbtn.click();
	}
//	----------------------------------------------------------------  Catlog No search By using column 
	@FindBy(xpath="//input[@id='itemcatalogno-adv-search-field']")
	public WebElement catlognosearchbox;
	public void EnteroncatlognosearchboxItems(String catlogno)
	{
		catlognosearchbox.sendKeys(catlogno);
	}
	@FindBy(xpath="//button[@data-dropdown='#item-catlogno-advsearch-dropdown']")
	public WebElement catlognocolumnfilter;
	public void ClickoncatlognocolumnfilterItems()
	{
		catlognocolumnfilter.click();
	}
	@FindBy(xpath="//div[@id='item-catlogno-advsearch-dropdown']//select[@class='form-control qp-search-select clsCriteria']")
	public WebElement catlognodropdown;
	public void SelectcatlognoItems(String equal1)
	{
		Select c = new Select(catlognodropdown);
		c.selectByVisibleText(equal1);
	}
	@FindBy(xpath="//div[@id='item-catlogno-advsearch-dropdown']//a[text()='Go']")
	public WebElement catlognocolumnGofilter;
	public void ClickoncatlognocolumnGofilterItems()
	{
		catlognocolumnGofilter.click();
	}
//	----------------------------------------------------------------  Make search By using column 	
	@FindBy(xpath="//button[@data-dropdown='#item-make-advsearch-dropdown']")
	public WebElement makecolumnfilterbtn;
	public void ClickonmakecolumnfilterbtnItems()
	{
		makecolumnfilterbtn.click();
	}
	@FindBy(xpath="//select[@class='select2 str_makeitemadvsearch select2-hidden-accessible']")
	public WebElement Selectmake;
	public void SelectmakeItems(String make)
	{
		Select m = new Select(Selectmake);
		m.selectByVisibleText(make);
	}
	@FindBy(xpath="//div[@id='item-make-advsearch-dropdown']//a[text()='Go']")
	public WebElement makecolumnGofilter;
	public void ClickonmakecolumnGofilterItems()
	{
		makecolumnGofilter.click();
	}
	public Search_Functionality_Items(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
