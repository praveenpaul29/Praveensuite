package org.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeOperatons() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test
	public void begining() {
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\God\\Desktop\\WhatsApp Image 2021-05-21 at 23.17.34.jpeg");
	}

}
