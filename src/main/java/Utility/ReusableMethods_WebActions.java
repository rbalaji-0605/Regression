package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods_WebActions extends BrowserClass{

	private Set<String> noOfWindows;
	private Actions action;
	private Robot robot;

	
	
	public void performType(WebElement element,String value) {
		
		element.sendKeys(value);

	}

	public void performClick(WebElement element) {
		element.click();
	}

	
	public void performDoubleClick(WebElement element) {
		
		action=new Actions(driver);
		action.doubleClick(element);
	}


	public void performFrameSwitch(String frameTitle) {
		
		driver.switchTo().frame(frameTitle);
	}
	
	public void performDrag(WebElement element) {
		action=new Actions(driver);
		action.clickAndHold(element).moveByOffset(45, 45).build().perform();
	}

	public void performMoveTextContainer(WebElement element,int x,int y) throws AWTException {
		action=new Actions(driver);

		WebElement elem =driver.findElement(By.xpath("//div[contains(@class,'inner-box')]"));
	//	action.dragAndDropBy(element, x, y).perform();
		action.clickAndHold(elem).moveByOffset(x,y).build().perform();
//		action.moveToElement(elem).clickAndHold().build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//				js.executeScript("arguments[0].style.transform=\"translate(0px,0px)\";", element);
	}


	public void performWindowNavigation(String expectedPageTitle) {

		noOfWindows=driver.getWindowHandles();

		for(String window:noOfWindows) {
			String actualPageTitle=driver.getTitle();

			if(actualPageTitle.equalsIgnoreCase(expectedPageTitle)) {
				break;
			}
			else {
				driver.switchTo().window(window);
			}



		}

	}

	public void performWindowNavigationWithPartialTitle(String expectedPageTitle) {

		noOfWindows=driver.getWindowHandles();
		
		for(String window:noOfWindows) {
			String actualPageTitle=driver.getTitle();

			if(actualPageTitle.contains(expectedPageTitle)) {
				break;
			}
			else {
				driver.switchTo().window(window);
			}



		}

	}
	
	public void performWait(WebElement element, WebDriverWait wait) {
		
		wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}



}
