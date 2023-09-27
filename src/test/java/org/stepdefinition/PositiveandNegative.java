package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tes.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegative extends Baseclass{
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	  LaunchBrowser();
	  windowMaximize();
	}

	@When("User has to hit the Facebook url")
	public void user_has_to_hit_the_Facebook_url() {
		launchURL("https://www.facebook.com/");
	    
	}

	@When("User has to pass the data{string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String e) {
	   WebElement email = driver.findElement(By.id("email"));
	   email.sendKeys(e);
	}

	@When("User has to pass the data{string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String pas) {
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(pas);
	    
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	    
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	  
	}

}
