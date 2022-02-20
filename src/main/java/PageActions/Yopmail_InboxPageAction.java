package PageActions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjectModel.Yopmail_HomePage;
import PageObjectModel.Yopmail_InboxPage;
import Utility.BrowserClass;
import Utility.ReadPropertiesFile;
import Utility.ReusableMethods_WebActions;

public class Yopmail_InboxPageAction extends BrowserClass {


	private Yopmail_InboxPage yopInbox;
	private List<WebElement> senderName;
	private ReusableMethods_WebActions reuse;
	private Yopmail_HomePage yophome;
	private ReadPropertiesFile readFile;
	
	
	
	public Yopmail_InboxPageAction() {
		yopInbox=new Yopmail_InboxPage(driver);
		reuse=new ReusableMethods_WebActions();
		readFile=new ReadPropertiesFile();
	
	}



	public void readMailInbox() {
		
		
		switchToInboxListFrame();

		senderName = yopInbox.senderName;
		
		System.out.println(senderName.size());
		
		for(WebElement mail:senderName) {
			
			String text=mail.getText();
			if(text.equalsIgnoreCase("Picmaker")) {
				selectMailFromPicmaker(mail);
				
		}
			
			
		}
		

	}

	
	
	public void activatePicmakerAccount() {
		driver.switchTo().parentFrame();
		switchToMailContentFrame();
		reuse.performClick(yopInbox.ActivateAccount);
		
		
	}
	
	public void selectMailFromPicmaker(WebElement subjectName) {
		reuse.performClick(subjectName);
		
	
		
		
	}
	
	
	public void switchToInboxListFrame() {
		
		reuse.performFrameSwitch("ifinbox");
		
		
	}
	
	public void switchToMailContentFrame() {
		
		reuse.performFrameSwitch("ifmail");
		
		
	}
}
