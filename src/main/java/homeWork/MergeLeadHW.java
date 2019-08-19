package homeWork;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods_old.SeMethods;

public class MergeLeadHW extends SeMethods {
	@Test
	public void MergeLeads()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCrm = locateElement("linktext","CRM/SFA");
		click(eleCrm);
		WebElement eleLeads = locateElement("linktext","Leads");
		click(eleLeads);
		WebElement eleMrgLeads = locateElement("linktext","Merge Leads");
		click(eleMrgLeads);


	}

}
