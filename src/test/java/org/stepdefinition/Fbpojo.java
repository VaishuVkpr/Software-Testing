package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fbpojo {
	public Fbpojo() {
		
		
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	

}
