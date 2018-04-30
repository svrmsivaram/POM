package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM"))
		{
			reportStep("This is not View Lead page", "FAIL");
		}
	}
	
	public ViewLeadPage verifyFirstName(String data)
	{
		verifyTextById("viewLead_firstName_sp", data);
		return this;
	}
	public ViewLeadPage verifyCompanyName(String data)
	{
		verifyTextContainsById("viewLead_companyName_sp", data);
		return this;
	}
	public LeadsPage clickDeleteLead(){
		clickByLink("Delete");
		return new LeadsPage(driver, test);
	}
	public ViewLeadPage enterLeadId(String data)
	{
		enterByXpath("//input[@name='id']",data);
		return this;
	}
	public ViewLeadPage verifyErrorMessage(String text){
		verifyTextByXpath("//div[contains(text(),'No records to display')]", text);
		return this;
	}
	public DuplicateLeadPage clickDuplicateLead(){
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver, test);
	}
	public FindLeadsPage clickFindLead(){
		clickByLink("Find Leads");
		return new FindLeadsPage(driver, test);
	}
	
	public EditLeadpage clickEditLead(){
		clickByLink("Edit");
		return new EditLeadpage(driver, test);
	}

	
}
