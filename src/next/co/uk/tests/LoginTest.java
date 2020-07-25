package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.LoginPage;
import next.co.uk.pageobjects.MainPage;
import next.co.uk.pageobjects.MyAccountPage;

public class LoginTest extends BaseTest {

	@BeforeClass
	public void setupLogin() {
		MainPage mp= new MainPage(driver);
		mp.clickSignBTN();
	}

	@Test(description="login with correct email+ password")
	public void loginUser() {
		LoginPage lp=new LoginPage(driver);
		lp.login("tali.bublil@gmail.com", "lian2803");
		MyAccountPage ap=new MyAccountPage(driver);
		String expectedMyAccountName="Tali";
		String actualMyAccountName=ap.myAccount();
		Assert.assertEquals(actualMyAccountName, expectedMyAccountName);	
	}
}


