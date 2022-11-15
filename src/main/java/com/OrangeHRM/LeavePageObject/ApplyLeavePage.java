package com.OrangeHRM.LeavePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class ApplyLeavePage extends Base{

	Action action = new Action();
	
	@FindBy(name = "username")
	private WebElement username;

	public ApplyLeavePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void login() {
	}

}
