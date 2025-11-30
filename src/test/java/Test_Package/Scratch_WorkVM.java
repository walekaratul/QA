package Test_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Scratch_WorkVM {
	WebDriver driver;
	@Test
	public void ViewModify() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://quoteplan.net/test_usa/home/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("quoteplan_admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("$1$j89nWOg9$y1wLNiVLn3DDRh792cbIa1");
		driver.findElement(By.xpath("//button[@id='logInBtn_js']")).click();
		Thread.sleep(5000);
		WebElement menu = driver.findElement(By.xpath("//div[text()='Menu']"));
		menu.click();
	    WebElement project = driver.findElement(By.xpath("//a[@id='ui-id-6']"));;
	    project.click();;
	    WebElement ViewModify = driver.findElement(By.xpath("//a[@id='edit-boms-link']"));
	    ViewModify.click();
	    Thread.sleep(2000);
	    WebElement LoadMore = driver.findElement(By.xpath("//a[text()='Load more']"));
	    LoadMore.click();
	    Thread.sleep(2000);
	    LoadMore.click();
	    Thread.sleep(2000);
	    WebElement project1 = driver.findElement(By.xpath("//a[text()='spreadsheet version New']"));
	    project1.click();
	}

}
