package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.CheckOutPage;
import next.co.uk.pageobjects.DeliveryPage;
import next.co.uk.pageobjects.LoginPage;
import next.co.uk.pageobjects.MainPage;
import next.co.uk.pageobjects.MyAccountPage;
import next.co.uk.pageobjects.PaymentPage;
import next.co.uk.pageobjects.ProductOrBrandPage;
import next.co.uk.pageobjects.ProductsOrBrandsListPage;
import next.co.uk.pageobjects.SideBarCheckboxPage;

public class E2ETest extends BaseTest {

	@Test(description="End-to-End test- a complete scenario, test should succeed")
	public void e2e() {
		MainPage mp= new MainPage(driver);
		mp.clickSignBTN();
		LoginPage lp=new LoginPage(driver);
		lp.login("tali.bublil@gmail.com", "lian2803");
		MyAccountPage ap=new MyAccountPage(driver);
		ap.myAccount();
		mp.searchProductBrand("Adidas shorts");
		SideBarCheckboxPage sidepb= new SideBarCheckboxPage(driver);
		sidepb.chooseFromcheckboxBarMenu();
		ProductsOrBrandsListPage pbl=new ProductsOrBrandsListPage(driver);
		pbl.chooseProductOrBrand();
		ProductOrBrandPage pb= new ProductOrBrandPage(driver);
		pb.choosenProductOrBrand1("Small");
		pb.addToBag();
		mp.checkOut();
		CheckOutPage chko= new CheckOutPage(driver);
		chko.goTocheckOut();
		DeliveryPage dp=new DeliveryPage(driver);
		dp.delivery();
		PaymentPage pp=new PaymentPage (driver);
		String actualURL4=pp.payment();
		Assert.assertTrue(actualURL4.contains("https://www.next.co.uk/secure/checkout/payment"));
	}
}


