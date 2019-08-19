package NewProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class ZoomCarBooking extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="ZoomCar";
		testCaseDesc="Get price";
		category="Smoke";
		author="Thiru";

	}
	@Test
	public void zoom() throws InterruptedException {
		//startApp("chrome","https://www.zoomcar.com/chennai/");
		//	Thread.sleep(2000);
		WebElement elejourney = locateElement("linkText","Start your wonderful journey");
		click(elejourney);
		Thread.sleep(2000);
		WebElement elepickup = locateElement("xpath","//div[@class='component-popular-locations']/div[2]");
		click(elepickup);
		WebElement elesubmit = locateElement("class","proceed");
		click(elesubmit);
		WebElement elecdate1 = locateElement("xpath","(//div[@class='days']//div)[4]");
		click(elecdate1);
		WebElement elesubmit1 = locateElement("class","proceed");
		click(elesubmit1);
		WebElement elecdate2 = locateElement("xpath","(//div[@class='days']//div)[2]");
		click(elecdate2);
		WebElement elesubmit2 = locateElement("class","proceed");
		click(elesubmit2);
		List<WebElement> price = driver.findElementsByClassName("price");
		List<String> newMaxPrice = new ArrayList<String>();
		int noofcars = price.size();
		System.out.println(noofcars);
		Collections.sort(newMaxPrice);
		System.out.println(newMaxPrice);
		int newMaxPriceSize = newMaxPrice.size();
		System.out.println(newMaxPrice.get(newMaxPriceSize-1));
		String clickPrice = newMaxPrice.get(newMaxPriceSize-1);
		WebElement eletext = locateElement("xpath","//div[contains(text(),'"+clickPrice+"')]/preceding::div[@class='details']");
		System.out.println(eletext.getText());
		WebElement eleclick = locateElement("xpath","//div[contains(text(),'"+clickPrice+"')]/following-sibling::button");
		click(eleclick);
	}
}
