package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjectModel.SignupPage;
import Utility.BrowserClass;
import Utility.ReadPropertiesFile;
import Utility.ReusableMethods_WebActions;

public class SignupPageAction extends BrowserClass{

	
	private SignupPage signupObj;
	private ReusableMethods_WebActions reuse;
	private ReadPropertiesFile readFile;
	

	public SignupPageAction() {
		reuse=new ReusableMethods_WebActions();
		readFile =new ReadPropertiesFile();
		signupObj=new SignupPage(driver);


	}

	public void enterFirstname() {
		reuse.performType(signupObj.firstName, readFile.getFirstName());
		


	}

	public void enterEmailAddress() {
		
		reuse.performType(signupObj.emailAddress,readFile.getYopmailAddress());
		


	}

	public void enterPassword() {
	
		reuse.performType(signupObj.password,readFile.getNewUserPassword());
		

	}
	
	public void selectTermsAndConditions() {
		
		reuse.performClick(signupObj.termsAndConditions);



	}

	public void clickSignUp() {
		
		reuse.performClick(signupObj.signUp);
		

	}

	public void clickSignUpWithGoogle() {
		reuse.performClick(signupObj.signUpUsingGoogle);
		

	}

	public void clickSignUpWithFacebook() {
		reuse.performClick(signupObj.signUpUsingFacebook);
		

	}
	
	public void verifyTitle() {
		String expectedTitle="Picmaker: Register";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Current Page Title :"+ actualTitle);
	}

}
