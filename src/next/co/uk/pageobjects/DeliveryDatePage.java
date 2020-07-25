package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DeliveryDatePage extends BasePage {
	@FindBy(css="#deliveryMethod")
	private WebElement deliveryDateBTN;
	@FindBy(css="#step-2-continue")
	private WebElement continue2BTN;

	public DeliveryDatePage(WebDriver driver) {
		super(driver);
	}
	/*
	 * choose delivery date(default)
	 */
	public void deliveryDate( ) {
		Select s=new Select(deliveryDateBTN);
		s.selectByIndex(1);
		waitUntil(2000, continue2BTN);
		click(continue2BTN);	
	}
}