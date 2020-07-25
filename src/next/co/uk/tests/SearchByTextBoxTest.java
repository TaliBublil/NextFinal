package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.FavouritePage;
import next.co.uk.pageobjects.ProductOrBrandPage;
import next.co.uk.pageobjects.ProductsOrBrandsListPage;

public class SearchByTextBoxTest extends BaseTest {

	@Test(description="search by textbox for specific product/brand and verify it contains words from product name")
	public void tc01_search_1() {
		ProductsOrBrandsListPage pbl= new ProductsOrBrandsListPage(driver);
		pbl.searchProductBrand("nike sandals boys");
		//comparing all items - using boolean
		boolean expected = pbl.listofProductBrand("nike");
		boolean actual = true;
		Assert.assertEquals(actual, expected);
	}

	@Test(description="check if selected item added to favorite page ")
	public void tc02_addToFavorite_2() {	
		ProductsOrBrandsListPage pbl= new ProductsOrBrandsListPage(driver);
		String expectedFavourite = pbl.chooseProductOrBrand();	
		ProductOrBrandPage pb=new ProductOrBrandPage(driver);
		pb.choosenProductOrBrand2("Medium");
		pb.addToFavourite();
		FavouritePage fp = new FavouritePage(driver);
		String actualFavourite=fp.favouriteItems();
		Assert.assertEquals(actualFavourite, expectedFavourite);
	}
}	




