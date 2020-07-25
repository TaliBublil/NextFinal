package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage extends BasePage {
	@FindBy(css="#imageLink_10389 > img")
	private WebElement giftCardSilverIMG;	

	public GiftCardsPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * choose silver gift card
	 */
	public void chooseGiftCard(String productName) {
		click(giftCardSilverIMG);
	}
}