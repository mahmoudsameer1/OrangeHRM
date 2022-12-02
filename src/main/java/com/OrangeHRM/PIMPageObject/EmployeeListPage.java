package com.OrangeHRM.PIMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class EmployeeListPage extends Base{

	Action action = new Action();
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")
	private WebElement addEmpBtn;
	
	public EmployeeListPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public AddEmployeePage clickOnAddEmpBtn() {
		
		action.click(getDriver(), addEmpBtn);
		return new AddEmployeePage();
	}
}
