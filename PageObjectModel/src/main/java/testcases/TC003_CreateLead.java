package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Create Lead";
		testDescription ="Creating Leads for LeafTaps";
		category = "Functional";
		authors = "Hari/Siva";
		browserName = "chrome";
		dataSheetName = "TC003";	
	}
	
	@Test (dataProvider ="fetchData")
	public void createLead(String uname,String psw, String cName, String fName, String lName){
		
		new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(psw)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName(fName);
		
	}
	}
