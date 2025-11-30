package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MM_Functionality {

	@FindBy(xpath="//a[@data-id='41004277']")
	public WebElement Pencilicon;
	public void ClickonPenciliconMM()
	{
		Pencilicon.click();
	}
	@FindBy(xpath="(//a[text()='Prices '])[2]")
	public WebElement Price;
	public void ClickonPricetabMM()
	{
		Price.click();
	}
	@FindBy(xpath="//a[text()='Labor Details']")
	public WebElement Labordetails;
	public void ClickonLabordetailstabMM()
	{
		Labordetails.click();
	}
	@FindBy(xpath="(//a[text()='Documents'])[2]")
	public WebElement Documents;
	public void ClickonDocumentstabMM()
	{
		Documents.click();
	}
	@FindBy(xpath="(//a[text()='Comments'])[2]")
	public WebElement Comments;
	public void ClickonCommentstabMM()
	{
		Comments.click();
	}
	@FindBy(xpath="(//a[text()='Inventory'])[2]")
	public WebElement Inventory;
	public void ClickonInventorytabMM()
	{
		Inventory.click();
	}
	@FindBy(xpath="(//a[text()='Projects'])[2]")
	public WebElement Project;
	public void ClickonProjecttabMM()
	{
		Project.click();
	}
	@FindBy(xpath="//a[text()='Accessories']")
	public WebElement Accessories;
	public void ClickonAccessoriestabMM()
	{
		Accessories.click();
	}
	@FindBy(xpath="//a[text()='Cross Reference']")
	public WebElement CrossReference;
	public void ClickonCrossReferencetabMM()
	{
		CrossReference.click();
	}
	@FindBy(xpath="//span[text()='Edit']")
	public WebElement Edit;
	public void ClickonEditbtnMM()
	{
		Edit.click();
	}
	@FindBy(xpath="(//span[text()='Save'])[1]")
	public WebElement Save;
	public void ClickonSavebtnMM()
	{
		Save.click();
	}
	
	@FindBy(xpath="(//span[text()='Close'])[3]")
	public WebElement Close;
	public void ClickonClosebtnMM()
	{
		Close.click();
	}
	@FindBy(xpath="//select[@class='val-extra edit input-xs form-control']")
	public WebElement LeadTime;
	public void selectLeadTimeMM()
	{
		LeadTime.click();
//		Select lead = new Select(LeadTime);
//		lead.selectByValue("14");
	}
	@FindBy(xpath="//option[text()='35']")
	public WebElement Days;
	public void EnterDaysMM()
	{
		Days.click();
	}
//---------------------------------------------------------Insert Vendor in Item Master Function
	@FindBy(xpath="(//span[@class='qp-checkmark'])[9]")
	public WebElement itemcheckbox;
	public void ClickonitemcheckboxMM()
	{
		itemcheckbox.click();
	}
	@FindBy(xpath="(//a[@id='MM_actions-dropdown-btn'])[2]")
	public WebElement Actions;
	public void ClickonActionsbtnMM()
	{
		Actions.click();
	}
	@FindBy(xpath="(//p[@id='insertspepriceitemmaster'])[1]")
	public WebElement Vendordropdownitemmaster;
	public void ClickoninsertspepriceitemmasterMM()
	{
		Vendordropdownitemmaster.click();
	}
	@FindBy(xpath="//div[@id='material-actions-dropdown']//a[text()='Preferred Vendor 1']")
	public WebElement PreferedVendor;
	public void ClickonPreferedVendorMM()
	{
		PreferedVendor.click();
	}
	@FindBy(xpath="//span[text()='Yes']")
	public WebElement InsertVendorYes;
	public void ClickonInsertVendorYesbtnMM()
	{
		InsertVendorYes.click();
	}
	@FindBy(xpath="//span[text()='No']")
	public WebElement InsertVendorNo;
	public void ClickonInsertVendorNobtnMM()
	{
		InsertVendorNo.click();
	}
//--------------------------------------------------------------------------Refresh Button Function	
	@FindBy(xpath="//div[@class='ru-project-createnew']//i[@class='fa fa-refresh']")
	public WebElement Refresh;
	public void ClickonRefreshbtnMM()
	{
		Refresh.click();
	}
//--------------------------------------------------------------------------View Modify PR  Button Function	
	@FindBy(xpath="//div[@class='ru-project-createnew']//a[text()='View/Modify PR']")
	public WebElement ViewModifyPR;
	public void ClickonViewModifyPRbtnMM()
	{
		ViewModifyPR.click();
	}
//--------------------------------------------------------------------------View Modify PR  Button Function	
	@FindBy(xpath="//div[@class='ru-project-createnew']//a[text()='View/Modify PO']")
	public WebElement ViewModifyPO;
	public void ClickonViewModifyPObtnMM()
	{
		ViewModifyPO.click();
	}
//--------------------------------------------------------------------------BOM Option Function	
	@FindBy(xpath="//a[@data-dropdown='#material-bom-list-dropdown']")
	public WebElement BOMbtn;
	public void ClickonBOMbtnMM()
	{
		BOMbtn.click();
	}
	@FindBy(xpath="//a[@id='mm-bom-data-btn']")
	public WebElement BOM;
	public void ClickonBOMoptionMM()
	{
		BOM.click();
	}
//-------------------------------------------------------------------------- Insert Price BOM  Function		
	@FindBy(xpath="(//tr[@id='mm_item_39']//span[@class='qp-checkmark'])[2]")
	public WebElement PRcheckbox;
	public void ClickonPRcheckboxMM()
	{
		PRcheckbox.click();
	}
	@FindBy(xpath="//p[@id='insertspepriceitemmaster_new']")
	public WebElement PRPrice;
	public void ClickonInsertPRPricesintoBOMdropdownMM()
	{
		PRPrice.click();
	}
	@FindBy(xpath="//a[@id='send_to_entire_bom']")
	public WebElement SendToEntireBOM;
	public void ClickonSendToEntireBOMMM()
	{
		SendToEntireBOM.click();
	}
	@FindBy(xpath="//a[@id='send_to_specific_panel']")
	public WebElement SendToSpecificPanel;
	public void ClickonSendToSpecificPanelMM()
	{
		SendToSpecificPanel.click();
	}
	public MM_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
