package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_DeleteLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Delete Lead";
		testDescription ="Delete Lead for leafTest";
		category = "Functional";
		authors = "Hari/Siva";
		browserName = "chrome";
		dataSheetName = "TC004";	
	}
	
	@Test (dataProvider="fetchData")
	public void deleteLead(String uName, String psw, String pNumber,String errorMessage){
	 FindLeadsPage flp =new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(psw)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickfindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(pNumber)
		.clickFindLeads();
		
		String leadId = flp.captureFirstResultLeadId();
		
		flp.clickFirstResultLead()
		.clickDeleteLead()
		.clickfindLeads()
		.enterLeadId(leadId)
		.clickFindLeads()
		.verifyErrorMessage(errorMessage);
		
		
		
	}

}
