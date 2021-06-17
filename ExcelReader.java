package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	File file;
	FileInputStream fileInputStream;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public ExcelReader(String filePath) throws IOException {
	     file = new File(filePath);
	     fileInputStream = new FileInputStream(file);
	     workbook = new XSSFWorkbook(fileInputStream);
	}
	
	 public String getStringData (String sheetName, int rowNumber, int columnNumber) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(columnNumber);
		return cell.getStringCellValue();
	}
	
	 public int getIntegerData (String sheetName, int rowNumber, int columnNumber) {
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rowNumber);
			cell = row.getCell(columnNumber);
			return (int)cell.getNumericCellValue();
		}
	 
}

