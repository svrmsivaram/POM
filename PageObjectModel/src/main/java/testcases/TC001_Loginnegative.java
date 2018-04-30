package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_Loginnegative extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Login (negative)";
		testDescription ="Login failure";
		category = "Sanity";
		authors = "Babu";
		browserName = "chrome";
		dataSheetName = "TC002";
	}	
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String txt){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginforFailure()
		.verifyLoginDetails(txt);
		
		
		
	}

}
