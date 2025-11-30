package Utility_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class_PB {
	
	
	public static String GetExcelsheetData(String MM, int Row, int Cell) throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Atul\\GetExcelsheetData\\APQ.xlsx";
		FileInputStream file = new FileInputStream(path);
		String data = WorkbookFactory.create(file).getSheet(MM).getRow(Row).getCell(Cell).toString();//.getStringCellValue();
		return data;
	}
	
	public static String GetExcelsheetDataMaterialManagement(String MM, int Row, int Cell)
	        throws EncryptedDocumentException, IOException {

	    String path = "C:\\Atul\\GetExcelsheetData\\Surecontrols.xlsx";
	    FileInputStream file = new FileInputStream(path);

	    Workbook workbook = WorkbookFactory.create(file);
	    Sheet sheet = workbook.getSheet(MM);
	    Row row = sheet.getRow(Row);
	    Cell cell = row.getCell(Cell);

	    String data = "";

	    if (cell != null) {
	        DataFormatter formatter = new DataFormatter();
	        // ye line sab types (String, Numeric, Boolean, Date) ko proper text bana deti hai
	        data = formatter.formatCellValue(cell);
	    }

	    workbook.close();
	    file.close();
	    return data;
	}
	public static String GetExcelsheetDataProject(String Project, int Row, int Cell)
	        throws EncryptedDocumentException, IOException {

	    String path = "C:\\Atul\\GetExcelsheetData\\APQ.xlsx";
	    FileInputStream file = new FileInputStream(path);

	    Workbook workbook = WorkbookFactory.create(file);
	    Sheet sheet = workbook.getSheet(Project);
	    Row row = sheet.getRow(Row);
	    Cell cell = row.getCell(Cell);

	    String data = "";

	    if (cell != null) {
	        DataFormatter formatter = new DataFormatter();
	        // ye line sab types (String, Numeric, Boolean, Date) ko proper text bana deti hai
	        data = formatter.formatCellValue(cell);
	    }

	    workbook.close();
	    file.close();
	    return data;
	}

	public static String GetExcelsheetDataItems(String Items, int Row1, int Cell1) throws EncryptedDocumentException, IOException
	{
		String path1 = "C:\\Atul\\GetExcelsheetData\\APQ.xlsx";
		FileInputStream file1 = new FileInputStream(path1);
		String data1 = WorkbookFactory.create(file1).getSheet(Items).getRow(Row1).getCell(Cell1).toString();//.getStringCellValue();
		return data1;
	}
	
	public static void Takesscreeenshot(WebDriver driver, String TCName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyyy)_(HH-mm-ss)");
		String date = set.format(d);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Atul\\Screenshot_BOM\\Function="+TCName+" "+date+".jpg");
		FileHandler.copy(Source, Destination);
	}
	
	public static void TakesscreeenshotProject(WebDriver driver, String TCName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyyy)_(HH-mm-ss)");
		String date = set.format(d);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Atul\\Screenshot_Project_APQ\\Function="+TCName+" "+date+".jpg");
		FileHandler.copy(Source, Destination);
	}
	
	public static void TakesscreeenshotItems(WebDriver driver, String TCName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyyy)_(HH-mm-ss)");
		String date = set.format(d);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Atul\\SreenshotItemsAPQ\\Function="+TCName+" "+date+".jpg");
		FileHandler.copy(Source, Destination);
	}
	
	
//	public static String GetExcelsheetDataProject(String Project, int Row, int Cell) throws EncryptedDocumentException, IOException
//	{
//		String path = "C:\\Atul\\GetExcelsheetData\\APQ.xlsx";
//		FileInputStream file = new FileInputStream(path);
//		String data = WorkbookFactory.create(file).getSheet(Project).getRow(Row).getCell(Cell).toString();//.getStringCellValue();
//		return data;
//	}
	
}
