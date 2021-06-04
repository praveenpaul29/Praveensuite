package org.vehicle;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Bike1 {
	@Test (priority=-100)
	private void tc1() {
		System.out.println("put key on");
	}

	@Test(priority=-50)
	private void tc2() {
		System.out.println("kick start or auto start");
	}

	@Test(priority=-10)
	private void tc3() {
		System.out.println("put gearing and speed bike");
	}

	@Test(priority=-1)
	private void tc4() {
		System.out.println("bike off");
	}
	@BeforeClass
	private void journyBegin() {
		System.out.println("JOURNEY STARTS");
	}
	


}
