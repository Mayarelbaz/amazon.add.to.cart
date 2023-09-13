package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest extends TestBase {
	
	SearchPage searchobject;
	
	
	@Test
	private void UserCanSearch()  {
		
		searchobject=new SearchPage(driver);
		searchobject.SearchItem("maybelline superstay lipstick");
		assertTrue(driver.getTitle().equals("Amazon.eg : maybelline superstay lipstick"));

	}

}
