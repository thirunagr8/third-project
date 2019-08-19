package Week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAdvanceXpath {
	static int i=0;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver wb = new ChromeDriver();

		wb.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement byId = wb.findElementById("userRegistrationForm:nationalityId");
		//List<WebElement> byId = wb.findElementsById("userRegistrationForm:nationalityId");
		//byId
		Select dropdown = new Select(byId);
		List<WebElement> options = dropdown.getOptions();
		for (WebElement ab : options) {
			if (ab.getText().startsWith("E"))
				//{
				i++;
			//if (i==2)
			//{
			System.out.println(ab.getText());
			ab.click();
			break;
			//}
			//}
		}
	}

}
