package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
	@FindBy(css="h1 > span")
	private WebElement paymentName;

	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	public String payment( ) {
		String URL4 = driver.getCurrentUrl();
		return URL4;
	}
}