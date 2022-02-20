package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy(id="mySidenav_name")
	@CacheLookup
	public WebElement usernameSideNavBar;
	
	
	@FindBy(id="searchTemplate")
	@CacheLookup
	public WebElement templateSearchBar;
	
	
	@FindBy(xpath="//div[@class='pricing_btn']/a[contains(text(),'Templates')]")
	@CacheLookup
	public WebElement templates;
	
	@FindBy(xpath="//div[@class='pricing_btn']/a[contains(text(),'Pricing')]")
	@CacheLookup
	public WebElement pricing;
	

	@FindBy(xpath="//div[@class='support_btn']/a[contains(text(),'Support')]")
	@CacheLookup
	public WebElement support;
	
	
	@FindBy(xpath="//div[@class='demo_block']/a")
	@CacheLookup
	public WebElement bookDemo;
	
	
	@FindBy(xpath="//div[@class='profile_image_icon']")
	@CacheLookup
	public WebElement profile_settingIcon;
	
	
	@FindBy(xpath="//a/div[contains(text(),'Sign out')]")
	@CacheLookup
	public WebElement sign_out;
	
	
	
	@FindBy(xpath="//div[@class='create_block']")
	@CacheLookup
	public WebElement create_a_design;
	
	@FindBy(xpath="//div[@class='create_button']")
	@CacheLookup
	public WebElement create;
	
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'All Templates')]")
	@CacheLookup
	public WebElement all_Templates;
	
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'YouTube Thumbnail')]")
	@CacheLookup
	public WebElement youtube_thumbnail;
	
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'YouTube Banner')]")
	@CacheLookup
	public WebElement youtube_banner;
	
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'Logo')]")
	@CacheLookup
	public WebElement logo;
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'Instagram Post')]")
	@CacheLookup
	public WebElement instagram_post;
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'Instagram Story')]")
	@CacheLookup
	public WebElement instagram_story;
	
	@FindBy(xpath="//div[@id='categorieslist-block']/a/button[contains(text(),'Facebook Ad')]")
	@CacheLookup
	public WebElement facebook_ad;
	
	
	
	
	
	 public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	 

}
