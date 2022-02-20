package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(name="email")
	@CacheLookup
	public WebElement emailAddress;
	
	@FindBy(name="password")
	@CacheLookup
	public WebElement password;
	
	@FindBy(xpath="//*/button[@class='login_button']")
	@CacheLookup
	public WebElement signInButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password')]")
	@CacheLookup
	public WebElement forgotPassword;
	
	
	
	@FindBy(xpath="//a/span[contains(text(),'Sign Up')]")
	@CacheLookup
	public WebElement signUp;
	
	
	@FindBy(xpath="//*[@class='nav-link signUpButton']")
	@CacheLookup
	public WebElement navbar_signUp;
	
	
	@FindBy(xpath="//*[@class='nav-link' and contains(text(),'Login')]")
	@CacheLookup
	public WebElement login;
	

	@FindBy(xpath="//*[@class='nav-link' and contains(text(),'Pricing')]")
	@CacheLookup
	public WebElement pricing;
	
	
	
	@FindBy(xpath="//*/span[@class='lang_change']")
	@CacheLookup
	public WebElement languageOption;
	
	
	@FindBy(xpath="//div[@class='language-popup']/div")
	@CacheLookup
	public List<WebElement> availableLanguages;
	
	
	
	@FindBy(xpath="//a[@class='google_login']/button")
	@CacheLookup
	public WebElement signInWithGoogle;
	
	@FindBy(xpath="//a[@class='facebook_login']/button")
	@CacheLookup
	public WebElement signInWithFacebook;

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
