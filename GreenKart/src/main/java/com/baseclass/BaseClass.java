package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	
	public static WebDriver driver; 


	public static WebDriver browser(String browser) {
		
		if (browser.equalsIgnoreCase("edge")) { 
			
            System.setProperty("webdriver.edge.driver", "C:\\Selenium\\driver\\msedgedriver.exe");
			
			driver = new EdgeDriver();
			
     		driver.manage().window().maximize();
     	}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
	
	   }
	   else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		return driver;
		
	} 
	
	public static void getUrl(String url) {
		
		driver.get(url);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}

