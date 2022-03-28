package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageActions.AppSidePageAction;
import Utility.BrowserClass;


public class AppTextModule_TestCase {
	
	
	private AppSidePageAction appAct;
	
	
	@Test
	public void Validate_EditText_Basetemplates_Rotate_Resize() throws AWTException {
		
		appAct=new AppSidePageAction();
		
		appAct.changeProjectName();
		
		appAct.clickBackground();
	
		appAct.applyGradientBackground();
		
		appAct.clickTextTab();
		appAct.selectBigText();
		appAct.moveTextContainer(12, 12);
		appAct.changeTitle();
		appAct.clickAddNewSlide();
		appAct.clickSlide();
		appAct.selectTitle();
		appAct.clickAddNewSlide();
		appAct.clickSlide();
		appAct.selectSubTitle();
		appAct.clickAddNewSlide();
		appAct.clickSlide();
		appAct.selectBodyText();
		appAct.clickAddNewSlide();
		appAct.clickSlide();
		appAct.selectBulletin();
		
	}

	
	@Test
	public void Validate_EditText_Prebuilts_Rotate_Resize() {
		appAct=new AppSidePageAction();
		appAct.clickAddNewSlide();
		appAct.clickSlide();
		appAct.clickPrebuiltText();
		
	}
	
	@Test
	public void Validate_Ungroup_TextPrebuilts() {
		
	}
	
	
	@Test
	public void Validate_Grouping_Different_TextElements() {
		
	}
	
	
	@Test
	public void Validate_DuplicateButton_text() {
		
	}
	
	
	@Test
	public void Validate_LockButton_text() {
		
	}
	
	@Test
	public void Validate_Text_Arrangements() {
		
	}
	
	@Test
	public void Validate_Text_Alignment() {
		
	}
	@Test
	public void Validate_Text_Deletion() {
		
	}
	@Test
	public void Validate_Text_Using_DeleteElement() {
		
	}
	@Test
	public void Validate_Text_Using_DeleteGroup() {
		
	}
	@Test
	public void Validate_AdminFonts_Option() {
		
	}
	@Test
	public void Validate_UploadFont_Section() {
		
	}
	
	
	
	
	
}
