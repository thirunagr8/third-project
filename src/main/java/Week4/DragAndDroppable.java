package Week4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDroppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/ChromeDriver.exe" );
		ChromeDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.get("https://jqueryui.com/draggable/");
		wb.switchTo().frame(wb.findElementByClassName("demo-frame"));
		WebElement drag = wb.findElementByXPath("//div[@id='draggable']");

		Actions build = new Actions(wb);
		build.dragAndDropBy(drag, 80, 40).perform();
		build.contextClick();
		build.doubleClick();
		build.moveByOffset(100, 20);
		build.clickAndHold();
	/*WebDriverWait waitlist = new WebDriverWait(wb,10);
	waitlist.until(ExpectedConditions.elementToBeClickable(Id));*/
		File src = wb.getScreenshotAs(OutputType.FILE);
		File Desc = new File("./snaps.img.png");
		try {
			FileUtils.copyFile(src, Desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}

}
//actions class will not throw any exceptions
//implicitly wait also will not throw any exceptions