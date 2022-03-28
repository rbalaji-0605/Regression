package PageActions;


import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.AppProject_Page;
import PageObjectModel.DashboardPage;
import Utility.BrowserClass;
import Utility.ReadPropertiesFile;
import Utility.ReusableMethods_WebActions;

public class AppSidePageAction extends BrowserClass{
	
	private ReusableMethods_WebActions reuse;
	private ReadPropertiesFile readFile;
	private AppProject_Page appObj;
	private WebDriverWait wait;
	
	public AppSidePageAction() {
		reuse=new ReusableMethods_WebActions();
		readFile=new ReadPropertiesFile();
		
		appObj=new AppProject_Page(driver);

	}

	public void changeProjectName() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reuse.performWait(appObj.untitledProjectName, wait);
		reuse.performClick(appObj.untitledProjectName);
		reuse.performType(appObj.untitledProjectName, readFile.getProjectName());
	}
	
	public void clickTextTab() {
		reuse.performWait(appObj.textTab, wait);
		reuse.performClick(appObj.textTab);
	}
	
	
	public void clickBackground() {
		reuse.performWait(appObj.backGround, wait);
		reuse.performClick(appObj.backGround);
	}
	
	public void applyGradientBackground() {
		reuse.performWait(appObj.basic_GradientShape, wait);
		reuse.performClick(appObj.basic_GradientShape);
	}
	
	
	public void selectBigText() {
		reuse.performClick(appObj.addBigText);
		WebElement ele=driver.findElement(By.xpath("//div[@id='0']"));
		Point point=ele.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("Coordinates :"+ x + " "+ y);
	}
	
	public void selectTitle() {
		reuse.performWait(appObj.addTitle, wait);
		reuse.performClick(appObj.addTitle);
	}
	
	public void changeTitle() {
		WebElement element = clickTextContainer();
		
		reuse.performType(element, readFile.getBigTextValue());
		
	}
	
	
	public void selectSubTitle() {
		reuse.performWait(appObj.addSubTitle, wait);
		reuse.performClick(appObj.addSubTitle);
	}
	public void selectBodyText() {
		reuse.performWait(appObj.addBodyText, wait);
		reuse.performClick(appObj.addBodyText);
	}
	public void selectBulletin() {
		reuse.performWait(appObj.addBulletin, wait);
		reuse.performClick(appObj.addBulletin);
	}
	
	public void moveTextContainer(int x,int y) throws AWTException {
		appObj=new AppProject_Page(driver);
		reuse.performMoveTextContainer(appObj.textContainer, 640, 454);
	}
	
	public void clickAndDragTextContainer() {
		reuse.performDrag(appObj.textHorizontalResize_Right);
	}
	
	public void clickNavBar_DownloadButton() {
		reuse.performClick(appObj.navBar_DownloadButton);
	}
	
	public void clickExportType_DownloadButton() {
		reuse.performClick(appObj.exportType_DownloadButton);
	}
	
	public void clickDownloadButton() {
		reuse.performClick(appObj.DownloadButton);
	}
	
	public void waitForDownloadToComplete() {
		reuse.performWait(appObj.downloadCopyLink, wait);
		
	}
	
	public void clickAddNewSlide() {
		reuse.performWait(appObj.addNewSlide, wait);
		reuse.performClick(appObj.addNewSlide);
		
	}
	
	public void clickPrebuiltText() {
		//reuse.performClick(null);
		selectPrebuilt(appObj.prebuiltList,readFile.getPrebuiltID());
		
	}
	
	public void clickSlide() {
		
		appObj=new AppProject_Page(driver);
		int size=appObj.noOfSlides.size()-1;
		reuse.performWait(appObj.addNewSlide, wait);
		
		WebElement element=driver.findElement(By.xpath("//div[contains(@id,'workspace-"+size+"')]"));
		reuse.performClick(element);
	}
	
public WebElement clickTextContainer() {
		
		appObj=new AppProject_Page(driver);
		int size=appObj.noOfTextContainer.size();
		
		
		WebElement element=driver.findElement(By.xpath("(//div[contains(@class,'text-container')])["+size+"]"));
		reuse.performDoubleClick(element);
		return element;
	}
	
	
	
	public void navigateToAppProject() {
		reuse.performWindowNavigationWithPartialTitle(readFile.getPicmakerApptitle());
	}
	
	
	public void selectPrebuilt(List<WebElement> list,String id) {
		
//		String text;
//		for(int i=1;i<list.size();i++) {
//			text=driver.findElement(By.xpath("(//img[contains(@id,'TEXT')])["+1+"]")).;
//			
//		}
		driver.findElement(By.xpath("//img[contains(@id,'"+id+"')]")).click();
		
	}
	
}
