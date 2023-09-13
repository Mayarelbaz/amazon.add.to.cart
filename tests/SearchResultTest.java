package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ItemPage;
import pages.SearchResultPage;

public class SearchResultTest extends TestBase {
	
	SearchResultPage sresult;
	ItemPage item;
	
	@Test(priority = 1)
	public void TestSearchResult() {
		sresult= new SearchResultPage(driver);
		sresult.result.click();
	}
	
	@Test(priority = 2)
	public void shoppingcarttest() {
		
		item=new ItemPage(driver);
		item.selectitemquantity(driver);
		item.addtocart();
		assertTrue(driver.getTitle().equals("amazon.eg Shopping Cart"));
	}
	
	
	

}
