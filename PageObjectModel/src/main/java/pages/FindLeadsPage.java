package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers {
	
	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not my Find Leads Page", "FAIL");
		}
	}
	public FindLeadsPage clickPhoneTab()
	{
		clickByXpath("//span[text()='Phone']");
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String data){
		enterByXpath("//input[@name='phoneNumber']", data);
		return this;
	}
	public FindLeadsPage clickFindLeads(){
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	public ViewLeadPage clickFirstResultLead(){
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return new ViewLeadPage(driver, test);
	}
	public String captureFirstResultLeadId(){
		String leadId = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return leadId ;
	}
	public String caputureFirstResultFirstName(){
		String fName = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		return fName;
	}
	
	
	public FindLeadsPage clickEmailTab(){
		clickByXpath("//span[contains(text(),'Email')]");
		return this;
	}
	public FindLeadsPage enterEmailAddress(String data){
		enterByXpath("//input[@name='emailAddress']",data);
		return this;
	}
	public FindLeadsPage enterFirstName(String data){
		enterByXpath("(//input[@name='firstName'])[3]",data);
		return this;
	}
	public FindLeadsPage enterLeadId(String data){
		enterByXpath("//input[@name='id']",data);
		return this;
	}
	public FindLeadsPage verifyErrorMessage(String data){
		verifyTextByXpath("//div[contains(text(),'No records to display')]", data);
		return this;
	}
	
}
