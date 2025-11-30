package Utility_Package_ReportTE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {
	
	
	public static void TakeScreenShotMethod(WebDriver driver, String TCName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyyy)_(HH-mm-ss)");
		String date = set.format(d);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Atul\\Screenshot_Reports\\Function="+TCName+" "+date+".jpg");
		FileHandler.copy(Source, Destination);
		
	}
	public static String GetExcelsheetData(String Sheet, int Row, int Cell) throws EncryptedDocumentException, IOException
	{
		String Path = "C:\\Atul\\GetExcelsheetData\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream file = new FileInputStream(Path);
		
	   String data =	WorkbookFactory.create(file).getSheet(Sheet).getRow(Row).getCell(Cell).getStringCellValue();
	   return data;
	}

}
