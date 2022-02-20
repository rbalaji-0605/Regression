package Utility;



import PageActions.Yopmail_HomePageAction;
import PageActions.Yopmail_InboxPageAction;
import PageObjectModel.Yopmail_HomePage;
import PageObjectModel.Yopmail_InboxPage;

public class LaunchYopMail extends BrowserClass{

	

	private ReadPropertiesFile readFile;
	private ReusableMethods_WebActions reuse;
	
	
	public LaunchYopMail() {
		reuse=new ReusableMethods_WebActions();
		readFile=new ReadPropertiesFile();
		
	}
	
	
	
	
	public void launchYopMail() {
		String url=readFile.getYopmailURL();
		driver.get(url);
		
	}
	
}
