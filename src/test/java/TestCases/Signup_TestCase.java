package TestCases;

import org.testng.annotations.Test;

import PageActions.DashboardPageAction;
import PageActions.LoginPageAction;
import PageActions.SignupPageAction;
import PageActions.Yopmail_HomePageAction;
import PageActions.Yopmail_InboxPageAction;
import Utility.BrowserClass;
import Utility.LaunchYopMail;
import Utility.ReadPropertiesFile;


import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Signup_TestCase extends BrowserClass{

	
	private SignupPageAction signupAct;
	private LoginPageAction loginAct;
	private ReadPropertiesFile readFile;
	private DashboardPageAction dashAct;
	private Yopmail_HomePageAction yopHomeAct;
	private Yopmail_InboxPageAction yopInboxAct;
	
	private LaunchYopMail launchYop;

	@Parameters({"browser","environment"})
	@BeforeClass
	public void setup(String browser,String environment) {
		readFile=new ReadPropertiesFile();
		browserSetup(browser,environment);
		

	}

	@Test
	public void validate_the_User_is_able_to_SignUp() throws InterruptedException {
		launchApplication();
		
		loginAct=new LoginPageAction();
		
		loginAct.verifyTitle();
		loginAct.clickSignUp();
		
		
		signupAct=new SignupPageAction();
		
		signupAct.verifyTitle();
		signupAct.enterFirstname();
		signupAct.enterEmailAddress();
		signupAct.enterPassword();
		signupAct.selectTermsAndConditions();
		signupAct.clickSignUp();
		
		
		launchYop=new LaunchYopMail();
		launchYop.launchYopMail();
		
		
		yopHomeAct=new Yopmail_HomePageAction();
		
		yopHomeAct.enterEmailAddress();
		yopHomeAct.clickCheckInbox();
		
		
		yopInboxAct=new Yopmail_InboxPageAction();
		
		yopInboxAct.readMailInbox();
		yopInboxAct.activatePicmakerAccount();
		
		
		dashAct=new DashboardPageAction();
		
		dashAct.navigateToPicmakerDashBoard();
		dashAct.verifyTitle();
		dashAct.readUsername();
		dashAct.clickProfileSetting();
		dashAct.clickSignout();
		
		

	}


	@Test
	public void validate_the_User_is_able_to_SignUp_UsingGoogle() {

	}

	@Test
	public void validate_the_User_is_able_to_Signup_UsingFacebook() {

	}


	@AfterClass
	public void browserClose() {
		driver.quit();
	}

}
