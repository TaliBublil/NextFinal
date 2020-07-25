package next.co.uk.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsOrBrandsListPage extends MainPage {
	@FindBy(css="section > div.StyleHeader > div.Title")
	private WebElement itemTitle;
	@FindBy(css=".Primarynavlinks>a")
	private WebElement primaryCategoryLink;	

	public ProductsOrBrandsListPage(WebDriver driver) {
		super(driver);
	}
	/*
	 * print all products from product list
	 */
	public boolean listofProductBrand(String productName){		
		List<WebElement> list= driver.findElements(By.cssSelector(".Title >a"));		
		for (WebElement el : list) {
			if (el.getText().toLowerCase().contains(productName)) {
				System.out.println("The product contains the word "+ productName +"-" + el.getText());
			}
			else {
				return false;
			}
		}
		return true;
	}

	/*
	 * choose one of the product from product list
	 */
	public String chooseProductOrBrand(){		
		List<WebElement> list= driver.findElements(By.cssSelector(".Title >a"));		
		String tmp = list.get(3).getText();	
		list.get(3).click();
		return tmp;
	}

	/*
	 * choose from primary category by clicking one of it
	 */
	public void chooseFromMenu(String name) {
		List<WebElement> list1= driver.findElements(By.cssSelector(".Primarynavlinks>a"));
		for (WebElement el : list1) {
			if (el.getText().toUpperCase().equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}
}
