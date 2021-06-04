package org.para;
																													import org.base.ParaBase;
import org.parapojo.ParaPojo;
import org.testng.annotations.Test;

public class Para1 extends ParaBase {
	
	@Test(priority=0)
	private void tc1() {
		System.out.println("launching browser");
		launchBrowser();
	}
	
	@Test(priority=1) 
	private void tc3() {
		System.out.println("url launching");
		urlLaunch("https://www.facebook.com/");
	}
	
	@Test(priority=2)
	private void tc2() {
		System.out.println("sending data");
		ParaPojo pp=new ParaPojo();
		datasend(pp.getEmailing(), "praveen paul raj");
		datasend(pp.getPassword(), "1234567910111213311");
		click(pp.getLogin());
	}
}
