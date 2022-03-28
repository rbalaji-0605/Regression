package PageActions;

import java.util.List;

import org.openqa.selenium.By;
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
	private List<WebElement> recentSearch;
	private List<WebElement> categories;

	public DashboardPageAction() {
		reuse=new ReusableMethods_WebActions();
		readFile=new ReadPropertiesFile();
		
		dashObj=new DashboardPage(driver);

	}


	public void useTemplatesSearchBar(String value) {
		reuse.performType(dashObj.templateSearchBar, value);
		


	}
	
	public void clickTemplatesSearchBar() {
		reuse.performClick(dashObj.templateSearchBar);
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
	
	public void validateSearchBarDropDown() {
		getRecentSearches();
	}
	
	
	public void navigateToPicmakerDashBoard() {
		
		reuse.performWindowNavigation(readFile.getPicmakerHomePageTitle());
	}


	public void verifyTitle() throws InterruptedException{
		
		Thread.sleep(2000);
		String expectedTitle="Dashboard";
		String actualTitle=driver.getTitle().trim();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Current Page Title :"+ actualTitle);
	}

	
	
	public void getRecentSearches() {
		recentSearch=dashObj.recentSearches;
		if(recentSearch.size()>=1) {
			System.out.println("* No of recent searches: "+recentSearch.size());
			for(int i=1;i<=recentSearch.size();i++) {
			String value=driver.findElement(By.xpath("//div[@id='search_dropdown_block']/div/div/button["+i+"][@class='userrecentsuggestions_category']")).getText();
			System.out.println("Recent Search "+i+ ":"+ value);
			
			
			}
		}
		else {
			System.out.println("* No recent searches");
		}
	}
	
	public void selectTemplateCategory() throws InterruptedException {
		
		categories = dashObj.listOfcategories;
		
		for(int i=1;i<=categories.size();i++) {
			String value=driver.findElement(By.xpath("//div[@id='viewallstartdesttransupdate111']/ul/li["+i+"]/a/p")).getText();
			if(value.equalsIgnoreCase(readFile.getCategoryName())) {
				System.out.println("Category Selected :"+value);
				driver.findElement(By.xpath("//div[@id='viewallstartdesttransupdate111']/ul/li["+i+"]")).click();
				break;
			}
			
			
			}
		
	}

}


