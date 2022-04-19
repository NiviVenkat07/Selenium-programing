package Manual_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
	
		WebElement email = driver.findElement(By.id("email"));
		  email.sendKeys("@gmail.com");
		
		WebElement pass = driver .findElement(By.id("pass"));
		  pass.sendKeys("1234");
		
		WebElement log = driver.findElement(By.name("login"));
		  log.click();
				
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
