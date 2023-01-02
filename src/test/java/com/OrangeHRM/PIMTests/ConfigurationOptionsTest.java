package com.OrangeHRM.PIMTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.ConfigurationOptionsPage;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;

public class ConfigurationOptionsTest extends Base{
	  private ConfigurationOptionsPage configurationOptionsPage;
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
		      loginPage  = new LoginPage();
		      dashboardPage = new DashboardPage();
		      configurationOptionsPage = new ConfigurationOptionsPage();
		      configurationOptionsPage = new ConfigurationOptionsPage();
		      dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		      dashboardPage.clickOnlistPageBtn();
		      configurationOptionsPage = dashboardPage.clickConfiguration();
		      configurationOptionsPage. SelectOptionalFields();
		}

}
