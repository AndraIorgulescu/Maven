package Curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class SeleniumLocators2 extends BaseTest {
	
	@Test()
	public void idLocator() {
		
		driver.findElement(By.id("menu-item-72")).click();
		assertEquals((driver.getCurrentUrl(), "https://keybooks.ro/contacts/");
		
		
	}
	
	@Test
	public void cssLocator() {
		WebElement nameInputFiled = driver.findElement(By.cssSelector("input[name='your-name'"));
		assertTrue(nameInputFiled.isDisplayed());
		nameInputFiled.sendKeys("Jhonny Bravo");
	}
	
	
	

}
