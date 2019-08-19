package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import groups.ProjectMethods;
import pagefactorytestcases.LoginAndLogout;

public class CreateLead extends ProjectMethods {
	public CreateLead()
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	public CreateLead typeCompanyName(String data)
	{
		type(eleCompanyName,data);
		return this;
	}
	@FindBy(id="createLeadForm_firstName")
	WebElement elefirstName;
	public CreateLead typefirstName(String data)
	{
		type(elefirstName,data);
		return this;

	}
	@FindBy(id="createLeadForm_lastName")
	WebElement elelasstName;
	public CreateLead typelastName(String data)
	{
		type(elelasstName,data);
		return this;

	}
	@FindBy(how = How.CLASS_NAME, using ="smallSubmit")
	WebElement eleCreateLead;
	public LoginAndLogout clickCreateLead()
	{
		click (eleCreateLead);
		//return new LoginAndLogout(); 
		return null;

	}
}