package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.NavigationPage;

public class NavigationMenuTest extends BaseTest {

	@Test(description="hovering by mouse to one of category manu and choose sub category ")
	public void chooseFromMenuBar() {	
		NavigationPage np= new NavigationPage(driver);
		String actualCategory=np.firstDesktopNavigation("BABY");
		String expectedCategory="Baby Tights";
		Assert.assertEquals(actualCategory, expectedCategory);
	}
}