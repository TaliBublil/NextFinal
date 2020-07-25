package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChoosenGiftCardPage extends BasePage {
	@FindBy(css="#orderValue")
	private WebElement orderValueDropDown;	
	@FindBy(css="#btnCheckOut")
	private WebElement checkOutBTN;	

	public ChoosenGiftCardPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * add to the gift card some value from dropdown list and click on checkout
	 */
	public void choosenGiftCard(String price) {
		click(orderValueDropDown);
		Select s= new Select(orderValueDropDown);
		s.selectByValue(price);
		click(checkOutBTN);
		sleep(2000);
	}
}