package com.selenium_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String   single =driver.getWindowHandle();
		System.out.println(single);
		
		Actions act = new Actions(driver);
		
		WebElement Mob =driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(Mob).build().perform();
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement bk =driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		act.contextClick(bk).build().perform();
		
       // Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement BS =driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']"));
		act.contextClick(BS).build().perform();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		//To Get the windows Title
		
		Set<String> S =driver.getWindowHandles();
		for (String stg : S) {
			String ttl = driver.switchTo().window(stg).getTitle();
			System.out.println(ttl);
		}
		
		String S1 = "Amazon.in Bestsellers: The most popular items on Amazon";
		
	for (String string : S) {
			
			if (driver.switchTo().window(string).getTitle().equals(S1)) {
				System.out.println("Done...");
				break;
		} 
		}
		//To get the windows id
		String handle =driver.getWindowHandle();
		for (String str : S) { 
			System.out.println(str);
		}
		String S2 = "CDwindow-9AD693536DBEDA36AB07126ABF7A95D2";
		
		for (String string : S) {
			
		if (driver.switchTo().window(string).getWindowHandle().equals(S2)){
		System.out.println("Done.....");	
		break;	
		}
		
		}
		
		
		
		
		
		
		
		
		
		
	}	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

