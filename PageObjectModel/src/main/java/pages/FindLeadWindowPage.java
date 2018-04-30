package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadWindowPage extends LeafTapsWrappers {
	
	public FindLeadWindowPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads")){
			reportStep("This is not FindLead Window", "FAIL");
		}
	}
	public FindLeadWindowPage enterLeadId(String data){
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",data);
		return this;
	}
	public FindLeadWindowPage clickFindLead(){
		clickByXpath("//button[contains(text(),'Find Leads')]");
		return this;
	}
	public FindLeadWindowPage clickFirstResultLead(){
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return this;
	}
	public MergeLeadPage switchToMergeLeadPage(){
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}
	
	public String captureFirstResultLeadId(){
		String leadId = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return leadId ;
	}
	
}
