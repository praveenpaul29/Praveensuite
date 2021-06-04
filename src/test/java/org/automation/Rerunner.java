package org.automation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerunner implements IRetryAnalyzer {
	int min=0;
	int max=5;

	public boolean retry(ITestResult arg0) {

		if (min<=max) {
			min++;
			
		return true;
		
		}
		return false;
	}
}
