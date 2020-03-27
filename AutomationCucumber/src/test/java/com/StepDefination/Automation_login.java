package com.StepDefination;

import com.pages.Automation_loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_login {
	Automation_loginpage b= new Automation_loginpage();
	@Given("^user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		b.url();
	}

	@When("^the user open the  Automation  Home page$")
	public void the_user_open_the_Automation_demo_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		b.loginPage();
	}

@Then("^user login using username and password$")
public void user_login_using_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    b.loginDeatils();
}

@Then("^click on the login button user go to the next page$")
public void click_on_the_login_button_user_go_to_the_next_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    b.submit1();
}
	
}
