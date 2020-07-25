package next.co.uk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import next.co.uk.pageobjects.CardAndMessagePage;
import next.co.uk.pageobjects.ChoosenGiftCardPage;
import next.co.uk.pageobjects.DeliveryAddressPage;
import next.co.uk.pageobjects.DeliveryDatePage;
import next.co.uk.pageobjects.GiftCardsPage;
import next.co.uk.pageobjects.ProductsOrBrandsListPage;

public class OrderGiftCardTest extends BaseTest {

	@Test(description="Search for gift card,Choose one option and click on buy to deliver it")
	public void orderGiftCard() {
		ProductsOrBrandsListPage spb=new ProductsOrBrandsListPage(driver);
		spb.searchProductBrand("Gift Card");
		GiftCardsPage gc=new GiftCardsPage(driver);
		gc.chooseGiftCard("Silver");
		ChoosenGiftCardPage cgc= new ChoosenGiftCardPage(driver);
		cgc.choosenGiftCard("15.0000");
		DeliveryAddressPage dadd= new DeliveryAddressPage(driver);
		dadd.deliveryAdd("Tali", "2222");
		DeliveryDatePage ddate= new DeliveryDatePage(driver);
		ddate.deliveryDate();
		CardAndMessagePage cm=new CardAndMessagePage(driver);
		String actualURL3=cm.cardMSG("my dear, this gift card is for you");
		Assert.assertTrue(actualURL3.contains("https://flowers.next.co.uk"));
	}
}
