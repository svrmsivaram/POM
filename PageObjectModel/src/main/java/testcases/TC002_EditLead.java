package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_EditLead extends LeafTapsWrappers {

	
	@BeforeClass
	public void setValue(){
		testCaseName = "Edit Lead";
		testDescription ="Editing Leads for LeafTaps";
		category = "Functional";
		authors = "Hari/Siva";
		browserName = "chrome";
		dataSheetName = "TC002";
		
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String uName,String psw,String fName, String companyName){
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(psw)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickfindLeads()
		.enterFirstName(fName)
		.clickFindLeads()
		.clickFirstResultLead()
		.clickEditLead()
		.updateCompanyName(companyName)
		.clickUpdate()
		.verifyCompanyName(companyName);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
