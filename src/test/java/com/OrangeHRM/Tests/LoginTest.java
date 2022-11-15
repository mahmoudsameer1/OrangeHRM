package com.OrangeHRM.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;
import com.OrangeHRM.dataprovider.DataProviders;
import com.OrangeHRM.utility.Log;;

public class LoginTest extends Base {

	private LoginPage loginPage;
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

	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String uname, String pswd) throws Throwable {
		Log.startTestCase("loginTest");
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		
		dashboardPage = loginPage.login(uname, pswd);
		String actTitle =dashboardPage.VerifyTitle();
		String expTitle = "Dashboard";
		Assert.assertEquals(actTitle, expTitle);

	}

}
