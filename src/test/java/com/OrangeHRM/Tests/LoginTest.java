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

	
	@Test
	public void loginTest() throws InterruptedException {
		//Log.startTestCase("loginTest");
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		
		dashboardPage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String actTitle =dashboardPage.VerifyTitle();
		String expTitle = "Dashboard";
		Assert.assertEquals(actTitle, expTitle);

	}

}
