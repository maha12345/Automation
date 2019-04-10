package com.ActiTime.Generics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary 
{
 public static String getcellvalue(String path,String sheet,int row,int cell) throws IOException  
 {
	String cellValue="";
	FileInputStream fis = new FileInputStream("C:/Practice/FrameworkData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook();
	cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
    return cellValue;
	 
 }
	
}
