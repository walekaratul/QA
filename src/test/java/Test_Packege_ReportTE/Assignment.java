package Test_Packege_ReportTE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
	     driver.get("https://quoteplan.us/test_usa/");
	     driver.manage().window().maximize();
	     
	     
	   	 driver.findElement(By.name("Username")).sendKeys("Manisha");
				
		 driver.findElement(By.name("Password")).sendKeys("123");
				
	     ((WebElement) driver.findElements(By.xpath("//button[@class='btn']"))).click();
				   
	     driver.findElement(By.linkText("menu")).click();
	     driver.findElement(By.linkText("CreateProject")).click();
			    
			    
	     driver.findElement(By.name("ProjectName")).sendKeys("Demo Project");
	     driver.findElement(By.name("description")).sendKeys("This is a test project");
			    
	     driver.findElement(By.name("customer")).sendKeys("Existing Customer");
			                                
	     driver.findElement(By.xpath("//button[text()='save']")).click();
	     
	     
	     
	    
	     }
	           
	 }


	
