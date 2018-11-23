package com.cg.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//
//	import java.io.FileInputStream;
//	import java.io.IOException;
//	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//	import org.apache.poi.ss.usermodel.Cell;
//	import org.apache.poi.ss.usermodel.Row;
//	import org.apache.poi.ss.usermodel.Sheet;
//	import org.apache.poi.ss.usermodel.Workbook;
//	import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//	  
//	  
//	public class ReadExcele {
//		public static String path = "../ConferenceTest/src/main/java/assets/DummyData.xlsx" ;
//	
//	public String[][] getCellData(String path, String sheetName) throws InvalidFormatException, IOException {
//		  
//	  FileInputStream stream = new FileInputStream(path);
//	  Workbook workbook = WorkbookFactory.create(stream);
//	  Sheet s = workbook.getSheet(sheetName);
//	  int rowcount = s.getLastRowNum();
//	  int cellcount = s.getRow(0).getLastCellNum();
//	  String data[][] = new String[rowcount][cellcount];
//	  for (int i = 1; i <= rowcount; i++) {
//	   Row r = s.getRow(i);
//	   for (int j = 0; j <= cellcount; j++) {
//	   Cell c = r.getCell(j);
//	try {
//	if (c.getCell(j).getCellTypeEnum() == c.CellType.STRING) {
//	      data[i - 1][j] = c.getStringCellValue();
//	} 
//	else
//	 {
//	      data[i - 1][j] = String.valueOf(c.getNumericCellValue());
//	}
//	} catch (Exception e) {
//	     e.printStackTrace();
//	}
//	   }
//	  }
//	  return data;
//	 }
//	}

public class ReadExcele {
private static XSSFWorkbook mybook;
static String fileLocation =  "../ConferenceTest/src/main/java/assets/DummyData.xlsx";

public static void main(String[] args){
    try{
        File newFile = new File(fileLocation);
        FileInputStream fIO = new FileInputStream(newFile);
        mybook = new XSSFWorkbook(fIO);         //finds the Excelfile
        XSSFSheet mySheet = mybook.getSheetAt(0);// Return first sheet from the XLSX workbook
        Iterator<Row> rowIterator = mySheet.iterator(); //create a cursor called iterator to all rows in sheet
        Row r;
        Cell c;
        //to travel into the Excel spreadsheet
        while(rowIterator.hasNext())    {
             r = rowIterator.next();
            //Cursor points to row
            Iterator<Cell> cell_Iterator = r.cellIterator();
            while(cell_Iterator.hasNext())  {
                 c = cell_Iterator.next();
                //Cursor points to cell
                switch (c.getCellType())    {
                case Cell.CELL_TYPE_STRING:
                    System.out.print(c.getStringCellValue()+"\t");
                    //System.out.println("Case String");
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    System.out.print(c.getNumericCellValue()+"\t");
                    //System.out.println("Case number");
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    System.out.print(c.getBooleanCellValue()+"\t");
                    System.out.println("Case boolean");
                    break;
                case Cell.CELL_TYPE_FORMULA:
                    System.out.print(c.getCellFormula()+"\t");
                    //System.out.println("Case formula");
                    break;
                default: System.out.println("");
                }                   
            }
            System.out.println(" ");//next to display in table format
       }            
        mybook.close();
        fIO.close();
    }
    catch(FileNotFoundException ef){
        ef.printStackTrace();
    }
    catch(IOException ei){
        ei.printStackTrace();
    }
}
}

