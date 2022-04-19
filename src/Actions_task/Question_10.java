package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html"); 
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
	WebElement c = driver.findElement(By.xpath("//a[text()='COURSES']"));
	 act.moveToElement(c).build().perform();
	
	WebElement W = driver.findElement(By.xpath("//a[text()='Web Designing Training ']"));
	  act.moveToElement(W).build().perform();
	 
	 WebElement java = driver.findElement(By.xpath("//a[normalize-space()='JavaScript']"));
	  act.moveToElement(java).build().perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}