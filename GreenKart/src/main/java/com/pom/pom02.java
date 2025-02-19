package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom02 {

	public static WebDriver driver;
	
	@FindBy(xpath= "//input[@class='promoCode']")
	private WebElement promocode;
	
	@FindBy(xpath= "//button[@class='promoBtn']")
	private WebElement apply;
	
	@FindBy(xpath= "//button[text()='Place Order']")
	private WebElement placeorder;
	
	public pom02(WebDriver driver2) {
	 this.driver=driver2;
	 PageFactory.initElements(driver2, this);
	}

	public WebElement getPromocode() {
		return promocode;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}
}
