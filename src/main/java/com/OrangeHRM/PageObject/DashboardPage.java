package com.OrangeHRM.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.PIMPageObject.EmployeeListPage;
import com.OrangeHRM.actiondriver.Action;

public class DashboardPage extends Base {

	Action action = new Action();

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	private WebElement title;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement PIMPageBtn;
	
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
}
