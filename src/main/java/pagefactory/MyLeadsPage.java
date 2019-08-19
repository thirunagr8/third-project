package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import groups.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using ="Create Lead")
	WebElement eleMyLeads;
	public CreateLead clickMyLead()
	{
		click (eleMyLeads);
		return new CreateLead();
	}

	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	WebElement eleFIndLeads;
	public FindLeadsPage clickFindLead()
	{
		click (eleFIndLeads);
		return new FindLeadsPage();
		/*}
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	WebElement eleFIndLeads;
	public FindLeadsPage clickFindLead()
	{
		click (eleFIndLeads);
		return new FindLeadsPage();
	}
		 */
	}}
	/*@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	WebElement eleFIndLeads1;
	public FindLeadsPage clickFindLead1()
	{
		click (eleFIndLeads1);
		return new FindLeadsPage();

	}}
*/
