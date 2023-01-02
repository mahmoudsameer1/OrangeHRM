package com.OrangeHRM.PIMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class configurationOptions_AddCustom extends Base {

	Action action = new Action();
	@FindBy( xpath = "")
	private WebElement CustomFields;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/button")
	private WebElement AddCustomFieldsBuuton;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input")
	private WebElement FieldName;

	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	private WebElement clickdropdownlist;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	private WebElement Screen;

	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i")
	private WebElement clickdropdownlist2;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement Type;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	private WebElement SaveBuuton;
	
	public configurationOptions_AddCustom() {
		PageFactory.initElements(getDriver(), this);
	}

    public void AddCustomFieldsPage(String Fieldname,String PersonalDetails,String TextorNumber) {
    	action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), CustomFields);
		action.click(getDriver(), AddCustomFieldsBuuton);
		action.selectBySendkeys(Fieldname , FieldName);
		action.click(getDriver(), clickdropdownlist);
		action.selectBySendkeys( PersonalDetails ,Screen);
		action.click(getDriver(), clickdropdownlist2);
		action.selectBySendkeys (TextorNumber ,Type);
		action.click(getDriver(), SaveBuuton);
    }
	
}
