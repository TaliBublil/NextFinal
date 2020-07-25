package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DeliveryAddressPage extends BasePage {
	@FindBy(css="#recipientName")
	private WebElement recipientNameField;	
	@FindBy(css="#PostCode")
	private WebElement postCodeField;
	@FindBy(css="#step-1-find-address")
	private WebElement findAddField;
	@FindBy(css="#ddlAddresses")
	private WebElement allAddField;
	@FindBy(css="#step-1-continue")
	private WebElement continueBTN;

	public DeliveryAddressPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Add delivery address
	 */
	public void deliveryAdd( String name, String postCode) {
		fillText(recipientNameField, name);
		fillText(postCodeField, postCode);
		click(findAddField);
		waitUntil(2000, allAddField);
		Select s=new Select(allAddField);
		s.selectByIndex(3);
		waitUntil(2000, continueBTN);
		click(continueBTN);
		sleep(4000);
	}
}