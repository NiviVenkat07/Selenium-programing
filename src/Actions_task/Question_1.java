package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get(" http://demo.guru99.com/test/drag_drop.html ");    
		driver.manage().window().maximize();
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		Actions act = new Actions(driver);
		
		WebElement B = driver.findElement(By.id("credit2"));driver.findElement(By.id("bank"));
		WebElement d = driver.findElement(By.id("bank"));
		act.dragAndDrop(B, d).build().perform();
		
		WebElement  f = driver.findElement(By.id("fourth"));
		WebElement	F  =  driver.findElement(By.id("amt7"));	
		act.dragAndDrop(f, F).build().perform();
		
		WebElement c =driver.findElement(By.id("credit1")); 
		WebElement C =driver.findElement(By.id("loan")); 
		act.dragAndDrop(c, C).build().perform();
		
		WebElement a = driver.findElement(By.id("fourth")); 
		WebElement A  =  driver.findElement(By.id("amt8")); 
	     act.dragAndDrop(a, A).build().perform();
}
}