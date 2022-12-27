package com.OrangeHRM.PIMPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class AddEmployeePage extends Base {

	Action action = new Action();

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")
	private WebElement terifyTitle;
	
	@FindBy(name = "firstName")
	private WebElement firstName;
	
	@FindBy(name = "middleName")
	private WebElement middleName;
	
	@FindBy(name = "lastName")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	private WebElement empID;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button")
	private WebElement addImgBtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
	private WebElement CreateLoginDetails;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	private WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")
	private WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")
	private WebElement presonalDetailsTitle;
	
	public AddEmployeePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String vterifyTitle() {
		
		String actTitle =action.getText(terifyTitle);
		return actTitle;
	}
	
	public String addNewEmp(String firstname, String middlename, String lastname,String username,String password,String Confirmpassword) throws InterruptedException {
		
		action.implicitWait(getDriver(),10);
		action.typestring(firstName, firstname);
		action.typestring(middleName, middlename);
		action.typestring(lastName, lastname);
		action.click(getDriver(), CreateLoginDetails);
		action.typestring(addImgBtn, "D:\\Eclips Work Space\\OrangeHRM\\src\\test\\resources\\Images\\istockphoto-926993450-612x612.jpg");
		action.typestring(userName, username);
		action.typestring( Password, password);
		action.typestring(ConfirmPassword,Confirmpassword);
		action.click(getDriver(), saveBtn);
		String actPersonalDetailsTitle = action.getText(presonalDetailsTitle);
		return actPersonalDetailsTitle;
	}
}
