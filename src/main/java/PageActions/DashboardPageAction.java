package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjectModel.DashboardPage;
import Utility.BrowserClass;
import Utility.ReadPropertiesFile;
import Utility.ReusableMethods_WebActions;

public class DashboardPageAction extends BrowserClass{

	
	private DashboardPage dashObj;
	private ReusableMethods_WebActions reuse;
	private ReadPropertiesFile readFile;

	public DashboardPageAction() {
		reuse=new ReusableMethods_WebActions();
		readFile=new ReadPropertiesFile();
		
		dashObj=new DashboardPage(driver);

	}


	public void useTemplatesSearchBar(String value) {
		reuse.performType(dashObj.templateSearchBar, value);
		


	}

	public void clickTemplates() {
		reuse.performClick(dashObj.templates);
		

	}

	public void clickPricing() {
		reuse.performClick(dashObj.pricing);
		
	}

	public void clickSupport() {
		reuse.performClick(dashObj.support);
	
	}

	public void clickProfileSetting() {
		reuse.performClick(dashObj.profile_settingIcon);
		
	
	}	


	public void clickBookDemo() {
		reuse.performClick(dashObj.bookDemo);
		
	
	}	
	
	public void clickSignout() {
		reuse.performClick(dashObj.sign_out);
		
	
	}	
	
	public void readUsername() {
		String username=dashObj.usernameSideNavBar.getText();
		System.out.println("User logged in :"+username);
		
	}
	
	
	public void navigateToPicmakerDashBoard() {
		
		reuse.performWindowNavigation(readFile.getPicmakerHomePageTitle());
	}


	public void verifyTitle() throws InterruptedException {
		Thread.sleep(3000);
		String expectedTitle="Dashboard";
		String actualTitle=driver.getTitle().trim();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Current Page Title :"+ actualTitle);
	}


}


