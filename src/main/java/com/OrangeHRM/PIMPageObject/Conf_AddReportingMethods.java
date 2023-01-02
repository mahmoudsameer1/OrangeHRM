package com.OrangeHRM.PIMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class Conf_AddReportingMethods extends Base{
	Action action = new Action();
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[5]/a")
	private WebElement ReportingMethods;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	private WebElement AddReportingMethodsBuuton;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	private WebElement Name;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	private WebElement SaveBuuton;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div[1]/div/div/div/div[2]/div/div/button[1]")
	private WebElement DeleteBuuton;
	
	public Conf_AddReportingMethods() {
		PageFactory.initElements(getDriver(), this);
	}

    public void AddReportingMethods () {
    	action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), ReportingMethods);
		action.click(getDriver(), AddReportingMethodsBuuton);
		String name = "Repot Method6";
		action.typestring( Name, name);
		action.click(getDriver(), SaveBuuton);
    }
	
    public void DeleteReportingMethods() {
    	action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), DeleteBuuton);
	
    }
    
    
}
