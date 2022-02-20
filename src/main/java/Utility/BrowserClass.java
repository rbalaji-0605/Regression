package Utility;




import Utility.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserClass {

	public static WebDriver driver;
	public ReadPropertiesFile readProp;
	private String url;
	
	private String environment;

	
	public void browserSetup(String browser,String env) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		environment = env;
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void launchApplication() {
		readProp=new ReadPropertiesFile();
		
		url = readProp.getURL(environment);
		driver.get(url);
	}
	
	
	

}
