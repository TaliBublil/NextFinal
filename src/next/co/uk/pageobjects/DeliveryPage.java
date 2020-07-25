package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryPage extends BasePage {
	@FindBy(css=".btn.btn-lg.btn-primary.delivery-options-cta__continue-button")
	private WebElement continue2PaymentBTN;

	public DeliveryPage(WebDriver driver) {
		super(driver);
	}

	public void delivery( ) {
		click(continue2PaymentBTN);
	}
}