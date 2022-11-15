package com.OrangeHRM.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PageObject.LoginPage;
import com.OrangeHRM.dataprovider.DataProviders;
import com.OrangeHRM.utility.Log;

public class DashboardTest extends Base{

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
	public void loginTest() throws Throwable {

	}
	
}
