package org.groupingassert;

import org.testng.annotations.Test;

public class AssertGrouping {
	
	@Test(groups="sanity")
	private void tc1() {
		System.out.println("start course");
	}
	
	@Test(groups="regression")
	private void tc2() {
		System.out.println("java class");
	}
	
	@Test(groups="smoke")
	private void tc3() {
		System.out.println("selenium class");
	}
	
	@Test(groups="sanity")
	private void tc4() {
		System.out.println("framework class");
	}
	
	@Test(groups="regression")
	private void tc5() {
		System.out.println("java class");
	}
	
	@Test(groups="smoke")
	private void tc6() {
		System.out.println("selenium class");
	}
	
	@Test(groups="sanity")
	private void tc7() {
		System.out.println("framework class");
	}
}