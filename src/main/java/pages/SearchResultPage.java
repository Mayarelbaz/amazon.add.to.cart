package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[3]/div[2]/h2/a")
	public WebElement result;

	
}
