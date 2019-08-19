package Week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		wb.switchTo().frame("iframeResult");
		wb.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = wb.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);
		alert.sendKeys("Thiruna");
		alert.accept();

	}
}
