package com.StepDefination;

import com.pages.Automation_Testcasepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_Testcase {
	Automation_Testcasepage d=new Automation_Testcasepage();
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    d.url();
	}

	@When("^the user open the Automation page$")
	public void the_user_open_the_Automation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	d.TestcasePage();
	}

	@Then("^user click on the Testcase button$")
	public void user_click_on_the_Testcase_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   d.testcaseDeatils();
	}

	@Then("^click on the shop menu user go to the next page$")
	public void click_on_the_shop_menu_user_go_to_the_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   d.submit4();
	}

}
