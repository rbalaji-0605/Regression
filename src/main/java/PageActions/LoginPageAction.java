package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjectModel.LoginPage;
import Utility.BrowserClass;
import Utility.ReadPropertiesFile;
import Utility.ReusableMethods_WebActions;

public class LoginPageAction extends BrowserClass{

	private LoginPage loginObj;
	private ReadPropertiesFile readFile;
	private ReusableMethods_WebActions reuse;

	
	public LoginPageAction() {
		readFile=new ReadPropertiesFile();
		reuse=new ReusableMethods_WebActions();
		loginObj=new LoginPage(driver);
	}

	public void enterUsername() {
		

		reuse.performType(loginObj.emailAddress, readFile.getUsername());


	}

	public void enterPassword() {
		reuse.performType(loginObj.password, readFile.getPassword());


	}

	public void clickLoginButton() {

		reuse.performClick(loginObj.signInButton);


	}

	public void clickForgotPassword() {

		reuse.performClick(loginObj.forgotPassword);

	}

	public void clickSignUp() {

		reuse.performClick(loginObj.signUp);

	}

	public void clickLanguageChange() {
		
		reuse.performClick(loginObj.languageOption);

	}

	public void clickNavBarSignUp() {
		
		reuse.performClick(loginObj.navbar_signUp);

	}

	public void clickSignInWithGoogle() {
		
		reuse.performClick(loginObj.signInWithGoogle);


	}

	public void clickSignInWithFacebook() {
		
		reuse.performClick(loginObj.signInWithFacebook);

	}

	public void clickPricing() {

		reuse.performClick(loginObj.pricing);



	}

	public String verifyTitle() {

		String expectedTitle="Picmaker: Login";
		String actualTitle= driver.getTitle().trim();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Current Page Title :"+ actualTitle);
		return actualTitle;
	}



}
