package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
	@FindBy(css=".GoToCheckout.TopLink.checkout_transfer")
	private WebElement goToCheckoutBTN;

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * click on "go to checkout" for finishing the order
	 */
	public void goTocheckOut() {
		waitUntil(1000, goToCheckoutBTN);
		click(goToCheckoutBTN);
	}
}