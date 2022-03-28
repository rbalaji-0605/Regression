package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppProject_Page {



	public AppProject_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath="//span[contains(text(),'+ New Slide')]")
	@CacheLookup
	public WebElement addNewSlide;

	@FindAll(@FindBy(xpath="//div[contains(@id,'workspace-')]"))
	@CacheLookup
	public List<WebElement> noOfSlides;


	/// ******** Library section web elements ******** ///

	@FindBy(xpath="//div/img/following-sibling::span[contains(text(),'Text')]")
	@CacheLookup
	public WebElement textTab;

	@FindBy(xpath="//div/img/following-sibling::span[contains(text(),'Background')]")
	@CacheLookup
	public WebElement backGround;

	@FindBy(xpath="//div/img/following-sibling::span[contains(text(),'Photos')]")
	@CacheLookup
	public WebElement photos;


	/// ******* Gradient background ********  /////

	@FindBy(xpath="//img[@id='BGGBG-0100']")
	@CacheLookup
	public WebElement basic_GradientShape;




	@FindBy(xpath="//div/input[contains(@value,'Untitled Photo')]")
	@CacheLookup
	public WebElement untitledProjectName;


	//div[contains(@id,'workspace-0')]/div/div/div/div/div[contains(@class,'text-container')]




	///******* Text Module web elements ********///



	//div[@class='scene-item type-text']
	//@FindBy(xpath="//div[contains(@class,'text-container')]")

	@FindBy(xpath="//div[contains(@class,'inner-box')]")
	@CacheLookup
	public WebElement textContainer;


	@FindBy(xpath="//span[@class='sc-pJUfC sc-psdaw eYmHqJ']")
	@CacheLookup
	public WebElement textHorizontalResize_Right;

	@FindBy(xpath="//div[@id='text-img-view']")
	@CacheLookup
	public WebElement preBuiltContainer;

	@FindAll(@FindBy(xpath="//img[contains(@id,'TEXT')]"))
	@CacheLookup
	public List<WebElement> prebuiltList;


	@FindAll(@FindBy(xpath="//div[contains(@class,'text-container')]"))
	@CacheLookup
	public List<WebElement> noOfTextContainer;


	@FindBy(xpath="//span[@class='sc-pJUfC sc-qZsMW kPQSXS']")
	@CacheLookup
	public WebElement textHorizontalResize_Left;


	@FindBy(xpath="//div[@id='0']")
	@CacheLookup
	public WebElement addBigText;	



	@FindBy(xpath="//div[@id='1']")
	@CacheLookup
	public WebElement addTitle;


	@FindBy(xpath="//div[@id='2']")
	@CacheLookup
	public WebElement addSubTitle;


	@FindBy(xpath="//div[@id='3']")
	@CacheLookup
	public WebElement addBodyText;

	@FindBy(xpath="//div[@id='4']")
	@CacheLookup
	public WebElement addBulletin;


	@FindBy(xpath="//span[@class='sc-pzNoE sc-pHJrd dGSKge rotate-handle bottom']")
	@CacheLookup
	public WebElement textRotate;




	///********** Download module web elements *********///

	@FindBy(xpath="//div[@id='download-btn']/button")
	@CacheLookup
	public WebElement navBar_DownloadButton;



	@FindBy(xpath="//div[@id='download-btn']/button/following-sibling::div/div/div/div/span[contains(text(),'Download')]")
	@CacheLookup
	public WebElement exportType_DownloadButton;


	@FindBy(xpath="//div[@id='download-btn']/button/following-sibling::div/div/div/div/span[contains(text(),'Present')]")
	@CacheLookup
	public WebElement exportType_PresentButton;


	@FindBy(xpath="//div[@id='download-btn']/button/following-sibling::div/div/div/div/span[contains(text(),'Share')]")
	@CacheLookup
	public WebElement exportType_ShareButton;



	@FindBy(xpath="//div[contains(text(),'Download')]")
	@CacheLookup
	public WebElement DownloadButton;


	@FindBy(xpath="//button[contains(text(),'Copy link')]")
	@CacheLookup
	public WebElement downloadCopyLink;




}
