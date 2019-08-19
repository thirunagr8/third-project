package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods_old.SeMethods;

public class CreateLead_TestCase_001 extends ProjectMethods {

	@BeforeTest (groups = {"smoke"})
	
	public void setData()
	{
		testCaseName = "Test_case_001";
		testCaseDesc = "Test case to create Lead";
		category = "smoke";
		author = "Thiru";
		fileName = "CreateLead";
	}
	@Test (groups = {"smoke"})
	public void createLead()
	{
	WebElement eleCreateLead = locateElement("linkText","Create Lead");
	click(eleCreateLead);
	WebElement eleCompName = locateElement("id","createLeadForm_companyName");
	type(eleCompName,"Thirultd");
	WebElement elefName = locateElement("id","createLeadForm_firstName");
	type(elefName,"Thiru");
	WebElement elelName = locateElement("id","createLeadForm_lastName");
	type(elelName,"Prithiv");
	//createLeadForm_dataSourceId
	
	WebElement eledrop = locateElement("createLeadForm_dataSourceId");
	//Select dropDown = new Select(eledrop);
	selectDropDownUsingText(eledrop,"Direct Mail");
	
	}
	@DataProvider
	public void getdata() {
		Object[][] data = new Object[2][3];
		data[0][0] = "data";
	}

}






