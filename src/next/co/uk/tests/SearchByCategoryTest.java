package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.FilteredProductOrBrandPage;
import next.co.uk.pageobjects.ProductOrBrandPage;
import next.co.uk.pageobjects.ProductsOrBrandsListPage;
import next.co.uk.pageobjects.SideBarCheckboxPage;
import next.co.uk.pageobjects.SideBarMenuPage;

public class SearchByCategoryTest extends BaseTest {

	@Test(description="search by category,choose product and add to bag")
	public void searchByCategory() {

		ProductsOrBrandsListPage pbl= new ProductsOrBrandsListPage(driver);
		pbl.chooseFromMenu("MEN");
		SideBarMenuPage subpb= new SideBarMenuPage(driver);
		subpb.chooseFromSideBarMenu();
		SideBarCheckboxPage sidepb= new SideBarCheckboxPage(driver);
		sidepb.chooseFromcheckboxBarMenu();
		FilteredProductOrBrandPage filterpb= new FilteredProductOrBrandPage(driver);
		String expectedProduct=filterpb.chooseProduct();
		ProductOrBrandPage pb= new ProductOrBrandPage(driver);
		pb.choosenProductOrBrand1("Small");
		String actualProduct=pb.addToBag();	
		Assert.assertEquals(actualProduct, expectedProduct);
	}
}






