package Curs10;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite

public class BeforeAfter {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After suite");
	}
	
	@BeforeClass
	

}
