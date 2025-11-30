package Test_Package_Items;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common_Utility.common_utility_methods_items;
import POM_Package.Login_Quoteplan;
import POM_Package.Logout_Quoteplan;
import POM_Package.ViewModify;
import POM_Package_Items.Items_Functionality;
import POM_Package_Items.Search_Functionality_Items;
import Utility_Package.Utility_Class_PB;

public class Test_Class_Items_Functionality {
	
	WebDriver driver;
	ViewModify VM;
	Search_Functionality_Items GS;
	Items_Functionality IF;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost/QuotePlan/quotep7_apqengineering/home/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void loginfunction() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Login_Quoteplan li = new Login_Quoteplan(driver);	
		li.EnterUsername(Utility_Class_PB.GetExcelsheetDataItems("Items",1, 1));
		Thread.sleep(1000);
		li.EnterPassword(Utility_Class_PB.GetExcelsheetDataItems("Items", 2, 1));
		li.ClickOnLogin();
		VM = new ViewModify(driver);
	    GS = new Search_Functionality_Items(driver);
	    IF = new Items_Functionality(driver);
//		MM = new Create_GRN_MM(driver);
//		SS = new Search_Sorting_Function_MM(driver);
	}
	@Test(priority =1)
	public void ShowMore_button_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "ShowMore_button_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(1000);
