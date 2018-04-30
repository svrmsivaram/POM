package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_LoginLogOut extends LeafTapsWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Login & LogOut";
		testDescription ="Login and Logout of LeafTaps";
		category = "smoke";
		authors = "Nesa";
		browserName = "chrome";
		dataSheetName = "TC001";
	}	
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickLogOut();
		
		
		
	}

}
