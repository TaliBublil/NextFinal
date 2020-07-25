package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopByCountryPage extends BasePage {

	@FindBy(css=".languageButton.selected")
	private WebElement languageSelected;
	@FindBy(css=".shopNow>.btnFlagSelectorShopNow")
	private WebElement shopNowBTN;

	public ShopByCountryPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * change the site to another site ,related to your country (default)
	 */
	public String shopByCountry () {
		click(languageSelected);
		click(shopNowBTN);
		String URL2 = driver.getCurrentUrl();
		return URL2;
	}
}
