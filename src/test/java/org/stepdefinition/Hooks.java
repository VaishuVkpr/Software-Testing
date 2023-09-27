package org.stepdefinition;

import org.tes.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass {
	@Before(order = 1)
	private void Precondition2() {
		LaunchBrowser();
		System.out.println("Launch the browser");
		

	}
	
	@Before(order = 2)
	private void Precondition1() {
		windowMaximize();
		System.out.println("Max the Window");

	}
	
	@Before(order = 3 , value = "@Regression")
	private void Precondition3(){
		System.out.println("Precondition3");
		
	}
	@After(order = 10 , value = "@Regression")
	private void postcondition2() {
		System.out.println("Take screenshot of scenario");
		

	}
	
	@After(order = 4)
	private void postcondition1() {
		closeEntireBrowser();
		System.out.println("close entire browser");

	}


}
