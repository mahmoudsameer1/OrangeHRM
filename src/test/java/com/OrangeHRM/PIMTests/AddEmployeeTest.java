package com.OrangeHRM.PIMTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.AddEmployeePage;
import com.OrangeHRM.PIMPageObject.EmployeeListPage;
import com.OrangeHRM.PageObject.DashboardPage;
import com.OrangeHRM.PageObject.LoginPage;
import com.OrangeHRM.dataprovider.DataProviders;

public class AddEmployeeTest extends Base {

	private AddEmployeePage addEmployeePage;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private EmployeeListPage employeeListPage;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@Test(dataProvider = "AddNewEmployee", dataProviderClass = DataProviders.class)
	public void addNewEmployee(String firstName, String middleName,
			String lastName) throws InterruptedException {

		addEmployeePage = new AddEmployeePage();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		employeeListPage = new EmployeeListPage();

		dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		employeeListPage = dashboardPage.clickOnPIMPageBtn();
		addEmployeePage = employeeListPage.clickOnAddEmpBtn();
		addEmployeePage.vterifyTitle();
		String actpersonlinfoTitle = addEmployeePage.addNewEmp(firstName, middleName, lastName);
		String expTitle = "Personal Details";
		Assert.assertEquals(actpersonlinfoTitle, expTitle);
		
	}
}
