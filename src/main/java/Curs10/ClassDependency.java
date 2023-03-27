package Curs10;

import org.testng.annotations.Test;

public class ClassDependency {
	
	@Test ( priority=1 )
	public void method1() {
		System.out.println("Method 1");
	}
		
	@Test ( priority=1, dependsOnMethods ="method1" )
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test ( priority=3 )
	public void method3() {
		System.out.println("Method 3");
	}

}
