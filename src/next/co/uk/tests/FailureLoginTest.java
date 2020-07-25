package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.LoginPage;
import next.co.uk.pageobjects.MainPage;
import next.co.uk.utils.Excel;

public class FailureLoginTest extends BaseTest {

	@BeforeClass
	public void setupLogin() {
		MainPage mp= new MainPage(driver);
		mp.clickSignBTN();
	}

	@Test(dataProvider="getDataFromExcel", description="use incorrect login infomation")	
	public void l2_loginFailed(String email, String password) {
		LoginPage lp=new LoginPage(driver);
		lp.login(email, password);
		//check that we get correct error message
		String expectedErrorMSG= "Sorry, we have been unable to sign you in.";
		String actualErrorMSG= lp.loginWrongEmailPasswordMSG();
		Assert.assertEquals(actualErrorMSG, expectedErrorMSG);
	}

	@DataProvider
	public Object [][] getDataFromExcel(){
		String excelPath = System.getProperty("user.dir") + "\\src\\next\\co\\uk\\data\\input.xlsx";
		Object[][] myData=  Excel.getTableArray(excelPath, "Login");
		return myData;
	}
}


