package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(op);
	driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	

List<WebElement> lst = driver.findElementsByName("")
driver.findElementByName("Text1").sendKeys(keysToSend);
	}

}
