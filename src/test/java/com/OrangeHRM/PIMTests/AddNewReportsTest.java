package com.OrangeHRM.PIMTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.AddNewReportsPage ;
import com.OrangeHRM.PIMPageObject.ReportsPage;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;
import com.OrangeHRM.dataprovider.DataProviders;

public class AddNewReportsTest extends Base{
	
	  private ReportsPage reportsPage ;
	  private LoginPage loginPage;  
	  private DashboardPage dashboardPage;
	  private AddNewReportsPage aadNewReportsPage ;
	  
	  
	@Parameters("browser")
	@BeforeMethod 
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(dataProvider = "AddNewReportsPage", dataProviderClass = DataProviders.class)
	public void AddNewReportsFormTest (String RepName/*,String SelectionCriteria , String Include , String SelectDisplayFieldGroup ,String SelectDisplayField*/)throws InterruptedException {
		aadNewReportsPage = new AddNewReportsPage() ;	
		loginPage = new LoginPage();
	      dashboardPage = new DashboardPage();
	      reportsPage = new ReportsPage();
	      dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	      dashboardPage.clickOnlistPageBtn();
	      reportsPage = dashboardPage.clickOnReportsPageBtn();
	      aadNewReportsPage = reportsPage.ClickOnAddNewRepoBut(); 
	      aadNewReportsPage.AddNewReportsForm(RepName/*, SelectionCriteria , Include, SelectDisplayFieldGroup,SelectDisplayField*/);
	}
}
