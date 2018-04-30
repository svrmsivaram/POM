package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {

	public MyHomePage(RemoteWebDriver driver, ExtentTest Test){
		this.driver = driver;
		this.test = Test;
		
		if(!verifyTitle("My Home | opentaps CRM"))
		{
			reportStep("This is not MyHomePage", "FAIL");
		}	
	}
	
	public LeadsPage clickLeadsTab(){
		clickByLink("Leads");
		return new LeadsPage(driver, test);
	}
	
}
