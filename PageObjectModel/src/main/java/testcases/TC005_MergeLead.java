package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadWindowPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_MergeLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Merge Lead";
		testDescription ="Merge Lead for leafTest";
		category = "Functional";
		authors = "Hari/Siva";
		browserName = "chrome";
		dataSheetName = "TC005";
	}
	
	@Test (dataProvider="fetchData")
	public void mergeLead(String uName, String psw, String leadID1, String leadID2, String errormessage){
		
		 FindLeadWindowPage flwp=  new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(psw)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickMergeLeads()
		.clickFromLeadIcon()	
		.switchToFindLeadWindow()
		.enterLeadId(leadID1)
		.clickFindLead();
		 
		 String fromleadID = flwp.captureFirstResultLeadId();
		 
		 flwp.clickFirstResultLead()
		 .switchToMergeLeadPage()
		 .clickToLeadIcon()
		 .switchToFindLeadWindow()
		 .enterLeadId(leadID2)
		 .clickFindLead()
		 .clickFirstResultLead()
		 .switchToMergeLeadPage()
		 .clickMergeLead()
		 .acceptMergeAlert()
		 .clickFindLead()
		 .enterLeadId(fromleadID)
		 .clickFindLeads()
		 .verifyErrorMessage(errormessage);
		 
		 
		 
		 
		 
		 

		
	}

}
