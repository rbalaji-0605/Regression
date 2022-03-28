package TestCases;

import org.testng.annotations.Test;

import PageActions.AppSidePageAction;

public class Download_TestCase {
	
	
	private AppSidePageAction appAct;
	
	
	
	@Test
	public void Validate_Download_DesignAsPNG() {
		
		appAct=new AppSidePageAction();
		appAct.clickNavBar_DownloadButton();
		appAct.clickExportType_DownloadButton();
		appAct.clickDownloadButton();
		appAct.waitForDownloadToComplete();
		
	}
	
	
	@Test
	public void Validate_Download_MultipleSlideDesign_AsPNG_InZIP() {
		
	}
	
	
	@Test
	public void Validate_Download_DesignAs_PNG_TransparentBG(){
	
	}
	
	
	@Test
	public void Validate_Download_DesignAs_JPG() {
		
	}
	
	
	@Test
	public void Validate_Download_MultipleSlideDesign_AsJPG_InZIP() {
		
		
	}
	
	
	@Test
	public void Validate_Download_DesignAs_PDF() {
		
	}
	
	
	

}
