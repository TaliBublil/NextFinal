package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.LoginPage;
import next.co.uk.pageobjects.MainPage;
import next.co.uk.pageobjects.MyAccountPage;

public class LoginCustNoTest extends BaseTest {

	@BeforeClass
	public void setupLogin() {
		MainPage mp= new MainPage(driver);
		mp.clickSignBTN();
	}

	@Test(description="login existing email with customer no and date of birth")
	public void loginWithCustNo() {
		LoginPage lp=new LoginPage(driver);
		lp.loginCustNo("O9K47819", "22", "8", "1980");
		//check that login with customer no+date of birth succeed 		
		MyAccountPage ap=new MyAccountPage(driver);
		String expectedMyAccountName= "Tali";
		String actualMyAccountName= ap.myAccount();
		Assert.assertEquals(actualMyAccountName, expectedMyAccountName);
	}
}
