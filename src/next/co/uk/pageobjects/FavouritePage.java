package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavouritePage extends BasePage {

	@FindBy(css=".favourite-icon.notification #gel-favourite-inactive")
	private WebElement favouriteIcon;
	@FindBy(css=".item-description")
	private WebElement favouriteItem;

	public FavouritePage(WebDriver driver) {
		super(driver);
	}

	/*
	 * click on "add to favorite" for the item
	 */
	public String favouriteItems () {
		waitUntil(1000, favouriteIcon);
		click(favouriteIcon);
		return getText(favouriteItem);		
	}
}
