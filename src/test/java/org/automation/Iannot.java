package org.automation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Iannot  implements IAnnotationTransformer{

	public void transform(ITestAnnotation an, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer re = an.getRetryAnalyzer();
		if (re==null) {
			an.setRetryAnalyzer(Rerunner.class);	
		}
		
	}

}
