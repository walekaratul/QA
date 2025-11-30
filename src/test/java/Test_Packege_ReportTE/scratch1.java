package Test_Packege_ReportTE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class scratch1 {
	WebDriver driver;
	@Test
	public void openbrowser() throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
 //=================================================================
        
        // Excel code
        

        
           FileInputStream fis = new FileInputStream("C:\\Atul\\DownloadImageData.xlsx");
           org.apache.poi.ss.usermodel.Sheet sheet =  WorkbookFactory.create(fis).getSheet("Sheet1");
           int lastRowIndex = sheet.getLastRowNum();
           System.out.println(lastRowIndex);
           for (int i=0; i<=lastRowIndex; i++)
           {
               String data =  sheet.getRow(i).getCell(0).getStringCellValue();
               System.out.println(data);
               
               driver.get("https://www.rockwellautomation.com/en-us.html");

               Thread.sleep(2000);

               driver.findElement(
                       By.xpath("//div[@class='ra-global-nav-v2__icons-container']//button[@aria-label='Open search']"))
                       .click();

               Thread.sleep(2000);
               
           
               driver.findElement(By.xpath("//input[@placeholder='Search products, services, support & more']"))
//                       .sendKeys("22B-E6P6C104");
               .sendKeys(data);

               Thread.sleep(6000);

               driver.findElement(By.xpath("//button[@class='ra-global-nav-v2__search-submit new-header']")).click();

               Thread.sleep(4000);

               driver.findElement(By.xpath("//strong[text()='" + data + "']")).click();

               // Find the image element
               WebElement imgUrl = driver.findElement(By.xpath("//div[@class='ra-product-new__mobile-image-container']//img"));
               String value = imgUrl.getAttribute("data-original-src");
               System.out.println(value);

               driver.get(value);
               
               

               File fullScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
               
               FileHandler.copy(fullScreenshot, new File("C:\\Atul\\ScreenshotImage\\" + data + ".jpg"));
               System.out.println("Full screenshot saved.");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//		driver.get("https://www.rockwellautomation.com/en-us.html");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='ra-global-nav-v2__icons-container']//button[@aria-label='Open search']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Search products, services, support & more']")).sendKeys("22B-E6P6C104");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='ra-global-nav-v2__search-submit new-header']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//strong[text()='22B-E6P6C104']")).click();
//		WebElement img = driver.findElement(By.xpath("//div[@class='ra-product-new__mobile-image-container']//img"));
//
//		 String value = img.getAttribute("data-original-src"); 
//
//		 System.out.println(value);
//
//		 driver.get(value);
//          Robot robot = new Robot();
//
//		 Thread.sleep(2000);
//
//		// robot.keyPress(KeyEvent.VK_CONTROL);
//
//
//		// robot.keyPress(KeyEvent.VK_T);
//
//
//		// robot.keyRelease(KeyEvent.VK_T);
//
//
//		// robot.keyRelease(KeyEvent.VK_CONTROL);
//
//
//		//// Thread.sleep(1000);
//
//
//		//// 
//
//
//		// robot.keyPress(KeyEvent.VK_CONTROL);
//
//
//		// robot.keyPress(KeyEvent.VK_V);
//
//
//		// robot.keyRelease(KeyEvent.VK_V);
//
//
//		// robot.keyRelease(KeyEvent.VK_CONTROL);
//
//
//		//// 
//
//
//		//// 
//
//
//		// robot.keyPress(KeyEvent.VK_ENTER);
//
//
//		// robot.keyRelease(KeyEvent.VK_ENTER);
//
//
//		// 
//
//		 Thread.sleep(5000); 
//
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//
//		 robot.keyPress(KeyEvent.VK_P);
//
//		 robot.keyRelease(KeyEvent.VK_P);
//
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		 robot.keyPress(KeyEvent.VK_ENTER);
//
//		 robot.keyRelease(KeyEvent.VK_ENTER);
//
//		 Thread.sleep(5000);
//
//
//
//		// StringSelection selection = new StringSelection("VikasKale");
//
//
//		// Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//
//
//		// clipboard.setContents(selection, selection);
//
//
//		// Thread.sleep(5000);
//
//
//		// 
//
//
//		// StringSelection selection2 = new StringSelection("Vikas");
//
//
//		// clipboard.setContents(selection2, selection2); 
//
//
//		// 
//
//
//		// 
//
//
//		// StringSelection filename = new StringSelection("Vikas");
//
//
//		// clipboard.setContents(filename, null);
//
//		 StringSelection filename = new StringSelection("Vikas");
//
//		 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//
//		 clipboard.setContents(filename, null);
//
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//
//		 robot.keyPress(KeyEvent.VK_V);
//
//		 robot.keyRelease(KeyEvent.VK_V);
//
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		 Thread.sleep(5000);
//
//		 robot.keyPress(KeyEvent.VK_ENTER);
//
//		 robot.keyRelease(KeyEvent.VK_ENTER);
//
//		 System.out.println("Automation completed.");


           }
	}


	
	

}
