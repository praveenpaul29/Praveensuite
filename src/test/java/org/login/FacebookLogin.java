package org.login;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	@Test(dataProvider="praveen")
	private void name(String user,String pass) {
		System.out.println("user anem and password is");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);
	}
	
	@DataProvider(name="praveen")
	private Object[][] data() {
		return new Object[][] {
		
			{"praveen","praveen@123"},
			{"ram","ram@123"},
			{"arun","arun@123"}
		};
		}
	}


