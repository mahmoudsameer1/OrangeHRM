/**
 * 
 */
package com.OrangeHRM.dataprovider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.OrangeHRM.utility.NewExcelLibrary;


public class DataProviders {

	NewExcelLibrary obj = new NewExcelLibrary();
	
	@DataProvider(name = "AddNewEmployee")
	public Object[][] AddNewEmployee() {
		int rows = obj.getRowCount("AddNewEmployee");
		int column = obj.getColumnCount("AddNewEmployee");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("AddNewEmployee", j, i + 2);
			}
		}
		return data;
	}
}
