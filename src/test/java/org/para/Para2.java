package org.para;

import org.base.ParaBase;
import org.parapojo.ParaPojo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para2  extends ParaBase{
	
	ParaPojo pp;
	@Parameters({"browser"})
	@Test(priority=0)
	private void tc1(String browserDiff) throws InterruptedException {
		if (browserDiff.equals("chrome")) {
			launchBrowser();	
			
		}
		else if (browserDiff.equals("ff")) {
			launchopera();
		}
	}
	
	@Test(priority=1)
	private void tc2() {
	urlLaunch("https://www.facebook.com/");
	}
	
	@Test(priority=2)
	private void tc3() {
		pp=new ParaPojo();
		datasend(pp.getEmailing(), "praveenpaulraj");
		datasend(pp.getPassword(), "123456789");
	}
	
	@Test(priority=3)
	private void tc4() {
		pp=new ParaPojo();
		click(pp.getLogin());
	}
}
