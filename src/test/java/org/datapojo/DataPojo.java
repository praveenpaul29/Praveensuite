package org.datapojo;

import org.database.DataBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataPojo extends DataBase {
	
	@FindBy(name="email")
	private WebElement mailing;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement button;

	public WebElement getMailing() {
		return mailing;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}
}
