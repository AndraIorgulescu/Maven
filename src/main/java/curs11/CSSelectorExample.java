package curs11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class CSSelectorExample extends BaseTest {
	
	@Test
	public void cssSelectorTest() {
	
	WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", loginMenu);
	
	WebElement logo = driver.findElement(By.cssSelector("#div.logo_slogan"));
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",logo );
	
	WebElement inspireText = driver.findElement(By.cssSelector("#div.column-1_2 h3.sc_title"));
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",inspireText );
	
	}
	
	@Test
	public void cssSelector2() {
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='h3.sc_title_reg']"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",bookTitle );
		
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='h3.sc_title_reg']"));
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')",bookTitle );
		
		
	}
	
}
