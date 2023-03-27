package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	
	public void setup() {
		
		 driver = new FirefoxDriver();
		 driver.get("https://keybooks.ro");
		 
		

	}
	
	@AfterClass
	public void TearDown() throws InterruptedException 
	
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
