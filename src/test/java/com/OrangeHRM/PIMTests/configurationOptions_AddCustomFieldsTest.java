package com.OrangeHRM.PIMTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.configurationOptions_AddCustom;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;
import com.OrangeHRM.dataprovider.DataProviders;

public class configurationOptions_AddCustomFieldsTest extends Base {
	  private configurationOptions_AddCustom configurationOptions_addCustom ;
	  private LoginPage loginPage; ;  
	  private DashboardPage dashboardPage;
		@Parameters("browser")
		@BeforeMethod
		public void setup(String browser) {
			launchApp(browser);
		}

		@AfterMethod
		public void tearDown() {
			getDriver().quit();
		}

		@Test(dataProvider = "configurationOptions_AddCustom", dataProviderClass = DataProviders.class)
		public void Search_for_Report(String Fieldname ,String PersonalDetails , String TextorNumber ) throws InterruptedException {
		      loginPage  = new LoginPage();
		      dashboardPage = new DashboardPage();
		      configurationOptions_addCustom = new configurationOptions_AddCustom();
		      dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		      dashboardPage.clickOnlistPageBtn();
		      configurationOptions_addCustom = dashboardPage.clickcoCustomFieldsPage();
		      configurationOptions_addCustom.AddCustomFieldsPage(Fieldname, PersonalDetails,TextorNumber);
		}

}
