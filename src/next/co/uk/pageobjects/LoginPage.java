package next.co.uk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {
	@FindBy(css="#emailOuter > #EmailOrAccountNumber")
	private WebElement emailField;
	@FindBy(css=".password")
	private WebElement passwordField;
	@FindBy(css=".nxbtn.secondary.large.btn-sign-in")
	private WebElement signField;
	@FindBy(css="#pri > div > div > div > div > span")
	private WebElement loginErrorMessage;
	@FindBy(css="#dobTab>a")
	private WebElement loginWithCustNoBTN;
	@FindBy(css="#accountNumberOuter #AccountNumber")
	private WebElement custNoField;
	@FindBy(css="select#DobDay")
	private WebElement dayOfBirthField;
	@FindBy(css="select#DobMonth")
	private WebElement monthOfBirthField;
	@FindBy(css="select#DobYear")
	private WebElement yearOfBirthField;
	@FindBy(css=".nxbtn.secondary.large.btn-sign-in")
	private WebElement signWithCustNoBTN;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//fill login fields and click on sign button
	public void login(String email,String password) {
		fillText(emailField, email);
		fillText(passwordField,password);
		click(signField);
	}

	//fill login fields with wrong email/password
	public String loginWrongEmailPasswordMSG() {
		return getText(loginErrorMessage);
	}

	// login with customer number and date of birth
	public void loginCustNo(String custNo, String day, String month, String year ) {
		click(loginWithCustNoBTN);
		fillText(custNoField, custNo);
		Select s=new Select(dayOfBirthField);
		s.selectByValue(day);
		s=new Select(monthOfBirthField);
		s.selectByValue(month);
		s=new Select(yearOfBirthField);
		s.selectByValue(year);		
		click(signWithCustNoBTN);
	}
}




