package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	
public static WebDriver driver;
@BeforeSuite
//pass the parameter name
@Parameters()
//pass the parameter value to the setupenviroment
public void SetupEnviroment( @Optional("chrome") String browername) {
	if(browername.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();

	}
	else if (browername.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		
	}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.amazon.eg/");
	
}

@AfterSuite
public void CleanUpEnviroment() {
driver.quit();
}



}
