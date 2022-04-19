package com.selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.Leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		//to get all headings of the webtable
		
		List<WebElement> t =driver.findElements(By.tagName("th"));
		
		for (WebElement webElement : t) {
			
			System.out.println(webElement.getText());
		}
		
		
		// to get all data's for the webtable
		
		List<WebElement> D =driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement web : D) {
			
			System.out.println(web.getText());
		}
		
		
		//to get 2st row
		
	 List<WebElement> c = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	
		for (WebElement web : c) {
			
			System.out.println(web.getText());
			
		}
		
		// to get 1st column
		
		List<WebElement> b	= driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

		for (WebElement web : b) {
			
		System.out.println(web.getText());
			
		}
		 
		//  1. to get particular row and column data
		
		List<WebElement> x =driver.findElements(By.xpath("//table/tbody/tr[4]/td[5]"));
		
	        			for (WebElement webElement : x) {
	        				
				System.out.println(webElement.getText());
				
			}
	    //  2. to get particular row and column data
	        			
	        			
	        List<WebElement> y = driver.findElements(By.xpath("//table/tbody/tr[5]/td[6]"));
	        
	        for (WebElement web : y) {
				
	        	System.out.println(web.getText());
			} 
	        			
	        			
	        			
           }
		
		
		
		
		
	}	
	

