package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;
import pages.UserLoginPage;

public class UserLoginTest extends TestBase {
	HomePage homeobject;
	UserLoginPage loginobject;
	SignInPage signinobject;
	
	
	@DataProvider(name = "AmazonLogInData")
	public Object[][] testData() {

		Object[][] data = new Object[1][2];
		data[0][0] ="validphonenumber";
		data[0][1] = "validpassword";
		return data;
	}
	
	@Test(dataProvider = "AmazonLogInData")
	public void UserLoginSuccessfully(String phonenumber,String passwordtxt ) {
		signinobject= new SignInPage(driver);
		homeobject=new HomePage(driver);
		loginobject=new UserLoginPage(driver);
		homeobject.OpenLoginPage();
		loginobject.Usercanlogin(phonenumber,passwordtxt);
		assertTrue(signinobject.hello.getText().contains("Hello"));
	}

}
