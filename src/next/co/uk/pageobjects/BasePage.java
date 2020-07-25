package next.co.uk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage {
	WebDriver driver;
	JavascriptExecutor js;
	Actions actions;
	WebDriverWait wait; 

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		actions= new Actions(driver);
		wait= new WebDriverWait(driver,30);
	}

	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		el.click();
	}

	public String getText(WebElement el) {
		return el.getText();
	}

	public void alertOK(String text) {
		// insert name to alert
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}

	public void scrollDown(long position) {
		String scroll = "window.scrollBy(0," + position + ")";
		js.executeScript(scroll);
	}

	//hovering mouse to element
	public void mouseMoveTo(WebElement el) {
		Actions action = new Actions(driver);
		action.moveToElement(el).build().perform();
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void waitUntil(long millis,WebElement el) {
		WebDriverWait wait=new WebDriverWait(driver, millis);
		wait.until(ExpectedConditions.elementToBeClickable(el));
		}
	}
