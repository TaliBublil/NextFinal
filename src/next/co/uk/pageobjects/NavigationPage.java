package next.co.uk.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends BasePage {

	public NavigationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="[title='Tights']")
	private WebElement subCategoryName;
	@FindBy(css=".SearchedFor")
	private WebElement CategoryAndSubName;

	// hovering by mouse on menu category and choose one
	public String firstDesktopNavigation(String productName) {
		List<WebElement> list = driver.findElements(By.cssSelector(".PrimarynavlinksText"));
		for (int i = 0; i < list.size(); i++) {
			if (getText(list.get(i)).equalsIgnoreCase(productName)) {	
				//  mouse
				mouseMoveTo(list.get(i));
				waitUntil(1000, subCategoryName);
				break;
			}			
		}
		click(subCategoryName);
		return getText(CategoryAndSubName);
	}	
}


