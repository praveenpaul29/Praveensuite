package org.threading;

import org.testng.annotations.Test;

public class Threading {
	@Test
	private void tc1() {
		System.out.println("this is 1");
		System.out.println("thread 1:"+Thread.currentThread());
		
	}

	@Test
	private void tc2() {
		System.out.println("this is 2");
		System.out.println("thread 2:"+Thread.currentThread());
	}

	@Test
	private void tc4() {
		System.out.println("this is 4");
		System.out.println("thread 4:"+Thread.currentThread());
	}

	@Test
	private void tc3() {
		System.out.println("this is 3");
		System.out.println("thread 3:"+Thread.currentThread());
	}

	@Test
	private void tc6() {
		System.out.println("this is 6");
		System.out.println("thread 6:"+Thread.currentThread());
	}

	@Test
	private void tc5() {
		System.out.println("this is 5");
		System.out.println("thread 5:"+Thread.currentThread());
	}

}
