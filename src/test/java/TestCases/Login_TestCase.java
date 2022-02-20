package TestCases;

import org.testng.annotations.Test;

import PageActions.LoginPageAction;

import Utility.BrowserClass;



import org.testng.annotations.Parameters;




import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Login_TestCase extends BrowserClass{

	
	private LoginPageAction loginAct;
	



	@Parameters({"browser","environment"})
	@BeforeClass
	public void setup(String browser,String environment) {
		
		browserSetup(browser,environment);
		
	
	}

	@Test
	public void validate_the_User_is_able_to_Login_to_an_existing_account() {
		launchApplication();
		
		loginAct=new LoginPageAction();
		
		loginAct.verifyTitle();
	
		loginAct.enterUsername();
		loginAct.enterPassword();
		loginAct.clickLoginButton();
		
		
		

	}
	
	@Test
	public void validate_the_User_is_able_to_View_the_Home_Page() {
		
	}
	
	
	
	@Test
	public void validate_the_user_is_able_to_View_the_Menu_Options_on_Tap() {
		
	}
	
	@AfterClass
	public void tearDown() {
		//closeBrowser();
	}

}
