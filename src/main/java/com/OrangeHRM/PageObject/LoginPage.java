package com.OrangeHRM.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class LoginPage extends Base {

	Action action = new Action();

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public DashboardPage login(String uname, String pswd) throws InterruptedException {

		action.typestring(username, uname);
		action.typestring(password, pswd);
		action.click(getDriver(), loginBtn);
		Thread.sleep(4000);
		return new DashboardPage();
	}
}
