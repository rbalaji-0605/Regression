package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	@FindBy(name = "firstname")
	@CacheLookup
	public WebElement firstName;

	@FindBy(name = "email")
	@CacheLookup
	public WebElement emailAddress;


	@FindBy(name = "password")
	@CacheLookup
	public WebElement password;


	@FindBy(id = "checkbox")
	@CacheLookup
	public WebElement termsAndConditions;


	@FindBy(className = "signup_button")
	@CacheLookup
	public WebElement signUp;


	@FindBy(xpath = "//a[@class='google_login']")
	@CacheLookup
	public WebElement signUpUsingGoogle;


	@FindBy(xpath = "//a[@class='facebook_login']")
	@CacheLookup
	public WebElement signUpUsingFacebook;


	@FindBy(xpath = "/a/span[contains(text(),'Log In')]")
	@CacheLookup
	public WebElement logIn;
	
	
	@FindBy(xpath = "//a[contains(text(),'Pricing')]")
	@CacheLookup
	public WebElement pricing;



	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
