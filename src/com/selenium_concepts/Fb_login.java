package com.selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement E =driver.findElement(By.id("email"));
		     E.sendKeys("nivivenkat2125@gmail.com");
		WebElement P =driver.findElement(By.id("pass"));
		     P.sendKeys("nivedhaa123");
		WebElement text =driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
		     System.out.println(text.getText());    
		WebElement T = driver.findElement(By.xpath("//a[text()='Create a Page']")) ;   
		     System.out.println(T.getText());   
		WebElement C= driver.findElement(By.xpath("(//a[@role='button'])[2]"));   
		     C.click();
		              Thread.sleep(3000);
		 WebElement F = driver.findElement(By.name("firstname"));   
		     F.sendKeys("nivi");
		 WebElement L = driver.findElement(By.name("lastname")) ; 
		     L.sendKeys("venkat");
		WebElement M = driver.findElement(By.name("reg_email__"));    
		     M.sendKeys("nivivenkat21225@gmail.com");
		WebElement  R =driver.findElement(By.name("reg_email_confirmation__"));     
		     R.sendKeys("nivivenkat21225@gmail.com");
		WebElement W =driver.findElement(By.name("reg_passwd__"));
		     W.sendKeys("venkat123b");
		WebElement D =driver.findElement(By.id("day"))  ;   		     
		     D.sendKeys("30");
		WebElement S =driver.findElement(By.id("month"));     
		     S.sendKeys("november");
		WebElement Y = driver.findElement(By.id("year"));    
		     Y.sendKeys("1954");
		WebElement X =driver.findElement(By.xpath("//label[text()='Female']"));     
		     X.click();
	}
		
	}
	 
	
	


