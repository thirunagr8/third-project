package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends groups.ProjectMethods {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//h2[text()='Demo Sales Manager']")
	
	WebElement eleverifyUname;
	public HomePage verifyUsername(String data) {
		verifyPartialText(eleverifyUname, data);
		return this;
	}
	@FindBy(how = How.LINK_TEXT, using ="CRM/SFA")
	WebElement eleCRMSFA;
	public MyHomePage clickCRMSFA()
	{
		click (eleCRMSFA);
		return new  MyHomePage();
		
	}
}

/*
//type(eleCompName,"Thirultd");
@FindBy(id="createLeadForm_firstName")
WebElement createLeadForm_companyName;
public LoginPage typecompanyName(String data)
{
type(createLeadForm_companyName,data);
return this;
WebElement elefName = locateElement("id","createLeadForm_firstName");
type(elefName,"Thiru");
WebElement elelName = locateElement("id","createLeadForm_lastName");
type(elelName,"Prithiv");
}
*/