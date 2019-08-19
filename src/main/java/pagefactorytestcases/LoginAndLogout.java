package pagefactorytestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import groups.ProjectMethods;
import pagefactory.LoginPage;


public class LoginAndLogout extends ProjectMethods{
@BeforeTest 
	
	public void setData()
	{
		testCaseName = "LoginAndLogout";
		testCaseDesc = "Using PageFactory to create Lead";
		category = "smoke";
		author = "Thiu";
		fileName="CreateLead";
		
	}
@Test(dataProvider="fetchdata")
	
	public void Login(String cName,String fName,String Name)
	{
		new LoginPage()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.verifyUsername("Demo")
		.clickCRMSFA()
        .clickLeads()
        .clickMyLead()
        .typeCompanyName(cName)
        .typefirstName(fName)
        .typelastName(Name)
        .clickCreateLead();
		
	}

}
