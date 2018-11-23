package com.cg.helper;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;


public class ReadExcel {

	   public static  String filename = "../ConferenceTest/src/main/java/assets/DummyData.xlsx";
	   
	   public static   Sheet datatypeSheet;
	   public static  Workbook workbook;
	    
	  

	    public static void main(String[] args) {
 
	   
	        try {

	            FileInputStream excelFile = new FileInputStream(new File(filename));
	             workbook = new XSSFWorkbook(excelFile);
	            datatypeSheet = workbook.getSheetAt(0);
	            Iterator<Row> iterator = datatypeSheet.iterator();
	            
	            int rowCount = datatypeSheet.getLastRowNum()-datatypeSheet.getFirstRowNum();
//	            
	            Hashtable<String,Integer> dict = new Hashtable<String, Integer>();
                
               
               
	            for (int i = 0; i < rowCount+1; i++) {

                Row row = datatypeSheet.getRow(i);

	                //Create a loop to print cell values in a row

	                for (int j = 0; j < row.getLastCellNum(); j++)
	                {

	                    //Print Excel data in console
                	if (row.getCell(j).getCellTypeEnum() == CellType.STRING )  
	                	{
	                        System.out.print(row.getCell(j).getStringCellValue() + "\t");
	                    } else if (row.getCell(j).getCellTypeEnum() == CellType.NUMERIC) 
                    {
                        System.out.print(row.getCell(j).getNumericCellValue() + "\t");
	                    }
	                    else if(row.getCell(j).getCellTypeEnum() == CellType.BLANK)
                    {
	                    	 System.out.print(row.getCell(j) + "\t");
	                    }
                }

                System.out.println("\n");
//
//           while (iterator.hasNext()) {
//
//                Row currentRow = iterator.next();
//	                Iterator<Cell> cellIterator = currentRow.iterator();
//	                
//	                
//	                
//               while (cellIterator.hasNext()) {
//
//	                    Cell currentCell = cellIterator.next();
//                    
//	                  
//               
//	                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
//                        System.out.print(currentCell.getStringCellValue() + "\t");
//	                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
//	                        System.out.print(currentCell.getNumericCellValue()  + "\t");
//	                    }
//
//	                }
//	                System.out.println("\n");
//            }
	                
//            for (String col = 0; col < datatypeSheet.; col++) {
//                dict.put(col, 0);
//}
                
	                

	            
	          
	            
//	                public static int RowCount() {
//                        return datatypeSheet.getRow(arg0);
//        }
//	                public static String ReadCell(int column, int row) {
//                        return datatypeSheet.getCell(column, row).getContents();
//        }
	            
	        }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        } 
	   
	}
}


		



