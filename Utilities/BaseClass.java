package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void launchingURL()
	{
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (7)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	driver.get(Constants.URL);	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Reporter.log("Browser Launched");
	//driver.get(constants.URL);
	Reporter.log("Passed the URL");

	}
	
	  @AfterClass
	  public void tearDown() 
	  { 
		  driver.manage().deleteAllCookies();
	  Reporter.log("Deleted all cookies"); driver.quit();
	  Reporter.log("Browser closed"); }
}
