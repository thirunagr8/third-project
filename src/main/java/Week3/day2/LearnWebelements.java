package Week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("https://www.icicibank.com/");
		List<WebElement> checkbox = wb.findElementsByXPath("//input[@type='checkbox']");
		int sz = checkbox.size();
		System.out.println(sz);
		//checkbox.get(sz-1).click();
		List<WebElement> classname = wb.findElementsByXPath("//tr[@class='even']/td[2]/font/following::input");
		classname.get(0).click();
		//(//input[@name='vital'])[2]
	}
}