//		IF.ClickonShowMoreBtnItems();
//		Thread.sleep(1000);
//		IF.ClickonShowMoreBtnItems();
		System.out.println("Pass ShowMore_button_functionlity");
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
	}
	@Test(priority =2)
	public void Create_New_Category_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Create_New_Category_functionlity";
		String expectedFolderName = Utility_Class_PB.GetExcelsheetDataItems("Items", 33, 1);
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonBaseFolderItems();
		Thread.sleep(1000);
		IF.ClickonAddNewCategoryIconItems();
		Thread.sleep(1000);
		IF.ClickonNewFolderCheckboxItems();
		Thread.sleep(1000);
		IF.ClickonEditIconItems();
		Thread.sleep(1000);
		IF.ClickonFolderNameBoxItems(expectedFolderName);
		Thread.sleep(1000);
		IF.ClickonSaveCategorybtnItems();
		IF.ClickonCloseCategorybtnItems();
		String actualFolderName = "1_Aallen Bradley 1";
		Assert.assertEquals(expectedFolderName, actualFolderName);
		System.out.println(expectedFolderName);
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =3)
	public void Create_New_Folder_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Create_New_Folder_functionlity";
		String expectedFolderName = Utility_Class_PB.GetExcelsheetDataItems("Items", 34, 1);
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonCategoryCheckboxItems();
		Thread.sleep(1000);
		IF.ClickonNewFolderIconItems();
		Thread.sleep(1000);
		IF.ClickonNewFolder2checkboxItems();
		Thread.sleep(1000);
		IF.ClickonFolderEditiconItems();
		Thread.sleep(1000);
		IF.ClickonFolderName1BoxItems(expectedFolderName);
		Thread.sleep(1000);
		IF.ClickonSaveCategorybtnItems();
		IF.ClickonCloseCategorybtnItems();
		String actualFolderName = "Demo Data";
		Assert.assertEquals(expectedFolderName, actualFolderName);
		System.out.println(expectedFolderName);
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =4)
	public void Create_Item_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Create_Item_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandArrowItems();
		Thread.sleep(1000);
		IF.ClickonFolderCheckbox1Items();
		Thread.sleep(1000);
		IF.ClickonItemEditIconItems();
		Thread.sleep(1000);
		IF.ClickonItemCheckbox1Items();
		Thread.sleep(1000);
		IF.ClickonItemEditPencilIcon1Items();
		Thread.sleep(1000);
		IF.ClickonDescriptionBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 35, 1));
		Thread.sleep(1000);
		IF.ClickonLongDescriptionBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 36, 1));
		Thread.sleep(1000);
		IF.ClickonCatlog_NoBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 37, 1));
		Thread.sleep(1000);
		IF.ClickonMakeboxItems();
		Thread.sleep(1000);
		IF.ClickonSelectMakeItems();
		Thread.sleep(1000);
		IF.ClickonUPCBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 38, 1));
		Thread.sleep(1000);
		IF.ClickonGTINBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 39, 1));
		Thread.sleep(1000);
		IF.ClickonPartNumberBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 40, 1));
		Thread.sleep(1000);
		IF.ClickonOrderNumberBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 41, 1));
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =5)
	public void Price_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Price_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		common_utility_methods_items.CreateItemTabs(driver);
		Thread.sleep(1000);
		IF.ClickonPricesTab();
		Thread.sleep(1000);
		IF.EnteronListPriceBoxItems();
		Thread.sleep(1000);
		IF.ClickonLPEFromboxItem();
		Thread.sleep(1000);
		IF.ClickonDateFromItem();
		Thread.sleep(1000);
		IF.ClickonLPEToItem();
		Thread.sleep(1000);
		IF.ClickonDateToItem();
		Thread.sleep(1000);
		IF.ClickonDiscCodeBox();
		Thread.sleep(1000);
		IF.ClickonDiscCodeItem();
		Thread.sleep(1000);
		IF.EnteronMulitplierFactorBoxItems();
		Thread.sleep(1000);
		IF.EnteronMulitplierBoxItems();
		Thread.sleep(1000);
		IF.ClickonDPEFromboxItem();
		IF.SelectMonthDPEFromItem(Utility_Class_PB.GetExcelsheetDataItems("Items", 42, 1));
		IF.SelectYearDPEFromItem();
		IF.ClickonDPEFromDayItem();
		Thread.sleep(1000);
		IF.ClickonDPEToboxItem();
		IF.SelectMonthDPEToItem(Utility_Class_PB.GetExcelsheetDataItems("Items", 43, 1));
		IF.SelectYearDPEToItem();
		IF.ClickonDPEToDayItem();
		Thread.sleep(1000);
		IF.ClickonPreferredVendorBox();
		Thread.sleep(1000);
		IF.ClickonPVendorItem();
		Thread.sleep(1000);
		IF.ClickonPreferredVendor1Box();
		Thread.sleep(1000);
		IF.ClickonPVendor1Item();
		Thread.sleep(1000);
		IF.ClickonLaborDetailsTab();                                                        //-------------------Labor Details Tab
		Thread.sleep(1000);
		IF.ClickonItemCategoryBoxItem();
		Thread.sleep(1000);
		IF.ClickonSelectCategoryItem();
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =6)
	public void Comments_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Comments_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		common_utility_methods_items.CreateItemTabs(driver);
		Thread.sleep(1000);
		IF.ClickonCommentsTabItem();
		Thread.sleep(1000);
		IF.SelectLeadTimeItem();
		Thread.sleep(1000);
		IF.EnteronComments1boxItem();
		Thread.sleep(1000);
		IF.EnteronComments2boxItem();	
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();

	}
	@Test(priority =7)
	public void Inventory_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Inventory_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		common_utility_methods_items.CreateItemTabs(driver);
		Thread.sleep(1000);
		IF.ClickonInventoryTabItem();
		Thread.sleep(1000);
		IF.EnteronMinOrderQtyboxItem();
		Thread.sleep(1000);
		IF.EnteronMinQtyBoxItems();
		Thread.sleep(1000);
		IF.EnteronMaxQtyBoxItems();
		Thread.sleep(1000);
		IF.EnteronPackageQtyBoxItems();
		Thread.sleep(1000);
		IF.EnteronQuantityDevisorBoxItems();
		Thread.sleep(1000);
		IF.EnteronBinNoBoxItems();
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =8)
	public void Assembly_List_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Assembly_List_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItems(driver);
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
//		Thread.sleep(1000);
//		IF.DraganddropItem(driver);
		Thread.sleep(1000);
		IF.DraganddropItem2(driver);
		Thread.sleep(1000);
		IF.DraganddropItem3(driver);
		IF.ClickonSavebtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		
	}
	@Test(priority =9)
	public void Accessories_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Accessories_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItems(driver);
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
		Thread.sleep(1000);
		IF.ClickonAccessoriesTabItems();
		Thread.sleep(1000);
		IF.DraganddropItem4(driver);
		Thread.sleep(2000);
		IF.DraganddropItem5(driver);
		IF.ClickonSavebtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		
	}
	@Test(priority =10)
	public void CrossReference_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "CrossReference_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItems(driver);
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
		Thread.sleep(1000);
		IF.ClickonCrossReferenceTabItems();
		Thread.sleep(1000);
		IF.DraganddropItem6(driver);
		Thread.sleep(2000);
		IF.DraganddropItem7(driver);
		IF.ClickonSavebtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		
	}
	@Test(priority =11)
	public void Maximize_Minimize_button_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Assembly_List_Maximize_functionality";
		String TCName1 = "Assembly_List_Minimize_functionality";
		String TCName2 = "Accessories_Maximize_functionality";
		String TCName3 = "Accessories_Minimize_functionality";
		String TCName4 = "CrossReference_Maximize_functionality";
		String TCName5 = "CrossReference_Minimize_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItems(driver);
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
		Thread.sleep(1000);
		IF.ClickonMiximizeBtnItems();		
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonMinimizeBtnItems();		
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName1);
		System.out.println("Pass " + TCName1);
		Thread.sleep(1000);
		IF.ClickonAccessoriesTabItems();
		Thread.sleep(1000);
		IF.ClickonMiximizeBtnItems();		
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName2);
		System.out.println("Pass " + TCName2);
		Thread.sleep(1000);
		IF.ClickonMinimizeBtnItems();		
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName3);
		System.out.println("Pass " + TCName3);
		Thread.sleep(1000);
		IF.ClickonCrossReferenceTabItems();
		Thread.sleep(1000);
		IF.ClickonMiximizeBtnItems();		
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName4);
		System.out.println("Pass " + TCName4);
		Thread.sleep(1000);
		IF.ClickonMinimizeBtnItems();		
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName5);
		System.out.println("Pass " + TCName5);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		
	}
	@Test(priority =12)
	public void Edit_functionality_For_User_Created_Item() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Edit_functionality_For_User_Created_Item";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.Clickonitemdoubleclick1Items(driver);
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
		Thread.sleep(1000);
		Thread.sleep(1000);
		IF.ClickonDescriptionBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 44, 1));
		Thread.sleep(1000);
		IF.ClickonLongDescriptionBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 45, 1));
		Thread.sleep(1000);
		IF.ClickonCatlog_NoBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 46, 1));
		Thread.sleep(1000);
		IF.ClickonUPCBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 47, 1));
		Thread.sleep(1000);
		IF.ClickonGTINBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 48, 1));
		Thread.sleep(1000);
		IF.ClickonPartNumberBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 49, 1));
		Thread.sleep(1000);
		IF.ClickonOrderNumberBoxItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 50, 1));
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		
	}
	@Test(priority =13)
	public void Create_Make_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Create_Make_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.Clickonitemdoubleclick1Items(driver);
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
		Thread.sleep(1000);
		IF.ClickonMake1boxItems();
		Thread.sleep(1000);
		IF.ClickonMakeNewbtnItems();
		Thread.sleep(1000);
		IF.EnterNewMake1Items();
		Thread.sleep(1000);
		IF.EnterNewMakeAddressItems();
		Thread.sleep(1000);
		IF.ClickonNewMakeSavebtnItems();
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		
		
	}
	@Test(priority =14)
	public void Edit_Make_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Edit_Make_functionality";
		VM.ClickOnMenu();
		Thread.sleep(1000);
		IF.ClickonConfiguration();
		Thread.sleep(1000);
		IF.ClickonItemsConfig(driver);
		Thread.sleep(1000);
		IF.ClickonModifyMake();
		Thread.sleep(1000);
		IF.ClickonExistingMakeBox();
		Thread.sleep(1000);
		IF.ClickonExistingMake();
		Thread.sleep(1000);
		IF.EnterNewMakeBox();
		Thread.sleep(1000);
		IF.ClickonOkbuttonMake();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
		Thread.sleep(1000);
		IF.ClickonAlertOkbuttonMake();	
	}
	@Test(priority =15)
	public void Move_Item_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Move_Item_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.ClickonItemCheckboxMoveItems();
		Thread.sleep(1000);
		IF.ClickonMoveBtnItems();
		Thread.sleep(1000);
		IF.ClickonExpandCategoryArrowMoveItems();
		Thread.sleep(1000);
		IF.ClickonFolderCheckboxMoveItems();
		Thread.sleep(1000);
		IF.ClickonMoveBtn1Items();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);

	}
	@Test(priority =16)
	public void Copy_Item_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Copy_Item_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItems();
		Thread.sleep(1000);
		IF.ClickonItemCheckboxcopyItems();
		Thread.sleep(1000);
		IF.ClickonCopyBtnItems();
		Thread.sleep(1000);
		IF.ClickonExpandCategoryArrowCopyItems();
		Thread.sleep(1000);
		IF.ClickonFolderCheckboxCopyItems();
		Thread.sleep(1000);
		IF.ClickonCopyBtn1Items();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);

	}
	@Test(priority =17)
	public void Export_to_QBo_Tab_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Export_to_QBo_Tab_functionality";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		common_utility_methods_items.CreateItemTabs(driver);
		Thread.sleep(1000);
		IF.ClickonExporttoQBoTabItems();
		Thread.sleep(1000);
		IF.SelectItemTypeDropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 51, 1));
		Thread.sleep(1000);
		IF.ClickonItemTypeInformationOkBtnItems();
		Thread.sleep(1000);
		IF.SelectTaxCodeDropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 52, 1));
		Thread.sleep(1000);
		IF.SelectcogsacDropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 53, 1));
		Thread.sleep(1000);
		IF.SelectIncomeAcDropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 54, 1));
		Thread.sleep(1000);
		IF.SelectAstExpAcDropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items", 55, 1));
		Thread.sleep(1000);
		IF.ClickonExporttoQBoBtnItems();
		Thread.sleep(1000);
		IF.ClickonSavebtnItems();
		Thread.sleep(1000);
		IF.ClickonCloseItembtn();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =18)
	public void Download_Items_functionality() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Download_Items_functionality";
		VM.ClickOnMenu();
		Thread.sleep(1000);
		GS.ClickOnItems();
		Thread.sleep(1000);
		IF.ClickonDownloadItems();
		Thread.sleep(1000);
		IF.ClickonDownloadItemsSearchBtn();
		Thread.sleep(22000);
		IF.ClickonExportBtnDownloadItems();
		Thread.sleep(1000);
		IF.ClickonDownloadItemsLink();
		Thread.sleep(1000);
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =19)
	public void INFO_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{

		String TCName = "INFO_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItemHistoryItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItemHistoryItems(driver);
		Thread.sleep(1000);
		IF.ClickonItemHistoryBtnItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =20)
	public void ITEM_STOCK_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{

		String TCName = "ITEM_STOCK_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItemHistoryItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItemHistoryItems(driver);
		Thread.sleep(1000);
		IF.ClickonItemHistoryBtnItems();
		Thread.sleep(1000);
		IF.ClickonItemStockTabItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =21)
	public void ITEM_HISTORY_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{

		String TCName = "ITEM_HISTORY_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItemHistoryItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItemHistoryItems(driver);
		Thread.sleep(1000);
		IF.ClickonItemHistoryBtnItems();
		Thread.sleep(1000);
		IF.ClickonItemHistoryTabItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =22)
	public void ITEM_HISTORY_MODULEWISE_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{

		String TCName = "ITEM_HISTORY_MODULEWISE_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItemHistoryItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItemHistoryItems(driver);
		Thread.sleep(1000);
		IF.ClickonItemHistoryBtnItems();
		Thread.sleep(1000);
		IF.ClickonItemHistoryModulewiseTabItems();
		Thread.sleep(1000);
		IF.ClickonItemHistoryModulewisePRTabItems();
		Thread.sleep(1000);
		IF.ClickonItemHistoryModulewisePOTabItems();
		Thread.sleep(1000);
		IF.ClickonItemHistoryModulewiseGRNTabItems();
		Thread.sleep(1000);
		IF.ClickonItemHistoryModulewiseMRTabItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =23)
	public void PROJECT_ACTIVITY_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{

		String TCName = "PROJECT_ACTIVITY_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItemHistoryItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItemHistoryItems(driver);
		Thread.sleep(1000);
		IF.ClickonItemHistoryBtnItems();
		Thread.sleep(1000);
		IF.ClickonProjectActivityTabItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
	@Test(priority =24)
	public void INWARD_OUTWARD_Tab_functionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{

		String TCName = "INWARD_OUTWARD_Tab_functionlity";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(3000);
		IF.ClickonExpandFolderArrowItemHistoryItems();
		Thread.sleep(1000);
		IF.ClickonitemdoubleclickItemHistoryItems(driver);
		Thread.sleep(1000);
		IF.ClickonItemHistoryBtnItems();
		Thread.sleep(1000);
		IF.ClickonInwardOutwardTabItems();
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		System.out.println("Pass " + TCName);
	}
//	@AfterMethod
//	public void logoutfunction() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		Logout_Quoteplan lo = new Logout_Quoteplan(driver);
//		lo.clickonadminprofile();
//		lo.clickonlogoutbtn();
//	}
//	@AfterClass
//	public void closebrowser()
//	{
//		driver.close();
//		
//	}
	
	

}
