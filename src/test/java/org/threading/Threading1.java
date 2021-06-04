package org.threading;

import org.testng.annotations.Test;

public class Threading1 {
	
	@Test
	private void tc11() {
		System.out.println("this is 11");
		System.out.println("thread 11:"+Thread.currentThread());
		
	}

	@Test
	private void tc22() {
		System.out.println("this is 22");
		System.out.println("thread 22:"+Thread.currentThread());
	}

	@Test
	private void tc44() {
		System.out.println("this is 44");
		System.out.println("thread 44:"+Thread.currentThread());
	}

	@Test
	private void tc33() {
		System.out.println("this is 33");
		System.out.println("thread 33:"+Thread.currentThread());
	}

	@Test
	private void tc66() {
		System.out.println("this is 66");
		System.out.println("thread 66:"+Thread.currentThread().getId());
	}

	@Test
	private void tc55() {
		System.out.println("this is 55");
		System.out.println("thread 55:"+Thread.currentThread().getId());
	}

}
