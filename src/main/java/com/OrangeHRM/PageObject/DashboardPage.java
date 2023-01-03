package com.OrangeHRM.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.Conf_AddReportingMethods;
import com.OrangeHRM.PIMPageObject.Conf_AddTerminationReasons;
import com.OrangeHRM.PIMPageObject.ConfigurationOptionsPage;
import com.OrangeHRM.PIMPageObject.EmployeeListPage;
import com.OrangeHRM.PIMPageObject.ReportsPage;
import com.OrangeHRM.PIMPageObject.configurationOptions_AddCustom;
import com.OrangeHRM.actiondriver.Action;

public class DashboardPage extends Base {

	Action action = new Action();

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	private WebElement title;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement PIMPageBtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement listPageBtn;

	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")
	private WebElement ReportsPageBtn;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span/i")
	private WebElement ClickConfiguration;
	
	public DashboardPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String VerifyTitle() {
		String titleText =action.getText(title);
		return titleText;
	}

	public EmployeeListPage clickOnPIMPageBtn() {
		
		action.click(getDriver(), PIMPageBtn);
		return new EmployeeListPage();
	}
	
    public EmployeeListPage clickOnlistPageBtn() {
		action.implicitWait(getDriver(), 5000);
		action.click(getDriver(),listPageBtn);
		return new EmployeeListPage();
	}
   public ReportsPage clickOnReportsPageBtn() {
		action.implicitWait(getDriver(), 5000);
		action.click(getDriver(),ReportsPageBtn);
     	return new ReportsPage();
	  }
    public ConfigurationOptionsPage clickConfiguration() {
		action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), ClickConfiguration);
    	return new  ConfigurationOptionsPage ();
	  }
    public configurationOptions_AddCustom clickcoCustomFieldsPage() {
  		action.implicitWait(getDriver(), 5000);
  		action.click(getDriver(), ClickConfiguration);
      	return new  configurationOptions_AddCustom();
  	  }
    
    public Conf_AddReportingMethods clickcofAddReportingMethods() {
  		action.implicitWait(getDriver(), 5000);
  		action.click(getDriver(), ClickConfiguration);
      	return new  Conf_AddReportingMethods();
  	  }
    
    public Conf_AddTerminationReasons clickCoAddTerminationReasons() {
  		action.implicitWait(getDriver(), 5000);
  		action.click(getDriver(), ClickConfiguration);
      	return new Conf_AddTerminationReasons();
  	  }
   
   
   
   
}
