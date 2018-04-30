package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Login Page", "FAIL");
		}		
	}
	
	public LoginPage enterUserName(String data){
		enterById("username", data);
		return this;
	}
	
	public LoginPage enterPassword(String data){
		enterById("password", data);
		return this;
	}
	
	public HomePage clickLogin(){
		clickByClassName("decorativeSubmit");		
		/*HomePage hp = new HomePage();
		return hp;*/		
		return new HomePage(driver, test);		
	}
	
	public LoginPage clickLoginforFailure(){
		clickByClassName("decorativeSubmit");		
		/*HomePage hp = new HomePage();
		return hp;*/		
		return this;		
	}
	
	public LoginPage verifyLoginDetails(String text){
		verifyTextContainsById("errorDiv", text);
		return this;
	}

}











