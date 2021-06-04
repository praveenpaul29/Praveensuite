package org.shassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftHardAssert {
	@Test
	private void tc1() {
		System.out.println("one");
		System.out.println("two");
		System.out.println("three");
//		Assert.assertFalse(true);
		
		SoftAssert s=new SoftAssert();
		s.assertFalse(true);
		s.assertAll();
		System.out.println("four");
		System.out.println("five");
		System.out.println("six");
	}

}
