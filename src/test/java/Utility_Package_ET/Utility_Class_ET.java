package Utility_Package_ET;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_Class_ET {
	
	public static String GetExcelsheetData(String sheet, int Row, int Cell) throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Atul\\GetExcelsheetData\\Expensesheet.xlsx";
		FileInputStream File = new FileInputStream(path);
		String data = WorkbookFactory.create(File).getSheet(sheet).getRow(Row).getCell(Cell).getStringCellValue();
		return data;
	}
	
	
	public static void TakesscreenShot(WebDriver driver, String TCName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyyy)_(HH-mm-ss)");
		String date = set.format(d);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Atul\\Screenshot_Expensesheet\\Function="+TCName+" "+date+".jpg");
		org.openqa.selenium.io.FileHandler.copy(Source, Destination);
	}

}
