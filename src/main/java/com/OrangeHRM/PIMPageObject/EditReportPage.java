
package com.OrangeHRM.PIMPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class EditReportPage extends Base {
Action action = new Action();
	
	//@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]")
	//private WebElement RepnameE;
	
/*	@FindBy(  xpath = "	//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownListE;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div/div[1]")
	private WebElement SelectioncriteriaE;

	@FindBy(  xpath = "	//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownList2E;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")
	private WebElement includeE;

	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownList3E;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement SelectdisplayfieldgroupE;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownList4E;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/d
	*/
	//@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")
	//private WebElement SavebuttonE;
	
	

	
	public EditReportPage() {
		PageFactory.initElements(getDriver(), this); 
	}

	/*public void EditReportsName(String NewReportname ) {	
		action.implicitWait(getDriver(), 10);
		String NewReportName ="The number of employees" ;
		action.typestring( RepnameE ,NewReportName);
		/*action.click(getDriver() , clickDrowpdownListE);
		action.selectBySendkeys(SelectionCriteriaE,SelectioncriteriaE);
		action.click(getDriver() , clickDrowpdownList2E);
		action.selectBySendkeys( IncludeE ,includeE);
		action.click(getDriver() , clickDrowpdownList3E);
		action.selectBySendkeys( SelectDisplayFieldGroupE ,SelectdisplayfieldgroupE);
		action.click(getDriver() , clickDrowpdownList4E);
		action.selectBySendkeys(SelectDisplayFieldE ,SelectdisplayfieldE);*/
		//action.click(getDriver() , SavebuttonE);}*/
	


	
}
