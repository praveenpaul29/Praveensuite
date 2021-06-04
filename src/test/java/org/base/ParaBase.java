package org.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBase {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void launchopera() {
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
	}
	
	public static void launchedge() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	public static void launchIe() {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	
	
	
	public static void urlLaunch(String s) {
		driver.get(s);
	}
	
	public static void datasend(WebElement w,String s) {
		w.sendKeys(s);
	}
	
	public static void click(WebElement w) {
		w.click();
	}
}
