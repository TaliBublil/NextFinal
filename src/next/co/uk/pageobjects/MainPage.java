package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
	@FindBy(css="section.QuickLinks > ul > li:nth-child(1) > a")
	private WebElement signInButton;
	@FindBy(css="#sli_search_1")
	private WebElement searchProductOrBrandField; 
	@FindBy(css=".SearchButton")
	private WebElement searchProductOrBrandBTN;
	@FindBy(css=".Checkout>.nxbtn.primary")
	private WebElement checkoutBTN;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	// go to login page
	public void clickSignBTN() {
		sleep(2000);
		click(signInButton);
	}

	// get my account button text 
	public String myAccount() {
		return getText(signInButton);
	}

	// search for product/brand from search box 
	public void searchProductBrand (String product) {
		fillText(searchProductOrBrandField, product);
		click(searchProductOrBrandBTN);
		sleep(2000);
	}
	// click on checkout button
	public void checkOut() {
		click(checkoutBTN);
	}
}