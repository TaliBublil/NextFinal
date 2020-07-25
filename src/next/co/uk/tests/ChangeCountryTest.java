package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.ShopByCountryPage;

public class ChangeCountryTest extends BaseTest {

	@Test(description="access www.next.UK website and move to www.next.il website")
	public void changeCountry() {
		ShopByCountryPage sc=new ShopByCountryPage(driver);
		String actualURL=sc.shopByCountry();
		Assert.assertEquals(actualURL, "https://www.next.co.il/he" );
	}
}