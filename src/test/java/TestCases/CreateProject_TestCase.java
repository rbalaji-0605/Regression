package TestCases;

import org.testng.annotations.Test;

import PageActions.AppSidePageAction;
import PageActions.DashboardPageAction;

public class CreateProject_TestCase {

	private DashboardPageAction dashAct;
	private AppSidePageAction appAct;
	
	
	@Test
	public void validate_the_user_is_able_to_Create_a_new_blank_Project() throws InterruptedException {
		dashAct=new DashboardPageAction();
		
		dashAct.selectTemplateCategory();
		
		appAct=new AppSidePageAction();
		appAct.navigateToAppProject();
		
	}
	
	@Test
	public void validate_the_user_is_able_to_Create_a_new_Project_Template() {
		
	}
	
	@Test
	public void validate_the_User_is_able_to_Edit_the_Created_Project_FromDashboard() {
		
	}
	
	@Test
	public void validate_the_User_is_able_to_view_the_created_Projects_are_listed_for_an_Existing_User() {
		
	}
}
