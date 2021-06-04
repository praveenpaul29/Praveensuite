package org.automation;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class AutomationAnalyser {
	
	@Test
	private void tc1() {
		System.out.println("test case 1");
	}
	
	@Test
	private void tc4() {
		System.out.println("test case 4");
	}
	
	@Test
	private void tc2() {
		System.out.println("test case 2");
	}
	
	@Test
	private void tc3() {
		System.out.println("test case 3");
		assertTrue(false);
	}
	

}
