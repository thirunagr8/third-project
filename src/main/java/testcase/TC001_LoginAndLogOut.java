package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods_old.SeMethods;

public class TC001_LoginAndLogOut extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);	
	}
}