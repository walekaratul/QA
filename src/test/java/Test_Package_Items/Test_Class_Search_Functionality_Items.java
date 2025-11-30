package Test_Package_Items;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common_Utility.common_utility_methods_items;
import POM_Package.Create_GRN_MM;
import POM_Package.Login_Quoteplan;
import POM_Package.Logout_Quoteplan;
import POM_Package.Search_Sorting_Function_MM;
import POM_Package.ViewModify;
import POM_Package_Items.Search_Functionality_Items;
import Utility_Package.Utility_Class_PB;

public class Test_Class_Search_Functionality_Items {
	WebDriver driver;
	ViewModify VM;
	Search_Functionality_Items GS;
	
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
//		MM = new Create_GRN_MM(driver);
//		SS = new Search_Sorting_Function_MM(driver);
	}
	@Test(priority =1)
	public void Genericsearchfunctionlity() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Genericsearchfunctionlity";
		common_utility_methods_items.Genericsearch(driver);
		GS.EnteronGenericsearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",3, 1));
		GS.ClickonGenericsearchbtnItems();
		System.out.println("Pass Genericsearchfunctionality");
		Thread.sleep(13000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
	}
	@Test(priority =2)
	public void AdvancedSearchByusing_Filter() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "AdvancedSearchByCatlogNo_Filter";
		common_utility_methods_items.filteradvancedsearch(driver);
		GS.ClickonFilterbtnItems();
		GS.ClickonCatlogNoFilterItems();
		Thread.sleep(1000);
		GS.EnteronCatolgNoboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",3, 1));
		GS.ClickonFilterDonebtnItems();
		System.out.println("Pass AdvancedSearchByCatlogNo_Filter");
		Thread.sleep(1000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		GS.ClickonResetrbtnItems();
		
		String TCName1 = "AdvancedSearchByID_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonIDFilterItems();
		Thread.sleep(1000);
		GS.EnteronIDboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",5, 1));
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(2000);
		System.out.println("Pass AdvancedSearchByID_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName1);
		GS.ClickonResetrbtnItems();
		
		String TCName2 = "AdvancedSearchByDescription_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonDescriptionFilterItems();
		Thread.sleep(1000);
		GS.EnteronDescriptionboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",7, 1));
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(13000);
		System.out.println("Pass AdvancedSearchByDescription_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName2);
		GS.ClickonResetrbtnItems();
		
		String TCName3 = "AdvancedSearchByLongDescription_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonLDescriptionFilterItems();
		GS.EnteronLDescriptionboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",9, 1));
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(11000);
		System.out.println("Pass AdvancedSearchByLongDescription_Filter");
		common_utility_methods_items.AlertHandle(driver);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName3);
		GS.ClickonResetrbtnItems();
		
		String TCName4 = "AdvancedSearchBydiscountedprice_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonDiscountedPriceFilterItems();
		Thread.sleep(1000);
		GS.Enterondiscounted_priceboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",11, 1));
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(9000);
		System.out.println("Pass AdvancedSearchBydiscountedprice_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName4);
		GS.ClickonResetrbtnItems();
		
		String TCName5 = "AdvancedSearchByPreferredItem_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonPreferredItemFilterItems();
		Thread.sleep(1000);
		GS.ClickonPreferredItemCheckboxFilterItems();
		Thread.sleep(2000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(10000);
		System.out.println("Pass AdvancedSearchByPreferredItem_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName5);
		GS.ClickonResetrbtnItems();
	
		
		String TCName6 = "AdvancedSearchBySelectedFolder_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonSelectedFolderFilterItems();
		Thread.sleep(1000);
		GS.ClickonSelectedFolderBoxFilterItems();
		Thread.sleep(1000);
		GS.ClickonSelectedFolderItems();
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(2000);
		System.out.println("Pass AdvancedSearchBySelectedFolder_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName6);
		GS.ClickonResetrbtnItems();
		
		String TCName7 = "AdvancedSearchByMake_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonCatlogNoFilterItems();
		Thread.sleep(1000);
		GS.EnteronCatolgNoboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",13, 1));
		Thread.sleep(1000);
		GS.ClickonMakeFilterItems();
		Thread.sleep(1000);
		GS.ClickonMakeBoxFilterItems();
		Thread.sleep(1000);
		GS.ClickonMakeItems();
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(2000);
		System.out.println("Pass AdvancedSearchByMake_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName7);
		GS.ClickonResetrbtnItems();
		
		String TCName8 = "AdvancedSearchCombination_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonCatlogNoFilterItems();
		Thread.sleep(1000);
		GS.EnteronCatolgNoboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",16, 1));
		Thread.sleep(1000);
		GS.ClickonDescriptionFilterItems();
		Thread.sleep(1000);
		GS.EnteronDescriptionboxFilterItems(Utility_Class_PB.GetExcelsheetDataItems("Items",17, 1));
		Thread.sleep(1000);
		GS.ClickonMakeFilterItems();
		Thread.sleep(1000);
		GS.ClickonMakeBoxFilterItems();
		Thread.sleep(1000);
		GS.ClickonMakeItems();
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(2000);
		System.out.println("Pass AdvancedSearchCombination_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName8);
		GS.ClickonResetrbtnItems();		
		
		String TCName9 = "AdvancedSearchSortedByASC_Filter";
		String TCName10 = "AdvancedSearchSortedByDESC_Filter";
		GS.ClickonFilterbtnItems();
		GS.ClickonSelectedFolderFilterItems();
		Thread.sleep(1000);
		GS.ClickonSelectedFolderBoxFilterItems();
		Thread.sleep(1000);
		GS.ClickonSelectedFolderItems();
		Thread.sleep(1000);
        GS.ClickonSortedByFilterItems();
        Thread.sleep(1000);
        GS.ClickonASCcheckBoxFilterItems();
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(2000);
		System.out.println("Pass AdvancedSearchSortedByASC_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName9);
		Thread.sleep(1000);
		GS.ClickonFilterbtnItems();
		GS.ClickonDESCcheckBoxFilterItems();
		Thread.sleep(1000);
		GS.ClickonFilterDonebtnItems();
		Thread.sleep(2000);
		System.out.println("Pass AdvancedSearchSortedByDESC_Filter");
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName10);
		GS.ClickonResetrbtnItems();			
	}
	@Test(priority =3 )
	public void Advance_search_using_column() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String TCName = "Advanced_Search_By_Description_column_Equal";
		common_utility_methods_items.Genericsearch(driver);
		Thread.sleep(1000);
		GS.EnterondescriptionsearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",19, 1));
		GS.ClickondescriptioncolumnfilterItems();
		GS.SelectdescriptiondropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items",20, 1));
		GS.ClickondescriptionsearchbtnItems();
		System.out.println("Pass Advanced_Search_By_Description_column_Equal");
		Thread.sleep(9000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName);
		GS.ClickonResetrbtnItems();	
		Thread.sleep(1000);
		String TCName1 = "Advanced_Search_By_Description_column_Like";
		Thread.sleep(1000);
		GS.EnterondescriptionsearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",21, 1));
		Thread.sleep(1000);
		GS.ClickondescriptioncolumnfilterItems();
		Thread.sleep(1000);
		GS.SelectdescriptiondropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items",22, 1));
		Thread.sleep(1000);
		GS.ClickondescriptionsearcGohbtnItems();
		System.out.println("Pass Advanced_Search_By_Description_column_Like");
		Thread.sleep(9000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName1);
		GS.ClickonResetrbtnItems();	
		Thread.sleep(1000);
		String TCName2 = "Advanced_Search_By_Description_column_Begins With ";
		Thread.sleep(1000);
		GS.EnterondescriptionsearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",23, 1));
		Thread.sleep(1000);
		GS.ClickondescriptioncolumnfilterItems();
		Thread.sleep(1000);
		GS.SelectdescriptiondropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items",20, 1));
		Thread.sleep(1000);
		GS.SelectdescriptiondropdownItems(Utility_Class_PB.GetExcelsheetDataItems("Items",24, 1));
		Thread.sleep(1000);
		GS.ClickondescriptionsearcGohbtnItems();
		System.out.println("Pass Advanced_Search_By_Description_column_Begins With ");
		Thread.sleep(9000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName2);
		GS.ClickonResetrbtnItems();	
		
		String TCName3 = "Advanced_Search_By_Catlog_No_column_Begins_With";
		Thread.sleep(1000);
		GS.EnteroncatlognosearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",25, 1));
		Thread.sleep(1000);
		GS.ClickoncatlognocolumnfilterItems();
		Thread.sleep(1000);
		GS.SelectcatlognoItems(Utility_Class_PB.GetExcelsheetDataItems("Items",26, 1));
		Thread.sleep(1000);
		GS.ClickoncatlognocolumnGofilterItems();
		System.out.println("Pass Advanced_Search_By_Catlog_No_column_Begins_With");
		Thread.sleep(2000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName3);
		GS.ClickonResetrbtnItems();
		
		String TCName4 = "Advanced_Search_By_CatlogNo_column_Like";
		Thread.sleep(1000);
		GS.EnteroncatlognosearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",27, 1));
		Thread.sleep(1000);
		GS.ClickoncatlognocolumnfilterItems();
		Thread.sleep(1000);
		GS.SelectcatlognoItems(Utility_Class_PB.GetExcelsheetDataItems("Items",28, 1));
		Thread.sleep(1000);
		GS.ClickoncatlognocolumnGofilterItems();
		System.out.println("Pass Advanced_Search_By_CatlogNo_column_Like");
		Thread.sleep(9000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName4);
		GS.ClickonResetrbtnItems();	
		Thread.sleep(1000);
		
		String TCName5 = "Advanced_Search_By_CatlogNo_column_Equal";
		Thread.sleep(1000);
		GS.EnteroncatlognosearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",29, 1));
		Thread.sleep(1000);
		GS.ClickoncatlognocolumnfilterItems();
		Thread.sleep(1000);
		GS.SelectcatlognoItems(Utility_Class_PB.GetExcelsheetDataItems("Items",30, 1));
		Thread.sleep(1000);
		GS.ClickoncatlognocolumnGofilterItems();
		System.out.println("Pass Advanced_Search_By_CatlogNo_column_Equal");
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName5);
		GS.ClickonResetrbtnItems();	
		Thread.sleep(1000);
		
		String TCName6 = "Advanced_Search_By_Make_column";
		GS.EnteroncatlognosearchboxItems(Utility_Class_PB.GetExcelsheetDataItems("Items",31, 1));
		Thread.sleep(1000);
		GS.ClickonmakecolumnfilterbtnItems();
		Thread.sleep(1000);
		GS.SelectmakeItems(Utility_Class_PB.GetExcelsheetDataItems("Items",32, 1));
		Thread.sleep(1000);
		GS.ClickonmakecolumnGofilterItems();
		System.out.println("Pass Advanced_Search_By_Make_column");
		Thread.sleep(3000);
		Utility_Class_PB.TakesscreeenshotItems(driver, TCName6);
		GS.ClickonResetrbtnItems();	
		Thread.sleep(1000);
	}
	@AfterMethod
	public void logoutfunction() throws InterruptedException
	{
		Thread.sleep(1000);
		Logout_Quoteplan lo = new Logout_Quoteplan(driver);
		lo.clickonadminprofile();
		lo.clickonlogoutbtn();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
		
	}


}
