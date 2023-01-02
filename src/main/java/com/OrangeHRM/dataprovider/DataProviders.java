/**
 * 
 */
package com.OrangeHRM.dataprovider;





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
	
	@DataProvider(name = "AddNewReportsPage")
	public Object[][]  AddNewReportsPage() {
		int rows = obj.getRowCount("AddNewReportsPage");
		int column = obj.getColumnCount("AddNewReportsPage");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("AddNewReportsPage", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "configurationOptions_AddCustom")
	public Object[][] configurationOptions_AddCustom() {
		int rows = obj.getRowCount(" configurationOptions_AddCustom");
		int column = obj.getColumnCount(" configurationOptions_AddCustom");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("configurationOptions_AddCustom", j, i + 2);
			}
		}
		return data;
	}
	
	
}
