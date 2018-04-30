package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not MergeLeadPage", "FAIL");
		}
	}
	public MergeLeadPage clickFromLeadIcon(){
		clickByXpath("(//img[@alt='Lookup'])[1]");
		return this;
	}
	public MergeLeadPage clickToLeadIcon(){
		clickByXpath("(//img[@alt='Lookup'])[2]");
		return this;
	}	
	public FindLeadWindowPage switchToFindLeadWindow(){
		switchToLastWindow();
		return new FindLeadWindowPage(driver, test);
	}
	public MergeLeadPage clickMergeLead(){
		clickByLinkNoSnap("Merge");
		return this;
	}
	public ViewLeadPage acceptMergeAlert(){
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
}
