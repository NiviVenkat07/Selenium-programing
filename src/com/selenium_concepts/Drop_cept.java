package com.selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_cept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		
	 WebElement C = driver.findElement(By.name("coffee2"));
		
		Select C1 = new Select (C);
		
		boolean multiple =C1.isMultiple();
		 System.out.println(multiple);
		
		 C1.selectByValue("skim");
		 C1.selectByValue("milk2");
		 C1.selectByValue("whipped");
		 
	WebElement ab =	C1.getFirstSelectedOption();
		System.out.println(ab.getText());
	
	
	List<WebElement> li =C1.getAllSelectedOptions();	
	for (WebElement l2 : li) {
		System.out.println(l2.getText());
	}	
		
	List<WebElement> s1 =C1.getOptions();	
	for (WebElement options : s1) {
		System.out.println(options.getText());
	}	
		
		
		
		
		
		
		
	}
	
	
	
}
