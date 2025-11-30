package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BOM_Actions_Button_Functions {
	
	@FindBy(xpath="//a[@id='bom_actions-dropdown-btn']")
	public WebElement Actions;
	public void ClickonActionsbtnBOM()
	{
		Actions.click();//a[@id='bom_revision-compare-link']
	}
//-------------------------------Lock Revision Functions	
	@FindBy(xpath="//a[@id='bom_revision-lock-link']")
	public WebElement LockRevision;
	public void ClickonLockRevisionBOM()
	{
		LockRevision.click();
	}
//------------------------------- Revision Comparison Functions	
	@FindBy(xpath="//a[@id='bom_revision-compare-link']")
	public WebElement RevisionComparison;
	public void ClickonRevisionComparisonBOM()
	{
		RevisionComparison.click();
	}
//------------------------------- Open Revision Functions	
	@FindBy(xpath="//a[@id='bom_revision-open-link']")
	public WebElement OpenRevision;
	public void ClickonOpenRevisionBOM()
	{
		OpenRevision.click();
	}	
	@FindBy(xpath="(//span[@class='ui-button-text' and text()='Close'] )[4]")
	public WebElement CloseOR;
	public void ClickonCloseORBOM()
	{
		CloseOR.click();
	}	
//------------------------------- Show Item Documnets Functions	
	@FindBy(xpath="(//ul[@class='dropdown-menu']//a[@id='copy-from-bom-link'])[2]")
	public WebElement ItemDocuments;
	public void ClickonItemDocumentsBOM()
	{
		ItemDocuments.click();
	}
	@FindBy(xpath="//a[text()='Ignition BasicCare Support Plan']")
	public WebElement DescriptionLink;
	public void ClickonDescriptionLinkBOM()
	{
		DescriptionLink.click();
		
	}
	@FindBy(xpath="(//a[text()='Product Details and Certifications'])[2]")
	public WebElement DocumentsLink;
	public void ClickonDocumentsLinkBOM()
	{
		DocumentsLink.click();
		
	}
//---------------------------------------------Find and Replace BOM
	@FindBy(xpath="(//a[@id='f_and_r_bom'])[1]")
	public WebElement FindandReplaceBOM;
	public void ClickonFindandReplaceBOM()
	{
		FindandReplaceBOM.click();
	}
	@FindBy(xpath="//input[@id='rep_bom_item_id']")
	public WebElement ItemIDBox;
	public void ClickonItemIDBoxBOM()
	{
		ItemIDBox.click();
	}
	@FindBy(xpath="//input[@id='rep_bom_item_id']")
	public WebElement searchboxOID;
	public void EntersearchboxOIDBOM()
	{
		searchboxOID.sendKeys("886728027");
	}
	@FindBy(xpath="//div[@id='find_bom_item-select-dropdown']//button[@id='search-item-btn']")
	public WebElement searchbtnOID;
	public void ClickonsearchbtnOIDBOM()
	{
		searchbtnOID.click();
	}
	@FindBy(xpath="//a[text()='886728027']")
	public WebElement OriginalItem;
	public void ClickOriginalItemBOM()
	{
		OriginalItem.click();
	}
	@FindBy(xpath="//input[@id='rep_item_item_id']")
	public WebElement REItemIDBox;
	public void ClickonREItemIDBoxBOM()
	{
		REItemIDBox.click();
	}
	@FindBy(xpath="//input[@id='replace_item-select-search-text']")
	public WebElement searchboxREID;
	public void EntersearchboxREIDBOM()
	{
		searchboxREID.sendKeys("886727999");
	}
	@FindBy(xpath="//div[@id='replace_bom_item-select-dropdown']//button[@id='search-item-btn']")
	public WebElement searchbtnREID;
	public void ClickonsearchbtnREIDBOM()
	{
		searchbtnREID.click();
	}
	@FindBy(xpath="//div[@id='replace_bom_item-select-dropdown']//a[text()='886727999']")
	public WebElement ReplacementItem;
	public void ClickReplacementItemBOM()
	{
		ReplacementItem.click();
	}
	@FindBy(xpath="//button[@onclick='findreplaceBOMItem(event)']")
	public WebElement ReplaceBOMItem;
	public void ClickReplaceBOMItembtn()
	{
		ReplaceBOMItem.click();
	}
//----------------------------------------------------------------------Add New button functions
	@FindBy(xpath="//button[@onclick='findreplaceBOMItem(event)']")
	public WebElement AddNewBtn;
	public void ClickonAddNewBtn()
	{
		AddNewBtn.click();
	}
//----------------------------------------------------------------------Delete button functions
	@FindBy(xpath="//table[@id='bom_find_replace_item-table1']//button[@title='Delete']")
	public WebElement DeleteBtn;
	public void ClickonDeleteBtn()
	{
		DeleteBtn.click();
	}
//----------------------------------------------------------------------Synch Price functions	
	@FindBy(xpath="(//div[@id='bom_actions-dropdown']//p[@class='qp-drop-menu'])[1]")
	public WebElement Synch;
	public void ClickonSynch_BOM()
	{
		Synch.click();
	}
	@FindBy(xpath="//a[text()='Dis Prices ']")
	public WebElement Discprice;
	public void ClickonDiscpriceBOM()
	{
		Discprice.click();
	}
	@FindBy(xpath="//input[@id='bom-save-btn']")
	public WebElement Save;
	public void ClickonSavebtnBOM()
	{
		Save.click();
	}
	public BOM_Actions_Button_Functions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
