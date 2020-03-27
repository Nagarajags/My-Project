package com.StepDefination;

import com.pages.Automation_shoppage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_shop {
	Automation_shoppage c=new Automation_shoppage();
	@Given("^user launch the  application$")
	public void user_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		c.url();
	}
	@When("^the user open the  Automation page$")
	public void the_user_open_the_Automation_demo_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
c.shopPage();
	}
	@Then("^user click on the shop button$")
	public void user_click_on_the_shop_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		c.shopDeatils();
	}

	@Then("^click on the add to cart button$")
	public void click_on_the_add_to_cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		c.submit2();
	}

}

