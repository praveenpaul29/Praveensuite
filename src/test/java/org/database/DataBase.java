package org.database;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataBase {
	
	public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}
	
	public static void send(WebElement w,String s) {
		w.sendKeys(s);
	}
	
	public static void clicking(WebElement w) {
		w.click();
	}
	
	
}
