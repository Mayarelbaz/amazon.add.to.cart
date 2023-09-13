package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase{
	public UserLoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(id = "ap_email")
	WebElement emailorPhoneNumber;
	
	@FindBy(id = "continue")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement passwordtxt;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;

	public void Usercanlogin(String usertxt, String password) {
		SendValues(emailorPhoneNumber, usertxt);
		ClickButton(continuebtn);
		
		SendValues(passwordtxt, password);
		ClickButton(signinbtn);

		
	}

}
