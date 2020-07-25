package next.co.uk.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductOrBrandPage extends BasePage {
	@FindBy(css=".dk_toggle.dk_label")
	private WebElement chooseSizeBTN;
	@FindBy(css=".Selector.SizeSelector.dk_option_current")
	private WebElement selectSizeBTN;
	@FindBy(css="div.Title > h1")
	private WebElement productOrBrandName;
	@FindBy(css=".nxbtn.primary.btn-addtobag.addToBagCTA.Enabled")
	private WebElement addToBagBTN;
	@FindBy(css=".divFavouritesContainer.favourite-pdp-heart  #gel-favourite-inactive")
	private WebElement addToFavouriteBTN;

	public ProductOrBrandPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * choose size on chosen product
	 */
	public void choosenProductOrBrand1(String value) {
		click(chooseSizeBTN);		
		sleep(3000);
		List<WebElement> list = driver.findElements(By.cssSelector(".dk_options_inner >li>a"));
		for (int i = 0; i < list.size(); i++) {
			if (getText(list.get(i)).equalsIgnoreCase(value)) {
				click(list.get(i));
				break;	
			}
		}
	}

	public void choosenProductOrBrand2(String value) {
		sleep(3000);
		List<WebElement> list = driver.findElements(By.cssSelector(".dk_options_inner >li>a"));
		for (int i = 0; i < list.size(); i++) {
			if (getText(list.get(i)).equalsIgnoreCase(value)) {
				click(list.get(i));
				break;	
			}
		}
	}

	/*
	 * click on "add to bag" on the chosen product
	 */
	public String addToBag() {
		click(addToBagBTN);
		return getText(productOrBrandName);
	}

	/*
	 * click on add to favorite on the chosen product
	 */
	public void addToFavourite(){		
		click(addToFavouriteBTN);
	}
}


