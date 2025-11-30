package Common_Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import POM_Package.ViewModify;
import POM_Package_Items.Items_Functionality;
import POM_Package_Items.Search_Functionality_Items;

public class common_utility_methods_items {
	WebDriver driver;
	public static void Genericsearch(WebDriver driver)
	{
		ViewModify VM = new ViewModify( driver);
		Search_Functionality_Items GS = new Search_Functionality_Items(driver);
		VM.ClickOnMenu();
//		Thread.sleep(1000);
		GS.ClickOnItems();
//		Thread.sleep(1000);
		GS.ClickOnViewModifyItems();
	}
	public static void filteradvancedsearch(WebDriver driver) throws InterruptedException
	{
		ViewModify VM = new ViewModify( driver);
		Search_Functionality_Items GS = new Search_Functionality_Items(driver);
		VM.ClickOnMenu();
//		Thread.sleep(1000);
		GS.ClickOnItems();
//		Thread.sleep(1000);
		GS.ClickOnViewModifyItems();
		Thread.sleep(1000);
	}
	public static void AlertHandle(WebDriver driver) throws InterruptedException
	{
		try
		{
			Alert alt1 =driver.switchTo().alert();
			alt1.accept();
		}
		catch(Exception e)
		{
			System.out.println("Alert not present");
		}
		Thread.sleep(1000);
	}
	public static void CreateItemTabs(WebDriver driver) throws InterruptedException
	{
		Items_Functionality IF = new Items_Functionality( driver);
		IF.ClickonExpandArrowItems();
		Thread.sleep(1000);
		IF.ClickonFolderExpandArrowItems();
		Thread.sleep(1000);
		IF.ClickonItemnameItems();
		Thread.sleep(1000);
		IF.ClickonItemEditPencilIcon2Items();
		Thread.sleep(1000);
		IF.ClickonEditItembtn();
	}


}
