package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tes.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class Loginsample extends Baseclass{
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		LaunchBrowser();
		windowMaximize();
	    
	}

	@When("To launch url of amazon application")
	public void to_launch_url_of_amazon_application() {
		launchURL("https://www.amazon.com/");
	    
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		
		WebElement sign = driver.findElement(By.id("nav-link-accountList"));
		sign.click();
	   
	}

	@When("To click the create new account")
	public void to_click_the_create_new_account() throws InterruptedException {
		Thread.sleep(30000);
		WebElement create = driver.findElement(By.id("createAccountSubmit"));
		create.click();
	  
	}

	@When("To pass the firstname in the name textbox")
	public void to_pass_the_firstname_in_the_name_textbox(DataTable d) {
		WebElement first = driver.findElement(By.id("ap_customer_name"));
		List<String> l = d.asList();
		l.get(2);
	   
	}

	@When("To pass the mobileno or email in the email textbox")
	public void to_pass_the_mobileno_or_email_in_the_email_textbox(DataTable d) {
		WebElement email = driver.findElement(By.id("ap_email"));
		List<List<String>> l = d.asLists();
		l.get(1).get(1);
	   
	}

	@When("To create new password using new password textbox")
	public void to_create_new_password_using_new_password_textbox() {
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("1234@0");
	    
	}

	@Then("To close the Chrome browser")
	public void to_close_the_Chrome_browser() {
		closeEntireBrowser();
		
	}	   
}
