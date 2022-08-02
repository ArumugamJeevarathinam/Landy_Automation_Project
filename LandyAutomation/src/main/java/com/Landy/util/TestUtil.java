package com.Landy.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Landy.base.TestBase;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class TestUtil extends TestBase{
	
	
	public 	static long PAGE_LOAD_TIMEOUT  = 50;
	public  static long IMPLICIT_WAIT  = 30;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	
	
	
     // static XSSFWorkbook  book;
      
     //  static XSSFSheet sheet;
            
	public static String TEST_DATA_SHEET_PATH ="C:/Users/Admin/eclipse-workspace/LandyAutomation/src/main/java/com/Landy/testdata/Data-LandyInfo.xlsx";	 
	
	 
public TestUtil() throws IOException {
		super();		 
	}



public void switchToFrame()
{
	driver.switchTo().frame("mainpanel");
	}

public static void takeScreenShotAtEndOfTest()
{
	TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		 
		try {
			File Destinationfile = new File("E://sample.png");
			FileHandler.copy(sourceFile,Destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	        
	}


public static Object[][] getTestData(String sheetname)
{
	 
	String fileLocation = "C:/Users/Admin/eclipse-workspace/LandyAutomation/src/main/java/com/Landy/testdata/Data-LandyInfo.xlsx";
	 XSSFWorkbook Wbook = null;
	try {
		Wbook = new XSSFWorkbook(fileLocation);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 //XSSFSheet sheet =Wbook.getSheetAt(0);
	  XSSFSheet sheet =Wbook.getSheet(sheetname);
	  
	 int LastRownum= sheet.getLastRowNum();
	 short lastCellnumb =sheet.getRow(0).getLastCellNum();
	 Object[][] data = new Object[LastRownum][lastCellnumb];
	 System.out.println("No of rows"+LastRownum );
	 int physicalnumb=sheet.getPhysicalNumberOfRows(); // include header
	 System.out.println("include header"+physicalnumb);
	 
short lastCellnNumb= sheet.getRow(0).getLastCellNum();
	 for (int i = 1; i <LastRownum; i++) 
		   //for(int i=1;i<sheet.getLastRowNum();i++)
	 {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < lastCellnNumb; j++) 
		//for(int k =0;k<sheet.getRow(0).getLastCellNum();k++)
		{
			XSSFCell cell = row.getCell(j);
//			XSSFRichTextString Value = cell.getRichStringCellValue();
//			System.out.println(Value);
			
			DataFormatter dft = new DataFormatter();
		  String Value=  dft.formatCellValue(cell);
		  //System.out.println(Value);
		  data[i-1][j]= Value;
		} 
	}
	 try {
		Wbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return data;

}

public static Object[][] getTestData1(String sheetname) throws InvalidFormatException
{
	 
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:/Users/Admin/eclipse-workspace/LandyAutomation/src/main/java/com/Landy/testdata/Data-LandyInfo.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = (XSSFWorkbook) WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
}


public void checkPageIsReady()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		   System.out.println("Page Is loaded.");
		   return; 
	}
	for (int i=0; i<25; i++){ 
		   try {
		    Thread.sleep(1000);
		    }catch (InterruptedException e) {} 
		   //To check page ready state.
		   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		    break; 
		   }   
}
}
}