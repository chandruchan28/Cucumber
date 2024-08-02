package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pom.pom01;
import com.pom.pom02;
import com.pom.pom03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	pom01 a = new pom01(driver);
	pom02 b = new pom02(driver);
	pom03 c = new pom03(driver);
	
	@Given("User Launch the url")
	public void user_launch_the_url() {
    
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/cart");
	}

	@When("User Serach the Vegtable")
	public void user_serach_the_vegtable() {
     a.getSearch().sendKeys("cucumber");
	}

	@When("user Click the Serach icon")
	public void user_click_the_serach_icon() {
    a.getSubmit().click();
	}

	@When("user Click the add to cart button")
	public void user_click_the_add_to_cart_button() {
    a.getAddtocart().click();
	}

	@When("user Click the items")
	public void user_click_the_items() {
	a.getCart().click();
	}

	@When("user Click the Proceed to Checkout")
	public void user_click_the_proceed_to_checkout() {
	a.getCheckout().click();
	}

	@Then("next page Show")
	public void next_page_show() throws InterruptedException {
	   Thread.sleep(3000);
		getTitle();
	}


    @When("User enter promo code")
    public void user_enter_promo_code() {

    	b.getPromocode().sendKeys("1863");
    
    }

    @When("User Click the apply button")
    public void user_click_the_apply_button() {
    	
    	b.getApply().click();

    }

    @When("User the click Place Order")
    public void user_the_click_place_order() {
    	
    	b.getPlaceorder().click();

    }
    
    @Then("next page02 Shown")
    public void next_page02_shown() throws InterruptedException {
    Thread.sleep(3000);
    }

    @When("User Select the Country")
    public void user_select_the_country() throws InterruptedException {
     Thread.sleep(3000);
		c.getCountry().sendKeys("India");
	}

    @When("User Click the Agree button")
    public void user_click_the_agree_button() {
    	
    	c.getAgree().click();

    }

    @When("User Click the Proceed")
    public void user_click_the_proceed() {
    	
    	c.getProceed().click();
  

    }
	
}
