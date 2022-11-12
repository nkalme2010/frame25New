package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class ReadData extends TestBase{
	
	public static String readPropertyFile(String value) throws Exception
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25June\\TestData\\config.property");
		prop.load(file);
		return prop.getProperty(value);
	}

	public static String readExcelFile(int rowNum,int colNum) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Frame25June\\TestData\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}
	

}
