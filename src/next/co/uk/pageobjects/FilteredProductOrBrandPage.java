package next.co.uk.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilteredProductOrBrandPage extends BasePage {

	public FilteredProductOrBrandPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * Choose product and return name of product
	 */
	public String chooseProduct() {
		List<WebElement> listOfproduct = driver.findElements(By.cssSelector(".Item.Fashion"));
		String temp = listOfproduct.get(1).getText();
		String [] temp2= temp.split("\n");
		sleep(1000);
		listOfproduct.get(1).click();
		sleep(4000);
		return temp2[0];
	}
}
