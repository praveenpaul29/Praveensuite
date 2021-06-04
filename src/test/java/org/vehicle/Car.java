package org.vehicle;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Car {
	
	@Test(priority=0)
	private void tc5() {
		System.out.println("start the car");
	}
	@Test(priority=4)
	private void tc6() {
		System.out.println("fourth gear");
	}
	@Test(priority=1,enabled=false)
	private void tc7() {
		System.out.println("first gear");
	}
	@Parameters({"username","password"})
	@Test(priority=3)
	private void tc8(String s, String a) {
		System.out.println("third gear");
		
		System.out.println(s);
		System.out.println(a);
	}
	@Test(priority=2)
	private void tc9() {
		System.out.println("second Gear");
	}
	@AfterClass
	private void JournyEnds() {
			System.out.println("journey ends");
	}
	
	
}
