package com.OrangeHRM.PIMPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;
public class ConfigurationOptionsPage extends Base{

	Action action = new Action();
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a")
	private WebElement OptionalFields;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/label/span")
	private WebElement ClickShowDeprecatedFields;

	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/label/span")
	private WebElement ClickShowSSNfieldinPersonalDetails;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/label/span")
	private WebElement ClickShowSINfieldinPersonalDetails;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/label/span")
	private WebElement ClickShowUSTaxExemptionsmenu;
	
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button")
	private WebElement Savebuuton;
	
	
	
	
	public ConfigurationOptionsPage() {
		PageFactory.initElements(getDriver(), this);
	}

    public void SelectOptionalFields() {
    	action.implicitWait(getDriver(), 5000);
		action.click(getDriver(), OptionalFields);
		action.click(getDriver(), ClickShowDeprecatedFields);
		action.click(getDriver(), ClickShowSSNfieldinPersonalDetails);
		action.click(getDriver(), ClickShowSINfieldinPersonalDetails);
		action.click(getDriver(), ClickShowUSTaxExemptionsmenu);
		action.click(getDriver(), Savebuuton);	
	}
	  
    
	
	
}
