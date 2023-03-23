package curs8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
	public WebDriver driver;
	
	@BeforeClass
	
	public void setup() {
		
		 driver = new FirefoxDriver();
		

	}
	
	
	
	@Test
	public void openBrowser() throws InterruptedException {
	
	
		driver.get("https://keybooks.ro/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		
		
	}
	
	@AfterClass
	public void TearDown() 
	
	{
		driver.quit();
	}
	
	@Test
	public void linkTextLocator() {
		
		//
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
		booksLink.click();
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop");
		
	
		
	}
	

}
