package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MyHomePage extends groups.ProjectMethods {
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using ="Leads")
	WebElement eleLeads;
	public MyLeadsPage clickLeads()
	{
		click (eleLeads);
		return new  MyLeadsPage();
		
	}
}