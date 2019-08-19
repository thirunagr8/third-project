package NewProject;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class ZoomCarBookingcopied extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="ZoomCar";
		testCaseDesc="Get price";
		category="Smoke";
		author="Thiru";
	}@Test
	public void ZoomCarAutomation () throws InterruptedException {
		WebElement elecl = locateElement("xpath","//a[@title='Start your wonderful journey']");
		click(elecl);
		WebElement elecdes = locateElement("xpath","//div[contains(text(), 'Nelson Manickam Road')]");
		click(elecdes);
		Thread.sleep(300);
		WebElement eleproc1 = locateElement("class","proceed");
		click(eleproc1);
		// Get the current date
		Date date = new Date();
		// Get only the date (and not month, year, time etc)
		DateFormat sdf = new SimpleDateFormat("dd"); 
		// Get today's date
		String today = sdf.format(date);
		// Convert to integer and add 1 to it
		int tomorrow = Integer.parseInt(today)+1;
		// Print tomorrow's date
		System.out.println(tomorrow);
		WebElement elecdate1 = locateElement("xpath","(//div[@class='days']//div)[3]");
		click(elecdate1);
		String eledate1 = elecdate1.getText();
		System.out.println(eledate1);
		WebElement eleproc2 = locateElement("class","proceed");
		click(eleproc2);
		WebElement elecdate2 = locateElement("xpath","(//div[@class='days']//div)[2]");
		click(elecdate2);
		String eledate2 = elecdate2.getText();
		System.out.println(eledate2);
		if (eledate1.equals(eledate2)) {
			System.out.println("Correct date is selected. Happy Journey!");
		} else {
			System.out.println("Date Selected is incorrect. Please re-check selection");
		}
		Thread.sleep(2000);
		WebElement eleproc3 = locateElement("class","proceed");
		click(eleproc3);
		List<WebElement> pricelist = driver.findElementsByClassName("price");
		List<String> newMaxPrice = new ArrayList<String>();

		int noOfCars = pricelist.size();
		Thread.sleep(2000);
		System.out.println(noOfCars);
		for (int i=0; i<noOfCars; i++) {
			String carPrice = pricelist.get(i).getText();
			String carTrimPrice1 = carPrice.replaceAll("\\D", "");
			newMaxPrice.add(carTrimPrice1);
		}
		Collections.sort(newMaxPrice);
		int newMaxPriceSize = newMaxPrice.size();
		System.out.println(newMaxPrice.get(newMaxPriceSize-1));
		String clickPrice = newMaxPrice.get(newMaxPriceSize-1);
		WebElement eletext = locateElement("xpath","//div[contains(text(),'"+clickPrice+"')]/preceding::div[@class='details']");
		System.out.println(eletext.getText());
		Thread.sleep(2000);
		WebElement eleclick = locateElement("xpath","//div[contains(text(),'"+clickPrice+"')]/following-sibling::button");
		click(eleclick);
	}
}
