package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardAndMessagePage extends BasePage {
	@FindBy(css="#tbMessage")
	private WebElement addMSG;
	@FindBy(css="#GoToPayment")
	private WebElement goToPaymentBTN;

	public CardAndMessagePage(WebDriver driver) {
		super(driver);
	}

	/*
	 * add some message to the gift card 
	 */
	public String cardMSG(String msg) {
		fillText(addMSG, msg);
		click(goToPaymentBTN);
		String URL3 = driver.getCurrentUrl();
		return URL3;
	}
}