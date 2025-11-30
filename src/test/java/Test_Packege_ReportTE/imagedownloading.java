package Test_Packege_ReportTE;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
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

public class imagedownloading {
	
	
	WebDriver driver;
	@Test
	public void openbrowser() throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromepath\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    // Excel code
        FileInputStream fis = new FileInputStream("C:\\Atul\\DownloadImageData.xlsx");
      org.apache.poi.ss.usermodel.Sheet sheet =  WorkbookFactory.create(fis).getSheet("Sheet1");
      int lastRowIndex = sheet.getLastRowNum();
      System.out.println(lastRowIndex);
      for (int i=0; i<lastRowIndex; i++)
      {
          String data =  sheet.getRow(i).getCell(0).getStringCellValue();
          System.out.println(data);
          
          driver.get("https://www.rockwellautomation.com/en-us.html");

          Thread.sleep(1000);

          driver.findElement(
                  By.xpath("//div[@class='ra-global-nav-v2__icons-container']//button[@aria-label='Open search']"))
                  .click();

          Thread.sleep(1000);
          
      
          driver.findElement(By.xpath("//input[@placeholder='Search products, services, support & more']"))
//                  .sendKeys("22B-E6P6C104");
          .sendKeys(data);

          Thread.sleep(1000);

          driver.findElement(By.xpath("//button[@class='ra-global-nav-v2__search-submit new-header']")).click();

          Thread.sleep(1000);
          
          String data1 =  sheet.getRow(i).getCell(1).getStringCellValue();

     try
     {
    	 driver.findElement(By.xpath("//strong[text()='" + data + "']")).click();
    	 // Find the image element
         WebElement imgUrl = driver.findElement(By.xpath("//div[@class='ra-product-new__mobile-image-container']//img"));
         String value = imgUrl.getAttribute("data-original-src");
         System.out.println(value);

         driver.get(value);
         Thread.sleep(1000);
         

         File fullScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         
         FileHandler.copy(fullScreenshot, new File("C:\\Atul\\ScreenshotImage\\" + data1 + ".jpg"));
         System.out.println("Full screenshot saved.");
         Thread.sleep(1000);
     }
     catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
         e.printStackTrace();
     }
         
       
          
      } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        FileInputStream fis = new FileInputStream("C:\\Atul\\DownloadImageData.xlsx");
//        org.apache.poi.ss.usermodel.Sheet sheet =  WorkbookFactory.create(fis).getSheet("Sheet1");
//        int lastRowIndex = sheet.getLastRowNum();
//        System.out.println(lastRowIndex);
//        for (int i=0; i<lastRowIndex; i++)
//        {
//            String data =  sheet.getRow(i).getCell(0).getStringCellValue();
//            System.out.println(data);
//            
//            driver.get("https://www.rockwellautomation.com/en-us.html");
//
//            Thread.sleep(2000);
//
//            driver.findElement(
//                    By.xpath("//div[@class='ra-global-nav-v2__icons-container']//button[@aria-label='Open search']"))
//                    .click();
//
//            Thread.sleep(2000);
//            
//        
//            driver.findElement(By.xpath("//input[@placeholder='Search products, services, support & more']"))
////                    .sendKeys("22B-E6P6C104");
//            .sendKeys(data);
//
//            Thread.sleep(6000);
//
//            driver.findElement(By.xpath("//button[@class='ra-global-nav-v2__search-submit new-header']")).click();
//
//            Thread.sleep(4000);
//
//            driver.findElement(By.xpath("//strong[text()='" + data + "']")).click();
//
//            // Find the image element
//            WebElement imgUrl = driver.findElement(By.xpath("//div[@class='ra-product-new__mobile-image-container']//img"));
//            String value = imgUrl.getAttribute("data-original-src");
//            System.out.println(value);
//
//            driver.get(value);
//            Thread.sleep(1000);
//            
//
//            File fullScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            
//            FileHandler.copy(fullScreenshot, new File("C:\\Atul\\ScreenshotImage\\" + data + ".png"));
//            System.out.println("Full screenshot saved.");
//            Thread.sleep(1000);
//         
//            
//        }
	   
	    
	}
	 
}
