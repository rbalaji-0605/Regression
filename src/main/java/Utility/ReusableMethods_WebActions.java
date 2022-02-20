package Utility;

import java.util.Set;

import org.openqa.selenium.WebElement;

public class ReusableMethods_WebActions extends BrowserClass{
	
	private Set<String> noOfWindows;
	
	public void performType(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	
	public void performClick(WebElement element) {
		element.click();
	}

	
	
	public void performFrameSwitch(String frameTitle) {
		driver.switchTo().frame(frameTitle);
	}
	
	public void performUrlLaunc(String url) {
		
	}
	
	
	public void performWindowNavigation(String expectedPageTitle) {
		
		noOfWindows=driver.getWindowHandles();
		System.out.println("After activating :"+ noOfWindows.size());
		for(String window:noOfWindows) {
			String actualPageTitle=driver.getTitle();
			
			driver.switchTo().window(window);
			
			if(actualPageTitle.equalsIgnoreCase(expectedPageTitle)) {
				break;
			}
			
			
		}
		
	}
	
	
	
}
