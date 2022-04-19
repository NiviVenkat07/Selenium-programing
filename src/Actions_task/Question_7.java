package Actions_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_New\\Driver 1\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 act.moveToElement(course).build().perform();
		WebElement st= driver.findElement(By.xpath("//a[text()='Software Testing Training ']"));
		  act.moveToElement(st).build().perform();
	    WebElement S= driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		 act.moveToElement(S).click().build().perform();
		WebElement T = driver.findElement(By.xpath("(//p[contains(text(),'Our')])[2]"));
		System.out.println(T.getText());
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
