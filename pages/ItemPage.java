package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ItemPage extends PageBase{

	public ItemPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="add-to-cart-button")
	WebElement cartbtn;
	
	public void selectitemquantity(WebDriver driver) {
		Select option = new Select(driver.findElement(By.id("quantity")));
		option.selectByValue("2");

		
		
	}
	
	public void addtocart() {
	
		ClickButton(cartbtn);
	}
	




	
}
