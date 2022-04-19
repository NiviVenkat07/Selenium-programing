package com.selenium_concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/womens-party-wear");
		
		driver.manage().window().maximize();
		
		// to get all discount prices
		
		List<Integer> Productprice  =new ArrayList <Integer>();     // it prints insertion order
		
	 List <WebElement> product =driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling :: span[@class='product-discountedPrice']"));
		
	for (WebElement Prices :product) {
		String replace= Prices.getText().replace("Rs.", " ");
		
		int price = Integer.parseInt(replace);
		
		Productprice.add(price);
		
}
		Collections.sort(Productprice);
		
	System.out.println(Productprice);
	}
} 

