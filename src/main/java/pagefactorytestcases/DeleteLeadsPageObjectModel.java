package pagefactorytestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import groups.ProjectMethods;
import pagefactory.LoginPage;


public class DeleteLeadsPageObjectModel extends ProjectMethods{
@BeforeTest 
	
	public void setData()
	{
		testCaseName = "EditLead";
		testCaseDesc = "Using PageFactory to Edit a Lead";
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
		.clickFindLead()
		.typefindleads("babu");
		
		
		
		
		
		
	}

}
