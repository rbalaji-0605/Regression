package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Yopmail_InboxPage {
	
	
	//div[@class='mctn']/div[@class='m']/preceding-sibling::div[@class='mday' and contains(text(),'Friday')]
	
	@FindAll({@FindBy(xpath="//div[@class='mctn']/div[@class='m']")})
	@CacheLookup
	public List<WebElement> mailList; 
	

	
	@FindAll({@FindBy(xpath="//div[@class='mctn']/div[@class='m']/button/div/span[2]")})
	@CacheLookup
	public List<WebElement> senderName; 
	
	
	@FindAll({@FindBy(xpath="//div[@class='mctn']/div[@class='m']/button/div[2][@class='lms']")})
	@CacheLookup
	public List<WebElement> mailSubject;
	
	
	@FindBy(xpath="//*/a[contains(text(),'Activate my Picmaker account now')]")
	@CacheLookup
	public WebElement ActivateAccount;
	
	
	
	public Yopmail_InboxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	


}
