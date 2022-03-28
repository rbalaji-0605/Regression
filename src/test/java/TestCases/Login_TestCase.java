package TestCases;

import org.testng.annotations.Test;

import PageActions.DashboardPageAction;
import PageActions.LoginPageAction;

import Utility.BrowserClass;



import org.testng.annotations.Parameters;





import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;


public class Login_TestCase extends BrowserClass{

	
	private LoginPageAction loginAct;
	private DashboardPageAction dashAct;
	



	
	@Parameters({"browser","environment"})
	@BeforeSuite
	public void setup(String browser,String environment) {
		
		browserSetup(browser,environment);
		launchApplication();
		
	
	}

	@Test
	public void validate_the_User_is_able_to_Login_to_an_existing_account() {
		
		
		loginAct=new LoginPageAction();
		
		loginAct.verifyTitle();
	
		loginAct.enterUsername();
		loginAct.enterPassword();
		loginAct.clickLoginButton();
		
		
		

	}
	
	@Test
	public void validate_the_User_is_able_to_View_the_Home_Page() throws InterruptedException {
		
		
		dashAct=new DashboardPageAction();
		
		dashAct.verifyTitle();
		dashAct.readUsername();
		
		
	}
	
	
	
	@Test
	public void validate_the_user_is_able_to_View_the_Menu_Options_on_Tap() {
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		dashAct.navigateToPicmakerDashBoard();
		
		dashAct.clickProfileSetting();
		dashAct.clickSignout();
		closeBrowser();
	}

}
