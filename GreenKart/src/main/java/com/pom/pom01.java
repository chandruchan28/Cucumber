package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom01 {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement Search;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	private WebElement addtocart;
	
	@FindBy(xpath = "//img[@alt='Cart']")
	private WebElement cart;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement checkout;

	public pom01(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
}
