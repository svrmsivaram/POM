package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_DuplicateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValue(){
		testCaseName = "Duplicate Lead";
		testDescription ="Duplicate Leads for LeafTaps";
		category = "Functional";
		authors = "Hari/Siva";
		browserName = "chrome";
		dataSheetName = "TC006";	
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName, String psw,String eMail){
		
		 FindLeadsPage fls= new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(psw)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickfindLeads()
		.clickEmailTab()
		.enterEmailAddress(eMail)
		.clickFindLeads();
		 
		 String fName = fls.caputureFirstResultFirstName();
		 
		 fls.clickFirstResultLead()
		 .clickDuplicateLead()
		 .clickCreateLead()
		 .verifyFirstName(fName);
		
	}
	
	
	
	
}
