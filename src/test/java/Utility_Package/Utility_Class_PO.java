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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class_PO {
	
	
	public static String GetExcelsheetDataPO(String PO, int Row, int Cell) throws EncryptedDocumentException, IOException
	{
		 String path = "C:\\Atul\\GetExcelsheetData\\APQ.xlsx";
		    FileInputStream file = new FileInputStream(path);

		    Workbook workbook = WorkbookFactory.create(file);
		    Sheet sheet = workbook.getSheet(PO);
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
	public static void TakesscreeenshotPO(WebDriver driver, String TCName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyyy)_(HH-mm-ss)");
		String date = set.format(d);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Atul\\Screenshot_Vpel\\Function="+TCName+" "+date+".jpg");
		FileHandler.copy(Source, Destination);
	}
}
