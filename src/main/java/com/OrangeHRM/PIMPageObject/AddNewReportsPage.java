package com.OrangeHRM.PIMPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class AddNewReportsPage extends Base{
    Action action = new Action();
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")
	private WebElement Repname;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownList;
	
	@FindBy(  xpath = "[div.oxd-select-text-input]")
	private WebElement Selectioncriteria;

	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i	")
	private WebElement clickDrowpdownList2;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")
	private WebElement include;

	@FindBy(  xpath = "	//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownList3;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement Selectdisplayfieldgroup;
	
	
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement Selectdisplayfieldgroup1;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/i")
	private WebElement clickDrowpdownList4;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]")
	private WebElement Selectdisplayfield;
	
	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")
	private WebElement Savebutton;

	//@FindBy(  id = "//div[@id='oxd-toaster_1']")
	//private WebElement message;
	
	public AddNewReportsPage() {
		PageFactory.initElements(getDriver(), this); 
	
	}

	public void AddNewReportsForm(String RepName/*, String SelectionCriteria, String Include , String SelectDisplayFieldGroup , String SelectDisplayField*/) throws InterruptedException{	
		action.implicitWait(getDriver(), 10);
		action.typestring(Repname, RepName);
	    /*action.click(getDriver() , clickDrowpdownList);
	    action.selectBySendkeys(SelectionCriteria,Selectioncriteria);*/
		/*action.click(getDriver() , clickDrowpdownList2);
		action.selectBySendkeys( Include ,include);
		action.click(getDriver() , clickDrowpdownList3);
		action.selectBySendkeys( SelectDisplayFieldGroup ,Selectdisplayfieldgroup);
		action.click(getDriver() , clickDrowpdownList4);
		action.selectBySendkeys(SelectDisplayField ,Selectdisplayfield);
		action.click(getDriver() , Savebutton);
		//action.getText(message);
		//System.out.println (  message+ "===============================");
		 * 
		 */
	}
}
