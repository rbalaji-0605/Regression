package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yopmail_HomePage {
	
	
	@FindBy(xpath="//div/input[@id='login']")
	@CacheLookup
	public WebElement emailAddress;
	
	
	@FindBy(xpath="//div[@id='refreshbut']/button")
	@CacheLookup
	public WebElement checkMailInbox;
	
	
	public Yopmail_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
