package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageBase{

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	 @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	  public WebElement hello;
	 
	 

}
