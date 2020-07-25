package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBarCheckboxPage extends BasePage {
	@FindBy(css = "#option-feat-available .FeatLabel>label")
	private WebElement inStockCheckbox;

	public SideBarCheckboxPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * check one of the left side bar top checkbox
	 */
	public void chooseFromcheckboxBarMenu() { 
		waitUntil(2000, inStockCheckbox);
		click(inStockCheckbox);
		sleep(4000);
	}
}
