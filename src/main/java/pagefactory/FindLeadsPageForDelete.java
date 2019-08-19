	package pagefactory;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import groups.ProjectMethods;

	public class FindLeadsPageForDelete extends ProjectMethods {
		public FindLeadsPageForDelete() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(how = How.LINK_TEXT, using ="Phone")
		WebElement elePhone;
		public DeleteLeadPage clickPhone()
		{
			click (elePhone);
			return new DeleteLeadPage();
		}
}
