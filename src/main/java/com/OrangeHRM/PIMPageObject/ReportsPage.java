package com.OrangeHRM.PIMPageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.Base;
import com.OrangeHRM.actiondriver.Action;

public class ReportsPage extends Base{

	Action action = new Action();
	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")
	private WebElement ReportName;

	@FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	private WebElement AddNewReportbutton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	private WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]")
	private List<WebElement> searchReports;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]")
	private WebElement showinfOneReport;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i")
	private WebElement Editreport;

	@FindBy(  xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button[1]")
	private WebElement DeletebuttonE;

	@FindBy(  xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[1]")
	private WebElement DeleteMessageOk;
	
	public ReportsPage() {
		PageFactory.initElements(getDriver(), this);
	}

    public void  Search_the_report() {
		action.implicitWait(getDriver(), 10);
		action.typestring( ReportName,  "Employee Contact info repor");
		action.implicitWait(getDriver(), 10);
		action.click(getDriver(), searchButton);
		action.implicitWait(getDriver(), 20);
		
		for( WebElement emp : searchReports){
			if(emp.getText()== "Employee Contact info repor") {
				System.out.println("We Found the correct employee");
				break;
			}else { continue;
				
			}
		}
	}
	
    public AddNewReportsPage ClickOnAddNewRepoBut() {
		action.click(getDriver(),AddNewReportbutton );
		return new AddNewReportsPage();
	} 
    
    public EditReportPage ClickEditReport() {
    	action.click(getDriver(), Editreport);
		return new EditReportPage();		
	}


	public void DeleteReport( ) {	
		action.implicitWait(getDriver(), 10);
		action.click(getDriver() , DeletebuttonE);
		action.click(getDriver() , DeleteMessageOk);
	}
	
}
