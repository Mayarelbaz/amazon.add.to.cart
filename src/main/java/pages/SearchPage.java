package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	 @FindBy(id="twotabsearchtextbox")
	 WebElement searchbar;
	
	 
	 public void SearchItem(String itemname) {
		 SendValues(searchbar, itemname);
		searchbar.submit();
	}
	 

	 
	 

}
