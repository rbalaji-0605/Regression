package PageActions;

import org.openqa.selenium.WebElement;

import PageObjectModel.Yopmail_HomePage;
import Utility.BrowserClass;
import Utility.ReadPropertiesFile;
import Utility.ReusableMethods_WebActions;

public class Yopmail_HomePageAction extends BrowserClass {

	private ReusableMethods_WebActions reuse;
	private Yopmail_HomePage yophome;
	private ReadPropertiesFile readFile;
	
	public Yopmail_HomePageAction() {
		yophome=new Yopmail_HomePage(driver);
		reuse=new ReusableMethods_WebActions();
		readFile=new ReadPropertiesFile();
	}
	
	
	
	public void enterEmailAddress() {
		
		reuse.performType(yophome.emailAddress, readFile.getYopmailAddress());
		
	}
	
	public void clickCheckInbox() {
		
		reuse.performClick(yophome.checkMailInbox);
		
	}
	
}
