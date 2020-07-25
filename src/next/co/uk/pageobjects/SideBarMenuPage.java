package next.co.uk.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBarMenuPage extends BasePage {
	@FindBy(css = ".SearchedFor")
	private WebElement subproductBrandCategoryName;
	@FindBy(css = "#brand-next")
	private WebElement brandCheckbox;

	public SideBarMenuPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * choose one of the left side bar menu
	 */
	public void chooseFromSideBarMenu() { 	
		List<WebElement> list2= driver.findElements(By.cssSelector(".row.tablet-rows .sidebar-links-wrap>a"));
		scrollDown(500);
		sleep(3000);
		list2.get(8).click();
	}
}
