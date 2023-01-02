package com.OrangeHRM.PIMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class Conf_AddTerminationReasons extends Base{
	Action action = new Action();
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[5]")
	private WebElement TerminationReasons;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	private WebElement AddTerminationReasonBuuton;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	private WebElement Name;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	private WebElement SaveBuuton;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div[6]/div/div/div/div[2]/div/div/button[1]")
	private WebElement DeleteBuuton;
	
	public Conf_AddTerminationReasons() {
		PageFactory.initElements(getDriver(), this);
	}

    public void AddTerminationReasons () {
    	action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), TerminationReasons);
		action.click(getDriver(), AddTerminationReasonBuuton);
		String name = "Other2";
		action.typestring( Name, name);
		action.click(getDriver(), SaveBuuton);
    }
	
    public void DeleteTerminationReasons() {
    	action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), DeleteBuuton);
	
    }
	
	
}
