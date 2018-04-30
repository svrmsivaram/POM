package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadpage extends LeafTapsWrappers {
	public EditLeadpage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Page", "FAIL");
		}
	}
	public EditLeadpage updateCompanyName(String data){
		enterById("updateLeadForm_companyName",data);
		return new EditLeadpage(driver, test);		
	}
	public ViewLeadPage clickUpdate(){
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		return new ViewLeadPage(driver, test);
	}

}