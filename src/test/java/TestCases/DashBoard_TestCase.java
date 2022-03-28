package TestCases;

import org.testng.annotations.Test;

import PageActions.DashboardPageAction;

public class DashBoard_TestCase {

	private DashboardPageAction dashAct;

	@Test
	public void Validate_the_Search_with_DropDown_AllOptions_DashboardPage(){

		dashAct=new DashboardPageAction();

//		dashAct.clickTemplatesSearchBar();
//		dashAct.validateSearchBarDropDown();


	}
	
	
	@Test
	public void Validate_the_user_is_able_to_Create_a_new_Project_Blank() {
		
		dashAct=new DashboardPageAction();
		
	}


}
