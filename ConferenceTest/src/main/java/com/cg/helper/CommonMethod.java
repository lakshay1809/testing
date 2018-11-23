package com.cg.helper;

import java.util.ArrayList;

public class CommonMethod {

	public void readExcelData (Conference data) {
		 ArrayList<String> FirstName  = new ArrayList<String>();
		 ArrayList<String> LastName = new ArrayList<String>();
		 ArrayList<String> Email = new ArrayList<String>();
		 ArrayList <Long> ContactNo =new ArrayList<Long>();
	     ArrayList <Integer> Number_of_People_attending = new ArrayList<Integer>();
		 ArrayList<String> Address = new ArrayList<String>();
		 ArrayList<String> Building_Name = new ArrayList<String>();
		 ArrayList<String> Area_Name = new ArrayList<String>();
		 ArrayList<String> City = new ArrayList<String>();
		 ArrayList<String> State = new ArrayList<String>();
		 ArrayList<String> Conference_member = new ArrayList<String>();
	       

	       // Get the data from excel file
	       for (int rowCnt = 1; rowCnt < ReadExcel.RowCount(); rowCnt++) {
	       browser.add(ReadExcel.ReadCell(ReadExcel.GetCell("Browser"), rowCnt));
	       username.add(ReadExcel.ReadCell(ReadExcel.GetCell("User ID"), rowCnt));
	                     password.add(ReadExcel.ReadCell(ReadExcel.GetCell("Password"), rowCnt));
	                     element1.add(ReadExcel.ReadCell(ReadExcel.GetCell("Element1"), rowCnt));
	                     element2.add(ReadExcel.ReadCell(ReadExcel.GetCell("Element2"), rowCnt));
	       element3.add(ReadExcel.ReadCell(ReadExcel.GetCell("Element3"), rowCnt));
	       }
	       data.setBrowser(browser);
	       data.setLoginUser(username);
	       data.setPassword(password);
	       data.setElement1(element1);
	       data.setElement2(element2);
	       data.setElement3(element3);
	       }
}
