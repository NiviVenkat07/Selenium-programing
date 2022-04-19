package com.selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch{
	 
	 public static void main(String[] args) {
		
		 
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver\\chromedriver.exe") ;
		
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		driver.navigate().to("https://www.facebook.com/");
		 
		 driver.navigate().back();
		 
		driver.navigate().forward(); 
		 
		driver.navigate().refresh(); 
		 
		 
		 
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	
	
	
	
	
	
	
	
	
	

