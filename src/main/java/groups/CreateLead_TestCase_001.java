package groups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods_old.SeMethods;

public class CreateLead_TestCase_001 extends groups.ProjectMethods {

	@BeforeTest (groups = {"smoke"})
	
	public void setData()
	{
		testCaseName = "Test_case_001";
		testCaseDesc = "Test case to create Lead";
		category = "smoke";
		author = "Thiru";
		fileName = "CreateLead";
	}
	@Test (groups = {"smoke"},dataProvider = "fetchdata")
	public void createLead(String cName,String fName,String lName )
	{
	WebElement eleCreateLead = locateElement("linkText","Create Lead");
	click(eleCreateLead);
	WebElement eleCompName = locateElement("id","createLeadForm_companyName");
	type(eleCompName,cName);
	WebElement elefName = locateElement("id","createLeadForm_firstName");
	type(elefName,fName);
	WebElement elelName = locateElement("id","createLeadForm_lastName");
	type(elelName,lName);
	//createLeadForm_dataSourceId
	
	WebElement eledrop = locateElement("createLeadForm_dataSourceId");
	//Select dropDown = new Select(eledrop);
	selectDropDownUsingText(eledrop,"Direct Mail");
	WebElement submit = locateElement("class","smallSubmit");
	click(submit);
	
	
	}

}
