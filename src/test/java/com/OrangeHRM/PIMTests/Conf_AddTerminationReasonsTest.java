package com.OrangeHRM.PIMTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.Conf_AddTerminationReasons;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;

    public class Conf_AddTerminationReasonsTest extends Base {
		  private Conf_AddTerminationReasons conf_AddTerminationReasons ;
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

			@Test()
			public void Search_for_Report( ) throws InterruptedException {
			      loginPage  = new LoginPage();
			      dashboardPage = new DashboardPage();
			      conf_AddTerminationReasons = new Conf_AddTerminationReasons();
			      dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
			      dashboardPage.clickOnlistPageBtn();
			      conf_AddTerminationReasons = dashboardPage.clickCoAddTerminationReasons();
			      conf_AddTerminationReasons.AddTerminationReasons();
			      conf_AddTerminationReasons.DeleteTerminationReasons();
			}

}
