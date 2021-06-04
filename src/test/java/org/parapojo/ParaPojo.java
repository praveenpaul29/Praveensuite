package org.parapojo;

import org.base.ParaBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaPojo extends ParaBase{

	public ParaPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement emailing;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getEmailing() {
		return emailing;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}	
}
