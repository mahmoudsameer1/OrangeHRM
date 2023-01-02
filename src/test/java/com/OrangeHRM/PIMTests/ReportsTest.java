package com.OrangeHRM.PIMTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.ReportsPage;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;

public class ReportsTest extends Base {
	  private ReportsPage reportsPage ;
	  private LoginPage loginPage; ;  
	  private DashboardPage dashboardPage;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() {
		//getDriver().quit();
	}

	@Test
	public void Search_for_Report() throws InterruptedException {
		 reportsPage = new ReportsPage();
	      loginPage  = new LoginPage();
	      dashboardPage = new DashboardPage();
	      reportsPage = new ReportsPage();
	      dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	      dashboardPage.clickOnlistPageBtn();
	      reportsPage = dashboardPage.clickOnReportsPageBtn();
	      reportsPage.Search_the_report();
	      reportsPage. DeleteReport();
	    
	}

}
