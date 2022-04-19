package Actions_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("  http://www.amazon.in");    
		driver.manage().window().maximize();
		
Actions act = new Actions(driver);
		WebElement all =driver.findElement(By.id("nav-hamburger-menu"));
		                act.doubleClick(all).build().perform();
		
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	
	act.moveToElement(driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"))).click().build().perform();    
	
	
	  WebElement PB =driver.findElement(By.xpath("//a[text()='Power Banks']"));
	   act.click(PB).build().perform();            
	             
}

}