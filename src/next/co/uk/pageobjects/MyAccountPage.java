package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	@FindBy(css="section.QuickLinks > ul > li:nth-child(1) > a")
	private WebElement myAccountField;

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public String myAccount() {
		return getText(myAccountField);
	}
}


